package demo_testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.pom.LoginPage;

public class DemoA {
	@Test
public static void test() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://localhost/login.do");
	LoginPage l=new LoginPage(driver);
	l.setLogin("admin1","manager1");
	Thread.sleep(5000);
	l.setLogin("admin","manager");
}
}
