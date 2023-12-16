package data_driven_testing;

import java.io.IOException;

import com.actitime.generic.FileLib;

public class ExecutionClass {
public static void main(String[] args) throws IOException {
	FileLib f=new FileLib();
	String url = f.readDataFromProperty("url");
	String un = f.readDataFromProperty("username");
	String pwd = f.readDataFromProperty("password");
	String username = f.readDataFromExcel("UserManagement",1,3);
	System.out.println(username);
	String d1 = f.readDataFromExcel("Invalidlogin", 8,1);
	f.writeDataIntoExcel("InvalidLogin", 8, 2,"Success");
	f.writeDataIntoExcel("UserManagement", 1, 3, "ViratKohli");
	System.out.println(d1);
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
	
}
}
