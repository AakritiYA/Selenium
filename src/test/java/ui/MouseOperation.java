package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		
//		store the web element in button variable
		WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement button1 = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
//		we require action class for mouse operation and it take an argument which is driver variable
		Actions act = new Actions(driver);
		
//		for right click operation contextClick is the method and perform is used to perform the method
		act.contextClick(button).perform();
		
//		doubleClick is used for double click and we pass the augment that in which element the action perform
		act.doubleClick(button1).perform();
	}

}
