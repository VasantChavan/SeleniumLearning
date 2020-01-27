package excel_read_write;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	
	
	@DataProvider
	public Object[][] getData(){
		
		new ExcelDataProvider();
		
		Object[][] data = ExcelDataProvider.getExcelData(0);
	
		return data;
	}
	
	@Test(dataProvider="getData")
	public void excelData(String user, String pass, String mobile,
			String eid){
		System.out.println(user+"  "+pass+"  "+ mobile+"  "+eid);
	}

}
