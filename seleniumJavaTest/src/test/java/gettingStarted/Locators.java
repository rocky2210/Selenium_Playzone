package gettingStarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://eaapp.somee.com");

//        driver.manage().window().fullscreen();

        // Click the login link
        // identify the login link using its ID
        By lnkLogin = By.linkText("Login");

        // 2. Pass this locator to webdriver which can help me do the operation on it
        WebElement element =  driver.findElement(lnkLogin);

        // 3. Perform operation on the UI - click in my case
         element.click();

        By txtUsername =  By.name("UserName");
        var txtUserNameElement = driver.findElement(txtUsername);

        txtUserNameElement.sendKeys("admin");
    }
}
