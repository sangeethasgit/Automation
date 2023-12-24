package data_driven_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProvider {
	@DataProvider(name="loginCredentials")
	public Object[][] provideData() {
		Object[][] a=new Object[3][2];
		a[0][0]="Dinga";
		a[0][1]="Dingi";
		a[1][0]="admin";
		a[1][1]="manager";
		a[2][0]="Virat";
		a[2][1]="kohli";
	Object[] []obj=new Object [][]{
		{"http://localhost/login.do","admin","manager"},
		{"http://localhost/login.do","dinga","dingi"},
		{"http://localhost/login.do","admin","manager"}
	};	
	return obj;
	}
	
	@Test(dataProvider = "loginCredentials")
	public void login(String url,String un,String pwd) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.partialLinkText("Login")).click();
	}
}
