package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.SeleniumUtils;

public class PIMPage {
    public PIMPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css="button[class='oxd-button oxd-button--medium oxd-button--secondary']")
    public WebElement addButton;

    @FindBy(name = "firstName")
    public WebElement firstName;

    @FindBy(name = "lastName")
    public WebElement lastName;

    @FindBy(xpath = "//label[contains(text(),'Employee Id')]/../following-sibling::div/input")
    public WebElement nameID;

    @FindBy(css="button[type=submit]")
    public WebElement saveButton;

    @FindBy(css="h6[class='oxd-text oxd-text--h6 --strong']")
            public WebElement fullName;

    Faker faker = new Faker();
   public String fName = faker.name().firstName(); // give random first name
   public String lName = faker.name().lastName();
   public String employeeID = faker.number().digits(3);

    /**
     * This method adds employee with
     */
    public void addEmployee() throws InterruptedException {
        addButton.click();
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        SeleniumUtils.clearAndSendKeys(Driver.getDriver(), nameID, employeeID);

       saveButton.click();
       Thread.sleep(3000);

    }

    public WebElement firstElementFromTable;

}
