package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeDriver 
{
	public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver =  new EdgeDriver();
	
	Thread.sleep(2000);
	
	driver.close();
}
}
