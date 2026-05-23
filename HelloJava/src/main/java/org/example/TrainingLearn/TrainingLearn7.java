package org.example.TrainingLearn; //Перегруженный конструктор

import java.util.Scanner;

import java.util.Scanner;

public class TrainingLearn7 {

    public static void main(String[] args) {

        Man mn = new Man();
        System.out.println(mn.parametrs(18, 210, 33));

    }

    static class Man {
        Scanner scanner = new Scanner(System.in);

        String parametrs(int age, int height, int weight) {
            String result = "Возраст: " + age + "; Рост: " + height + "; Вес: " + weight;
            return result;
        }

        String parametrs(int age, int height) {
            String result = "Возраст: " + age + "; Рост: " + height + "; Вес: 0";
            return result;
        }

        String parametrs(int age) {
            String result = "Возраст: " + age + "; Рост: 0" + "; Вес: 0";
            return result;
        }

    }
}
