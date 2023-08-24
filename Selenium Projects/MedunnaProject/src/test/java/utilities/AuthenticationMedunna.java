package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AuthenticationMedunna {
    public static String generateToken() {
        String body = "{ \"password\": \"Mark.123\", \"username\": \"mark_twain\" }";

        Response response = given()
                .contentType(ContentType.JSON).body(body)
                .post("https://medunna.com/api/authenticate");

        //response.prettyPrint(); //Commented out since we have the return of response below

        return response.jsonPath().getString("id_token");
    }
}