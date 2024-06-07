package TestNGTestcases;

import org.testng.annotations.Test;

public class groupexample2 {
	

    @Test(groups = { "smoke", "regression" })
    public void testMethod1() {
        System.out.println("This is a smoke and regression test method.");
    }

    @Test(groups = { "regression" })
    public void testMethod2() {
        System.out.println("This is a regression test method.");
    }

    @Test(groups = { "smoke" })
    public void testMethod3() {
        System.out.println("This is a smoke test method.");
    }

    @Test(groups = { "performance" })
    public void testMethod4() {
        System.out.println("This is a performance test method.");
    }

}
