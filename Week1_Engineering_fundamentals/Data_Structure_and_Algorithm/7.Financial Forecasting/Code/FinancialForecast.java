public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValueRecursive(int years, double rate, double presentValue) {
        if (years == 0) {
            return presentValue; // Base case
        }
        return (1 + rate) * futureValueRecursive(years - 1, rate, presentValue);
    }

    // Iterative method to calculate future value (optimized)
    public static double futureValueIterative(int years, double rate, double presentValue) {
        double result = presentValue;
        for (int i = 1; i <= years; i++) {
            result *= (1 + rate);
        }
        return result;
    }

    public static void main(String[] args) {
        double presentValue = 1000.0; // Initial investment in ₹
        double rate = 0.10;           // Annual growth rate (10%)
        int years = 5;                // Forecast for 5 years

        // Using recursive method
        double recursiveResult = futureValueRecursive(years, rate, presentValue);
        System.out.printf("Future Value (Recursive) after %d years = %.2f\n", years, recursiveResult);
        /*
         * Time complexity is O(N)
         * need to write less line of code
         */

        // Using iterative method to reduce computation on large scale
        double iterativeResult = futureValueIterative(years, rate, presentValue);
        System.out.printf("Future Value (Iterative) after %d years = %.2f\n", years, iterativeResult);
        /*
         * Time complexity is O(N)
         * needs to write much code 
         */
    }
}
