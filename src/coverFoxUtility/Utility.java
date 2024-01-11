package coverFoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility 
{
	public static String ReadDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream("D:\\Software Testing\\CoverFox.xlsx");
	    Sheet mySheet = WorkbookFactory.create(myfile).getSheet("CoverFoxData");
	    String data = mySheet.getRow(row).getCell(cell).getStringCellValue();
	    return data;
	}
	
	public static void ScreenShot(WebDriver driver,String TCID) throws IOException
	{
		String timeStamp=  new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Software Testing\\Screenshot\\coverFox"+TCID+"_"+timeStamp+".png");
		FileHandler.copy(src, dest);
		Reporter.log("saved Screenshot at"+dest, true);
		
	}
	
	public static String ReadDataFromPropertiesFile(WebDriver driver,String Value) throws IOException
	{
		Properties prop=new Properties();
	    FileInputStream myfile=new FileInputStream(System.getProperty("user.dir")+"\\Data.Properties");
	    prop.load(myfile);
	    String value=prop.getProperty(Value);
	    return Value;
	}

}
