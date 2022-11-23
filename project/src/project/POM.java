package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM {
	WebDriver d;
	By username=By.id("email");
	By password=By.name("password");
	POM(WebDriver d)
	{
		this.d=d;
	}
	public void uname()
	{
		d.findElement(username).sendKeys("Admin");
	}
	public void password()
	{
		d.findElement(password).sendKeys("Admin");
	}

}
