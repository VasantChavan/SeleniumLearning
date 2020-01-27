package excel_read_write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSX_Writer 
{
	
	public static void writeExcelData(){

		try
		{
		File fs = new File(".//TestData//testdata.xlsx");

		FileInputStream fins = new FileInputStream(fs);

		XSSFWorkbook workbook = new XSSFWorkbook(fins);
		
		XSSFSheet sheet = workbook.getSheet("login");
		
		System.out.println(sheet.getRow(0).getCell(0).
				getStringCellValue());

		sheet.getRow(0).createCell(4).setCellValue("status");
		sheet.getRow(1).createCell(4).setCellValue("pass");
		sheet.getRow(2).createCell(4).setCellValue("fail");
		sheet.getRow(3).createCell(4).setCellValue("pass");
		
		FileOutputStream fout = new FileOutputStream(fs);
		
		workbook.write(fout);
		
		workbook.close();
		
		fout.close();
		
		System.out.println("written sucuessfully...");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	public static void main(String[] args) {
		writeExcelData();
		
	}
}
