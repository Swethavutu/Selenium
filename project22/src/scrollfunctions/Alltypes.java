package scrollfunctions;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alltypes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        ChromeDriver d=new ChromeDriver();
        d.get("https://demo.guru99.com/test/newtours/register.php");
        d.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor)d;
        js.executeScript("window.scrollBy(0,3000)"," ");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-2000)"," ");
        Thread.sleep(2000);	
        WebElement a=d.findElement(By.name("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));
        js.executeAsyncScript("arguments[0].scrollIntoView()",a);
        d.close();	
	}

}
