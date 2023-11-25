package pageobjects.fms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerGrading_001_OBJ {
	WebDriver driver;
	public CustomerGrading_001_OBJ(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//*[@id=\"_selenuimWIFT003\"]/li/a")
	private WebElement GRADING;
	public WebElement GRADING() {
		return GRADING;
	}
	@FindBy(xpath = "//span[text()='Maintenance']/preceding-sibling::span[@menuvar='WIFT003MT']/parent::a")
	private WebElement MAINTENANCE;
	public WebElement MAINTENANCE() {
		return MAINTENANCE;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_Application_Ref_WIFT003MT']")
	private WebElement APPIREF;
	public WebElement APPIREF() {
		return APPIREF;
	}
	@FindBy(xpath = "//*[@id=\"customerGradingDetailsGrid_WIFT003MT\"]")
	private WebElement ELIGIBLEGRADINGFACTOR;
	public WebElement ELIGIBLEGRADINGFACTOR() {
		return ELIGIBLEGRADINGFACTOR;
	}
	@FindBy(xpath = "//*[@id=\"1_custgradedetvo.CUST_GRADE_SCORE_lookuptxt_custGradingDetails_Id_WIFT003MT\"]")
	private WebElement GRIDELINENO;
	public WebElement GRIDELINENO() {
		return GRIDELINENO;
	}
	@FindBy(xpath = "//*[@id=\"td_custGradingDetails_Id_WIFT003MT_1_actualScore\"]")
	private WebElement ACTUALSCOREVALUE;
	public WebElement ACTUALSCOREVALUE() {
		return ACTUALSCOREVALUE;
	}
	@FindBy(xpath = "//*[@id=\"td_custGradingDetails_Id_WIFT003MT_1_custgradedetvo.LINE_NBR\"]")
	private WebElement LN;
	public WebElement LN() {
		return LN;
	}
	
}
