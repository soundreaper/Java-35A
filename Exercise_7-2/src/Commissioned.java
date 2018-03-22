public class Commissioned extends Employee {
    private double amountSold;
    private double commissionRate;

    public Commissioned(String n, String s, double amountSold, double commissionRate) {
        super(n, s);
        this.amountSold = amountSold;
        this.commissionRate = commissionRate;
    }

    public double computePay() {
        return commissionRate*amountSold;
    }

    public String toString() {
        return "Commissioned: name = " + name + ", SSN = " + ssn + ", Commission Rate = " + commissionRate;
    }
}
