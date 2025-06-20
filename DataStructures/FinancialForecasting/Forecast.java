public class Forecast {

    static double predictValue(double currentValue, double growthRate, int years) {
        if (years == 0) return currentValue;
        return predictValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    static double calculateGrowthRate(double initialValue, double futureValue, int years) {
        if (initialValue <= 0 || futureValue <= 0 || years <= 0) {
            throw new IllegalArgumentException("All values must be positive.");
        }
        return Math.pow(futureValue / initialValue, 1.0 / years) - 1;
    }
}
