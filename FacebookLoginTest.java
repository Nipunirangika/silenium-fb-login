import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookLoginTest {
    @Test
    public void fblogin () {
        // Set the path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "D:\\softwares\\intelij\\Driver\\chromedriver.exe");
        // Create a new Chrome WebDriver instance
        WebDriver driver = new ChromeDriver();
        // Open Facebook login page
        driver.get("https://www.facebook.com/login");
        // Find username and password field and enter username,password there
        driver.findElement(By.id("email")).sendKeys("0710633974");
        driver.findElement(By.id("pass")).sendKeys("0711869257");
        // Find login button and click it
        driver.findElement(By.name("login")).click();
        // Print current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        // Close the browser window
        //driver.quit();
    }}


