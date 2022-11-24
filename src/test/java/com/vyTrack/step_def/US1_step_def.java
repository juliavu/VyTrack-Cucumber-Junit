package com.vyTrack.step_def;

import com.vyTrack.pages.BasePage;
import com.vyTrack.pages.US1_page;
import com.vyTrack.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US1_step_def{

US1_page us1_page = new US1_page();
        @Given("User is on the VyTrack home page")
        public void userIsOnTheVyTrackHomePage() {
                Driver.getDriver().get("https://qa2.vytrack.com/user/login");
        }

        @When("User enters {string} and {string}")
        public void userEntersAnd(String validUserName) {
                us1_page.userName.sendKeys(validUserName);
        }
        @And("User enters {string}")
        public void userEnters(String validPassword) {
                us1_page.passWord.sendKeys(validPassword);
        }
        @And("User clicks on Log In button")
        public void userClicksOnLogInButton() {
                us1_page.logInBtn.click();
        }

        @And("user waits for loading bar disappear")
        public void userWaitsForLoadingBarDisappear() {
        }

        @Then("User should see the home page")
        public void userShouldSeeTheHomePage() {
        }

        @And("User should see {int} modules on the main page")
        public void userShouldSeeModulesOnTheMainPage(int arg0) {
        }

        @Then("User should see the main page")
        public void userShouldSeeTheMainPage() {
        }


}

