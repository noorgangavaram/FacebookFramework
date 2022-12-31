import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGparameters {
    //
    @Test
    @Parameters({"Noor","Mahin"})
    public void add(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }

    @Test
    @Parameters({"Noor","Mahin"})
    public void sub(int a,int b){
        int sub = a-b;
        System.out.println(sub);
    }

    //


}
