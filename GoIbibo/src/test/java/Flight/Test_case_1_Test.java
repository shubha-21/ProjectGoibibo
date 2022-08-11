package Flight;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.Base_Test;
import genericLib.Utility_method;

public class Test_case_1_Test extends Base_Test {
	@Test
	public void Demo_Registration () throws InterruptedException, IOException {
		
		WebElement Register = driver.findElement(By.linkText("Register"));
		Utility_method.Click(Register);
		WebElement radiobutton = driver.findElement(By.id("gender-female"));
		Utility_method.Click(radiobutton);
		WebElement firstname=driver.findElement(By.id("FirstName"));
		Utility_method.sendkeys(firstname, "Shubha");
		WebElement Lastname = driver.findElement(By.id("LastName"));
		Utility_method.sendkeys(Lastname, "Datta");
		WebElement Email=driver.findElement(By.id("Email"));
		Utility_method.sendkeys(Email, "Shubhadatta@gmail.com");
		
		WebElement password = driver.findElement(By.id("Password"));
		
		Utility_method.sendkeys(password, "Ashu123");
		WebElement cpswd = driver.findElement(By.id("ConfirmPassword"));
		Utility_method.sendkeys(cpswd, "Ashu123");
		WebElement button = driver.findElement(By.id("register-button"));
		Utility_method.Click(button);
		
	}


}
