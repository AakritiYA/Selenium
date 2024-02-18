package ui;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMgrClass {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
