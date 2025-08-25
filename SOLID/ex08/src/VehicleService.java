public class VehicleService extends Vehicle {
    Vehicle vehicle;
    public VehicleService(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    void running() {
        vehicle.running();
    }

}
