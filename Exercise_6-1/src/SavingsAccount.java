public class SavingsAccount {
    private static double annualIntRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static double getAnnualIntRate() {
        return annualIntRate;
    }

    public static void setAnnualIntRate(double annualIntRate) {
        SavingsAccount.annualIntRate = annualIntRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calcMonthlyInternet() {
        double interest  = savingsBalance * annualIntRate/12.;
        savingsBalance += interest;
        return interest;
    }

    public void modifyIntRate(double newRate) {
        if (newRate > 0) {
            annualIntRate = newRate;
        }
    }
}