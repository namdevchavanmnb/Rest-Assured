package com.bridgelabz.swagger;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetCallBDDTest {
    @Test
    public void getPetDetails() {

        String body = given().
                when().
                get("https://petstore.swagger.io/v2/pet/102").asPrettyString();

        System.out.println("Body: " + body);
    }

    @Test
    public void getPetTest(){

        given().when().get("https://petstore.swagger.io/v2/pet/102").then().assertThat().statusCode(200);

        Response response = given().when().get("https://petstore.swagger.io/v2/pet/102");
        Assert.assertEquals(response.statusCode(),200);

        response.asPrettyString();
        response.getTime();
    }

    /*
     * given()
     * when()
     * then()
     * and()
     * */
}


