package commonlyusedmethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonlyUsedMethods 
{
	//reading data from excel
	//taking screenshot
	//scrolling
	//waiting
	public static void takeScreenshot(WebDriver driver,String filename) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\Software Testing\\Screenshot\\"+filename+".png");
		FileHandler.copy(src, dest);
	}
	
	public static void implicitwait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	public static void scrollintoview(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		implicitwait(driver, 5);
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	public static String readDataFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myfile=new FileInputStream("D:\\Software Testing\\CoverFox.xlsx");
	    Sheet mySheet = WorkbookFactory.create(myfile).getSheet("CoverFoxData");
	    String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
	    return value;
	}
}
