package handling_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNestedFrames {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/T1.html");
	Thread.sleep(2000);
	driver.findElement(By.id("t1")).sendKeys("1");Thread.sleep(2000);
	driver.switchTo().frame(0);
	driver.findElement(By.id("t2")).sendKeys("2");Thread.sleep(2000);
	driver.switchTo().frame("n2");
	driver.findElement(By.id("t3")).sendKeys("3");Thread.sleep(2000);
	driver.switchTo().parentFrame();
	driver.findElement(By.id("t2")).sendKeys("4");Thread.sleep(2000);
	WebElement ele = driver.findElement(By.name("n2"));
	driver.switchTo().frame(ele);
	driver.findElement(By.id("t3")).sendKeys("5");Thread.sleep(2000);
	driver.switchTo().defaultContent();
	driver.findElement(By.id("t1")).sendKeys("6");
}
}
