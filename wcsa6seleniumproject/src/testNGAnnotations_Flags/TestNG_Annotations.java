package testNGAnnotations_Flags;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {
  @Test
  public void method_test_annotation() {
	  Reporter.log("TestAnnotation",true);
  }
  
  @BeforeMethod
  public void method_beforeMethod_annotation() 
  {
	  Reporter.log("BeforeMethodAnnotation",true);
  }
  
  @AfterMethod
  public void method_afterMethod_annotation()
  {
	  Reporter.log("AfterMethodAnnotation",true);
  }
  
  @BeforeClass
  public void method_beforeClass_annotation()
  {
	Reporter.log("BeforeClassAnnotation",true);  
  }
  
  @AfterClass
  public void method_afterClass_annotation() {
	  Reporter.log("AfterClassAnnotation",true);
  }
  
  @BeforeTest
  public void method_beforeTest_annotation()
  {
	  Reporter.log("BeforeTestAnnotation",true);
  }
  
  @AfterTest
  public void method_afterTest_annotation()
  {
	  Reporter.log("AfterTestAnnotation",true);
  }
  
  @BeforeSuite
  public void method_beforeSuite_annotation()
  {
	  Reporter.log("BeforeSuiteAnnotation",true);
  }
  
  @AfterSuite
  public void method_afterSuite_annotation()
  {
	  Reporter.log("AfterSuiteAnnotation",true);
  }
}
