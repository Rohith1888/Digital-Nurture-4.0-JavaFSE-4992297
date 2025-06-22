public class Test {
    public static void main(String[] args) {
        double initalValue = 20000;
        double rate = 0.05;
        int years = 10;

       System.out.printf("Future value after %d years: %.2f\n", years, FinancialForecasting.forecast(years, initalValue, rate));
    }
}
