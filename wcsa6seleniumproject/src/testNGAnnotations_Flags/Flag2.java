package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	
	@Test(description = "Performs Login" , enabled = true)
	public void method1() {
		Reporter.log("Method1" , true);
	}
	
	@Test(description = "Performs Create User" , enabled = false)
	public void method2() {
		Reporter.log("Method2" , true);
	}
	
	@Test(description = "Performs Log Out")
	public void method3() {
		Reporter.log("Method3" , true);
	}
}
