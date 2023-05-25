package stepdefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClass;

public class Hightlight_Element {
	
	WebDriver driver;
	public Hightlight_Element(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public static void highlightElement(WebElement driver) {
	JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
	executor.executeScript("arguments[0].style.border='3px solid blue'", driver );
	}

}
