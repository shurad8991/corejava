package testpackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelprof {
	public static void main(String[] args) throws IOException {
		
		FileInputStream i=new FileInputStream("C:\\\\Users\\\\Administrator\\\\eclipse-workspace\\\\test\\\\src\\\\excelfiles\\\\Book1.xlsx");
		Workbook a=WorkbookFactory.create(i);
		
		String s=a.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String s1=a.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(s+" "+s1);
		String s2=a.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String s3=a.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(s2+" "+s3);
		String s4=a.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		String s5=a.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		System.out.println(s4+" "+s5);
	}

}
