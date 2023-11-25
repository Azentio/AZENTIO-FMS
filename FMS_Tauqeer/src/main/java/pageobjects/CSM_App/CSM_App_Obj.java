package pageobjects.CSM_App;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_App_Obj {
	WebDriver driver;
	public CSM_App_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[text()='Request']/preceding-sibling::td")
	private WebElement requestMainMenu;

	public WebElement requestMainMenu() {
		return requestMainMenu;
	}
	
	@FindBy(xpath = "//td[text()='Request Application']/preceding-sibling::td")
	private WebElement requestApplicationSubMenu;

	public WebElement requestApplicationSubMenu() {
		return requestApplicationSubMenu;
	}
	
	@FindBy(xpath = "//td[text()='Request Application']/ancestor::a/following-sibling::ul//td[text()='Baj Application']/preceding-sibling::td")
	private WebElement bajApplicationSubMenu;

	public WebElement bajApplicationSubMenu() {
		return bajApplicationSubMenu;
	}
	
	@FindBy(xpath = "//a[@id='BAJA_AP']")
	private WebElement approveScreenInBajApplication;

	public WebElement approveScreenInBajApplication() {
		return approveScreenInBajApplication;
	}
	
	@FindBy(xpath = "//input[@id='ctsRequestGridTbl_Id_BAAT001AP_gs_ctsRequestVO.REQ_NO']")
	private WebElement searchRequestNumberInApproveScreenUnderBajApplication;

	public WebElement searchRequestNumberInApproveScreenUnderBajApplication() {
		return searchRequestNumberInApproveScreenUnderBajApplication;
	}
	
	@FindBy(xpath = "//td[@id='td_ctsRequestGridTbl_Id_BAAT001AP_1_ctsRequestVO.REQ_NO']")
	private WebElement selectSearchedRequestNumberInApproveScreenUnderBajApplication;

	public WebElement selectSearchedRequestNumberInApproveScreenUnderBajApplication() {
		return selectSearchedRequestNumberInApproveScreenUnderBajApplication;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approve_btn_BAAT001AP']")
	private WebElement approveButtonInApproveScreenBajApplication;

	public WebElement approveButtonInApproveScreenBajApplication() {
		return approveButtonInApproveScreenBajApplication;
	}
	
	@FindBy(xpath = "//td[text()='Request Management']/preceding-sibling::td")
	private WebElement requestManagementInBajApplication;

	public WebElement requestManagementInBajApplication() {
		return requestManagementInBajApplication;
	}
	
	@FindBy(xpath = "//span[text()='Management - Process Branch']/preceding-sibling::span")
	private WebElement managementProcessBranchInBajApplication;

	public WebElement managementProcessBranchInBajApplication() {
		return managementProcessBranchInBajApplication;
	}
	
	@FindBy(xpath = "//input[@id='requestProcessGridId_RP002MT_gs_ctsRequestVO.REQ_NO']")
	private WebElement searchApplicationrecordInManagementBranchProcess;

	public WebElement searchApplicationrecordInManagementBranchProcess() {
		return searchApplicationrecordInManagementBranchProcess;
	}
	
	@FindBy(xpath = "//td[@id='td_requestProcessGridId_RP002MT_1_ctsRequestVO.BRANCH']")
	private WebElement selectSearchedApplicationrecordInManagementBranchProcess;

	public WebElement selectSearchedApplicationrecordInManagementBranchProcess() {
		return selectSearchedApplicationrecordInManagementBranchProcess;
	}
	
	@FindBy(xpath = "//button[@id='requestProcess_Btn_RP002MT']")
	private WebElement processButtonInManagementBranchProcess;

	public WebElement processButtonInManagementBranchProcess() {
		return processButtonInManagementBranchProcess;
	}
	
	@FindBy(id = "_popup_path_sol_ok")
	private WebElement okButtonInSucessPopUpManagementBranchProcess;

	public WebElement okButtonInSucessPopUpManagementBranchProcess() {
		return okButtonInSucessPopUpManagementBranchProcess;
	}
}
