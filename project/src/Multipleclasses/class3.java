package Multipleclasses;

import org.testng.annotations.Test;

public class class3 extends class2{
  @Test(priority=6)
  public void feedback() {
	  System.out.println("feedback successfully collected from customer");
  }
  @Test(priority=7)
  public void close()
  {
	  System.out.println("window closed successully");
  }
}
