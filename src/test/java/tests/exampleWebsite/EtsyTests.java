package tests.exampleWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class EtsyTests {
    @Test
    public void etsyTest1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/?ref=lgo");
    }
    @Test
    public void etsyTest2() throws InterruptedException {
        System.out.println("test2 etsy");
        Thread.sleep(2000);
    }


}
