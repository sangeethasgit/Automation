package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {
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
 get the row and get the cell using getRow(int Index), getCell(int Index) and In order to 
 set the data we use setCellValue(String value)
*/wb.getSheet("UserManagement").getRow(0).getCell(5).setCellValue("Result");
//In order to convert it back from Stream of bytes into human understandable we need to create
//FileOutputStream object
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
//To write the data in excel we need to use write(FileOutputStream fos) present in Workbook 
	wb.write(fos);
}
}
