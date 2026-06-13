package org.example.TrainingLearn; // Объявляет, в каком пакете (папке) лежит наш класс. Пакеты нужны для организации кода и избежания конфликтов имён.

import java.util.Scanner; // импорты подключают фалы находящиеся не в этом пакете(папке). В данном случаем мы указываем на стандартный класс джава, поэтому путь выглядит так
                            // Если бы ы импортировали другой класс, выглядело бы так ДОПИСАТЬ,,,

public class StructureProgramm {  //Создаем публичный класс с именем StructureProgramm - это основа программы
                                    //здесь описывается весь код программы, эту штуку писать ВСЕГДА, в это оборачиваются все программы в жабе
                                    // public - обозначает уровень доступа. Текущий показывает что класс доступен всем остальным программа вне своего пакета
                                    // Могли быть еще модификаторы: private, protected, default
                                    // ДОПИСАТЬ про префиксы к названию

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