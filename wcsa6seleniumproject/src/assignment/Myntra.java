package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.myntra.com/");
		String ph = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Shooes");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		Thread.sleep(3000);
		
		 driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
	 	Set<String> ch = driver.getWindowHandles();
		
		 
		 for( String allHandle : ch)
		 {
			 if(!ph.equals(allHandle))
			 {
				 driver.switchTo().window(allHandle);
			 }
		 }
		 
		driver.findElement(By.xpath("//p[@class='size-buttons-unified-size' and text()='6']")).click();
		driver.findElement(By.name("pincode")).sendKeys("411033");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		driver.findElement(By.xpath("//span[text()='Bag']")).click();
		
		driver.findElement(By.xpath("//div[@class='itemComponents-base-invisibleBackDrop']")).click();
		
		driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
		driver.findElement(By.xpath("//button[@class='inlinebuttonV2-base-actionButton ']")).click();
		
		driver.quit();
		
	}
}
