package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
	
	@Test(description = "Performs Login" , enabled = true)
	public void method1() {
		Reporter.log("Method1" , true);
	}
	
	@Test(description = "Performs Create User" , invocationCount = 1000)
	public void method2() {
		Reporter.log("Method2" , true);
	}
	
	@Test(description = "Performs Log Out")
	public void method3() {
		Reporter.log("Method3" , true);
	}
}