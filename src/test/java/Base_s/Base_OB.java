package Base_s;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_OB {
    static WebDriver driver;
    public static WebDriver Launch_Browser(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
          return driver;
    }

    public void OpenUrl(String url){

        driver.get(url);

    }

    public void Textfield(WebElement element ,String value){

        element.sendKeys(value);

    }

    public void Submit(WebElement element){

        element.click();

    }































}
