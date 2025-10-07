package com.sigitwahyudi.api.steps;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import com.sigitwahyudi.api.requests.DummyApiRequest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ApiUsersSteps {
    private Response response;

    @When("sistem mengirim request GET users dengan limit {int}")
    public void getUsers(int limit) {
        response = DummyApiRequest.getUsers(limit);
        response.prettyPrint();
    }

    @When("sistem mengirim request GET user dengan ID {string}")
    public void getUserById(String id) {
        response = DummyApiRequest.getUserById(id);
        response.prettyPrint();
    }

    @Then("status code yang diterima adalah {int}")
    public void verifyStatus(int status) {
        assertThat(response.statusCode(), equalTo(status));
    }

    @Then("status code yang diterima adalah {int} atau {int}")
    public void verifyStatusEither(int code1, int code2) {
        assertThat(response.statusCode(), anyOf(equalTo(code1), equalTo(code2)));
    }

    @Then("jumlah data user pada response adalah {int}")
    public void verifyUserCount(int count) {
        assertThat(response.jsonPath().getList("data"), hasSize(count));
    }

    @Then("setiap data memiliki ID yang valid")
    public void verifyIds() {
        assertThat(response.jsonPath().getString("data[0].id"), notNullValue());
    }

    @Then("response berisi ID yang sama {string}")
    public void verifyIdMatch(String id) {
        assertThat(response.jsonPath().getString("id"), equalTo(id));
    }

    @Then("response body berisi pesan error {string}")
    public void verifyError(String keyword) {
        assertThat(response.jsonPath().getString("error"), containsString(keyword));
    }
}
