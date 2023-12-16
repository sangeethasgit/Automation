package handling_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledEle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/Disabled.html");
	driver.findElement(By.id("t1")).sendKeys("India");
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("document.getElementById('t2').value='NewZealand'");
//driver.findElement(By.id("t2")).sendKeys("NewZealand");Element not interactable exc
	
}
}
