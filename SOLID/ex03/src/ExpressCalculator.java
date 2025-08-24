public class ExpressCalculator implements ICalculator {
    @Override
    public double cost(Shipment s) {
        return 80 + 8*s.weightKg;
    }
}
