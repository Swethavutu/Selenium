package package22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class comparinglinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\sweth\\Downloads\\comparelinks.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(f);
			XSSFSheet ws=wb.getSheet("sheet1");
			Row r=null;
			Cell c=null;
			System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://demo.guru99.com/test/newtours/");
			d.manage().window().maximize();
			WebElement s=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
			List<WebElement>s1=s.findElements(By.tagName("a"));
			System.out.println(s1.size());
			for(int i=0;i<s1.size();i++) {
				System.out.println(s1.get(i).getText());
				r=ws.getRow(i);
				String expurl=r.getCell(1).getStringCellValue();
				
				s1.get(i).click();
				
				Thread.sleep(2000);
				String actualurl=d.getCurrentUrl();
				
				r=ws.createRow(i);
				r.createCell(2).setCellValue(actualurl);
				d.navigate().back();
				s=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
				s1=s.findElements(By.tagName("a"));
			
			
				
				//System.out.println(actualurl);
				
				if(expurl.equals(actualurl)) {
					r.createCell(3).setCellValue("pass");
				}
				else {
					r.createCell(3).setCellValue("fail");
				}
	          
			
			}
			FileOutputStream f1=new FileOutputStream("C:\\Users\\sweth\\Downloads\\comparelinks.xlsx");
			wb.write(f1);
			f1.close();
		
	

			
		}
		catch(Exception e)
		{
			System.out.print(e);
			
			
		
		}
	
}
}



	



