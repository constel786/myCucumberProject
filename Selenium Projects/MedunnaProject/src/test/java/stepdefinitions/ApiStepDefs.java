package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static junit.framework.TestCase.assertEquals;
import static stepdefinitions.MedunnaRoomStepDefs.roomId;

public class ApiStepDefs {
    Response response;
    @Given("send get request to read room by id")
    public void send_get_request_to_read_room_by_id() {

    spec.pathParams("first", "api", "second", "rooms", "third", roomId);response = given(spec).get("{first}/{second}/{third}");
    response.prettyPrint();

    }
    @Then("validate body")
    public void validate_body() {

        String roomNumber = response.jsonPath().getString("roomNumber");
        String roomType = response.jsonPath().getString("roomType");
        String price = response.jsonPath().getString("price");
        String description = response.jsonPath().getString("description");

        assertEquals();
    }
}
