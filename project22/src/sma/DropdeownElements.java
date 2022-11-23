package sma;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdeownElements {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        ChromeDriver d=new ChromeDriver();
        d.get("https://www.amazon.in/b/?_encoding=UTF8&node=27063338031&pf_rd_r=XBKPMK7WX7AZ6DKE4Z70&pf_rd_p=2723ecbd-91e0-4fb1-9740-39850db10603&pd_rd_r=359d3ab6-be2e-4aa2-8bad-590376442351&pd_rd_w=vvyEy&pd_rd_wg=6U9l0&ref_=pd_gw_unk");
        d.manage().window().maximize();
        System.out.println(d.getTitle());
        WebElement drop=d.findElement(By.id("searchDropdownBox"));
        List<WebElement>drop1=drop.findElements(By.tagName("option"));
        System.out.println(drop1.size());
        for(int i=0;i<drop1.size();i++)
        {
        	System.out.println(drop1.get(i).getText());
        }
        File a=((TakesScreenshot)d).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
        FileUtils.copyFile(a,new File("C:\\Users\\sweth\\OneDrive\\Pictures\\pic2.png"));    
        
        
        
        

	}

}


