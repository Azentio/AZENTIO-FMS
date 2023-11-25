package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportAvailment_007_OBJ {
	WebDriver driver;

	public ReportAvailment_007_OBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"_selenuimU000\"]/h3")
	private WebElement Report;
	public WebElement Report() {
		return Report;

	}

	@FindBy(xpath = "//*[@id=\"U010\"]")
	private WebElement AvailmentTicket;
	public WebElement AvailmentTicket() {
		return AvailmentTicket;

	}
	@FindBy(xpath = "//*[@id=\"paramsDivCollapsible_U010\"]/div[1]")
	private WebElement Parameter;
	public WebElement Parameter() {
		return Parameter;

	}
	@FindBy(xpath = "(//input[@class='path-theme-cust-input liveSearchText liveSearchCompSize ui-state-focus liveSearchInputCorner '])[1]")
	private WebElement CIFNo;
	public WebElement CIFNo() {
		return CIFNo;

	}
	@FindBy(xpath = "//*[@id=\"retrieveBtn_U010\"]")
	private WebElement RetriveButton;
	public WebElement RetriveButton() {
		return RetriveButton;

	}
	@FindBy(xpath = "//*[@id=\"FMSU010S2\"]")
	private WebElement AvailmentTicketsubDrawdown;
	public WebElement AvailmentTicketsubDrawdown() {
		return AvailmentTicketsubDrawdown;

	}
	@FindBy(xpath = "/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td")
	private WebElement Drawdowndisplayingreport;
	public WebElement Drawdowndisplayingreport() {
		return Drawdowndisplayingreport;

	}
	@FindBy(xpath = "//*[@id=\"FMSU010S4\"]")
	private WebElement AvailmentTicketsubfacility;
	public WebElement AvailmentTicketsubfacility() {
		return AvailmentTicketsubfacility;

	}
	@FindBy(xpath = "/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td")
	private WebElement facilitydisplayingdetail;
	public WebElement facilitydisplayingdetail() {
		return facilitydisplayingdetail;

	}
	@FindBy(xpath = "//*[@id=\"p_param_RA_BRANCH_CODE_NUMBER_FMSU010S2\"]")
	private WebElement BranchCode;
	public WebElement BranchCode() {
		return BranchCode;

	}
	@FindBy(xpath = "//*[@id=\"retrieveBtn_FMSU010S2\"]")
	private WebElement Retrive;
	public WebElement Retrive() {
		return Retrive;

	}
	@FindBy(xpath = "//*[@id=\"chkHeadFootId_U010\"]")
	private WebElement WithoutHeader;
	public WebElement WithoutHeader() {
		return WithoutHeader;

	}
	}

