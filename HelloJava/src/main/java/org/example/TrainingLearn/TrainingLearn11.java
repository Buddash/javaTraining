package org.example.TrainingLearn;

import java.util.HashSet;
import java.util.TreeSet;


/*
    - Создайте HashSet и TreeSet.
    Добавьте в каждый из них 10000 случайных чисел.
    Выполните поиск 100 случайно выбранных чисел в каждом из наборов и замерьте время поиска в каждом из них.
    Объясните разницу в производительности.
 */

public class TrainingLearn11 {
    public static void main(String[] args) {
        // Работа с HashSet
        HashSet<Integer> HashNumber = new HashSet<>();

        for (int i = 1; i <= 10000; i++) {
            int number = (int) (Math.random() * 1000000);
            HashNumber.add(number);
        }

        System.out.println(HashNumber);

        long startSearchHashSet = System.nanoTime();

        int foundCount = 0;

        for (int i = 1; i <= 100; i++) {
            int number = (int) (Math.random() * 1000000);
            if (HashNumber.contains(number)) foundCount++;
        }

        long endSearchHashSet = System.nanoTime();
        long durationMsSearchHashSet = (endSearchHashSet - startSearchHashSet) / 1_000_000;

        System.out.println("Время на поиск 100 элементов в HashSet: " + durationMsSearchHashSet + " ms");
        System.out.println("Найдено совпадений: " + foundCount);


        // Работа с TreeSet
        TreeSet<Integer> TreeNumber = new TreeSet<>();

        for (int i = 1; i <= 10000; i++) {
            int number = (int) (Math.random() * 1000000);
            TreeNumber.add(number);
        }

        System.out.println(TreeNumber);

        long startSearchTreeSet = System.nanoTime();

        int foundCount2 = 0;

        for (int i = 1; i <= 100; i++) {
            int number = (int) (Math.random() * 1000000);
            if (TreeNumber.contains(number)) foundCount2++;
        }

        long endSearchTreeSet = System.nanoTime();
        long durationMsSearchTreeSet = (endSearchTreeSet - startSearchTreeSet) / 1_000_000;

        System.out.println("Время на поиск 100 элементов в TreeSet: " + durationMsSearchTreeSet + " ms");
        System.out.println("Найдено совпадений: " + foundCount2);

    }
}