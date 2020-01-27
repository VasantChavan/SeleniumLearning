package excel_read_write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	static XSSFWorkbook workbook;

	public ExcelDataProvider() {

		try {

			File fs = new File(".//TestData//testdata.xlsx");

			FileInputStream fins = new FileInputStream(fs);

			workbook = new XSSFWorkbook(fins);
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public static String getStringCellData(String sheetname,
			int row, int column) {
		return workbook.getSheet(sheetname).getRow(row).
				getCell(column).getStringCellValue();
	}

	public static String getStringCellData(int sheetIndex, 
			int row, int column) {
		return workbook.getSheetAt(sheetIndex).
				getRow(row).getCell(column).getStringCellValue();
	}

	public static int getNumericCellData(String sheetname, 
			int row, int column) {
		return (int) workbook.getSheet(sheetname).
				getRow(row).getCell(column).getNumericCellValue();
	}

	public static int getNumericCellData(int sheetIndex, 
			int row, int column) {
		return (int) workbook.getSheetAt(sheetIndex).
				getRow(row).getCell(column).getNumericCellValue();
	}

	public static Object[][] getExcelData(String sheetname) {

		XSSFSheet sheet = workbook.getSheet(sheetname);

		int rows = sheet.getLastRowNum();

		int cols = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows][cols];

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			}
		}

		return data;
	}

	public static Object[][] getExcelData(int sheetindex) {

		XSSFSheet sheet = workbook.getSheetAt(sheetindex);

		int rows = sheet.getLastRowNum();

		int cols = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows][cols];

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			}
		}

		return data;
	}

	}
