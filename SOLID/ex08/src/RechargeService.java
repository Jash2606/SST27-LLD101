public class RechargeService {
    IRecharge vehicle;

    public RechargeService(IRecharge vehicle) {
        this.vehicle = vehicle;
    }

    public void recharge(int kWh) {
        vehicle.recharge(kWh);
    }
}
