package api.PetStore;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.filter.log.LogDetail;

public class AbstractServicePet {

    private RequestSpecification requestSpecification;
    private String url;

    public AbstractServicePet(String url) {

        this.url = url;

        this.requestSpecification = new RequestSpecBuilder()
                .setBaseUri(url)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL) //логирует только запрос
                .build();
    }

    public RequestSpecification getRequestSpecification () {
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

