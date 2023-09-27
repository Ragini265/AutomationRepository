package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Abc/Desktop/WebElement/alertPopUp.html");
		
		//generate alert popup
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//handle alert popup by switching controls to alert
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		// al.accept(); 					// to accept the popup
		// al.dismiss();				    // to dismiss popup
		System.out.println(al.getText());
		al.accept();
		
		Thread.sleep(2000);
		driver.close();

	}

}
