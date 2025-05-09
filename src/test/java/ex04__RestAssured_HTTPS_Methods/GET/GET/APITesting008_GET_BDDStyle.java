package ex04__RestAssured_HTTPS_Methods.GET.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting008_GET_BDDStyle {

    @Test
    public void test_GET_Positive() {
        String pin_code = "388620";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin_code)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }
}


