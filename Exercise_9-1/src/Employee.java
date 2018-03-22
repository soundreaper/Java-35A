public abstract class Employee {

    protected String name;

    protected String ssn;

    public Employee (String n, String s) {
        name = n; ssn = s;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public abstract double computePay();

}