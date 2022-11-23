package package22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Givinginput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("C:\\Users\\sweth\\OneDrive\\Documents\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("givinginput");
		Row r=null;
		Cell c=null;
		r=ws.createRow(2);
		r.createCell(1).setCellValue("manual testing");
		r=ws.createRow(3);
		r.createCell(2).setCellValue("qtp");
		r=ws.createRow(4);
		r.createCell(3).setCellValue("selenium");
		FileOutputStream f1=new FileOutputStream("C:\\Users\\sweth\\OneDrive\\Documents\\Book1.xlsx");
		wb.write(f1);
		f.close();

		
		
		

	}

}
