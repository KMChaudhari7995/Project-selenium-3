package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    static String browser = "Edge";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }

        driver.get(baseUrl);
        driver.manage().window().maximize(); //maximize the window
        System.out.println("Print title :" + driver.getTitle()); //print page title
        System.out.println("Print Current URL " + driver.getCurrentUrl());// Print Current Url
        System.out.println("Page Source: " + driver.getPageSource()); //Print Page Source
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); ////we give Implicit wait to driver
        driver.findElement(By.id("username")).sendKeys("KhushbuChaudhari"); //find UserNameID
        driver.findElement(By.name("password")).sendKeys("12345");//Find Password

        driver.close();//closing driver
    }

}
