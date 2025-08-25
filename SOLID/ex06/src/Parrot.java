public class Parrot extends Bird implements Flyable, IReleasable {
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void release() {
        fly();
        System.out.println("Parrot is released");
    }

    @Override
    void walk() {
        System.out.println("Parrot is walking");
    }
}
