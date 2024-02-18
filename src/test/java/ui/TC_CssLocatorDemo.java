package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_CssLocatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
//		locate user name using tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
//		locate password using tag[attribute=value]
		driver.findElement(By.cssSelector("input[name = password")).sendKeys("secret_sauce");
		
//		locate login button using tag.value of class name
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
//		switch to product page
		String currwindow = driver.getWindowHandle();
		driver.switchTo().window(currwindow);
		
//		locate cart symbol using tag.class[attribute=value]
		driver.findElement(By.cssSelector("div.shopping_cart_container[id=shopping_cart_container]")).click();

//				
		
		
	}

}
