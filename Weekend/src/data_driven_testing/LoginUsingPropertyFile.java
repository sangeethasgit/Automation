package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsingPropertyFile {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
	Properties p=new Properties();
	p.load(fis);
	String url = p.getProperty("url");
	String un = p.getProperty("username");
	String pwd = p.getProperty("password");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(url);
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}
