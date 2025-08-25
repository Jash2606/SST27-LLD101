public class Bicycle extends Vehicle implements IPedal {
    // public void startEngine(){ throw new UnsupportedOperationException(); }
    // public void pedal(int effort){ System.out.println("Pedal effort " + effort); }
    // public void recharge(int kWh){ throw new UnsupportedOperationException(); }

    @Override
    void running() {
        System.out.println("Bicycle is running");
    }

    @Override
    public void pedal(int effort) {
        System.out.println("Pedal effort " + effort);
    }
}