package util;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public  class ReadExcel {

@Test		// TODO Auto-generated method stub
		public  Object[][] readExcel(String filename) throws IOException
		{
			XSSFWorkbook wBook=new XSSFWorkbook("./ReadExcel/"+filename+".xlsx");

	XSSFSheet sheet = wBook.getSheetAt(0);
	
int RowCount = sheet.getLastRowNum();
short Columncount = sheet.getRow(0).getLastCellNum();
Object[][]data=new Object[RowCount][Columncount];
for(int i=1;i<=RowCount;i++)
{
	XSSFRow row = sheet.getRow(i);

for(int j = 0;j<Columncount;j++)
{
  try {
	XSSFCell cell=row.getCell(j);	
	  
	 //String data1= cell.getStringCellValue();
	 data[i-1][j]=cell.getStringCellValue();
} catch (Exception e) {
	// TODO Auto-generated catch block
	 data[i-1][j]="";

}
 System.out.println("read data"+data);
  
  }
wBook.close();

}
return data;
		}
}
