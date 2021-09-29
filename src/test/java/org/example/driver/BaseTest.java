package org.example.driver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    public static WebDriver driver;

    @Before
    public  void setup(){

        try{
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/Driver/chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--disable-notifications");
            chromeOptions.addArguments("--disable-blink-features");
            chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
            chromeOptions.addArguments("--disable-gpu");
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("disable-infobars");
            chromeOptions.addArguments("disable-plugins");
            chromeOptions.addArguments("disable-popup-blocking");
            chromeOptions.addArguments("ignore-certificate-errors");
            chromeOptions.addArguments("disable-translate");
            chromeOptions.addArguments("disable-extensions");
            Map<String, Object> prefs = new HashMap<String, Object>();
             prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            chromeOptions.setExperimentalOption("prefs", prefs);
            chromeOptions.setExperimentalOption("w3c",false);
            chromeOptions.merge(capabilities);
            driver = new ChromeDriver(chromeOptions);
            driver.get("https://www.gittigidiyor.com/");
            Thread.sleep(1000);
            driver.manage().window().maximize();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @After
    public void quit(){
        if (driver!=null){
            driver.quit();
        }
    }
}
