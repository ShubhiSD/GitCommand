import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkartlogin {
	public static void main(String[] args) {
	//setting up firefox geckodriver path
			System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe"); 
			//create new instance of FireFoxDriver
			WebDriver driver=new FirefoxDriver();
			//System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
			//WebDriver driver=new ChromeDriver();
			// Implicit wait
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//visit the website
			driver.get("http://www.flipkart.com"); 
			 Set <String> handles = driver.getWindowHandles();
					  String  WindowHandlerID = handles.iterator().next();
					   driver.switchTo().window(WindowHandlerID);
					   WebElement closeBttn=driver.findElement(By.cssSelector("button._2AkmmA._29YdH8"));
						closeBttn.click();
			driver.quit();
			
}
	}
