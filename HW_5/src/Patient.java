import java.util.*;

public abstract class Patient {
    protected String name = "";
    protected int birthYear = 0;
    protected int birthMonth = 0;
    protected double height = 0.0;
    protected double weight = 0.0;

    public Patient(String name, int birthYear, int birthMonth) {
        setName(name);
        this.birthYear =  birthYear;
        this.birthMonth = birthMonth;
    }


    public Patient(String name, int birthYear, int birthMonth, double height, double weight) {
        this(name, birthYear, birthMonth);
        setHeight(height);
        setWeight(weight);
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

    public void currentAge() {
        GregorianCalendar cal = new GregorianCalendar();
        cal.get(Calendar.YEAR);
        cal.get(Calendar.MONTH + 1);
    }
}
