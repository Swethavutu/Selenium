package package22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calling {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		Methods m=new Methods(d);
		FileInputStream f=new FileInputStream("C:\\Users\\sweth\\Downloads\\keys.xlsx");
        XSSFWorkbook wb=new XSSFWorkbook(f);
        XSSFSheet ws=wb.getSheet("Sheet1");
        Row r=null;
		Cell c=null;
		Iterator<Row> row= ws.iterator();
		while(row.hasNext())
		{
			r=row.next();
			String action =r.getCell(2).getStringCellValue();
			if(action.equals("opening_browser"))
			{
				m.opening_browser();
			}
			else if(action.equals("navite"))
			{
				m.navite();
			}
			else if(action.equals("User_Name"))
			{
				m.User_Name();
			}
			else if(action.equals("password"))
			{
				m.password();
			}
			else 
			{
			m.click();
			Thread.sleep(2000);
			}
			
		}
	}

}
