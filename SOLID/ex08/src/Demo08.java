public class Demo08 {
    public static void main(String[] args) {
        Vehicle v = new Bicycle();
        Vehicle car = new Car();
        // v.startEngine(); // crash
        VehicleService vehicleService = new VehicleService(car);
        vehicleService.startEngine();
        vehicleService.running();
    }
}
