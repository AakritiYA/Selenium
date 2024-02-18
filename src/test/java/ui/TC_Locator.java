package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
//		locate username by id
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
//		locate password by class name
//		driver.findElement(By.className("form_input")).sendKeys("secret_sauce"); //error occur because class name does not find password uniquely 
		
//		locate password by name
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
//		locate login by class name
		driver.findElement(By.className("btn_action")).click();//click operation
		
//		if we want first we switch to product page and then locate sauce labs bolt T-Shirt
//		String currWindow = driver.getWindowHandle();
//		driver.switchTo().window(currWindow);
		
//		locate sauce labs bolt T-Shirt
		driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
		
//		count the elements who has Sauce words using findElements
//		List<WebElement> elementlist = driver.findElements(By.partialLinkText("Sauce"));
//		System.out.println(elementlist.size());
	}

}
