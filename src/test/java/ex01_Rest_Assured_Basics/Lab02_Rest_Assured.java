package ex_Rest_Assured_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class Lab02_Rest_Assured
{
    public static void main(String[] args) {
        //Gherkin Syntax
        //Given : Pre Req - URL, Headers, Auth, Body
        // When : HTTP Method ? - GET/POST/PUT/PATCH/DELETE/OPTIONS
        //THEN : Valdations 200 ok, FirstName == Reena

        // Full URL - https://api.postalpincode.in/pincode/835103
        // Base URI - https://api.postalpincode.in
        // Base path - pincode/835103
        Scanner sc = new Scanner(System.in);
        int pincode = sc.nextInt();
        System.out.println("Enter Pincode");

        RestAssured.given().baseUri("https://api.postalpincode.in")
                .basePath("/in/" +pincode)
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }
}
