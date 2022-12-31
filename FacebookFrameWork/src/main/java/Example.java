import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.checkerframework.checker.units.qual.Temperature;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        ExtentReports extent = new ExtentReports();

        ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\FacebookFrameWork\\Report");
        extent.attachReporter(spark);

    }
}

