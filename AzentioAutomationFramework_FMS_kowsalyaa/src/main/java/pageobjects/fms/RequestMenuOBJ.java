package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestMenuOBJ {
	WebDriver driver;	
	public RequestMenuOBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	//@127919_Fms_Core
	@FindBy(xpath = "//td[text()='Request']")
	private WebElement FmsApplication_RequestMenu;
	public WebElement fmsappliactionrequestmenu() {
		return FmsApplication_RequestMenu;
	}
	@FindBy(xpath = "//td[text()='Request Financing']")
	private WebElement RequestMenu_Requestfinancing;
	public WebElement requestmenurequestfinancing() {
		return RequestMenu_Requestfinancing;
	}
	@FindBy(xpath = "//td[text()='Facilities Management']")
	private WebElement Requestfinancing_facilityManagement;
	public WebElement requestfinancingfacilitymanagement() {
		return Requestfinancing_facilityManagement;
	}
	@FindBy(xpath = "//td[text()='Request For Financing']")
	private WebElement Requestfinancing_Requestforfinancing;
	public WebElement requestfinancingrequestforfinancing() {
		return Requestfinancing_Requestforfinancing;
	}
	
	@FindBy(xpath = "//*[@id='RFFRF00LC']/span[2]")
	private WebElement Requestfinancing_Requestforfinancing_first;
	public WebElement requestfinancingrequestforfinancingFirst() {
		return Requestfinancing_Requestforfinancing_first;
	}
}





//div[@id='_selenuimRFFRF00']//ul/div/li/a/span[2]