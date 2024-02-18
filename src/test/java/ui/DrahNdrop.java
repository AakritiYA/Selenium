package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrahNdrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
//		find source and target web element( source that is moved, target where it is moved )
		WebElement source = driver.findElement(By.id("box6"));
		WebElement target = driver.findElement(By.id("box106"));
		
		Actions act = new Actions(driver);
//		dragAndDrop(sourceElement, targetElement)
		act.dragAndDrop(source, target).perform();
	}

}
