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
	private WebElement Click_request_OnCSM;
	public WebElement Click_request_OnCSM() {
		return Click_request_OnCSM;
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
		
	@FindBy(xpath = "//td[text()='Approved']")
	private WebElement DoubleClickOne_Approve_status;
	public WebElement DoubleClickOne_Approve_status() {
		return DoubleClickOne_Approve_status;
	}
	
	@FindBy(xpath = "//label[text()='Process ']")
	private WebElement Click_ProcessButton_OnManagement_process_branch;
	public WebElement Click_ProcessButton_OnManagement_process_branch() {
		return Click_ProcessButton_OnManagement_process_branch;
	}
	
	@FindBy(xpath = "//input[@id='requestNoProcessDet_RP002MT']")
	private WebElement get_approved_reqNo;
	public WebElement get_approved_reqNo() {
		return get_approved_reqNo;
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
	
	
	
	
	
	//@652870
		@FindBy(xpath = "//td[text()='Collateral Management']")
		private WebElement Click_Collateral_Management;
		public WebElement Click_Collateral_Management() {
			return Click_Collateral_Management;
		}	
		
		@FindBy(xpath = "(//span[text()='Maintenance'])[1]")
		private WebElement Click_maintenance_under_Collateral_Management;
		public WebElement Click_maintenance_under_Collateral_Management() {
			return Click_maintenance_under_Collateral_Management;
		}	
		
		@FindBy(xpath = "//a[@id='infoBarSearchButton_T014MT']")
		private WebElement Click_search_on_maintenance_screen;
		public WebElement Click_search_on_maintenance_screen() {
			return Click_search_on_maintenance_screen;
		}
		
		@FindBy(xpath = "//input[@id='collateralManagementGridTbl_Id_T014MT_gs_fmsCollateralVO.CIF']")
		private WebElement Click_Click_and_enter_CIF ;
		public WebElement Click_Click_and_enter_CIF() {
			return Click_Click_and_enter_CIF;
		}
		
		@FindBy(xpath = "//td[@id='td_collateralManagementGridTbl_Id_T014MT_1_cifVO.ID_NO']")
		private WebElement After_enter_CIF_find_if_any_alphabetic_in_ID_number ;
		public WebElement After_enter_CIF_find_if_any_alphabetic_in_ID_number() {
			return After_enter_CIF_find_if_any_alphabetic_in_ID_number;
		}
		//@652912
		
		@FindBy(xpath = "(//td[text()='Facilities Management'])[1]")
		private WebElement Click_Facilities_Management_under_WIFAK_APPLICATION;	
		public WebElement Click_Facilities_Management_under_WIFAK_APPLICATION() {
			return Click_Facilities_Management_under_WIFAK_APPLICATION;
		}
		
		@FindBy(xpath = "(//span[text()='Cancel'])[1]")
		private WebElement Click_cancel_under_Facilities_Management;	
		public WebElement Click_cancel_under_Facilities_Management() {
			return Click_cancel_under_Facilities_Management;
		}
		
		@FindBy(xpath = "//a[@id='infoBarSearchButton_CSMT008CN']")
		private WebElement Click_search_on_cancel_Screen;	
		public WebElement Click_search_on_cancel_Screen() {
			return Click_search_on_cancel_Screen;
		}
	
		@FindBy(xpath = "(//td[text()='Clear'])[1]")
		private WebElement Click_Clearsearch_on_cancel_Screen;	
		public WebElement Click_Clearsearch_on_cancel_Screen() {
			return Click_Clearsearch_on_cancel_Screen;
		}
	
		@FindBy(xpath = "//tr[@id='1']")
		private WebElement DoubleClick_select_firstRecord;	
		public WebElement DoubleClick_select_firstRecord() {
			return DoubleClick_select_firstRecord;
		}
		
		
		@FindBy(xpath = "//button[@id='facilityManagement_cancel_btn_WIFT008CN']")
		private WebElement After_selectRecord_Click_Cancel;	
		public WebElement After_selectRecord_Click_Cancel() {
			return After_selectRecord_Click_Cancel;
		}
		
		
		@FindBy(xpath = "(//span[text()='Approve/Reject Cancel'])[1]")
		private WebElement Click_approve_reject_cancel_under_WIFAK_APPLICATION;	
		public WebElement Click_approve_reject_cancel_under_WIFAK_APPLICATION() {
			return Click_approve_reject_cancel_under_WIFAK_APPLICATION;
		}
		
		
//		@FindBy(xpath = "(//td[text()='Clear'])[1]")
//		private WebElement DoubleClick_select_firstRecord_on_Click_approve_reject_cancel;	
//		public WebElement DoubleClick_select_firstRecord_on_Click_approve_reject_cancel() {
//			return DoubleClick_select_firstRecord_on_Click_approve_reject_cancel;
//		}
		
		
		
		//tr[@id='1']
		@FindBy(xpath = "//*[@id=\"facilityManagementGridTbl_Id_WIFT008CR_pager_left\"]/table/tbody/tr/td[7]")
		private WebElement Click_Clearsearch_on_approve_reject_cancel;	
		public WebElement Click_Clearsearch_on_approve_reject_cancel() {
			return Click_Clearsearch_on_approve_reject_cancel;
		}
		//td[@id='td_requestFinancingGridTbl_Id_RFFRF00P1_1_fmsRequestFinancingVO.BRANCH']
	
		@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008CR_1_fmsFacilityVO.CODE']")
		private WebElement DoubleClick_select_firstRecord_on_Click_approve_reject_cancel;	
		public WebElement DoubleClick_select_firstRecord_on_Click_approve_reject_cancel() {
			return DoubleClick_select_firstRecord_on_Click_approve_reject_cancel;
		}
		
		@FindBy(xpath = "//span[contains(text(),' Approve Cancel ')]")
		private WebElement Click_approveCancel_Button;	
		public WebElement Click_approveCancel_Button() {
			return Click_approveCancel_Button;
		}

		@FindBy(xpath = "(//span[contains(text(),'Maintenance')])[1]")
		private WebElement Click_maintence_under_WIFAK_APPLICATION;
		public WebElement Click_maintence_under_WIFAK_APPLICATION() {
			return Click_maintence_under_WIFAK_APPLICATION;
		}
	
		@FindBy(xpath = "//a[@id='infoBarSearchButton_WIFT008MT']")
		private WebElement Click_search_on_maintence_Screen;
		public WebElement Click_search_on_maintence_Screen() {
			return Click_search_on_maintence_Screen;
		}
	
		
		@FindBy(xpath = "//a[@id='infoBarSearchButton_WIFT008MT']")
		private WebElement Click_Clearsearch_on_maintenceScreen;
		public WebElement Click_Clearsearch_on_maintenceScreen() {
			return Click_Clearsearch_on_maintenceScreen;
		}
		
		@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008MT_1_fmsFacilityVO.CODE']")
		private WebElement DoubleClick_select_firstRecord_on_maintenace;
		public WebElement DoubleClick_select_firstRecord_on_maintenace() {
			return DoubleClick_select_firstRecord_on_maintenace;
		}	
		
		//input[@id='statusDesc_WIFT001MT']
		@FindBy(xpath = "//input[@name='facilityManagementCO.statusDesc']")
		private WebElement Check_the_Record_Status;
		public WebElement Check_the_Record_Status() {
			return Check_the_Record_Status;
		}	
		
	
//		@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008MT_1_statusDesc']")
//		private WebElement Check_the_Record_Status;
//		public WebElement Check_the_Record_Status() {
//			return Check_the_Record_Status;
//		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement Click_okOn_Warrning_popup;
		public WebElement Click_okOn_Warrning_popup() {
			return Click_okOn_Warrning_popup;
		}	
		
		@FindBy(xpath = "//*[@id=\"_popup_path_sol_ok\"]")
		private WebElement Success_Popup;
		public WebElement Success_Popup() {
			return Success_Popup;
		}
	
		@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008CR_gs_fmsFacilityVO.CODE']")
		private WebElement Search_cancel_code_onApproveCancel;
		public WebElement Search_cancel_code_onApproveCancel() {
			return Search_cancel_code_onApproveCancel;
		}
	
		@FindBy(xpath = "//*[@id=\"div__popup_path_sol_ok\"]/div[2]/div")
		private WebElement limit_details_validate_success_msg;
		public WebElement limitDetailsValidateSuccessMsg() {
			return limit_details_validate_success_msg;
		}

		
		@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008MT_gs_fmsFacilityVO.CODE']")
		private WebElement search_approvecancelCode_OnMainteance;
		public WebElement search_approvecancelCode_OnMainteance() {
			return search_approvecancelCode_OnMainteance;
		}
		
		@FindBy(xpath = "//div[contains(text(),'Do you want to cancel the related applications?')]//parent::div//following-sibling::center//input[@value='Ok ']")
		private WebElement Do_youWantCancel_Warnimg;
		public WebElement Do_youWantCancel_Warnimg() {
			return Do_youWantCancel_Warnimg;
		}
		
		//@636958
		
//		@FindBy(xpath="//td[text()='REQUEST FOR FINANCIN']")
//		private WebElement REQUEST_FOR_FINANCIN;
//	    public WebElement REQUESTFORFINANCIN() {
//			return REQUEST_FOR_FINANCIN;
//		}
//		@FindBy(xpath="//td[text()='Request For Financing']")
//		private WebElement Request_For_Financing;
//	    public WebElement RequestForFinancing() {
//			return Request_For_Financing;
//		}
//	    @FindBy(xpath="//span[text()='Maintenance']")
//		private WebElement Maintenance;
//	    public WebElement maintenance() {
//			return Maintenance;
//		}
	    @FindBy(xpath="//select[@id='requestFinancingApplicationFor_CSMRF00MT']")
		private WebElement Reason_For_Submission;
	    public WebElement reasonforsubmisson() {
			return Reason_For_Submission;
		}
	    @FindBy(xpath="(//input[@class='path-theme-cust-input liveSearchText liveSearchCompSize ui-state-focus liveSearchInputCorner'])[5]")
		private WebElement Customer_Search_box;
	    public WebElement customersearchbox() {
			return Customer_Search_box;
		}
	    @FindBy(xpath="//label[@id='requestFinancingCustomer_CSMRF00MT']")
		private WebElement CUSTOMER;
	    public WebElement customer() {
			return CUSTOMER;
		}
	    @FindBy(xpath="//span[text()='Facility Type Details']")
		private WebElement Facility_Type_details;
	    public WebElement facilitytypedetails() {
			return Facility_Type_details;
		}
	    @FindBy(xpath="//input[@id='lookuptxt_requestFinancingFacilityType_CSMRF00MT']")
		private WebElement Facility_Type_details_searchbox;
	    public WebElement facilitytypedetailssearchbox() {
			return Facility_Type_details_searchbox;
		}
	    @FindBy(xpath="//*[@id=\"rerquestFinancingMainLimitTabsContent_CSMRF00MT\"]/div/table[1]/tbody/tr/td[1]/fieldset")
		private WebElement FacIltytype_touch;
	    public WebElement facilitytypetouch() {
			return FacIltytype_touch;
		}
	    @FindBy(xpath="//input[@id='requestFinancingFacilityTotalvalue_CSMRF00MT']")
		private WebElement ToTal_Limit_Search_box;
	    public WebElement totallimitsearchbox() {
			return ToTal_Limit_Search_box;
		}
//	    @FindBy(xpath="//label[@id='requestFinancingFormId_CSMRF00MT_Total_Limit_Key']")
//		private WebElement ToTal_Limit;
//	    public WebElement totallimit() {
//			return ToTal_Limit;
//		}

		
//		  @FindBy(xpath="//label[@id='requestFinancingFormId_CSMRF00MT_save_key']")
//		  private WebElement LIMIT_Savebutton; 
//		  public WebElement limitsavebutton() {
//			  return LIMIT_Savebutton; 
//			  }
//		  
//		  @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']") 
//		  private WebElement confirm_save_button; 
//		  public WebElement confirmsavebutton() {
//		   return confirm_save_button; }
//		  
//		  @FindBy(xpath="//input[@id='_popup_path_sol_ok']") 
//		  private WebElement Record_saved_successfully; 
//		  public WebElement recordsavedsuccessfully() {
//			  return Record_saved_successfully;
//		  }
		 
	    @FindBy(xpath="//li[@id='requestFinancingLimitDtlsTabs_CSMRF00MT']/a/span[text()='Disbursement/Sublimit']")
		private WebElement Disbursement_SUBlimit;
	    public WebElement disbursementsublimit() {
			return Disbursement_SUBlimit;
		}
	    @FindBy(xpath="//td[@id='add_RequestFinancingLimitDetailsGridId_CSMRF00MT']/div/span")
		private WebElement Disbursement_SUBlimit_aDD_Button;
	    public WebElement disbursementsublimitaddbutton() {
			return Disbursement_SUBlimit_aDD_Button;
		}
	    @FindBy(xpath="//input[@id=\'lookuptxt_requestFinancingLimitDetailsGeneralFacilityProductClass_CSMRF00MT\']")
		private WebElement Product_class_searchbox;
	    public WebElement productclasssearchbox() {
			return Product_class_searchbox;
		}
	    @FindBy(xpath="//label[@id='requestfinancingLimitPopupFormId_CSMRF00MT_Product_Class_Key']")
		private WebElement Product_class;
	    public WebElement productclass() {
			return Product_class;
		}
	    @FindBy(id="requestFinancingLimitDetailsRfNewMargin_CSMRF00MT")
		private WebElement MaRgin_search_box;
	    public WebElement marginsearchbox() {
			return MaRgin_search_box;
		}
	    @FindBy(xpath="(//label[@id='requestfinancingLimitPopupFormId_CSMRF00MT_MarignRate_key'])[1]")
		private WebElement MaRgin;
	    public WebElement margin() {
			return MaRgin;
		}
	  
	    @FindBy(xpath="//input[@name='requestFinancingCO.requestFinancingLimitCO.fmsAppLimitDetVO.PERIODICITY_NBR']")
		private WebElement TeNURe;
	    public WebElement tenure() {
			return TeNURe;
		}
	  
	    @FindBy(xpath="//button[@id=\'limitDetails_add_btn_CSMRF00MT\']")
		private WebElement ADD_Button;
	    public WebElement addbutton() {
			return ADD_Button;
		}
	    @FindBy(xpath="//label[@id=\'requestFinancingFormId_CSMRF00MT_save_key\']")
		private WebElement Save_Button;
	    public WebElement savebutton() {
			return Save_Button;
		}
	  //input[@id='_popup_path_sol_confirm_ok']
	    @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	   	private WebElement Confirmsave_popup_okbutton;
	       public WebElement confirmsavepopupokbutton() {
	   		return Confirmsave_popup_okbutton;
	   	}
	    @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	    private WebElement Confirmsave_Successfully_popup;
	    public WebElement confirmsavesuccessfullypopup() {
	      return Confirmsave_Successfully_popup;
	    }
	  
	    @FindBy(xpath="//label[text()='Repayment plan ']")
	    private WebElement Click_RepaymentPlan;
	    public WebElement Click_RepaymentPlan() {
	      return Click_RepaymentPlan;
	    }
	  
	    @FindBy(xpath="//label[text()='Create Schedule ']")
	    private WebElement Click_Create_Schedule_InRepaymentPlan;
	    public WebElement Click_Create_Schedule_InRepaymentPlan() {
	      return Click_Create_Schedule_InRepaymentPlan;
	    }
	  
	    @FindBy(xpath="//span[contains(text(),' Save ')]")
	    private WebElement Click_saveButton_In_RepaymentPlan;
	    public WebElement Click_saveButton_In_RepaymentPlan() {
	      return Click_saveButton_In_RepaymentPlan;
	    }
	    
	    @FindBy(xpath="//label[@id='requestFinancingFormId_CSMRF00MT_Validate_key']")
	    private WebElement Validate_button;
	    public WebElement validatebutton() {
	      return Validate_button;
	    }
	    @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	    private WebElement Confirmvalidate_popup_okbutton;
	    public WebElement confirmvalidatepopupokbutton() {
	      return Confirmvalidate_popup_okbutton;
	    }
	    @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	    private WebElement Validate_Successfully_popup;
	    public WebElement validatesuccessfullypopup() {
	      return Validate_Successfully_popup;
	    }
	    
	    @FindBy(xpath="//span[text()='Approve Level 1']")
	    private WebElement Approve_level1;
	    public WebElement approvelevel1() {
	      return Approve_level1;
	    }
	    
	    @FindBy(xpath="//span[text()='Approve Level 1']")
	    private WebElement Click_clearsearch_inApproveLev_1;
	    public WebElement Click_clearsearch_inApproveLev_1() {
	      return Click_clearsearch_inApproveLev_1;
	    }
	    
	  
	    
	    @FindBy(xpath="//td[@id='td_requestFinancingGridTbl_Id_RFFRF00P1_1_fmsRequestFinancingVO.BRANCH']")
	    private WebElement doubleClick_and_select_record_inApproveLev_1;
	    public WebElement doubleClick_and_select_record_inApproveLev_1() {
	      return doubleClick_and_select_record_inApproveLev_1;
	    }
	  
	    @FindBy(xpath="//label[@id='requestFinancingFormId_RFFRF00P1_approve_key']")
	    private WebElement approve_buttton_inApproveLev_1;
	    public WebElement approve_buttton_inApproveLev_1() {
	      return approve_buttton_inApproveLev_1;
	    }
	  
	    @FindBy(xpath="//select[@id='requestDecisionForward_1_RFFRF00P1']")
	    private WebElement select_decision_inApproveLev_1;
	    public WebElement select_decision_inApproveLev_1() {
	      return select_decision_inApproveLev_1;
	    }
	    
	  
	    @FindBy(xpath="//td[@id='add_reguestFinancingRejectionReasonGrid_RFFRF00P1']/div/span")
	    private WebElement click_addButton_On_reasonForRejection;
	    public WebElement click_addButton_On_reasonForRejection() {
	      return click_addButton_On_reasonForRejection;
	    }
	    
	  
	    @FindBy(xpath="//*[@id='td_reguestFinancingRejectionReasonGrid_RFFRF00P1_1_rn']")
	    private WebElement select_firstRow_in_RejectReason;
	    public WebElement select_firstRow_in_RejectReason() {
	      return select_firstRow_in_RejectReason;
	    }
	    
	  

	    @FindBy(xpath="//td[@id='td_reguestFinancingRejectionReasonGrid_RFFRF00P1_1_fmsRequestFinancingRejectionDetailsVO.REASON_CODE']//select")
	    private WebElement select_reasonForRejection;
	    public WebElement select_reasonForRejection() {
	      return select_reasonForRejection;
	    }
	    
	  
	    
	    @FindBy(xpath="//td[@id='td_reguestFinancingRejectionReasonGrid_RFFRF00P1_1_fmsRequestFinancingRejectionDetailsVO.DETAILS']//textarea")
	    private WebElement Type_detailsIn_reasonForRejection;
	    public WebElement Type_detailsIn_reasonForRejection() {
	      return Type_detailsIn_reasonForRejection;
	    }
	    
	  
	    @FindBy(xpath="//span[text()='Ok']")
	    private WebElement clickOk_reasonForRejection;
	    public WebElement clickOk_reasonForRejection() {
	      return clickOk_reasonForRejection;
	    }
	    
	  
	    @FindBy(xpath="//td[text()='Reopen Rejected Applications']")
	    private WebElement Click_Reopen_Rejected_Applications_Under_request_for_financing;
	    public WebElement Click_Reopen_Rejected_Applications_Under_request_for_financing() {
	      return Click_Reopen_Rejected_Applications_Under_request_for_financing;
	    }
	    
	  
	    
	    @FindBy(xpath="//a[@id='RFFRF00RJMT']/span[2]")
	    private WebElement Click_mainteance_under_Reopen_Rejected_Applications;
	    public WebElement Click_mainteance_under_Reopen_Rejected_Applications() {
	      return Click_mainteance_under_Reopen_Rejected_Applications;
	    }
	    
	    
	    @FindBy(xpath="//*[@id='requestFinancingGridTbl_Id_RFFRF00RJMT_pager_left']/table/tbody/tr/td[7]")
	    private WebElement Click_clearSearch_in_mainteance_under_Reopen_Rejected_Applications;
	    public WebElement Click_clearSearch_in_mainteance_under_Reopen_Rejected_Applications() {
	      return Click_clearSearch_in_mainteance_under_Reopen_Rejected_Applications;
	    }
	  
	    @FindBy(xpath="//td[@id='td_requestFinancingGridTbl_Id_RFFRF00RJMT_1_fmsRequestFinancingVO.BRANCH']")
	    private WebElement DoubleClick_Select_firstRecord_Reopen_Rejected_Applications;
	    public WebElement DoubleClick_Select_firstRecord_Reopen_Rejected_Applications() {
	      return DoubleClick_Select_firstRecord_Reopen_Rejected_Applications;
	    }

	    
	  
	    @FindBy(xpath="//button[@id='requestFinancing_reopenReject_btn_RFFRF00RJMT']")
	    private WebElement Click_reopen_button;
	    public WebElement Click_reopen_button() {
	      return Click_reopen_button;
	    }
	 
	  
	    
//	    @FindBy(xpath="//td[@id='td_requestFinancingGridTbl_Id_RFFRF00RJMT_1_fmsRequestFinancingVO.BRANCH']")
//	    private WebElement DoubleClick_openRecord_in_mainteance;
//	    public WebElement DoubleClick_openRecord_in_mainteance() {
//	      return DoubleClick_openRecord_in_mainteance;
//	    }
	    
	    
	    
	  
	    @FindBy(xpath="//a[@id='RFFRF00RJAP']/span[2]")
	    private WebElement Click_approve_reject_Reopen_Rejected_Applications;
	    public WebElement Click_approve_reject_Reopen_Rejected_Applications() {
	      return Click_approve_reject_Reopen_Rejected_Applications;
	    }
	    
	    
 
	    
	    @FindBy(xpath="//*[@id='requestFinancingGridTbl_Id_RFFRF00RJAP_pager_left']/table/tbody/tr/td[7]")
	    private WebElement Click_clear_search_in_approve_reject;
	    public WebElement Click_clear_search_in_approve_reject() {
	      return Click_clear_search_in_approve_reject;
	    }
	 
	    @FindBy(xpath="//td[@id='td_requestFinancingGridTbl_Id_RFFRF00RJAP_1_fmsRequestFinancingVO.CODE']")
	    private WebElement double_click_select_record_in_approve_reject;
	    public WebElement double_click_select_record_in_approve_reject() {
	      return double_click_select_record_in_approve_reject;
	    }
	    
	    
	  
	    @FindBy(xpath="//button[@id='requestFinancing_approveReopen_btn_RFFRF00RJAP']")
	    private WebElement Click_approve_in_approve_reject;
	    public WebElement Click_approve_in_approve_reject() {
	      return Click_approve_in_approve_reject;
	
	    }
	    
	      @FindBy(xpath="//a[@id='RFFRF00MT']/span[2]")
		    private WebElement Click_mainteance_under_request_for_financing;
		    public WebElement Click_mainteance_under_request_for_financing() {
		      return Click_mainteance_under_request_for_financing;
	    
		    }
	    
	    
		  
		    @FindBy(xpath="//a[@id='infoBarSearchButton_RFFRF00MT']")
		    private WebElement Click_searchIn_maintenance_under_request_for_financing;
		    public WebElement Click_searchIn_maintenance_under_request_for_financing() {
		      return Click_searchIn_maintenance_under_request_for_financing;
		    }
	    
		  
	    
		    @FindBy(xpath="//*[@id='requestFinancingGridTbl_Id_RFFRF00MT_pager_left']/table/tbody/tr/td[7] ")
		    private WebElement Click_ClearsearchIn_maintenance_under_request_for_financing;
		    public WebElement Click_ClearsearchIn_maintenance_under_request_for_financing() {
		      return Click_ClearsearchIn_maintenance_under_request_for_financing;
		    }
	    
	    
		  
		    @FindBy(xpath="//td[@id='td_requestFinancingGridTbl_Id_RFFRF00MT_1_fmsRequestFinancingVO.CODE']")
		    private WebElement select_recordIn_maintenance_under_request_for_financing;
		    public WebElement select_recordIn_maintenance_under_request_for_financing() {
		      return select_recordIn_maintenance_under_request_for_financing;
		    }
	    
	    
		  
		    @FindBy(xpath="//li[@id='customerGradingRecommendationsTab_RFFRF00P1']/a/span")
		    private WebElement Click_Customer_Grading_Recommendations_For_reject;
		    public WebElement Click_Customer_Grading_Recommendations_For_reject() {
		      return Click_Customer_Grading_Recommendations_For_reject;
		    }
	    
		  
	    
		    @FindBy(xpath="//td[@id='td_RequestFinancingLimitDetailsGridId_RFFRF00MT_0_rn']")
		    private WebElement double_click_and_select_existing_productClass;
		    public WebElement double_click_and_select_existing_productClass() {
		      return double_click_and_select_existing_productClass;
		    }
		  
		    @FindBy(xpath="//button[@id='limitDetails_edit_btn_RFFRF00MT']")
		    private WebElement click_editbutton_in_exitstingproduct_Class;
		    public WebElement click_editbutton_in_exitstingproduct_Class() {
		      return click_editbutton_in_exitstingproduct_Class;
		    }
		  
		    @FindBy(xpath="//*[@id='legend']")
		    private WebElement AfterEnter_margin_clickOut;
		    public WebElement AfterEnter_margin_clickOut() {
		      return AfterEnter_margin_clickOut;
		    }
		    
		  
		    @FindBy(xpath="//select[@id='requestFinancingLimitDetailsPeriodicityType_RFFRF00MT']")
		    private WebElement select_the_moths_in_tenure;
		    public WebElement select_the_moths_in_tenure() {
		      return select_the_moths_in_tenure;
		    }
		  
		    @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
		    private WebElement please_wait_server_loading;
		    public WebElement please_wait_server_loading() {
		      return please_wait_server_loading;
		    }
	    
		  
		    @FindBy(xpath="//button[@id='requestForFinance_save_as_draft_btn_RFFRF00MT']")
		    private WebElement Click_save_afterEdit_productClass;
		    public WebElement Click_save_afterEdit_productClass() {
		      return Click_save_afterEdit_productClass;
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
}
