package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checkboxpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/checkbox");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		d.findElement(By.xpath("//*[@id=\"Ad.Plus-728x90\"]")).click();
		WebElement a=d.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li"));
		List<WebElement>b=a.findElements(By.tagName("li"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getAttribute("value")+" "+b.get(i).getAttribute("checked"));
		}
		
		

	}

}
