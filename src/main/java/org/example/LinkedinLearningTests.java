package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

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

    @Test
    public void autoComlete() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement autocomplete= driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 park Blvd, Palo Alto, CA");
        Thread.sleep(4000);
        driver.quit();



    }
    @Test
    public void scrollElement() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/scroll");
        driver.manage().window().maximize();
        WebElement name= driver.findElement(By.id("name"));
        Thread.sleep(2000);
        Actions actions=new Actions(driver);
        actions.moveToElement(name);    //scroll till given element
        Thread.sleep(2000);
        name.sendKeys("Rupesh Sahu");
        WebElement date=driver.findElement(By.id("date"));
        date.sendKeys("20/11/1995");
        Thread.sleep(3000);
        driver.quit();



    }

    @Test
    public void switchToActiveWindow() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        Thread.sleep(2000);
        WebElement newtab=driver.findElement(By.id("new-tab-button"));
        newtab.click();
        Thread.sleep(2000);

        String originalHandle=driver.getWindowHandle();
        for(String handle:driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        Thread.sleep(2000);
        WebElement el=driver.findElement(By.xpath("/html/body/div/div/li[1]/a"));
        el.click();

        Thread.sleep(2000);
        driver.switchTo().window(originalHandle);
        Thread.sleep(2000);


        driver.quit();



    }

    @Test
    public void verifyAlert() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        Thread.sleep(2000);
        WebElement alertButton=driver.findElement(By.id("alert-button"));
        alertButton.click();
        Thread.sleep(2000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void javascriptExecute() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/modal");
        Thread.sleep(2000);
        WebElement modelButton= driver.findElement(By.id("modal-button"));
        modelButton.click();
        Thread.sleep(2000);
        WebElement closeButton= driver.findElement(By.id("close-button"));
        WebElement okButton= driver.findElement(By.id("ok-button"));
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[1 ].click()",okButton,closeButton);
        Thread.sleep(2000);


        driver.quit();
    }

    @Test
    public void dragAndDrop() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dragdrop");
        WebElement image=driver.findElement(By.cssSelector(".ui-widget-content.ui-draggable.ui-draggable-handle"));
        WebElement box =driver.findElement(By.cssSelector("#box"));
        Actions action= new Actions(driver);
        Thread.sleep(2000);
        action.dragAndDrop(image,box).build().perform();
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void radioButtons() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement radioButton1=driver.findElement(By.cssSelector("input[value='option1']"));
        radioButton1.click();
        Thread.sleep(2000);
        WebElement radioButton2=driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();
        Thread.sleep(2000);
        WebElement radioButton3=driver.findElement(By.cssSelector("input[value='option3']"));
        radioButton3.click();
        Thread.sleep(2000);

        driver.quit();
    }

    @Test
    public void checkBoxes() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/checkbox");
        WebElement checkbox1=driver.findElement(By.cssSelector("input[value='checkbox-1']"));
        checkbox1.click();
        Thread.sleep(2000);
        WebElement checkbox2=driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkbox2.click();
        Thread.sleep(2000);
        WebElement checkbox3=driver.findElement(By.cssSelector("input[value='checkbox-3']"));
        checkbox3.click();
        Thread.sleep(2000);

        driver.quit();
    }

    @Test
    public void datePicker() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/datepicker");
        WebElement datePicker=driver.findElement(By.cssSelector("input[id='datepicker']"));
        datePicker.sendKeys("11/20/1995");
        datePicker.sendKeys(Keys.RETURN);
      //  datePicker.click();


        Thread.sleep(2000);


        driver.quit();
    }

    @Test
    public void dropDown() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");
        WebElement dropDownMenu=driver.findElement(By.cssSelector("#dropdownMenuButton"));
        dropDownMenu.click();
        WebElement autocompleteItem= driver.findElement(By.id("autocomplete"));
        autocompleteItem.click();
        Thread.sleep(2000);


        driver.quit();
    }

    @Test
    public void fileUpload() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/fileupload");
        WebElement fileUploadFiled= driver.findElement(By.id("file-upload-field"));
        fileUploadFiled.sendKeys("C:\\Users\\Rupesh Sahu\\Desktop\\Capture.png");
        Thread.sleep(2000);


        driver.quit();
    }



}
