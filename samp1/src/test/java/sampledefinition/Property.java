package sampledefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

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

public class Property {
	WebDriver d;
	@Given("user is in newtours web application")
	public void user_is_in_newtours_web_application() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		
	}

	@When("user needs to enters username and password")
	public void user_needs_to_enters_username_and_password() throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\sweth\\eclipse-workspace\\samp1\\src\\test\\java\\Package\\P1.properties");
		Properties p1=new Properties();
		p1.load(f);
		d.findElement(By.name("userName")).sendKeys(p1.getProperty("uname"));
		d.findElement(By.name("password")).sendKeys(p1.getProperty("password"));
	    
	}

	@Then("user click on submit")
	public void user_click_on_submit() {
		d.findElement(By.name("submit")).click();
	    
	}

	@And("user takes screenshot and close the page")
	public void user_takes_screenshot_and_close_the_page() throws IOException {
	   File a=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	   Files.copy(a, new File("C:/Users/sweth/OneDrive/Pictures/b.png"));
	}
}
