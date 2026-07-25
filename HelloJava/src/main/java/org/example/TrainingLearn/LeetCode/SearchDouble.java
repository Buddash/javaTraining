

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

static class SearchDouble {
    public int removeDuplicates(int[] nums) {
        Deque<String> list = new ArrayDeque<>();
        int i = 0;
        list.add(String.valueOf(nums[i]));

        for (i = 0; i < nums.length; i++) {
            if (list.getLast().equals(String.valueOf(nums[i]))) {
                list.removeLast();
                list.add(String.valueOf(nums[i]));
            }
            else  list.add(String.valueOf(nums[i]));
            System.out.println(list);
        }
        return list.size();
    }
}


public static void main(String[] args) {
    SearchDouble searchDouble = new SearchDouble();

    int[] nums = {0,0,1,1,1,2,2,3,3,4};

    System.out.println(searchDouble.removeDuplicates(nums));


}
