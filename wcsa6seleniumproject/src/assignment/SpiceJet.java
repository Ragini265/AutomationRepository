package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJet {
	public static void main(String[] args) {
		//Handle notification
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		//identify depart
		driver.findElement(By.xpath("//div[contains(@class,'css-76zvg2 r-jwli3a r-xb2e') and (text()='DEL')]")).click();
		
	}
}

//driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over calanders everymundo ui-datepicker-current-day ui-datepicker-today']")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//input[@name='returnTo']")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//div[contains(@monthname,'Aug')]")).click();



//driver.findElement(By.xpath("//div[@class='month col-xs-2 col-sm-2 col-md-3 mon-aug active']")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//a[@class='ui-state-default' and (@data-date='9')]")).click();
//driver.findElement(By.id("returnCalendar")).click();
//Thread.sleep(2000);