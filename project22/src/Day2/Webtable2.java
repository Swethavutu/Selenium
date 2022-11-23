package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.timeanddate.com/worldclock/");
		d.manage().window().maximize();
		String a="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String b="]/td[";
		String c="]";
		for(int i=1;i<=35;i++)
		{
			for(int j=1;j<=2;j++)
			{
		      String e=d.findElement(By.xpath(a+i+b+j+c)).getText();
			   System.out.println(e);
			}
		}

	}

}
