package com.actitime.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage {
	@FindBy(id="username")
	private WebElement unTbx;
	@FindBy(name="pwd")						//Declaration
	private WebElement pwdTbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBtn;
	//Only if you perform action on element it will provide the initialization
	//LazyInitialization
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);		//Initialization
	}
	
	public void setLogin(String un,String pwd) {
		unTbx.sendKeys(un);
		pwdTbx.sendKeys(pwd);					//Utilization
		loginBtn.click();
	}
}