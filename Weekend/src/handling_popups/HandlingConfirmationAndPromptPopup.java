package handling_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationAndPromptPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.linkText("Alert with OK & Cancel")).click();
	driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().dismiss();
	String text = driver.findElement(By.id("demo")).getText();
	System.out.println(text);
	driver.findElement(By.linkText("Alert with Textbox")).click();
	driver.findElement(By.xpath("//button[contains(text(),'prompt box')]")).click();
	Alert a = driver.switchTo().alert();
	a.sendKeys("Arun");
	a.accept();
}
}
