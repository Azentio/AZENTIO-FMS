package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Collateral_Management_Obj {
	WebDriver driver;

	public Collateral_Management_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//127727
	@FindBy(xpath = "//td[text()='Financial Indicators']")
	private WebElement Click_FinancialIndicators_under_Parameters;
	public WebElement Click_FinancialIndicators_under_Parameters_607() {
		return Click_FinancialIndicators_under_Parameters;
	}
	
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Click_Mainteance_Under_FinancialIndicators;
	public WebElement Click_Mainteance_Under_FinancialIndicators_607() {
		return Click_Mainteance_Under_FinancialIndicators;
	}
	
	@FindBy(xpath = "//*[@id='financialindicatorFormIdCode_P001MT']")
	private WebElement Enter_Code_InMainteance_Under_FinancialIndicators;
	public WebElement Enter_Code_InMainteance_Under_FinancialIndicators_607() {
		return Enter_Code_InMainteance_Under_FinancialIndicators;
	}
	
	
	
	
	
	
	
}
