package org.example.methods;

import org.example.driver.BaseTest;
import org.example.logger.Log;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class Methods {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    Log logger = new Log();

    public Methods(){

        this.driver = BaseTest.driver;
        this.wait = new WebDriverWait(driver, 30);
        js = (JavascriptExecutor) driver;
    }

    public WebElement findElement(By by){

        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement findElement2(By by){

        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void clickElement(By by){

        findElement(by).click();
        logger.info(by + " elementine tıklandı.");
    }

    public void sendKeys(By by, String text){

        findElement(by).sendKeys(text);
        logger.info(by + " elementine " + text + " texti yazıldı.");

    }
    public void clickElementJs(By by){

        js.executeScript("arguments[0].click();", findElement(by));
    }

    public void navigate(String url){

        driver.navigate().to(url);
        logger.info(url + " adresine gidildi.");
    }

    public boolean isElementVisible(By by){
        try
        {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        }
        catch (Exception e)
        {
            logger.error(by + " Elementi görünür değil!");
            return false;
        }
    }

    public void checkElementVisible(By by){

        assertTrue(isElementVisible(by));
    }

    public void navigateToBack(){

        driver.navigate().back();
    }

    public String getText(By by){

        return findElement(by).getText();
    }

    public void isEqualUrl(String url){

        String urlnet = driver.getCurrentUrl();
        Assert.assertEquals(urlnet, url);
    }

    public  void  hoverElement(By by){

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
        logger.info(by + "Elementine hover olundu");
    }

    public void selectByValue(By by,String value){
        Select objSelect = new Select(findElement(by));
        objSelect.selectByValue(value);

    }

    public void jsExecuteScript(String script, Object... obj ){

        js.executeScript(script,obj);

    }

}
