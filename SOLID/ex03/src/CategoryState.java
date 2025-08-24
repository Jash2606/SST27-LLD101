public enum CategoryState {
    STANDARD(new StandardCalculator()),
    EXPRESS(new ExpressCalculator()),
    OVERNIGHT(new OvernightCalculator());

    private ICalculator calculator;

    CategoryState(ICalculator calculator) {
        this.calculator = calculator;
    }

    public ICalculator getCalculator() {
        return calculator;
    }
}
