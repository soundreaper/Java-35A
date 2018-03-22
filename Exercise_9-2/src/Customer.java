public class Customer {
    private String name;
    private long acct;
    private double bal;

    public Customer(String name, long acct, double bal) {
        this.name = name;
        this.acct = acct;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAcct() {
        return acct;
    }

    public void setAcct(long acct) {
        this.acct = acct;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }
}
