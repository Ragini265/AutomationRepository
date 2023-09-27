package methodOfWebDriver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			
			//switch the controls to active element
			driver.switchTo().activeElement().sendKeys("poha");
			Thread.sleep(2000);
			
			//identify all the suggestion of poha element
			  List<WebElement> pohaSuggestions = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
			  Thread.sleep(2000);
			  
			  //to print the list use the looping statement
			  for (int i = 0; i < pohaSuggestions.size() ; i++) 
			  {
				System.out.println(pohaSuggestions.get(i).getText());
				Thread.sleep(2000);
			  }
			  
			  for(WebElement poha :pohaSuggestions)
			  {
				  System.out.println(poha.getText());
			  }
			
		}
}
