package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_IsDisplayed_IsEnabled_Submit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://desktop-79mfpos/login.do");
		driver.findElement(By.name("remember")).click();
		
		WebElement checkBox = driver.findElement(By.name("remember"));
		boolean result = checkBox.isSelected();
		System.out.println(result);
		
	 	boolean result1 = checkBox.isDisplayed();
	 	System.out.println(result1);
		
	 	driver.navigate().to("https://www.instagram.com/accounts/login/");
	 	driver.findElement(By.name("username")).sendKeys("qwerty0");
	 	driver.findElement(By.name("password")).sendKeys("asdfghj24");
	 	WebElement loginButton = driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']"));
	 	boolean result2 = loginButton.isEnabled();
	 	System.out.println(result2);
	 	
	 	loginButton.submit();

	}

}
