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
    driver.navigate().to("https://bing.com");

    // Set the screen to full screen
    driver.manage().window().fullscreen();

    // minimize the screen of the browser
    driver.manage().window().minimize();

    // Close the browser
//    driver.close();

    System.out.println("The URL on my Browser: "+ driver.getCurrentUrl());

    // Get the current page source
    String pageSource = driver.getPageSource();

    if(pageSource.contains("Search with Microsoft Bing and use the power of AI to find information, explore webpages, images, videos, maps, and more. A smart search engine for the forever curious.")){
        System.out.println("True");
    }else{
        System.out.println("False");
    }

    System.out.println("My browser current handle: "+ driver.getWindowHandle());

    }
}
