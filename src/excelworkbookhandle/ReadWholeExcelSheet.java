package excelworkbookhandle;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWholeExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream("D:\\Software Testing\\Eg1.xlsx");
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		Sheet mySheet = myWorkbook.getSheet("Sheet2");
		
		//Read Whole Excel Sheet
		System.out.println("==========================================");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=4;j++)
			{
				String wholeSheet = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(wholeSheet +" ");
			}
			System.out.println();
			System.out.println("==========================================");
		}

	}

}
