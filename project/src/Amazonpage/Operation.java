package Amazonpage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Operation extends login {
	 @Test(priority=2)
	  public void geturl()
	  {
		  System.out.println(d.getCurrentUrl());
	  }
	  
	 @Test(priority=3)
	 public void dropdownelements()
	 {
		 WebElement a=d.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		 List<WebElement>b=a.findElements(By.tagName("option"));
		 System.out.println(b.size());
		 for(int i=0;i<b.size();i++)
		 {
			 System.out.println(b.get(i).getText());
		 }
		 
		 
	 }
	 @Test(priority=4)
	 public void screenshot() throws IOException
	 {
		 File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(a1,new File("C:\\Users\\sweth\\OneDrive\\Pictures\\io.png" ));
	 }
}
