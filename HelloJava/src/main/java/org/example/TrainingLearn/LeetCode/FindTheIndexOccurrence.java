

public static class FindTheIndexOccurrence {
    public int searchIndex(String haystack, String needle) {
        int numIndex = 0;
        numIndex = haystack.indexOf(needle);
        return numIndex;
    }
}


public static void main(String[] args) {
    FindTheIndexOccurrence findTheIndexOccurrence = new FindTheIndexOccurrence();

    int result = findTheIndexOccurrence.searchIndex("Тупое говно, тупого говно", "говно");

    System.out.println("Result = " + result);
}
