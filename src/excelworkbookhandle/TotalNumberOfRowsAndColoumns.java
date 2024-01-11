package excelworkbookhandle;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TotalNumberOfRowsAndColoumns {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream("D:\\Software Testing//Eg1.xlsx");
        Workbook myWorkbook = WorkbookFactory.create(myFile);
        Sheet mySheet = myWorkbook.getSheet("sheet1");
        int TotalNoOfRows = mySheet.getLastRowNum();
        System.out.println(TotalNoOfRows);
     
	}

}
