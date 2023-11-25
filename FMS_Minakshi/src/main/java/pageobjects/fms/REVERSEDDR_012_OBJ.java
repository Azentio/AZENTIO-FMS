package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class REVERSEDDR_012_OBJ {
	WebDriver driver;
	public REVERSEDDR_012_OBJ(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//td[text()='Draw Down Request']/preceding-sibling::td/span/span")
	private WebElement drawDownRequestSubMenu_WF_482;
	public WebElement drawDownRequestSubMenu_WF_482() {
		return drawDownRequestSubMenu_WF_482;
	}
	@FindBy(xpath = "//a[@id='WIFT009MT']")
	private WebElement drawDownRequestMaintenance_WF_482;
	public WebElement drawDownRequestMaintenance_WF_482() {
		return drawDownRequestMaintenance_WF_482;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_drawDownRequestProduct_Class_WIFT009MT']")
	private WebElement productClassDrawDownRequestMaintenance_WF_482;
	public WebElement productClassDrawDownRequestMaintenance_WF_482() {
		return productClassDrawDownRequestMaintenance_WF_482;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestFC_Amount_WIFT009MT']")
	private WebElement fcAmountDrawDownRequestMaintenance_WF_482;
	public WebElement fcAmountDrawDownRequestMaintenance_WF_482() {
		return fcAmountDrawDownRequestMaintenance_WF_482;
	}
	@FindBy(xpath = "//li[@id='drawDownRequestAdditionDetailsTabs_WIFT009MT']")
	private WebElement drawDownAdditionalDetailsDrawDownRequestMaintenance_WF_482;
	public WebElement drawDownAdditionalDetailsDrawDownRequestMaintenance_WF_482() {
		return drawDownAdditionalDetailsDrawDownRequestMaintenance_WF_482;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_drawDownRequestFacilityReference_WIFT009MT']")
	private WebElement facilityReferenceDrawDownRequestMaintenance_WF_482;
	public WebElement facilityReferenceDrawDownRequestMaintenance_WF_482() {
		return facilityReferenceDrawDownRequestMaintenance_WF_482;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_drawDownRequestDrawDownType_WIFT009MT']")
	private WebElement drawDownTypeDrawDownRequestMaintenance_WF_482;
	public WebElement drawDownTypeDrawDownRequestMaintenance_WF_482() {
		return drawDownTypeDrawDownRequestMaintenance_WF_482;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestLongNameEnglish_WIFT009MT']")
	private WebElement descriptionEnglishDrawDownRequestMaintenance_WF_482;
	public WebElement descriptionEnglishDrawDownRequestMaintenance_WF_482() {
		return descriptionEnglishDrawDownRequestMaintenance_WF_482;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestValueDate_WIFT009MT']")
	private WebElement valueDateDrawDownRequestMaintenance_WF_482;
	public WebElement valueDateDrawDownRequestMaintenance_WF_482() {
		return valueDateDrawDownRequestMaintenance_WF_482;
	}
	@FindBy(xpath = "//input[@id=\"drawDownRequestMaturityDate_WIFT009UP\"]")
	private WebElement MaturityDateDrawDownRequestMaintenance_WF_482;
	public WebElement MaturityDateDrawDownRequestMaintenance_WF_482() {
		return MaturityDateDrawDownRequestMaintenance_WF_482;
	}
	@FindBy(xpath = "//button[@id='drawdownrequest_save_btn_WIFT009MT']")
	private WebElement saveButtonDrawDownRequestMaintenance_WF_482;
	public WebElement saveButtonDrawDownRequestMaintenance_WF_482() {
		return saveButtonDrawDownRequestMaintenance_WF_482;
	}
	@FindBy(xpath = "//button[@id=\"drawdownrequest_save_btn_WIFT009UP\"]")
	private WebElement saveButtonDrawDownRequestUpdate_WF_482;
	public WebElement saveButtonDrawDownRequestUpdate_WF_482() {
		return saveButtonDrawDownRequestUpdate_WF_482;
	}
	@FindBy(xpath = "//div[text()='Success']/parent::div/following-sibling::div/div")
	private WebElement getRequestIdInDrawDownRequest_WF_482;
 
	public WebElement getRequestIdInDrawDownRequest_WF_482() {
		return getRequestIdInDrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestGridTbl_Id_WIFT009VD_gs_fmsDrawDownVO.CODE']")
	private WebElement searchCodeInVerifyScreenDrawDownRequest_WF_482;
 
	public WebElement searchCodeInVerifyScreenDrawDownRequest_WF_482() {
		return searchCodeInVerifyScreenDrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//td[@id='td_drawDownRequestGridTbl_Id_WIFT009VD_1_fmsDrawDownVO.CODE']")
	private WebElement selectSearchedCodeInVerifyScreenDrawDownRequest_WF_482;
 
	public WebElement selectSearchedCodeInVerifyScreenDrawDownRequest_WF_482() {
		return selectSearchedCodeInVerifyScreenDrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//button[@id='drawdownrequest_validate_btn_WIFT009VD']")
	private WebElement verifyButtonInVerifyScreenDrawDownRequest_WF_482;
 
	public WebElement verifyButtonInVerifyScreenDrawDownRequest_WF_482() {
		return verifyButtonInVerifyScreenDrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//a[@id='WIFT009AP']")
	private WebElement ApproveScreen_DrawDownRequest_WF_482;
	public WebElement ApproveScreen_DrawDownRequest_WF_482() {
		return ApproveScreen_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//button[@id='drawdownrequest_reject_btn_WIFT009AP']/parent::div/preceding-sibling::div//button")
	private WebElement approveButtonInApproveScreenDrawDownRequest_WF_482;
	public WebElement approveButtonInApproveScreenDrawDownRequest_WF_482() {
		return approveButtonInApproveScreenDrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//li[@id='drawDownRequestAdditionDetailsTabs_WIFT009UP']")
	private WebElement additionalDetails_UpdateAfterApproveDrawDownRequest_WF_482;
	public WebElement additionalDetails_UpdateAfterApproveDrawDownRequest_WF_482() {
		return additionalDetails_UpdateAfterApproveDrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestFC_Amount_WIFT009UP']")
	private WebElement FCAmount_UpdateAfterApproveDrawDownRequest_WF_482;
	public WebElement FCAmount_UpdateAfterApproveDrawDownRequest_WF_482() {
		return FCAmount_UpdateAfterApproveDrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//button[@id='drawdownrequest_save_btn_WIFT009UP']")
	private WebElement saveButton_UpdateAfterApproveDrawDownRequest_WF_482;
	public WebElement saveButton_UpdateAfterApproveDrawDownRequest_WF_482() {
		return saveButton_UpdateAfterApproveDrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//a[text()='WIFAK APPLICATION / WIFAK APPLICATION / Application For Financial Facilities / Maintenance']/parent::td/following-sibling::td/span")
	private WebElement closeMaintenanceScreen_DrawDownRequest_WF_482;
	public WebElement closeMaintenanceScreen_DrawDownRequest_WF_482() {
		return closeMaintenanceScreen_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestGridTbl_Id_WIFT009UP_gs_fmsDrawDownVO.CODE']")
	private WebElement searchCodeInMaintenanceScreen_DrawDownRequest_WF_482;
	public WebElement searchCodeInMaintenanceScreen_DrawDownRequest_WF_482() {
		return searchCodeInMaintenanceScreen_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//td[@id='td_drawDownRequestGridTbl_Id_WIFT009UP_1_fmsDrawDownVO.CODE']")
	private WebElement selectSearchedCodeInMaintenanceScreen_DrawDownRequest_WF_482;
	public WebElement selectSearchedCodeInMaintenanceScreen_DrawDownRequest_WF_482() {
		return selectSearchedCodeInMaintenanceScreen_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestValueCV_Amount_WIFT009MT']")
	private WebElement cvAmountUpdatedInMaintenanceScreen_DrawDownRequest_WF_482;
	public WebElement cvAmountUpdatedInMaintenanceScreen_DrawDownRequest_WF_482() {
		return cvAmountUpdatedInMaintenanceScreen_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestDDAmount_FC_WIFT009UP']")
	private WebElement amtInFacilityCYAmountUpdatedInMaintenanceScreen_DrawDownRequest_WF_482;
	public WebElement amtInFacilityCYAmountUpdatedInMaintenanceScreen_DrawDownRequest_WF_482() {
		return amtInFacilityCYAmountUpdatedInMaintenanceScreen_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//a[@id='WIFT009VD']")
	private WebElement verifyScreen_DrawDownRequest_WF_482;
	public WebElement verifyScreen_DrawDownRequest_WF_482() {
		return verifyScreen_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//a[@id=\"infoBarSearchButton_WIFT009MT\"]")
	private WebElement SearchMaintenance_DrawDownRequest_WF_482;
	public WebElement SearchMaintenance_DrawDownRequest_WF_482() {
		return SearchMaintenance_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//td[@id=\"drawDownRequestGridTbl_Id_WIFT009UP_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement ClearSearchupdate_DrawDownRequest_WF_482;
	public WebElement ClearSearchupdate_DrawDownRequest_WF_482() {
		return ClearSearchupdate_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//td[@id=\"drawDownRequestGridTbl_Id_WIFT009VD_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement ClearSearchVerify_DrawDownRequest_WF_482;
	public WebElement ClearSearchVerify_DrawDownRequest_WF_482() {
		return ClearSearchVerify_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//td[@id=\"drawDownRequestGridTbl_Id_WIFT009AP_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement ClearSearchApprove_DrawDownRequest_WF_482;
	public WebElement ClearSearchApprove_DrawDownRequest_WF_482() {
		return ClearSearchApprove_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//td[@id=\"td_drawDownRequestGridTbl_Id_WIFT009UP_1_fmsDrawDownVO.CODE\"]")
	private WebElement SelectSearchupdate_DrawDownRequest_WF_482;
	public WebElement SelectSearchupdate_DrawDownRequest_WF_482() {
		return SelectSearchupdate_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//td[@id=\"td_drawDownRequestGridTbl_Id_WIFT009VD_1_fmsDrawDownVO.CODE\"]")
	private WebElement SelectSearchVerify_DrawDownRequest_WF_482;
	public WebElement SelectSearchVerify_DrawDownRequest_WF_482() {
		return SelectSearchVerify_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//td[@id=\"td_drawDownRequestGridTbl_Id_WIFT009AP_1_fmsDrawDownVO.CODE\"]")
	private WebElement SelectSearchApprove_DrawDownRequest_WF_482;
	public WebElement SelectSearchApprove_DrawDownRequest_WF_482() {
		return SelectSearchApprove_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestGridTbl_Id_WIFT009AP_gs_fmsDrawDownVO.CODE']")
	private WebElement searchCodeApproveScreen_DrawDownRequest_WF_482;
	public WebElement searchCodeApproveScreen_DrawDownRequest_WF_482() {
		return searchCodeApproveScreen_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//td[@id='td_drawDownRequestGridTbl_Id_WIFT009AP_1_fmsDrawDownVO.CODE']")
	private WebElement selectsearchedCodeApproveScreen_DrawDownRequest_WF_482;
	public WebElement selectsearchedCodeApproveScreen_DrawDownRequest_WF_482() {
		return selectsearchedCodeApproveScreen_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//a[@id='WIFT009UP']")
	private WebElement updateAfterApproveScreen_DrawDownRequest_WF_482;
	public WebElement updateAfterApproveScreen_DrawDownRequest_WF_482() {
		return updateAfterApproveScreen_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestGridTbl_Id_WIFT009UP_gs_fmsDrawDownVO.CODE']")
	private WebElement searchCodeInupdateAfterApproveScreen_DrawDownRequest_WF_482;
	public WebElement searchCodeInupdateAfterApproveScreen_DrawDownRequest_WF_482() {
		return searchCodeInupdateAfterApproveScreen_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//td[@id='td_drawDownRequestGridTbl_Id_WIFT009UP_1_fmsDrawDownVO.CODE']")
	private WebElement selectSearchedCodeInupdateAfterApproveScreen_DrawDownRequest_WF_482;
	public WebElement selectSearchedCodeInupdateAfterApproveScreen_DrawDownRequest_WF_482() {
		return selectSearchedCodeInupdateAfterApproveScreen_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestLoanTypeDesc_WIFT009MT']")
	private WebElement facilityNameValidation_DrawDownRequest_WF_482;
	public WebElement facilityNameValidation_DrawDownRequest_WF_482() {
		return facilityNameValidation_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestProductClassDesc_WIFT009MT']")
	private WebElement productClassNameValidation_DrawDownRequest_WF_482;
	public WebElement productClassNameValidation_DrawDownRequest_WF_482() {
		return productClassNameValidation_DrawDownRequest_WF_482;
	}
	@FindBy(xpath = "//*[@id=\"WIFT009RV\"]")
	private WebElement reversesubmenu;
	public WebElement reversesubmenu() {
		return reversesubmenu;
	}
	@FindBy(xpath = "//*[@id=\"drawDownRequestGridTbl_Id_WIFT009RV_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement clearicon;
	public WebElement clearicon() {
		return clearicon;
	}
	@FindBy(xpath = "//*[@id=\"td_drawDownRequestGridTbl_Id_WIFT009RV_1_fmsDrawDownVO.CODE\"]")
	private WebElement retrivedata;
	public WebElement retrivedata() {
		return retrivedata;
	}
	@FindBy(xpath = "")
	private WebElement reversebutton;
	public WebElement reversebutton() {
		return reversebutton;
	}
}





