package FormAutomation.pages;

import FormAutomation.pages.ConfirmationPage;
import FormAutomation.pages.FormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestForm {

    @Test
    public void submitTheForm() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        Thread.sleep(2000);
        FormPage formPage =new FormPage();
        formPage.submitForm(driver);
        ConfirmationPage confirmationPage=new ConfirmationPage();
        confirmationPage.waitForAlertBanner(driver);
        Assert.assertEquals(confirmationPage.getMsgFromAlertPage(driver),"The form was successfully submitted!");
        Thread.sleep(2000);

        driver.quit();

    }

}
