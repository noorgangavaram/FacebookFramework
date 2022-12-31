import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//THIS IS THE (Page Object) CLASS WHICH CONTAIN ALL METHOD DECLARATION ARE THERE
public class FacebookLoginPO extends BaseClass{
    WebDriver driver;
    By email = By.xpath("//input[@placeholder=\"Email address or phone number\"]");
    By password = By.xpath("//input[@id=\"pass\"]");
    By login_btn = By.xpath("//button[@type=\"submit\"]");

    //Constructor
    FacebookLoginPO(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    //Navigate to url
    public void navigatetoURL(){
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
    }
    public void setEmailId(String text){
        sendKeys(email,text);
    }

    public void setPassword(String pwd){
        sendKeys(password,pwd);
    }

    public void setLogin_btn(){
        click(login_btn);
    }
}
