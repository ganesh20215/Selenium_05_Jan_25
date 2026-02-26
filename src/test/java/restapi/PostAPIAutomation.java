package restapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PostAPIAutomation {

    @Test
    public void verifyPostAPI(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";
        JSONObject js = new JSONObject();
        JSONObject bd = new JSONObject();
        js.put("firstname", "Tanush");
        js.put("lastname", "Puri");
        js.put("totalprice", "121");
        js.put("depositpaid", true);
        js.put("bookingdates", bd);
        js.put("additionalneeds", "Breakfast");

 /*       JSONArray jr = new JSONArray();
        jr.add("checkin");
        jr.add("checkout");*/

        bd.put("checkin", "2018-01-01");
        bd.put("checkout", "2019-01-01");

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(js.toJSONString())
                .when()
                .log().all()
                .post()
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .body("bookingid", Matchers.notNullValue(),
                        "booking.firstname", Matchers.equalTo("Tanush"),
                        "booking.lastname", Matchers.equalTo("Puri"));
    }
}
