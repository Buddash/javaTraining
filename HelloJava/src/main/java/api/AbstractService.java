package api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import lombok.Data;


public class AbstractService {

    private RequestSpecification requestSpecification;
    private String url;

    public AbstractService(String url) {

        this.url = url;

        this.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(url)
                .setContentType(ContentType.URLENC)
                .build();

    }

    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setRequestSpecification(RequestSpecification requestSpecification) {
        this.requestSpecification = requestSpecification;
    }
}
