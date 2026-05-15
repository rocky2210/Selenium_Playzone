package gettingStarted;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args){
//        System.out.println("Hello world");

    // 1. Create a webdriver with chromeDriver object
    // 2. Launch browser
    WebDriver driver = new ChromeDriver();

    // 3. Navigate to a specific URL
    driver.navigate().to("https://google.com");

    }
}
