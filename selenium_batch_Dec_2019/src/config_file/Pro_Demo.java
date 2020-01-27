package config_file;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Pro_Demo 
{
	static Properties prop;
	
	public static void main(String[] args)
	{
		File fs=new File(".//Config//create.properties");
	
		try {
		
			FileInputStream fins = new FileInputStream(fs);
			prop=new Properties();
			prop.load(fins);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		String user=prop.getProperty("username");
		System.out.println("username is :"+ user);
		
		String pass=prop.getProperty("password");
		System.out.println("password is :"+ pass);

		String pass1=prop.getProperty("password1");
		System.out.println("pass is :"+ pass1);
	}
}