package excelworkbookhandle;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceleg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream("D:\\Software Testing\\Eg1.xlsx");
        Workbook myWorkbook = WorkbookFactory.create(myFile);
        Sheet mySheet = myWorkbook.getSheet("Sheet2");
        //how to read whole row
        System.out.println("===========================================");
        for(int i=0;i<=4;i++)
        {
        	String row1 = mySheet.getRow(1).getCell(i).getStringCellValue();
        	System.out.print( row1 +" ");
        }
        System.out.println();
        System.out.println("===========================================");
        
        //how to read whole Coloumn
        for(int i=0;i<=1;i++)
        {
        	String coloumn1 = mySheet.getRow(i).getCell(0).getStringCellValue();
        	System.out.print(coloumn1 +" ");
        }
        System.out.println();
        System.out.println("===========================================");
	}

}
