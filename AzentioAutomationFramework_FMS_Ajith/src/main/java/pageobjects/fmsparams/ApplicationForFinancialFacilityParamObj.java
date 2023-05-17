package pageobjects.fmsparams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationForFinancialFacilityParamObj {
	WebDriver driver;

	public ApplicationForFinancialFacilityParamObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement parametersMainMenu;

	public WebElement parametersMainMenu() {
		return parametersMainMenu;
	}
//	@FindBy(xpath = "//td[text()='Parameters']")
//	private WebElement parametersMainMenu;
//
//	public WebElement parametersMainMenu() {
//		return parametersMainMenu;
//	}	

	
}
