
import java.util.ArrayList;

public static class RemoveElement {
    public int searchForRemoveElement(int[] nums, int val) {
        ArrayList<Integer> newNums = new ArrayList<>();
        for (int num : nums) {
            newNums.add(num);
        }
        for (int i = 0; i < newNums.size(); i++)
        {
            if (newNums.get(i).equals(val)) {
                newNums.remove(i);
                i--; // TODO спросить про блее правильное решеник и спросить почему не засчитывают задачу
            }
        }
        System.out.println(newNums);
        return newNums.size();
    }
}

public static void main(String[] args) {
    RemoveElement removeElement = new RemoveElement();

    int result = removeElement.searchForRemoveElement(new int[] {3,2,2,3}, 3);
    System.out.println(result);
}

// Пробелма в том что я вытаскиваю элемент проверяю его и иду дальше.
// Но если я удалил элемент все остальные по индексу сдвигаются и
// получается я пропускаю следующий если его тоже надо удалить
// Я понял проблему олни  хотят чтобы я не очищал строку а пересобирал и оставил старые жлементы в конце списка
// Завтра доработаю