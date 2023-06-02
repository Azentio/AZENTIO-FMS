package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReversingtheoffbalanceOBJ {
	WebDriver driver;
	public ReversingtheoffbalanceOBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this );
	}
	@FindBy(xpath = "//span[@id='spanLookup_applicationfacilityLimitDetailsACC_SL_NO_WIFT001MT']")
	private WebElement AccountNo_Details_Searchbox;
	public WebElement accountnodetailssearchbox() {
		return AccountNo_Details_Searchbox;
	}
	@FindBy(xpath = "(//tr[@id='1'])[4]")
	private WebElement Retriveddata_Doubletap;
	public WebElement retrivedatadoubletap() {
		return Retriveddata_Doubletap;
	}
	@FindBy(xpath = "//button[@id='applicationfacility_chargesdtls_btn_WIFT001MT']")
	private WebElement Charge_Details;
	public WebElement chargedetails() {
		return Charge_Details;
	}
	@FindBy(xpath = "//input[@id='1_fmsapplchargesVO.COLLECT_AT_FAC_APPROVAL']")
	private WebElement Collect_FacApproval;
	public WebElement collectfacapproval() {
		return Collect_FacApproval;
	}
	@FindBy(xpath = "/html/body/div[36]/div[11]/div/button/span")
	private WebElement Charge_Details_Okbtn;
	public WebElement chargedetailsokbtn() {
		return Charge_Details_Okbtn;
	}
	@FindBy(xpath = "//td[text()='Facilities Management']")
	private WebElement Facility_Management;
	public WebElement facilitymanagement() {
		return Facility_Management;
	}
	
	
	
	

}
