package pages;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Common {
	
	public static WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	
	@BeforeSuite
	public void setUp() throws IOException {
		File currentPath = new File(".");
        System.setProperty("webdriver.chrome.driver",
                currentPath.getCanonicalPath() + "\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

	public static void navigateToURL(String url) {
		driver.get(url);
		driver.manage().window().setSize(new Dimension(1366, 728));
		
	}

	public static void waitForElement(int seconds, By cartItem) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.presenceOfElementLocated(cartItem));
    }
	

}
