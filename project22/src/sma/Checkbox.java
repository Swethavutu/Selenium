package sma;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        ChromeDriver d=new ChromeDriver();
        d.get("https://echoecho.com/htmlforms09.htm");
        d.manage().window().maximize();
        WebElement check=d.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
        List<WebElement>check1=check.findElements(By.tagName("input"));
        System.out.println(check1.size());
        for(int i=0;i<check1.size();i++)
        	System.out.println(check1.get(i).getAttribute("value")+" "+check1.get(i).getAttribute("checked"));
        
        
	}

}
