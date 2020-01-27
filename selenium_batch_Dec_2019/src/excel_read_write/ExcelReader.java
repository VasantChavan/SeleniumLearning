package excel_read_write;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReader {

	@Test
	public void excelReader() {

		try {
			File fs = new File(".//TestData//testdata.xlsx");

			FileInputStream fins = new FileInputStream(fs);

			XSSFWorkbook workbook = new XSSFWorkbook(fins);

			// XSSFSheet sheet = workbook.getSheet("login");

			XSSFSheet sheet = workbook.getSheetAt(0);

			String row00 = sheet.getRow(0).getCell(0).getStringCellValue();
			String row01 = sheet.getRow(0).getCell(1).getStringCellValue();

			String row10 = sheet.getRow(1).getCell(0).getStringCellValue();
			String row11 = sheet.getRow(1).getCell(1).getStringCellValue();

			String row20 = sheet.getRow(2).getCell(0).getStringCellValue();
			String row21 = sheet.getRow(2).getCell(1).getStringCellValue();

			System.out.println(row00);
			System.out.println(row01);
			System.out.println(row10);
			System.out.println(row11);
			System.out.println(row20);
			System.out.println(row21);

		} catch (Exception e) {
			
		}
	}

}
