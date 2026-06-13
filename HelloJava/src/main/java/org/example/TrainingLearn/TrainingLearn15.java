package org.example.TrainingLearn;

/*
 - Дан список строк. Найдите количество строк, которые начинаются на букву "a" и длиннее 3 символов.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TrainingLearn15 {
    public static void main (String[] args) {
        String stroka1 = "Первая строка";
        String stroka2 = "АВторая строка";
        String stroka3 = "АТр";

        List<String> stroki = new ArrayList();
        stroki.add(stroka1);
        stroki.add(stroka2);
        stroki.add(stroka3);

        System.out.println(stroki);

        long countString1 = stroki.stream()
                .filter(s -> s.startsWith("А"))
                .filter(s -> s.length() > 3)
                .count();

        System.out.println(countString1);

        // Наверное можно и короче

        long countString2 = Stream.of("АПРф", "АПРПП", "прорпо")
                .filter(s -> s.startsWith("А"))
                .filter(s -> s.length() > 3)
                .count();

        System.out.println(countString2);
    }
}
