package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Collateral_ManagementObj {
	
	WebDriver driver;
	public Collateral_ManagementObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// 680390
	@FindBy(xpath = "//label[@id='language_key']")
	private WebElement FMS_core_language_btn;
	public WebElement FMSCoreLanguageBtn() {
		return FMS_core_language_btn;
	}
	
	@FindBy(xpath = "//a[@id='ar']")
	private WebElement arabic_language;
	public WebElement arabicLanguage() {
		return arabic_language;
	}

	@FindBy(xpath = "//td[text()='إدارة الرهن']")
	private WebElement arabic_mortgage_management_module;
	public WebElement arabicMortgageManagementModule() {
		return arabic_mortgage_management_module;
	}
	
	@FindBy(xpath = "//a[@id='T014MT']")	
	private WebElement mortgage_management_main;
	public WebElement mortgageManagementMain() {
		return mortgage_management_main;
	}
	
	@FindBy(xpath = "//label[@id='collateralmanagementFormId_T014MT_Collateral_Type_key']")
	private WebElement mortgage_management_main_label;
	public WebElement mortgageManagementMainLabel() {
		return mortgage_management_main_label;
	}
	
	@FindBy(xpath = "//button[@id='collateralManagement_save_btn_T014MT']")
	private WebElement mortgage_management_main_end;
	public WebElement mortgageManagementMainEnd() {
		return mortgage_management_main_end;
	}
}
