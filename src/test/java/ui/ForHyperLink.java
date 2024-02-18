package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForHyperLink {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		
//		to maximize the window size
		driver.manage().window().maximize();

//		find hyperlink
		List<WebElement> allhyper = driver.findElements(By.tagName("a"));
		
		for(WebElement e: allhyper) {
			System.out.println(e.getText());
		}
		System.out.println("Total number of hyperlink is: "+allhyper.size());
		
		driver.close();
	}

}
