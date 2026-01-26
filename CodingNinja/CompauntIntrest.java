public class CompauntIntrest {
    /*
     * Create a Compound Interest program that calculates the total amount
     * accumulated after a certain period based on the following attributes:
     * a. principalAmount: The principal value deposited
     * b. annualInterestRate: Interest rate per year(expressed as a decimal).
     * c. numberOfYears: Period for which interest has to be given.
     * Requirements:
     * 1. Calculate the total amount accumulated using the compound interest
     * formula.
     * 2. Do not use toFixed or round off the answer.
     * 3. Use a while loop to calculate the total amount over the specified number
     * of years.
     * 4. Store the final amount in the answer variable.
     */

    public static void main(String[] args) {
        float ans = floatcompoundInterest(1000, 0.08f, 4);
        System.out.println(ans);

    }

    public static float floatcompoundInterest(int P, float r, int Y) {
        float ans = P;
        int year = 1;
        while (year <= Y) {
            ans += (ans * r);
            year++;

        }
        return ans;
    }

}