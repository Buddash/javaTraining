package org.example;

import java.util.Scanner;

public class TrainingLearn1 {

    public static void main(String[] args) {

        Scanner inputAge = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int age = inputAge.nextInt();

        Scanner inputSalary = new Scanner(System.in);
        System.out.println("Введите зарплату: ");
        int salary = inputSalary.nextInt();

        if ((age >= 18 && age <= 65) || (salary > 35000)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}