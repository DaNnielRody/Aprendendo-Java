package learningMore3;

public class Currency {

    private final double value;
    private final double quantity;
    private final int tax;

    public Currency(double value, double quantity){
        this.value = value;
        this.quantity = quantity;
        this.tax = 6;
    }

    public double currencyConverter(){
        double total = value * quantity;
        double taxAmount = total * tax / 100;
        return total + taxAmount;
    }
}
