package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IISCommonElements {
	WebDriver driver;

	public IISCommonElements(WebDriver driver) {
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

		@FindBy(id="legend")
		private WebElement iis_CompanyAndBranchLogin;
		public WebElement iisCompanyAndBranchLogin() {
			return iis_CompanyAndBranchLogin;
		}
		@FindBy(xpath="//input[@name='branchesVO.BRIEF_DESC_ENG']")
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
		@FindBy(id="hder_logout_icon_id")
		private WebElement iis_logoutButton;
		public WebElement iisLogoutButton()	{
			return iis_logoutButton;
		}
		@FindBy(xpath="//span[contains(text(),' Yes')]//parent::a")
		private WebElement iis_ForceLogoutYesButton;
		public WebElement iisForceLogoutYesButton(){
			return iis_ForceLogoutYesButton;
		}
		@FindBy(xpath="//div[@id='div__popup_path_sol_ok']//div[2]//div")
		private WebElement iis_AlertPopup;
		public WebElement iisAlertPopup() {
			return iis_AlertPopup;
		}
		@FindBy(xpath="//span[contains(text(),'Maintenance')]")
		private WebElement iis_MaintenanceButton;
		public WebElement iisMaintenanceButton(){
			return iis_MaintenanceButton;
		}
		@FindBy(xpath="//label[text()='Approve ']//ancestor::button")
		private WebElement iis_ApproveButton;
		public WebElement iisApproveButton() {
			return iis_ApproveButton;
		}
		@FindBy(xpath="//div[text()='Confirm Approve Process']//ancestor::div//center//input[1]")
		private WebElement iis_ConfirmApprovOkButton;
		public WebElement iisConfirmApprovOkButton() {
			return iis_ConfirmApprovOkButton;
		}
		@FindBy(xpath="//div[text()='Record was Approved Successfully']//ancestor::div//center//input[1]")
		private WebElement iis_ApproveSuccessOkButton;
		public WebElement iisApproveSuccessOkButton()	{
			return iis_ApproveSuccessOkButton;
		}
		@FindBy(xpath="//button[@value='Submit']")
		private WebElement iis_SaveButton;
		public WebElement iisSaveButton()	{
			return iis_SaveButton;
		}
		@FindBy(xpath="//div[text()='Confirm Save Process']//ancestor::div//center//input[1]")
		private WebElement iis_SaveConfirmOkButton;
		public WebElement iisSaveConfirmOkButton()	{
			return iis_SaveConfirmOkButton;
		}
		@FindBy(xpath="//div[text()='Confirm Save Record']//ancestor::div//center//input[1]")
		private WebElement iis_SaveRecordConfirmOkButton;
		public WebElement iisSaveRecordConfirmOkButton()	{
			return iis_SaveRecordConfirmOkButton;
		}
		@FindBy(xpath="//span[@class='displayProgIcon']//img")
		private WebElement iis_LoadingImage;
		public WebElement iisLoadingImage()	{
			return iis_LoadingImage;
		}
		@FindBy(xpath="//div[text()='Record Saved Successfully']//ancestor::div//center//input[1]")
		private WebElement iis_SaveSuccessOkButton;
		public WebElement iisSaveSuccessOkButton()	{
			return iis_SaveSuccessOkButton;
		}
		@FindBy(xpath="//center//input[@value='Ok']")
		private WebElement iis_OkButton;
		public WebElement iisOkButton()	{
			return iis_OkButton;
		}
		@FindBy(xpath="//span[text()='close']")
		private WebElement iis_AlertCloseButton;
		public WebElement iisAlertCloseButton()	{
			return iis_AlertCloseButton;
		}
		// user already login
			@FindBy(xpath="//td[text()='User already logged in with different session, force other session logout?']")
			private WebElement iis_UserAlreadyLoginPopUp;
			public WebElement iis_UserAlreadyLoginPopUp()	{
				return iis_UserAlreadyLoginPopUp;
			}
			
			@FindBy(xpath="//a[@id='continueBtn']")
			private WebElement iis_UserAlreadyLoginYes;
			public WebElement iis_UserAlreadyLoginYes()	{
				return iis_UserAlreadyLoginYes;
			}

}
