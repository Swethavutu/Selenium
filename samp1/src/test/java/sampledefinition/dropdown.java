package sampledefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dropdown {
	WebDriver d;
	@Given("user is in newtors application")
	public void user_is_in_newtors_application() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/ ");
	    d.manage().window().maximize();
	    Thread.sleep(2000);
	}

	@When("user clicks on register page")
	public void user_clicks_on_register_page() {
	   d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	}

	@Then("user need to get the dropdown elements")
	public void user_need_to_get_the_dropdown_elements() {
	    WebElement a=d.findElement(By.name("country"));
	    List<WebElement>b=a.findElements(By.tagName("option"));
	    System.out.println(b.size());
	    for(int i=0;i<b.size();i++)
	    {
	    	System.out.println(b.get(i).getText());
	    }
	}

	@And("user navigate to home page and close the page")
	public void user_navigate_to_home_page_and_close_the_page() {
		d.navigate().back();
		d.close();
	}

}
