package Flight;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLib.Base_Test;

public class Testcase_4_Test extends Base_Test {

	@Test
	public void TC_Login01() {

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("shubhadattatraya21@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Shubha@21");
		driver.findElement(By.id("Rem" + "emberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();

	}

	@Test
	public void TC_Login02() {

		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("shubha.dattatraya21@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Shubha@21");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
