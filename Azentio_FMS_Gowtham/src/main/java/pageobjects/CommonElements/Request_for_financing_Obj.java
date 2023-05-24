package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Request_for_financing_Obj {
	WebDriver driver;

	public Request_for_financing_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[text()='WIFAK APPLICATION']")
	private WebElement Scroolinto_Click_RequestForFinancin;
	public WebElement Scroolinto_Click_RequestForFinancin() {
		return Scroolinto_Click_RequestForFinancin;
	}
	
	@FindBy(xpath = "//td[text()='REQUEST FOR FINANCIN']")
	private WebElement RequestForFinancin;
	public WebElement RequestForFinancin() {
		return RequestForFinancin;
	}
	
	@FindBy(xpath = "//td[text()='Request For Financing']")
	private WebElement RequestForFinancing;
	public WebElement RequestForFinancing() {
		return RequestForFinancing;
	}
	
	@FindBy(xpath = "//a[@id='CSMRF00MT']")
	private WebElement maintenance_under_RequestForFinancing;
	public WebElement maintenance_under_RequestForFinancing() {
		return maintenance_under_RequestForFinancing;
	}
	
//	@FindBy(xpath = "//a[@id='CSMRF00MT']")
//	private WebElement Click_searchButton_maintenance;
//	public WebElement Click_searchButton_maintenance() {
//		return Click_searchButton_maintenance;
//	}
//	
//	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_CSMRF00MT_gs_fmsRequestFinancingVO.CODE']")
//	private WebElement AfterClick_searchButton_enterCode;
//	public WebElement AfterClick_searchButton_enterCode() {
//		return AfterClick_searchButton_enterCode;
//	}
	

	
	
	
	
	
	
	@FindBy(xpath = "//select[@id='requestFinancingApplicationFor_CSMRF00MT']")
	private WebElement Select_reason_for_submission;
	public WebElement Select_reason_for_submission() {
		return Select_reason_for_submission;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_fmsFacilityFromFacility_CSMRF00MT']")
	private WebElement enter_Existing_Facility_No;
	public WebElement enter_Existing_Facility_No() {
		return enter_Existing_Facility_No;
	}
	
	
	@FindBy(xpath = "//a[text()='REQUEST FOR FINANCIN / Request For Financing / Maintenance']")
	private WebElement Afertenter_Existing_Facility_No_ClickSearch;
	public WebElement Afertenter_Existing_Facility_No_ClickSearch() {
		return Afertenter_Existing_Facility_No_ClickSearch;
	}
	
	@FindBy(xpath = "//span[text()='Group Limit']")
	private WebElement Afertenter_search_Existing_Facility_NoClick_Grouplimit;
	public WebElement Afertenter_search_Existing_Facility_NoClick_Grouplimit() {
		return Afertenter_search_Existing_Facility_NoClick_Grouplimit;
	}
	
	@FindBy(xpath = "//label[text()='Save ']")
	private WebElement ScrollTo_gruoplimit_AddButton;
	public WebElement ScrollTo_gruoplimit_AddButton() {
		return ScrollTo_gruoplimit_AddButton;
	}
	
	
	
	@FindBy(xpath = "//td[@id='add_RequestFinancingGroupLimitGridId_CSMRF00MT']/div/span")
	private WebElement Click_Addbutton_onGrouplimit;
	public WebElement Click_Addbutton_onGrouplimit() {
		return Click_Addbutton_onGrouplimit;
	}
	
	@FindBy(xpath = "//td[@id='td_RequestFinancingGroupLimitGridId_CSMRF00MT_1_fmsapplimitdetgroupVO.GROUP_ID']")
	private WebElement Click_and_enter_firstGroupID_onGroupLimit;
	public WebElement Click_and_enter_firstGroupID_onGroupLimit() {
		return Click_and_enter_firstGroupID_onGroupLimit;
	}
	
	@FindBy(xpath = "//td[@id='td_RequestFinancingGroupLimitGridId_CSMRF00MT_1_fmsapplimitdetgroupVO.GROUP_ID']//input")
	private WebElement Click_In_and_enter_firstGroupID_onGroupLimit;
	public WebElement Click_In_and_enter_firstGroupID_onGroupLimit() {
		return Click_In_and_enter_firstGroupID_onGroupLimit;
	}
	
	
	
	@FindBy(xpath = "//td[@id='td_RequestFinancingGroupLimitGridId_CSMRF00MT_1_fmsapplimitdetgroupVO.GROUP_LIMIT']//input")
	private WebElement Click_and_enter_firstlimit_onGroupLimit;
	public WebElement Click_and_enter_firstlimit_onGroupLimit() {
		return Click_and_enter_firstlimit_onGroupLimit;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Click_ok_on_error_screen;
	public WebElement Click_ok_on_error_screen() {
		return Click_ok_on_error_screen;
	}
	

	
	
	@FindBy(xpath = "//td[@id='td_RequestFinancingGroupLimitGridId_CSMRF00MT_1_fmsapplimitdetgroupVO.GROUP_NAME']")
	private WebElement Click_and_enter_FirstGroupname_onGroupLimit;
	public WebElement Click_and_enter_FirstGroupname_onGroupLimit() {
		return Click_and_enter_FirstGroupname_onGroupLimit;
	}
	
	@FindBy(xpath = "//td[@id='td_RequestFinancingGroupLimitGridId_CSMRF00MT_1_fmsapplimitdetgroupVO.GROUP_NAME']//input")
	private WebElement Click_In_and_enter_FirstGroupname_onGroupLimit;
	public WebElement Click_In_and_enter_FirstGroupname_onGroupLimit() {
		return Click_In_and_enter_FirstGroupname_onGroupLimit;
	}
	
	
	
	
	
	
	@FindBy(xpath = "(//td[@id='td_RequestFinancingGroupLimitGridId_CSMRF00MT_1_fmsapplimitdetgroupVO.GROUP_ID'])[2]")
	private WebElement Click_and_enter_secondGroupID_onGroupLimit;
	public WebElement Click_and_enter_secondGroupID_onGroupLimit() {
		return Click_and_enter_secondGroupID_onGroupLimit;
	}
	@FindBy(xpath = "(//td[@id='td_RequestFinancingGroupLimitGridId_CSMRF00MT_1_fmsapplimitdetgroupVO.GROUP_ID'])[2]//input")
	private WebElement Click_In_and_enter_secondGroupID_onGroupLimit;
	public WebElement Click_In_and_enter_secondGroupID_onGroupLimit() {
		return Click_In_and_enter_secondGroupID_onGroupLimit;
	}
	
	
	
	@FindBy(xpath = "//td[@id='td_RequestFinancingGroupLimitGridId_CSMRF00MT_1_fmsapplimitdetgroupVO.GROUP_LIMIT']/div/input")
	private WebElement Click_and_enter_secondlimit_onGroupLimit;
	public WebElement Click_and_enter_secondlimit_onGroupLimit() {
		return Click_and_enter_secondlimit_onGroupLimit;
	}
	
	@FindBy(xpath = "//td[@id='td_RequestFinancingGroupLimitGridId_CSMRF00MT_1_fmsapplimitdetgroupVO.GROUP_NAME']")
	private WebElement Click_and_enter_SecondGroupname_onGroupLimit;
	public WebElement Click_and_enter_SecondGroupname_onGroupLimit() {
		return Click_and_enter_SecondGroupname_onGroupLimit;
	}
	
	@FindBy(xpath = "//td[@id='td_RequestFinancingGroupLimitGridId_CSMRF00MT_1_fmsapplimitdetgroupVO.GROUP_ID']/div")
	private WebElement Click_and_enter_ThirdGroupID_onGroupLimit;
	public WebElement Click_and_enter_ThirdGroupID_onGroupLimit() {
		return Click_and_enter_ThirdGroupID_onGroupLimit;
	}
	
	@FindBy(xpath = "//td[@id='td_RequestFinancingGroupLimitGridId_CSMRF00MT_1_fmsapplimitdetgroupVO.GROUP_LIMIT']/div")
	private WebElement Click_and_enter_ThirdLimit_onGroupLimit;
	public WebElement Click_and_enter_ThirdLimit_onGroupLimit() {
		return Click_and_enter_ThirdLimit_onGroupLimit;
	}
	
	@FindBy(xpath = "//div[text()='Cannot Proceed']")
	private WebElement CannotPoceed_After_enterHighvalue;
	public WebElement CannotPoceed_After_enterHighvalue() {
		return CannotPoceed_After_enterHighvalue;
	}
	
	@FindBy(xpath = "//div[@id='jqgh_RequestFinancingGroupLimitGridId_CSMRF00MT_TOTAL_SUB_LIMIT']")
	private WebElement Afterenter_value_on_SecondLimit_clickout;
	public WebElement Afterenter_value_on_SecondLimit_clickout() {
		return Afterenter_value_on_SecondLimit_clickout;
	}
	
//////////@664435
	
	@FindBy(xpath = "//td[text()='Certificates']")
	private WebElement ScrollToClick_req_in_CSM;
	public WebElement ScrollToClick_req_in_CSM() {
		return ScrollToClick_req_in_CSM;
	}
	
	@FindBy(xpath = "//td[text()='Request']")
	private WebElement Click_request;
	public WebElement Click_request() {
		return Click_request;
	}
	
	@FindBy(xpath = "//td[text()='Baj Application']")
	private WebElement Click_bajApplication_under_request;
	public WebElement Click_bajApplication_under_request() {
		return Click_bajApplication_under_request;
	}
	
	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Click_approve_under_bajApplication;
	public WebElement Click_approve_under_bajApplication() {
		return Click_approve_under_bajApplication;
	}
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//td[text()='Request Management']")
	private WebElement Request_management_under_request;
	public WebElement Request_management_under_request() {
		return Request_management_under_request;
	}
	
	@FindBy(xpath = "//span[text()='Management - Process Branch']")
	private WebElement Click_Management_Process_Branch_under_Request_management;
	public WebElement Click_Management_Process_Branch_under_Request_management() {
		return Click_Management_Process_Branch_under_Request_management;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//td[text()='Baj Application']")
	private WebElement Click_baj_application;
	public WebElement Click_baj_application() {
		return Click_baj_application;
	}
	
	@FindBy(xpath = "(//td[text()='Application'])[2]")
	private WebElement Click_application_under_baj_application;
	public WebElement Click_application_under_baj_application() {
		return Click_application_under_baj_application;
	}
	
	@FindBy(xpath = "//td[text()='Application For Financial Facilities']")
	private WebElement Click_Application_For_Financial_Facilities_under_application;
	public WebElement Click_Application_For_Financial_Facilities_under_application() {
		return Click_Application_For_Financial_Facilities_under_application;
	}
	
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Click_maintenance_under_Application_For_Financial_Facilities;
	public WebElement Click_maintenance_under_Application_For_Financial_Facilities() {
		return Click_maintenance_under_Application_For_Financial_Facilities;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_BAAT001MT']")
	private WebElement Click_searchOn_maintenance;
	public WebElement Click_searchOn_maintenance() {
		return Click_searchOn_maintenance;
	}
	
	@FindBy(xpath = "//div[@id='jqgh_applicationFacilityGridTbl_Id_BAAT001MT_fmsApplVO.REQ_NO']")
	private WebElement Scroll_into_reqNo;
	public WebElement Scroll_into_reqNo() {
		return Scroll_into_reqNo;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_BAAT001MT_gs_fmsApplVO.REQ_NO']")
	private WebElement Enter_req_no;
	public WebElement Enter_req_no() {
		return Enter_req_no;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_BAAT001MT_1_fmsApplVO.REQ_NO']")
	private WebElement DoubleClickOn_req_no;
	public WebElement DoubleClickOn_req_no() {
		return DoubleClickOn_req_no;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityAdditionalReference_BAAT001MT']")
	private WebElement AddAny_AdditionalReference;
	public WebElement AddAny_AdditionalReference() {
		return AddAny_AdditionalReference;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_save_btn_BAAT001MT']")
	private WebElement Scrolldown_to_click_ValidateButton;
	public WebElement Scrolldown_to_click_ValidateButton() {
		return Scrolldown_to_click_ValidateButton;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_save_btn_BAAT001MT']")
	private WebElement click_ValidateButton_afterScroll;
	public WebElement click_ValidateButton_afterScroll() {
		return click_ValidateButton_afterScroll;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Popup_msg;
	public WebElement Popup_msg() {
		return Popup_msg;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement ClickYes_onPostApproval_screen;
	public WebElement ClickYes_onPostApproval_screen() {
		return ClickYes_onPostApproval_screen;
	}
	//div[text()='Success']
	

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Success_Screen_AfterValidate;
	public WebElement Success_Screen_AfterValidate() {
		return Success_Screen_AfterValidate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
