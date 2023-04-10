package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    static String baseUrl = " http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver(); //launch the url into browser
        driver.get(baseUrl);//open the link into Chrome browser
        driver.manage().window().maximize(); //maximize the window

        System.out.println("Print Title: " + driver.getTitle()); //print the title
        System.out.println("Print Current Url: " + driver.getCurrentUrl());//Print current url
        System.out.println("Page Source :" + driver.getPageSource());//Print page source
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); ////we give Implicit wait to driver
        driver.findElement(By.id("username")).sendKeys("KhushbuChaudhari");//find email id
        driver.findElement(By.name("password")).sendKeys("12345");//find password

        driver.close(); //driver close
    }
}

