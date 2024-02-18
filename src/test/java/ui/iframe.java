package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.rediff.com/");
//		
////		Switch to iframe
//		driver.switchTo().frame("moneyiframe");
//		
////		data access from iframe
//		String data = driver.findElement(By.id("nseindex")).getText();
//		System.out.println(data);
		
		driver.get("https://chercher.tech/practice/frames");
		driver.switchTo().frame("frame1"); //parent frame
		driver.switchTo().frame("frame3"); //child frame
		
		driver.findElement(By.id("a")).click(); //access element from child frame
		
//		switch to parent frame
		driver.switchTo().parentFrame();
		driver.findElement(By.tagName("input")).sendKeys("this is demo");
		
//		switch to main page
		driver.switchTo().defaultContent();
		
//		switch to frame 2
		driver.switchTo().frame("frame2");
		WebElement el = driver.findElement(By.id("animals"));
		
		Select w = new Select(el);
		w.selectByValue("avatar");
		
		
	}

}
