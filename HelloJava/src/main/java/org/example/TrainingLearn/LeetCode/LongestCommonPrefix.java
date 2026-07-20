

public static class LongestCommonPrefix {
    public static String findLongestPrefix(String[] arrayBase) {
        String result = "";
        for (int j = 0; j < arrayBase[0].length(); j++) {

            boolean allMatch = true;

            for (int i = 1; i < arrayBase.length; i++) {
                if (j >= arrayBase[i].length()) {
                    return result;
                }

                if (arrayBase[0].charAt(j) != arrayBase[i].charAt(j)) {
                    allMatch = false;
                    break;
                }
            }
            if (allMatch) {
                result = result + arrayBase[0].charAt(j);
            } else {
                return result;
            }
        }
        return result;
    }
}

public static void main(String[] args) {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    String[] test = {"123", "12", "123", "123"};

    System.out.println(LongestCommonPrefix.findLongestPrefix(test));

}

