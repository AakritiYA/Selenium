package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		List<WebElement> column = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
		
		for(int r=2; r<=row.size(); r++) {
			for(int c=1; c<=column.size(); c++) {
				String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" +r+ "]/td[" +c+ "]")).getText();
				System.out.println(data);
			}
		}
		
	}

}
