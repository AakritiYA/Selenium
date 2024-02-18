package ui;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");

//		Capture full Screenshot of web page
//		Step1: convert webdriver(if use instead of ChromeDriver) object to TakeScreenshot interface
		TakesScreenshot ss = driver;
		
//		step2: call getScreenshotAs method to create image file
		File src =  ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("/Users/juhi/Desktop/fullpage.png"); //here we copy the image file in desired location
		
//		step3: copy image file to destination
		FileUtils.copyFile(src, dest);
		
		
////		Screenshot section of a web page
////		Step1: convert webdriver(if use instead of ChromeDriver) object to TakeScreenshot interface
////		same for particular web element screenshot: 1st find the element and file procedure
//		WebElement element = driver.findElement(By.xpath("//div[@id='masthead-container']//div[4]"));
//		
////		step2: call getScreenshotAs method to create image file
//		File src =  element.getScreenshotAs(OutputType.FILE);
//		File dest = new File("/Users/juhi/Desktop/sectionpage.png"); //here we copy the image file in desired location
//		
////		step3: copy image file to destination
//		FileUtils.copyFile(src, dest);
	}

}
