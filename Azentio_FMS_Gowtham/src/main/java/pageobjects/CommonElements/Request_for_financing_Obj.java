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
		
	    @FindBy(xpath="//*[@id='requestFinancingApplicationFor_CSMRF00MT']")
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
	    
	    @FindBy(xpath="//*[@id='requestFinancingLimitDetailsClassDesc_RFFRF00MT']")
		private WebElement product_Class_Name_Validation;
	    public WebElement product_Class_Name_Validation() {
			return product_Class_Name_Validation;
		}
	  
	    @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
		private WebElement Click_okOn_lessvalue;
	    public WebElement Click_okOn_lessvalue() {
			return Click_okOn_lessvalue;
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
	  
	    @FindBy(xpath="//label[text()='Tenure ']/parent::td/following-sibling::td//input")
		private WebElement TeNURe;
	    public WebElement tenure() {
			return TeNURe;
		}
	  
	    @FindBy(xpath="//span[contains(text(),' Add ')]")
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
	    
	  
	    @FindBy(xpath="//a[@id='dismissbut_CSMRF00MT']/span")
	    private WebElement SendAlert_pop;
	    public WebElement SendAlert_pop() {
	      return SendAlert_pop;
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
	    
	    @FindBy(xpath="//*[@id='requestFinancingGridTbl_Id_CSMRF00P1_pager_left']/table/tbody/tr/td[7]")
	    private WebElement Click_clearsearch_inApproveLev_1;
	    public WebElement Click_clearsearch_inApproveLev_1() {
	      return Click_clearsearch_inApproveLev_1;
	    }
	    
	  
	    
	    @FindBy(xpath="//*[@id='td_requestFinancingGridTbl_Id_CSMRF00P1_1_fmsRequestFinancingVO.CODE']")
	    private WebElement doubleClick_and_select_record_inApproveLev_1;
	    public WebElement doubleClick_and_select_record_inApproveLev_1() {
	      return doubleClick_and_select_record_inApproveLev_1;
	    }
	  
	    @FindBy(xpath="//*[@id='requestFinancingFormId_CSMRF00P1_approve_key']")
	    private WebElement approve_buttton_inApproveLev_1;
	    public WebElement approve_buttton_inApproveLev_1() {
	      return approve_buttton_inApproveLev_1;
	    }
	  
	    @FindBy(xpath="//select[@id='requestDecisionForward_1_CSMRF00P1']")
	    private WebElement select_decision_inApproveLev_1;
	    public WebElement select_decision_inApproveLev_1() {
	      return select_decision_inApproveLev_1;
	    }
	    
	  
	    @FindBy(xpath="//*[@id='add_reguestFinancingRejectionReasonGrid_CSMRF00P1']//span")
	    private WebElement click_addButton_On_reasonForRejection;
	    public WebElement click_addButton_On_reasonForRejection() {
	      return click_addButton_On_reasonForRejection;
	    }
	    
	  
	    @FindBy(xpath="//*[@id='td_reguestFinancingRejectionReasonGrid_CSMRF00P1_1_rn']")
	    private WebElement select_firstRow_in_RejectReason;
	    public WebElement select_firstRow_in_RejectReason() {
	      return select_firstRow_in_RejectReason;
	    }
	    
	  

	    @FindBy(xpath="//td[@id='td_reguestFinancingRejectionReasonGrid_CSMRF00P1_1_fmsRequestFinancingRejectionDetailsVO.REASON_CODE']//select")
	    private WebElement select_reasonForRejection;
	    public WebElement select_reasonForRejection() {
	      return select_reasonForRejection;
	    }
	    
	  
	    
	    @FindBy(xpath="//td[@id='td_reguestFinancingRejectionReasonGrid_CSMRF00P1_1_fmsRequestFinancingRejectionDetailsVO.DETAILS']//textarea")
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
	    
	  
	  
	    @FindBy(xpath="//*[@id='CSMRF00RJMT']/span[2]")
	    private WebElement Click_mainteance_under_Reopen_Rejected_Applications;
	    public WebElement Click_mainteance_under_Reopen_Rejected_Applications() {
	      return Click_mainteance_under_Reopen_Rejected_Applications;
	    }
	    
	    
	    @FindBy(xpath="//*[@id='requestFinancingGridTbl_Id_CSMRF00RJMT_pager_left']/table/tbody/tr/td[7]")
	    private WebElement Click_clearSearch_in_mainteance_under_Reopen_Rejected_Applications;
	    public WebElement Click_clearSearch_in_mainteance_under_Reopen_Rejected_Applications() {
	      return Click_clearSearch_in_mainteance_under_Reopen_Rejected_Applications;
	    }
	  
	    @FindBy(xpath="//*[@id='td_requestFinancingGridTbl_Id_CSMRF00RJAP_1_fmsRequestFinancingVO.CODE']")
	    private WebElement DoubleClick_Select_firstRecord_Reopen_Rejected_Applications;
	    public WebElement DoubleClick_Select_firstRecord_Reopen_Rejected_Applications() {
	      return DoubleClick_Select_firstRecord_Reopen_Rejected_Applications;
	    }

	    
	  
	    @FindBy(xpath="//button[@id='requestFinancing_reopenReject_btn_CSMRF00RJMT']")
	    private WebElement Click_reopen_button;
	    public WebElement Click_reopen_button() {
	      return Click_reopen_button;
	    }
	 
	  
	    
//	    @FindBy(xpath="//td[@id='td_requestFinancingGridTbl_Id_RFFRF00RJMT_1_fmsRequestFinancingVO.BRANCH']")
//	    private WebElement DoubleClick_openRecord_in_mainteance;
//	    public WebElement DoubleClick_openRecord_in_mainteance() {
//	      return DoubleClick_openRecord_in_mainteance;
//	    }
	    
	    
	    
	  
	    @FindBy(xpath="//a[@id='CSMRF00RJAP']/span[2]")
	    private WebElement Click_approve_reject_Reopen_Rejected_Applications;
	    public WebElement Click_approve_reject_Reopen_Rejected_Applications() {
	      return Click_approve_reject_Reopen_Rejected_Applications;
	    }
	    
	    
 
	    
	    @FindBy(xpath="//*[@id='requestFinancingGridTbl_Id_CSMRF00RJAP_pager_left']/table/tbody/tr/td[7]")
	    private WebElement Click_clear_search_in_approve_reject;
	    public WebElement Click_clear_search_in_approve_reject() {
	      return Click_clear_search_in_approve_reject;
	    }
	 
	    @FindBy(xpath="//td[@id='td_requestFinancingGridTbl_Id_CSMRF00RJAP_1_fmsRequestFinancingVO.CODE']")
	    private WebElement double_click_select_record_in_approve_reject;
	    public WebElement double_click_select_record_in_approve_reject() {
	      return double_click_select_record_in_approve_reject;
	    }
	    
	    
	  
	    @FindBy(xpath="//*[@id='requestFinancingFormId_CSMRF00RJMT_Reopen_key']")
	    private WebElement Click_approve_in_approve_reject;
	    public WebElement Click_approve_in_approve_reject() {
	      return Click_approve_in_approve_reject;
	
	    }
	    
	      @FindBy(xpath="//a[@id='CSMRF00MT']/span[2]")
		    private WebElement Click_mainteance_under_request_for_financing;
		    public WebElement Click_mainteance_under_request_for_financing() {
		      return Click_mainteance_under_request_for_financing;
	    
		    }
	    
	    
		  
		    @FindBy(xpath="//a[@id='infoBarSearchButton_CSMRF00MT']")
		    private WebElement Click_searchIn_maintenance_under_request_for_financing;
		    public WebElement Click_searchIn_maintenance_under_request_for_financing() {
		      return Click_searchIn_maintenance_under_request_for_financing;
		    }
	    
		  
	    
		    @FindBy(xpath="//*[@id='requestFinancingGridTbl_Id_CSMRF00MT_pager_left']/table/tbody/tr/td[7] ")
		    private WebElement Click_ClearsearchIn_maintenance_under_request_for_financing;
		    public WebElement Click_ClearsearchIn_maintenance_under_request_for_financing() {
		      return Click_ClearsearchIn_maintenance_under_request_for_financing;
		    }
	    
	    
		  
		    @FindBy(xpath="//td[@id='td_requestFinancingGridTbl_Id_CSMRF00MT_1_fmsRequestFinancingVO.CODE']")
		    private WebElement select_recordIn_maintenance_under_request_for_financing;
		    public WebElement select_recordIn_maintenance_under_request_for_financing() {
		      return select_recordIn_maintenance_under_request_for_financing;
		    }
	    
	    
		  
		    @FindBy(xpath="//span[text()='Customer Grading & Recommendations']")
		    private WebElement Click_Customer_Grading_Recommendations_For_reject;
		    public WebElement Click_Customer_Grading_Recommendations_For_reject() {
		      return Click_Customer_Grading_Recommendations_For_reject;
		    }
	    
		  
	    
		    @FindBy(xpath="//td[@id='td_RequestFinancingLimitDetailsGridId_CSMRF00MT_0_rn']")
		    private WebElement double_click_and_select_existing_productClass;
		    public WebElement double_click_and_select_existing_productClass() {
		      return double_click_and_select_existing_productClass;
		    }
		  
		    @FindBy(xpath="//button[@id='limitDetails_edit_btn_CSMRF00MT']")
		    private WebElement click_editbutton_in_exitstingproduct_Class;
		    public WebElement click_editbutton_in_exitstingproduct_Class() {
		      return click_editbutton_in_exitstingproduct_Class;
		    }
		  
		    @FindBy(xpath="//*[@id='legend']")
		    private WebElement AfterEnter_margin_clickOut;
		    public WebElement AfterEnter_margin_clickOut() {
		      return AfterEnter_margin_clickOut;
		    }
		    
		  
		    @FindBy(xpath="//label[text()='Tenure ']/parent::td/following-sibling::td//select")
		    private WebElement select_the_moths_in_tenure;
		    public WebElement select_the_moths_in_tenure() {
		      return select_the_moths_in_tenure;
		    }
		  
		    @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
		    private WebElement please_wait_server_loading;
		    public WebElement please_wait_server_loading() {
		      return please_wait_server_loading;
		    }
	    
		  
		    @FindBy(xpath="//button[@id='requestForFinance_save_as_draft_btn_CSMRF00MT']")
		    private WebElement Click_save_afterEdit_productClass;
		    public WebElement Click_save_afterEdit_productClass() {
		      return Click_save_afterEdit_productClass;
		    }
		    
		    
		    
		    
	//////////@123
		  
		    @FindBy(xpath="//input[@id='requestFinancingGridTbl_Id_CSMRF00P1_gs_fmsRequestFinancingVO.CODE']")
		    private WebElement Search_value_on_approve1;
		    public WebElement Search_value_on_approve1() {
		      return Search_value_on_approve1;
		    }
		  
		    @FindBy(xpath="//*[@id=\"td_requestFinancingGridTbl_Id_CSMRF00P1_1_fmsRequestFinancingVO.CODE\"]")
		    private WebElement Select_value_on_approve1;
		    public WebElement Select_value_on_approve1() {
		      return Select_value_on_approve1;
		    }
		    
		    
		    
		  /// @749113
		    
		  
			
		    
		    @FindBy(xpath="//td[text()='Grading']")
		    private WebElement Click_Grading_under_Wifak_Application;
		    public WebElement Click_Grading_under_Wifak_Application() {
		      return Click_Grading_under_Wifak_Application;
		    }
		    
		  
		    @FindBy(xpath="//a[@id='CSMRF00MT']/span[2]")
		    private WebElement Click_Maintenance_under_Grading;
		    public WebElement Click_Maintenance_under_Grading() {
		      return Click_Maintenance_under_Grading;
		    }
		    
		    
		//  @749102
		    
		  
		    @FindBy(xpath="//td[text()='Parameters']")
		    private WebElement Click_Parameters_in_MTS;
		    public WebElement Click_Parameters_in_MTS() {
		      return Click_Parameters_in_MTS;
		    }
		  
		    @FindBy(xpath="//td[text()='Batch']")
		    private WebElement Click_Batch_under_parameters;
		    public WebElement Click_Batch_under_parameters() {
		      return Click_Batch_under_parameters;
		    }
		  
		    @FindBy(xpath="//span[text()='Maintenance']")
		    private WebElement Click_Maintenance_underBatch;
		    public WebElement Click_Maintenance_underBatch() {
		      return Click_Maintenance_underBatch;
		    }
		  
		    @FindBy(xpath="//input[@id='additionalReference_P0003MT']")
		    private WebElement Enter_additionalReference;
		    public WebElement Enter_additionalReference() {
		      return Enter_additionalReference;
		    }
		    
		  
		    @FindBy(xpath="//input[@id='briefName_P0003MT']")
		    private WebElement Enter_briefName;
		    public WebElement Enter_briefName() {
		      return Enter_briefName;
		    }
		  
		    @FindBy(xpath="//input[@id='LongName_P0003MT']")
		    private WebElement Enter_LongName;
		    public WebElement Enter_LongName() {
		      return Enter_LongName;
		    }
		  
		    @FindBy(xpath="//input[@id='menuReference_P0003MT']")
		    private WebElement Enter_Menu_Reference;
		    public WebElement Enter_Menu_Reference() {
		      return Enter_Menu_Reference;
		    }
		  
		    @FindBy(xpath="//SELECT[@id='batchPeriodicity_P0003MT']")
		    private WebElement Select_batchPeriodicity;
		    public WebElement Select_batchPeriodicity() {
		      return Select_batchPeriodicity;
		    }
		    
		    
			@FindBy(xpath = "(//ins[@class=\"jstree-icon\"])[3]")
			private WebElement Click_dropdown_in_oracalBAJ;
			public WebElement Click_dropdown_in_oracalBAJ() {
				return Click_dropdown_in_oracalBAJ;
			}
			
			
			@FindBy(xpath = "(//*[@id=\"batchChartTree_Branch_P0003MT\"]//ins)[8]")
			private WebElement cHECK_HEADOFFICE;
			public WebElement cHECK_HEADOFFICE() {
				return cHECK_HEADOFFICE;
			}
			
			@FindBy(xpath = "//li[@nodecode='Others']")
			private WebElement Scroll_into_others;
			public WebElement Scroll_into_others() {
				return Scroll_into_others;
			}
	
			@FindBy(xpath="(//li[@nodecode=\"Facility Management\"])//ins[1]")
		    private WebElement Click_dropDown_in_Facility_Management;
		    public WebElement Click_dropDown_in_Facility_Management() {
		      return Click_dropDown_in_Facility_Management;
		    }		    
		    
		  
		    @FindBy(xpath="//a[contains(text(),'101 - FMS-FC Limit Revaluation')]")
		    private WebElement Click_101_in_Facility_Management;
		    public WebElement Click_101_in_Facility_Management() {
		      return Click_101_in_Facility_Management;
		    }	
		    
		  
		    @FindBy(xpath="//button[@id='batchMaintForm_Save_Btn_P0003MT']")
		    private WebElement Click_save_button_in_mainteance_MTS;
		    public WebElement Click_save_button_in_mainteance_MTS() {
		      return Click_save_button_in_mainteance_MTS;
		    }	
		    
		  
		    @FindBy(xpath="//input[@id=\'_popup_path_sol_ok\']")
		    private WebElement Click_okOn_save_pop;
		    public WebElement Click_okOn_save_pop() {
		      return Click_okOn_save_pop;
		    }	
		    
			@FindBy(xpath = "(//span[text()='Approve'])[1]")
			private WebElement Click_Approve_under_Batch;
			public WebElement Click_Approve_under_Batch() {
				return Click_Approve_under_Batch;
			}
			
			@FindBy(xpath = "//input[@id='batchGridTbl_Id_P0003AP_gs_eodBatchMasterVO.ADDITIONAL_REFERENCE']")
			private WebElement enter_additionalReference_mainteance;
			public WebElement enter_additionalReference_mainteance() {
				return enter_additionalReference_mainteance;
			}
			
			@FindBy(xpath = "//*[@id='td_batchGridTbl_Id_P0003AP_1_eodBatchMasterVO.BATCH_CODE']")
			private WebElement select_the_record_from_Approve;
			public WebElement select_the_record_from_Approve() {
				return select_the_record_from_Approve;
			}
		    
			
			@FindBy(xpath = "//button[@id='batchMaintForm_Approve_Btn_P0003AP']")
			private WebElement Click_approveButton_in_approve_under_batch;
			public WebElement Click_approveButton_in_approve_under_batch() {
				return Click_approveButton_in_approve_under_batch;
			}
			
			@FindBy(xpath = "//td[text()='Process']")
			private WebElement Click_ProcessUnder_menu;
			public WebElement Click_ProcessUnder_menu() {
				return Click_ProcessUnder_menu;
			}
			
			
			@FindBy(xpath = "//td[text()='Batch Process']")
			private WebElement Click_batch_process_under_process;
			public WebElement Click_batch_process_under_process() {
				return Click_batch_process_under_process;
			}
			
			@FindBy(xpath = "//td[text()='abcdefghia']")
			private WebElement Select_approved_record_under_process;
			public WebElement Select_approved_record_under_process() {
				return Select_approved_record_under_process;
			}
			
			
			@FindBy(xpath = "//span[text()='Batch Run']")
			private WebElement Select_batchRun_under_ApprovedRecord;
			public WebElement Select_batchRun_under_ApprovedRecord() {
				return Select_batchRun_under_ApprovedRecord;
			}
			
			@FindBy(xpath = "(//input[starts-with(@id,'jqg_batchRunGridTbl_Id_')])[1]")
			private WebElement select_record_underBranches_status;
			public WebElement select_record_underBranches_status() {
				return select_record_underBranches_status;
			}
			
			@FindBy(xpath = "//span[contains(text(),'Run')]//parent::button")
			private WebElement click_runButton_after_select_record_underBranches_status;
			public WebElement click_runButton_after_select_record_underBranches_status() {
				return click_runButton_after_select_record_underBranches_status;
			}
			
			@FindBy(xpath = "//*[@id='batchStatus']")
			private WebElement CheckThe_Execution_Status;
			public WebElement CheckThe_Execution_Status() {
				return CheckThe_Execution_Status;
			}
			
			
			//@749155
			
			@FindBy(xpath = "//td[text()='Request']")
			private WebElement Click_Request_underMenu_FMS;
			public WebElement Click_Request_underMenu_FMS() {
				return Click_Request_underMenu_FMS;
			}
			
			
			@FindBy(xpath = "//td[text()='Request Financing']")
			private WebElement Click_Request_financing_under_request;
			public WebElement Click_Request_financing_under_request() {
				return Click_Request_financing_under_request;
			}
			
			
			@FindBy(xpath = "//td[text()='Request For Financing']")
			private WebElement Click_Request_for_financing_under_Request_financing;
			public WebElement Click_Request_for_financing_under_Request_financing() {
				return Click_Request_for_financing_under_Request_financing;
			}
			
			@FindBy(xpath = "//span[text()='Maintenance']")
			private WebElement Click_Maintenance_Request_for_financing;
			public WebElement Click_Maintenance_Request_for_financing_607() {
				return Click_Maintenance_Request_for_financing;
			}
			
			
			@FindBy(xpath = "//span[text()='Approve Level 1']")
			private WebElement ApproveLevel1_under_Request_for_financing;
			public WebElement ApproveLevel1_under_Request_for_financing() {
				return ApproveLevel1_under_Request_for_financing;
			}
			
			
			@FindBy(xpath = "//*[@id='requestFinancingGridTbl_Id_RFFRF00P1_pager_left']/table/tbody/tr/td[7]")
			private WebElement click_clearSearch_in_approvelev1;
			public WebElement click_clearSearch_in_approvelev1() {
				return click_clearSearch_in_approvelev1;
			}
			
			
			@FindBy(xpath = "//*[@id='td_requestFinancingGridTbl_Id_RFFRF00P1_1_fmsRequestFinancingVO.CODE']")
			private WebElement select_record_in_approvelev1;
			public WebElement select_record_in_approvelev1() {
				return select_record_in_approvelev1;
			}
			
			
			@FindBy(xpath = "//span[text()='Customer Grading & Recommendations']")
			private WebElement click_Customer_Grading_RecommendationsIn_approvelev1;
			public WebElement click_Customer_Grading_RecommendationsIn_approvelev1() {
				return click_Customer_Grading_RecommendationsIn_approvelev1;
			}
			
			
			@FindBy(xpath = "//button[@id='requestForFinance_approve_btn_RFFRF00P1']")
			private WebElement click_ApproveButton_after_Customer_Grading_RecommendationsIn_approvelev1;
			public WebElement click_ApproveButton_after_Customer_Grading_RecommendationsIn_approvelev1() {
				return click_ApproveButton_after_Customer_Grading_RecommendationsIn_approvelev1;
			}
			
			
			@FindBy(xpath = "//select[@id='requestDecisionForward_1_RFFRF00P1']")
			private WebElement select_Decision_in_approvelev1;
			public WebElement select_Decision_in_approvelev1() {
				return select_Decision_in_approvelev1;
			}
			
			@FindBy(xpath = "//select[@id='requestDecisionForwardP1_RFFRF00P1']")
			private WebElement Select_approveCommite_afterDecision;
			public WebElement Select_approveCommite_afterDecision() {
				return Select_approveCommite_afterDecision;
			}
			
			@FindBy(xpath = "//select[@id='requestP1approvalCommitte_RFFRF00P1']")
			private WebElement After_select_approveCommite_selectIC;
			public WebElement After_select_approveCommite_selectIC() {
				return After_select_approveCommite_selectIC;
			}
			
			
			@FindBy(xpath = "//span[text()='Approval Committee Recommendations ']")
			private WebElement Click_Approval_Committee_Recommendations;
			public WebElement Click_Approval_Committee_Recommendations() {
				return Click_Approval_Committee_Recommendations;
			}
			
			@FindBy(xpath = "//*[@id='requestFinancingGridTbl_Id_RFFRF00AC_pager_left']/table/tbody/tr/td[7]")
			private WebElement Click_clearIn_Approval_Committee_Recommendations;
			public WebElement Click_clearIn_Approval_Committee_Recommendations() {
				return Click_clearIn_Approval_Committee_Recommendations;
			}
			
			
			@FindBy(xpath = "//*[@id='td_requestFinancingGridTbl_Id_RFFRF00AC_1_fmsRequestFinancingVO.CODE']")
			private WebElement select_recordIn_Approval_Committee_Recommendations;
			public WebElement select_recordIn_Approval_Committee_Recommendations() {
				return select_recordIn_Approval_Committee_Recommendations;
			}
			
			
			@FindBy(xpath = "//*[@id='creditCommitteeRecommendationsTab_RFFRF00AC']/a/span")
			private WebElement click_creditCommitteeRecommendationsTab;
			public WebElement click_creditCommitteeRecommendationsTab() {
				return click_creditCommitteeRecommendationsTab;
			}
			
			@FindBy(xpath = "//*[@id=\'requestFinancingCreditReviewRecommandations_RFFRF00AC\']/div[1]")
			private WebElement click_Recommandations_IncreditCommitteeRecommendationsTab;
			public WebElement click_Recommandations_IncreditCommitteeRecommendationsTab() {
				return click_Recommandations_IncreditCommitteeRecommendationsTab;
			}
			
			
			
			
			
			//@748962
			
			@FindBy(xpath = "//select[@id='applicationFacilityRevolvingOneoff_WIFT001MT']")
			private WebElement select_oneOff_inFacility_Type_Details;
			public WebElement select_oneOff_inFacility_Type_Details() {
				return select_oneOff_inFacility_Type_Details;
			}
			
			@FindBy(xpath = "//td[text()='Facilities Management']")
			private WebElement click_Facilities_Managementunder_wifakApplication;
			public WebElement click_Facilities_Managementunder_wifakApplication() {
				return click_Facilities_Managementunder_wifakApplication;
			}
		    
			
			@FindBy(xpath = "//*[@id='WIFT008MT']//span//span")
			private WebElement click_Maintenance_under_Facilities_Managementunder;
			public WebElement click_Maintenance_under_Facilities_Managementunder() {
				return click_Maintenance_under_Facilities_Managementunder;
			}
			
			@FindBy(xpath = "//*[@id='infoBarSearchButton_WIFT008MT']")
			private WebElement click_searchIn_Maintenance_under_Facilities_Managementunder;
			public WebElement click_searchIn_Maintenance_under_Facilities_Managementunder() {
				return click_searchIn_Maintenance_under_Facilities_Managementunder;
			}
			
			@FindBy(xpath = "//*[@id='facilityManagementGridTbl_Id_WIFT008MT_pager_left']/table/tbody/tr/td[7]")
			private WebElement click_ClearsearchIn_Maintenance_under_Facilities_Managementunder;
			public WebElement click_ClearsearchIn_Maintenance_under_Facilities_Managementunder() {
				return click_ClearsearchIn_Maintenance_under_Facilities_Managementunder;
			}
			
			@FindBy(xpath = "//*[@id='td_facilityManagementGridTbl_Id_WIFT008MT_1_fmsFacilityVO.CODE']")
			private WebElement select_recordIn_Maintenance_under_Facilities_Management;
			public WebElement select_recordIn_Maintenance_under_Facilities_Management() {
				return select_recordIn_Maintenance_under_Facilities_Management;
			}
			
			@FindBy(xpath = "//input[@id='facilityMangementCode_WIFT008MT']")
			private WebElement getApplicationCode_forSelected_application;
			public WebElement getApplicationCode_forSelected_application() {
				return getApplicationCode_forSelected_application;
			}
			
			
			@FindBy(xpath = "//td[text()='Draw Down Request']")
			private WebElement Click_drawDown_request_under_wifakApplication;
			public WebElement Click_drawDown_request_under_wifakApplication() {
				return Click_drawDown_request_under_wifakApplication;
			}
			
			@FindBy(xpath = "//*[@id='WIFT009MT']/span[2]")
			private WebElement Click_Mainteance_under_drawDown_request;
			public WebElement Click_Mainteance_under_drawDown_request() {
				return Click_Mainteance_under_drawDown_request;
			}
			
			@FindBy(xpath = "//*[@id='lookuptxt_drawDownRequestFacilityReference_WIFT009MT']")
			private WebElement enter_Facility_Reference_code;
			public WebElement enter_Facility_Reference_code() {
				return enter_Facility_Reference_code;
			}
			
			@FindBy(xpath = "//*[@id='lookuptxt_drawDownRequestDrawDownType_WIFT009MT']")
			private WebElement enter_drawdown_type;
			public WebElement enter_drawdown_type() {
				return enter_drawdown_type;
			}
			
			@FindBy(xpath = "//input[@id='drawDownRequestLongNameEnglish_WIFT009MT']")
			private WebElement enter_Description_English;
			public WebElement enter_Description_English() {
				return enter_Description_English;
			}
			
			@FindBy(xpath = "//*[@id='drawDownRequestValueDate_WIFT009MT']")
			private WebElement enter_valid_dateIn_drawDown_mainInformation;
			public WebElement enter_valid_dateIn_drawDown_mainInformation() {
				return enter_valid_dateIn_drawDown_mainInformation;
			}
			
			
			@FindBy(xpath = "//span[text()='Drawdown Additional Details']")
			private WebElement Click_Drawdown_Additional_Details_tab;
			public WebElement Click_Drawdown_Additional_Details_tab() {
				return Click_Drawdown_Additional_Details_tab;
			}
			
			@FindBy(xpath = "//input[@id='lookuptxt_drawDownRequestProduct_Class_WIFT009MT']")
			private WebElement Enter_value_Product_ClassLN;
			public WebElement Enter_value_Product_ClassLN() {
				return Enter_value_Product_ClassLN;
			}
			
			@FindBy(xpath = "//*[@id='drawDownRequestFC_Amount_WIFT009MT']")
			private WebElement Enter_FC_ammount;
			public WebElement Enter_FC_ammount() {
				return Enter_FC_ammount;
			}
			@FindBy(xpath = "//span[text()='Drawdown Main Information']")
			private WebElement click_drawdown_mainInformation;
			public WebElement click_drawdown_mainInformation() {
				return click_drawdown_mainInformation;
			}
			
			@FindBy(xpath = "//label[text()='Save ']")
			private WebElement Click_save_button_IndrawDown_Additional_Details_tab;
			public WebElement Click_save_button_IndrawDown_Additional_Details_tab() {
				return Click_save_button_IndrawDown_Additional_Details_tab;
			}
			
			@FindBy(xpath = "//span[text()='Verify/Deny']")
			private WebElement Click_verifyAndDeny_under_drawDownRequest;
			public WebElement Click_verifyAndDeny_under_drawDownRequest() {
				return Click_verifyAndDeny_under_drawDownRequest;
			}
			
			@FindBy(xpath = "//*[@id='drawDownRequestGridTbl_Id_WIFT009VD_pager_left']/table/tbody/tr/td[7]")
			private WebElement ClickClearSearch_verifyAndDeny_under_drawDownRequest;
			public WebElement ClickClearSearch_verifyAndDeny_under_drawDownRequest() {
				return ClickClearSearch_verifyAndDeny_under_drawDownRequest;
			}
			
			@FindBy(xpath = "//*[@id='td_drawDownRequestGridTbl_Id_WIFT009VD_1_fmsDrawDownVO.CODE']")
			private WebElement selectRecord_verifyAndDeny_under_drawDownRequest;
			public WebElement selectRecord_verifyAndDeny_under_drawDownRequest() {
				return selectRecord_verifyAndDeny_under_drawDownRequest;
			}
			
			@FindBy(xpath = "//*[@id='drawdownrequest_validate_btn_WIFT009VD']/span[2]")
			private WebElement Click_verifyButton_InverifyAndDeny;
			public WebElement Click_verifyButton_InverifyAndDeny() {
				return Click_verifyButton_InverifyAndDeny;
			}
			
			@FindBy(xpath = "//span[contains(text(),' Yes ')]")
			private WebElement Click_yes_in_postApproval;
			public WebElement Click_yes_in_postApproval() {
				return Click_yes_in_postApproval;
			}
			
			@FindBy(xpath = "//*[@id='WIFT009AP']/span[2]")
			private WebElement Click_ApproveReject_under_drawdown;
			public WebElement Click_ApproveReject_under_drawdown() {
				return Click_ApproveReject_under_drawdown;
			}
			
			
			@FindBy(xpath = "//*[@id='drawDownRequestGridTbl_Id_WIFT009AP_pager_left']/table/tbody/tr/td[7]")
			private WebElement ClickClearsearch_InApproveReject_under_drawdown;
			public WebElement ClickClearsearch_InApproveReject_under_drawdown() {
				return ClickClearsearch_InApproveReject_under_drawdown;
			}
			
			
			@FindBy(xpath = "//*[@id='td_drawDownRequestGridTbl_Id_WIFT009AP_1_fmsDrawDownVO.CODE']")
			private WebElement SelectRecord_InApproveReject_under_drawdown;
			public WebElement SelectRecord_InApproveReject_under_drawdown() {
				return SelectRecord_InApproveReject_under_drawdown;
			}
			
			
			@FindBy(xpath = "//span[contains(text(),' Approve ')]")
			private WebElement approveThe_recordInApproveReject_under_drawdown;
			public WebElement approveThe_recordInApproveReject_under_drawdown() {
				return approveThe_recordInApproveReject_under_drawdown;
			}
			
			
			@FindBy(xpath = "//td[text()='Facility Closure Request']")
			private WebElement click_Facility_Closure_Request_under_drawdown;
			public WebElement click_Facility_Closure_Request_under_drawdown() {
				return click_Facility_Closure_Request_under_drawdown;
			}
			
			@FindBy(xpath = "//*[@id='WIFT010MT']/span[2]")
			private WebElement clickMainteance_under_Facility_Closure_Request_under_drawdown;
			public WebElement clickMainteance_under_Facility_Closure_Request_under_drawdown() {
				return clickMainteance_under_Facility_Closure_Request_under_drawdown;
			}
			
			@FindBy(xpath = "//input[@id='lookuptxt_facilityClosureRequestFacilityReference_WIFT010MT']")
			private WebElement Enter_Facility_Reference_InMainteance_under_Facility_Closure_Request;
			public WebElement Enter_Facility_Reference_InMainteance_under_Facility_Closure_Request() {
				return Enter_Facility_Reference_InMainteance_under_Facility_Closure_Request;
			}
			
			@FindBy(xpath = "//*[@id='RFFRF00MT']/span[2]")
			private WebElement Click__maintenace_under_request_for_financing;
			public WebElement Click__maintenace_under_request_for_financing() {
				return Click__maintenace_under_request_for_financing;
			}
			
			//403133
			@FindBy(xpath = "//label[text()='Language ']")
			private WebElement Change_Language;
			public WebElement Change_Language() {
				return Change_Language;
			}
			
			
			@FindBy(xpath = "//a[text()='French']")
			private WebElement Select_LanguageIn_French;
			public WebElement Select_LanguageIn_French() {
				return Select_LanguageIn_French;
			}
			
			@FindBy(xpath = "//*[@id='infoBarSearchButton_RFFRF00MT']")
			private WebElement search_recordIn__maintenace_under_request_for_financing;
			public WebElement search_recordIn__maintenace_under_request_for_financing_607() {
				return search_recordIn__maintenace_under_request_for_financing;
			}
			
			@FindBy(xpath = "//*[@id='requestFinancingGridTbl_Id_RFFRF00MT_pager_left']/table/tbody/tr/td[7]")
			private WebElement Clearsearch_recordIn__maintenace_under_request_for_financing;
			public WebElement Clearsearch_recordIn__maintenace_under_request_for_financing_607() {
				return Clearsearch_recordIn__maintenace_under_request_for_financing;
			}
			
			@FindBy(xpath = "//*[@id='td_requestFinancingGridTbl_Id_RFFRF00MT_1_fmsRequestFinancingVO.CODE']")
			private WebElement select_recordIn__maintenace_under_request_for_financing;
			public WebElement select_recordIn__maintenace_under_request_for_financing_607() {
				return select_recordIn__maintenace_under_request_for_financing;
			}
			
			
			@FindBy(xpath = "//span[text()='Disbursement/Sublimit']")
			private WebElement DisbursementSublimit__Inmaintenace_under_request_for_financing;
			public WebElement DisbursementSublimit__Inmaintenace_under_request_for_financing_607() {
				return DisbursementSublimit__Inmaintenace_under_request_for_financing;
			}
			
			@FindBy(xpath = "//span[text()='Customer Credit Memo']")
			private WebElement Customer_Credit_Memo__Inmaintenace_under_request_for_financing;
			public WebElement Customer_Credit_Memo__Inmaintenace_under_request_for_financing_607() {
				return Customer_Credit_Memo__Inmaintenace_under_request_for_financing;
			}
			
			@FindBy(xpath = "//span[text()='Request Details']")
			private WebElement Request_Details__Inmaintenace_under_request_for_financing;
			public WebElement Request_Details__Inmaintenace_under_request_for_financing_607() {
				return Request_Details__Inmaintenace_under_request_for_financing;
			}
			
			@FindBy(xpath = "//span[text()='Customer Grading & Recommendations']")
			private WebElement Customer_Grading_Recommendations__Inmaintenace_under_request_for_financing;
			public WebElement Customer_Grading_Recommendations__Inmaintenace_under_request_for_financing_607() {
				return Customer_Grading_Recommendations__Inmaintenace_under_request_for_financing;
			}
			
			@FindBy(xpath = "//*[@id='lookuptxt_facilityClosureRequestFacilityReference_WIFT010MT']")
			private WebElement enter_Facility_Reference_Mainteance_under_Facility_Closure_Request;
			public WebElement enter_Facility_Reference_Mainteance_under_Facility_Closure_Request_607() {
				return enter_Facility_Reference_Mainteance_under_Facility_Closure_Request;
			}
			
			
			//570417
			@FindBy(xpath = "//span[text()='Remove Tab']")
			private WebElement CloseTab;
			public WebElement CloseTab() {
				return CloseTab;
			}
			
			@FindBy(xpath = "//span[text()='Maintenance']")
			private WebElement cLICK_MAINTEANCE_under_RequestForFinancing;
			public WebElement cLICK_MAINTEANCE_under_RequestForFinancing_607() {
				return cLICK_MAINTEANCE_under_RequestForFinancing;
			}
			
			@FindBy(xpath = "//*[@id='lookuptxt_fmsFacilityFromFacility_RFFRF00MT']")
			private WebElement Existing_Facility_No_InMainteance_under_RequestForFinancing;
			public WebElement Existing_Facility_No_InMainteance_under_RequestForFinancing_607() {
				return Existing_Facility_No_InMainteance_under_RequestForFinancing;
			}
			
			@FindBy(xpath = "//label[text()='Modification Reason ']")
			private WebElement ClickModificationReason_InMainteance_under_RequestForFinancing;
			public WebElement ClickModificationReason_InMainteance_under_RequestForFinancing_607() {
				return ClickModificationReason_InMainteance_under_RequestForFinancing;
			}
			
			@FindBy(xpath = "//*[@id='add_reguestFinancingModificationRejectReasonGrid_RFFRF00MT']")
			private WebElement ClickAddBtn_ModificationReason_InMainteance_under_RequestForFinancing;
			public WebElement ClickAddBtn_ModificationReason_InMainteance_under_RequestForFinancing_607() {
				return ClickAddBtn_ModificationReason_InMainteance_under_RequestForFinancing;
			}
			
			@FindBy(xpath = "//*[@id='td_reguestFinancingModificationRejectReasonGrid_RFFRF00MT_1_rn']")
			private WebElement ClickFirstLine_ModificationReason_InMainteance_under_RequestForFinancing;
			public WebElement ClickFirstLine_ModificationReason_InMainteance_under_RequestForFinancing_607() {
				return ClickFirstLine_ModificationReason_InMainteance_under_RequestForFinancing;
			}
			
			@FindBy(xpath = "//*[@id='td_reguestFinancingModificationRejectReasonGrid_RFFRF00MT_1_fmsRequestFinancingModifyReasonVO.TRIGGER_TYPE']//select")
			private WebElement SelectReason_ModificationReason_InMainteance_under_RequestForFinancing;
			public WebElement SelectReason_ModificationReason_InMainteance_under_RequestForFinancing_607() {
				return SelectReason_ModificationReason_InMainteance_under_RequestForFinancing;
			}
			
			@FindBy(xpath = "//*[@id='td_reguestFinancingModificationRejectReasonGrid_RFFRF00MT_1_fmsRequestFinancingModifyReasonVO.DETAILS']//textarea")
			private WebElement TextReason_ModificationReason_InMainteance_under_RequestForFinancing;
			public WebElement TextReason_ModificationReason_InMainteance_under_RequestForFinancing_607() {
				return TextReason_ModificationReason_InMainteance_under_RequestForFinancing;
			}
			
			
			@FindBy(xpath = "//*[@id='requestFinancingFacilityTotalvalue_RFFRF00MT']")
			private WebElement EnterTotallimit_InMainteance_under_RequestForFinancing;
			public WebElement EnterTotallimit_InMainteance_under_RequestForFinancing_607() {
				return EnterTotallimit_InMainteance_under_RequestForFinancing;
			}
			
			@FindBy(xpath = "//*[@id='requestFinancingFacilityValue_RFFRF00MT']")
			private WebElement CheckFinance_Amount_InMainteance_under_RequestForFinancing;
			public WebElement CheckFinance_Amount_InMainteance_under_RequestForFinancing_607() {
				return CheckFinance_Amount_InMainteance_under_RequestForFinancing;
			}
			
			@FindBy(xpath = "//span[text()='Disbursement/Sublimit']")
			private WebElement Click_DisbursementSublimit_InMainteance_under_RequestForFinancing;
			public WebElement Click_DisbursementSublimit_InMainteance_under_RequestForFinancing_607() {
				return Click_DisbursementSublimit_InMainteance_under_RequestForFinancing;
			}
			
			@FindBy(xpath = "//*[@id='td_RequestFinancingLimitDetailsGridId_RFFRF00MT_1_fmsAppLimitDetVO.FACILITY_VALUE']")
			private WebElement Check_total_limit_InDisbursementSublimit;
			public WebElement Check_total_limit_InDisbursementSublimit_607() {
				return Check_total_limit_InDisbursementSublimit;
			}
			
			@FindBy(xpath = "//*[@id='requestForFinance_save_as_draft_btn_RFFRF00MT']")
			private WebElement click_Save_btn_inInMainteance_under_RequestForFinancing;
			public WebElement click_Save_btn_inInMainteance_under_RequestForFinancing_607() {
				return click_Save_btn_inInMainteance_under_RequestForFinancing;
			}
			
			@FindBy(xpath = "//*[@id='requestForFinance_save_btn_RFFRF00MT']")
			private WebElement click_validate_btn_inInMainteance_under_RequestForFinancing;
			public WebElement click_validate_btn_inInMainteance_under_RequestForFinancing_607() {
				return click_validate_btn_inInMainteance_under_RequestForFinancing;
			}
			
			@FindBy(xpath = "//span[text()='Approve Level 1']")
			private WebElement Click_ApproveLevel1_under_RequestForFinancing;
			public WebElement Click_ApproveLevel1_under_RequestForFinancing_607() {
				return Click_ApproveLevel1_under_RequestForFinancing;
			}
			
			@FindBy(xpath = "//*[@id='requestFinancingGridTbl_Id_RFFRF00P1_pager_left']/table/tbody/tr/td[7]")
			private WebElement Click_clearSearch_InApproveLevel1_under_RequestForFinancing;
			public WebElement Click_clearSearch_InApproveLevel1_under_RequestForFinancing_607() {
				return Click_clearSearch_InApproveLevel1_under_RequestForFinancing;
			}
			
			@FindBy(xpath = "//*[@id='td_requestFinancingGridTbl_Id_RFFRF00P1_1_fmsRequestFinancingVO.CODE']")
			private WebElement Select_Record_InApproveLevel1_under_RequestForFinancing;
			public WebElement Select_Record_InApproveLevel1_under_RequestForFinancing_607() {
				return Select_Record_InApproveLevel1_under_RequestForFinancing;
			}
			
			@FindBy(xpath = "//*[@id='requestFinancingFacilityTotalvalue_RFFRF00P1']")
			private WebElement Check_totalAmmount_InApproveLevel1_under_RequestForFinancing;
			public WebElement Check_totalAmmount_InApproveLevel1_under_RequestForFinancing_607() {
				return Check_totalAmmount_InApproveLevel1_under_RequestForFinancing;
			}
			
			@FindBy(xpath = "//*[@id='requestFinancingFacilityValue_RFFRF00P1']")
			private WebElement Click_Finance_Amount_InApproveLevel1;
			public WebElement Click_Finance_Amount_InApproveLevel1_607() {
				return Click_Finance_Amount_InApproveLevel1;
			}
			
			@FindBy(xpath = "//span[text()='Disbursement/Sublimit']")
			private WebElement Click_DisbursementSublimit_InApproveLevel1_under_RequestForFinancing;
			public WebElement Click_DisbursementSublimit_InApproveLevel1_under_RequestForFinancing_607() {
				return Click_DisbursementSublimit_InApproveLevel1_under_RequestForFinancing;
			}
			
			@FindBy(xpath = "//*[@id='td_RequestFinancingLimitDetailsGridId_RFFRF00P1_1_fmsAppLimitDetVO.FACILITY_VALUE']")
			private WebElement Check_Totallimit_InDisbursementSublimit_ApproveLevel1;
			public WebElement Check_Totallimit_InDisbursementSublimit_ApproveLevel1_607() {
				return Check_Totallimit_InDisbursementSublimit_ApproveLevel1;
			}
			
	
			
			
			
			
}
