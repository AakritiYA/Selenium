package ui;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
//		To find the number of broken links
		
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		
//		find hyperlink
		List<WebElement> li =  driver.findElements(By.tagName("a"));
		int code = 200;
		int brokenlinks = 0;
		for(WebElement el: li) {
			String str = el.getAttribute("href");
			
			try {
				URL link = new URL(str);
//				we open the link with http
				HttpURLConnection huc = (HttpURLConnection)link.openConnection();
//				we send a request to all connections
//				huc.setRequestMethod("HEAD");
//				now we connect the connections
				huc.connect();
				code = huc.getResponseCode();
				if(code>=400) {
					brokenlinks++;
				}
			}catch(Exception e) {
				
			}
		}
		System.out.println("Total links is :"+li.size());
		System.out.println("Total broken links is: "+ brokenlinks);

	}

}
