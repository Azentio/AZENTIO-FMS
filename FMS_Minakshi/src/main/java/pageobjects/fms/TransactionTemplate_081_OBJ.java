package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class TransactionTemplate_081_OBJ {
	WebDriver driver;
	public TransactionTemplate_081_OBJ(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//*[@id=\"_selenuimP000\"]/h3")
	private WebElement Parameter;
	public WebElement Parameter() {
		return Parameter;
	}
	@FindBy(xpath = "//*[@id=\"_selenuimP0035\"]/li/a")
	private WebElement Transactiontemplate;
	public WebElement Transactiontemplate() {
		return Transactiontemplate;
	}
	@FindBy(xpath = "//*[@id=\"P0035M\"]")
	private WebElement Maintannance;
	public WebElement Maintannance() {
		return Maintannance;
	}
	@FindBy(xpath = "//*[@id=\"add_trxTemplateDetGridTbl_Id_P0035M\"]/div/span")
	private WebElement AddIcon;
	public WebElement AddIcon() {
		return AddIcon;
	}
	@FindBy(xpath = "//td/input[@prevvalue='+/-/*'] ")
	private WebElement PlusIconUnderFormula;
	public WebElement PlusIconUnderFormula() {
		return PlusIconUnderFormula;
	}
	@FindBy(xpath = "//*[@id=\"add_trxTemplateFormulaGridTbl_Id_P0035M\"]/div/span")
	private WebElement AddIconUnderFormula;
	public WebElement AddIconUnderFormula() {
		return AddIconUnderFormula;
	}
	@FindBy(xpath = "//*[@id=\"jqgh_trxTemplateDetGridTbl_Id_P0035M_trxTemplateDetVO.ENTRY_TYPE\"]")
	private WebElement TrxDescription;
	public WebElement TrxDescription() {
		return TrxDescription;
	}
	@FindBy(xpath = "//*[@id=\"jqgh_trxTemplateDetGridTbl_Id_P0035M_trxTemplateDetVO.AMT_NAME\"]")
	private WebElement Amount;
	public WebElement Amount() {
		return Amount;
	}
	
	@FindBy(xpath = "//*[@id=\"td_trxTemplateFormulaGridTbl_Id_P0035M_1_trxTemplateField\"]")
	private WebElement ListOfField;
	public WebElement ListOfField() {
		return ListOfField;
	}
	
	@FindBy(xpath = "(//td/select[@class='editable'])[13]")
	private WebElement drawDownField;
	public WebElement drawDownField() {
		return drawDownField;
	}
	
	@FindBy(xpath = "(//td/select[@class='editable'])[13]//option[contains(text(),'Down Payment')]")
	private WebElement DownPayment;
	public WebElement DownPayment() {
		return DownPayment;
	}
	
	@FindBy(xpath = "(//td/select[@class='editable'])[13]//option[contains(text(),'Down Payment Refund')]")
	private WebElement DownPaymentRefund;
	public WebElement DownPaymentRefund() {
		return DownPaymentRefund;
	}
	@FindBy(xpath = "//tr/td[@id='td_trxTemplateDetGridTbl_Id_P0035M_1_trxTemplateDetVO.LINE_NO'] ")
	private WebElement LN;
	public WebElement LN() {
		return LN;
	}
	
	@FindBy(xpath = "//input[@params='lineNo:trxTemplateDetVO.LINE_NO']")
	private WebElement LNvalidate;
	public WebElement LNvalidate() {
		return LNvalidate;
	}
	@FindBy(xpath = "//div/span[text()='Apply Formula']")
	private WebElement ApplyAmount;
	public WebElement ApplyAmount() {
		return ApplyAmount;
	}
	
	
	
	
	
	
}
