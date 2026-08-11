package api;

import io.qameta.allure.Step;
import io.restassured.response.Response;

public class Facade {

    private Service service;

    public Facade() {
        this.service = new Service();
    }

    @Step("Полуть туловище запроса 200")
    public String shortenUrlSuccess(String testUrl) {

        Response response = service.firstEndpointPost(testUrl);

        ResponsePost body = response.as(ResponsePost.class);

        return body.getResult_url();
    }
}
