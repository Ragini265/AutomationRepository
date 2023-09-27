package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeModule {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://desktop-79mfpos/login.do");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		List<WebElement> Modules = driver.findElements(By.xpath("//div[@class='label']"));
		
		for(int i =0; i < Modules.size(); i++)
		{
			System.out.println(Modules.get(i).getText());
			Thread.sleep(1000);
		}
		
		//driver.quit();
	}
}
