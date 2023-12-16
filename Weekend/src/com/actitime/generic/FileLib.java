package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * It is a generic class which consists of generic method to read data from
 * property file, excel and also write data into excel
 * @author QSP
 */
public class FileLib {
/**
 * It is generic method to read data from property file
 * @param key
 * @return value associated with the mentioned key
 * @throws IOException
 */
public String readDataFromProperty(String key) throws IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
	Properties p=new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
}
/**
 * It is a generic method which is used to read data from excel file
 * @param sheet
 * @param row
 * @param cell
 * @return value from  mentioned sheet, row, cell
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String readDataFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return data;
}
/**
 * It is a generic method which is used to write data into excel file
 * @param sheet
 * @param row
 * @param cell
 * @param value
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public void writeDataIntoExcel(String sheet,int row,int cell,String value) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(value);
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
}
}
