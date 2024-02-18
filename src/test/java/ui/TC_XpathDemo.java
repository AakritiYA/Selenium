package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_XpathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/v1/");
		
//		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
//		using contains() method
		driver.findElement(By.xpath("//input[contains(@id,'user')]")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		driver.findElement(By.xpath("//img[@class='inventory_item_img']")).click();
	}

}
