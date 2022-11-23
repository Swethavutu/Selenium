package Multipleclasses;

import org.testng.annotations.Test;

public class class2 extends class1{
  @Test(priority=4)
  public void payment_details() {
	  System.out.println("payment successfully done");
  }
  @Test(priority=5)
  public void delivery_process()
  {
	  System.out.println("delivered to customer") ; 
  }
}
