package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_GetSize_GetRect {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Point loginButton = driver.findElement(By.xpath("//button[text()=' Login ']")).getLocation();
		int xaxis = loginButton.getX();
		int yaxis = loginButton.getY();
		System.out.println("xaxis = "+xaxis+" "+"yaxis = "+yaxis);
		
		Dimension loginButtonSize = driver.findElement(By.xpath("//button[text()=' Login ']")).getSize();
		int height = loginButtonSize.getHeight();
		int width = loginButtonSize.getWidth();
		System.out.println("Height = "+height+" "+"Width = "+width);
		
		Rectangle loginButtonRect = driver.findElement(By.xpath("//button[text()=' Login ']")).getRect();
		int xaxisV = loginButtonRect.getX();
		int yaxisV = loginButtonRect.getY();
		int heightV = loginButtonRect.getHeight();
		int widthV = loginButtonRect.getWidth();
		System.out.println("xaxis = "+xaxisV+" "+"yaxis = "+yaxisV+" "+"Height = "+heightV+" "+"Width = "+widthV);
		
	}
	
}
