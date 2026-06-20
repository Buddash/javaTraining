// Импорты. Говорят Java, где лежат нужные нам команды.

import io.restassured.RestAssured; // Главный класс для отправки запросов
import io.restassured.response.Response; // Сюда прилетит ответ от сервера
import org.assertj.core.api.Assertions; // Наш "детектор лжи" для проверок
import org.junit.jupiter.api.Test; // Говорим, что метод - это тест
import org.junit.jupiter.api.DisplayName;


@DisplayName("Первый тест - проверка аннотации")
public class TrainingTest1 {

    // Аннотация @Test из JUnit. Без неё Java не поймет, что это автотест.
    @Test
    public void checkThatFirstPostHasUserIdOne() {
        // ----------------------------------------------
        // 1. ARRANGE (Подготовка данных)
        // ----------------------------------------------
        // Собираем URL, куда будем стучаться.
        // Пока просто положим его в строковую переменную.
        String endpoint = "https://jsonplaceholder.typicode.com/posts/1";

        // ----------------------------------------------
        // 2. ACT (Выполнение действия)
        // ----------------------------------------------
        // Отправляем GET-запрос по адресу и ВСЁ, что вернет сервер,
        // сохраняем в переменную response.
        // .get() - это метод RestAssured, который выполняет HTTP GET.
        Response response = RestAssured.get(endpoint);

        response.then().statusCode(200);

        // 2. Проверка содержимого (JSON):
        // Мы ожидаем, что у поста с ID = 1, поле "userId" равно 1.
        // .jsonPath().getInt("userId") - достает число из JSON-ответа по ключу.
        int actualUserId = response.jsonPath().getInt("userId");

        // Assertions.assertThat(actualUserId) - берет фактическое значение.
        // .isEqualTo(1) - сравнивает с ожидаемым.
        Assertions.assertThat(actualUserId)
                .as("Проверяем, что у первого поста userId = 1") // Сообщение при ошибке
                .isEqualTo(1);

        // 3. Дополнительно проверим, что заголовок не пустой (на всякий случай)
        String title = response.jsonPath().getString("title");
        Assertions.assertThat(title)
                .as("Заголовок не должен быть null")
                .isNotNull();

        // Если мы дошли до этой строки и не упали с ошибкой - ТЕСТ ПРОЙДЕН!
        System.out.println("Тест выполнен успешно!");
    }
}
