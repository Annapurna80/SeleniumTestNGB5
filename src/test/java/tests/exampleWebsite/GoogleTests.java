package tests.exampleWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTests {
    @Test
    public void googleTest1(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwi09MKMp8eFAxVyj4kEHf_1DjwQPAgJ");
    }
    @Test
    public void googleTest2() throws InterruptedException {
        System.out.println("test2 google");
        Thread.sleep(2000);
    }
    @Test
    public void googleTest3() throws InterruptedException {
        System.out.println("test3 google");
        Thread.sleep(2000);
    }
}
