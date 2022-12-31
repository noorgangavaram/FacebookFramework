import org.testng.annotations.Test;

public class testNGGroups {

    @Test(groups = "method1")
    public void method1(){
        System.out.println("Method1");
    }
    @Test(groups = "method2",dependsOnGroups = "method1")
    public void method2(){
        System.out.println("Method2");
    }
    @Test(groups = "method3")
    public void method3(){
        System.out.println("Method3");
    }
    @Test(groups = "method4")
    public void method4(){
        System.out.println("Method4");
    }
    @Test(groups = "method5")
    public void method5(){
        System.out.println("Method5");
    }
}
