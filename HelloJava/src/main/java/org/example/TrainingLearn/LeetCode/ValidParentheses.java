/*
Дана строка, sсодержащая только символы '(', ')', '{', '}', '['и ']'. Определите, является ли входная строка допустимой.

Входная строка считается допустимой, если:

Открытые скобки должны быть закрыты скобками того же типа.
Открытые скобки необходимо закрыть в правильном порядке.
Каждой закрывающей скобке соответствует открывающая скобка того же типа.
 */


import java.util.ArrayList;
import java.util.List;


public static class ValidParentheses {
    public boolean isValid(String stroka) {
        Deque<Character> myList = new ArrayDeque<>();

        for (char c : stroka.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                myList.push(c);
            } else {
                if (myList.isEmpty()) {
                    return false;
                }
                char top = myList.pop();

                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        return myList.isEmpty();
    }
}


public static void main(String[] args) {

    ValidParentheses validParentheses = new ValidParentheses();

    boolean finishResult = validParentheses.isValid("(){}[]");

    System.out.println(finishResult);

}

