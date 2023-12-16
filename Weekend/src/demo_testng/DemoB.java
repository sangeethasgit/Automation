package demo_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoB {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/Demo.html");
	//ele will be having address has @01
	WebElement ele = driver.findElement(By.id("d1"));
//	ele.click();
//	driver.navigate().back();
//after refreshing the webpage the address of the element in html will get changed to
//@03 but in ref variable it is stored as @01 if we use this ref to perform action it will
//throw StaleElementReferenceException
	driver.navigate().refresh();
	ele.click();
}
}
