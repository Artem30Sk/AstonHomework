import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.MultiPartSpecification;
import org.example.Main;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPostmanRequest {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://postman-echo.com/";
    }

    @Test
    public void testGet() {
        Map<String, String> argsResult = new HashMap<>();
        argsResult.put("foo1", "bar1");
        argsResult.put("foo2", "bar2");
        Response response = given().contentType("application/json; charset=utf-8")
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("get")
                .then()
                .statusCode(200)
                .body("args", equalTo(argsResult))
                .extract().response();
        System.out.println(response.getBody().asString());
    }

    @Test
    public void testPostJsonData() {
        Map<String, Object> someData = new HashMap<>();
        someData.put("test", "val");
        given().contentType(ContentType.JSON)
                .body(someData)
                .when().post("post")
                .then().assertThat()
                .log().body()
                .body("data", equalTo(someData))
                .statusCode(200);
    }

    @Test
    public void testPostFormData() {
        Map<String, Object> someData = new HashMap<>();
        someData.put("test", "val");
        given().contentType("multipart/form-data")
                .multiPart("test", "val")
                .when().post("post")
                .then().assertThat()
                .log().body()
                .body("form", equalTo(someData))
                .statusCode(200);
    }

    @Test
    public void testPostFormUrlencoded() {
        Map<String, Object> someData = new HashMap<>();
        someData.put("test", "val");
        given().contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("test", "val")
                .when().post("post")
                .then().assertThat()
                .log().body()
                .body("form", equalTo(someData))
                .body("json", equalTo(someData))
                .statusCode(200);
    }

    @Test
    public void testPut() {
        Map<String, Object> someData = new HashMap<>();
        someData.put("test", "val");
        given().contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("test", "val")
                .when().put("put")
                .then().assertThat()
                .log().body()
                .body("form", equalTo(someData))
                .body("json", equalTo(someData))
                .statusCode(200);
    }

    @Test
    public void testPatch() {
        Map<String, Object> someData = new HashMap<>();
        someData.put("test", "val");
        given().contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("test", "val")
                .when().patch("patch")
                .then().assertThat()
                .log().body()
                .body("form", equalTo(someData))
                .body("json", equalTo(someData))
                .statusCode(200);
    }

    @Test
    public void testDelete() {
        Map<String, Object> someData = new HashMap<>();
        someData.put("test", "val");
        given().contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("test", "val")
                .when().delete("delete")
                .then().assertThat()
                .log().body()
                .body("form", equalTo(someData))
                .body("json", equalTo(someData))
                .statusCode(200);
    }
}
