package org.example.TrainingLearn;

import java.util.HashMap;
import java.util.Map;

public class TrainingLearn13 {
    public static void main(String[] args) {
        System.out.println(StudentGrades.getGrade("Илья"));
        System.out.println(StudentGrades.getGrade("Ваня"));
    }

    public class StudentGrades {

        private static Map<String, Integer> studentScores = new HashMap<>();

        static {
            studentScores.put("Илья", 3);
            studentScores.put("Иван", 5);
            studentScores.put("Дмитрий", 4);
        }

        public static Integer getGrade(String studentName) {
            if (studentScores.containsKey(studentName)) {
                return studentScores.get(studentName);
            } else {
                return null;
            }
        }
    }
}
