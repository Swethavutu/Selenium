package Multipleclasses;

import org.testng.annotations.Test;

public class class1 {
  @Test(priority=1)
  public void login() {
	  System.out.println("welcome to new tools");
  }
  @Test(priority=2)
  public void customerdetails()
  {
	  System.out.println("customer details");
  }
  @Test(priority=3)
  public void productdetails()
  {
	  System.out.println("productdetails");
  }
}
