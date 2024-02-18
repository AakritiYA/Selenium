package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		this method return true and if it return false it wait for 10 after 10 if still it is false then it return false
		WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
		el.click();
	}

}
