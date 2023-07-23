package FormAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormPage {

    public void submitForm(WebDriver driver){
        driver.findElement(By.id("first-name")).sendKeys("Rupesh");
        driver.findElement(By.id("last-name")).sendKeys("Sahu");
        driver.findElement(By.cssSelector("#job-title")).sendKeys("Software Engineer in Test");
        driver.findElement(By.cssSelector("input[value='radio-button-2']")).click();
        driver.findElement(By.cssSelector("input[value='checkbox-1']"));
        driver.findElement(By.cssSelector("option[value='3']")).click();
        driver.findElement(By.cssSelector("#datepicker")).sendKeys("07/23/2023");
        driver.findElement(By.cssSelector("#datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }
}
