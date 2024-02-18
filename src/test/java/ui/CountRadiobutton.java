package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRadiobutton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
//		find radio button web elements on web page
		List<WebElement> radiobutton = driver.findElements(By.xpath("//input[@type='radio']"));
//		print number of radio button
		System.out.println("Total number of radion button is: "+radiobutton.size());
//		close current browser
		driver.close();
	}

}
