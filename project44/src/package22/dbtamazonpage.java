package package22;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dbtamazonpage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("C:\\Users\\sweth\\OneDrive\\Documents\\dbt1-amazonpage.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(f);
        XSSFSheet ws=wb.getSheet("Sheet1");
        Row r=null;
        Cell c=null;
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        ChromeDriver d=new ChromeDriver();
        d.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_6vkm4swd5x_b&adgrpid=60611463244&hvpone=&hvptwo=&hvadid=617724335923&hvpos=&hvnetw=g&hvrand=15150576061584230418&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302457&hvtargid=kwd-320833120261&hydadcr=15413_2322997&gclid=Cj0KCQiAmaibBhCAARIsAKUlaKRy3JyUJvlFbsS6q5JolezG0M4PCFOndfDFZ_FXN4F16L_3fFjB1RgaAvL-EALw_wcB");
        d.manage().window().maximize();
        WebElement a=d.findElement(By.id("searchDropdownBox"));
        List<WebElement>drop=a.findElements(By.tagName("option"));
        System.out.println(drop.size());
        for(int i=0;i<drop.size();i++)
        {
        	System.out.println(drop.get(i).getText());
        	r=ws.createRow(i);
        	r.createCell(0).setCellValue(drop.get(i).getText());
        	drop.get(i).click();
        	if(!drop.get(i).isSelected())
        	{
        		r.createCell(1).setCellValue("fail");
        		
        	}
        	else
        	{
        		r.createCell(1).setCellValue("pass");	
        	}
        	FileOutputStream f1=new FileOutputStream("C:\\Users\\sweth\\OneDrive\\Documents\\dbt1-amazonpage.xlsx");
        	wb.write(f1);
        	f1.close();
        }
        
        
        
	}

}
