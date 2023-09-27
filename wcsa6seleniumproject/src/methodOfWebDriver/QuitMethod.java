package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	//it is used to close parent and child browser
	public static void main(String[] args) throws InterruptedException  {
		//parent browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//launch the web application
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		//launch the child browser
		//driver.findElement(By.xpath("//a[text()='open a popup window']")).click();
		
		//use the close method
		driver.close();
		
		//use the quit method for close all browser
		driver.quit();
	}
}
