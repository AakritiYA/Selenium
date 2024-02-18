package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
//		find web element image link open cart
		driver.findElement(By.xpath("//img[@title='OpenCart - Demo']")).click();
		
//		verify title of the current page with expected home page title
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test Fail");
		}
	}

}
