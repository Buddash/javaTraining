package api;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class Service extends AbstractService {

    private String firstEndpoint;

    public Service() {
        super("https://cleanuri.com");
        this.firstEndpoint = "/api/v1/shorten";
    }

    @Step("Отправка POST-запроса со значением {testUrl}")
    public Response firstEndpointPost(String testUrl) {

        Response response = given()
                .spec(getRequestSpecification())
                .when()
                .formParam("url", testUrl)
                .post(firstEndpoint)
                .then()
                .extract()
                .response();

        return response;
    }
}
