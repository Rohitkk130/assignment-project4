package readingExcel_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel_File {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream(".\\test_data\\Book1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("pok");
		
		int rowcount = sheet.getLastRowNum();
		int columncount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Columncount : "+ columncount);
		System.out.println("Row Count : " + rowcount);
		
		for(int i=0; i<=rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			String firstname = row.getCell(1).toString();
			String lastname = row.getCell(2).toString();
			
			
			System.out.println("First Name : " +firstname);
			System.out.println("Last Name : " +lastname);
			System.out.println("=========================");
			
		}

	}

}
 