

public static class SumNumber {
    public String summBinary(String a, String b) {

        BigInteger aAfter = new BigInteger(a, 2);
        BigInteger bAfter = new BigInteger(b, 2);

        BigInteger sum = aAfter.add(bAfter);

        return sum.toString(2);
    }
}





public static void main (String[] args){

    SumNumber sumNumber = new SumNumber();

    System.out.println(sumNumber.summBinary("111", "1010"));
}