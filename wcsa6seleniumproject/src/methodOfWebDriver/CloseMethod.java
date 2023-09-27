package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
  // It is used to close parent and child browser
	public static void main(String[] args) throws InterruptedException {
		//parent browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Launch the web application
		driver.get("https://omayo.blogspot.com");
		Thread.sleep(2000);
		
		//use the close method
		driver.close();
	}
}
