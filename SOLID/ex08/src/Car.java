public class Car extends Vehicle implements IEngine {

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    
    @Override
    void running() {
        System.out.println("Car is running");
    }

}
