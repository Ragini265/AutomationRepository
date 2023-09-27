package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com");
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement target = driver.findElement(By.xpath("//a[text()='Rings ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		
		driver.findElement(By.xpath("//a[text()='Diamond']")).click();
		
		List<WebElement> defaultPrice = driver.findElements(By.xpath("//a[@class='link-overlay']"));
		for(int i = 0 ; i < defaultPrice.size() ; i++)
		{
			String dp = defaultPrice.get(i).getText();
			System.out.println(dp);
		}
		
		WebElement ele = driver.findElement(By.xpath("//span[text()=' Popular ']"));
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();
		
//		Select sel = new Select(ele);
//		sel.selectByIndex(3);
		System.out.println("-------------------");
		
		List<WebElement> sortedPrice = driver.findElements(By.xpath("//span[@class='b-price-wrapper']"));
		for(int i = 0 ; i < sortedPrice.size() ; i++)
		{
			String sp = sortedPrice.get(i).getText();
			System.out.println(sp);
		}
		
		

	}

}
