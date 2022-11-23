package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RIightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver d=new FirefoxDriver();
		d.get("https://www.google.com/");
        d.manage().window().maximize();
        WebElement link=d.findElement(By.linkText("Gmail"));
        Actions act=new Actions(d);
        act.contextClick(link).sendKeys("L").build().perform();
        
        
	}

}
