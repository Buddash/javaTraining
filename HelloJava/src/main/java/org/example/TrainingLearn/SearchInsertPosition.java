
/*
Имея отсортированный массив различных целых чисел и целевое значение, верните индекс,
если целевое значение найдено. В противном случае верните индекс, по которому оно
находилось бы, если бы было вставлено в порядке возрастания.

Вам необходимо написать алгоритм с  O(log n)заданной временной сложностью.

Пример 1:

Входные данные: nums = [1,3,5,6], target = 5
 Выходные данные: 2
Пример 2:

Входные данные: nums = [1,3,5,6], target = 2
 Выходные данные: 1
Пример 3:

Входные данные: nums = [1,3,5,6], target = 7
 Выходные данные: 4

 Повторить про временную сложность
 Научиться переводить массив в список
 */

import java.util.ArrayList;
import java.util.Arrays;

import static org.apache.commons.lang3.ArrayUtils.indexOf;

public static class InsertPosition {
   public int searchIndexPosition (int[] mass, int target) {
       int position = 0;

       for (int i =0; i < mass.length; i++) {
           if (target == mass[i]) {
               target = i;
               return target;
           }
           else {
               for (int j =0; j < mass.length; j++) {
                   if (mass[i] < target) {
                       target = mass[i] + 1;
                   }
                   else {
                       target = mass[i];
                   }
                   return target;
               }
           }
       }

//       ArrayList<int[]> list = new ArrayList<>(Arrays.asList(mass));
//
//       for (int i =0; i < list.size(); i++) {
//           if (indexOf(target != -1) {
//               return indexOf(target);
//           }
//           else {
//               return
//           }
//       }


       return target;
   }
}



public static void main(String[] args) {

    InsertPosition insertPosition = new InsertPosition();

    System.out.println(insertPosition.searchIndexPosition(new int[] {1, 4, 5, 7, 8}, 7));

}