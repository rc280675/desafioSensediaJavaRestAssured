package config;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseConfig {

    public static RequestSpecification request() {
        return RestAssured.given()
                .baseUri("https://api.trello.com/1")
                .contentType(ContentType.JSON)
                .log().all();
    }

}