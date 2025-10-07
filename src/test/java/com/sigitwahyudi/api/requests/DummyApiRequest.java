package com.sigitwahyudi.api.requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DummyApiRequest {
    private static final String BASE_URL = "https://dummyapi.io/data/v1/";
    private static final String APP_ID = "63a804408eb0cb069b57e43a";

    public static Response getUsers(int limit) {
        return RestAssured
                .given()
                .header("app-id", APP_ID)
                .queryParam("limit", limit)
                .get(BASE_URL + "user");
    }

    public static Response getUserById(String id) {
        return RestAssured
                .given()
                .header("app-id", APP_ID)
                .get(BASE_URL + "user/" + id);
    }
}
