package sampledefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazonpage {
	WebDriver d;
	@Given("user is in amazon page")
	public void user_is_in_amazon_page() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://www.amazon.com/deals/?_encoding=UTF8&ref_=nav_cs_gb&pf_rd_r=SHYTWPESJSPGZ5009C7B&pf_rd_p=d3c6e9fa-31bd-4a65-bcf3-362762dc6bd8&pd_rd_r=a6002b0a-9e5d-4575-9bbc-77db6a0224ed&pd_rd_w=eQWb5&pd_rd_wg=SXMG3");
		d.manage().window().maximize();
	}

	@When("user captures the link and navigates back")
	public void user_captures_the_link_and_navigates_back() throws InterruptedException {
		WebElement a=d.findElement(By.id("nav-xshop"));
		List<WebElement>b=a.findElements(By.tagName("a"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());
			b.get(i).click();
			Thread.sleep(2000);
			d.navigate().back();
			d.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]/div")).click();
			a=d.findElement(By.id("nav-xshop"));
			b=a.findElements(By.tagName("a"));
		}
		
	    
	}

	@Then("get the title and url of the page")
	public void get_the_title_and_url_of_the_page() {
	    
	System.out.println(d.getTitle());
	System.out.println(d.getCurrentUrl());
	}

	@And("store them in excel sheet and capture the screenshot")
	public void store_them_in_excel_sheet_and_capture_the_screenshot() throws IOException {
		FileInputStream f=new FileInputStream("C:\\Users\\sweth\\Downloads\\amazoncucumber.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook(f);
	    XSSFSheet ws=wb.getSheet("Sheet1");
	    Row r=null;
	    Cell c=null;
	    r=ws.createRow(0);
	    r.createCell(0).setCellValue(d.getTitle());
	    FileOutputStream f1=new FileOutputStream("C:\\Users\\sweth\\Downloads\\amazoncucumber.xlsx");
	    wb.write(f1);
	    f1.close();
	}

	@And("close the browser")
	public void close_the_browser() {
		d.close();
	   
	}

}
