package ui;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabOrWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		System.out.println("first page: "+driver.getTitle());
		
//		open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.linkedin.com/");
		System.out.println("second page: "+driver.getTitle());

//		get window handles of open window
		Set<String> windowhandles = driver.getWindowHandles();
		
	}

}
