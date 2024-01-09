package suiteA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POMdemo {
	
	@Test
	public void login()
	{
		WebDriver driver =new ChromeDriver();
		PageFactory.initElements(driver, getClass());
	}

}
