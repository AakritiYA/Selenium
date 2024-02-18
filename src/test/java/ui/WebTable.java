package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/juhi/Desktop/Untitled.html");
		
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText()); 
		
//		find total row in web Table
		List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Total no of row is : " +row.size());
		
		List<WebElement> column = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		System.out.println("Total no of column is : "+column.size());
		
		for(int r=2; r<=row.size(); r++) {
			for(int c=1; c<=column.size(); c++) {
				String data = driver.findElement(By.xpath("//table/tbody/tr[" +r+ "]/td[" +c+ "]")).getText(); 
				System.out.println(data);
			}
		}
	}

}
