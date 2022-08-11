package Flight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.Base_Test;
import genericLib.Utility_method;

public class Test_case_3_Test extends Base_Test{

	@Test
	public void subscribe() {
		WebElement sub = driver.findElement(By.id("newsletter-email"));
		Utility_method.sendkeys(sub, "Shubhadatta@gmail.com");
		WebElement button = driver.findElement(By.id("newsletter-subscribe-button"));
		Utility_method.Click(button);
	}

}
