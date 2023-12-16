package handling_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	WebElement draggable = driver.findElement(By.id("draggable"));
	WebElement droppable = driver.findElement(By.id("droppable"));
	Actions a=new Actions(driver);
	a.dragAndDrop(draggable, droppable).perform();
}
}
