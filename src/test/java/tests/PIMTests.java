package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CommonPage;
import pages.LoginPage;
import pages.PIMPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class PIMTests {
    LoginPage loginPage = new LoginPage();
    PIMPage pimPage = new PIMPage();
    WebDriver driver = Driver.getDriver();
    CommonPage commonPage = new CommonPage();
    @BeforeMethod
    public void  login(){
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.login("Admin", "admin123");
    }
    @Test
    public void verifyAdminCanCreateEmployee() throws InterruptedException {
        commonPage.PIMTab.click();;
        pimPage.addEmployee();
        String expectedName = pimPage.fName + " " + pimPage.lName;
        SeleniumUtils.verifyTextInElement(driver, 20, pimPage.fullName, expectedName);


        commonPage.PIMTab.click();
        WebElement idFromTable=
                driver.findElement(By.xpath("//div[text()='" + pimPage.employeeID + " ']"));
        WebElement firstNameFromTable=
                driver.findElement(By.xpath("//div[text()='" + pimPage.employeeID + " ']/../followinf-sibling:div[1]"));
        WebElement lastNameFromTable=
                driver.findElement(By.xpath("//div[text()='" + pimPage.employeeID + " ']/../followinf-sibling:div[2]"));
SeleniumUtils.verifyTextInElement(driver, 10, idFromTable, pimPage.employeeID);
SeleniumUtils.verifyTextInElement(driver, 10, firstNameFromTable, pimPage.fName);
SeleniumUtils.verifyTextInElement(driver, 10, lastNameFromTable, pimPage.lName);

//Assertions.assertEquals(idFromTable, pimPage.employeeID);
//Assertions.assertEquals(firstNameFromTable, pimPage.fName);
//Assertions.assertEquals(lastNameFromTable, pimPage.lName);







    }

}
