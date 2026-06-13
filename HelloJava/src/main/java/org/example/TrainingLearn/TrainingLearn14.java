package org.example.TrainingLearn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TrainingLearn14 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
