package sma;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sunny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://www.google.com");
			d.manage().window().maximize();
			String a =d.getTitle();
			System.out.println(a);
			System.out.println(d.getCurrentUrl());
			//Thread.sleep(2000);
			d.close();

	}

}
