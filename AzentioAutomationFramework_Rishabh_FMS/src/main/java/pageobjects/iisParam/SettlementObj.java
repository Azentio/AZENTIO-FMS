package pageobjects.iisParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettlementObj {
	WebDriver driver;

	public SettlementObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[normalize-space()='Settlement']")
	private WebElement iis_Settlement_Module;

	public WebElement iisSettlementModule() {
		return iis_Settlement_Module;
	}

	@FindBy(xpath = "//a[@id='T06MT']//span[contains(text(),'Maintenance')]")
	private WebElement iis_Settlement_Maintenance;

	public WebElement iisSettlementMaintenance() {
		return iis_Settlement_Maintenance;
	}

	@FindBy(xpath = "//td[normalize-space()='Batch Settlement']")
	private WebElement iis_Settlement_Batch_Settlement;

	public WebElement iisSettlementBatchSettlement() {
		return iis_Settlement_Batch_Settlement;
	}

	@FindBy(xpath = "//a[@id='T06BS']//span[contains(text(),'Create')]")
	private WebElement iis_Settlement_Batch_Settlement_Create;

	public WebElement iisSettlementBatchSettlementCreate() {
		return iis_Settlement_Batch_Settlement_Create;
	}

	@FindBy(xpath = "//input[@id='VALUE_DATE_T06BS']")
	private WebElement Batch_Settlement_Date;

	public WebElement BatchSettlementDate() {
		return Batch_Settlement_Date;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_CIF_NO_T06BS']")
	private WebElement Batch_Settlement_CIF;

	public WebElement BatchSettlementCIF() {
		return Batch_Settlement_CIF;
	}

	@FindBy(xpath = "//input[@id='byDueDate_T06BS']")
	private WebElement Batch_Settlement_Due_Date_Flag;

	public WebElement BatchSettlementDueDateFlag() {
		return Batch_Settlement_Due_Date_Flag;
	}
	
	@FindBy(xpath = "//input[@id='byDueDate_T06BS']")
	private WebElement Batch_Settlement_Retrive_Button;

	public WebElement BatchSettlementRetriveButton() {
		return Batch_Settlement_Retrive_Button;
	}

}
