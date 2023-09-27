package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnRobotAndActions {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.selenium.dev/");
		
		WebElement gettingStarted = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
		//perform mouseHover on getting started
		
		Actions act = new Actions(driver);
		act.moveToElement(gettingStarted).perform();
		//perform right click
		act.contextClick(gettingStarted).perform();
		
		//pass control to inspect option
		
		//create obj for robot class
		
		Robot robot = new Robot();
		
		for(int i = 1 ; i <= 10 ; i++)
		{
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(2000);
		}
		//press enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
