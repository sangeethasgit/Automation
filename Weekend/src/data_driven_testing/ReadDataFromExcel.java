package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
//In order to convert the data into stream of bytes we need to create an object of FileInputStream
//We need to pass relative path of the file for the constructor
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
//In order to read data from excel we need to create an object of Workbook interface
//since we cant create an object for interface directly we use WorkbookFactory.create(fis)
//which will create the Workbook object and load the data during object creation itself.
	Workbook wb = WorkbookFactory.create(fis);
/*With the reference variable of Workbook object first we should get the sheet from where
 we need to get the data from using getSheet(String sheetName) with that reference we need to
 get the row and get the cell using getRow(int Index), getCell(int Index) and in order to 
 fetch the data we use getStringCellValue() which returns String value in the cell
*/
	String data = wb.getSheet("UserManagement").getRow(1).getCell(0).getStringCellValue();
	System.out.println(data);
}
}
