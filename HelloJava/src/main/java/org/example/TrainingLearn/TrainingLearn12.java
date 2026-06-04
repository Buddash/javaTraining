package org.example.TrainingLearn;

import java.util.ArrayList;
import java.util.Collections;


/*
    - Создайте класс Student, который имеет два поля:
    name (String) и age (int).
    Реализуйте интерфейс Comparable для сравнения студентов по возрасту.
    Создайте список студентов, добавьте в него несколько объектов и отсортируйте его.
 */

public class TrainingLearn12 {
    public static void main(String[] args) {
        var student = new ArrayList<Student>();
        student.add(new Student("Иван", 27));
        student.add(new Student("Дмитрий", 26));
        student.add(new Student("Илья", 31));
        student.add(new Student("Артем", 45));

        Collections.sort(student);

        System.out.println(student);
    }

    static class Student implements Comparable<Student> {
        private int age;
        private String name;

        int getAge() {
            return age;
        }

        String getName() {
            return name;
        }

        Student(String name, int age) {
            this.age = age;
            this.name = name;
        }

        public int compareTo(Student other) {
            return Integer.compare(this.age, other.age);
        }
        /* Я не смог сам отсортировать по возрасту, сыпало ошибками.
        Спросил у ИИшки как быть. Необходимо пояснение. В примере немного другой синтаксис
         */

        public String toString() {
            return name + " (" + age + ")";
        }
    }
}