package genericLib;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class Utility_method {
	static String Filepath;
	static FileInputStream Fis;
	static Properties prop;
	static String url;
	
	public static String Test_configuration () throws IOException {
		Filepath = "./Test_configuration/Test_configuration.properties";
		Fis =new FileInputStream(Filepath);
		prop = new Properties();
		prop.load(Fis);
	
		url = prop.getProperty("url");
		return url;
	}
	
	public static void sendkeys (WebElement element , String value) {
		element.sendKeys(value);
	}
	public static void Click (WebElement element) {
		element.click();
	}

}
