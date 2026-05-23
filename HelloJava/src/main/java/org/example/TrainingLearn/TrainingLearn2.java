package org.example.TrainingLearn;


public class TrainingLearn2 {

    public static void main(String[] args) {
        boolean result = metodDlyaRascheta(15, 35001);
        System.out.println("Результат " + result);
    }


    public static boolean metodDlyaRascheta(int age, int salary) {

        return ((age >= 18 && age <= 65) || (salary > 35000));
    }
}