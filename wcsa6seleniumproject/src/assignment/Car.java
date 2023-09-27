package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Car {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("car");
		Thread.sleep(2000);
		
		List<WebElement> carSuggestions = driver.findElements(By.xpath("//li[@class='sbct sbre']"));
		Thread.sleep(2000);
		
		for(int i =0; i<carSuggestions.size();i++)
		{
			System.out.println(carSuggestions.get(i).getText());
			Thread.sleep(1000);
		}
		
	}
}
