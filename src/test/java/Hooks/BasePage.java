package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;



public class BasePage {


    public static WebDriver driver;
    // public ElementUtil elementUtil;

    // public static ChromeOptions options;
    public BrowserDriver BDriver;


    @Before
    public void setup(){


        BDriver = new BrowserDriver();
      driver= BDriver.BrowserSetup("chrome");

    }

    @After
    public void TearDown(){
        //driver.close();
    }
}