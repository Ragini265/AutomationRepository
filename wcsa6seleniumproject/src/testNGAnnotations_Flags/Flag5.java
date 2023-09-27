package testNGAnnotations_Flags;

import org.testng.annotations.Test;

public class Flag5 {
 
	@Test(description = "Performs Login")
	public void loginMethod()
	{
		System.out.println("It is used to perform login!");
	}
	
	@Test(description = "Performs Create User",dependsOnMethods = "loginMethod")
	public void createUserMethod()
	{
		System.out.println("User created!");
	}
	
	@Test(description = "Performs Logout",dependsOnMethods = "createUserMethod")
	public void logoutMethod()
	{
		System.out.println("It is used to perform logout!");
	}
}
