package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLaptopName_Price {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.name("q")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		//click on core i5
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i5']")).click();
		Thread.sleep(2000);
		//click on brand
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(2000);
		//click on hp
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
		Thread.sleep(2000);
		//click on operating system
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(2000);
		//click on windows 11
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 11']")).click();
		Thread.sleep(2000);
		//4★ & above
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='4★ & above']")).click();
		Thread.sleep(2000);
		
		//identify all suggestion of Laptop
		List<WebElement> allSuggestions = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		//identify all prices
		List<WebElement> allPriceSuggestions = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		
		//use looping statement to read list
		for(int i = 0 ; i < allSuggestions.size() ; i++ )
		{
			String namesOfLaptop = allSuggestions.get(i).getText();
			
			for(int j = i ; j <= i ; j++ )
			{
				String nameOfPrice = allPriceSuggestions.get(j).getText();
				System.out.print(namesOfLaptop+"   :  "+nameOfPrice);
				Thread.sleep(2000);
			}
			System.out.println();
		}
		Thread.sleep(2000);
		driver.quit();
		
	}
}
