// Импорты для API
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;

// Импорты для UI (Selenium)
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Тесты: API + UI")
public class TrainingTest3 {

    // ---------- ПЕРВЫЙ ТЕСТ: API ----------
    @Test
    @DisplayName("API: Проверка первого поста")
    public void checkThatFirstPostHasUserIdOne() {
        String endpoint = "https://jsonplaceholder.typicode.com/posts/1";

        Response response = RestAssured.get(endpoint);

        response.then().statusCode(200);

        int actualUserId = response.jsonPath().getInt("userId");
        Assertions.assertThat(actualUserId)
                .as("Проверяем, что у первого поста userId = 1")
                .isEqualTo(1);

        String title = response.jsonPath().getString("title");
        Assertions.assertThat(title)
                .as("Заголовок не должен быть null")
                .isNotNull();

        System.out.println("✅ API тест выполнен успешно!");
    }


    // ---------- ВТОРОЙ ТЕСТ: UI (Selenium) ----------
    @Test
    @DisplayName("UI: Логин на SauceDemo")
    public void testUILogin() {
        // 1. Открываем браузер
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // 2. Переходим на сайт
            driver.get("https://www.saucedemo.com/");

            // 3. Вводим логин
            WebElement usernameField = driver.findElement(By.id("user-name"));
            usernameField.sendKeys("standard_user");

            // 4. Вводим пароль
            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("secret_sauce");

            // 5. Нажимаем кнопку Login
            WebElement loginButton = driver.findElement(By.id("login-button"));
            loginButton.click();

            // 6. Проверяем, что мы на главной странице
            WebElement productsTitle = driver.findElement(By.className("title"));
            String actualText = productsTitle.getText();

            Assertions.assertThat(actualText)
                    .as("Заголовок должен быть 'Products'")
                    .isEqualTo("Products");

            System.out.println("✅ UI тест выполнен успешно!");

        } finally {
            // 7. Закрываем браузер (всегда!)
            driver.quit();
        }
    }


    // ---------- ТРЕТИЙ ТЕСТ: Комбинированный (API + UI) ----------
    @Test
    @DisplayName("Комбинированный: API + UI")
    public void testCombined() {
        // ШАГ 1: Проверяем API
        System.out.println("🔵 Шаг 1: Проверяем API");
        String endpoint = "https://jsonplaceholder.typicode.com/posts/1";
        Response response = RestAssured.get(endpoint);
        response.then().statusCode(200);

        int userId = response.jsonPath().getInt("userId");
        Assertions.assertThat(userId).isEqualTo(1);
        System.out.println("   ✅ API проверка пройдена");

        // ШАГ 2: Открываем браузер и логинимся
        System.out.println("🔵 Шаг 2: Открываем браузер");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.saucedemo.com/");

            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            // ШАГ 3: Проверяем UI
            System.out.println("🔵 Шаг 3: Проверяем UI");
            WebElement productsTitle = driver.findElement(By.className("title"));
            Assertions.assertThat(productsTitle.getText())
                    .as("Заголовок должен быть 'Products'")
                    .isEqualTo("Products");

            System.out.println("✅ Комбинированный тест выполнен успешно!");

        } finally {
            driver.quit();
        }
    }
}