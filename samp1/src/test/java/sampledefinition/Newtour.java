package sampledefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Newtour {
	WebDriver d;
	@Given("user in newtours application")
	public void user_in_newtours_application() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/register.php ");
	    d.manage().window().maximize();
	    Thread.sleep(2000);
	   
	}
	@When("user clicks on register window")
	public void user_clicks_on_register_window() {
	  d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	  
	}

	@Then("user select india from dropdown")
	public void user_select_india_from_dropdown() throws InterruptedException {
	   WebElement a=d.findElement(By.name("country"));
	   a.sendKeys("india");
	   Thread.sleep(2000);
	}

	@Given("user close the window")
	public void user_close_the_window() {
	   d.close();
	}
}
