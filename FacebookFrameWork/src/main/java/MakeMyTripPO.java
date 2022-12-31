import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripPO {

    //WEBELEMENTS FOR from
    By fromcitydata = By.xpath("(//input[@type=\"text\"])[2]");
    By fromcitySelectCity = By.xpath("//p[text()=\"Bengaluru, India\"]");


    WebDriver driver;
    MakeMyTripPO(WebDriver driver){
        this.driver=driver;
    }

    //NAVIGATE TO THE MAKE MY TRIP URL
    public void navigateToMakeMyTrip(){
        driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
    }

    //CLICK From CITY TO ENTER DATA
    public void fromCity()  {
        driver.findElement(fromcitydata).sendKeys("Bangalore");
        WebElement select = driver.findElement(fromcitySelectCity);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click()",select);
    }

    //CLICK To CITY ENTER DATA
    //WEBELEMENTS FOR to
    By toCity = By.xpath("(//input[@type=\"text\"])[3]");
    By toSelectCity = By.xpath("//div[contains(text(),\"DEL\")]");
    public void toCity() {
       // driver.findElement(By.xpath("//input[@id=\"toCity\"]")).click();
        driver.findElement(toCity).sendKeys("Delhi");
        //select the option from the list Delhi
        WebElement selectCity = driver.findElement(toSelectCity);
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click()",selectCity);
    }

    //Select date 14
    By clickdate = By.xpath("//span[contains(text(),\"DEPARTURE\")]");
    By date = By.xpath("//div[@aria-label=\"Sat Jan 14 2023\"]");

    public void selectDate(){
        WebElement touchdate = driver.findElement(clickdate);
        JavascriptExecutor executor3 = (JavascriptExecutor) driver;
        executor3.executeScript("arguments[0].click()",touchdate);

        WebElement addDate = driver.findElement(date);
        JavascriptExecutor executor4 = (JavascriptExecutor) driver;
        executor4.executeScript("arguments[0].click()",addDate);
    }

    //Click the serch Button
    By btn = By.xpath("//a[contains(text(),\"Search\")]");
    public void SerchButton(){
        WebElement button = driver.findElement(btn);
        JavascriptExecutor executor6 = (JavascriptExecutor) driver;
        executor6.executeScript("arguments[0].click()",button);
    }
}
