package TestNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  @Test
  public void method3() {
	  Reporter.log("Method-3", true);
  }
  
  @Test
  public void method4() 
  {
	  Reporter.log("Method-4", true);
  }
}
