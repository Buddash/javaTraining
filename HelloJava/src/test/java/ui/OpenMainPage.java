package ui;

import api.TestData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


@DisplayName("Переход на сайт и проверка корретности")
public class OpenMainPage {

    @Test()
    @DisplayName("Проверка успешного открытия сайта")
    public void SuccessOpenMainPage() {

        // Создаем объект driver (управляет браузером)
        // new ChromeDriver() - открывает окно Chrome
        WebDriver driver = new ChromeDriver();

        /*
        Использую драйвер чтобы открыть нужную страницу
        Данные беру из тест даты
         */
        driver.get(TestData.MAIN_URL);

        //объявляю класс из конструктора чтобы можно было с ним работать
        //в нем передаю драйвер для управления бразером, так как это один объект коснтруктора
        MainPage mainPage = new MainPage(driver);

        //И наконец буду проверять что элемент существует на данной странице
        assertNotNull(MainPage.getHelloString());
        assertTrue(mainPage.getHelloString().isDisplayed());

        driver.quit();
    }
}
