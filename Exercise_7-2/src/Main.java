public class Main {
    public static void main(String args[]) {
        Employee [] empArray= new Employee[] {
            new Commissioned("Donald Duck", "123-45-6789", 5000.0, 0.22),
            new Salaried("Mickey Mouse", "987-65-4321", 100000.),
            new Salaried("Bugs Bunny", "121-21-2121", 90000.),
            new Commissioned("Elmer Fudd", "343-43-4343", 3000., 0.25)
        };

        for (int i = 0; i < empArray.length; i++) {
            System.out.println(empArray[i].toString());
            System.out.println("Compute Pay = $" + empArray[i].computePay() + "\n");
        }
    }
}
