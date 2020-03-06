package tests;
// Generated by Selenium IDE

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.AddBooksPage;
import pages.Common;
import pages.LoginPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class AddBooksTest extends Common {
    
	@Test
    public void login() {
        Common.navigateToURL("http://sahitest.com/demo/training/login.htm");
        LoginPage.enterUsername("test");
        LoginPage.enterPassword("secret");
        LoginPage.pressSubmit();
        assertThat(driver.getTitle(), is("Books"));
    }

 

	@Test
    public void addBooks() throws InterruptedException {
        login();
        AddBooksPage.addBooks();
        assertThat(AddBooksPage.reslibro, is("Core Java"));
    }
}