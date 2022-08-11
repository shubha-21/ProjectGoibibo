package genericLib;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
/***
 * 
 * @author Shubha S
 *
 */

public class Base_Test {

	public WebDriver driver;

	@Parameters ("browsername")
	@BeforeClass (alwaysRun = true)
	//Browser Setup
	public void Browser_Setup(@Optional("Chrome") String browsername) throws IOException {
		System.out.println(browsername);
		if (browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (browsername.equalsIgnoreCase("msedge")) {
			System.setProperty("webdriver.edge.driver", "./Driver1/msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
		else if (browsername.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", "./Driver1/operadriver.exe");
			driver = new OperaDriver();
			
		}
		//String aapurl = Utility_method.Test_configuration();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void Browser_tear_down() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
