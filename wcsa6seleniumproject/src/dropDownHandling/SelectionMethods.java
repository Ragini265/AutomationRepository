package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Abc/Desktop/WebElement/DropDown.html");
		WebElement dropDownElement = driver.findElement(By.id("i1"));
		
		Select sel = new Select(dropDownElement);
		Thread.sleep(2000);
		sel.selectByIndex(4);
		Thread.sleep(2000);
		sel.selectByVisibleText("Idli");
		Thread.sleep(2000);
		sel.selectByValue("v2");
		
		// Launch multiselected dropdownwebpage
		driver.navigate().to("file:///C:/Users/Abc/Desktop/WebElement/MultiSelectDropDown.html");
		WebElement dropDownEle = driver.findElement(By.id("i2"));
//		Select sel1 = new Select(dropDownEle);
		
//		for(int i = 0 ; i <= 4 ; i++)
//		{
//			Thread.sleep(2000);
//			sel1.selectByIndex(i);
//		}
		
//		select multiple option from dropDown By using 
//	      selectByValue();
	
	String [] array=  {"v1","v2","v3","v4","v5","v6","v7"} ;
	
	for(int i=0;i<array.length;i++)
	{
		
		Thread.sleep(2000);
		sel.selectByValue(array[i]);
	}

	}

}
