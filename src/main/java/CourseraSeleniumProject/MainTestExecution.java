package CourseraSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainTestExecution {
    WebDriver driver;


    public void openUrl(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");

    }

    public void getTitle(){
        String titleOfThePage= driver.getTitle();
        System.out.println(titleOfThePage);
    }

    public void closeBrowser(){
        driver.close();
        driver.quit();
    }

    public static void main(String[] args) {
        MainTestExecution mainTestExecution=new MainTestExecution();
        mainTestExecution.openUrl();
        mainTestExecution.getTitle();
        mainTestExecution.closeBrowser();
    }

}
