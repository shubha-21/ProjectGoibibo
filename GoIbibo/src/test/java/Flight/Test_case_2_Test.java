package Flight;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLib.Base_Test;
import genericLib.Utility_method;

public class Test_case_2_Test extends Base_Test {
	@DataProvider(name = "Testdata1")
	public Object[][] Testdata1() {
		Object[][] data = new Object[2][2];
		data[0][0] = "Ashishtote@gmail.com";
		data[0][1] = "Ashu123";
		data[1][0] = "shubhadattatray@gmail.com";
		data[1][1] = "Shubhadatta";
		return data;

	}

	@Test(dataProvider = "Testdata1")
	public void TestData1(String mailID, String password) throws InterruptedException, IOException {

		WebElement login = driver.findElement(By.linkText("Log in"));
		Utility_method.Click(login);
		WebElement mail = driver.findElement(By.id("Email"));
		Utility_method.sendkeys(mail, mailID);
		WebElement psw = driver.findElement(By.id("Password"));
		Utility_method.sendkeys(psw, password);
		WebElement rmbrme = driver.findElement(By.id("RememberMe"));
		Utility_method.Click(rmbrme);
		WebElement Log = driver.findElement(By.xpath("//input[@value='Log in']"));
		Utility_method.Click(Log);

	}
}
