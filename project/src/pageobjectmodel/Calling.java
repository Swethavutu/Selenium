package pageobjectmodel;

import org.openqa.selenium.chrome.ChromeDriver;

public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		String baseurl="https://demo.guru99.com/test/newtours/";
		d.get(baseurl);
		d.manage().window().maximize();
		POM1 a1=new POM1(d);
		a1.uname();
		a1.pass();
		a1.submit();

	}

}
