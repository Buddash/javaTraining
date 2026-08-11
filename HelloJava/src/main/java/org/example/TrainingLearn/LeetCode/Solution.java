/*
Question: Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.
 */


public static class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    if (i == j) {
                        continue;
                    } else {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }
}


public static void main(String[] args) {
    Solution solution = new Solution();

    int[] nums1 = {3, 4, 6, 3, 5};
    int target1 = 8;
    int[] result1 = solution.twoSum(nums1, target1);

    System.out.println(("Индексы: [" + result1[0] + ", " + result1[1] + "]"));


}