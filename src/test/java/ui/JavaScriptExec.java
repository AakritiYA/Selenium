package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExec {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/juhi/Downloads/chromedriver-mac-arm64/chromedriver");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = driver; //use when it needed type cast.
		
//		To type text in a text box
		js.executeScript("document.getElementById('email').value = 'Aakriti'; ");
		
//		to click on a button, first find the button and then pass the button as argument
		WebElement element = driver.findElement(By.xpath("//button[@name='login']"));
//		js.executeScript("arguments[0].click();", element);
		
//		To refresh the browser window
//		js.executeScript("history.go(0)");
		
//		To get the domain name of web page
//		String domainName = js.executeScript("return document.domain;").toString();
//		System.out.println("Domain name: "+domainName);
		
//		To get the title name of web page
//		String titleName = js.executeScript("return document.title;").toString();
//		System.out.println("Title name: "+titleName);
		
//		To get the URL of web page
//		String urlName = js.executeScript("return document.URL;").toString();
//		System.out.println("URL: "+urlName);
		
//		To draw border around element
		js.executeScript("arguments[0].style.border='3px solid red';", element);
		
//		To zoom the page
//		js.executeScript("document.body.style.zoom = '50%'");
		
//		To get the height and weight of a web page
//		System.out.println(js.executeScript("return window.innerHeight;").toString());
//		System.out.println(js.executeScript("return window.innerWidth;").toString());
		
//		To perform scroll vertically till end
//		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
//		To perform scroll vertically page up
//		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		
//		To generate Alert Pop Up
//		js.executeScript("alert('This is my generate alert');");
		
//		To navigate to different page
		js.executeScript("window.location = 'https://www.google.com/'");
	}

}
