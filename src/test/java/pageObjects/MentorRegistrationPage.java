package pageObjects;


import Hooks.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Hooks.BasePage;
import java.time.Duration;
import java.util.List;


public class MentorRegistrationPage{

    public WebDriver driver;
     public BasePage basePage;
    //public ElementUtil eleUtil;

    public MentorRegistrationPage(WebDriver driver) {

        this.driver = driver;


         basePage = new BasePage();
        //eleUtil = new ElementUtil(driver);



    }


    By signUpButton = By.xpath("//a[text()='Signup']");
    // By menteebutton= By.xpath("//a[@class='tu-primbtn tu-primbtn-gradient']");
    By welcomePageDisplayed = By.xpath("//h2[text()='Welcome!']");
    By firstName = By.xpath("//input[@type='text'][1]");
    By lastName = By.xpath("//input[@name='registration[lname]']");
    By emailAddress = By.xpath("//input[@name='registration[email]']");
    By password = By.id("tu-passwordinput");
    By mentorCheckbox = By.xpath("//label[@for='user_type_instructor']");
    By termsAndConditions = By.xpath("//label[@for='tu-terms']");
    By joinNow = By.xpath("//a[@class='tu-primbtn-lg tu-submit-registration']");
    //By myProfileTextDisplayed = By.xpath("//div//h4[text()='My Profile']");
    By myProfileTextDisplayed=By.cssSelector("div h4");
    By popUpMessageDisplayed = By.id("tuturn-modal-popup");
    By addValidEmailPopUpDisplayed = By.xpath("//div[@class='modal fade tuturn-profilepopup tu-uploadprofile tuturn-popup']");
    //By mentwwCheckbox = //label[@for='user_type_student']
    //By menteecheckbox = By.xpath("//div[@class='tu-check tu-radiosm']");




    public void Navigate(String url){
        driver.navigate().to(url);
    }

    public void ClickSignUpButton() {
        driver.findElement(signUpButton).click();
        //eleUtil.doClick(signUpButton);
    }

//   public void ClickMenteeButton()
//    {
//        eleUtil.doClick(menteebutton);
//    }

    public boolean VerifyWelcomePageDisplayed() {
        return driver.findElement(welcomePageDisplayed).isDisplayed();
        //return  eleUtil.doElementIsDisplayed(welcomePageDisplayed);
    }

    public void EnterFirstName(String fnametxt) {
        driver.findElement(firstName).sendKeys(fnametxt);
       // eleUtil.doSendKeys(firstName, fnametxt);
    }

    public void EnterLastName(String lnametxt) {
         driver.findElement(lastName).sendKeys(lnametxt);
        //eleUtil.doSendKeys(lastName, lnametxt);
    }

    public void EnterEmailAddress(String emailtxt) {
        driver.findElement(emailAddress).sendKeys(emailtxt);
       // eleUtil.doSendKeys(emailAddress, emailtxt);
    }

    public void EnterPassword(String passwordtxt) {
        driver.findElement(password).sendKeys(passwordtxt);
        //eleUtil.doSendKeys(password, passwordtxt);
    }


    public void ClickMentorRadioButton() {
       // List<WebElement> list= eleUtil.getElements(mentorCheckbox);
        List<WebElement> list = driver.findElements(mentorCheckbox);
        //driver.findElements(mentorCheckbox).click();

        for(WebElement e: list)
        {
            String text= e.getText();
            if(text.contains("Mentor"))
            {
                e.click();
            }


        }
        //} for each loop

    }
    //    public void ClickMenteeRadioButton() {
//        List<WebElement> list= eleUtil.getElements(menteecheckbox);
//        for(WebElement e: list)
//        {
//            String text= e.getText();
//            if(text.contains("Mentee"))
//            {
//                e.click();
//            }
//
//
//        }
//    }
    public void ClickTermsAndConditions() {
        driver.findElement(termsAndConditions).click();
        //eleUtil.doClick(termsAndConditions);
    }

    public void ClickJoinNow() {
        driver.findElement(joinNow);
        //eleUtil.doClick(joinNow);
    }

    public boolean VerifyMyProfileText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); //explicit wait
        return wait.until(ExpectedConditions.presenceOfElementLocated(myProfileTextDisplayed)).isDisplayed();
    }

    public boolean PopUpMessageDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(popUpMessageDisplayed);
        return true;

    }

    public boolean AddValidEmaillPopUpDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(addValidEmailPopUpDisplayed).isDisplayed();
        return true;
    }

}