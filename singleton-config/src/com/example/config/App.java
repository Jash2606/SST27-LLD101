package com.example.config;

import java.io.*;
import java.lang.reflect.Constructor;
import java.nio.file.Path;

public class App {
    public static void main(String[] args) throws Exception {
        String path = args.length > 0 ? args[0] : "app.properties";
//        AppSettings.getInstance().loadFromFile(Path.of(path)); // not thread-safe, re-loadable
        AppSettings s = AppSettings.INSTANCE;
//        System.out.println("app.name=" + AppSettings.getInstance().get("app.name"));
        System.out.println("app.name=" + AppSettings.INSTANCE.get("app.name"));
//        System.out.println("instance=" + System.identityHashCode(AppSettings.getInstance()));
        System.out.println("instance=" + System.identityHashCode(AppSettings.INSTANCE));


        // Test 1: Normal Singleton behavior
        AppSettings instance1 = AppSettings.INSTANCE;
        AppSettings instance2 = AppSettings.INSTANCE;
        System.out.println("app.name=" + instance1.get("app.name"));
        System.out.println("Instance1 hash=" + System.identityHashCode(instance1));
        System.out.println("Instance2 hash=" + System.identityHashCode(instance2));
        System.out.println("Same instance? " + (instance1 == instance2));

        // Test 2: Try breaking Singleton using Reflection
        AppSettings reflectionInstance = null;
        try {
            Constructor<AppSettings> constructor = AppSettings.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            reflectionInstance = constructor.newInstance();
        } catch (Exception e) {
            System.out.println("Reflection failed: " + e);
        }
        if (reflectionInstance != null) {
            System.out.println("Reflection instance hash=" + System.identityHashCode(reflectionInstance));
            System.out.println("Reflection broke Singleton? " + (reflectionInstance != instance1));
        }

        // Test 3: Try breaking Singleton using Serialization
        AppSettings deserializedInstance = null;
        try {
            // Serialize
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            oos.writeObject(instance1);
            oos.close();

            // Deserialize
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
            deserializedInstance = (AppSettings) ois.readObject();
            ois.close();

            System.out.println("Deserialized instance hash=" + System.identityHashCode(deserializedInstance));
            System.out.println("Serialization broke Singleton? " + (deserializedInstance != instance1));
        } catch (Exception e) {
            System.out.println("Serialization failed: " + e);
        }

    }
}
