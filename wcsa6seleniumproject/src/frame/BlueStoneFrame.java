package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		
		//this chat box is designed under frame
		//handle frame 1st by identifying it
		
		//driver.switchTo().frame(3);  			... By index value
		//driver.switchTo().frame("fc_widget");	... By id or name
		WebElement frameElement = driver.findElement(By.id("fc_widget"));
		driver.switchTo().frame(frameElement);
		
		WebElement chatBox = driver.findElement(By.id("chat-icon"));
		chatBox.click();
		//switch control to main page
		//driver.switchTo().defaultContent();
		
		//switch control to parent page
		driver.switchTo().parentFrame();
		
		driver.findElement(By.id("chat-fc-name")).sendKeys("asdfghjkl");
		driver.findElement(By.id("chat-fc-email")).sendKeys("qwertyuiop@gmail.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("123456789");
		

	}

}
