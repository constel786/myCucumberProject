package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static stepdefinitions.MedunnaRoomStepDefs.roomId;

public class ApiStepDefs {
    @Given("send get request to read room by id")
    public void send_get_request_to_read_room_by_id() {
     Response response = given(spec).get("/api/rooms/"+roomId);
     response.prettyPrint();

    }
    @Then("validate body")
    public void validate_body() {

    }
}
