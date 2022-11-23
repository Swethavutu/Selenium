package sampledefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Alertindezlearn {
	WebDriver d;
	@Given("user is in dezlearn application")
	public void user_is_in_dezlearn_application() {
	    System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://www.dezlearn.com/javascript-alerts/");
	    d.manage().window().maximize();
	    
	}

	@When("user get the url and title of the page")
	public void user_get_the_url_and_title_of_the_page() {
	    System.out.println(d.getCurrentUrl());
	    System.out.println(d.getTitle());
	}

	@Then("user works on alert message")
	public void user_works_on_alert_message() throws InterruptedException {
	    d.findElement(By.id("s_alert1")).click();
	    Alert alt=d.switchTo().alert();
	    System.out.println(alt.getText());
	    Thread.sleep(2000);
	    alt.accept();
	   
	    
	}

	@And("user captures the screenshot and close window")
	public void user_captures_the_screenshot_and_close_window() throws IOException {
	  File a=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  Files.copy(a,new File("C:\\Users\\sweth\\OneDrive\\Pictures\\a1.png"));
	}

}
