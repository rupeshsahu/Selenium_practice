import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkedinLearningTests {

    @Test
    public  void enterName() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/keypress");
        WebElement name=driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Rupesh Sahu");
        WebElement button=driver.findElement(By.id("button"));
        button.click();
        driver.quit();
    }


}
