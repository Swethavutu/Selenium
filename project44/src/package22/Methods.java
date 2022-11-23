package package22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	static WebDriver d;
	Methods(WebDriver d)
	{
		this.d=d;
	}
	public void opening_browser()
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		
		
	}
	public void navite()
	{
		d.manage().window().maximize();
		d.get("https://demo.guru99.com/test/newtours/");
	}
	public void User_Name()
	{
		d.findElement(By.name("userName")).sendKeys("swetha");
	}
	public void password()
	{
		d.findElement(By.name("password")).sendKeys("123");
	}
	public void click()
	{
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
	}
	

}
