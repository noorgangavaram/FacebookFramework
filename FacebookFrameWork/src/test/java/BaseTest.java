import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

//THIS IS THE (BASE TEST)COMMON CLASS WHICH CONTAIN THE NORMAL METHODS FOR EVERY TEST CASES

public class BaseTest {
    //it is commann class for each testcsase
    /*
    1.opening the browser
    2.closing yhe browser
     */
    WebDriver driver;
    @BeforeTest
    public void openbrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void closebrowser(){
        driver.close();
    }
}
