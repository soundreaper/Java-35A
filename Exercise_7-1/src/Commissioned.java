public class Commissioned extends Employee {
    private double commissionRate;

    public Commissioned(String name, String ssn, double cR) {
        super(name, ssn);
        commissionRate = cR;
    }

    public void setCommissionRate(double cRate) {
        commissionRate = cRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public String toString() {
        return "Salaried " + super.toString() + ", Commission Rate = " + commissionRate;
    }
}
