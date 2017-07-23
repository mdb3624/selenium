package MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {

	@Test
	public void chromeTest() {
		System.setProperty("webdriver.chrome.driver", "C:/software/selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.facebook.com");

		driver.quit();
	}

}
