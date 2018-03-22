public class Exercise4_1 {
    public static float[] makeFloatArray(int numElems, float value) {
        float floatArrayCreated[] = new float[numElems];

        for (int i = 0; i < floatArrayCreated.length; i++) {
            floatArrayCreated[i] = (float)Math.pow(value, i);
        }
        return floatArrayCreated;
    }

    public static void printFloatArrayReverse(float[] floatValues) {
        for (int i = floatValues.length - 1; i >= 0; i--) {
            System.out.println(floatValues[i]);
        }
    }

    public static void main( String[] args ) {
        float floatArray[];

        floatArray = makeFloatArray(9, 5.0f);
        printFloatArrayReverse(floatArray);
    }
}

// Output:
/*
    390625.0
    78125.0
    15625.0
    3125.0
    625.0
    125.0
    25.0
    5.0
    1.0
 */
