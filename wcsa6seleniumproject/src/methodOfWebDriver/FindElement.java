package methodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://desktop-79mfpos/login.do");
			
			//identify username textbox and pass input as admin
			//to identify we use findelement method
		//	once web element is found it return webElement [i] and address of webelement
			WebElement usernameTextbox = driver.findElement(By.name("username"));
			usernameTextbox.sendKeys("admin");
			System.out.println(usernameTextbox);
		}
}
