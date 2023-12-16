package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {
public static void main(String[] args) throws IOException {
//In order to convert the data into stream of bytes we need to create an object of FileInputStream
//We need to pass relative path of the file for the constructor
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
//In order to access data from property file we need to create an empty object of Properties
	Properties pobj=new Properties();
//In order to load the data into empty object we will use load() of Properties class
	pobj.load(fis);
//To fetch the data from property object we use getProperty(String key) will return value 
//associated with the key mentioned 
	String url = pobj.getProperty("url");
	String un = pobj.getProperty("username");
	String pwd = pobj.getProperty("password");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
}
}
