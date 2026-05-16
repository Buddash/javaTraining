package org.example.TrainingLearn; //Рекурсивный и итеративный факториал факториал

import java.util.Scanner;

public class TrainingLearn4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int numberKeyboard = scanner.nextInt();

        int factorialNumberKeyboard1 = factorialRecurs(numberKeyboard);
        int factorialNumberKeyboard2 = factorialIterativ(numberKeyboard);

        System.out.println("Факториал вашего числа рекурсивно: " + factorialNumberKeyboard1);
        System.out.println("Факториал вашего числа итеративно: " + factorialNumberKeyboard2);

    }

     static int factorialRecurs(int number) {
         if (number == 1) return 1;
         return number * factorialRecurs(number - 1);
    }

    static int factorialIterativ(int number2) {
        int result = 1;
        for (int i = 1; i <= number2; i++) {
           result *= i;
        }
        return result;
    }

}