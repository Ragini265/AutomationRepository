package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//using contains

public class Xpath3 {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("abcd",Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("pqrs");
			driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("123654789");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]")).sendKeys("qwerty");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//select[contains(@aria-label,'Day')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//option[contains(@value,'26')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//select[contains(@name,'birthday_month')]")).click();
			driver.findElement(By.xpath("//option[contains(text(),'May')]")).click();
			driver.findElement(By.xpath("//select[contains(@id,'year')]")).click();
			driver.findElement(By.xpath("//option[contains(@value,'1999')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
			driver.findElement(By.xpath("//button[contains(@name,'websubmit')]")).click();
			driver.close();
		}
}
