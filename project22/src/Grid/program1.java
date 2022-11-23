package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class program1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException  {
		// TODO Auto-generated method stub
		String nodeurl="http://localhost:4444/wd/hub";
		String baseurl="https://www.google.com";
		DesiredCapabilities cap=new DesiredCapabilities().chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		WebDriver d=new RemoteWebDriver(new URL(nodeurl),cap);
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        d=new ChromeDriver();
	    d.get(baseurl);
	    d.manage().window().maximize();
	    d.findElement(By.name("q")).sendKeys("mercury");
	    d.findElement(By.name("btnK")).click();
	    Thread.sleep(2000);
	    d.close();
	
	    
        
        
		
		
	

	}

}
