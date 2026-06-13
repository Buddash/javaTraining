package org.example.TrainingLearn;

/*
 - Дан список сотрудников (объекты с полями имя, зарплата). Найдите среднюю зарплату сотрудников.
 */

import java.util.List;
import java.util.stream.DoubleStream;

public class TrainingLearn18 {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Анна", 25),
                new Person("Олег", 31),
                new Person("Иван", 22)
        );

        double avgSalary = persons.stream()
                .mapToDouble(p -> p.salary)
                .average()
                .orElse(0);

        System.out.println("Средняя зарплата: " + avgSalary);
    }
}

class Person {
    String name;
    int salary;

    Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}