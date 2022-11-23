package module1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class program2 {
  WebDriver d;
	  @BeforeMethod
	  public void openning_browser(){
		  System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		  d=new ChromeDriver();
		  d.get("https://www.amazon.com/");
		  d.manage().window().maximize();
	  }
	  @Test()
	  public void Title() {
		  System.out.println(d.getTitle());
	  }
	  @Test()
	  public void  CurrentUrl() {
		  System.out.println(d.getCurrentUrl());
	  }
	  @Test()
	  public void ScreenShot() throws IOException {
		  File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File("C:\\Users\\sweth\\OneDrive\\Pictures\\hell.png"));
	  }
	  @AfterMethod
	  public void close() {
		  d.close();
	  
  }
}
