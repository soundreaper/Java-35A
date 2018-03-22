import java.util.StringTokenizer;

public class Customer {
    private StringBuilder lastName = new StringBuilder();
    private StringBuilder firstName = new StringBuilder();

    private long accountNum;
    private SavingsAccount savingAcc;

    public Customer(String name, long accountNum, double balance) {
        setName(name);
        this.accountNum = accountNum;
        this.savingAcc = new SavingsAccount(balance);
    }

    public String getName() {
        String name = lastName.toString() + ", " + firstName.toString();
        return name;
    }

    public long getAccountNum() {
        return accountNum;
    }

    public SavingsAccount getSavingAcc() {
        return savingAcc;
    }

    public void setName(String name) {
        StringTokenizer strTkn = new StringTokenizer(name, ", ");
        firstName.delete(0, lastName.length());
        lastName.delete(0, lastName.length());
        firstName.append(strTkn.nextToken());
        lastName.append(strTkn.nextToken());
    }

    public static void main( String[] args ) {
        Customer cust = new Customer("John Smith", 12345, 1000);
        String str = "a+b/(c-d)";
        String [] strArray = str.split("[+-/()]");
        System.out.println(strArray[2]);
    }
}