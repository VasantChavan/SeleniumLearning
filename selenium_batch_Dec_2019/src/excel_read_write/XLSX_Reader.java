package excel_read_write;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSX_Reader {

	static XSSFWorkbook workbook;

	static {
		try {

			File fs = new File(".//TestData//testdata.xlsx");

			FileInputStream fins = new FileInputStream(fs);

			workbook = new XSSFWorkbook(fins);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String readExcelData(int sheetIndex, int row,
			int column) {

		return workbook.getSheetAt(sheetIndex).getRow(row).
				getCell(column).getStringCellValue();
	}

	public static String readExcelData(String sheetname,
			int row, int column) {

		return  workbook.getSheet(sheetname).getRow(row).
				getCell(column).getStringCellValue();
	}
	public static void readExcelData(String sheetname) {

		XSSFSheet sheet = workbook.getSheet(sheetname);
		
		Iterator itr = sheet.iterator();
		
		while(itr.hasNext()){
			
			Row rowItr = (Row) itr.next();
			
			Iterator<Cell> cellItr = rowItr.cellIterator();
			
			while(cellItr.hasNext()){
				
				Cell cell = cellItr.next();

				switch(cell.getCellType()){
				
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue()+"  ");					
					break;
					
				case Cell.CELL_TYPE_BOOLEAN:
					System.out.print(cell.getBooleanCellValue()+"  ");					
					break;
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+"  ");					
					break;
				}			
			}
			System.out.println("  ");
		}
		
	}
	
	public static void main(String[] args) {
	
		readExcelData("login");
	}

}
