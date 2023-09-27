package TestNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void method1() 
  {
	  //Reporter.log("Method-1");
	  Reporter.log("Method-1", true);
  }
  
  @Test
  public void method2()
  {
	  Reporter.log("Method-2", true);
  }
}
