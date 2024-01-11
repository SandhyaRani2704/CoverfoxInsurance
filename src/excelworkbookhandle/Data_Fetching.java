package excelworkbookhandle;

import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_Fetching {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream myfile=new FileInputStream("D:\\EXCEL_WORKBOOK\\Book1.xlsx");
		String data = WorkbookFactory.create(myfile).getSheet("sheet3").getRow(1).getCell(1).getStringCellValue();
		System.out.println("Data From Book1 Excel Sheet:sheet3:row 0:coloumn 0 "+data);
		FileInputStream myfile1=new FileInputStream("D:\\\\EXCEL_WORKBOOK\\\\Book1.xlsx");
		String data1 = WorkbookFactory.create(myfile1).getSheet("sheet2").getRow(2).getCell(2).getStringCellValue();
        System.out.println("Data From Book1 Excel sheet2 row2 coloumn 2 "+data1);
	}

}
