package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WIFAK_ApplicationOBJ_611 {
	WebDriver driver;	
	public WIFAK_ApplicationOBJ_611(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="(//td[text()='WIFAK APPLICATION'])[1]")
	private WebElement WIFAK_APPLICATION1;
	public WebElement wifakapplication1_611() {
		return WIFAK_APPLICATION1;
	}
	@FindBy(xpath="(//td[text()='WIFAK APPLICATION'])[2]")
	private WebElement WIFAK_APPLICATION2;
	public WebElement wifakapplication2_611() {
		return WIFAK_APPLICATION2;
	}
	@FindBy(xpath="//td[text()='Application For Financial Facilities']")
	private WebElement Applicationfor_financial_facilities;
	public WebElement applicationforfinancialfacilities_611() {
		return Applicationfor_financial_facilities;
	}
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement MaintenANce_Menu;
	public WebElement maintenancemenu_611() {
		return MaintenANce_Menu;
	}
	@FindBy(xpath="//select[@id='applicationFacilityApplicationfor_WIFT001MT']")
	private WebElement Select_new_Facility;
	public WebElement selectnewfacility_611() {
		return Select_new_Facility;
	}
	@FindBy(xpath="//li[@id='applicationFacilityMainInfoTabs_WIFT001MT']")
	private WebElement Main_Information;
	public WebElement maininformation_611() {
		return Main_Information;
	}
	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilitycif_WIFT001MT']")
	private WebElement CiF_NUm_seARCHbox;
	public WebElement cifnumsearchbox_611() {
		return CiF_NUm_seARCHbox;
	}

	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilityFacilityType_WIFT001MT']")
	private WebElement FacilityTYPEDetails_Faciltiytype;
	public WebElement facilitytypedetailsfacilitytype_611() {
		return FacilityTYPEDetails_Faciltiytype;
	}
	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilityCountry_WIFT001MT']")
	private WebElement FacilityTYPEDetails_COUNTRyoffinancing;
	public WebElement facilitytypedetailscountryoffinancing_611() {
		return FacilityTYPEDetails_COUNTRyoffinancing;
	}
	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilityRating_WIFT001MT']")
	private WebElement FacilityTYPEDetails_facilityRating;
	public WebElement facilitytypedetailsfacilityrating_611() {
		return FacilityTYPEDetails_facilityRating;
	}
	
	@FindBy(xpath = "//li[@id='applicationFacilityAdditionDetailsTabs_WIFT001MT']")
	private WebElement secondTAb_Additionaldetails;
	public WebElement secondtabadditionaldetails_611() {
		return secondTAb_Additionaldetails;
	}
	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilitylimitcurrency_WIFT001MT']")
	private WebElement Additionaldetails_Currencycode ;
	public WebElement additionaldetailscurrencycode_611() {
		return Additionaldetails_Currencycode;
	}
	@FindBy(xpath="//input[@id='applicationFacilitytotalvalue_WIFT001MT']")
	private WebElement Additionaldetails_Totalvalue ;
	public WebElement additionaldetailstotalvalue_611() {
		return Additionaldetails_Totalvalue;
	}
	@FindBy(xpath="//li[@id='applicationFacilityDocumentDetailsTabs_WIFT001MT']/a/span[text()='Document Details']")
	private WebElement SeventhTab_DocumentDetails ;
	public WebElement seventhtabdocumentdetails_611() {
		return SeventhTab_DocumentDetails;
	}
	@FindBy(xpath="//span[@id='spanLookup_applicationFacilityEstimator_WIFT001MT']")
	private WebElement Estimatorsname_firstsearchbox ;
	public WebElement estimatorsnamefirstsearchbox_611() {
		return Estimatorsname_firstsearchbox;
	}
	@FindBy(xpath="//input[@id='gridtab_applicationFacilityEstimator_WIFT001MT_gs_CODE']")
	private WebElement Estimatorsname_secondsearchbox ;
	public WebElement estimatorsnamesecondsearchbox_611() {
		return Estimatorsname_secondsearchbox;
	}
	@FindBy(xpath="//*[@id=\"td_gridtab_applicationFacilityEstimator_WIFT001MT_1_CODE\"]")
	private WebElement Retrivedvalue_doubleclick ;
	public WebElement retrivedvaluedoubleclick_611() {
		return Retrivedvalue_doubleclick;
	}
	@FindBy(xpath = "//*[@id=\"applicationFacilityDateDetailssection_WIFT001MT\"]/table/tbody/tr[3]/td[2]/div/img")
	private WebElement additional_tab_expire_calender;
	public WebElement additionalTabExpireCalender_611() {
		return additional_tab_expire_calender;
	}

	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]")
	private WebElement additional_tab_expire_date;
	public WebElement additionalTabExpireDate_611() {
		return additional_tab_expire_date;
	}
	@FindBy(xpath = "//*[@id=\"applicationFacilityLimitDetailsTabs_WIFT001MT\"]")
	private WebElement Limitdetails_Tab;
	public WebElement limitdetailstab_611() {
		return Limitdetails_Tab;
	}
	@FindBy(xpath = "//*[@id=\"add_ApplicationFacilityLimitDetailsGrid_WIFT001MT\"]/div/span")
	private WebElement LimitdetailsTab_Addbutton;
	public WebElement limitdetailstabaddbutton_611() {
		return LimitdetailsTab_Addbutton;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement Product_Class_Value;
	public WebElement productclassvalue_611() {
		return Product_Class_Value;
	
    }
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsCLEAN_FLAG_WIFT001MT']")
    private WebElement limit_details_new_record_clean_flag;
    public WebElement limitDetailsNewRecordCleanFlag_611() {
        return limit_details_new_record_clean_flag;
    }
    
	@FindBy(xpath="//button[@id='limitDetails_add_btn_WIFT001MT']")
	private WebElement Add_product_class;
    public WebElement addProductclass_611() {
		return Add_product_class;
	}
	@FindBy(xpath="//span[contains(text(),'Document Details')]")
	private WebElement Documentdetails_Tab;
    public WebElement documentdetailstab_611() {
		return Documentdetails_Tab;
	}
    @FindBy(xpath="//input[@name='applicationFacilityCO.fmsApplSolestVO.SOLICITOR']")
	private WebElement DocumentdetailsTab_SolicitorName_searchbox;
    public WebElement solicitornamesearchbox_611() {
		return DocumentdetailsTab_SolicitorName_searchbox;
	}
  
    
    @FindBy(xpath="//input[@name='applicationFacilityCO.fmsApplSolestVO.ESTIMATOR']")
	private WebElement DocumentdetailsTab_EstimatorName_searchbox;
    public WebElement estimatornamesearchbox_611() {
		return DocumentdetailsTab_EstimatorName_searchbox;
	}

    @FindBy(xpath = "//button[@id='applicationfacility_save_as_draft_btn_WIFT001MT']")
	private WebElement limit_details_save_btn;
	public WebElement limitDetailsSaveBtn_611() {
		return limit_details_save_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement button_confirm_ok;
	public WebElement ButtonConfirmOk_611() {
		return button_confirm_ok;
	}
	
	@FindBy(xpath = "//div[text()='Success']")
    private WebElement success_popup;
    public WebElement successPopup_611() {
        return success_popup;
    }
    
    @FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
    private WebElement success_popup_msg;
    public WebElement successPopupMessage_611() {
        return success_popup_msg;
    }
	
	@FindBy(xpath = "//*[@id='_popup_path_sol_ok']")
	private WebElement button_success_ok;
	public WebElement ButtonSuccessOk_611() {
		return button_success_ok;
	}
	@FindBy(xpath = "//a[@id='dismissbut_WIFT001MT']/span")
    private WebElement sendAlertPopup;
    public WebElement sendAlertPopup() {
        return sendAlertPopup;
    }
	
	@FindBy(xpath = "//button[@id='applicationfacility_save_btn_WIFT001MT']")
	private WebElement limit_details_validate_btn;
	public WebElement limitDetailsValidateBtn_611() {
		return limit_details_validate_btn;
	}
	
	//jay
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
    private WebElement warning_popup_ok_btn;
    public WebElement WarningPopupOkBtn() {
        return warning_popup_ok_btn;
    }


 @FindBy(xpath = "//div[text()='CONFIRM']")
    private WebElement confirm_popup;
    public WebElement confirmPopup() {
        return confirm_popup;
    }

 @FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
    private WebElement facility_already_created_popup1;
    public WebElement facilityAlreadyCreatedPopup1() {
        return facility_already_created_popup1;
    }

    @FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
    private WebElement success_popup1;
    public WebElement successPopup1() {
        return success_popup1;
    }

    @FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
    private WebElement success_popup_msg1;
    public WebElement successPopupMessage1() {
        return success_popup_msg1;
    }

    @FindBy(xpath = "//a[@id='dismissbut_WIFT001MT']/span")
    private WebElement sendAlertPopup1;
    public WebElement sendAlertPopup1() {
        return sendAlertPopup1;
    }
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement facility_already_created_popup;
	public WebElement facilityAlreadyCreatedPopup_611() {
		return facility_already_created_popup;
	}
	
	
	//jay
	
	
	
	@FindBy(xpath = "//*[@id=\"div__popup_path_sol_ok\"]/div[2]/div")
	private WebElement limit_details_validate_success_msg;
	public WebElement limitDetailsValidateSuccessMsg_611() {
		return limit_details_validate_success_msg;
	}
	@FindBy(xpath = "//a[@id='WIFT001AP1']")
    private WebElement application_financial_facility_approve1;
    public WebElement applicationFinancialFacilityApproveLevel1_611() {
        return application_financial_facility_approve1;
    }
	

	
    @FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP1_gs_fmsApplVO.CODE']")
    private WebElement approve_level1_ref_code_input;
    public WebElement approveLevel1RefCodeInput_611() {
        return approve_level1_ref_code_input;
    }
    
	@FindBy(xpath = "//*[@id=\"applicationFacilityGridTbl_Id_WIFT001AP1_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement approve1_clear_btn;
	public WebElement approve1ClearBtn_611() {
		return approve1_clear_btn;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP1_1_fmsApplVO.CODE']")
	private WebElement approve_level1_retrive_data;
	public WebElement approveLevel1RetriveData_611() {
		return approve_level1_retrive_data;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision_1_WIFT001AP1']")
	private WebElement approve_level1_select_devision;
	public WebElement approveLevel1SelectDevision_611() {
		return approve_level1_select_devision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel1_btn_WIFT001AP1']")
	private WebElement approve_level1_submit_btn;
	public WebElement approveLevel1SubmitBtn_611() {
		return approve_level1_submit_btn;
	}
	@FindBy(xpath = "//a[@id='WIFT001AP2']")
	private WebElement application_financial_facility_approve2;
	public WebElement applicationFinancialFacilityApproveLevel2_611() {
		return application_financial_facility_approve2;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP2_gs_fmsApplVO.CODE']")
    private WebElement approve_level2_ref_code_input;
    public WebElement approveLevel2RefCodeInput_611() {
        return approve_level2_ref_code_input;
    }

	@FindBy(xpath = "//*[@id=\"applicationFacilityGridTbl_Id_WIFT001AP2_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement approve2_clear_btn;
	public WebElement approve2ClearBtn_611() {
		return approve2_clear_btn;
	} 
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP2_1_fmsApplVO.CODE']")
	private WebElement approve_level2_retrive_data;
	public WebElement approveLevel2RetriveData_611() {
		return approve_level2_retrive_data;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision2_WIFT001AP2']")
	private WebElement approve_level2_select_devision;
	public WebElement approveLevel2SelectDecision_611() {
		return approve_level2_select_devision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel2_btn_WIFT001AP2']")
	private WebElement approve_level2_submit_btn;
	public WebElement approveLevel2SubmitBtn_611() {
		return approve_level2_submit_btn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Approve_button_confirm_ok;
	public WebElement approveButtonConfirmOk_611() {
		return Approve_button_confirm_ok;
	}
	
	@FindBy(xpath = "//*[@id='_popup_path_sol_ok']")
	private WebElement Approve_button_success_ok;
	public WebElement  approveButtonSuccessOk1_611() {
		return Approve_button_success_ok;
	}
	@FindBy(xpath = "//a[@id='WIFT001AP3']")
	private WebElement application_financial_facility_approve3;
	public WebElement applicationFinancialFacilityApproveLevel3_611() {
		return application_financial_facility_approve3;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP3_gs_fmsApplVO.CODE']")
    private WebElement approve_level3_ref_code_input;
    public WebElement approveLevel3RefCodeInput_611() {
        return approve_level3_ref_code_input;
    }
    
	@FindBy(xpath = "//*[@id=\"applicationFacilityGridTbl_Id_WIFT001AP3_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement approve3_clear_btn;
	public WebElement approve3ClearBtn_611() {
		return approve3_clear_btn;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP3_1_fmsApplVO.CODE']")
	private WebElement approve_level3_retrive_data;
	public WebElement approveLevel3RetriveData_611() {
		return approve_level3_retrive_data;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision3_WIFT001AP3']")
	private WebElement approve_level3_select_devision;
	public WebElement approveLevel3SelectDecision_611() {
		return approve_level3_select_devision;
	}
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel3_btn_WIFT001AP3']")
	private WebElement approve_level3_submit_btn;
	public WebElement approveLevel3SubmitBtn_611() {
		return approve_level3_submit_btn;
	}
	
	@FindBy(xpath ="//td[text()='Facilities Management']")
	private WebElement wifak_facility_management ;
	public WebElement wifakFacilitymanagement_611() {
		return wifak_facility_management;
	}
	@FindBy(xpath ="//a[@id='WIFT008MT']")
	private WebElement wifak_FacilityManagement_Maintenance;
	public WebElement wifakFacilitymanagementMaintenance_611() {
		return wifak_FacilityManagement_Maintenance;
	}
	@FindBy(xpath ="//a[@id='infoBarSearchButton_WIFT008MT']")
	private WebElement FacilityManagement_Maintenance_InfobarSearchbtn;
	public WebElement facilitymanagementmaintenanceinfobarsearchbtn_611() {
		return FacilityManagement_Maintenance_InfobarSearchbtn;
	}
	@FindBy(xpath ="//input[@id='facilityManagementGridTbl_Id_WIFT008MT_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement FacilityManagement_Maintenance_InfobarSearchbtn_AppRefCodeInput;
	public WebElement facilitymanagementmaintenanceinfobarsearchbtnappRefCodeInput_611() {
		return FacilityManagement_Maintenance_InfobarSearchbtn_AppRefCodeInput;
	}
	@FindBy(xpath ="//table[@id='facilityManagementGridTbl_Id_WIFT008MT']/tbody/tr[@id='1']")
	private WebElement FacilityManagement_Maintenance_InfobarSearchbtn_Codesearchbtn_retrivedata;
	public WebElement facilitymanagementmaintenanceinfobarsearchbtncodesearchbtnretrivedata_611() {
		return FacilityManagement_Maintenance_InfobarSearchbtn_Codesearchbtn_retrivedata;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_facilityMgtMainApplicationRef_WIFT008MT']")
	private WebElement FacilityManagement_Maintenance_App_Ref_Code;
	public WebElement facilitymanagementmaintenanceAppRefCode_611() {
		return FacilityManagement_Maintenance_App_Ref_Code;
	}
	
	@FindBy(xpath ="//li[@id='facilityLimitDetailsTab_WIFT008MT']")
	private WebElement FacilityManagement_Maintenance_FacilityLimitDetailsTab;
	public WebElement facilitymanagementmaintenancefacilitylimitdetailstab_611() {
		return FacilityManagement_Maintenance_FacilityLimitDetailsTab;
	}
	@FindBy(xpath ="//table[@id='FacilityManagementFacilityLimitDetailsGrid_WIFT008MT']/tbody//tr[@id='1']")
	private WebElement FacilityManagement_Maintenance_FacilityLimitDetailsTab_Productclassvaluedoubletap;
	public WebElement facilitymanagementmaintenancefacilitylimitdetailstabproductclassvaluedoubletap_611() {
		return FacilityManagement_Maintenance_FacilityLimitDetailsTab_Productclassvaluedoubletap;
	}
	@FindBy(xpath ="//button[@id='limitDetails_close_btn_WIFT008MT']")
	private WebElement Productclassvalue_CloseBtn;
	public WebElement productclassvalueclosebtn() {
		return Productclassvalue_CloseBtn;
	}
	@FindBy(xpath ="//td[text()='Draw Down Request']")
	private WebElement WIFAKApplication_DrawDownRequest;
	public WebElement wifakapplicationdrawdownrequest_611() {
		return WIFAKApplication_DrawDownRequest;
	}
	@FindBy(xpath ="//a[@id='WIFT009MT']")
	private WebElement WIFAKApplication_DrawDownRequest_Maintenance;
	public WebElement wifakapplicationdrawdownrequestmaintenance_611() {
		return WIFAKApplication_DrawDownRequest_Maintenance;
	}
	@FindBy(xpath ="//input[@id='facilityMangementCode_WIFT008MT']")
	private WebElement Drawdownmaininformation_FacilityReferenceCode;
	public WebElement drawdownmaininformationfacilityReferenceCode_611() {
		return Drawdownmaininformation_FacilityReferenceCode;
	}
	@FindBy(xpath ="//input[@id='lookuptxt_drawDownRequestFacilityReference_WIFT009MT']")
	private WebElement DrawDownRequest_Maintenance_Drawdownmaininformation_FacilityReference;
	public WebElement drawdownrequestmaintenancedrawdownmaininformationfacilityReference_611() {
		return DrawDownRequest_Maintenance_Drawdownmaininformation_FacilityReference;
	}
	@FindBy(xpath ="//input[@id='lookuptxt_drawDownRequestDrawDownType_WIFT009MT']")
	private WebElement DrawDownRequest_Maintenance_Drawdownmaininformation_Drawdowntype;
	public WebElement drawdownrequestmaintenancedrawdownmaininformationdrawdowntype_611() {
		return DrawDownRequest_Maintenance_Drawdownmaininformation_Drawdowntype;
	}
	@FindBy(xpath ="//input[@id='drawDownRequestLongNameEnglish_WIFT009MT']")
	private WebElement DrawDownRequest_Maintenance_Drawdownmaininformation_DiscriptionEnglish;
	public WebElement drawdownrequestmaintenancedrawdownmaininformationdiscriptionenglish_611() {
		return DrawDownRequest_Maintenance_Drawdownmaininformation_DiscriptionEnglish;
	}
	@FindBy(xpath ="//input[@id='drawDownRequestLongNameArab_WIFT009MT']")
	private WebElement DrawDownRequest_Maintenance_Drawdownmaininformation_DiscriptionArab;
	public WebElement drawdownrequestmaintenancedrawdownmaininformationdiscriptionarab_611() {
		return DrawDownRequest_Maintenance_Drawdownmaininformation_DiscriptionArab;
	}
	@FindBy(xpath ="//input[@id='drawDownRequestDateSubmitted_WIFT009MT']")
	private WebElement DrawDownRequest_Maintenance_Drawdownmaininformation_DateSubmitted;
	public WebElement drawdownrequestmaintenancedrawdownmaininformationdatesubmitted_611() {
		return DrawDownRequest_Maintenance_Drawdownmaininformation_DateSubmitted;
	}
	@FindBy(xpath ="//input[@id='drawDownRequestValueDate_WIFT009MT']")
	private WebElement DrawDownRequest_Maintenance_Drawdownmaininformation_Valuedate;
	public WebElement drawdownrequestmaintenancedrawdownmaininformationvaluedate_611() {
		return DrawDownRequest_Maintenance_Drawdownmaininformation_Valuedate;
	}
	@FindBy(xpath ="//button[@id='submit_1233678586']")
	private WebElement PostApproval_Doyouwantproceed;
	public WebElement postApprovaldoyouwantproceed() {
		return PostApproval_Doyouwantproceed;
	}
	@FindBy(xpath ="//li[@id='drawDownRequestAdditionDetailsTabs_WIFT009MT']")
	private WebElement DrawDownRequest_Maintenance_DrawdownAdditionaldetails;
	public WebElement drawdownrequestmaintenancedrawdownadditionaldetailstab_611() {
		return DrawDownRequest_Maintenance_DrawdownAdditionaldetails;
	}
	@FindBy(xpath ="//input[@id='lookuptxt_drawDownRequestProduct_Class_WIFT009MT']")
	private WebElement DrawDownRequest_Maintenance_DrawdownAdditionaldetails_ProductclassLandN;
	public WebElement drawdownrequestmaintenancedrawdownadditionaldetailsproductclassLandN_611() {
		return DrawDownRequest_Maintenance_DrawdownAdditionaldetails_ProductclassLandN;
	}
	@FindBy(xpath ="//input[@id='drawDownRequestVatYield_WIFT009MT']")
	private WebElement DrawDownRequest_VatYield;
	public WebElement drawdownrequestvatyield_611() {
		return DrawDownRequest_VatYield;
	}
}

