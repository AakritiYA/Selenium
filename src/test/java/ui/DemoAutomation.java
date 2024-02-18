package ui;

import org.openqa.selenium.chrome.ChromeDriver;


public class DemoAutomation {
		
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		
//		capture title of webpage and print
		String title = driver.getTitle();
		System.out.println("Page title : " + title);
		
//		capture url of the webpage
		System.out.println(driver.getCurrentUrl());
	}

	public static void main(String[] args) {
		DemoAutomation obj = new DemoAutomation();
		System.out.println("hey");
		obj.launchBrowser();
	}

}
