package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label*='username']")).sendKeys("ragini");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name$='word']")).sendKeys("125856");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type^='s']")).click();
	}
}
// $ - match only ending characters
//* - match any char
//^ - match starting char