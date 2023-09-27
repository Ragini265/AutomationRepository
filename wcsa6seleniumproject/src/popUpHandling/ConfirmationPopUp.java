package popUpHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Abc/Desktop/WebElement/ConfirmationPopUp.html");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		
		// al.accept(); 		// accepts confirmation popup
		// al.dismiss();		// dismiss confirmation popup
		
		System.out.println(al.getText());
		al.accept();
		
		driver.close();

	}

}
