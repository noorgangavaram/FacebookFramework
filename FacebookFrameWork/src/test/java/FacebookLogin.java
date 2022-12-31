import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//THIS IS THE LOGIN PAGE WHERE WE CAN CALL ALL THE METHODS PRESENT IN THE (Page Object) CLASS

public class FacebookLogin extends BaseTest {

    ExtentReports extent;
    @BeforeTest
    public void extentReport(){
         extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\FacebookFrameWork\\facebookReport.html");
        extent.attachReporter(spark);

    }

    public static String getScreenShot(WebDriver driver,String screenShotName) throws IOException {
        String dateName = new SimpleDateFormat("yyyymmdd").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = "C:\\Users\\ADMIN\\eclipse-workspace\\Learn_Java\\FacebookFrameWork\\ScreenShots"+screenShotName+dateName+".png";
        File filedestination = new File(destination);
        FileHandler.copy(source,filedestination);

        return destination;
    }



    @Test
    @Parameters({"emailid","pwd"})
    public void facebooklogin(String emailid,String pwd) throws IOException {

        getScreenShot(driver,"noor");

        ExtentTest test = extent.createTest("facebookLogin").log(Status.FAIL,"This test is not working");
        test.fail(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());

        FacebookLoginPO facebookLoginPO = new FacebookLoginPO(driver);

        facebookLoginPO.navigatetoURL();

        facebookLoginPO.setEmailId(emailid);

        facebookLoginPO.setPassword(pwd);

        facebookLoginPO.setLogin_btn();

    }

    @AfterTest
    public void methodFlush(){
        extent.flush();
    }


}
