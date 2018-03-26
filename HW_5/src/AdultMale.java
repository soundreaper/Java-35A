public class AdultMale extends Patient {
    private AdultMale(String name, int birthYear, int birthMonth) {
        super();
        setName(name);
        this.birthYear =  birthYear;
        this.birthMonth = birthMonth;
    }


    public AdultMale(String name, int birthYear, int birthMonth, double height, double weight) {
        this(name, birthYear, birthMonth);
        setHeight(height);
        setWeight(weight);
    }

    @Override
    public double calcIdealWeight() {
        if (height >= 152) {
            return 48.0 + (1.1 * (height - 152));
        } else {
            return 48.0 - (0.327 * (152 - height));
        }
    }

    @Override
    public double calcBMR() {
        return 66.0 + (13.7 * weight) + (5 * height) - (6.8 * currentAge());
    }

    @Override
    public String toString() {
        return "AdultMale " + super.toString();
    }
}
