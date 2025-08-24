public class ShippingCostCalculator {
    public double cost(Shipment s) {
        return s.category.getCalculator().cost(s);
    }
}
