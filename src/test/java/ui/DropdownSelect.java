package ui;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
//		locate the drop down and select one option using select class and web driver methods 
		WebElement element = driver.findElement(By.className("product_sort_container"));
		
		Select dropdown = new Select(element);
//		dropdown.selectByVisibleText("Price (low to high)"); //by text which is shown in page
//		dropdown.selectByIndex(2); //by index number start 1
		dropdown.selectByValue("hilo"); //by option value which is shown in html code
		
		if(dropdown.isMultiple()==true) {
			System.out.println("dropdown is multiple");
		}else {
			System.out.println("dropdown is not multiple");
		}
		
		List<WebElement> li = dropdown.getOptions();
		for(WebElement el: li) {
			System.out.println(el.getText());
		}
		
		driver.close();
		
	}

}
