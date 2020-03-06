package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;

import static pages.Common.driver;

public class LoginPage {

	private static By usernameInput = By.name("user");
	private static By passwordInput = By.name("password");
	private static By submitButton = By.cssSelector(".button");

	public static void enterUsername(String username) {
		driver.findElement(usernameInput).click();
		driver.findElement(usernameInput).sendKeys(username);
	}

	public static void enterPassword(String password) {
		driver.findElement(passwordInput).click();
		driver.findElement(passwordInput).sendKeys(password);
	}

	public static void pressSubmit() {
		driver.findElement(submitButton).click();
	}

}
