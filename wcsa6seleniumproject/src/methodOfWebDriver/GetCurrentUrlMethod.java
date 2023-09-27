package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod 
{
	public static void main(String[] args)
{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://desktop-79mfpos/login.do");
		
		 String urlOfLoginPage = driver.getCurrentUrl();
		 System.out.println(urlOfLoginPage);
}
}