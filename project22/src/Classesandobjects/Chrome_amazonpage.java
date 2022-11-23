package Classesandobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_amazonpage {
    WebDriver d;
	public void Open_chrome()
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	    d=new ChromeDriver();
		d.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_6vkm4swd5x_b&adgrpid=60611463244&hvpone=&hvptwo=&hvadid=617724335923&hvpos=&hvnetw=g&hvrand=8608413882692531579&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302457&hvtargid=kwd-320833120261&hydadcr=15413_2322997&gclid=Cj0KCQjwk5ibBhDqARIsACzmgLSgSABmGt1ywy27_aIOwoR_LnFBU8j5QaLXBr-cS5CI-h8mWt3pSuoaAhCsEALw_wcB");
		d.manage().window().maximize();
		
	}
	public void get_title()
	{
		System.out.println(d.getTitle());
	}
	public void get_current_url()
	{
		System.out.println(d.getCurrentUrl());
	}
	public void drop()
	{
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement>b=a.findElements(By.tagName("option"));
		System.out.println(b.size());
		for(int i=1;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());
			
		}
		
	}
	public void close()
	{
		d.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome_amazonpage ca=new Chrome_amazonpage();
		ca.Open_chrome();
		ca.get_title();
		ca.get_current_url();
		ca.drop();
		ca.close();
        
	}

}
