package handling_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrames {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/frames/multiple?sublist=2");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//iframe[@src='../login.html']"));
	driver.switchTo().frame(ele);
	driver.findElement(By.id("username")).sendKeys("ViratKohli");Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("Anushka");Thread.sleep(2000);
	driver.switchTo().defaultContent();
	WebElement ele2 = driver.findElement(By.xpath("//iframe[@src='../signup.html']"));
	driver.switchTo().frame(ele2);
	driver.findElement(By.id("username")).sendKeys("Yash");Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("Yash@kgf");Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("Radhika");Thread.sleep(2000);
}
}
