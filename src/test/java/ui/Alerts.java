package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
//		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
		
//		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
//		driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
		
//		driver.switchTo().alert().accept();	
//		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("AK");
		driver.switchTo().alert().accept();
	}

}
