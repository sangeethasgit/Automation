package handling_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollToEle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bbc.com/");
	WebElement ele = driver.findElement(By.xpath("//h2[text()='Explore the BBC']"));
	int yAxis = ele.getLocation().getY();
	System.out.println(yAxis);
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollTo(0,"+yAxis+")");
}
}
