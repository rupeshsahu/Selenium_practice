package CourseraSeleniumProject;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

public class guru99ApplicationTest {

    public static Logger logger;

      WebDriver driver;
    String url="http://demo.guru99.com/v4";
    String driverPath="C:\\chromedriver\\chromedriver.exe";



    @BeforeClass
    public void openUrl(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
         logger=Logger.getLogger(guru99ApplicationTest.class);


    }

    @Test(priority=0)
    public void verifytitleOfThePage(){
        String expectedTitle="Guru99 Bank Home Page";
        String actulTitle=driver.getTitle();
        Assert.assertEquals(actulTitle,expectedTitle);
    }

    @Test(priority = 1)
    public void login() throws IOException {
        try {
            String username = "mngr517229";
            String pwd = "UvehEgY";
            driver.findElement(By.cssSelector("input[name='uid']")).sendKeys(username);
            driver.findElement(By.cssSelector("input[name='password']")).sendKeys(pwd);
            driver.findElement(By.cssSelector("input[value='LOGIN']")).click();
            String actulDynamicString = driver.findElement(By.cssSelector(".heading3")).getText();
            String exptectedString = "Welcome To Manager's Page of Guru99 Bank";
            Assert.assertEquals(actulDynamicString, exptectedString);
            logger.info("test completed for log4j");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.quit();
        }
        catch(Exception e){
            logger.error(e+"this should be write in the logs");
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String destinationFilePath = "path_to_save_screenshot/screenshot.png";
            FileUtils.copyFile(screenshotFile, new File(destinationFilePath));






        }

    }

    @Test(priority = 3)
    public void verifydynamicHeading(){
        String actulDynamicString=driver.findElement(By.cssSelector(".heading3")).getText();
        String exptectedString="Welcome To Manager's Page of Guru99 Bank";
        Assert.assertEquals(actulDynamicString,exptectedString);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.quit();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();

    }



}
