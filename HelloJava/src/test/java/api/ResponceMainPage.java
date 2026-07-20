package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Log4j
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
       // System.out.println("Тело ответа: " + responseBody);


        /*
        Для дальнейших перобразований (выделения нужного)
        я объявляю новую переменную и использую ее для преобразований тело ответа
         */
        String body = responseOfSite.asString();

        System.out.println(body);

        /*
        Выделяю из ответа тайтл чтобы проверить имя сайта
         */
        int startTitleSite = body.indexOf("<title>") + 7;
        int endTitleSite = body.indexOf("</title>");
        String titleSite = body.substring(startTitleSite, endTitleSite);

        boolean openResult = titleSite.contains(TestData.TITLE_SITE);
        log.info("Сайт открылся? - " + openResult);
        assertTrue(titleSite.contains(TestData.TITLE_SITE));

        // Код ответа
        int statusCode = responseOfSite.getStatusCode();

        if (statusCode == TestData.STATUS_CODE) {
            log.info("Запрос успешен, код:" + statusCode);
        } else {
            log.info("Запрос неудачный, код:" + statusCode);
        }
        assertTrue(statusCode == TestData.STATUS_CODE);
    }
}
