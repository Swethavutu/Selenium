package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				FileInputStream f=new FileInputStream("C:\\Users\\sweth\\eclipse-workspace\\project\\src\\project\\p.properties");
		
				Properties p=new Properties();
				p.load(f);
				System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		        ChromeDriver d=new ChromeDriver();
		        d.get("https://demo.guru99.com/test/newtours/");
		        d.manage().window().maximize();
		        d.findElement(By.name("userName")).sendKeys(p.getProperty("uname"));
		        System.out.println(p.getProperty("uname"));
		        d.findElement(By.name("password")).sendKeys(p.getProperty("pwd"));
		        System.out.println(p.getProperty("pwd"));
		        d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		        POM a=new POM(d);
		        a.uname();
		        a.password();
		        File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		        FileUtils.copyFile(a1,new File("C:\\Users\\sweth\\OneDrive\\Pictures\\a2.png"));
		        WebElement drop=d.findElement(By.name("country"));
		        List<WebElement>drop1=drop.findElements(By.tagName("option"));
		        System.out.println(drop1.size());
		        for(int i=0;i<drop1.size();i++)
		        {
		        	System.out.println(drop1.get(i).getText());
		        	
		        }
		        
		        


	}
	}


