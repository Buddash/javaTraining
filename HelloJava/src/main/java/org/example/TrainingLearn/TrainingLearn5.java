package org.example.TrainingLearn; //Рекурсивный и итеративный Фибоначчи

import java.util.Scanner;

public class TrainingLearn5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int numberKeyboard = scanner.nextInt();

        int fibonacciNumberKeyboard1 = fibonacciRecursive(numberKeyboard);
        int fibonacciNumberKeyboard2 = fibonacciItterativ(numberKeyboard);

        System.out.println("Фибоначчи вашего числа рекурсивно: " + fibonacciNumberKeyboard1);
        System.out.println("Фибоначчи вашего числа итеративно: " + fibonacciNumberKeyboard2);

    }

    static int fibonacciRecursive(int number1) {
        if (number1 == 0 || number1 == 1) return number1;
        return fibonacciRecursive(number1 - 1) + fibonacciRecursive(number1 - 2);
    }

    static int fibonacciItterativ(int number2) {
        if (number2 <= 1) {
            return number2;
        }
        int prev = 0;
        int current = 1;
        for (int i = 2; i <= number2; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }

}