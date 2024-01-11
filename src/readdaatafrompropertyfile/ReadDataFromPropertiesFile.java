package readdaatafrompropertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException 
	{
		//Create Object Of Properties
		Properties prop=new Properties();
		
		//create object of fileinputstream
		FileInputStream myFile=new FileInputStream("C:\\Users\\sandh\\eclipse-workspace\\seleniumbasics\\Data.properties");
        prop.load(myFile);
       String value = prop.getProperty("name");
       System.out.println(value);
        
	}

}
