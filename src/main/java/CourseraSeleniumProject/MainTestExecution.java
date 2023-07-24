package CourseraSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainTestExecution {
    WebDriver driver;

    @Test
    public void openUrl(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");

    }

}
