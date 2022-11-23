package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
	WebDriver d;
	public void opening_browser()
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
	    d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
		
	}
	public void title()
	{
		String a=d.getTitle();
		System.out.println(a);
	}
	public void url()
	{
		String b=d.getCurrentUrl();
		System.out.println(b);
	}
	public void confirmation() throws InterruptedException {
		d.findElement(By.id("confirmButton")).click();
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		WebElement   text=d.findElement(By.id("confirmResult"));
		System.out.println(text.getText());
		
		
	}
	public void close()
	{
		d.close();
	}
		public static void main(String[] args) throws InterruptedException {
			
			// TODO Auto-generated method stub
			Alert2 a=new Alert2();
			a.opening_browser();
			a.title();
			a.confirmation();
			a.close();

}
}
