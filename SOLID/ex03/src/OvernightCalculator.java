public class OvernightCalculator implements ICalculator {
    @Override
    public double cost(Shipment s) { 
        return 120 + 10*s.weightKg;
    }
}
