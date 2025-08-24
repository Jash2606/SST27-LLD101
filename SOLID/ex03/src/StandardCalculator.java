public class StandardCalculator implements ICalculator {
    @Override
    public double cost(Shipment s) {
        return 50 + 5*s.weightKg;
    }
}
