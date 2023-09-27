package dropDownHandling;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate1 {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("file:///C:/Users/Abc/Desktop/WebElement/MultiSelectDropDown.html");
			
			WebElement dropDownElement = driver.findElement(By.name("menu"));
			//handle the dropdown
			Select sel = new Select(dropDownElement);
			//remove dupliacte from dropdown using treeset
			TreeSet<String> ts = new TreeSet<String>();
			//read the option from dropdown
			 List<WebElement> allops = sel.getOptions();
			 //read options
			 for(int i = 0 ; i<allops.size();i++)
			 {
				 String text = allops.get(i).getText();
				 ts.add(text);
			 }
			 Thread.sleep(4000);
			 
			 for( String opt : ts)
			 {
				 Thread.sleep(2000);
				 System.out.println(opt);
			 }
		}
}
