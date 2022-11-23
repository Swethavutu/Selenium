package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://Chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.xpath("//input[@id='userName']")).sendKeys("swetha");
		d.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("swethareddy@gmail.com");
		d.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("musnur");
		d.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]")).sendKeys("vavilla");
		WebElement a=d.findElement(By.id("submit"));
		a.click();
		String s=d.findElement(By.xpath("//*[@id=\"output\"]")).getText();
		System.out.println(s);
		d.close();
		
		
		
	

	}
}


