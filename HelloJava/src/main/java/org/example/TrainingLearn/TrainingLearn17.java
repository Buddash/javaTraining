package org.example.TrainingLearn;

/*
- Дан список строк. Отсортируйте строки по длине и выведите первые 5 элементов.
 */

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TrainingLearn17 {
    public static void main(String[] args) {
        List<String> sortString = Stream.of("12312", "12", "123", "1234", "12345", "123456", "1234567", "6", "4", "3434")
                .sorted((s1, s2) -> s1.length() - s2.length())
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(sortString);
    }
}