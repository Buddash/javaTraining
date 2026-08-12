
public static class PlusOne {

    public int[] upNumberOne(int[] mass) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : mass) {
            arr.add(num);
        }

        for (int i = mass.length - 1; i >= 0; i--) {
            if (arr.get(i) + 1 == 10) {
                arr.set(i, 0);
            }
            else {
                arr.set(i, arr.get(i) + 1);
                break;
            }
        }

        if (arr.getFirst() == 0) {
            arr.addFirst(1);
        }
        int[] massEnd = arr.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(massEnd));
        return massEnd;
    }
}


public static void main(String[] args) {
    PlusOne plusOne = new PlusOne();

    System.out.println(plusOne.upNumberOne(new int[]{1,9,9}));
}