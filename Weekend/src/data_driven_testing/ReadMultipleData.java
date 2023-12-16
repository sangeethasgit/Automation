package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
//In order to fetch the last row index which is consisting the data
	int count = wb.getSheet("InvalidLogin").getLastRowNum();
	System.out.println(count);
	for(int i=1;i<=count;i++) {
		String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
		String pwd = wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
		System.out.println("Username :"+un+" password :"+pwd);
	}
}
}
