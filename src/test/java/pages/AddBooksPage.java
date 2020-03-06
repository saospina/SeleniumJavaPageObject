package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static pages.Common.driver;

public class AddBooksPage {
	
	private static By itemTitle = By.cssSelector("#listing > tbody > tr:nth-child(2) > td:nth-child(1)");
    private static By itemStock = By.cssSelector("#listing > tbody > tr:nth-child(2) > td:nth-child(2)");
    private static By quantityInput = By.name("q");
    private static By addButton = By.cssSelector("input:nth-child(4)");
    private static By cartItem = By.cssSelector("#added > tbody > tr:nth-child(2) > td:nth-child(1)");
    private static By cartItemTitle = By.cssSelector("#added > tbody > tr:nth-child(2) > td:nth-child(1)");
    private static By cartItemStock = By.cssSelector("#added > tbody > tr:nth-child(2) > td:nth-child(2)");
	public static String reslibro,resCantidad;
	

	public static void addBooks() throws InterruptedException {
		Common.waitForElement(30, itemStock);
		Thread.sleep(2000);
		String book = driver.findElement(itemTitle).getText();
        String quantity = driver.findElement(itemStock).getText();
        
        driver.findElement(quantityInput).click();
        driver.findElement(quantityInput).clear();
        driver.findElement(quantityInput).sendKeys(quantity);
        
        driver.findElement(addButton).click();
        
		 reslibro =  driver.findElement(cartItemTitle).getText();
		 resCantidad =  driver.findElement(cartItemStock).getText();
	    
	}

	
	
	
}
