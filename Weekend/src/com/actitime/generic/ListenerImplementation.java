package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
	}@Override
	public void onTestSuccess(ITestResult result) {
String name = result.getName();		Reporter.log(name+" method has got passed",true);
	}@Override
	public void onTestFailure(ITestResult result) {
	String name = result.getName();
	Reporter.log(name+" method has got failed",true);
	TakesScreenshot ts=(TakesScreenshot) driver;
	File temp = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/"+name+".png");
	try {FileUtils.copyFile(temp, dest);
	} catch (IOException e) {
	}}@Override
	public void onTestSkipped(ITestResult result) {
String name = result.getName();	Reporter.log(name+" method has got skipped",true);
	}@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}@Override
	public void onStart(ITestContext context) {
	}@Override
	public void onFinish(ITestContext context) {
	}

}
