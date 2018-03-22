public class Employee implements Comparable {
    protected String name;
    protected String ssn;

    public Employee(String n, String s) {
        name = n;
        ssn = s;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public String toString() {
        return "Employee: name = " + name + ", SSN = " + ssn;
    }

    public int compareTo(Object o) {
        Employee e = (Employee) o;
        if (name.compareTo(e.name) == 0) {
            return ssn.compareTo(e.ssn);
        } else {
            return name.compareTo(e.name);
        }
    }
}