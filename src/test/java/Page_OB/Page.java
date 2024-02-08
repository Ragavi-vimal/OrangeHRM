package Page_OB;

import Base_s.Base_OB;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page extends Base_OB {
    WebDriver driver;
    public Page(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "username")
    private WebElement username;

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSubmit() {
        return Submit;
    }

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath ="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    private WebElement Submit;



}
