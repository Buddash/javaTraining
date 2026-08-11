package api.PetStore;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class ServicePet extends AbstractServicePet {

    private String petsIdEndp;

    public ServicePet() {
        super("https://petstore.swagger.io/v2");
        this.petsIdEndp = TestDataPet.SUCCESS_RESPONSE_200;
    }

    @Step("Отправка запроса по ID питомца")
    public Response getpetsIdEndp(String petsIdEndp) {

        Response response = given()
                .spec(getRequestSpecification())
                .filter((reqSpec, respSpec, ctx) -> {
                    System.out.println("=== RESPONSE ===");//Это и две строчки выше, разделитель для тела запроса
                    return ctx.next(reqSpec, respSpec);
                })
                .when()
                .get(getUrl() + petsIdEndp)
                .then()
                .log().body() //сам лог тела ответа
                .extract()
                .response();

        return response;
    }
}
