package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Collateral_Management_610_obj {

	WebDriver driver;

	public Collateral_Management_610_obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath =  "//td[text()='Collateral Management']")
	private WebElement CollateralManagementScreen_610;
	public WebElement CollateralManagementScreen_610() {
		return CollateralManagementScreen_610;
	}
	
	@FindBy(xpath =  "//span[text()='Maintenance']")
	private WebElement MaintenanceIN_CollateralManagementScreen_610;
	public WebElement MaintenanceIN_CollateralManagementScreen_610() {
		return MaintenanceIN_CollateralManagementScreen_610;
	}
	
	@FindBy(xpath =  "//input[@id='lookuptxt_collateralManagementCollateralType_T014MT']")
	private WebElement collateralType_INCollateralManagementScreen_610;
	public WebElement collateralType_INCollateralManagementScreen_610() {
		return collateralType_INCollateralManagementScreen_610;
	}
	
	@FindBy(xpath =  "//input[@id='fmscollateralValidFrom_T014MT']")
	private WebElement ValidFromDateIN_CollateralManagementScreen_610;
	public WebElement ValidFromDateIN_CollateralManagementScreen_610() {
		return ValidFromDateIN_CollateralManagementScreen_610;
	}
	
	@FindBy(xpath =  "//input[@id='fmscollateralValidTo_T014MT']")
	private WebElement ValidToDateIN_CollateralManagementScreen_610;
	public WebElement ValidToDateIN_CollateralManagementScreen_610() {
		return ValidToDateIN_CollateralManagementScreen_610;
	}
	
	@FindBy(xpath =  "//input[@id='fmscollateralBriefNameEng_T014MT']")
	private WebElement BriefDescriptionIN_CollateralManagementScreen_610;
	public WebElement BriefDescriptionIN_CollateralManagementScreen_610() {
		return BriefDescriptionIN_CollateralManagementScreen_610;
	}
	
	@FindBy(xpath =  "//input[@id='fmscollateralLongNameEng_T014MT']")
	private WebElement LongDescriptionIN_CollateralManagementScreen_610;
	public WebElement LongDescriptionIN_CollateralManagementScreen_610() {
		return LongDescriptionIN_CollateralManagementScreen_610;
	}
	
	@FindBy(xpath =  "//input[@id='lookuptxt_fmscollateralCif_T014MT']")
	private WebElement cifNoIN_CollateralManagementScreen_610;
	public WebElement cifNoIN_CollateralManagementScreen_610() {
		return cifNoIN_CollateralManagementScreen_610;
	}
	
	@FindBy(id =  "_popup_path_sol_confirm_ok")
	private WebElement CIfAlreadyBlockListIN_CollateralManagementScreen_610;
	public WebElement CIfAlreadyBlockListIN_CollateralManagementScreen_610() {
		return CIfAlreadyBlockListIN_CollateralManagementScreen_610;
	}
	
	@FindBy(xpath =  "//input[@id='lookuptxt_fmscollateralCurrency_T014MT']")
	private WebElement collateralCurrencyIN_CollateralManagementScreen_610;
	public WebElement collateralCurrencyIN_CollateralManagementScreen_610() {
		return collateralCurrencyIN_CollateralManagementScreen_610;
	}
	
	@FindBy(xpath =  "//li[@id='collateralManagementAdditionDetailsTabs_T014MT']/a/span[text()='Additional Details']")
	private WebElement AdditionalDetailsIN_CollateralManagementScreen_610;
	public WebElement AdditionalDetailsIN_CollateralManagementScreen_610() {
		return AdditionalDetailsIN_CollateralManagementScreen_610;
	}
	
	@FindBy(xpath =  "//input[@id='fmscollateralAcceptValue_T014MT']")
	private WebElement FCValuesfIN_CollateralManagementScreen_610;
	public WebElement FCValuesfIN_CollateralManagementScreen_610() {
		return FCValuesfIN_CollateralManagementScreen_610;
	}
	
	@FindBy(xpath =  "//input[@id='fmscollateralDateAccepted_T014MT']")
	private WebElement DateAcceptedfIN_CollateralManagementScreen_610;
	public WebElement DateAcceptedfIN_CollateralManagementScreen_610() {
		return DateAcceptedfIN_CollateralManagementScreen_610;
	}
	
	@FindBy(xpath =  "//input[@id='fmscollateralMarketValuationDate_T014MT']")
	private WebElement ValuationDatefIN_CollateralManagementScreen_610;
	public WebElement ValuationDatefIN_CollateralManagementScreen_610() {
		return ValuationDatefIN_CollateralManagementScreen_610;
	}
}
