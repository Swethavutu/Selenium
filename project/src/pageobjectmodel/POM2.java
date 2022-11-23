package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM2
{
	WebDriver d;
	By fname=By.name("firstName");
	By lname=By.name("lastName"); 
	By phonenum=By.name("phone");
	By emailid=By.name("userName");
	POM2(WebDriver d)
	{
		this.d=d;
	}
	public void fname()
	{
		d.findElement(fname).sendKeys("swetha");
	}
	public void lname()
	{
		d.findElement(lname).sendKeys("123");
	}
	public void number()
	{
		d.findElement(phonenum).sendKeys("8989378399");
	}
	public void email()
	{
		d.findElement(emailid).sendKeys("swetha@123.com");
	}
	
}


