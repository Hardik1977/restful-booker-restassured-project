package com.restful.booker.crudtest;

import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteBooking extends TestBase {
    @Test
    public void deleteUser() {
        Response response = given()

                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 25ca1a089c44a8cdd5af742260f9798f7542e29fb6b1d79047813a04e6fa9188")
                .when()
                .delete("/users/2204");//need take other uder/id
        response.then().statusCode(204);
        response.prettyPrint();
    }
}
