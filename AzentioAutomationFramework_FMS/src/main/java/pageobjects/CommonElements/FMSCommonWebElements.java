package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FMSCommonWebElements {
	WebDriver driver;

	public FMSCommonWebElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "j_username")
	private WebElement fms_UserName;

	public WebElement fmsUserName() {
		return fms_UserName;
	}

	@FindBy(id = "passwordInp")
	private WebElement fms_Password;

	public WebElement fmsPassword() {
		return fms_Password;
	}

	@FindBy(id = "lookuptxt_COMP_CODE")
	private WebElement fms_CompanyCode;

	public WebElement fmsCompanyCode() {
		return fms_CompanyCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_BRANCH_CODE']")
	private WebElement fms_BranchCode;

	public WebElement fmsBranchCode() {
		return fms_BranchCode;
	}

	@FindBy(id="legend")
	private WebElement fms_CompanyAndBranchLogin;

	public WebElement fmsCompanyAndBranchLogin() {
		return fms_CompanyAndBranchLogin;
	}
	@FindBy(xpath="//input[@name='branchesVO.BRIEF_DESC_ENG']")
	private WebElement fms_BranchCodeValidation;

	public WebElement fmsBranchCodeValidation() {
		return fms_BranchCodeValidation;
	}

	@FindBy(id = "login")
	private WebElement fms_LoginButon;

	public WebElement fmsLoginButon() {
		return fms_LoginButon;
	}

	@FindBy(xpath = "//span[contains(text(),' Continue')]")
	private WebElement fms_ContinueButton;

	public WebElement fmsContinueButton() {
		return fms_ContinueButton;
	}

	@FindBy(xpath = "//label[contains(text(),'User')]")
	private WebElement fms_LoginValidation;

	public WebElement fmsLoginValidation() {
		return fms_LoginValidation;
	}
	@FindBy(id="hder_logout_icon_id")
	private WebElement fms_logoutButton;
	public WebElement fmsLogoutButton()
	{
		return fms_logoutButton;
	}

	// user already login
	@FindBy(xpath = "//td[text()='User already logged in with different session, force other session logout?']")
	private WebElement fms_UserAlreadyLoginPopUp;

	public WebElement fms_UserAlreadyLoginPopUp() {
		return fms_UserAlreadyLoginPopUp;
	}

	@FindBy(xpath = "//a[@id='continueBtn']")
	private WebElement fms_UserAlreadyLoginYes;

	public WebElement fms_UserAlreadyLoginYes() {
		return fms_UserAlreadyLoginYes;
	}

}
