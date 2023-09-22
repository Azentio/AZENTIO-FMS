package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ApplicationforfinancialfacilityOBJ_611 {
	WebDriver driver;	
	public ApplicationforfinancialfacilityOBJ_611(WebDriver driver) {
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

	@FindBy(xpath = "//input[@id='applicationFacilityofferexpirydate_WIFT001MT']")
	private WebElement additional_tab_expire_date;
	public WebElement additionalTabExpireDate_611() {
		return additional_tab_expire_date;
	}
	// Clear cache for FMS Core
		@FindBy(xpath = "//span[@id='tech_details_icon']")
		private WebElement FMS_core_tech_details_icon;
		public WebElement FMSCoreTechDetailsIcon_611() {
			return FMS_core_tech_details_icon;
		}
		
		@FindBy(xpath = "//label[@id='clear_cache_key']")
		private WebElement FMS_core_clear_cache_btn;
		public WebElement FMSCoreClearCacheBtn_611() {
			return FMS_core_clear_cache_btn;
		}
//		@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
//		private WebElement success_popup_ok_btn;
//		public WebElement SuccessPopupOkBtn_611() {
//			return success_popup_ok_btn;
//		}
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
    @FindBy(xpath = "//input[@id='lookuptxt_applicationFacilitysolicitor_WIFT001MT']")
	private WebElement document_details_solicitor_name;
	public WebElement documentDetailsSolicitorName_611() {
		return document_details_solicitor_name;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityEstimator_WIFT001MT']")
	private WebElement document_details_estimator_name;
	public WebElement documentDetailsEstimatorName_611() {
		return document_details_estimator_name;
	}	
	//id="applicationfacilityLimitPopupFormId_WIFT001MT_bank_no_key"
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
    @FindBy(xpath = "//a[@id='dismissbut_WIFT001AP3']")
    private WebElement sendAlertPopup_Apprlevel3;
    public WebElement sendAlertPopupapprlevel3_611() {
        return sendAlertPopup_Apprlevel3;
    }
    //a[@id='dismissbut_WIFT001AP3']
	@FindBy(xpath = "//button[@id='applicationfacility_save_btn_WIFT001MT']")
	private WebElement limit_details_validate_btn;
	public WebElement limitDetailsValidateBtn_611() {
		return limit_details_validate_btn;
	}
	
	//jay
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
    private WebElement warning_popup_ok_btn;
    public WebElement WarningPopupOkBtn_611() {
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
    public WebElement SuccessPopupOkBtn_611() {
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
	
	//841963
	@FindBy(xpath ="//input[@id='drawDownRequestProductClassDesc_WIFT009MT']")
	private WebElement DrawDownRequest_Maintenance_DrawdownAdditionaldetails_ProductclassLandN_Details;
	public WebElement drawdownrequestmaintenancedrawdownadditionaldetailsproductclassLandNdetails_611() {
		return DrawDownRequest_Maintenance_DrawdownAdditionaldetails_ProductclassLandN_Details;
	}
	
	//586558_Fms_param
	
	@FindBy(xpath ="//*[@id='_selenuimP000']/h3")
	private WebElement ParameterApplication_Parameter;
	public WebElement parameterApplicationparameter() {
		return ParameterApplication_Parameter;
	}
	@FindBy(xpath ="//*[@id=\'_selenuimP049\']/li/a")
	private WebElement Parameter_FacilityRiskRating;
	public WebElement parameterfacilityriskrating_611() {
		return Parameter_FacilityRiskRating;
	}
	@FindBy(xpath ="//a[@id='P049MT']")
	private WebElement FacilityRiskRating_Maintenance;
	public WebElement facilityriskratingmaintenance_611() {
		return FacilityRiskRating_Maintenance;
	}
	@FindBy(xpath ="//td[@id='add_fmsParamFacilityRiskRatingGridListGrid_Id_P049MT']")
	private WebElement Maintenance_AddBtn;
	public WebElement maintenanceaddbtn_611() {
		return Maintenance_AddBtn;
	}
	@FindBy(xpath ="//tr[@id='3']")
	private WebElement Maintenance_AddBtn_Forscrolling;
	public WebElement maintenanceaddbtnforscrolling_611() {
		return Maintenance_AddBtn_Forscrolling;
	}
	//td[@id='td_fmsParamFacilityRiskRatingGridListGrid_Id_P049MT_1_fmsfacilityriskrating.FRR_RATING']/div/input[@gridid='fmsParamFacilityRiskRatingGridListGrid_Id_P049MT']
	@FindBy(xpath ="(//td[@id='td_fmsParamFacilityRiskRatingGridListGrid_Id_P049MT_1_fmsfacilityriskrating.FRR_RATING'])[2]")
	private WebElement FacilityRiskRating_Maintenance_Rating_Scrollintoview;
	public WebElement facilityriskratingmaintenanceratingscrollintoview_611() {
		return FacilityRiskRating_Maintenance_Rating_Scrollintoview;
	}
	@FindBy(xpath ="//td[@id='td_fmsParamFacilityRiskRatingGridListGrid_Id_P049MT_1_fmsfacilityriskrating.FRR_RATING']/div/input")
	private WebElement FacilityRiskRating_Maintenance_Rating;
	public WebElement facilityriskratingmaintenancerating_611() {
		return FacilityRiskRating_Maintenance_Rating;
	}
	@FindBy(xpath ="//td[@id='td_fmsParamFacilityRiskRatingGridListGrid_Id_P049MT_1_fmsfacilityriskrating.BRIEF_NAME_ENG']/input")
	private WebElement FacilityRiskRating_Maintenance_BriefDiscription;
	public WebElement facilityriskratingmaintenancebriefdiscription_611() {
		return FacilityRiskRating_Maintenance_BriefDiscription;
	}
	@FindBy(xpath ="//td[@id='td_fmsParamFacilityRiskRatingGridListGrid_Id_P049MT_1_fmsfacilityriskrating.BRIEF_NAME_ARAB']/input")
	private WebElement FacilityRiskRating_Maintenance_BriefDiscription_Arab;
	public WebElement facilityriskratingmaintenancebriefdiscriptionarab_611() {
		return FacilityRiskRating_Maintenance_BriefDiscription_Arab;
	}
	@FindBy(xpath ="//td[@id='td_fmsParamFacilityRiskRatingGridListGrid_Id_P049MT_1_fmsfacilityriskrating.LONG_NAME_ENG']/input")
	private WebElement FacilityRiskRating_Maintenance_LongDiscription;
	public WebElement facilityriskratingmaintenancelongdiscription_611() {
		return FacilityRiskRating_Maintenance_LongDiscription;
	}
	@FindBy(xpath ="//td[@id='td_fmsParamFacilityRiskRatingGridListGrid_Id_P049MT_1_fmsfacilityriskrating.LONG_NAME_ARAB']/input")
	private WebElement FacilityRiskRating_Maintenance_LongDiscription_Arab;
	public WebElement facilityriskratingmaintenancelongdiscriptionarab_611() {
		return FacilityRiskRating_Maintenance_LongDiscription_Arab;
	}
	@FindBy(xpath ="//td[@id='td_fmsParamFacilityRiskRatingGridListGrid_Id_P049MT_1_fmsfacilityriskrating.MINIMUM_RATE']/div/input")
	private WebElement FacilityRiskRating_Maintenance_MinimunRate;
	public WebElement facilityriskratingmaintenanceminimumrate_611() {
		return FacilityRiskRating_Maintenance_MinimunRate;
	}
	@FindBy(xpath ="//td[@id='td_fmsParamFacilityRiskRatingGridListGrid_Id_P049MT_1_fmsfacilityriskrating.MAXIMUM_RATE']/div/input")
	private WebElement FacilityRiskRating_Maintenance_MaximumRate;
	public WebElement facilityriskratingmaintenancemaximumrate_611() {
		return FacilityRiskRating_Maintenance_MaximumRate;
	}
	@FindBy(xpath ="//label[@id='fmsFacilityRiskRatingMaintFormId_P049MT_Update_key']")
	private WebElement FacilityRiskRating_Maintenance_Updatebtn;
	public WebElement facilityriskratingmaintenanceupdatebtn_611() {
		return FacilityRiskRating_Maintenance_Updatebtn;
	}
	@FindBy(id ="_popup_path_sol_ok")
	private WebElement Maximum_Rate_cannotbelessthen_Minium_Rate;
	public WebElement maximumratecannotlessthenminimumrateokbtn_611() {
		return Maximum_Rate_cannotbelessthen_Minium_Rate;
	}
	@FindBy(xpath ="//td[@id='del_fmsParamFacilityRiskRatingGridListGrid_Id_P049MT']")
	private WebElement FacilityRiskRating_Maintenance_deletebtn;
	public WebElement facilityriskratingmaintenancedeletebtn_611() {
		return FacilityRiskRating_Maintenance_deletebtn;
	}
	@FindBy(xpath ="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement FacilityRiskRating_Maintenance_Confirmdelprocessokbtn;
	public WebElement facilityriskratingmaintenanceconfirmdelprocessokbtn_611() {
		return FacilityRiskRating_Maintenance_Confirmdelprocessokbtn;
	}
	@FindBy(xpath ="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement FacilityRiskRating_Maintenance_ConfirmSaveprocessokbtn;
	public WebElement facilityriskratingmaintenanceconfirmsaveprocessokbtn_611() {
		return FacilityRiskRating_Maintenance_ConfirmSaveprocessokbtn;
	}
	@FindBy(xpath ="//input[@id='_popup_path_sol_ok']")
	private WebElement Saverecord_wasUpdated_Successfully_okbtn;
	public WebElement Saverecordwasupdatedsuccessfullyokbtn_611() {
		return Saverecord_wasUpdated_Successfully_okbtn;
	}
	//586558_Fms_core
	@FindBy(xpath ="//span[@id='spanLookup_applicationFacilityRating_WIFT001MT']")
	private WebElement FacilityRating_Smallsearchbtn ;
	public WebElement facilityratingsmallsearchbtn_611() {
		return FacilityRating_Smallsearchbtn;
	}
	@FindBy(xpath ="//input[@id='gridtab_applicationFacilityRating_WIFT001MT_gs_FRR_RATING']")
	private WebElement FacilityRating_Smallsearchbtn_Ratingsearchbtn ;
	public WebElement facilityratingsmallsearchbtnratingsearchbtn_611() {
		return FacilityRating_Smallsearchbtn_Ratingsearchbtn;
	}
	@FindBy(xpath ="//td[@id='td_gridtab_applicationFacilityRating_WIFT001MT_1_FRR_RATING']")
	private WebElement FacilityRating_output_Isdisplayed ;
	public WebElement facilityratingoutputisdisplayed_611() {
		return FacilityRating_output_Isdisplayed;
	}
	//@586526_Fms_Core
	
	@FindBy(xpath ="//input[@id='lookuptxt_applicationFacilityRating_WIFT001MT']")
	private WebElement FacilityRating_Isenabled ;
	public WebElement facilityratingisenabled_611() {
		return FacilityRating_Isenabled;
	}
	//@586527_Fms_param
	@FindBy(xpath ="//input[@id='_popup_path_sol_ok']")
	private WebElement AlreadyAvailable_InExistingRate;
	public WebElement alreadyavailableinexistingrateokbtn_611() {
		return AlreadyAvailable_InExistingRate;
	}
	// @827643_Fms_Core
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement DateCannot_beLessthen_RunningDate;
	public WebElement datecannotbelessthenrunningdate_611( ) {
		return DateCannot_beLessthen_RunningDate;
	}
	@FindBy(xpath = "//input[@id='applicationFacilityFxSettlementExpiryDate_WIFT001MT']")
	private WebElement AdditionalDetails_Fxsettlementexpirydate;
	public WebElement additionaldetailsfxsettlementexpirydate_611 ( ) {
		return AdditionalDetails_Fxsettlementexpirydate;
	}
	//@280446
	
	@FindBy(xpath="//td[text()='REQUEST FOR FINANCIN']")
	private WebElement REQUEST_FOR_FINANCIN;
    public WebElement REQUESTFORFINANCIN_611() {
		return REQUEST_FOR_FINANCIN;
	}
	@FindBy(xpath="//td[text()='Request For Financing']")
	private WebElement Request_For_Financing;
    public WebElement RequestForFinancing_611() {
		return Request_For_Financing;
	}
    @FindBy(xpath="//span[text()='Maintenance']")
	private WebElement RequestForFinancing_Maintenance;
    public WebElement requestforfinancingmaintenance_611() {
		return RequestForFinancing_Maintenance;
	}
   
    
    @FindBy(xpath="//select[@id='requestFinancingApplicationFor_CSMRF00MT']")
	private WebElement Reason_For_Submission;
    public WebElement reasonforsubmisson_611() {
		return Reason_For_Submission;
	}
    @FindBy(xpath="(//input[@class='path-theme-cust-input liveSearchText liveSearchCompSize ui-state-focus liveSearchInputCorner'])[5]")
	private WebElement Customer_Search_box;
    public WebElement customersearchbox_611() {
		return Customer_Search_box;
	}
    @FindBy(xpath="//span[text()='Facility Type Details']")
	private WebElement Facility_Type_details;
    public WebElement facilitytypedetails_611() {
		return Facility_Type_details;
	}
    @FindBy(xpath="//input[@id='lookuptxt_requestFinancingFacilityType_CSMRF00MT']")
	private WebElement Facility_Type_details_searchbox;
    public WebElement facilitytypedetailssearchbox_611() {
		return Facility_Type_details_searchbox;
	}
    @FindBy(xpath="//input[@id='requestFinancingFacilityTotalvalue_CSMRF00MT']")
	private WebElement ToTal_Limit_Search_box;
    public WebElement totallimitsearchbox_611() {
		return ToTal_Limit_Search_box;
	}
    @FindBy(xpath="//li[@id='requestFinancingLimitDtlsTabs_CSMRF00MT']/a/span[text()='Disbursement/Sublimit']")
	private WebElement Disbursement_SUBlimit;
    public WebElement disbursementsublimit_611() {
		return Disbursement_SUBlimit;
	}
    @FindBy(xpath="//td[@id='add_RequestFinancingLimitDetailsGridId_CSMRF00MT']/div/span")
	private WebElement Disbursement_SUBlimit_aDD_Button;
    public WebElement disbursementsublimitaddbutton_611() {
		return Disbursement_SUBlimit_aDD_Button;
	}
    @FindBy(xpath="//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement Product_class_searchbox;
    public WebElement productclasssearchbox_611() {
		return Product_class_searchbox;
	}
//    @FindBy(xpath="//label[@id='requestfinancingLimitPopupFormId_CSMRF00MT_Product_Class_Key']")
//	private WebElement Product_class;
//    public WebElement productclass_611() {
//		return Product_class;
//	}
    @FindBy(id="//input[@id='requestFinancingLimitDetailsFacilityRiskRatingScore_CSMRF00MT']")
	private WebElement Productclscreen_Facility_Risk_Rating;
    public WebElement Productclscreenfacilityriskrating_611() {
		return Productclscreen_Facility_Risk_Rating;
	}
    @FindBy(id="//input[@id='requestFinancingLimitDetailsFacilityRiskRatingValueDate_CSMRF00MT']")
	private WebElement FRR_Value_Date;
    public WebElement frrvaluedate_611() {
		return FRR_Value_Date;
	}
    @FindBy(id="requestFinancingLimitDetailsRfNewMargin_CSMRF00MT")
	private WebElement MaRgin_search_box;
    public WebElement marginsearchbox_611() {
		return MaRgin_search_box;
	}
    @FindBy(xpath="//button[@id=\'limitDetails_add_btn_CSMRF00MT\']")
	private WebElement Final_ADD_Button;
    public WebElement finaladdbutton_611() {
		return Final_ADD_Button;
	}
    @FindBy(xpath="//label[@id=\'requestFinancingFormId_CSMRF00MT_save_key\']")
	private WebElement Save_Button;
    public WebElement savebutton_611() {
		return Save_Button;
	}
    @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
   	private WebElement Confirmsave_popup_okbutton;
       public WebElement confirmsavepopupokbutton_611() {
   		return Confirmsave_popup_okbutton;
   	}
    @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
    private WebElement Confirmsave_Successfully_popup;
    public WebElement confirmsavesuccessfullypopup_611() {
      return Confirmsave_Successfully_popup;
    }
    @FindBy(xpath="//label[@id='requestFinancingFormId_CSMRF00MT_Validate_key']")
    private WebElement Validate_button;
    public WebElement validatebutton_611() {
      return Validate_button;
    }
    @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
    private WebElement Confirmvalidate_popup_okbutton;
    public WebElement confirmvalidatepopupokbutton_611() {
      return Confirmvalidate_popup_okbutton;
    }
    @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
    private WebElement FacilityAlready_create_sameDetails;
    public WebElement facilityalreadycreatesamedetails_611() {
      return FacilityAlready_create_sameDetails;
    }
    
    @FindBy(xpath = "//*[@id='div__popup_path_sol_ok']/div[2]/div")
    private WebElement Validate_Successfully_popup_msg;
    public WebElement validatesuccessfullypopupMsg_611() {
      return Validate_Successfully_popup_msg;
    }
    
    @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
    private WebElement Validate_Successfully_popup;
    public WebElement validatesuccessfullypopup_611() {
      return Validate_Successfully_popup;
    }
    @FindBy(xpath="//span[text()='Approve Level 1']")
    private WebElement Approve_level1;
    public WebElement approvelevel1_611() {
      return Approve_level1;
    }
    @FindBy(xpath="//input[@id='requestFinancingGridTbl_Id_CSMRF00P1_gs_fmsRequestFinancingVO.CODE']")
    private WebElement Approve_level1_Retrivedata_Searchbox;
    public WebElement approvelevel1retrivedatasearchbox_611() {
      return Approve_level1_Retrivedata_Searchbox;
    }
    @FindBy(xpath="//td[@id='td_requestFinancingGridTbl_Id_CSMRF00P1_1_fmsRequestFinancingVO.CODE']")
    private WebElement Approve_level1_searchcode_doubletap;
    public WebElement approvelevel1searchcodedoubletap_611() {
      return Approve_level1_searchcode_doubletap;
    }
    @FindBy(xpath="(//span[text()='Customer Grading & Recommendations'])[3]")
    private WebElement customer_Grading_RECOmmendation;
    public WebElement customergradingrecommendation_611() {
      return customer_Grading_RECOmmendation;
    }
    @FindBy(xpath="//select[@id='requestDecisionForward_1_CSMRF00P1']")
    private WebElement DecisioN_SelectForward;
    public WebElement decisionselectforward_611() {
      return DecisioN_SelectForward;
    }
    @FindBy(xpath="//select[@id='requestDecisionForwardP1_CSMRF00P1']")
    private WebElement Select_Approval_Committee;
    public WebElement selectapprovalcommittee_611() {
      return Select_Approval_Committee;
    }
    
    @FindBy(xpath="//select[@id='requestP1approvalCommitte_CSMRF00P1']")
    private WebElement Approval_Committee_Investment_committee ;
    public WebElement approvalcommitteeinvestmentcommittee_611() {
      return Approval_Committee_Investment_committee;
    }
    @FindBy(xpath="//label[@id='requestFinancingFormId_CSMRF00P1_approve_key']")
    private WebElement Approve_button ;
    public WebElement approvebutton_611() {
      return Approve_button;
    }
    
    @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
    private WebElement ConfirmApprove_PRocess_okpopup;
    public WebElement confirmapproveprocessokpopup_611() {
      return ConfirmApprove_PRocess_okpopup;
    }
    @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
    private WebElement Approved_successfully_popup;
    public WebElement approvedsuccessfullypopup_611() {
      return Approved_successfully_popup;
    }
    @FindBy(xpath="//span[text()='Approval Committee Recommendations ']")
    private WebElement Approval_Committee_Recommendation;
    public WebElement approvalcommitteerecommendation_611() {
      return Approval_Committee_Recommendation;
    }
    @FindBy(xpath="(//input[@name='fmsRequestFinancingVO.CODE'])[3]")
    private WebElement Approval_Committee_Recommendation_searchbox;
    public WebElement approvalcommitteerecommendationretrivedatasearchbox_611() {
      return Approval_Committee_Recommendation_searchbox;
    }
    @FindBy(xpath="//td[@id='td_requestFinancingGridTbl_Id_CSMRF00AC_1_fmsRequestFinancingVO.CODE']")
    private WebElement Approval_Committee_Recommendation_searchbox_Doubletap;
    public WebElement approvalcommitteerecommendationretrivedatasearchboxdoubletap_611() {
      return Approval_Committee_Recommendation_searchbox_Doubletap;
    }
    @FindBy(xpath="(//span[text()='Credit Committee Recommendations'])[2]")
    private WebElement Credit_committee_recommendation;
    public WebElement creditcommitterecommendationtab_611() {
      return Credit_committee_recommendation;
    }
    @FindBy(xpath="//div[@id='requestFinancingCreditReviewRecommandations_CSMRF00AC']/div/span[text()='Recommendations']")
    private WebElement Recommendations;
    public WebElement recommendationsbtn_611() {
      return Recommendations;
    }
    @FindBy(xpath="//span[@class='ui-icon ui-icon-circlesmall-plus tree-wrap-ltr']")
    private WebElement Recommendation_Add_button;
    public WebElement recommendationaddbutton_611() {
      return Recommendation_Add_button;
    }
    @FindBy(xpath="(//tr[@id='1'])[6]")
    private WebElement Recommendation_Add_button_name_doubletap;
    public WebElement recommendationaddbuttonnamedoubletap_611() {
      return Recommendation_Add_button_name_doubletap;
    }
    @FindBy(xpath="(//select[@class='editable'])[1]")
    private WebElement Recommendation_Send_back;
    public WebElement recommendationsendback_611() {
      return Recommendation_Send_back;
    }
    @FindBy(xpath="(//select[@class='editable'])[2]")
    private WebElement Sendbacklevel_Maintenancelevel;
    public WebElement sendbacklevelmaintenancelevel_611() {
      return Sendbacklevel_Maintenancelevel;
    }
    @FindBy(xpath="//label[@id='requestFinancingFormId_CSMRF00AC_Recommendation_key']")
    private WebElement Approve_Recommendation;
    public WebElement approverecommendation_611() {
      return Approve_Recommendation;
    }
    
    @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
    private WebElement Confirm_recommendation_popup;
    public WebElement confirmrecommendationpopup_611() {
      return Confirm_recommendation_popup;
    }
    @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
    private WebElement Confirm_recommendation_popup_successfully;
    public WebElement confirmrecommendationpopupsuccessfully_611() {
      return Confirm_recommendation_popup_successfully;
    }
    @FindBy(xpath="//a[@id='infoBarSearchButton_CSMRF00MT']")
    private WebElement Requestforfinancing_Maintenance_Searchbox;
    public WebElement requestforfinancingmaintenancesearchbox_611() {
      return Requestforfinancing_Maintenance_Searchbox;
    }
    @FindBy(xpath="(//input[@name='fmsRequestFinancingVO.CODE'])[1]")
    private WebElement Maintenance_COde_Searchbox;
    public WebElement codesearchbox_611() {
      return Maintenance_COde_Searchbox;
    }
    @FindBy(xpath="(//tr[@id='1'])[1]")
    private WebElement Maintenance_Codevalue_Doubletap;
    public WebElement maintenancecodevaluedoubletap_611() {
      return Maintenance_Codevalue_Doubletap;
    }
    @FindBy(xpath="//input[@id='statusDesc_CSMRF00MT']")
    private WebElement Sendback_from_ApprovalCommittee;
    public WebElement sendbackfromapprovalcommittee_611() {
      return Sendback_from_ApprovalCommittee;
    }
    @FindBy(xpath="//input[@id='requestFinancingLimitDetailsCleanFlagdChkBox_CSMRF00MT']")
    private WebElement CleanFlag_Checkbox;
    public WebElement cleanflagcheckbox() {
      return CleanFlag_Checkbox;
    }
    //@127917
    @FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement Productclass_Searchbox;
	public WebElement productclasssearchbox() {
		return Productclass_Searchbox;
	}
	@FindBy(xpath = "//*[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT001MT']")
	private WebElement Floating_rate_Searchbox;
	public WebElement floatingRateSearchbox_611() {
		return Floating_rate_Searchbox;
	}
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_NBR_WIFT001MT']")
	private WebElement Floatingrate_Periodicity_Searchbox;
	public WebElement floatingrateperiodicitysearchbox_611() {
		return Floatingrate_Periodicity_Searchbox;
	}
	@FindBy(xpath ="//select[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_TYPE_WIFT001MT']")
	private WebElement Floatingrate_PeriodicityType_Searchbox;
	public WebElement floatingrateperiodicitytypesearchbox_611() {
		return Floatingrate_PeriodicityType_Searchbox;
	}
	
    
   // @140601-Drawdownrequest
    
    @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
    private WebElement Drawdownrequest_Confirm_Savebtn;
    public WebElement drawdownrequestconfirmsavebtn_611() {
      return Drawdownrequest_Confirm_Savebtn;
    }
    @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
    private WebElement Drawdownrequest_Savesuccessfully_Okbtn;
    public WebElement drawdownrequestsavesuccessfullyokbtn() {
      return Drawdownrequest_Savesuccessfully_Okbtn;
    }
    @FindBy(xpath="//input[@id='alertsGrid_Id_WIFT009MT_gs_alertsParamCO.userId']")
    private WebElement Drawdownrequest_Alertbox_Searchbox;
    public WebElement drawdownrequestalertboxsearchbox() {
      return Drawdownrequest_Alertbox_Searchbox;
    }
    @FindBy(xpath="")
    private WebElement Drawdownrequest_Alertbox_Searchbox_Retrivedata;
    public WebElement drawdownrequestalertboxsearchboxretrivedata() {
      return Drawdownrequest_Alertbox_Searchbox_Retrivedata;
    }
    @FindBy(xpath="")
    private WebElement AlertBox_Savebtn;
    public WebElement alertboxsavebtn() {
      return AlertBox_Savebtn;
    }
    
    //616977
    @FindBy(xpath="//a[@id='WIFT002MT']")
    private WebElement WifakApp_ApprovalCommitteRecommendation;
    public WebElement wifakappapprovacommitterecommendation_611() {
      return WifakApp_ApprovalCommitteRecommendation;
    }
    @FindBy(xpath="//input[@id='applicationFacilityGridTbl_Id_WIFT002MT_gs_fmsApplVO.CODE']")
    private WebElement ApprovalCommitteRecommendation_CodeSearchBox;
    public WebElement approvalcommitterecommendationcodesearchBox_611() {
      return ApprovalCommitteRecommendation_CodeSearchBox;
    }
    @FindBy(xpath="//td[@id='td_applicationFacilityGridTbl_Id_WIFT002MT_1_fmsApplVO.CODE']")
    private WebElement CodeSearchBox_CodeRetriveData;
    public WebElement codesearchboxretrivedata_611() {
      return CodeSearchBox_CodeRetriveData;
    }
    @FindBy(xpath="//button[@id='applicationfacility_recommend_btn_WIFT002MT']")
    private WebElement WifakApp_AppCommRecomm_MainInfo_Recommendation;
    public WebElement wifakappcommirecommmaininforecommendationbtn_611() {
      return WifakApp_AppCommRecomm_MainInfo_Recommendation;
    }
    @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
    private WebElement Confirm_Recommendation_Okbtn;
    public WebElement confirmrecommendationokbtn_611() {
      return Confirm_Recommendation_Okbtn;
    }
    @FindBy(xpath="//td[@tdlabel='Recommended By' and text()='KOUSALYA']")
    private WebElement Recommendation_Kousalya_Click;
    public WebElement recommendationkousalyaclick_611() {
      return Recommendation_Kousalya_Click;
    }
    @FindBy(xpath="//td[@tdlabel='Recommended By' and text()='KOUSALYA']//following::td[@id='td_ApplicationFacilityRecommendationGrid_WIFT002MT_32_fmsApplRecommendVO.RECOMMENDATION']//select")
    private WebElement Recommendation_SelectSearchbox; //Approve
    public WebElement recommendationselectsearchbox_611() {
      return Recommendation_SelectSearchbox;
    }
    @FindBy(xpath="//td[@tdlabel='Recommended By' and text()='KOUSALYA']//following::td[@tdlabel='Recommendation']//following::input[@name='lookupTxt_fmsApplRecommendVO.COMMENT_CODE']")
    private WebElement CommentCode_SearchBox;
    public WebElement commentcode_searchbox_611() {
      return CommentCode_SearchBox;
    }
    @FindBy(xpath="//td[@tdlabel='Recommended By' and text()='KOUSALYA']//following::td[@tdlabel='Recommendation']//following::input[@name='lookupTxt_fmsApplRecommendVO.COMMENT_CODE']//following::td[@id='td_ApplicationFacilityRecommendationGrid_WIFT002MT_32_fmsApplRecommendVO.COMMENTS']")
    private WebElement Comments_Searchbox;
    public WebElement commentssearchbox_611() {
      return Comments_Searchbox;
    }
    @FindBy(xpath="//*[@id='applicationFacilityGridTbl_Id_WIFT002MT_pager_left']/table/tbody/tr/td[7]")
    private WebElement ApprCommitteRecomm_Search_Box;
    public WebElement apprcommitterecommsearchbox() {
      return ApprCommitteRecomm_Search_Box;
    }
    //@1265137
    @FindBy(xpath="//span[text()='OK']")
    private WebElement ApprovalcommiteeRecommendation_Okbtn;
    public WebElement approvalcommitterecommendationoktn_611() {
      return ApprovalcommiteeRecommendation_Okbtn;
    }
    @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
    private WebElement RecommendationApprovedSuccessfully_Okbtn;
    public WebElement recommendationapprovedsuccessfullyokbtn_611() {
      return RecommendationApprovedSuccessfully_Okbtn;
    }
    @FindBy(xpath="//a[@id='WIFT004MT']")
    private WebElement Wifak_Authorize_RejAppFinFac;
    public WebElement wifakauthorizerejappfinfac_611() {
      return Wifak_Authorize_RejAppFinFac;
    }
    @FindBy(xpath="//input[@id='applicationFacilityGridTbl_Id_WIFT002MT_gs_fmsApplVO.CODE']")
    private WebElement Wifak_Authorize_RejAppFinFac_Searchbox;
    public WebElement wifakauthorizerejappfinfacsearchbox_611() {
      return Wifak_Authorize_RejAppFinFac_Searchbox;
    }
    @FindBy(xpath="//td[@id='td_applicationFacilityGridTbl_Id_WIFT002MT_1_fmsApplVO.CODE']")
    private WebElement Wifak_Authorize_RejAppFinFac_Searchbox_Retrivedata;
    public WebElement wifakauthorizerejappfinfacsearchboxretrivedata_611() {
      return Wifak_Authorize_RejAppFinFac_Searchbox_Retrivedata;
    }
    
//	@808942_Fmsparam	
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement fms_param_parameter;
	public WebElement fmsParamParameter_611() {
		return fms_param_parameter;
	}
	
	@FindBy(xpath = "//td[text()='Facility Type']")
	private WebElement param_facility_type;
	public WebElement paramFacilityType_611() {
		return param_facility_type;
	}
	
	@FindBy(xpath = "//a[@id='P008UP']")
	private WebElement facility_type_update_after_approve;
	public WebElement facilityTypeUpdateAfterApprove_611() {
		return facility_type_update_after_approve;
	}
	
	@FindBy(id = "fmsFacilityTypeListGridTbl_Id_P008UP_gs_CODE")
	private WebElement facility_type_search_code;
	public WebElement facilityTypeSearchCode_611() {
		return facility_type_search_code;
	}
	
	@FindBy(id = "td_fmsFacilityTypeListGridTbl_Id_P008UP_1_CODE")
	private WebElement facility_type_search_code_result;
	public WebElement facilityTypeSearchCodeResult_611() {
		return facility_type_search_code_result;
	}
	
	@FindBy(xpath = "//li[@id='fmsFacilityTypeDetailsTab_P008UP']")
	private WebElement facilty_type_facility_details;
	public WebElement facilityTypeFacilityDetails_611() {
		return facilty_type_facility_details;
	}
	
	@FindBy(id = "Fms_facility_type_stp_facility_requirments_Div_P008UP")
	private WebElement STP_facility_req;
	public WebElement STPFacilityReq_611() {
		return STP_facility_req;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_customer_grading_P008UP']")
	private WebElement customer_grading_flag;
	public WebElement customerGradingFlag_611() {
		return customer_grading_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_grade_overwrite_P008UP']")
	private WebElement overwrite_grading_flag;
	public WebElement OverwriteGradingFlag_611() {
		return overwrite_grading_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_credit_review_P008UP']")
	private WebElement credit_review_flag;
	public WebElement creditReviewFlag_611() {
		return credit_review_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_committee_approval_P008UP']")
	private WebElement committee_approval_flag;
	public WebElement committeeApprovalFlag_611() {
		return committee_approval_flag;
	}
	
	@FindBy(xpath = "//select[@id='fmsFacilityType_members_number_P008UP']")
	private WebElement committee_approval_flag_member_dropdown;
	public WebElement committeeApprovalFlagMemberDropdown_611() {
		return committee_approval_flag_member_dropdown;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_credit_authorize_P008UP']")
	private WebElement credit_authorzie_flag;
	public WebElement creditAuthorzieFlag_611() {
		return credit_authorzie_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_issue_offer_P008UP']")
	private WebElement issue_facility_offer_flag;
	public WebElement issueFacilityOfferFlag_611() {
		return issue_facility_offer_flag;
	}

	@FindBy(xpath = "//input[@id='fmsFacilityType_client_response_P008UP']")
	private WebElement client_response_flag;
	public WebElement clientResponseFlag_611() {
		return client_response_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_document_validation_yn_P008UP']")
	private WebElement document_validation_flag;
	public WebElement documentValidationFlag_611() {
		return document_validation_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_final_approval_P008UP']")
	private WebElement final_approval_flag;
	public WebElement finalApprovalFlag_611() {
		return final_approval_flag;
	}
		
	@FindBy(xpath = "//input[@id='fmsFacilityType_active_facility_P008UP']")
	private WebElement create_active_facility_flag;
	public WebElement createActiveFacilityFlag_611() {
		return create_active_facility_flag;
	}	
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_auto_approve_P008UP']")
	private WebElement auto_appprove_facility_flag;
	public WebElement autoApproveFacilityFlag_611() {
		return auto_appprove_facility_flag;
	}
	
	@FindBy(xpath = "//button[@id='fmsFacilityTypeMaint_update_P008UP']")
	private WebElement update_after_approve_update_btn;
	public WebElement updateAfterApproveUpdateBtn_611() {
		return update_after_approve_update_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement confirm_popup_ok_btn;
	public WebElement confirmPopupOkBtn_611() {
		return confirm_popup_ok_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement success_popup_ok_btn;
	public WebElement successPopupOkBtn_611() {
		return success_popup_ok_btn;
	}
	
	@FindBy(xpath = "//a[@id='P008P']")
	private WebElement facility_type_approve_menu;
	public WebElement facilityTypeApproveMenu_611() {
		return facility_type_approve_menu;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityTypeListGridTbl_Id_P008P_gs_CODE']")
	private WebElement approve_search_code;
	public WebElement approveSearchCode_611() {
		return approve_search_code;
	}
	
	@FindBy(xpath = "//td[@id='td_fmsFacilityTypeListGridTbl_Id_P008P_1_CODE']")
	private WebElement approve_search_code_result;
	public WebElement approveSearchCodeResult_611() {
		return approve_search_code_result;
	}
	
	@FindBy(xpath = "//*[@id=\"fmsFacilityTypeMaint_approve_P008P\"]")
	private WebElement facility_type_approve_btn;
	public WebElement facilityTypeApproveBtn_611() {
		return facility_type_approve_btn;
	}
	//@127860
	@FindBy(xpath = "//input[@id='facilityMgtAddDetNbrOfRepayments_WIFT008MT']")
	private WebElement FacMan_Maint_AddDetTab_FinancialPeriodConstriants_NoofRepayments;
	public WebElement facmanMaintAddDetTabFinancialPeriodConstriantsnoofrepayments_611() {
		return FacMan_Maint_AddDetTab_FinancialPeriodConstriants_NoofRepayments;
	}
	@FindBy(xpath = "//input[@id='facilityMgtAddDetIntervalRepaymentsNbr_WIFT008MT']")
	private WebElement FacMan_Maint_AddDetTab_FinancialPeriodConstriants_IntervalRepaymentNbr;
	public WebElement facmanMaintAddDetTabFinancialPeriodConstriantsintervalrepaymentNBR_611() {
		return FacMan_Maint_AddDetTab_FinancialPeriodConstriants_IntervalRepaymentNbr;
	}
	//585803
	@FindBy(xpath="//td[text()='Parameters']")
	private WebElement PaRam_ParaMeters;
	public WebElement paramparameters_611() {
		return PaRam_ParaMeters;
	}
	@FindBy(xpath="//td[text()='Estimators']")
	private WebElement ParaMeters_Estimators;
	public WebElement parametersestimators_611() {
		return ParaMeters_Estimators;
	}
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement Estimators_maintenance;
	public WebElement estimatorsmaintenance_611() {
		return Estimators_maintenance;
	}
	@FindBy(xpath="(//input[@class='path-theme-cust-input textCompSize ui-state-focus ui-corner-all'])[1]")
	private WebElement Estimators_COde;
	public WebElement estimatorscode_611() {
		return Estimators_COde;
	}
	@FindBy(xpath="//label[@id='lbl_fmsEstimators_code_P034MT']")
	private WebElement Estimators_COde_touch;
	public WebElement estimatorscodetouch_611() {
		return Estimators_COde_touch;
	}
	@FindBy(xpath="//input[@id='fmsEstimators_brief_name_eng_P034MT']")
	private WebElement Brief_DISCription;
	public WebElement briefdiscription_611() {
		return Brief_DISCription;
	}
	@FindBy(xpath="//input[@id='fmsEstimators_long_name_eng_P034MT']")
	private WebElement Long_DISCription;
	public WebElement longdiscription_611() {
		return Long_DISCription;
	}
	@FindBy(xpath="//input[@id='fmsEstimators_brief_name_arab_P034MT']")
	private WebElement Brief_DISCription_arabic;
	public WebElement briefdiscriptionarabic_611() {
		return Brief_DISCription_arabic;
	}
	@FindBy(xpath="//input[@id='fmsEstimators_long_name_arab_P034MT']")
	private WebElement Long_DISCription_arabic;
	public WebElement longdiscriptionarabic_611() {
		return Long_DISCription_arabic;
	}
	@FindBy(xpath="//input[@id='fmsEstimators_address_1_P034MT']")
	private WebElement DISCription_AddRess;
	public WebElement discriptionaddress_611() {
		return DISCription_AddRess;
	}
	@FindBy(xpath="//input[@id='fmsEstimators_mobile_P034MT']")
	private WebElement moBILE_Number;
	public WebElement mobilenumber_611() {
		return moBILE_Number;
	}
	@FindBy(xpath="//input[@id='lookuptxt_fmsEstimators_postal_code_P034MT']")
	private WebElement POStal_Code;
	public WebElement postalcode_611() {
		return POStal_Code;
	}
	@FindBy(xpath="//label[@id='fmsEstimatorsFormId_P034MT_Save_key']")
	private WebElement paramSave_button;
	public WebElement paramsavebutton_611() {
		return paramSave_button;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Confirm_Save_Process_param;
	public WebElement confirmsaveprocessparam_611() {
		return Confirm_Save_Process_param;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement Record_Updated_SuccessfullyParam;
	public WebElement RecordUpdatedSuccessfullyParam611() {
		return Record_Updated_SuccessfullyParam;
	}
	@FindBy(xpath="//*[@id=\"P034P\"]/span[2]")
	private WebElement Approve_screen;
	public WebElement approvescreen_611() {
		return Approve_screen;
	}
	@FindBy(xpath="//input[@id='fmsEstimatorsParamListGridTbl_Id_P034P_gs_CODE']")
	private WebElement Approve_screenclick_Searchbox;
	public WebElement approvescreenclicksearchbox_611() {
		return Approve_screenclick_Searchbox;
	}
	@FindBy(xpath="//td[@id='td_fmsEstimatorsParamListGridTbl_Id_P034P_1_CODE']")
	private WebElement Approve_searchbox_doubleclick;
	public WebElement searchboxdoubleclick_611() {
		return Approve_searchbox_doubleclick;
	}
	@FindBy(xpath="//label[@id='fmsEstimatorsFormId_P034P_approve_key']")
	private WebElement Final_Approve;
	public WebElement finalapprove_611() {
		return Final_Approve;
	}
	 //@127925
	@FindBy(xpath="//select[@id='applicationFacilityDecision_1_WIFT001AP1']")
	private WebElement Approvelevel1_Rejectbtn;
	public WebElement approvelevel1rejectbtn_611() { //Reject
		return Approvelevel1_Rejectbtn;
	}
	@FindBy(xpath="//button[@id='applicationfacility_approvelevel1_btn_WIFT001AP1']")
	private WebElement Approvelevel1_Submitbtn;
	public WebElement approvelevel1submitbtn_611() {
		return Approvelevel1_Submitbtn;
	}
	@FindBy(xpath="//td[text()='Reopen Rejected Applications']")
	private WebElement Reopen_Rejected_Applications_Tab ;
	public WebElement reopenrejectedapplicationstab_611() {
		return Reopen_Rejected_Applications_Tab;
	}
	@FindBy(xpath="//a[@id='WIFT0063MT']")
	private WebElement Reopen_Rejected_Applications_Tab_Maintenance ;
	public WebElement reopenrejectedapplicationstabmaintenance_611() {
		return Reopen_Rejected_Applications_Tab_Maintenance;
	}
	@FindBy(xpath="//input[@id='applicationFacilityGridTbl_Id_WIFT0063MT_gs_fmsApplVO.CODE']")
	private WebElement Reopen_Rejected_Applications_Tab_Maintenance_searchbox ;
	public WebElement reopenrejectedapplicationstabmaintenanceserachbox_611() {
		return Reopen_Rejected_Applications_Tab_Maintenance_searchbox;
	}
	@FindBy(xpath="//td[@id='td_applicationFacilityGridTbl_Id_WIFT0063MT_1_fmsApplVO.CODE']")
	private WebElement Rejectdata_Retrivedata_Validated ;
	public WebElement rejectdataretrivedatavalidated_611() {
		return Rejectdata_Retrivedata_Validated;
	}
	//@956327________Repaymentplan
	
	@FindBy(xpath="//button[@id='applicationfacility_repayplan_btn_WIFT001MT']")
	private WebElement LimitDetailsTab_RepaymentplanTab ;
	public WebElement limitdetailstabrepaymentplantab_611() {
		return LimitDetailsTab_RepaymentplanTab;
	}
	@FindBy(xpath="//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001MT_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement ApplicationFacility_LimitDetails ;
	public WebElement ApplicationFacilityLimitDetailsRowClick_611() {
		return ApplicationFacility_LimitDetails;
	}
	
	@FindBy(xpath="//span[@id='ui-dialog-title-fmsRepaymentPlanDiv_id_WIFT001MT']")
	private WebElement RepaymentPlan_Page_Open ;
	public WebElement ForValidaterepaymentplanpageopen_611() {
		return RepaymentPlan_Page_Open;
	}//div[@id='fmsRepaymentPlanDiv_id_WIFT001MT']
	
	//@594207
	
	@FindBy(xpath="//input[@id='No_Of_Payments_WIFT001MT']")
	private WebElement RepaymentPlan_No_Of_Payment ;
	public WebElement repaymentplannoofpayment_611() {
		return RepaymentPlan_No_Of_Payment;
	}
	@FindBy(xpath="//button[@id='createSchedule_WIFT001MT']")
	private WebElement RepaymentPlan_CreateScheduleBtn ;
	public WebElement repaymentplancreateschedulebtn_611() {
		return RepaymentPlan_CreateScheduleBtn;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Do_you_want_to_create_tentative_schedule_Okbtn ;
	public WebElement DoyouwanttocreatetentativescheduleOkbtn_611() {
		return Do_you_want_to_create_tentative_schedule_Okbtn;
	}
	@FindBy(xpath="//td[@id='td_repaumentPlanScheduleGridTbl_Id_WIFT001MT_69_rn']")
	private WebElement Validate_NOofpaymentlast ;
	public WebElement ValidateNOofpaymentlast_611() {
		return Validate_NOofpaymentlast;
	}
	
   //@816212_IIS Param
	
	@FindBy(xpath="//td[text()='Parameters']")
	private WebElement IIS_ParameterTab ;
	public WebElement IISParameterTab_611() {
		return IIS_ParameterTab;
	}
	@FindBy(xpath="//td[text()='Product Class']")
	private WebElement IIS_Parameter_Productclass ;
	public WebElement IISParameterproductclass_611() {
		return IIS_Parameter_Productclass;
	}
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement Productclass_Maintenance ;
	public WebElement ProductclassMaintenance_611() {
		return Productclass_Maintenance;
	}
	@FindBy(xpath="//a[@id='infoBarSearchButton_M003MT']")
	private WebElement Productclass_Maintenance_Infosearchbtn ;
	public WebElement ProductclassMaintenanceinfosearchbtn_611() {
		return Productclass_Maintenance_Infosearchbtn;
	}
	@FindBy(xpath="//input[@id='iISProductClassListGridTbl_Id_M003MT_gs_trsctrlclassVO.CLASS']")
	private WebElement Productclass_Maintenance_Infosearchbtn_clsearchbtn ;
	public WebElement ProductclassMaintenanceinfosearchbtnclsearchbtn_611() {
		return Productclass_Maintenance_Infosearchbtn_clsearchbtn;
	}
	@FindBy(xpath="//tr[@id='1']")
	private WebElement Productclass_Maintenance_Infosearchbtn_clsearchbtn_Doubletap ;
	public WebElement ProductclassMaintenanceinfosearchbtnclsearchbtndoubletap_611() {
		return Productclass_Maintenance_Infosearchbtn_clsearchbtn_Doubletap;
	}
	@FindBy(xpath="iisProductClassAdditionalInformation_M003MT")
	private WebElement IISparameter_ProductclsMaintenance_AdditionalInformationTab;
	public WebElement IISparameterProductclsMaintenanceAdditionalInformationTab_611() {
		return IISparameter_ProductclsMaintenance_AdditionalInformationTab;
	}
	@FindBy(xpath="//select[@id='iisProductClassAccuralBases_M003MT']")//Actual/365
	private WebElement IISparameter_ProductclsMaintenance_AdditionalInformationTab_AccrualBasis;//Actual/Actual
	public WebElement IISparameterProductclsMaintenanceAdditionalInformationTabaccrualbasis_611() {
		return IISparameter_ProductclsMaintenance_AdditionalInformationTab_AccrualBasis;
	}
	@FindBy(xpath="//label[@id='iisProductClassMaintFormId_M003MT_Save_key']")
	private WebElement iisparameter_productclass_Savebtn;
	public WebElement iisparameterproductclassSavebtn_611() {
		return iisparameter_productclass_Savebtn;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement iisparameter_productclass_Savebtn_confirmbtn;
	public WebElement iisparameter_productclass_Savebtn_confirmbtn_611() {
		return iisparameter_productclass_Savebtn_confirmbtn;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement iisparameter_productclass_Savebtn_confirmbtn_Updatesuccesokbtn;
	public WebElement iisparameter_productclass_Savebtn_confirmbtnupdatesuccesokbtn_611() {
		return iisparameter_productclass_Savebtn_confirmbtn_Updatesuccesokbtn;
	}
	//@816212_FmsCore
	
	@FindBy(xpath="//select[@id='accrualBasis_WIFT001MT']")//Actual/Actual
	private WebElement RepaymentPlan_AccrualBasis;//Actual/365
	public WebElement RepaymentPlanAccrualBasis_611() { //31/365  //Actual/365
		return RepaymentPlan_AccrualBasis;
	}
	
	//@434947
	
	@FindBy(xpath ="//a[@id='WIFT008UP']")
	private WebElement Facility_Management_Updateafter_Approve ;
	public WebElement FMupdateafterapprove_611() {
		return Facility_Management_Updateafter_Approve;
	}
	@FindBy(xpath ="//li[@id='facilityLimitDetailsTab_WIFT008UP']")
	private WebElement FM_Updateafterapprove_Facilitylimitdetails ;
	public WebElement FMUpdateafterapproveFacilitylimitdetails_611() {
		return FM_Updateafterapprove_Facilitylimitdetails;
	}
	@FindBy(xpath ="//button[@id='facilityManagement_limitDetails_edit_btn_WIFT008UP']")
	private WebElement FM_Updateafterapprove_Facilitylimitdetails_Edit ;
	public WebElement FMUpdateafterapproveFacilitylimitdetailsedit_611() {
		return FM_Updateafterapprove_Facilitylimitdetails_Edit;
	}
	@FindBy(xpath ="//td[@id='td_FacilityManagementFacilityLimitDetailsGrid_WIFT008UP_1_fmsFacilityDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement FM_Updateafterapprove_Facilitylimitdetails_RetdataDoubleclick;
	public WebElement FMUpdateafterapproveFacilitylimitdetailsRetdataDoubleclick_611() {
		return FM_Updateafterapprove_Facilitylimitdetails_RetdataDoubleclick;
	}
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008UP_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement Updateafter_Approve_Clearbtn ;
	public WebElement FMupdateafterapproveclearbtn_611() {
		return Updateafter_Approve_Clearbtn;
	}
	@FindBy(xpath ="//td[@id='td_facilityManagementGridTbl_Id_WIFT008UP_1_fmsFacilityVO.CODE']")
	private WebElement Retrivedata_Doubleclick ;
	public WebElement retrivedatadoubleclick_611() {
		return Retrivedata_Doubleclick;
	}
	
	@FindBy(xpath ="//span[text()='Facility Limit Details']")
	private WebElement Facility_Limit_details ;
	public WebElement facilitylimitdetails_611() {
		return Facility_Limit_details;
	}
	@FindBy(xpath ="//span[text()='Facility Limit Details']")
	private WebElement Facility_Limit_detailsvalue_Doubletap ;
	public WebElement facilitylimitdetailsvaluedoubletap_611() {
		return Facility_Limit_detailsvalue_Doubletap;
	}
	
	@FindBy(xpath ="//input[@id='applicationFacilitylimityielddetrate_WIFT001MT']")
	private WebElement Limit_Additional_Yield_details ;
	public WebElement limitadditionalyielddetails_611() {
		return Limit_Additional_Yield_details;
	}
	@FindBy(xpath ="//input[@id='applicationfacilityLimitDetailsMARGIN_RATE_WIFT001MT']")
	private WebElement Limit_Additional_details_MarginRate ;
	public WebElement limitadditionaldetailsMarginRate_611() {
		return Limit_Additional_details_MarginRate;
	}
	@FindBy(xpath ="//table[@id='FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement Doubleclick_fordatevalue ;
	public WebElement doubleclickfordatevalue_611() {
		return Doubleclick_fordatevalue;
	}
	
	@FindBy(xpath ="//input[@id='1_fmsFacDocumentsVO.SOL_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement Solicitor_Datesent;
	public WebElement solicitordatesent_611() {
		return Solicitor_Datesent;
	}
	@FindBy(xpath ="//input[@id='1_fmsFacDocumentsVO.SOL_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement Solicitor_Datereceived ;
	public WebElement solicitordatereceived_611() {
		return Solicitor_Datereceived;
	}
	@FindBy(xpath ="//input[@id='1_fmsFacDocumentsVO.EST_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement Estimator_Datesent;
	public WebElement estimatordatesent_611() {
		return Estimator_Datesent;
	}
	@FindBy(xpath ="//input[@id='1_fmsFacDocumentsVO.EST_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement Estimator_DateReceived ;
	public WebElement estimatordatereceived_611() {
		return Estimator_DateReceived;
	}
	@FindBy(xpath ="//input[@id='1_fmsFacDocumentsVO.CUSTODIAN_SENT_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement Custodian_datesent;
	public WebElement custodiandatesent_611() {
		return Custodian_datesent;
	}
	@FindBy(xpath ="//*[@id=\"facilitymanagement_save_btn_WIFT008UP\"]/span[2]")
	private WebElement Datedetails_Save;
	public WebElement datedetailssave_611() {
		return Datedetails_Save;
	}
	@FindBy(xpath ="(//span[text()='Approve/Reject'])[2]")
	private WebElement FacilityMangement_Approve;
	public WebElement facilitymanagementapprove_611() {
		return FacilityMangement_Approve;
	}
	@FindBy(xpath ="//*[@id=\"facilityManagementGridTbl_Id_WIFT008AP_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement Approve_Clearbutton;
	public WebElement approveclearbutton_611() {
		return Approve_Clearbutton;
	}
	@FindBy(xpath ="//*[@id=\"FacilityManagementFacilityLimitDetailsGrid_WIFT008AP\"]")
	private WebElement Productclass_Retrivedata_doubleclick;
	public WebElement pcretrivedatadoubleclick_611() {
		return Productclass_Retrivedata_doubleclick;
	}
	@FindBy(xpath ="//*[@id=\"limitDetails_close_btn_WIFT008AP\"]/span[2]")
	private WebElement Close_Button;
	public WebElement closebutton_611() {
		return Close_Button;
	}
	@FindBy(xpath ="(//span[text()='Maintenance'])[1]")
	private WebElement FacilityManagement_Maintenance;
	public WebElement facilitymanagementmaintenance_611() {
		return FacilityManagement_Maintenance;
	}
	@FindBy(xpath ="//*[@id=\"facilityManagementGridTbl_Id_WIFT008MT_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement FacilityManagement_Maintenance_Clear;
	public WebElement facilitymanagementmaintenanceclear_611() {
		return FacilityManagement_Maintenance_Clear;
	}
	@FindBy(xpath ="//button[@id='facilityManagement_limitDetails_edit_btn_WIFT008UP']")
	private WebElement FacilityManagement_Facilitylimitdetailstab_Editbtn;
	public WebElement FacilityManagementFacilitylimitdetailstabEditbtn_611() {
		return FacilityManagement_Facilitylimitdetailstab_Editbtn;
	}
	@FindBy(xpath ="//button[@id='facilityManagement_approve_btn_WIFT008AP']")
	private WebElement FacilityManagement_Approvebtn;
	public WebElement FacilityManagementApprovebtn_611() {
		return FacilityManagement_Approvebtn;
	}
	
	@FindBy(xpath ="//input[@id='applicationfacilityLimitDetailsCLASSDesc_WIFT001MT']")
	private WebElement ProductClass_Overdraftbtn;
	public WebElement ProductClassOverdraftbtn_611() {
		return ProductClass_Overdraftbtn;
	}
	@FindBy(xpath ="//input[@id='applicationfacilityLimitDetailsfloatRateDesc_WIFT001MT']")
	private WebElement FloatingRate_Ratebtn;
	public WebElement FloatingRateRatebtn_611() {
		return FloatingRate_Ratebtn;
	}
	@FindBy(xpath ="//button[@id='facilitymanagement_save_btn_WIFT008UP']")
	private WebElement FM_Updateafterapprove_Savebtn;
	public WebElement FMUpdateafterapproveSavebtn_611() {
		return FM_Updateafterapprove_Savebtn;
	}
	@FindBy(xpath ="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement FM_Updateafterapprove_Savebtn_confirmokbtn;
	public WebElement FMUpdateafterapproveSavebtnconfirmokbtn_611() {
		return FM_Updateafterapprove_Savebtn_confirmokbtn;
	}
	@FindBy(xpath ="//input[@id='_popup_path_sol_ok']")
	private WebElement FM_Updateafterapprove_Savebtn_confirmokbtn_successokbtn;
	public WebElement FMUpdateafterapproveSavebtnconfirmokbtnsuccessokbtn_611() {
		return FM_Updateafterapprove_Savebtn_confirmokbtn_successokbtn;
	}
	@FindBy(xpath ="//a[@id='dismissbut_WIFT008UP']")
	private WebElement FM_Updateafterapprove_Alertdismissbtn;
	public WebElement FMUpdateafterapproveAlertdismissbtn_611() {
		return FM_Updateafterapprove_Alertdismissbtn;
	}
	@FindBy(xpath ="//input[@id='facilityMgtLimitDetailsyielddetrate_WIFT008UP']")
	private WebElement FM_Updateafterapprove_Yieldetailsbtn;
	public WebElement FMUpdateafterapproveYieldetailsbtn_611() {
		return FM_Updateafterapprove_Yieldetailsbtn;
	}
	@FindBy(xpath ="//input[@id='facilityMgtLimitDetailsAdditionalMarginRate_WIFT008UP']")
	private WebElement FM_Updateafterapprove_Margindetailsbtn;
	public WebElement FMUpdateafterapprovemargindetailsbtn_611() {
		return FM_Updateafterapprove_Margindetailsbtn;
	}
	@FindBy(xpath ="//label[@id='lbl_facilityMgtLimitDetailsAdditionalMarginRate_WIFT008UP']")
	private WebElement FM_Updateafterapprove_Margindetailsbtntouch;
	public WebElement FMUpdateafterapprovemargindetailsbtntouch_611() {
		return FM_Updateafterapprove_Margindetailsbtntouch;
	}
	//678142
	@FindBy(xpath = "//button[@id='facilityMangementJVDetails_btn_WIFT008MT']")
	private WebElement wifak_facilities_management_main_journal_voucher_details_btn;
	public WebElement wifakFacilitiesManagementMaintananceJournalVoucherDetailsBtn_611() {
		return wifak_facilities_management_main_journal_voucher_details_btn;
	}
	
	@FindBy(xpath = "//table[@id='facManagementAccountJvList_Id_WIFT008MT']")
	private WebElement wifak_facilities_management_main_jv_details_tab_account_details;
	public WebElement wifakFacilitiesManagementMaintananceJVDetailsTabAccountDetails_611() {
		return wifak_facilities_management_main_jv_details_tab_account_details;
	}
	@FindBy(xpath = "//a[@id='WIFT008CN']")
	private WebElement wifak_facilities_management_cancel_reverse_menu;
	public WebElement wifakFacilitiesManagementCancelMenu_611() {
		return wifak_facilities_management_cancel_reverse_menu;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008CN_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement wifak_facilities_management_cancel_search_app_ref_input;
	public WebElement wifakFacilitiesManagementCancelSearchAppRefInput_611() {
		return wifak_facilities_management_cancel_search_app_ref_input;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008CN_1_fmsFacilityVO.CODE']")
	private WebElement wifak_facilities_management_cancel_search_grid_first_row;
	public WebElement wifakFacilitiesManagementCancelSearchGridFirstRow_611() {
		return wifak_facilities_management_cancel_search_grid_first_row;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtMainCif_WIFT008CN']")
	private WebElement wifak_facilities_management_cancel_CIFNo_input;
	public WebElement wifakFacilitiesManagementCancelCIFNoInput_611() {
		return wifak_facilities_management_cancel_CIFNo_input;
	}
	
	@FindBy(xpath = "//button[@id='facilityManagement_cancel_btn_WIFT008CN']")
	private WebElement wifak_facilities_management_cancel_menu_cancel_btn;
	public WebElement wifakFacilitiesManagementCancelMenuCancelBtn_611() {
		return wifak_facilities_management_cancel_menu_cancel_btn;
	}
	//678142
	//WIFAK Facilities Management Approve/Reject Cancel menu
	@FindBy(xpath = "//a[@id='WIFT008CR']")
	private WebElement wifak_facilities_management_approve_cancel_menu;
	public WebElement wifakFacilitiesManagementApproveCancelMenu_611() {
		return wifak_facilities_management_approve_cancel_menu;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008CR_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement wifak_facilities_management_approve_cancel_search_app_ref_input;
	public WebElement wifakFacilitiesManagementApproveCancelSearchAppRefInput_611() {
		return wifak_facilities_management_approve_cancel_search_app_ref_input;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008CR_1_fmsFacilityVO.CODE']")
	private WebElement wifak_facilities_management_approve_cancel_search_grid_first_row;
	public WebElement wifakFacilitiesManagementApproveCancelSearchGridFirstRow_611() {
		return wifak_facilities_management_approve_cancel_search_grid_first_row;
	}
	
	@FindBy(xpath = "//input[@id='facilityMgtMainCif_WIFT008CR']")
	private WebElement wifak_facilities_management_approve_cancel_CIFNo_input;
	public WebElement wifakFacilitiesManagementApproveCancelCIFNoInput_611() {
		return wifak_facilities_management_approve_cancel_CIFNo_input;
	}
	
	@FindBy(xpath = "//button[@id='facilityManagement_approve_cancel_btn_WIFT008CR']")
	private WebElement wifak_facilities_management_approve_cancel_menu_approve_reverse_btn;
	public WebElement wifakFacilitiesManagementApproveCancelMenuApproveCancelBtn_611() {
		return wifak_facilities_management_approve_cancel_menu_approve_reverse_btn;
	}
	
	//@678324_FMS_Core
	@FindBy(xpath ="//td[text()='Purpose of Financing']")
	private WebElement Parameter_PurposeOfFinancing;
	public WebElement purposeoffinancing_611() {
		return Parameter_PurposeOfFinancing;
	}	
	
	//@678324_FMS_param
		@FindBy(xpath ="//span[text()='Maintenance']")
		private WebElement PurposeOfFinancing_Maintenence;
		public WebElement purposeoffinancingmaintenance_611() {
			return PurposeOfFinancing_Maintenence;
		
	    }
		@FindBy(xpath ="//input[@id='purposefinancingFormIdCode_P038MT']")
		private WebElement Maintenence_Code;
		public WebElement maintenancecode_611() {
			return Maintenence_Code;
		}
		@FindBy(xpath ="//input[@id='purposefinancingFormIdAdditionalNumber_P038MT']")
		private WebElement Additional_Number;
		public WebElement additionalnumber_611() {
			return Additional_Number;
		}
		@FindBy(xpath ="//input[@id='purposefinancingFormIdDescription_eng_P038MT']")
		private WebElement Discription;
		public WebElement discription_611() {
			return Discription;
		}
		@FindBy(xpath ="//span[text()='Product Class']")
		private WebElement Product_Class;
		public WebElement productclass_611() {
			return Product_Class;
		}
		@FindBy(xpath ="//*[@id=\"add_purposeFinancingProductClassGrid_P038MT\"]/div/span")
		private WebElement Product_Class_Addbutton;
		public WebElement productclassaddbutton_611() {
			return Product_Class_Addbutton;
		}
		@FindBy(xpath ="new_1685274582032_purposeFinancingProductClassVO.PRODUCTCLASS_lookuptxt_purposeFinancingProductClassGrid_P038MT")
		private WebElement Product_Class_Searchbutton;
		public WebElement productclasssearchbutton_611() {
			return Product_Class_Searchbutton;
		}
		@FindBy(xpath ="//label[@id='purposefinancingFormId_P038MT_Save_key']")
		private WebElement Product_Class_Savebutton ;
		public WebElement productclasssavebutton_611() {
			return Product_Class_Savebutton;
		}
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement Save_button_confirm_ok;
		public WebElement saveButtonConfirmOk_611() {
			return Save_button_confirm_ok;
		}
		
		@FindBy(xpath = "//*[@id='_popup_path_sol_ok']")
		private WebElement Save_button_success_ok;
		public WebElement saveButtonSuccessOk_611() {
			return Save_button_success_ok;
		}
		@FindBy(xpath ="//a[@id='P038P']]")
		private WebElement Purposeofinancing_Approve ;
		public WebElement purposeoffinancingapprove_611() {
			return Purposeofinancing_Approve;
		}
		@FindBy(xpath ="//input[@id='purposeFinancingListGridTbl_Id_P038P_gs_purposeFinancingVO.CODE']")
		private WebElement Approve_Searchbox ;
		public WebElement approvesearchbox_611() {
			return Approve_Searchbox;
		}
		@FindBy(xpath ="//tr[@id='1']")
		private WebElement Approve_Searchbox_Retrivedata ;
		public WebElement approvesearchboxretrivedata_611() {
			return Approve_Searchbox_Retrivedata;
		}
		@FindBy(xpath ="//label[@id='purposefinancingFormId_P038P_approve_key']")
		private WebElement Param_Approve_button ;
		public WebElement paramapprovebutton_611() {
			return Param_Approve_button;
		}
		//@640897
		@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008MT_gs_statusDesc']")
		private WebElement wifak_facilities_management_main_searchgrid_status_input;
		public WebElement wifakFacilitiesManagementMainSearchgridStatusInput_611() {
			return wifak_facilities_management_main_searchgrid_status_input;
		}
		
		@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008MT_2_fmsFacilityVO.CODE']")
		private WebElement wifak_facilities_management_main_searchgrid_rows;
		public WebElement wifakFacilitiesManagementMainSearchgridRow_611() {
			return wifak_facilities_management_main_searchgrid_rows;
		}
		@FindBy(xpath = "//input[@id='lookuptxt_facilityMgtMainApplicationRef_WIFT008MT']")
		private WebElement wifak_facilities_management_main_application_ref_input;
		public WebElement wifakFacilitiesManagementMainApplicationRefInput_611() {
			return wifak_facilities_management_main_application_ref_input;
		}
		
		
		@FindBy(xpath = "//button[@id='facilityManagement_collateralDetails_btn_WIFT008MT']")
		private WebElement wifak_facilities_management_main_limit_details_tab_collateral_details_btn;
		public WebElement wifakFacilitiesManagementMainLimitDetailsTabCollateralDetailsBtn_611() {
			return wifak_facilities_management_main_limit_details_tab_collateral_details_btn;
		}
		
		@FindBy(xpath = "//div[@id='facilitySubLimitCollateralDetailsDiv_id_WIFT008MT']")
		private WebElement wifak_facilities_management_main_collateral_details_tab;
		public WebElement wifakFacilitiesManagementMainCollateralDetailsTab_611() {
			return wifak_facilities_management_main_collateral_details_tab;
		}
		
		@FindBy(xpath = "//td[@id='add_FacilityCollateralGrid_WIFT008MT']/div/span")
		private WebElement wifak_facilities_management_main_collateral_details_tab_add_icon;
		public WebElement wifakFacilitiesManagementMainCollateralDetailsTabAddIcon_611() {
			return wifak_facilities_management_main_collateral_details_tab_add_icon;
		}
		
		@FindBy(xpath = "//td[@id='td_FacilityCollateralGrid_WIFT008MT_1_rn']")
		private WebElement wifak_facilities_management_main_collateral_details_tab_first_row;
		public WebElement wifakFacilitiesManagementMainCollateralDetailsTabFirstRow_611() {
			return wifak_facilities_management_main_collateral_details_tab_first_row;
		}
		
		@FindBy(xpath = "//input[@name='lookupTxt_fmsAppcollateralsVO.COLLATERAL']")
		private WebElement wifak_facilities_management_main_collateral_details_tab_first_row_collateral_input;
		public WebElement wifakFacilitiesManagementMainCollateralDetailsTabFirstRowCollateralInput_611() {
			return wifak_facilities_management_main_collateral_details_tab_first_row_collateral_input;
		}	
		
		@FindBy(xpath = "//span[text()='Ok']")
		private WebElement wifak_facilities_management_main_collateral_details_tab_Ok_btn;
		public WebElement wifakFacilitiesManagementMainCollateralDetailsTabOkBtn_611() {
			return wifak_facilities_management_main_collateral_details_tab_Ok_btn;
		}
		@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008AP_gs_fmsFacilityVO.FROM_APPLICATION']")
		private WebElement wifak_facilities_management_approve_search_app_ref_input;
		public WebElement wifakFacilitiesManagementApproveSearchAppRefInput_611() {
			return wifak_facilities_management_approve_search_app_ref_input;
		}
		@FindBy(xpath = "//td[@id='td_FacilityManagementFacilityLimitDetailsGrid_WIFT008MT_1_fmsFacilityDetVO.GENERAL_FACILITY_TYPE']")
		private WebElement wifak_facilities_management_main_facility_limit_details_product_class_row;
		public WebElement wifakFacilitiesManagementMainFacilityLimitDetailsProductClassRow_611() {
			return wifak_facilities_management_main_facility_limit_details_product_class_row;
		}
		@FindBy(xpath = "//button[@id='facilitymanagement_save_btn_WIFT008MT']")
		private WebElement wifak_facilities_management_maintanance_save_btn;
		public WebElement wifakFacilitiesManagementMaintananceSaveBtn_611() {
			return wifak_facilities_management_maintanance_save_btn;
		}
		@FindBy(xpath = "//a[@id='WIFT008AP']")
		private WebElement wifak_facilities_management_approve_menu;
		public WebElement wifakFacilitiesManagementApproveMenu_611() {
			return wifak_facilities_management_approve_menu;
		}
		@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008AP_1_fmsFacilityVO.CODE']")
		private WebElement wifak_facilities_management_approve_search_grid_first_row;
		public WebElement wifakFacilitiesManagementApproveSearchGridFirstRow_611() {
			return wifak_facilities_management_approve_search_grid_first_row;
		}
		@FindBy(xpath = "//input[@id='facilityMgtMainCif_WIFT008AP']")
		private WebElement wifak_facilities_management_approve_CIFNo_input;
		public WebElement wifakFacilitiesManagementApproveCIFNoInput_611() {
			return wifak_facilities_management_approve_CIFNo_input;
		}
		@FindBy(xpath = "//button[@id='facilityManagement_approve_btn_WIFT008AP']")
		private WebElement wifak_facilities_management_approve_menu_approve_btn;
		public WebElement wifakFacilitiesManagementApproveMenuApproveBtn_611() {
			return wifak_facilities_management_approve_menu_approve_btn;
		}
		//
		@FindBy(xpath = "//td[text()='Collateral Type']")
		private WebElement parameter_collateral_type;
		public WebElement parameterCollateralType_611() {
			return parameter_collateral_type;
		}
		
		@FindBy(xpath = "//a[@id='P002MT']")
		private WebElement collateral_type_maintanance;
		public WebElement collateralTypeMaintanance_611() {
			return collateral_type_maintanance;
		}
		
		@FindBy(xpath = "//input[@id='txt_code_P002MT']")
		private WebElement collateral_type_main_code;
		public WebElement collateralTypeMainCode_611() {
			return collateral_type_main_code;
		}
		
		@FindBy(xpath = "//input[@id='txt_brief_description_eng_P002MT']")
		private WebElement collateral_type_main_brief_descrip;
		public WebElement collateralTypeMainBriefDescrip_611() {
			return collateral_type_main_brief_descrip;
		}
		
		@FindBy(xpath = "//input[@id='txt_long_description_eng_P002MT']")
		private WebElement collateral_type_main_long_descrip;
		public WebElement collateralTypeMainLongDescrip_611() {
			return collateral_type_main_long_descrip;
		}
		
		@FindBy(xpath = "//select[@id='txt_asset_type_P002MT']")
		private WebElement collateral_type_main_asset_type_dropdown;
		public WebElement collateralTypeMainAssetTypeDropdown_611() {
			return collateral_type_main_asset_type_dropdown;
		}
		
		@FindBy(xpath = "//button[@id='collateralTypeMaint_save_P002MT']")
		private WebElement collateral_type_main_save_btn;
		public WebElement collateralTypeMainSaveBtn_611() {
			return collateral_type_main_save_btn;
		}
		
		@FindBy(xpath = "//a[@id='P002P']")
		private WebElement collateral_type_approve;
		public WebElement collateralTypeApprove_611() {
			return collateral_type_approve;
		}
		
		@FindBy(xpath = "//input[@id='collateralTypeListGridTbl_Id_P002P_gs_fmsColatTypeVo.CODE']")
		private WebElement collateral_type_approve_code;
		public WebElement collateralTypeApproveCode_611() {
			return collateral_type_approve_code;
		}
		
		@FindBy(linkText = "//*[@id='1']")
		private WebElement collateral_type_approve_code_row1;
		public WebElement collateralTypeApproveCodeRow1_611() {
			return collateral_type_approve_code_row1;
		}
		
		@FindBy(xpath = "//button[@id='collateralTypeMaint_approve_P002P']")
		private WebElement collateral_type_approve_btn;
		public WebElement collateralTypeApproveBtn_611() {
			return collateral_type_approve_btn;
		}
}
