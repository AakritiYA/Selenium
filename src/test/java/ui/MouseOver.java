package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://sellglobal.ebay.in/seller-center/");
		
		WebElement el =  driver.findElement(By.linkText("Shipping"));
		
		Actions act = new Actions(driver);
		
//		moveToElement() used for perform the mouse over actions
		act.moveToElement(el).perform();
	}

}
