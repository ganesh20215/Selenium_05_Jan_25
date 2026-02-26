package restapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutAPI {

    String token;

    @Test(priority = 1)
    public void verifyCreateToken(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/auth";

        JSONObject js = new JSONObject();
        js.put("username", "admin");
        js.put("password", "password123");

        Response response = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(js.toJSONString())
                .when()
                .log().all()
                .post()
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .assertThat()
                .extract().response();
        token = response.jsonPath().getString("token");
    }

    @Test(priority = 2, enabled = false)
    public void verifyPutAPI(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";

        JSONObject js = new JSONObject();
        JSONObject bd = new JSONObject();
        js.put("firstname", "Prabhat");
        js.put("lastname", "Vaishanav");
        js.put("totalprice", "121");
        js.put("depositpaid", true);
        js.put("bookingdates", bd);
        js.put("additionalneeds", "Breakfast");

        bd.put("checkin", "2018-01-01");
        bd.put("checkout", "2019-01-01");

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("Cookie", "token="+token)
                .header("Authorization", "Basic "+token)
                .header("Accept", "application/json")
                .body(js.toJSONString())
                .when()
                .log().all()
                .put("1824")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .body(
                        "firstname", Matchers.equalTo("Prabhat"),
                        "lastname", Matchers.equalTo("Vaishanav"));
    }

    @Test(priority = 3)
    public void verifyDeleteAPI(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";
        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .header("Cookie", "token="+token)
                .header("Authorization", "Basic "+token)
                .header("Accept", "application/json")
                .when()
                .log().all()
                .delete("322")
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_CREATED);
    }
}
