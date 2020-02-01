package gmailRegistration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigData {

	public Properties prop;
	
	public ConfigData()
	{
		try {
			
			FileInputStream fins = new FileInputStream(new File(".//config//config.properties"));
			prop=new Properties();
			prop.load(fins);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
