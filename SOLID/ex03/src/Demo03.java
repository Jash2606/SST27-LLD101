public class Demo03 {
    public static void main(String[] args) {
        Shipment shipment = new Shipment(CategoryState.EXPRESS, 2.0);
        ShippingCostCalculator shippingCostCalculator = new ShippingCostCalculator();
        System.out.println(shippingCostCalculator.cost(shipment));
    }
}
