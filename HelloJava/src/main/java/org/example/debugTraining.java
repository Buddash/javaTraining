package org.example;

public class debugTraining {

    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        String source = "Отца сало";
        StringBuilder reversed = new StringBuilder();
        for (int i = source.length() - 1; i >= 0; i--) {
            reversed.append(source.charAt(i));
        }
        System.out.println(reversed);
    }

}

// задача - работа с отладчиком, первое используем брейкпоигнты