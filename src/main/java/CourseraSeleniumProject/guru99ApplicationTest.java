package CourseraSeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class guru99ApplicationTest {

    WebDriver driver;
    String url="http://demo.guru99.com/v4";
    String driverPath="C:\\chromedriver\\chromedriver.exe";

    @BeforeClass
    public void openUrl(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

    }

    @Test(priority=0)
    public void verifytitleOfThePage(){
        String expectedTitle="Guru99 Bank Home Page";
        String actulTitle=driver.getTitle();
        Assert.assertEquals(actulTitle,expectedTitle);
    }

    @Test(priority = 1)
    public void login(){
        String username="mngr517229";
        String pwd="UvehEgY";
        driver.findElement(By.cssSelector("input[name='uid']")).sendKeys(username);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(pwd);
        driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
        String actulDynamicString=driver.findElement(By.cssSelector(".heading3")).getText();
        String exptectedString="Welcome To Manager's Page of Guru99 Bank";
        Assert.assertEquals(actulDynamicString,exptectedString);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test(priority = 3)
    public void verifydynamicHeading(){
        String actulDynamicString=driver.findElement(By.cssSelector(".heading3")).getText();
        String exptectedString="Welcome To Manager's Page of Guru99 Bank";
        Assert.assertEquals(actulDynamicString,exptectedString);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.quit();
    }



}
