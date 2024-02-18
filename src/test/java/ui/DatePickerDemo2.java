package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		driver.findElement(By.xpath("//span[@class='sc-12foipm-22 cUvQPq fswDownArrow']")).click();
		
		String expecteddate = "12";
		String expectedMonthYear = "November 2024";
		
		while(true) {
			String Monthyear = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='sc-1gt8xf5-0 bPZJjI']/div[@class='sc-1gt8xf5-3 helaNf']/div[@class='sc-12foipm-30 cYbSgs']/div[@class='sc-12foipm-14 lhvXDk']/div[@class='sc-12foipm-34 iHoHRr']/div[@class='sc-12foipm-52 bWKaaI']/div[@class='sc-12foipm-54 liXRWe']/div[@class='DayPicker']/div[@class='DayPicker-wrapper']/div[@class='DayPicker-Months']/div[1]/div[1]")).getText();
			if(Monthyear.equals(expectedMonthYear)) {
				List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='DayPicker-Month']/div/div/div"));
				for(WebElement e: allDates) {
					String date = e.getText();
					if(date.equals(expecteddate)) {
						e.click();
						driver.findElement(By.xpath("//span[normalize-space()='Done']")).click();
						break;
					}
				}
				break;
			}else {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}

		
	}

}
