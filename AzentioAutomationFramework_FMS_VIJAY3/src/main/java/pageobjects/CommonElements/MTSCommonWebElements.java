package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MTSCommonWebElements {

	WebDriver driver;
	public MTSCommonWebElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "j_username")
	private WebElement iis_UserName;

	public WebElement iisUserName() {
		return iis_UserName;
	}

	@FindBy(id = "passwordInp")
	private WebElement iis_Password;

	public WebElement iisPassword() {
		return iis_Password;
	}

	@FindBy(id = "lookuptxt_COMP_CODE")
	private WebElement iis_CompanyCode;

	public WebElement iisCompanyCode() {
		return iis_CompanyCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_BRANCH_CODE']")
	private WebElement iis_BranchCode;

	public WebElement iisBranchCode() {
		return iis_BranchCode;
	}

	@FindBy(id = "legend")
	private WebElement iis_CompanyAndBranchLogin;

	public WebElement iisCompanyAndBranchLogin() {
		return iis_CompanyAndBranchLogin;
	}

	@FindBy(xpath = "//input[@name='branchesVO.BRIEF_DESC_ENG']")
	private WebElement iis_BranchCodeValidation;

	public WebElement iisBranchCodeValidation() {
		return iis_BranchCodeValidation;
	}

	@FindBy(id = "login")
	private WebElement iis_LoginButon;

	public WebElement iisLoginButon() {
		return iis_LoginButon;
	}

	@FindBy(xpath = "//span[contains(text(),' Continue')]")
	private WebElement iis_ContinueButton;

	public WebElement iisContinueButton() {
		return iis_ContinueButton;
	}

	@FindBy(xpath = "//label[contains(text(),'User')]")
	private WebElement iis_LoginValidation;

	public WebElement iisLoginValidation() {
		return iis_LoginValidation;
	}

	@FindBy(id = "hder_logout_icon_id")
	private WebElement iis_logoutButton;

	public WebElement iisLogoutButton() {
		return iis_logoutButton;
	}

	// user already login
	@FindBy(xpath = "//td[text()='User already logged in with different session, force other session logout?']")
	private WebElement iis_UserAlreadyLoginPopUp;

	public WebElement iis_UserAlreadyLoginPopUp() {
		return iis_UserAlreadyLoginPopUp;
	}

	@FindBy(xpath = "//a[@id='continueBtn']")
	private WebElement iis_UserAlreadyLoginYes;

	public WebElement iis_UserAlreadyLoginYes() {
		return iis_UserAlreadyLoginYes;
	}

}
