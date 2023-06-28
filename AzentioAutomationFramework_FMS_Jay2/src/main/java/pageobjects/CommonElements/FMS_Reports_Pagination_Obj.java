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
	private WebElement fms_Reports_Screen_610;
	public WebElement fms_Reports_Screen_610() {
		return fms_Reports_Screen_610;
	}
	
	@FindBy(xpath ="//span[text()='Availment Ticket']")
	private WebElement fms_AvailmentTicket_SubMenu_610;
	public WebElement fms_AvailmentTicket_SubMenu_610() {
		return fms_AvailmentTicket_SubMenu_610;
	}
	
		
	@FindBy(xpath="//input[@id='lookuptxt_p_param_RA_CIF_NO_NUMBER_U010']")
	private WebElement enterCIFNO_InavalimentTicket_610;
	public WebElement enterCIFNO_InavalimentTicket_610() {
		return enterCIFNO_InavalimentTicket_610;
	}
	
	
	@FindBy(xpath="//label[text()='Retrieve ']/ancestor::button")
	private WebElement fms_RetrieveKey_InavalimentTicket_610;
	public WebElement fms_RetrieveKey_InavalimentTicket_610() {
		return fms_RetrieveKey_InavalimentTicket_610;
	}
	
	@FindBy(xpath="//span[text()='Page 1 of 4']")
	private WebElement Availment_Page_1to4_InavalimentTicket_610;
	public WebElement AvailmentPage1to4_InavalimentTicket_610() {
		return Availment_Page_1to4_InavalimentTicket_610;
	}
	
	@FindBy(xpath="//span[text()='Page 2 of 4']")
	private WebElement Availment_Page_2to4_InavalimentTicket_610;
	public WebElement AvailmentPage2to4_InavalimentTicket_610() {
		return Availment_Page_2to4_InavalimentTicket_610;
	}
	
	@FindBy(xpath="//span[text()='Page 3 of 4']")
	private WebElement Availment_Page_3to4_InavalimentTicket_610;
	public WebElement AvailmentPage3to4_InavalimentTicket_610() {
		return Availment_Page_3to4_InavalimentTicket_610;
	}
	
	@FindBy(xpath="//span[text()='Page 4 of 4']")
	private WebElement Availment_Page_4to4_InavalimentTicket_610;
	public WebElement AvailmentPage4to4_InavalimentTicket_610() {
		return Availment_Page_4to4_InavalimentTicket_610;
	}
}
