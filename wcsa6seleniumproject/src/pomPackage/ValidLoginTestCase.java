package pomPackage;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// to open and close browser
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		//perform valid login operation
		//refer the web elements from Loginpage pom
		LoginPage lp = new LoginPage(driver);
		//read valid username and password
		Flib Flib = new Flib();
		
		lp.validLogin(Flib.readPropertyData(PROP_PATH,"Username"),Flib.readPropertyData(PROP_PATH, "Password"));
		
		Thread.sleep(2000);
		bt.closeBrowser();
		
		
	}

}
