package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectionMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/Abc/Desktop/WebElement/MultiSelectDropDown.html");
		
		WebElement dropDownEle = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDownEle);
		
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.deselectByIndex(3);
		
		//select multiple option
		for(int i = 0; i<=3;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
			
		for(int i = 0; i<=3;i++)
		{
			Thread.sleep(2000);
			sel.deselectByIndex(i);
		}
		
		//selectByvalue()
		String [] arr = {"v1" , "v2" , "v3", "v4"};
		for(int i=0; i<arr.length;i++)
		{
			Thread.sleep(2000);
			sel.selectByValue(arr[i]);
		}
		
		Thread.sleep(4000);
		//deselect by value
		for(int i =0;i<arr.length;i++)
		{
			Thread.sleep(2000);
			sel.deselectByValue(arr[i]);
		}
		
		//select the option from multipledropdown by using 
		//selectByvisibletext()
		sel.selectByVisibleText("Gulab Jamun");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Gulab Jamun");
		sel.deselectAll();
		
		for(int i=0;i<3;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		Thread.sleep(2000);
		sel.deselectAll();
		
	}
}
