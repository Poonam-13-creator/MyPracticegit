package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pr {

	@Test
	public void signup() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://Google.com");
	}
}
