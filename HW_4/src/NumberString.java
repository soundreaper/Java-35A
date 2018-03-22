public class NumberString {
    private static final int SIZE = 200;
    private String numStr = "0";
    private StringBuilder numStrPalin = new StringBuilder("0");
    private StringBuilder reverseStr = new StringBuilder("0");


    public NumberString(String numStrSet) {
        boolean success = setNumStr(numStrSet);

        if (!success) {
            numStr = "0";
            clear();
            reverseStr.append("0");
            numStrPalin.append("Invalid Parameter");
        }
    }

    public NumberString() {
    }

    public String getNumStr() {
        return numStr;
    }

    public String getNumStrPalin() {
        return numStrPalin.toString();
    }

    public boolean setNumStr(String number) {
        if (number == null || number.isEmpty() || !isDigit(number)) {
            return false;
        }
        numStr = number;
        makePalindrome();
        return true;
    }

    private boolean isDigit(String number) {
        return number.matches("[0-9]+");
    }

    private void clear() {
        numStrPalin.delete(0, numStrPalin.length());
        reverseStr.delete(0, reverseStr.length());
    }

    private StringBuilder reverse(StringBuilder sB) {
        StringBuilder reversedSB = new StringBuilder();

        for (int i = sB.length() - 1; i >= 0; i--) {
            reversedSB.append(sB.charAt(i));
        }

        return reversedSB;
    }

    private Integer addSingleDigit(String s1, String s2, Integer carry, StringBuilder sum) {
        Integer n1 = Integer.parseInt(s1);
        Integer n2 = Integer.parseInt(s2);

        Integer intSum = n1 + n2 + carry;
        Integer digit = intSum % 10;

        carry = intSum / 10;

        sum.append(digit.toString());
        return carry;
    }

    private StringBuilder add(StringBuilder sB1, StringBuilder sB2) {
        if (sB1.length() > sB2.length()) {
            int count = sB1.length() - sB2.length();

            for (int i = 0; i < count; i++) {
                sB2.insert(0, "0");
            }
        } else {
            int count = sB2.length() - sB1.length();

            for (int i = 0; i < count; i++) {
                sB1.insert(0, "0");
            }
        }

        Integer carry = 0;
        StringBuilder digitSum = new StringBuilder("");
        StringBuilder totalSum = new StringBuilder("");

        for (int i = sB1.length() - 1; i >= 0; i--) {
            carry = addSingleDigit(Character.toString(sB1.charAt(i)), Character.toString(sB2.charAt(i)), carry, digitSum);
            totalSum.insert(0, digitSum);
            digitSum.delete(0, digitSum.length());
        }

        if (carry > 0) {
            totalSum.insert(0, carry);
        }

        return totalSum;
    }

    private void addNumStr() {
        numStrPalin = add(numStrPalin, reverseStr);
    }

    private void makePalindrome() {
        clear();

        numStrPalin.append(numStr);
        reverseStr.append(reverse(numStrPalin));

        while (true) {
            if (numStrPalin.toString().equals(reverseStr.toString()) || numStrPalin.length() > SIZE) {
                break;
            }

            addNumStr();

            reverseStr.delete(0, reverseStr.length());
            reverseStr.append(reverse(numStrPalin));
        }

        if (numStrPalin.length() > SIZE) {
            numStrPalin.delete(0, numStrPalin.length());
            numStrPalin.append("No Solution < " + SIZE + " digits");
        }
    }
}