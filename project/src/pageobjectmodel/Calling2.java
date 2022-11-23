package pageobjectmodel;

import org.openqa.selenium.chrome.ChromeDriver;

public class Calling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("chromedriver.web.driver","C://webdriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://demo.guru99.com/test/newtours/register.php");
			POM2 p2=new POM2(d);
			p2.fname();
			p2.lname();
			p2.number();
			p2.email();
		}

	}


