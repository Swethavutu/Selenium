package inetrnalfiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readingdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	  FileInputStream f=new FileInputStream("C:\\Users\\sweth\\eclipse-workspace\\project\\src\\internalfiles\\sample.properties");
			  Properties p1=new Properties();
	          p1.load(f);
	  System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	   ChromeDriver d=new ChromeDriver();
	 //fetching url from property list using get property
	   d.get(p1.getProperty("url"));
	   d.manage().window().maximize();
	   //fetching user name from property list using get property 
	   d.findElement(By.name("userName")).sendKeys(p1.getProperty("user"));
       System.out.println(p1.getProperty("user"));
     //fetching password from property list using get property 
	   d.findElement(By.name("password")).sendKeys(p1.getProperty("pwd"));
       System.out.println(p1.getProperty("pwd"));
      d.findElement(By.name("submit")).click();
      
	}

}

