import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {

    @DataProvider(name="checkLogin")
    public Object[][] dpMethod(){
        return new Object[][]{{"java"},{"python"}};
    }

    @Test(dataProvider = "checkLogin")
    public void myTest(String val){
        System.out.println("Passsed valesa are "+val);
    }
}
