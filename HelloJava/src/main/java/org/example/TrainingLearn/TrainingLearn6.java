package org.example.TrainingLearn; //Вывод массива циклом

import java.util.Scanner;

public class TrainingLearn6 {

    public static void main(String[] args) {

        int[] array = massive();
        ziklFor(array);
        ziklDo(array);
        ziklWhile(array);
    }


    static int[] massive() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();
        return array;
    }

    // Вывод элементов массивы циклом for
    static void ziklFor(int[] array) {
        System.out.println("Вывод циклом for: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // Вывод элементов массивы циклом for
    static void ziklDo(int[] array) {
        System.out.println("Вывод циклом do: ");
        int i = 0;
        do {
            System.out.println(array[i]);
            i++;
        }
        while (i < array.length);
    }

    // Вывод элементов массивы циклом for
    static void ziklWhile(int[] array) {
        System.out.println("Вывод циклом While: ");
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
    }
}