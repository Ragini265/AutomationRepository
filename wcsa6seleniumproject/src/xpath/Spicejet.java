package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-xb2eav r-majxgm r-q4m81j']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter airport code/city']")).sendKeys("pune");
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-xb2eav r-majxgm r-icoktb r-q4m81j']")).click();
		driver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-1yadl64 r-cqee49 r-1b43r93 r-1pi2tsx r-10paoce r-8zlnwy r-1k6034g']")).sendKeys("kochi");
	}
}
