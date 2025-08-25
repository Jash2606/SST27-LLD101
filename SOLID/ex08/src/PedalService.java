public class PedalService implements IPedal {
    IPedal vehicle;

    public PedalService(IPedal vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void pedal(int effort) {
        vehicle.pedal(effort);
    }
}
