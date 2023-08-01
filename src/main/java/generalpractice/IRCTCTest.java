package generalpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class IRCTCTest {
    @Test
    public void tatkalReservation() throws InterruptedException {

        ChromeOptions handleSSL=new ChromeOptions();
       /* ChromeOptions options=new ChromeOptions();
        DesiredCapabilities capabilities=DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        capabilities.setCapability(ChromeOptions.CAPABILITY,options);*/
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupesh Sahu\\IdeaProjects\\SeleniumFramwork\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(/*capabilities*/);
        driver.get("https://www.irctc.co.in/nget/train-search");
       // driver.findElement(By.linkText("LOGIN")).click();
        Actions actions=new Actions(driver);
        WebElement elementTohover=driver.findElement(By.xpath("//a[@class='launchAskDisha']"));
        actions.moveToElement(elementTohover).perform();
        elementTohover.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@decoding='async']")).click();
        Thread.sleep(2000);
        driver.quit();
        System.out.println("tst");
    }

    @Test
    public  void testQuitClose(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rupesh Sahu\\IdeaProjects\\SeleniumFramwork\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(/*capabilities*/);
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.close();
        System.out.println(driver.getTitle());


    }
}
