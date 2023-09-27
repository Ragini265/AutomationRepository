package testNGAnnotations_Flags;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Flag7 {

	@Test(description = "Performs Login")
	public void loginMethod()
	{
		System.out.println("It is used to perform login!");
	}
	
	@Test(description = "Performs Create User",dependsOnMethods = "loginMethod")
	public void createUserMethod()
	{
		Assert.fail();
		System.out.println("User created!");
	}
	
	@Test(description = "Performs Logout",dependsOnMethods = "createUserMethod",alwaysRun = true)
	public void logoutMethod()
	{
		System.out.println("It is used to perform logout!");
	}
}
