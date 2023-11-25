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
	
	@FindBy(xpath = "//*[@id=\"_selenuimBAJR_\"]/li/a")
	private WebElement bajRequest;

	public WebElement bajRequest() {
		return bajRequest;
	}
	
	@FindBy(xpath = "//a[@id='BAJA_AP']")
	private WebElement approveScreenInBajApplication;

	public WebElement approveScreenInBajApplication() {
		return approveScreenInBajApplication;
	}
	
	@FindBy(xpath = "//*[@id=\"BAJR_MT\"]")
	private WebElement maintanencescreen;

	public WebElement maintanencescreen() {
		return maintanencescreen;
	}
	@FindBy(xpath = "//*[@id=\"requestFinancingApplicationFor_BARRF00MT\"]")
	private WebElement RESEAONFORSUBMISSION;

	public WebElement RESEAONFORSUBMISSION() {
		return RESEAONFORSUBMISSION;
	}
	@FindBy(xpath = "//*[@id=\"requestFinancingApplicationFor_BARRF00MT\"]")
	private WebElement facilitytype;

	public WebElement facilitytype() {
		return facilitytype;
	}
	@FindBy(xpath = "//*[@id=\"lookuptxt_requestFinanacingCif_BARRF00MT\"]")
	private WebElement customer;

	public WebElement customer() {
		return customer;
	}
	
	@FindBy(xpath = "//*[@id=\"requestFinancingFacilityTotalvalue_BARRF00MT\"]")
	private WebElement totallimit;

	public WebElement totallimit() {
		return totallimit;
	}
	
	@FindBy(xpath = "//*[@id=\"requestFinancingLimitDtlsTabs_BARRF00MT\"]/a")
	private WebElement disbursement;

	public WebElement disbursement() {
		return disbursement;
	}
	
	@FindBy(xpath = "//*[@id=\"add_RequestFinancingLimitDetailsGridId_BARRF00MT\"]/div/span")
	private WebElement add;

	public WebElement add() {
		return add;
	}
	
	@FindBy(xpath = "//*[@id=\"lookuptxt_requestFinancingLimitDetailsGeneralFacilityProductClass_BARRF00MT\"]")
	private WebElement Productcalsstab;

	public WebElement Productcalsstab() {
		return Productcalsstab;
	}
	
	@FindBy(xpath = "//*[@id=\"limitDetails_add_btn_BARRF00MT\"]")
	private WebElement addbtn;

	public WebElement addbtn() {
		return addbtn;
	}
	
	@FindBy(xpath = "//*[@id=\"infoBar\"]/table/tbody/tr/td[2]/span[1]")
	private WebElement smarttab;

	public WebElement smarttab() {
		return smarttab;
	}
	
	@FindBy(xpath = "//*[@id=\"addDate_2_BARRF00MT\"]")
	private WebElement texttab;

	public WebElement texttab() {
		return texttab;
	}
	
	@FindBy(xpath = "//*[@id=\"smartDetailNoSave_BARRF00MT\"]")
	private WebElement okundersmart;

	public WebElement okundersmart() {
		return okundersmart;
	}
	@FindBy(xpath = "//*[@id=\"smartDetailNoSave_BARRF00MT\"]")
	private WebElement save;

	public WebElement save() {
		return save;
	}
	@FindBy(xpath = "//*[@id=\"smartDetailNoSave_BARRF00MT\"]")
	private WebElement validate;

	public WebElement validate() {
		return validate;
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
