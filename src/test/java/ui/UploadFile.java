package ui;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		
//		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("/Users/juhi/Downloads/AAKRITI_RESUME.pdf");
		WebElement el = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		Actions act = new Actions(driver);
		act.moveToElement(el).click().perform();
		
		Robot rb = new Robot();
		Thread.sleep(900);
//		copy file to clip board
		StringSelection yy = new StringSelection("/Users/juhi/Downloads/AAKRITI_RESUME(QA).pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(yy, null);
		
		
		
//		perform command + v action to paste file
		rb.keyPress(KeyEvent.VK_META);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_META);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
