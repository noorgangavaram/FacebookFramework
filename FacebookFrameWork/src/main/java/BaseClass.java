import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseClass {

    WebDriver driver;
    WebDriverWait driverWait;


    public  BaseClass(WebDriver driver){
        this.driver = driver;
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public void sendKeys(By locator,String text){
        driver.findElement(locator).sendKeys(text);
    }

    public boolean waitForVisibilityOfElement(By locator){
        driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        return true;
    }


}
