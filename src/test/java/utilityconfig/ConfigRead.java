package utilityconfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigRead {
	
    Properties prop;

	public ConfigRead() throws Exception {
		
		
		FileInputStream fis = new FileInputStream("./config/configData.properties");
		prop = new Properties();
		prop.load(fis);
		
	}
	
    public String getappurl() {
    	
    	String appURL = prop.getProperty("appURL_QA");
    	return appURL;
    	
    }
    public String getdevurl() {
    	return prop.getProperty("appURL_Dev");
    }
    
    public String getusername() {
    	return prop.getProperty("adminUserName");
    }
    
    public String getpassword() {
    	return prop.getProperty("adminPassword");
    }
    

}
