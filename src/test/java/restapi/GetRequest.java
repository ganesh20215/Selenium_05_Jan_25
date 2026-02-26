package restapi;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetRequest {


    @Test
    public void verifyGetAPI() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";
        SoftAssert sf = new SoftAssert();
        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .when()
                .log().all()
                .get("/1858")
                .then()
                .log().all()
                .statusCode(200)
                .extract().response();
        sf.assertEquals(response.getStatusCode(), 200);
        sf.assertEquals(response.jsonPath().getString("firstname"), "John");
        sf.assertEquals(response.jsonPath().getString("lastname"), "Smith");
        sf.assertAll();
    }
}
