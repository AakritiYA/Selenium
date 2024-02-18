package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String actualValue = driver.findElement(By.xpath("//a[@href='/reg/']")).getAttribute("title");
		String expectedValue = "Sign up for Facebook";
		
		if(actualValue.equals(expectedValue)) {
			System.out.println("test passed");
		}else {
			System.out.println("test failed");
		}
	}

}
