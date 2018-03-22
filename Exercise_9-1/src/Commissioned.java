public class Commissioned extends Employee {
    private double amountSold;
    private double commissionRate;

    public Commissioned(String name, String ssn, double sold, double hr) {
        super(name, ssn);
        setAmountSold(sold);
        setCommRate(hr);
    }

    public boolean setAmountSold(double sold) {
        if (sold >= 0) {
            amountSold = sold;
            return true;
        }
        return false;
    }

    public boolean setCommRate(double hr) {
        if (hr >= 0) {
            commissionRate = hr;
            return true;
        }
        return false;
    }

    public double getAmountSold() {
        return amountSold;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double computePay() {
        double pay;

        if (amountSold <= 40) {
            pay = amountSold * commissionRate;
        }
        else {
            pay = 40 * commissionRate + (amountSold - 40) * commissionRate * 1.5;
        }
        return Math.round(pay*100.)/100.;
    }

    public String toString() {
        return "Commissioned: name = " + name + ", SSN = " + ssn + ", Hours worked = " +
                amountSold + ", Commission Rate = " + commissionRate;
    }
}
