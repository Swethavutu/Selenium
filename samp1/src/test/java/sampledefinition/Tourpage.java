package sampledefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tourpage {
	WebDriver d;
	@Given("user is in newtours application")
	public void user_is_in_newtours_application() throws InterruptedException 
	{
	    System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/index.php");
	    d.manage().window().maximize();
	    Thread.sleep(2000);
	}
	@When("^user enters (.*)and (.*)$")
	public void user_needs_to_enter_username_and_password(String username,String password) throws InterruptedException
	{
		Thread.sleep(2000);
	   d.findElement(By.name("userName")).sendKeys(username);
	   d.findElement(By.name("password")).sendKeys(password);
	}

	@Then("user clicks signon Button")
	public void user_clicks_on_signon_window() throws InterruptedException
	{
		Thread.sleep(2000);
	   d.findElement(By.name("submit")).click();
	}

	@And("user navigate to home page")
	public void user_navigate_to_home_page() {
	   System.out.println("navigate to home");
	}


}
