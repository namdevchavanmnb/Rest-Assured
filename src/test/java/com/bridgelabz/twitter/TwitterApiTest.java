package com.bridgelabz.twitter;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class TwitterApiTest {
    /*
     *  Twitter API V1.1 :
     */

    @Test
    public void postTweetTest(){

        Response response = RestAssured.
                given().
                auth().
                oauth("s26I3PG1Ty6YbttW65nvCowQC",
                        "QE8RhpxM8URXNVf9eesk7Y7gYX9PPFqENsQe7Eb3WzXpAjrPR8",
                        "1651505801704656896-MVF9eYzrAccR0WYtZUkDjEl3GjsJHK",
                        "RmS6bR0b1tLkgJ1pzbMzjwcqB0VWDxt9Ppz5rESA5xSKB").
                post("https://api.twitter.com/1.1/statuses/update.json?status=Hello");

        System.out.println("Body : "+response.asPrettyString());
        System.out.println("status code : "+response.getStatusCode());
    }

    @Test
    public void retweetTest(){

        Response response = RestAssured.
                given().
                auth().
                oauth("s26I3PG1Ty6YbttW65nvCowQC",
                        "QE8RhpxM8URXNVf9eesk7Y7gYX9PPFqENsQe7Eb3WzXpAjrPR8",
                        "1651505801704656896-MVF9eYzrAccR0WYtZUkDjEl3GjsJHK",
                        "RmS6bR0b1tLkgJ1pzbMzjwcqB0VWDxt9Ppz5rESA5xSKB").
                post("https://api.twitter.com/1.1/statuses/retweet/1651807017374449665.json");

        System.out.println("Body : "+response.asPrettyString());
        System.out.println("status code : "+response.getStatusCode());
    }

    @Test
    public void UndoReTweetTest(){

        Response response= RestAssured.
                given().
                auth().
                oauth("s26I3PG1Ty6YbttW65nvCowQC",
                        "QE8RhpxM8URXNVf9eesk7Y7gYX9PPFqENsQe7Eb3WzXpAjrPR8",
                        "1651505801704656896-MVF9eYzrAccR0WYtZUkDjEl3GjsJHK",
                        "RmS6bR0b1tLkgJ1pzbMzjwcqB0VWDxt9Ppz5rESA5xSKB").
                post("https://api.twitter.com/1.1/statuses/unretweet/1651808988647014400.json");

        System.out.println("Body : "+response.asPrettyString());
        System.out.println("status code : "+response.getStatusCode());
    }

    @Test
    public void deleteTweetTest(){

        Response response= RestAssured.
                given().
                auth().
                oauth("s26I3PG1Ty6YbttW65nvCowQC",
                        "QE8RhpxM8URXNVf9eesk7Y7gYX9PPFqENsQe7Eb3WzXpAjrPR8",
                        "1651505801704656896-MVF9eYzrAccR0WYtZUkDjEl3GjsJHK",
                        "RmS6bR0b1tLkgJ1pzbMzjwcqB0VWDxt9Ppz5rESA5xSKB").
                post("https://api.twitter.com/1.1/statuses/destroy/1651807017374449665.json");

        System.out.println("Body : "+response.asPrettyString());
        System.out.println("status code : "+response.getStatusCode());
    }


}
