package handling_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingSingleFrame {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/T1.html");
	driver.findElement(By.id("t1")).sendKeys("A");
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("B");
	driver.switchTo().parentFrame();
	driver.findElement(By.id("t1")).sendKeys("C");
	driver.switchTo().frame("f2");
//	WebElement ele = driver.findElement(By.id("f1"));
//	driver.switchTo().frame(ele);
	driver.findElement(By.id("t2")).sendKeys("D");	
}
}
