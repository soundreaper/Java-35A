// Patient Underweight Check
// Subal Pant
// 03/06/2018
// System: Windows 10 Pro, Compiler: IntelliJ IDEA
/*
    This program is an application that creates an array of a written object type based on hard-coded input. The
    information is read and organized by alphabetical order and then displayed on the screen with some additional
    calculations. The array is then checked to see if any of one type of the object (subclass) falls under a given
    category and if so, the number that do is displayed underneath the information.
 */

public class PatientDriver {
    private static Patient[] returnArr() {

        Patient[] array = {
                new AdultMale("DIESEL, VIN", 1967, 7, 182.88, 100.),
                new AdultFemale("HUNT, LINDA", 1945, 4, 144.78, 55.8),
                new AdultFemale("Hayek, Salma", 1966, 9, 157., 54),
                new AdultMale("Low, Man", 1934, 2, 147.32, 44.68),
                new AdultFemale("Lady Gaga", 1986, 3, 154.94, 49.9 )
        };


        /*
        Patient [] array = {
                new AdultFemale("Lopez, Jennifer", 1969, 7, 167.64, 65.77),
                new AdultFemale("Chenoweth, Kristin", 1968, 7, 149.84, 39.9),
                new AdultMale("Reynolds, Ryan", 1976, 10, 187.96, 85.28),
                new AdultMale("DICAPRIO, LEONARDO", 1974, 11, 181.6, 75),
                new AdultFemale("Flockhart, Calista", 1964, 11, 167.64, 44),
                new AdultMale("Damon, Matt", 1970, 10, 177.8, 70.0)
        };
        */

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

    private static Patient[] sortArr(Patient[] unsortedArr) {
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

    private static void printArr(Patient[] sortedArr) {
        for (Patient pat : sortedArr) {
            System.out.printf("%s\n\tAge = %d, Ideal Weight = %.1f kg., BMR = %.1f calories\n\n",
                    pat.toString(), pat.currentAge(), pat.calcIdealWeight(), pat.calcBMR());
        }
    }

    private static int underweightCheck(Patient[] printedArr) {
        int adultFemaleCount = 0;
        int underweightCount = 0;

        for (Patient aPrintedArr : printedArr) {
            if (aPrintedArr instanceof AdultFemale) {
                adultFemaleCount++;
            }
        }

        for (Patient aPrintedArr : printedArr) {
            if (aPrintedArr.weight < aPrintedArr.calcIdealWeight() && aPrintedArr instanceof AdultFemale) {
                underweightCount++;
            }
        }

        if (adultFemaleCount == 0) {
            return -1;
        } else {
            return underweightCount;
        }
    }

    public static void main(String[] args) {
        Patient[] patientArr;
        patientArr = returnArr();
        patientArr = sortArr(patientArr);
        printArr(patientArr);

        int underweightCount;
        underweightCount = underweightCheck(patientArr);

        if (underweightCount >= 0) {
            System.out.println("The number of underweight female patients: " + underweightCount);
        } else {
            System.out.println("There are no adult female patients on the list");
        }
    }
}

// Output:

/*
Array for Turning In:

AdultMale Patient: Name = DIESEL, VIN,
	Birth month/year = 7/1967, Height = 182.88 cm., Weight = 100.0 kg.
	Age = 50, Ideal Weight = 82.0 kg., BMR = 2010.4 calories

AdultFemale Patient: Name = Hayek, Salma,
	Birth month/year = 9/1966, Height = 157.0 cm., Weight = 54.0 kg.
	Age = 51, Ideal Weight = 49.5 kg., BMR = 1216.3 calories

AdultFemale Patient: Name = HUNT, LINDA,
	Birth month/year = 4/1945, Height = 144.78 cm., Weight = 55.8 kg.
	Age = 72, Ideal Weight = 42.8 kg., BMR = 1112.9 calories

AdultFemale Patient: Name = Lady Gaga,
	Birth month/year = 3/1986, Height = 154.94 cm., Weight = 49.9 kg.
	Age = 32, Ideal Weight = 47.6 kg., BMR = 1262.5 calories

AdultMale Patient: Name = Low, Man,
	Birth month/year = 2/1934, Height = 147.32 cm., Weight = 44.68 kg.
	Age = 84, Ideal Weight = 46.5 kg., BMR = 843.5 calories

The number of underweight female patients: 0



Test Array #1:

AdultFemale Patient: Name = Chenoweth, Kristin,
	Birth month/year = 7/1968, Height = 149.84 cm., Weight = 39.9 kg.
	Age = 49, Ideal Weight = 44.4 kg., BMR = 1077.5 calories

AdultMale Patient: Name = Damon, Matt,
	Birth month/year = 10/1970, Height = 177.8 cm., Weight = 70.0 kg.
	Age = 47, Ideal Weight = 76.4 kg., BMR = 1594.4 calories

AdultMale Patient: Name = DICAPRIO, LEONARDO,
	Birth month/year = 11/1974, Height = 181.6 cm., Weight = 75.0 kg.
	Age = 43, Ideal Weight = 80.6 kg., BMR = 1709.1 calories

AdultFemale Patient: Name = Flockhart, Calista,
	Birth month/year = 11/1964, Height = 167.64 cm., Weight = 44.0 kg.
	Age = 53, Ideal Weight = 59.1 kg., BMR = 1130.1 calories

AdultFemale Patient: Name = Lopez, Jennifer,
	Birth month/year = 7/1969, Height = 167.64 cm., Weight = 65.77 kg.
	Age = 48, Ideal Weight = 59.1 kg., BMR = 1362.5 calories

AdultMale Patient: Name = Reynolds, Ryan,
	Birth month/year = 10/1976, Height = 187.96 cm., Weight = 85.28 kg.
	Age = 41, Ideal Weight = 87.6 kg., BMR = 1895.3 calories

The number of underweight female patients: 2



Test Array #2:

AdultMale Patient: Name = Depp, Johnny,
	Birth month/year = 6/1963, Height = 177.8 cm., Weight = 71.0 kg.
	Age = 54, Ideal Weight = 76.4 kg., BMR = 1560.5 calories

AdultMale Patient: Name = Short, Guy,
	Birth month/year = 8/1973, Height = 144.78 cm., Weight = 45.34 kg.
	Age = 44, Ideal Weight = 45.6 kg., BMR = 1111.9 calories

AdultMale Patient: Name = Stallone, Sylvester,
	Birth month/year = 7/1946, Height = 175.26 cm., Weight = 103.4 kg.
	Age = 71, Ideal Weight = 73.6 kg., BMR = 1876.1 calories

AdultMale Patient: Name = STILLER, BEN,
	Birth month/year = 11/1965, Height = 168.9 cm., Weight = 70.3 kg.
	Age = 52, Ideal Weight = 66.6 kg., BMR = 1520.0 calories

There are no adult female patients on the list
 */