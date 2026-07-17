package api;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    // Конструктор класса
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    //Объявляем драйвер типа драйвер который управляет браузером
    private static WebDriver driver;

    /*
    Локатор с типом указывающий на селектор
     */
     private static By welcomeString = By.cssSelector("div.sqs-html-content");

    /*
    Метод, У КОТОРОГО ТОЖЕ ДОЛЖЕН БЫТЬ ТИП!
    возвращающий нахождение элемента по локатору который описал выше
    */
    public static WebElement getHelloString() {
        return driver.findElement(welcomeString);
    }
}
