package Utilies;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;





public class XLUtilities {
	          @Test
			public void path() throws IOException {
			String fileLocation ="D:\\workspace\\urbanLadder\\src\\test\\java\\com\\urbanLadder\\testData\\LoginTestData.xlsx";
			XSSFWorkbook wbook = new XSSFWorkbook(fileLocation);
			XSSFSheet Sheet = wbook.getSheetAt(0);
		    int lastRowNum=	Sheet.getLastRowNum();
		    int LastRow = Sheet.getPhysicalNumberOfRows();
		    int CellNum = Sheet.getRow(0).getPhysicalNumberOfCells();
		    System.out.println("The Required Test data are:");
			for (int i = 1; i <LastRow; i++)
			{
				XSSFRow row = Sheet.getRow(i);
				for (int j = 0; j < CellNum; j++) {
					XSSFCell cell = row.getCell(j);
					DataFormatter dft =new DataFormatter();
					String value = dft.formatCellValue(cell);
					System.out.println("*"+value);
				
			}
			
		}
		
	}
}


