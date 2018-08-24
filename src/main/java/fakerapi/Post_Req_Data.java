package fakerapi;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Post_Req_Data {

	@Test
	public static Object[][] authorinfo() throws Exception {
		File file = new File(".\\TestData\\authorinfo.xlsx");
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		System.out.println("Number of rows  with data " + rowcount);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i <rowcount; i++) {
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++) {
			
				data[i][j] = sheet.getRow(i).getCell(j).toString();
			
			System.out.println(data[i][j]);
			// System.out.println(Integer.toString(data[i][j]));
		}}

		workbook.close();
		return data;

	}

}
