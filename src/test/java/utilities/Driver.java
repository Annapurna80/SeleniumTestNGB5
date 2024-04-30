package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Driver {
    static WebDriver driver;
    public static WebDriver getDriver(){

        //if driver exists then we just return it
        if(driver !=null){
            return driver;
        }
        String browser = Config.getProperty("browser");
        switch (browser){
            case "chrome":
                ChromeOptions options=new ChromeOptions();
                options.addArguments("disable-popup-blocking");

                // Use preferences to disable geolocation permission prompt
                Map<String, Object> prefs = new HashMap<String,Object>();
                prefs.put("profile.default_content_setting_values.geolocation", 2); // 2 means Block
                options.setExperimentalOption("prefs", prefs);

                driver=new ChromeDriver();
                break;
            case "safari":
                driver=new SafariDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
            default:
                driver=new ChromeDriver();

        }


        driver = new ChromeDriver();

        //these are implicit waits applied to the driver
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return driver;
    }
}
