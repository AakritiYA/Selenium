package ui;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {

	@Test
	public void verifyTestTitle() {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";

		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
