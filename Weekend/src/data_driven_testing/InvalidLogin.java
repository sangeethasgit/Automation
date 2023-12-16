package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
	Properties p=new Properties();
	p.load(fis);
	String url = p.getProperty("url");
	driver.get(url);
	FileInputStream fis1=new FileInputStream("./data/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis1);
	int count = wb.getSheet("InvalidLogin").getLastRowNum();
	for(int i=1;i<=count;i++) {
		try{String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
		String pwd = wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.className("oxd-userdropdown")).click();
		driver.findElement(By.linkText("Logout")).click();
		wb.getSheet("InvalidLogin").getRow(i).getCell(2).setCellValue("Pass");}
		catch(NoSuchElementException e) {
		wb.getSheet("InvalidLogin").getRow(i).getCell(2).setCellValue("Fail");}	}
	FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
	wb.write(fos);
	wb.close();
	driver.quit();
	}
}
