package demo_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public static void demoA() {
//System.out.println("Hiii");//It will print only on the console
//Reporter.log("Hello");//It will print only on the report
Reporter.log("demoA",true);//It will print both on the report as well as console
//Reporter.log("Selenium", false);//It will print only on the report
	}
	}
