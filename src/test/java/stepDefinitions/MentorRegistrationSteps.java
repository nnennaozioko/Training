package stepDefinitions;


import Hooks.BasePage;
import Hooks.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import pageObjects.MentorRegistrationPage;




public class MentorRegistrationSteps extends BrowserDriver {

    MentorRegistrationPage mrp = new MentorRegistrationPage(driver);

    @Given("I navigate to the website")
    public void iNavigateToTheWebsite() {
        mrp.Navigate("https://mentorskid.com");
        // BasePage.driver.navigate().to("https://mentorskid.com");
    }


    @When("I click sign up button")
    public void iClickJoinAsAMentor() {
        mrp.ClickSignUpButton();
    }

    @Then("welcome page displayed")
    public void welcomeItIsNiceToSeeYouDisplayed() {
        Assert.assertTrue(mrp.VerifyWelcomePageDisplayed(), "Welcome!");
    }

    @When("I enter first name {string}")
    public void iEnterFirstName(String fnametxt) {
        mrp.EnterFirstName(fnametxt);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String lnametxt) {
        mrp.EnterLastName(lnametxt);
    }

    @And("I enter the email {string}")
    public void iEnterTheEmail(String emailtxt) {
        mrp.EnterEmailAddress(emailtxt);
    }

    @And("I enter Password {string}")
    public void iEnterPassword(String passwordtxt) {
        mrp.EnterPassword(passwordtxt);
    }

    @And("I click mentor checkbox")
    public void iClickMentorCheckbox() {
        mrp.ClickMentorRadioButton();
    }

//    @And("I click mentee radio button")
//    public void iClickMenteeRadioButton() {
//        mrp.ClickMenteeRadioButton();
//    }


    @And("I click terms and condition")
    public void iClickTermsAndCondition() {
        mrp.ClickTermsAndConditions();
    }

    @And("I click join now")
    public void iClickJoinNow() {
        mrp.ClickJoinNow();
    }

    @Then("my profile page displayed")
    public void enrolledCoursesDisplayed() {

        Assert.assertTrue(mrp.VerifyMyProfileText());

    }

    @Then("the text {string}is displayed")
    public void theTextIsDisplayed( String  text) {
        Assert.assertTrue(mrp.PopUpMessageDisplayed(),text);


    }

    @Then("the text {string} is displayed")
    public void theTextDisplayed(String invalidtext) {
        Assert.assertTrue(mrp.AddValidEmaillPopUpDisplayed(), invalidtext);

    }



}