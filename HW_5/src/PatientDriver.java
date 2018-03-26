public class PatientDriver {
    public static Patient[] returnArr() {
        /*
        Patient[] array = {
                new AdultMale("DIESEL, VIN", 1967, 7, 182.88, 100.),
                new AdultFemale("HUNT, LINDA", 1945, 4, 144.78, 55.8),
                new AdultFemale("Hayek, Salma", 1966, 9, 157., 54),
                new AdultMale("Low, Man", 1934, 2, 147.32, 44.68),
                new AdultFemale("Lady Gaga", 1986, 3, 154.94, 49.9 )
        };
        */

        Patient [] array = {
                new AdultFemale("Lopez, Jennifer", 1969, 7, 167.64, 65.77),
                new AdultFemale("Chenoweth, Kristin", 1968, 7, 149.84, 39.9),
                new AdultMale("Reynolds, Ryan", 1976, 10, 187.96, 85.28),
                new AdultMale("DICAPRIO, LEONARDO", 1974, 11, 181.6, 75),
                new AdultFemale("Flockhart, Calista", 1964, 11, 167.64, 44),
                new AdultMale("Damon, Matt", 1970, 10, 177.8, 70.0)
        };

        /*
        Patient [] array = {
                new AdultMale("STILLER, BEN", 1965, 11, 168.9, 70.3),
                new AdultMale("Depp, Johnny", 1963, 6, 177.8, 71),
                new AdultMale("Stallone, Sylvester", 1946, 7, 175.26, 103.4),
                new AdultMale("Short, Guy", 1973, 8, 144.78, 45.34)
        };
        */

        return array;
    }

    public static Patient[] sortArr(Patient[] unsortedArr) {
        Patient temp;

        for (int i = 0; i < unsortedArr.length-1; i++) {
            for (int j = i+1; j < unsortedArr.length; j++) {
                if (unsortedArr[i].getName().compareToIgnoreCase(unsortedArr[j].getName()) > 0) {
                    temp = unsortedArr[i];
                    unsortedArr[i] = unsortedArr[j];
                    unsortedArr[j] = temp;
                }
            }
        }

        return unsortedArr;
    }

    public static void printArr(Patient[] sortedArr) {
        for (Patient pat : sortedArr) {
            System.out.printf("%s\n\tAge = %d, Ideal Weight = %.1f kg., BMR = %.1f calories\n\n",
                    pat.toString(), pat.currentAge(), pat.calcIdealWeight(), pat.calcBMR());
        }
    }

    public static int underweightCheck(Patient[] printedArr) {
        int underweightCount = 0;

        if (AdultFemale instanceof ) {

        }

        for (Patient pat : printedArr) {
            if (pat.weight < pat.calcIdealWeight()) {
                underweightCount++;
            }
        }
    }

    public static void main(String[] args) {
        Patient[] patientArr;
        patientArr = returnArr();
        patientArr = sortArr(patientArr);
        printArr(patientArr);
    }
}
