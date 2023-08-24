package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static stepdefinitions.MedunnaRoomStepDefs.roomId;

public class ApiStepDefs {
    @Given("send get request to read room by id")
    public void send_get_request_to_read_room_by_id() {
     Response response = given()
             .header("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtYXJrX3R3YWluIiwiYXV0aCI6IlJPTEVfQURNSU4iLCJleHAiOjE2OTI5NjA1OTh9.wdvbha_BUoEHLZ54npLVntVTCuvAL40OuMs4tezkk8c3eTLoE4WxuOn5_JYVHVOW4_SOtM7vCUPXhy_uZD_91Q")
             .get("https://medunna.com/api/rooms/" + roomId);
     response.prettyPrint();

    }
    @Then("validate body")
    public void validate_body() {

    }

}
