public class Parrot extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    void walk() {
        System.out.println("Parrot is walking");
    }
}
