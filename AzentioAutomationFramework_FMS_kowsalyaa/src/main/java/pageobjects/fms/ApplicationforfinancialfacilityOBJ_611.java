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
	
   //@816212
	
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
	
   
    
}

