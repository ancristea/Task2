public class SavingsAccount {
    public static double annualInterestRate;
    private double savingsBalance;

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }

    public static void modifyInterestRate(double a) {
        annualInterestRate = a;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}

