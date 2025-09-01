package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * FAULTY "Singleton": public constructor, getInstance() returns a NEW instance each time,
 * not thread-safe, reload allowed anytime, mutable global state, reflection+serialization-friendly.
 */

// Implementing enum approach it will handle serialization and reflection without any additional things needed ,
// But it is eager loading --> :)
public enum AppSettings{
    INSTANCE;
    private final Properties props = new Properties();

    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }
}

//    1 . Using static inner class --> reflection is causing issue but serialization works fine ..
//public class AppSettings implements Serializable {
//
//    private final Properties props = new Properties();
//    private volatile static AppSettings INSTANCE;

//      private AppSettings(){
//          if(INSTANCE != null ){
//              throw new RuntimeException("Use getInstance() to create");
//          }
//      };

//    private static  class holder {
//        private static AppSettings INSTANCE = new AppSettings();
//    }
//
//    public static AppSettings getInstance(){
//        return  holder.INSTANCE;
//    }

//    public void loadFromFile(Path file) {
//        try (InputStream in = Files.newInputStream(file)) {
//            props.load(in);
//        } catch (IOException e) {
//            throw new UncheckedIOException(e);
//        }
//    }
//
//    public String get(String key) {
//        return props.getProperty(key);
//     }
//}


//Implementing DCL with prevention of serialization and reflection...
//public class AppSettings implements Serializable{
//    private static volatile AppSettings INSTANCE;
//    private final Properties props = new Properties();
//
//    private AppSettings() {
//        if(INSTANCE != null ){
//            throw  new IllegalStateException("AppSettings has already been initialized");
//        }
//    }
//
//    public static AppSettings getINSTANCE() {
//        if (INSTANCE == null) {
//            synchronized (AppSettings.class) {
//                if (INSTANCE == null) {
//                    INSTANCE = new AppSettings();
//                }
//            }
//        }
//        return INSTANCE;
//    }
//
//    public void loadFromFile(Path file) {
//        try (InputStream in = Files.newInputStream(file)) {
//            props.load(in);
//        } catch (IOException e) {
//            throw new UncheckedIOException(e);
//        }
//    }
//
//    public String get(String key) {
//        return props.getProperty(key);
//    }
//}