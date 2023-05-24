package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FMS_Reports_Pagination_Obj {

	WebDriver driver;

	public FMS_Reports_Pagination_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//td[text()='Reports']")
	private WebElement fms_Reports_Screen;
	public WebElement fmsReportsScreen() {
		return fms_Reports_Screen;
	}
	
	@FindBy(xpath ="//span[text()='Availment Ticket']")
	private WebElement fms_Availment_Ticket_SubMenu;
	public WebElement fmsAvilmentTicketSubMenu() {
		return fms_Availment_Ticket_SubMenu;
	}
	
	@FindBy(id="_popup_path_sol_confirm_ok")
	private WebElement fms_CIF_No_popok;
	public WebElement fmsCIFNopopok() {
		return fms_CIF_No_popok;
	}
	
	@FindBy(xpath="//input[@name='param~RA_CIF_NO~NUMBER']")
	private WebElement fms_CIF_No;
	public WebElement fmsCIFNo() {
		return fms_CIF_No;
	}
	
	
	@FindBy(id = "Reports / Availment Ticket")
	private WebElement fms_Random_Click;
	public WebElement fmsRandomClick() {
		return fms_Random_Click;
	}
	
	@FindBy(xpath="//label[text()='Retrieve ']/ancestor::button")
	private WebElement fms_Retrieve_Key;
	public WebElement fmsRetrieveKey() {
		return fms_Retrieve_Key;
	}
	
	@FindBy(xpath="//span[text()='Page 1 of 4']")
	private WebElement Availment_Page_1to4;
	public WebElement AvailmentPage1to4() {
		return Availment_Page_1to4;
	}
	
	@FindBy(xpath="//span[text()='Page 2 of 4']")
	private WebElement Availment_Page_2to4;
	public WebElement AvailmentPage2to4() {
		return Availment_Page_2to4;
	}
	
	@FindBy(xpath="//span[text()='Page 3 of 4']")
	private WebElement Availment_Page_3to4;
	public WebElement AvailmentPage3to4() {
		return Availment_Page_3to4;
	}
	
	@FindBy(xpath="//span[text()='Page 4 of 4']")
	private WebElement Availment_Page_4to4;
	public WebElement AvailmentPage4to4() {
		return Availment_Page_4to4;
	}
}
