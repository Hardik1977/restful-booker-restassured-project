package com.restful.booker.crudtest;

import com.restful.booker.model.RestFulBookerPojo;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UpdateBooking {

    @Test
    public void verifyUserUpdateSuccessfully() {
        RestFulBookerPojo userPojo = new RestFulBookerPojo();
        userPojo.setFirstName("Saumil Patel");
        userPojo.setLastName("saumil@gmail.com");
        userPojo.setTotalPrice(350.99);
        userPojo.setDepositpaid(true);
        userPojo.setCheckIn("2023-05-24");
        userPojo.getCheckOut("2022-05-25");
        userPojo.setAdditionalNeeds("Full Board");

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 25ca1a089c44a8cdd5af742260f9798f7542e29fb6b1d79047813a04e6fa9188")
                .body(userPojo)
                .when()
                .put("/users/2204");
        response.then().statusCode(200);
        response.prettyPrint();
    }


}
