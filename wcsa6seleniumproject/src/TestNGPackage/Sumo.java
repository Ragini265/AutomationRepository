package TestNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void method5() {
	  Reporter.log("Method-5", true);
  }
  
  @Test
  public void method6() {
	  Reporter.log("Method-6", true);
  }
}
