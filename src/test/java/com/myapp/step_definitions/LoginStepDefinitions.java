package com.myapp.step_definitions;

import io.cucumber.java.en.*;

public class LoginStepDefinitions {

    @Given("User is on the landing page")
    public void user_is_on_the_landing_page() {
        System.out.println(  "User is on the landing page");
    }


    @When("user enter credentials")
    public void user_enter_credentials() {
        System.out.println(  "user enter credentials");

    }
    @When("user clicks login button")
    public void user_clicks_login_button() {
        System.out.println(  "user clicks login button");

    }
    @Then("user suppose to see Welcome message")
    public void user_suppose_to_see_welcom_message() {
        System.out.println(  "user suppose to see Welcome message");

    }

}
