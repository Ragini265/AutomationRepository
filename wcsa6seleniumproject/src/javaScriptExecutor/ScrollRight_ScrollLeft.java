package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollRight_ScrollLeft {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://dashboards.handmadeinteractive.com/jasonlove/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		for(int i = 0 ; i <= 1; i++)
		{
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(5000,0)");
		}

		Thread.sleep(4000);
		
		for(int i = 0 ; i <= 1; i++)
		{
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(-5000,0)");
		}
	}

}
