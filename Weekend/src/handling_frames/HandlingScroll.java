package handling_frames;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScroll {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bbc.com/");
	JavascriptExecutor jse=(JavascriptExecutor) driver;
//scrollBy() will scroll the webpage for the mentioned pixels from the current location
	jse.executeScript("window.scrollBy(0,3000)");
//scrollTo() will scroll the webpage for the mentioned pixels from the initial position
	jse.executeScript("window.scrollTo(0,8000)");
}
}
