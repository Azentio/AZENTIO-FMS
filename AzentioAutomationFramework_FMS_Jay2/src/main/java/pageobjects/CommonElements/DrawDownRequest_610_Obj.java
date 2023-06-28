package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrawDownRequest_610_Obj {


	WebDriver driver;

	public DrawDownRequest_610_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath =  "//select[@id='fmsFacilityTypeHamishAlJiddiyaYN_P008UP']")
	private WebElement HJ_Down_Payment_InMainDetails_610;
	public WebElement HJ_Down_Payment_InMainDetails_610() {
		return HJ_Down_Payment_InMainDetails_610;
	}
	
	@FindBy(xpath =  "//select[@id='fmsFacilityTypeHamishAlJiddiyaYN_P008UP']/option[text()='None']")
	private WebElement HJ_Down_Payment_None_InMainDetails_610;
	public WebElement HJ_Down_Payment_None_InMainDetails_610() {
		return HJ_Down_Payment_None_InMainDetails_610;
	}
	
	@FindBy(xpath =  "//select[@id='fmsFacilityTypeHamishAlJiddiyaYN_P008UP']/option[text()='Hamish Al Jiddiyah ']")
	private WebElement HJ_Down_Payment_HamishAlJiddiyah_InMainDetails_610;
	public WebElement HJ_Down_Payment_HamishAlJiddiyah_InMainDetails_610() {
		return HJ_Down_Payment_HamishAlJiddiyah_InMainDetails_610;
	}
	
	@FindBy(xpath =  "//select[@id='fmsFacilityTypeHamishAlJiddiyaYN_P008UP']/option[text()='Down Payment ']")
	private WebElement HJ_Down_Payment_DownPayment_InMainDetails_610;
	public WebElement HJ_Down_Payment_DownPayment_InMainDetails_610() {
		return HJ_Down_Payment_DownPayment_InMainDetails_610;
	}
	
	//--------------------@1105453
	
	@FindBy(xpath =  "//td[text()='Transaction Template']")
	private WebElement TransactionTemplate_Screen_610;
	public WebElement TransactionTemplate_Screen_610() {
		return TransactionTemplate_Screen_610;
	}
	
	@FindBy(xpath =  "//span[text()='Maintenance']")
	private WebElement MaintenanceScreen_InTransactionTemplate_610;
	public WebElement MaintenanceScreen_InTransactionTemplate_610() {
		return MaintenanceScreen_InTransactionTemplate_610;
	}
	
	@FindBy(xpath =  "//td[@id='add_trxTemplateDetGridTbl_Id_P0035M']")
	private WebElement addIcon_InTransactionTemplate_610;
	public WebElement addIcon_InTransactionTemplate_610() {
		return addIcon_InTransactionTemplate_610;
	}
	
	@FindBy(xpath =  "//td[@id='td_trxTemplateDetGridTbl_Id_P0035M_1_trxTemplateDetVO.GL_TYPE']")
	private WebElement GlType_InTransactionTemplate_610;
	public WebElement GlType_InTransactionTemplate_610() {
		return GlType_InTransactionTemplate_610;
	}
	
	@FindBy(xpath =  "//td[@id='td_trxTemplateDetGridTbl_Id_P0035M_1_trxTemplateDetVO.GL_TYPE']/select[@gridid='trxTemplateDetGridTbl_Id_P0035M']")
	private WebElement GlTypeSelectRowValues_InTransactionTemplate_610;
	public WebElement GlTypeSelectRowValues_InTransactionTemplate_610() {
		return GlTypeSelectRowValues_InTransactionTemplate_610;
	}
	
	@FindBy(xpath =  "//td[@id='td_trxTemplateDetGridTbl_Id_P0035M_1_trxTemplateDetVO.GL_TYPE']/select/option[text()='Down Payment Account']")
	private WebElement DownPaymentAccount_InTransactionTemplate_610;
	public WebElement DownPaymentAccount_InTransactionTemplate_610() {
		return DownPaymentAccount_InTransactionTemplate_610;
	}
}
