package testNgLearning;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestInTestNg {
	
	@Test(dataProvider="getData")	
	public void testdata(String s1, String s2, String s3){
				System.out.println(" s1 is :"+ s1 +" s2 is :"
	+s2+" s3 is  :"+s3);
	}
	
	@DataProvider
	public Object [][]  getData(){
		
		Object data [][] =new Object[2][3];
		
		data[0][0]="username";
		data[0][1]="password";
		data[0][2]="emailId";


		data[1][0]="vasant";
		data[1][1]="vasant@123";
		data[1][2]="vasant@gmail";

		return data;
		
	}
	@Test(dataProvider="testing")	
	public void testdata1(String s1, int s2, String s3){
				System.out.println(" s1 is :"+ s1 +" s2 is :"
	+s2+" s3 is  :"+s3);
	}
	
	@DataProvider(name="testing")
	public Object [][]  getData1(){
		
		Object data [][] =new Object[2][3];
		
		data[0][0]="vasant";
		data[0][1]=1234566543;
		data[0][2]="emailId";

		data[1][0]="vasant";
		data[1][1]=987654321;
		data[1][2]="vasant@gmail";

		return data;
		
	}
	
}
