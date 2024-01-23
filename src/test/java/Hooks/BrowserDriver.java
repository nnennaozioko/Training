package Hooks;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriver {

    public static WebDriver driver;

//    public void BrowserDriver(WebDriver driver) {
//        BrowserDriver.driver = driver;
//    }
//    //public ElementUtil elementUtil;

    //public ChromeOptions options;

    public WebDriver BrowserSetup(String Browser){
        if(Browser.equalsIgnoreCase("FirefoxDriver")){
           System.setProperty("webdriver.firefox.driver","C:\\Users\\Nelly\\IdeaProjects\\TrainingProject\\src\\test\\resources\\driver\\geckodriver.exe");
           //WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        else if(Browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Nelly\\IdeaProjects\\TrainingProject\\src\\test\\resources\\driver/chromedriver.exe");
           //WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
      return driver;
    }

    public  void close(){
        driver.close();

    }

}