package FinalMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com");
		
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("fc_widget");
		
		driver.findElement(By.id("chat-icon")).click();
		
	}
}
