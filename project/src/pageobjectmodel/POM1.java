package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM1 {

		WebDriver d;
		By username=By.name("userName");
		By password=By.name("password");
		By button=By.name("submit");
		POM1(WebDriver d)
		{
			this.d=d;
		}
		public void uname() {
			d.findElement(username).sendKeys("Admin");
					
		}
		public void pass() {
			d.findElement(password).sendKeys("Admin");
		}
		public void submit() {
			d.findElement(button).click();
					
		}
		
	}


