// Given a roman numeral, convert it to an integer.

public static class RomanToInteger {
    public int romanToInt(String romanNumber) {
        int arabicNumber = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
            int currentNumber = switch (romanNumber.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };
            int nextNumber;
            if (i + 1 < romanNumber.length()) {
                nextNumber = switch (romanNumber.charAt(i + 1)) {
                    case 'I' -> 1;
                    case 'V' -> 5;
                    case 'X' -> 10;
                    case 'L' -> 50;
                    case 'C' -> 100;
                    case 'D' -> 500;
                    case 'M' -> 1000;
                    default -> 0;
                };
            } else {
                nextNumber = 0;
            }
            if (currentNumber < nextNumber) {
                arabicNumber -= currentNumber;
            }
            else if (currentNumber >= nextNumber) {
                arabicNumber += currentNumber;
            }
        }
        return arabicNumber;
    }
}

public static void main(String[] args) {
    RomanToInteger romanToInteger = new RomanToInteger();

    System.out.println(romanToInteger.romanToInt("MCMXCIV"));
}