import java.util.*;

public abstract class Patient {
    protected String name = "";
    protected int birthYear = 0;
    protected int birthMonth = 0;
    protected double height = 0.0;
    protected double weight = 0.0;

    private Patient(String name, int birthYear, int birthMonth) {
        setName(name);
        this.birthYear =  birthYear;
        this.birthMonth = birthMonth;
    }


    public Patient(String name, int birthYear, int birthMonth, double height, double weight) {
        this(name, birthYear, birthMonth);
        setHeight(height);
        setWeight(weight);
    }

    public Patient() {

    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        if (name != "" && name.length() > 0) {
            this.name = name;
        }
    }

    public void setHeight(double height) {
        if (height > 0.0) {
            this.height = height;
        }
    }

    public void setWeight(double weight) {
        if (weight > 0.0) {
            this.weight = weight;
        }
    }

    public int currentAge() {
        GregorianCalendar cal = new GregorianCalendar();
        int currentYear = cal.get(Calendar.YEAR);
        int currentMonth = cal.get(Calendar.MONTH) + 1;

        int age = currentYear - birthYear;
        if (currentMonth < birthMonth) {
            age-=1;
        }
        return age;
    }

    public abstract double calcIdealWeight();

    public abstract double calcBMR();

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder("Patient: ");
        description.append("Name = ");
        description.append(name);
        description.append(", \n");
        description.append("\tBirth month/year = ");
        description.append(birthMonth);
        description.append("/");
        description.append(birthYear);
        description.append(", ");
        description.append("Height = ");
        description.append(height);
        description.append(" cm.");
        description.append(", ");
        description.append("Weight = ");
        description.append(weight);
        description.append(" kg.");
        return description.toString();
    }
}
