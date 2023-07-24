package StructuredWayTowritePages.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPage {

    public void waitForAlertBanner(WebDriver driver){
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));

    }

    public String getMsgFromAlertPage(WebDriver driver){
             String msg=driver.findElement(By.cssSelector(".alert.alert-success")).getText();
        return msg;

    }
}
