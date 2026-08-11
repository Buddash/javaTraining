package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Проверка API запросов на сайт")
public class ResponceMainPage {

    @DisplayName("Успешный запрос на сайт, проверка тайтла и кода ответа")
    @Test
    public void MainPageOK() {

        /*
        Объявляю переменную типа респонс чтобы она сделать запрос на URL
        И вывожу тело ответа1
        Тело возвращает мне просто id ответа
         */
        Response responseOfSite = RestAssured.get(TestData.MAIN_URL);
        System.out.println(responseOfSite);

        /*
        У меня был тип респонс, а теперь тип стринг в который я записал тело ответа приведя к строке
        и вывожу его
         */
        String responseBody = responseOfSite.getBody().asString();
        System.out.println("Тело ответа: " + responseBody);


        /*
        Для дальнейших перобразований (выделения нужного)
        я объявляю новую переменную и использую ее для преобразований тело ответа
         */
        String body = responseOfSite.asString();

        /*
        Выделяю из ответа тайтл чтобы проверить имя сайта
         */
        int startTitleSite = body.indexOf("<title>") + 7;
        int endTitleSite = body.indexOf("</title>");
        String titleSite = body.substring(startTitleSite, endTitleSite);

        /*
        Если имя совпадает, то вывожу сообщение о том что ок, если нет, то ошщибку
         */
        if (titleSite.contains(TestData.TITLE_SITE)) // TODO: обернуть в обработчик ошибок
        {
            System.out.println("OK - the site is correct");
        } else {
            System.out.println("Error");
        }


        // Код ответа
        int statusCode = responseOfSite.getStatusCode();

        if (statusCode == TestData.STATUS_CODE) {
            System.out.println("Запрос успешен, код:" + statusCode);
        } else {
            System.out.println("Запрос неудачный, код:" + statusCode);
        }
    }
}
