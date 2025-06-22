public class FinancialForecasting{
    public static double forecast(int years, double currentValue, double growthRate) {
        if (years == 0) {
            return currentValue;
        }
        return forecast(years - 1, currentValue, growthRate) * (1 + growthRate);
    }
}