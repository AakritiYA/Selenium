package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");

		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.id("datepicker"));
		element.click();

//		01-oct-2024
		String expectedDate = "1";
		String expectedMonth = "October";
		String expectedYear = "2024";

		while (true) {
			String calendarMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calendarYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if (calendarMonth.equals(expectedMonth) && calendarYear.equals(expectedYear)) {
				List<WebElement> allDate = driver.findElements(By.xpath("//table/tbody/tr/td"));

				for (WebElement e : allDate) {
					String calendarDay = e.getText();
					if (calendarDay.equals(expectedDate)) {
						e.click();
						break;
					}
				}

				break;
			} else {
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				
			}

		}

	}

}
