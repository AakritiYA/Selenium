package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		
		JavascriptExecutor js = driver;
//		Scroll By pixel
//		js.executeScript("window.scrollBy(0, 500)");
		
//		scroll by visibility of element
//		WebElement ele = driver.findElement(By.linkText("BMR Calculator"));
//		js.executeScript("arguments[0].scrollIntoView();", ele);
		
//		scroll till the bottom of page
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
	}

}
