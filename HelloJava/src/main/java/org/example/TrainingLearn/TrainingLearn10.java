package org.example.TrainingLearn;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 - Создайте два списка: ArrayList и LinkedList.
 Добавьте в каждый список 100000 элементов,
 затем удалите из каждого списка первые 50000 элементов.
 Замерьте время, затраченное на каждую операцию для каждого типа списка,
 и сравните результаты.
 */

public class TrainingLearn10 {
    public static void main(String[] args) {
        long startCreationArrayList = System.nanoTime();

        // Работа со списком ArrayList
        ArrayList<Integer> spisokArrayList = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            spisokArrayList.add(i);
        }

        long endCreationArrayList = System.nanoTime();
        long durationMsCreationArrayList = (endCreationArrayList - startCreationArrayList) / 1_000_000;

        System.out.println(spisokArrayList);
        System.out.println("Время на создание ArrayList " + durationMsCreationArrayList + "ms");

        long startDeleteElementArrayList = System.nanoTime();

        for (int i = 1; i <= 5000; i++) {
            spisokArrayList.remove(0);
        }

        long endDeleteElementArrayList = System.nanoTime();
        long durationMsDeleteElementArrayList = (endDeleteElementArrayList - startDeleteElementArrayList) / 1_000_000;

        System.out.println(spisokArrayList);
        System.out.println("Время на удаление элементов ArrayList " + durationMsDeleteElementArrayList + "ms");

        // Работа со списком LinkedList
        long startCreationLinkedList = System.nanoTime();

        LinkedList<Integer> spisokLinkedList = new LinkedList<>();

        for (int i = 1; i <= 10000; i++) {
            spisokLinkedList.addLast(i);
        }

        long endCreationLinkedList = System.nanoTime();
        long durationMsCreationLinkedList = (endCreationLinkedList - startCreationLinkedList) / 1_000_000;

        System.out.println(spisokLinkedList);
        System.out.println("Время на создание LinkedList  " + durationMsCreationLinkedList + "ms");

        long startDeleteElementLinkedList = System.nanoTime();

        for (int i = 1; i <= 5000; i++) {
            spisokLinkedList.remove(0);
        }

        long endDeleteElementLinkedList = System.nanoTime();
        long durationMsDeleteElementLinkedList = (endDeleteElementLinkedList - startDeleteElementLinkedList) / 1_000_000;

        System.out.println(spisokLinkedList);
        System.out.println("Время на удаление элементов LinkedList  " + durationMsDeleteElementLinkedList + "ms");

    }
}
