package Step;

import Base_s.Base_OB;
import Page_OB.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Step_Orange_Def extends Base_OB {

    WebDriver driver;

    Page Po ;

    @Given("Launch the Browser")
    public void launch_the_browser() {

        driver = Launch_Browser();

        Po = new Page(driver);

    }

    @Given("Enter the Url")
    public void enter_the_url() {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @When("User enters {string} and {string}")
    public void userEntersAnd(String Text1, String Text2) throws InterruptedException {
    Thread.sleep(2000);

    Textfield(Po.getUsername(),Text1);
    Textfield(Po.getPassword(),Text2);

    }



    @When("Click the Login Button")
    public void click_the_login_button() {

        Submit(Po.getSubmit());

    }

    @Then("Validate the Dashboard Error Message")
    public void validate_the_dashboard_error_message() {

        String Actual =  "Dashboard";

        WebElement Dash = driver.findElement(By.xpath("//*[text()='Dashboard']"));

        if (Actual.equals(Dash)){

            System.out.println("Passed");

        }else{

            System.out.println("Failed");
        }

        driver.close();






    }


    @Then("Validate the Dashboard Message")
    public void validateTheDashboardMessage() {
    }


}
