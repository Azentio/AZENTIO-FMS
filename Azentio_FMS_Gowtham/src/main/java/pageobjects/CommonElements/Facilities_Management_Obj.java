package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facilities_Management_Obj {

	WebDriver driver;

	public Facilities_Management_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[text()='Request']")
	private WebElement FMS_core_request_module;
	public WebElement FMSCoreRequestModule_607() {
		return FMS_core_request_module;
	}
	
	@FindBy(xpath = "//td[text()='Request Financing']")
	private WebElement request_financing_feature;
	public WebElement requestFinancingFeature_607() {
		return request_financing_feature;
	}
	
	@FindBy(xpath = "//div[@id='_selenuimRFFRF00']//td[contains(text(),'Request')]")
	private WebElement request_for_financing_feature;
	public WebElement requestForFinancingFeature_607() {
		return request_for_financing_feature;
	}
	
	@FindBy(xpath = "//a[@id='RFFRF00MT']")
	private WebElement request_for_financing_maintanance;
	public WebElement requestForFinancingMaintanance_607() {
		return request_for_financing_maintanance;
	}
	
	@FindBy(xpath = "//select[@id='requestFinancingApplicationFor_RFFRF00MT']")
	private WebElement request_for_financing_main_reason_for_dropdown;
	public WebElement requestForFinancingMainReasonForDropdown_607() {
		return request_for_financing_main_reason_for_dropdown;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinanacingCif_RFFRF00MT']")
	private WebElement request_for_financing_main_customer_input;
	public WebElement requestForFinancingMainCustomerInput_607() {
		return request_for_financing_main_customer_input;
	}
	
	@FindBy(xpath = "(//input[@id='requestFinancingCifShortNameEng_RFFRF00MT'])[1]")
	private WebElement request_for_financing_short_name_input;
	public WebElement requestForFinancingMainShortNameInput_607() {
		return request_for_financing_short_name_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingFacilityType_RFFRF00MT']")
	private WebElement request_for_financing_main_facility_type_input;
	public WebElement requestForFinancingMainFacilityTypeInput_607() {
		return request_for_financing_main_facility_type_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingFacilityCurrency_RFFRF00MT']")
	private WebElement request_for_financing_main_CY_input;
	public WebElement requestForFinancingMainCYInput_607() {
		return request_for_financing_main_CY_input;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingFacilityTotalvalue_RFFRF00MT']")
	private WebElement request_for_financing_main_total_limit_input;
	public WebElement requestForFinancingMainTotalLimitInput_607() {
		return request_for_financing_main_total_limit_input;
	}
	
	@FindBy(xpath = "//li[@id='requestFinancingLimitDtlsTabs_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab;
	public WebElement requestForFinancingMainSublimitTab_607() {
		return request_for_financing_main_sublimit_tab;
	}
	
	@FindBy(xpath = "//td[@id='add_RequestFinancingLimitDetailsGridId_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_add_new_btn;
	public WebElement requestForFinancingMainSublimitTabAddNewBtn_607() {
		return request_for_financing_main_sublimit_tab_add_new_btn;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingLimitDetailsGeneralFacilityProductClass_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_productclass_input;
	public WebElement requestForFinancingMainSublimitTabAddNewProductClassInput_607() {
		return request_for_financing_main_sublimit_tab_productclass_input;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsRfNewMargin_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_margin_input;
	public WebElement requestForFinancingMainSublimitTabAddNewMarginInput_607() {
		return request_for_financing_main_sublimit_tab_margin_input;
	}
	
	@FindBy(xpath = "//button[@id='limitDetails_add_btn_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_add_btn;
	public WebElement requestForFinancingMainSublimitTabAddBtn_607() {
		return request_for_financing_main_sublimit_tab_add_btn;
	}
	
	@FindBy(xpath = "//button[@id='requestForFinance_save_as_draft_btn_RFFRF00MT']")
	private WebElement request_for_financing_main_save_btn;
	public WebElement requestForFinancingMainSaveBtn_607() {
		return request_for_financing_main_save_btn;
	}
	
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
   	private WebElement Confirmsave_popup_okbutton;
       public WebElement confirmsavepopupokbutton_607() {
   		return Confirmsave_popup_okbutton;
   	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Confirmsave_Successfully_popup;
	public WebElement confirmsavesuccessfullypopup_607() {
		return Confirmsave_Successfully_popup;
	}
	
	@FindBy(xpath = "//button[@id='requestForFinance_save_btn_RFFRF00MT']")
	private WebElement request_for_financing_main_validate_btn;
	public WebElement requestForFinancingMainValidateBtn_607() {
		return request_for_financing_main_validate_btn;
	}

	//*[@id='_popup_path_sol_ok']
	@FindBy(xpath = "//*[@id='_popup_path_sol_ok']")
	private WebElement success_popup_msg;
	public WebElement successPopupMsg_607() {
		return success_popup_msg;
	}	
	
	@FindBy(xpath = "/html/body/div[47]/div[1]/a")
	private WebElement send_alert_popup_close;
	public WebElement sendAlertPopupClose_607() {
		return send_alert_popup_close;
	}	
	
	@FindBy(xpath = "//a[@id='RFFRF00P1']")
	private WebElement request_for_financing_approve_level1;
	public WebElement requestForFinancingApproveLevel1_607() {
		return request_for_financing_approve_level1;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_RFFRF00P1_gs_fmsRequestFinancingVO.CODE']")
	private WebElement request_for_financing_approve_level1_code;
	public WebElement requestForFinancingApproveLevel1Code_607() {
		return request_for_financing_approve_level1_code;
	}
	
	@FindBy(xpath = "//td[@id='td_requestFinancingGridTbl_Id_RFFRF00P1_1_fmsRequestFinancingVO.CODE']")
	private WebElement request_for_financing_approve_level1_first_row;
	public WebElement requestForFinancingApproveLevel1FirstRow_607() {
		return request_for_financing_approve_level1_first_row;
	}
	
	@FindBy(xpath="//*[@id=\"dismissbut_WIFT008UP\"]/span")
    private WebElement SendAlert_pop;
    public WebElement SendAlert_pop() {
      return SendAlert_pop;
    }
  
    @FindBy(xpath="//span[text()='Disbursement/Sublimit']")
    private WebElement Click_DisbursementSublimitInApproveLev1;
    public WebElement Click_DisbursementSublimitInApproveLev1() {
      return Click_DisbursementSublimitInApproveLev1;
    }
  
    @FindBy(xpath="//*[@id='td_RequestFinancingLimitDetailsGridId_RFFRF00P1_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
    private WebElement Select_productClassIn_Approvelev1;
    public WebElement Select_productClassIn_Approvelev1() {
      return Select_productClassIn_Approvelev1;
    }
  
    @FindBy(xpath="//*[@id='requestFinancingLimitDetailsRfNewValue_RFFRF00P1']")
    private WebElement Check_ammount_In_productClass;
    public WebElement Check_ammount_In_productClass() {
      return Check_ammount_In_productClass;
    }
    
    @FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement ServerLoding_pop;
	public WebElement ServerLoding_pop() {
		return ServerLoding_pop;
	}
	
	@FindBy(xpath = "//div[text()='CONFIRM']")
	private WebElement CONFIRM_pop;
	public WebElement CONFIRM_pop() {
		return CONFIRM_pop;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement facility_already_created_popup;
	public WebElement facilityAlreadyCreatedPopup() {
		return facility_already_created_popup;
	}
    
    
    
    
    //@165388
	@FindBy(xpath = "//td[text()='Facilities Management']")
	private WebElement wifak_application_FacilityManagement;
	public WebElement wifakApplicationFacilitymanagement() {
		return wifak_application_FacilityManagement;
	}
	
	@FindBy(xpath="//a[@id='WIFT008QY']")
	private WebElement FacilityManagement_QueryMenu;
	public WebElement facilitymanagementquerymenu() {
		return FacilityManagement_QueryMenu;
	}
	
	@FindBy(xpath="//*[@id='facilityManagementGridTbl_Id_WIFT008QY_pager_left']/table/tbody/tr/td[7]")
	private WebElement FacilityManagement_QueryMenu_Clearbtn;
	public WebElement facilitymanagementquerymenuclearbtn() {
		return FacilityManagement_QueryMenu_Clearbtn;
	}
	
	@FindBy(xpath = "//table[@id='facilityManagementGridTbl_Id_WIFT008QY']")
	private WebElement FacilityManagement_QueryMenu_table;
	public WebElement facilitymanagementquerymenuTable() {
		return FacilityManagement_QueryMenu_table;
	}
	
	@FindBy(xpath = "//table[@id='facilityManagementGridTbl_Id_WIFT008QY']//td[@tdlabel='Code']")
	private WebElement FacilityManagement_QueryMenu_code;
	public WebElement facilitymanagementquerymenuCode() {
		return FacilityManagement_QueryMenu_code;
	}
    
	@FindBy(xpath ="//td[text()='Facilities Management']")
    private WebElement Facility_Management ;
    public WebElement facilitymanagement_607() {
        return Facility_Management;

    }
    
    //@172636
  
    @FindBy(xpath ="//span[text()='Update After Approve']")
    private WebElement Click_updateAfterApprove_under_Facilities_Management;
    public WebElement Click_updateAfterApprove_under_Facilities_Management_607() {
        return Click_updateAfterApprove_under_Facilities_Management;
    }
    
  
    @FindBy(xpath ="//*[@id='facilityManagementGridTbl_Id_WIFT008UP_pager_left']/table/tbody/tr/td[7]")
    private WebElement Click_Clearsearch_updateAfterApprove_under_Facilities_Management;
    public WebElement Click_Clearsearch_updateAfterApprove_under_Facilities_Management_607() {
        return Click_Clearsearch_updateAfterApprove_under_Facilities_Management;
    }
  
    @FindBy(xpath ="//*[@id='td_facilityManagementGridTbl_Id_WIFT008UP_1_fmsFacilityVO.CODE']")
    private WebElement SelectRecord_updateAfterApprove_under_Facilities_Management;
    public WebElement SelectRecord_updateAfterApprove_under_Facilities_Management_607() {
        return SelectRecord_updateAfterApprove_under_Facilities_Management;
    }
  
    @FindBy(xpath ="//span[text()='Facility Application Details']")
    private WebElement Click_Facility_Application_Details_InupdateAfterApprove_under_Facilities_Management;
    public WebElement Click_Facility_Application_Details_InupdateAfterApprove_under_Facilities_Management() {
        return Click_Facility_Application_Details_InupdateAfterApprove_under_Facilities_Management;
    }
  
    @FindBy(xpath ="//*[@id='facilityMgtAppDet_Exceed_Facility_Sublimit_WIFT008UP']")
    private WebElement Check_Exceed_Facility_at_SublimitInupdateAfterApprove_under_Facilities_Management;
    public WebElement Check_Exceed_Facility_at_SublimitInupdateAfterApprove_under_Facilities_Management_607() {
        return Check_Exceed_Facility_at_SublimitInupdateAfterApprove_under_Facilities_Management;
    }
  
    @FindBy(xpath ="//span[text()='Document Details']")
    private WebElement click_DocumentDetails_InupdateAfterApprove_under_Facilities_Management;
    public WebElement click_DocumentDetails_InupdateAfterApprove_under_Facilities_Management_607() {
        return click_DocumentDetails_InupdateAfterApprove_under_Facilities_Management;
    }
    
    @FindBy(xpath ="//*[@id='td_FacilityManagementDocumentDetailsGrid_WIFT008UP_0_rn']")
    private WebElement Click_Firstline_InDocumentDetails;
    public WebElement Click_Firstline_InDocumentDetails_607() {
        return Click_Firstline_InDocumentDetails;
    }
  
    @FindBy(xpath ="//*[@id='1_fmsFacDocumentsVO.SOL_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
    private WebElement enter_SolicitorDateSent_InDocumentDetails;
    public WebElement enter_SolicitorDateSent_InDocumentDetails_607() {
        return enter_SolicitorDateSent_InDocumentDetails;
    }
  
    @FindBy(xpath ="//*[@id=\"2_fmsFacDocumentsVO.SOL_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008UP\"]")
    private WebElement enter_2ndSolicitorDateSent_InDocumentDetails;
    public WebElement  enter_2ndSolicitorDateSent_InDocumentDetails_607() {
        return  enter_2ndSolicitorDateSent_InDocumentDetails;
    }
  
    @FindBy(xpath ="//*[@id='1_fmsFacDocumentsVO.SOL_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
    private WebElement enter_SolicitorDateReceived_InDocumentDetails;
    public WebElement enter_SolicitorDateReceived_InDocumentDetails_607() {
        return enter_SolicitorDateReceived_InDocumentDetails;
    }
  
    @FindBy(xpath ="//*[@id='2_fmsFacDocumentsVO.SOL_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
    private WebElement enter_2ndSolicitorDateReceived_InDocumentDetails;
    public WebElement enter_2ndSolicitorDateReceived_InDocumentDetails_607() {
        return enter_2ndSolicitorDateReceived_InDocumentDetails;
    }
  
    @FindBy(xpath ="//*[@id='1_fmsFacDocumentsVO.EST_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
    private WebElement enter_EstimatorDateSent_InDocumentDetails;
    public WebElement enter_EstimatorDateSent_InDocumentDetails_607() {
        return enter_EstimatorDateSent_InDocumentDetails;
    }
    @FindBy(xpath ="//*[@id='2_fmsFacDocumentsVO.EST_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
    private WebElement enter_2ndEstimatorDateSent_InDocumentDetails;
    public WebElement enter_2ndEstimatorDateSent_InDocumentDetails_607() {
        return enter_2ndEstimatorDateSent_InDocumentDetails;
    }
  
    @FindBy(xpath ="//*[@id='1_fmsFacDocumentsVO.EST_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
    private WebElement enter_EstimatorDateReceived_InDocumentDetails;
    public WebElement enter_EstimatorDateReceived_InDocumentDetails_607() {
        return enter_EstimatorDateReceived_InDocumentDetails;
    }
    
    @FindBy(xpath ="//*[@id='2_fmsFacDocumentsVO.EST_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
    private WebElement enter_2ndEstimatorDateReceived_InDocumentDetails;
    public WebElement enter_2ndEstimatorDateReceived_InDocumentDetails_607() {
        return enter_2ndEstimatorDateReceived_InDocumentDetails;
    }
  
    @FindBy(xpath ="//*[@id='1_fmsFacDocumentsVO.CUSTODIAN_SENT_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
    private WebElement enter_CustodiandateSent_InDocumentDetails;
    public WebElement enter_CustodiandateSent_InDocumentDetails_607() {
        return enter_CustodiandateSent_InDocumentDetails;
    }
    @FindBy(xpath ="//*[@id='2_fmsFacDocumentsVO.CUSTODIAN_SENT_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
    private WebElement enter_2ndCustodiandateSent_InDocumentDetails;
    public WebElement enter_2ndCustodiandateSent_InDocumentDetails_607() {
        return enter_2ndCustodiandateSent_InDocumentDetails;
    }
    
  
    @FindBy(xpath ="//*[@id=\"td_FacilityManagementDocumentDetailsGrid_WIFT008UP_2_fmsFacDocumentsVO.SOL_DATE_SENT\"]")
    private WebElement Click_Secondline_InDocumentDetails;
    public WebElement Click_Secondline_InDocumentDetails_607() {
        return Click_Secondline_InDocumentDetails;
    }
    
  
    @FindBy(xpath ="//*[@id='facilitymanagement_save_btn_WIFT008UP']")
    private WebElement Click_saveButton_InupdateAfterApprove_under_Facilities_Management;
    public WebElement Click_saveButton_InupdateAfterApprove_under_Facilities_Management_607() {
        return Click_saveButton_InupdateAfterApprove_under_Facilities_Management;
    }
  
    @FindBy(xpath ="//span[text()='Approve/Reject']")
    private WebElement Click_ApproveReject_under_Facilities_Management;
    public WebElement Click_ApproveReject_under_Facilities_Management_607() {
        return Click_ApproveReject_under_Facilities_Management;
    }
    
    
  
    @FindBy(xpath ="//*[@id='facilityManagementGridTbl_Id_WIFT008AP_pager_left']/table/tbody/tr/td[7]")
    private WebElement Click_Clearsearch_InApproveReject_under_Facilities_Management;
    public WebElement Click_Clearsearch_InApproveReject_under_Facilities_Management() {
        return Click_Clearsearch_InApproveReject_under_Facilities_Management;
    }
    @FindBy(xpath ="//*[@id='facilityManagementGridTbl_Id_WIFT008AP_gs_fmsFacilityVO.CODE']")
    private WebElement SearchCodeIn_ApproveReject_under_Facilities_Management;
    public WebElement SearchCodeIn_ApproveReject_under_Facilities_Management_607() {
        return SearchCodeIn_ApproveReject_under_Facilities_Management;
    }
  
    @FindBy(xpath ="//*[@id='td_facilityManagementGridTbl_Id_WIFT008AP_1_fmsFacilityVO.CODE']")
    private WebElement SelectRecordIn_ApproveReject_under_Facilities_Management;
    public WebElement SelectRecordIn_ApproveReject_under_Facilities_Management_607() {
        return SelectRecordIn_ApproveReject_under_Facilities_Management;
    }
  
    @FindBy(xpath ="//*[@id='facilityManagement_approve_btn_WIFT008AP']")
    private WebElement ApproveRecordIn_ApproveReject_under_Facilities_Management;
    public WebElement ApproveRecordIn_ApproveReject_under_Facilities_Management_607() {
        return ApproveRecordIn_ApproveReject_under_Facilities_Management;
    }
  
    @FindBy(xpath ="//span[text()='Maintenance']")
    private WebElement ClickMainteance_under_Facilities_Management;
    public WebElement ClickMainteance_under_Facilities_Management_607() {
        return ClickMainteance_under_Facilities_Management;
    }
  
    @FindBy(xpath ="//*[@id='infoBarSearchButton_WIFT008MT']")
    private WebElement Click_search_InMainteance_under_Facilities_Management;
    public WebElement Click_search_InMainteance_under_Facilities_Management_607() {
        return Click_search_InMainteance_under_Facilities_Management;
    }
  
    @FindBy(xpath ="//*[@id='facilityManagementGridTbl_Id_WIFT008MT_pager_left']/table/tbody/tr/td[7]")
    private WebElement Click_ClearSearch_InMainteance_under_Facilities_Management;
    public WebElement Click_ClearSearch_InMainteance_under_Facilities_Management_607() {
        return Click_ClearSearch_InMainteance_under_Facilities_Management;
    }
  
    @FindBy(xpath ="//*[@id='td_facilityManagementGridTbl_Id_WIFT008MT_1_fmsFacilityVO.CODE']")
    private WebElement SelectRecord_InMainteance_under_Facilities_Management;
    public WebElement SelectRecord_InMainteance_under_Facilities_Management_607() {
        return SelectRecord_InMainteance_under_Facilities_Management;
    }
  
    @FindBy(xpath ="//span[text()='Facility Application Details']")
    private WebElement click_Facility_Application_Details_InMainteance_under_Facilities_Management;
    public WebElement click_Facility_Application_Details_InMainteance_under_Facilities_Management_607() {
        return click_Facility_Application_Details_InMainteance_under_Facilities_Management;
    }
  
    @FindBy(xpath ="//*[@id=\"facilityMgtAppDet_Exceed_Facility_Sublimit_WIFT008MT\"]")
    private WebElement check_theFlagIsCheckorNot_InFacility_Application_Details_InMainteance_under_Facilities_Management;
    public WebElement check_theFlagIsCheckorNot_InFacility_Application_Details_InMainteance_under_Facilities_Management_607() {
        return check_theFlagIsCheckorNot_InFacility_Application_Details_InMainteance_under_Facilities_Management;
    }
  
    @FindBy(xpath ="//span[text()='Document Details']")
    private WebElement Click_DocumentDetails_InMainteance_under_Facilities_Management;
    public WebElement Click_DocumentDetails_InMainteance_under_Facilities_Management_607() {
        return Click_DocumentDetails_InMainteance_under_Facilities_Management;
    }
  
    @FindBy(xpath ="//*[@id=\"td_FacilityManagementDocumentDetailsGrid_WIFT008MT_1_fmsFacDocumentsVO.SOL_DATE_SENT\"]")
    private WebElement Check_dateFilledOrNot_InDocumentDetails_InMainteance_under_Facilities_Management;
    public WebElement Check_dateFilledOrNot_InDocumentDetails_InMainteance_under_Facilities_Management_607() {
        return Check_dateFilledOrNot_InDocumentDetails_InMainteance_under_Facilities_Management;
    }
    
    
    
    
    
    
    
    
    
}
