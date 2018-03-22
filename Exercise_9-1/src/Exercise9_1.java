import java.io.*;
import java.nio.charset.StandardCharsets;

public class Exercise9_1 {
    public static void main(String args[]) {
        Employee [] empArray= new Employee[] {
                new Commissioned("Donald Duck", "123-45-6789", 5000.0, 0.22),
                new Salaried("Mickey Mouse", "987-65-4321", 100000.),
                new Salaried("Bugs Bunny", "121-21-2121", 90000.),
                new Commissioned("Elmer Fudd", "343-43-4343", 3000., 0.25)
        };

        FileOutputStream outFile = null;
        try {
            outFile = new FileOutputStream("info.txt");
        } catch (FileNotFoundException e){
            System.err.println(e);
            return;
        }

        OutputStreamWriter outStream = new OutputStreamWriter(outFile, StandardCharsets.UTF_8);
        PrintWriter prtWriter = new PrintWriter(outStream, true);

        for (int i = 0; i < empArray.length; i++) {
            prtWriter.println(empArray[i].toString());
            prtWriter.println("Compute Pay = $" + empArray[i].computePay() + "\n");
        }
    }
}
