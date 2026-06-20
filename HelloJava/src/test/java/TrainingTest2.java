import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrainingTest2 {


    public static void checkSumStep(int num1, int num2, int expectedSum) {
        Assertions.assertTrue(num1 + num2 == expectedSum, "Сумма слагаемых не соответствует ожидаемому значению");
    }


    @Test
    public void simpleTest2() {
        checkSumStep(3, 2, 5);
        checkSumStep(5, 4, 9);
    }
}
