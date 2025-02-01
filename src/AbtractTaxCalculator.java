public abstract class AbtractTaxCalculator implements TaxCalculator{

    protected double getTaxableIncome(double income, double expenses){
        return income - expenses;
    }
}
