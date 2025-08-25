public class EngineService {
    IEngine vehicle;

    public EngineService(IEngine vehicle) {
        this.vehicle = vehicle;
    }

    public void startEngine() {
        vehicle.startEngine();
    }

}
