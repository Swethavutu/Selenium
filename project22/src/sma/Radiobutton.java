package sma;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://echoecho.com/htmlforms10.htm");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		WebElement a=d.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td"));
		List<WebElement>b=a.findElements(By.tagName("input"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++)
			System.out.println(b.get(i).getAttribute("checked")+" "+b.get(i).getAttribute("value"));

	}

}
