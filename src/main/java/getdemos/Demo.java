package getdemos;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import fakerapi.Post_Req_Data;

public class Demo {
	
	
	
@Test
public static Integer[][] testdataread() throws Exception
{
	int j=0;
	File file=new File(".\\TestData\\pages.xlsx");
		FileInputStream fis=new FileInputStream(file);
			
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheetAt(0);
			int rowcount=sheet.getLastRowNum();
			System.out.println("NUmber of rows  with data "+rowcount);
			Integer[][] data=new Integer[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for(int i=0;i<rowcount;i++)
			{
				data[i][j]=(int) sheet.getRow(i).getCell(0).getNumericCellValue();
				//System.out.println(data[i][j]);
				//System.out.println(Integer.toString(data[i][j]));
			}
			
			workbook.close();
	return data;
	
}
}
