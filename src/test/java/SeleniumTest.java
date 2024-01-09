import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    @Test
    public void firstTest()
    {
        //Telling the system where to find chromedriver. On Windows we can add .exe
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        //Instantiate the driver
        WebDriver driver = new ChromeDriver();

        //Goto the url
        driver.get("https://www.saucedemo.com/");
        //Finding username elements
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //Finding password elements
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        //Finding Login elements
        driver.findElement(By.id("login-button")).click();
        driver.quit();
    }
}


//this is a change in master

