package com.bridgelabz.swagger;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetCallTest {
    @Test
    public void getPetTest(){
        Response response= RestAssured.get("https://petstore3.swagger.io/api/v3/pet/103");
        System.out.println("Body : "+response.asPrettyString());
        System.out.println("Time : "+response.getTime());
        System.out.println("Status code : "+response.statusCode());
        Assert.assertEquals(response.statusCode(),"200");

        JsonPath jsonPath =  response.getBody().jsonPath();

        System.out.println("Pet tags name: "+jsonPath.get("tags.name").toString());
    }
}

