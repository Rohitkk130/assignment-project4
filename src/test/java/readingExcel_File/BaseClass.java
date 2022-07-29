package readingExcel_File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass  {
	
	 
	@Test
	public void read() throws Exception {
		
		FileInputStream fis = new FileInputStream(".\\test_data\\RegisterStudent.xls");
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheet("smokeTest");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println("Row count no : " + rowcount);
		System.out.println("Column count : " + colcount);
		
		for(int i=0; i<=rowcount; i++) {
			HSSFRow row = sheet.getRow(i);
			
			String FirstName = row.getCell(0).toString();
			String LastName = row.getCell(1).toString();
			String Email = row.getCell(2).toString();
			String Mob = row.getCell(3).toString();
			String add = row.getCell(4).toString();
			
			System.out.println("First Name : " + FirstName);
			System.out.println("Last Name : " + LastName);
			System.out.println("Email : " + Email);
			System.out.println("Mobile Number : " + Mob);
			System.out.println("Address : " + add);
			System.out.println("=================================");
	}

}}
