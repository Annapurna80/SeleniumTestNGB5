package tests.exampleWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTests {
    @Test
    public void AmazonTest1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }
    @Test
    public void amazonTest2() throws InterruptedException {
        System.out.println("test2 amazon");
        Thread.sleep(2000);
    }
    @Test
    public void amazonTest3() throws InterruptedException {
        System.out.println("test3 amazon");
        Thread.sleep(2000);
    }
}
