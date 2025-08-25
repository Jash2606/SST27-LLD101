public class Penguin extends Bird implements IReleasable {
    @Override
    void walk() {
        System.out.println("Penguin is walking");
    }

    @Override
    public void release() {
        walk();
        System.out.println("Penguin is released");
    }
}