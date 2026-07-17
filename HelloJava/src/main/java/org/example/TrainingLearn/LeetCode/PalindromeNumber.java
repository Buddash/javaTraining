/*
Given an integer x, return true if x is a palindrome, and false otherwise.
 */

package org.example.TrainingLearn.LeetCode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int[] arrX = String.valueOf(x).chars().map(Character::getNumericValue).toArray();

        int stetchik = 0;
        for (int i = 0; i <= arrX.length - 1; i++) {
            if (arrX[i] == arrX[arrX.length - i - 1]) {
                stetchik++;
            } else {
                stetchik--;
            }
            System.out.println(stetchik);
        }
        if (stetchik == arrX.length) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        boolean finishResult = palindromeNumber.isPalindrome(1434241);

        System.out.println(finishResult);
    }

}
