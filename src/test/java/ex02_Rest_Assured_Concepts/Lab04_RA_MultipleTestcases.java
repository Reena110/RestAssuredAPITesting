package ex_Rest_Assured_Concepts;

import io.restassured.RestAssured;

public class Lab04_RA_MultipleTestcases
{
    public static void main(String[] args) {

        String pincode = "835103";
        RestAssured
                .given()
                .baseUri("https://api.postalpincode.in/")
                .basePath("/IN/" +pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
