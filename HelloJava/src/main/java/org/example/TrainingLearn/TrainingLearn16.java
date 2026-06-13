package org.example.TrainingLearn;

import java.util.List;
import java.util.stream.Collectors;

public class TrainingLearn16 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);

        List<Integer> newList = list.stream()
                .map((x) -> x * x)
                .collect(Collectors.toList());

        System.out.println(newList);
    }
}