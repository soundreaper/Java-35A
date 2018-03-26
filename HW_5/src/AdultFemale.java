public class AdultFemale extends Patient {
    private AdultFemale(String name, int birthYear, int birthMonth) {
        super();
        setName(name);
        this.birthYear =  birthYear;
        this.birthMonth = birthMonth;
    }


    public AdultFemale(String name, int birthYear, int birthMonth, double height, double weight) {
        this(name, birthYear, birthMonth);
        setHeight(height);
        setWeight(weight);
    }

    @Override
    public double calcIdealWeight() {
        if (height >= 152) {
            return 45.0 + (0.9 * (height - 152));
        } else {
            return 45.0 - (0.3 * (152 - height));
        }
    }

    @Override
    public double calcBMR() {
        return 655.0 + (9.6 * weight) + (1.8 * height) - (4.7 * currentAge());
    }

    @Override
    public String toString() {
        return "AdultFemale " + super.toString();
    }
}
