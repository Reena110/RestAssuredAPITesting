package ex01_Rest_Assured_Basics;

import io.restassured.RestAssured;

public class Lab01_Rest_Assured {
    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com/ping")
                .when()
                .get()
                .then().log().all().statusCode(201);
    }
}
