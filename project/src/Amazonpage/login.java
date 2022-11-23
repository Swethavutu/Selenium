package Amazonpage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	ChromeDriver d;
  @BeforeTest
  public void opening_browser() {
	  System.setProperty("chromedriver.web.driver","C://webdriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_5ikydyrck9_e&adgrpid=58972567855&hvpone=&hvptwo=&hvadid=617721280453");
	  d.manage().window().maximize();
  }
  @Test(priority=1)
  public void gettitle()
  {
	  System.out.println(d.getTitle());
  }
 
}

