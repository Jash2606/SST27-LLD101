public class DefaultCache implements CacheMethod {
    private Frame lastFrame;

    @Override
    public void cache(Frame frame) {
        lastFrame = frame;  
        System.out.println("Cached last frame? " + (lastFrame != null));
    }
}
