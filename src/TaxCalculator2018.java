public class TaxCalculator2018 extends AbtractTaxCalculator{
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        getTaxableIncome(5000, 1000);
        return taxableIncome * 0.4;
    }
}



//public class TaxCalculator2018 implements TaxCalculator{
//    private double taxableIncome;
//
//    public TaxCalculator2018(double taxableIncome) {
//        this.taxableIncome = taxableIncome;
//    }
//
//    @Override
//    public double calculateTax() {
////        TaxCalculator.getTaxableIncome(5000, 1000);
//        return taxableIncome * 0.4;
//    }
//}
