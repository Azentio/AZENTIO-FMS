package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestMenuOBJ_611 {
	WebDriver driver;	
	public RequestMenuOBJ_611(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	//@127919_Fms_Core
	@FindBy(xpath = "//td[text()='Request']")
	private WebElement FmsApplication_RequestMenu;
	public WebElement fmsappliactionrequestmenu_611() {
		return FmsApplication_RequestMenu;
	}
	@FindBy(xpath = "//td[text()='Request Financing']")
	private WebElement RequestMenu_Requestfinancing;
	public WebElement requestmenurequestfinancing_611() {
		return RequestMenu_Requestfinancing;
	}
	@FindBy(xpath = "//td[text()='Facilities Management']")
	private WebElement Requestfinancing_facilityManagement;
	public WebElement requestfinancingfacilitymanagement_611() {
		return Requestfinancing_facilityManagement;
	}
	@FindBy(xpath = "//td[text()='Request For Financing']")
	private WebElement Requestfinancing_Requestforfinancing;
	public WebElement requestfinancingrequestforfinancing_611() {
		return Requestfinancing_Requestforfinancing;
	}
	
	@FindBy(xpath = "//*[@id='RFFRF00LC']/span[2]")
	private WebElement Requestfinancing_Requestforfinancing_first;
	public WebElement requestfinancingrequestforfinancingFirst_611() {
		return Requestfinancing_Requestforfinancing_first;
	}
	
	
//	@FindBy(xpath = "//td[text()='Request Financing']")
//	private WebElement RequestMenu_Requesttfinancing;
//	public WebElement requestmenurequesttfinancing_611() {
//		return RequestMenu_Requesttfinancing;
//	}
//	@FindBy(xpath = "//td[text()='Request For Financing']")
//	private WebElement Requestfinancing_Requesttforfinancing;
//	public WebElement requestfinancingrequesttforfinancing_611() {
//		return Requestfinancing_Requesttforfinancing;
//	}
	
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
		@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
		private WebElement success_popup_ok_btn;
		public WebElement SuccessPopupOkBtn_611() {
			return success_popup_ok_btn;
		}
	
	//@127920_Fms_Core
	
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Requestforfinancing_Maintenance;
	public WebElement requestforfinancingmaintenance_611() {
		return Requestforfinancing_Maintenance;
	}
	@FindBy(xpath = "//select[@id='requestFinancingApplicationFor_RFFRF00MT']")
	private WebElement Requestforfinancing_Maintenance_Reasonforsubmission;
	public WebElement requestforfinancingmaintenancereasonforsubmission_611() {
		return Requestforfinancing_Maintenance_Reasonforsubmission;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinanacingCif_RFFRF00MT']")
	private WebElement Requestforfinancing_Maintenance_Customer;
	public WebElement requestforfinancingmaintenancecustomer_611() {
		return Requestforfinancing_Maintenance_Customer;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingFacilityType_RFFRF00MT']")
	private WebElement Requestforfinancing_Maintenance_Facilitytype;
	public WebElement requestforfinancingmaintenancefacilitytype_611() {
		return Requestforfinancing_Maintenance_Facilitytype;
	}
	@FindBy(xpath = "//input[@id='requestFinancingFacilityTotalvalue_RFFRF00MT']")
	private WebElement Requestforfinancing_Maintenance_totallimit;
	public WebElement requestforfinancingmaintenancetotallimit_611() {
		return Requestforfinancing_Maintenance_totallimit;
	}
	@FindBy(xpath = "//li[@id='requestFinancingLimitDtlsTabs_RFFRF00MT']")
	private WebElement Requestforfinancing_Disbursesublimittab;
	public WebElement requestforfinancingdisbursesublimittab_611() {
		return Requestforfinancing_Disbursesublimittab;
	}
	@FindBy(xpath = "//td[@id='add_RequestFinancingLimitDetailsGridId_RFFRF00MT']")
	private WebElement Requestforfinancing_Disbursesublimittab_Addbutton;
	public WebElement requestforfinancingdisbursesublimittabaddbutton_611() {
		return Requestforfinancing_Disbursesublimittab_Addbutton;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingLimitDetailsGeneralFacilityProductClass_RFFRF00MT']")
	private WebElement Disbursesublimittab_Addbutton_Productclassvalue;
	public WebElement disbursesublimittabaddbuttonproductclassvalue_611() {
		return Disbursesublimittab_Addbutton_Productclassvalue;
	}
	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsRfNewMargin_RFFRF00MT']")
	private WebElement Disbursesublimittab_Addbutton_Productclassvalue_Marginvalue;
	public WebElement requestforfinancingdisbursesublimittabmarginvalue_611() {
		return Disbursesublimittab_Addbutton_Productclassvalue_Marginvalue;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_floatingRateCode_RFFRF00MT']")
	private WebElement Floating_Rate;
	public WebElement floatingrate_611() {
		return Floating_Rate;
	}
	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsFloatRatePeriodicityNbr_RFFRF00MT']")
	private WebElement Floating_Rate_Periodicitynum;
	public WebElement floatingrateperiodicitynum_611() {
		return Floating_Rate_Periodicitynum;
	}
	@FindBy(xpath = "//select[@id='requestFinancingLimitDetailsFloatRatePeriodicityType_RFFRF00MT']")
	private WebElement Floating_Rate_PeriodicityMonth;
	public WebElement floatingrateperiodicitymonth_611() {
		return Floating_Rate_PeriodicityMonth;
	}
	@FindBy(xpath = "//button[@id='limitDetails_add_btn_RFFRF00MT']")
	private WebElement productclassvalues_Addbutton;
	public WebElement productclassvalueaddbutton_611() {
		return productclassvalues_Addbutton;
	}
	@FindBy(xpath = "//label[@id='requestFinancingFormId_RFFRF00MT_save_key']")
	private WebElement productclassvalues_Savebutton;
	public WebElement productclassvaluesavebutton_611() {
		return productclassvalues_Savebutton;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement productclassvalues_Savebutton_Confirmsaveokbtn;
	public WebElement productclassvaluesavebuttonconfirmsaveokbtn_611() {
		return productclassvalues_Savebutton_Confirmsaveokbtn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement productclassvalues_Savebutton_Requestidsavesuccessfullyokbtn;
	public WebElement productclassvaluesavebuttonrequestidsavesuccessfully_611() {
		return productclassvalues_Savebutton_Requestidsavesuccessfullyokbtn;
	}
	@FindBy(xpath = "//label[@id='requestFinancingFormId_RFFRF00MT_Validate_key']")
	private WebElement Productclassvalues_Validatebutton;
	public WebElement productclassvaluesvalidatebutton_611() {
		return Productclassvalues_Validatebutton;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Productclassvalues_Validatebutton_Confirmvalidateokbtn;
	public WebElement productclassvaluesvalidatebuttonconfirmvalidateokbtn_611() {
		return Productclassvalues_Validatebutton_Confirmvalidateokbtn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Facility_Already_Created_Popupyesbtn;
	public WebElement facilityalreadycreatedpopupyesbtn_611() {
		return Facility_Already_Created_Popupyesbtn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Productclassvalues_Confirmvalidateokbtn_Requestidvalidatedsuccessfully;
	public WebElement productclassvaluesconfirmvalidateokbtnrequestvalidatessuccessfully_611() {
		return Productclassvalues_Confirmvalidateokbtn_Requestidvalidatedsuccessfully;
	}
	@FindBy(xpath = "//a[@id='dismissbut_RFFRF00MT']")
	private WebElement Alert_Dismiss_btn;
	public WebElement alertdismissbtn_611() {
		return Alert_Dismiss_btn;
	}
	@FindBy(xpath = "//a[@id='RFFRF00P1']")
	private WebElement Requestforfinancing_Approvelevel1;
	public WebElement requestforfinancingapprovelevel1_611() {
		return Requestforfinancing_Approvelevel1;
	}
	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_RFFRF00P1_gs_fmsRequestFinancingVO.CODE']")
	private WebElement Requestforfinancing_Approvelevel1_Searchbox;
	public WebElement requestforfinancingapprovelevel1searchbox_611() {
		return Requestforfinancing_Approvelevel1_Searchbox;
	}
	@FindBy(xpath = "(//tr[@id='1'])[2]")
	private WebElement Requestforfinancing_Approvelevel1_Searchbox_Firstretrivedata;
	public WebElement requestforfinancingapprovelevel1searchboxfirstretrivedata_611() {
		return Requestforfinancing_Approvelevel1_Searchbox_Firstretrivedata;
	}
	@FindBy(xpath = "//li[@id='customerGradingRecommendationsTab_RFFRF00P1']")
	private WebElement Requestforfinancing_Approvelevel1_CustomerGradingRecommendationtab;
	public WebElement requestforfinancingapprovelevel1customerGradingRecommendationsTab_611() {
		return Requestforfinancing_Approvelevel1_CustomerGradingRecommendationtab;
	}
	@FindBy(xpath = "//select[@id='requestDecisionForward_1_RFFRF00P1']")
	private WebElement CustomerGradingRecommendationtab_Decisiondropdown;
	public WebElement customerGradingRecommendationsTabdecisiondropdown_611() {
		return CustomerGradingRecommendationtab_Decisiondropdown;
	}
	@FindBy(xpath = "//select[@id='requestDecisionForwardP1_RFFRF00P1']")
	private WebElement CustomerGradingRecommendationtab_Decisiondropdownforwardto;
	public WebElement customerGradingRecommendationsTabdecisiondropdownforwardto_611() {
		return CustomerGradingRecommendationtab_Decisiondropdownforwardto;
	}
	@FindBy(xpath = "//select[@id='requestP1approvalCommitte_RFFRF00P1']")
	private WebElement CustomerGradingRecommendationtab_Decisiondropdownforwardto_Approvalcommitte;
	public WebElement customerGradingRecommendationsTabdecisiondropdownforwardtoapprovalcommitte_611() {
		return CustomerGradingRecommendationtab_Decisiondropdownforwardto_Approvalcommitte;
	}
	@FindBy(xpath = "//button[@id='requestForFinance_approve_btn_RFFRF00P1']")
	private WebElement CustomerGradingRecommendationtab_Approvebutton;
	public WebElement customerGradingRecommendationsTabapprovebutton_611() {
		return CustomerGradingRecommendationtab_Approvebutton;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Approvebutton_Confirmapproveprocess;
	public WebElement approvebuttonconfirmapproveprocess_611() {
		return Approvebutton_Confirmapproveprocess;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Approvebutton_Confirmapprovebutton_Approvedsuccessfully;
	public WebElement approvebuttonconfirmapprovebuttonapprovedsuccessfully_611() {
		return Approvebutton_Confirmapprovebutton_Approvedsuccessfully;
	}

    @FindBy(xpath = "//td[text()='Facilities Management']")
	private WebElement Requestfinancing_facilityyManagement;
	public WebElement requestfinancingfacilityymanagement_611() {
		return Requestfinancing_facilityyManagement;
	}
	@FindBy(xpath = "//a[@id='RFFT008MT']")
	private WebElement Requestfinancing_facilityyManagement_Maintenance;
	public WebElement requestfinancingfacilityymanagementmaintenance_611() {
		return Requestfinancing_facilityyManagement_Maintenance;
	}
	@FindBy(xpath = "//a[@id='infoBarSearchButton_RFFT008MT']")
	private WebElement facilityyManagement_Maintenance_InfoBarSearchButton;
	public WebElement facilityymanagementmaintenanceinfoBarSearchButton_611() {
		return facilityyManagement_Maintenance_InfoBarSearchButton;
	}
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_RFFT008MT_gs_fmsFacilityVO.FROM_APPLICATION']")
	private WebElement facilityyManagement_Maintenance_InfoBarSearchButton_ApplicationRef;
	public WebElement facilityymanagementmaintenanceinfoBarSearchButtonapplicationref_611() {
		return facilityyManagement_Maintenance_InfoBarSearchButton_ApplicationRef;
	}
	@FindBy(xpath = "(//tr[@id='1'])[5]")
	private WebElement facilityyManagement_Maintenance_InfoBarSearchButton_ApplicationRef_Retrivedata;
	public WebElement facilityymanagementmaintenanceinfoBarSearchButtonapplicationrefretrivedata_611() {
		return facilityyManagement_Maintenance_InfoBarSearchButton_ApplicationRef_Retrivedata;
	}
	@FindBy(xpath = "//*[@id='_selenuimRFFT009']")
	private WebElement RequestFinancing_DrawdownRequest;
	public WebElement requestfinancingdrawdownrequest_611() {
		return RequestFinancing_DrawdownRequest;
	}
	@FindBy(xpath = "//a[@id='RFFT009MT']")
	private WebElement RequestFinancing_DrawdownRequest_Maintenance;
	public WebElement requestfinancingdrawdownrequestmaintenance_611() {
		return RequestFinancing_DrawdownRequest_Maintenance;
	}
	@FindBy(xpath = "//li[@id='drawDownRequestMainInfoTabs_RFFT009MT']")
	private WebElement RequestFinancing_DrawdownRequest_DrawdownMainInformation;
	public WebElement requestfinancingdrawdownrequestdrawdownmaininformation_611() {
		return RequestFinancing_DrawdownRequest_DrawdownMainInformation;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_drawDownRequestFacilityReference_RFFT009MT']")
	private WebElement RequestFinancing_DrawdownRequest_DrawdownMainInformation_FacilityReference;
	public WebElement requestfinancingdrawdownrequestdrawdownmaininformationfacilityreference_611() {
		return RequestFinancing_DrawdownRequest_DrawdownMainInformation_FacilityReference;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_drawDownRequestDrawDownType_RFFT009MT']")
	private WebElement RequestFinancing_DrawdownRequest_DrawdownMainInformation_DrawdownType;
	public WebElement requestfinancingdrawdownrequestdrawdownmaininformationdrawdowntype_611() {
		return RequestFinancing_DrawdownRequest_DrawdownMainInformation_DrawdownType;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestLongNameEnglish_RFFT009MT']")
	private WebElement RequestFinancing_DrawdownRequest_DrawdownMainInformation_DiscriptionEnglish;
	public WebElement requestfinancingdrawdownrequestdrawdownmaininformationdiscriptionenglish_611() {
		return RequestFinancing_DrawdownRequest_DrawdownMainInformation_DiscriptionEnglish;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestLongNameArab_RFFT009MT']")
	private WebElement RequestFinancing_DrawdownRequest_DrawdownMainInformation_DiscriptionArab;
	public WebElement requestfinancingdrawdownrequestdrawdownmaininformationdiscriptionarab_611() {
		return RequestFinancing_DrawdownRequest_DrawdownMainInformation_DiscriptionArab;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestDateSubmitted_RFFT009MT']")
	private WebElement RequestFinancing_DrawdownRequest_DrawdownMainInformation_DateSubmitted;
	public WebElement requestfinancingdrawdownrequestdrawdownmaininformationdatesubmitted_611() {
		return RequestFinancing_DrawdownRequest_DrawdownMainInformation_DateSubmitted;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestValueDate_RFFT009MT']")
	private WebElement RequestFinancing_DrawdownRequest_DrawdownMainInformation_Valuedate;
	public WebElement requestfinancingdrawdownrequestdrawdownmaininformationvaluedate_611() {
		return RequestFinancing_DrawdownRequest_DrawdownMainInformation_Valuedate;
	}
	@FindBy(xpath = "//li[@id='drawDownRequestAdditionDetailsTabs_RFFT009MT']")
	private WebElement RequestFinancing_DrawdownRequest_DrawdownAdditionalDetailsTab;
	public WebElement requestfinancingdrawdownrequestdrawdownadditonaldetailstab_611() {
		return RequestFinancing_DrawdownRequest_DrawdownAdditionalDetailsTab;
	}
	@FindBy(xpath = "//span[@id='spanLookup_drawDownRequestProduct_Class_RFFT009MT']")
	private WebElement RequestFinancing_DrawdownRequest_DrawdownAdditionalDetailsTab_ProductClassLandN;
	public WebElement requestfinancingdrawdownrequestdrawdownadditonaldetailstabproductclassLandN_611() {
		return RequestFinancing_DrawdownRequest_DrawdownAdditionalDetailsTab_ProductClassLandN;
	}
	@FindBy(xpath = "(//tr[@id='1'])[5]")
	private WebElement RequestFinancing_DrawdownRequest_DrawdownAdditionalDetailsTab_ProductClassLandN_Retrivedata;
	public WebElement requestfinancingdrawdownrequestdrawdownadditonaldetailstabproductclassLandNretrivedata_611() {
		return RequestFinancing_DrawdownRequest_DrawdownAdditionalDetailsTab_ProductClassLandN_Retrivedata;
	}
	//288807
	@FindBy(xpath = "//li[@id='customerCreditMemoTab_RFFRF00MT']")
	private WebElement Request_CustomerCreditMemo;
	public WebElement RequestCustomerCreditMemo_611() {
		return Request_CustomerCreditMemo;
	}
	@FindBy(xpath = "//button[@id='requestFinancingBusinessOverview_morecomments_btn_RFFRF00MT']")
	private WebElement Request_Businessoverview_Morecomments;
	public WebElement RequestBusinessoverviewMorecomments_611() {
		return Request_Businessoverview_Morecomments;
	}
	@FindBy(xpath = "//button[@id='requestFinancingIndustry_morecomments_btn_RFFRF00MT']")
	private WebElement Request_Industry_Morecomments;
	public WebElement RequestIndustryMorecomments_611() {
		return Request_Industry_Morecomments;
	}
	@FindBy(xpath = "//button[@id='requestFinancingMarketShare_morecomments_btn_RFFRF00MT']")
	private WebElement Request_MarketShare_Morecomments;
	public WebElement RequestMarketShareMorecomments_611() {
		return Request_MarketShare_Morecomments;
	}
	@FindBy(xpath = "//button[@id='requestFinancingSalesPerformance_morecomments_btn_RFFRF00MT']")
	private WebElement Request_SalesPerformance_Morecomments;
	public WebElement RequestSalesPerformanceMorecomments_611() {
		return Request_SalesPerformance_Morecomments;
	}
	@FindBy(xpath = "//a[@id='RFFRF00P1']")
	private WebElement Request_Approvelevel1;
	public WebElement RequestApprovelevel1_611() {
		return Request_Approvelevel1;
	}
	@FindBy(xpath = "//select[@id='requestFinancingApplicationFor_RFFRF00MT']")
	private WebElement Requestmenu_Reasonforsubmission_NewRequest;
	public WebElement RequestmenuReasonforsubmissionNewRequest_611() {
		return Requestmenu_Reasonforsubmission_NewRequest;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinanacingCif_RFFRF00MT']")
	private WebElement Requestmenu_Customer;
	public WebElement Requestmenu_Customer_611() {
		return Requestmenu_Customer;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingFacilityType_RFFRF00MT']")
	private WebElement Requestmenu_facilitytype;
	public WebElement Requestmenu_facilitytype_611() {
		return Requestmenu_facilitytype;
	}
	@FindBy(xpath = "//input[@id='requestFinancingFacilityTotalvalue_RFFRF00MT']")
	private WebElement Requestmenu_Totallimit;
	public WebElement Requestmenu_Totallimit_611() {
		return Requestmenu_Totallimit;
	}
	@FindBy(xpath = "//li[@id='requestFinancingLimitDtlsTabs_RFFRF00MT']")
	private WebElement Requestmenu_DisbursmentSublimittab;
	public WebElement RequestmenuDisbursmentSublimittab_611() {
		return Requestmenu_DisbursmentSublimittab;
	}
	@FindBy(xpath = "//td[@id='add_RequestFinancingLimitDetailsGridId_RFFRF00MT']/div/span")
	private WebElement Requestmenu_DisbursmentSublimittab_addbtn;
	public WebElement RequestmenuDisbursmentSublimittabaddbtn_611() {
		return Requestmenu_DisbursmentSublimittab_addbtn;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingLimitDetailsGeneralFacilityProductClass_RFFRF00MT']")
	private WebElement Requestmenu_productClassvalue;
	public WebElement RequestmenuproductClassvalue_611() {
		return Requestmenu_productClassvalue;
	}
	@FindBy(xpath = "//button[@id='limitDetails_add_btn_RFFRF00MT']")
	private WebElement Limitdetails_Add_btn;
	public WebElement LimitdetailsAddbtn_611() {
		return Limitdetails_Add_btn;
	}
	@FindBy(xpath = "//label[@id='requestFinancingFormId_RFFRF00MT_save_key']")
	private WebElement Requestmenu_Savebtn;
	public WebElement RequestmenuSavebtn_611() {
		return Requestmenu_Savebtn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Requestmenu_Savebtn_Confirmokbtn;
	public WebElement RequestmenuSavebtnConfirmokbtn_611() {
		return Requestmenu_Savebtn_Confirmokbtn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Requestmenu_Savedsuccessfullyokbtn;
	public WebElement RequestmenuSavedsuccessfullyokbtn_611() {
		return Requestmenu_Savedsuccessfullyokbtn;
	}
	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_RFFRF00P1_gs_fmsRequestFinancingVO.CODE']")
	private WebElement Requestmenu_Approvelevel1_COdevalue;
	public WebElement RequestmenuApprovelevel1COdevalue_611() {
		return Requestmenu_Approvelevel1_COdevalue;
	}
	@FindBy(xpath = "//td[@id='td_requestFinancingGridTbl_Id_RFFRF00P1_1_fmsRequestFinancingVO.CODE']")
	private WebElement Requestmenu_Approvelevel1_COdevalue_Doubletap;
	public WebElement RequestmenuApprovelevel1COdevaluedoubletap_611() {
		return Requestmenu_Approvelevel1_COdevalue_Doubletap;
	}
	@FindBy(xpath = "//li[@id='customerCreditMemoTab_RFFRF00P1']")
	private WebElement RequestMenu_Approvelevel1_Customercreditmemotab;
	public WebElement RequestMenuApprovelevel1Customercreditmemotab_611() {
		return RequestMenu_Approvelevel1_Customercreditmemotab;
	}
	@FindBy(xpath = "//button[@id='requestFinancingBusinessOverview_morecomments_btn_RFFRF00P1']")
	private WebElement RequestMenu_Approvelevel1_Businessoverview_Morecomments;
	public WebElement RequestMenuApprovelevel1Businessoverview_Morecomments_611() {
		return RequestMenu_Approvelevel1_Businessoverview_Morecomments;
	}
	@FindBy(xpath = "//button[@id='requestFinancingIndustry_morecomments_btn_RFFRF00P1']")
	private WebElement RequestMenu_Approvelevel1_Industry_Morecomments;
	public WebElement RequestMenuApprovelevel1IndustryMorecomments_611() {
		return RequestMenu_Approvelevel1_Industry_Morecomments;
	}
	@FindBy(xpath = "//button[@id='requestFinancingMarketShare_morecomments_btn_RFFRF00P1']")
	private WebElement RequestMenu_Approvelevel1_Marketshare_Morecomments;
	public WebElement RequestMenuApprovelevel1MarketshareMorecomments_611() {
		return RequestMenu_Approvelevel1_Marketshare_Morecomments;
	}
	@FindBy(xpath = "//button[@id='requestFinancingSalesPerformance_morecomments_btn_RFFRF00P1']")
	private WebElement RequestMenu_Approvelevel1_SalesPerformance_Morecomments;
	public WebElement RequestMenuApprovelevel1SalesPerformanceMorecomments_611() {
		return RequestMenu_Approvelevel1_SalesPerformance_Morecomments;
	}
	
	//127920
	

	@FindBy(xpath = "//select[@id='requestFinancingApplicationFor_RFFRF00MT']")
	private WebElement request_for_financing_main_reason_for_dropdown;
	public WebElement requestForFinancingMainReasonForDropdown_611() {
		return request_for_financing_main_reason_for_dropdown;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinanacingCif_RFFRF00MT']")
	private WebElement request_for_financing_main_customer_input;
	public WebElement requestForFinancingMainCustomerInput_611() {
		return request_for_financing_main_customer_input;
	}
	
	@FindBy(xpath = "(//input[@id='requestFinancingCifShortNameEng_RFFRF00MT'])[1]")
	private WebElement request_for_financing_short_name_input;
	public WebElement requestForFinancingMainShortNameInput_611() {
		return request_for_financing_short_name_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingFacilityType_RFFRF00MT']")
	private WebElement request_for_financing_main_facility_type_input;
	public WebElement requestForFinancingMainFacilityTypeInput_611() {
		return request_for_financing_main_facility_type_input;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingFacilityCurrency_RFFRF00MT']")
	private WebElement request_for_financing_main_CY_input;
	public WebElement requestForFinancingMainCYInput_611() {
		return request_for_financing_main_CY_input;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingFacilityTotalvalue_RFFRF00MT']")
	private WebElement request_for_financing_main_total_limit_input;
	public WebElement requestForFinancingMainTotalLimitInput_611() {
		return request_for_financing_main_total_limit_input;
	}
	
	@FindBy(xpath = "//li[@id='requestFinancingLimitDtlsTabs_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab;
	public WebElement requestForFinancingMainSublimitTab_611() {
		return request_for_financing_main_sublimit_tab;
	}
	
	@FindBy(xpath = "//td[@id='add_RequestFinancingLimitDetailsGridId_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_add_new_btn;
	public WebElement requestForFinancingMainSublimitTabAddNewBtn_611() {
		return request_for_financing_main_sublimit_tab_add_new_btn;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingLimitDetailsGeneralFacilityProductClass_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_product_class_input;
	public WebElement requestForFinancingMainSublimitTabProductClassInput_611() {
		return request_for_financing_main_sublimit_tab_product_class_input;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsClassDesc_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_product_class_label;
	public WebElement requestForFinancingMainSublimitTabProductClassLabel_611() {
		return request_for_financing_main_sublimit_tab_product_class_label;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingLimitDetailsRfNewMargin_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_margin_input;
	public WebElement requestForFinancingMainSublimitTabAddNewMarginInput_611() {
		return request_for_financing_main_sublimit_tab_margin_input;
	}
	
	@FindBy(xpath = "//button[@id='limitDetails_add_btn_RFFRF00MT']")
	private WebElement request_for_financing_main_sublimit_tab_add_btn;
	public WebElement requestForFinancingMainSublimitTabAddBtn_611() {
		return request_for_financing_main_sublimit_tab_add_btn;
	}
	
	@FindBy(xpath = "//button[@id='requestForFinance_save_as_draft_btn_RFFRF00MT']")
	private WebElement request_for_financing_main_save_btn;
	public WebElement requestForFinancingMainSaveBtn_611() {
		return request_for_financing_main_save_btn;
	}
	
	@FindBy(xpath = "//button[@id='requestForFinance_save_btn_RFFRF00MT']")
	private WebElement request_for_financing_main_validate_btn;
	public WebElement requestForFinancingMainValidateBtn_611() {
		return request_for_financing_main_validate_btn;
	}
	
	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']/div[2]/div")
	private WebElement success_popup_msg;
	public WebElement successPopupMsg_611() {
		return success_popup_msg;
	}	
	
	@FindBy(xpath = "/html/body/div[46]/div")
	private WebElement request_send_alert_popup;
	public WebElement RequestSendAlertPopup_611() {
		return request_send_alert_popup;
	}
	
	@FindBy(xpath = "/html/body/div[46]/div[1]/a/span")
	private WebElement request_send_alert_popup_close;
	public WebElement RequestSendAlertPopupClose_611() {
		return request_send_alert_popup_close;
	}	
	
	@FindBy(xpath = "//a[@id='dismissbut_RFFRF00MT']")
	private WebElement request_send_alert_popup_dismiss_btn;
	public WebElement requestSendAlertPopupDismissBtn_611() {
		return request_send_alert_popup_dismiss_btn;
	}
	
	@FindBy(xpath = "//a[@id='RFFRF00P1']")
	private WebElement request_for_financing_approve_level1;
	public WebElement requestForFinancingApproveLevel1_611() {
		return request_for_financing_approve_level1;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_RFFRF00P1_gs_fmsRequestFinancingVO.CODE']")
	private WebElement request_for_financing_approve_level1_code;
	public WebElement requestForFinancingApproveLevel1Code_611() {
		return request_for_financing_approve_level1_code;
	}
	
	@FindBy(xpath = "//td[@id='td_requestFinancingGridTbl_Id_RFFRF00P1_1_fmsRequestFinancingVO.CODE']")
	private WebElement request_for_financing_approve_level1_first_row;
	public WebElement requestForFinancingApproveLevel1FirstRow_611() {
		return request_for_financing_approve_level1_first_row;
	}
	
	@FindBy(xpath = "//li[@id='customerGradingRecommendationsTab_RFFRF00P1']")
	private WebElement approve_level1_customer_grading_tab;
	public WebElement approveLevel1CustomerGradingTab_611() {
		return approve_level1_customer_grading_tab;
	}
	
	@FindBy(xpath = "//select[@id='requestDecisionForward_1_RFFRF00P1']")
	private WebElement approve_level1_customer_grading_approve_decision;
	public WebElement approveLevel1CustomerGradingApproveDecision_611() {
		return approve_level1_customer_grading_approve_decision;
	}
	
	@FindBy(xpath = "//select[@id='requestDecisionForwardP1_RFFRF00P1']")
	private WebElement approve_level1_customer_grading_approve_forward_to;
	public WebElement approveLevel1CustomerGradingApproveForwardTo_611() {
		return approve_level1_customer_grading_approve_forward_to;
	}
	
	@FindBy(xpath = "//select[@id='requestP1approvalCommitte_RFFRF00P1']")
	private WebElement approve_level1_customer_grading_approve_committee;
	public WebElement approveLevel1CustomerGradingApproveCommittee_611() {
		return approve_level1_customer_grading_approve_committee;
	}
	
	@FindBy(xpath = "//button[@id='requestForFinance_approve_btn_RFFRF00P1']")
	private WebElement request_for_financing_approve_level1_approve_Btn;
	public WebElement requestForFinancingApproveLevel1ApproveBtn_611() {
		return request_for_financing_approve_level1_approve_Btn;
	}	
	
	@FindBy(xpath = "//a[@id='RFFRF00AC']")
	private WebElement request_for_financing_approval_committee_recom;
	public WebElement requestForFinancingApprovalCommitteeRecom_611() {
		return request_for_financing_approval_committee_recom;
	}
	
	@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_RFFRF00AC_gs_fmsRequestFinancingVO.CODE']")
	private WebElement request_for_financing_approval_committee_recom_code;
	public WebElement requestForFinancingApprovalCommitteeRecomCode_611() {
		return request_for_financing_approval_committee_recom_code;
	}
	
	@FindBy(xpath = "//td[@id='td_requestFinancingGridTbl_Id_RFFRF00AC_1_fmsRequestFinancingVO.CODE']")
	private WebElement request_for_financing_approval_committee_recom_row1;
	public WebElement requestForFinancingApprovalCommitteeRecomRow1_611() {
		return request_for_financing_approval_committee_recom_row1;
	}
	
	@FindBy(xpath = "//li[@id='creditCommitteeRecommendationsTab_RFFRF00AC']")
	private WebElement approval_committee_credit_committee_tab;
	public WebElement approvalCommitteeCreditCommitteeTab_611() {
		return approval_committee_credit_committee_tab;
	}
	
	@FindBy(xpath = "//div[@id='requestFinancingCreditReviewRecommandations_RFFRF00AC']/div")
	private WebElement approval_committee_credit_committee_recomm_div;
	public WebElement approvalCommitteeCreditCommitteeRecommDiv_611() {
		return approval_committee_credit_committee_recomm_div;
	}
	
	@FindBy(xpath = "//tr[@id='RequestFinancingRecommendationsGridId_RFFRF00ACghead_0']/td/span")
	private WebElement approval_committee_credit_committee_recomm_plus_icon;
	public WebElement approvalCommitteeCreditCommitteeRecommPlusIcon_611() {
		return approval_committee_credit_committee_recomm_plus_icon;
	}
	
	@FindBy(xpath = "//td[@id='td_RequestFinancingRecommendationsGridId_RFFRF00AC_1_fmsApplRecommendVO.RECOMMENDATION']")
	private WebElement approval_committee_credit_committee_recomm_label;
	public WebElement approvalCommitteeCreditCommitteeRecommLabel_611() {
		return approval_committee_credit_committee_recomm_label;
	}
	
	@FindBy(xpath = "//select[@gridid='RequestFinancingRecommendationsGridId_RFFRF00AC']")
	private WebElement approval_committee_credit_committee_recomm_dropdown;
	public WebElement approvalCommitteeCreditCommitteeRecommDropdown_611() {
		return approval_committee_credit_committee_recomm_dropdown;
	}
	
	@FindBy(xpath = "//button[@id='requestFinancing_recommend_Review_btn_RFFRF00AC']")
	private WebElement approval_committee_recommedation_btn;
	public WebElement approvalCommitteeRecommendationBtn_611() {
		return approval_committee_recommedation_btn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement button_success_ok;
	public WebElement ButtonSuccessOk_611() {
		return button_success_ok;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement button_confirm_ok;
	public WebElement ButtonConfirmOk_611() {
		return button_confirm_ok;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement facility_already_created_popup_ok_btn;
	public WebElement facilityAlreadyCreatedPopupOkBtn_611() {
		return facility_already_created_popup_ok_btn;
	}
	@FindBy(xpath = "//div[text()='Success']")
	private WebElement success_popup;
	public WebElement successPopup_611() {
		return success_popup;
	}
	@FindBy(xpath = "//td[text()='Facilities Management']")
	private WebElement request_facilities_management_feature;
	public WebElement requestFacilitiesManagementFeature_611() {
		return request_facilities_management_feature;
	}
	
	@FindBy(xpath = "//a[@id='RFFT008MT']")
	private WebElement request_facilities_management_maintanane;
	public WebElement requestFacilitiesManagementMaintanance_611() {
		return request_facilities_management_main_cif_limit_btn;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_RFFT008MT']")
	private WebElement request_facilities_management_main_search_btn;
	public WebElement requestFacilitiesManagementMainSearchBtn_611() {
		return request_facilities_management_main_cif_limit_btn;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_RFFT008MT_gs_fmsFacilityVO.CIF']")
	private WebElement request_facilities_management_main_search_CIF_input;
	public WebElement requestFacilitiesManagementMainSearchCIFInput_611() {
		return request_facilities_management_main_cif_limit_btn;
	}
	
	@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_RFFT008MT_1_fmsFacilityVO.CODE']")
	private WebElement request_facilities_management_main_search_row1;
	public WebElement requestFacilitiesManagementMainSearchRow1_611() {
		return request_facilities_management_main_cif_limit_btn;
	}
	
	@FindBy(xpath = "//input[@id='facilityMangementCode_RFFT008MT']")
	private WebElement request_facilities_management_main_code;
	public WebElement requestFacilitiesManagementMainCode_611() {
		return request_facilities_management_main_cif_limit_btn;
	}
	
	@FindBy(xpath = "//button[@id='facilityMgtCifLimitDetails_btn_RFFT008MT']")
	private WebElement request_facilities_management_main_cif_limit_btn;
	public WebElement requestFacilitiesManagementMainCIFLimitBtn_611() {
		return request_facilities_management_main_cif_limit_btn;
	}
	
	@FindBy(xpath = "//td[text()='Draw Down Request']")
	private WebElement Request_Requestforfinancing_Drawdownrequest;
	public WebElement RequestRequestforfinancingDrawdownrequest_611() {
		return Request_Requestforfinancing_Drawdownrequest;
	}
	@FindBy(xpath = "//a[@id='RFFT009MT']")
	private WebElement Request_Requestforfinancing_Drawdownrequest_Maintenance;
	public WebElement RequestRequestforfinancingDrawdownrequestmaintenance_611() {
		return Request_Requestforfinancing_Drawdownrequest_Maintenance;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_drawDownRequestFacilityReference_RFFT009MT']")
	private WebElement Request_Requestforfinancing_Drawdownrequest_FacilityReference;
	public WebElement RequestRequestforfinancingDrawdownrequestfacilityreference_611() {
		return Request_Requestforfinancing_Drawdownrequest_FacilityReference;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_drawDownRequestDrawDownType_RFFT009MT']")
	private WebElement Request_Requestforfinancing_Drawdownrequest_Drawdowntype;
	public WebElement RequestRequestforfinancingDrawdownrequestdrawdowntype_611() {
		return Request_Requestforfinancing_Drawdownrequest_Drawdowntype;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestLongNameEnglish_RFFT009MT']")
	private WebElement Request_Requestforfinancing_Drawdownrequest_Discriptionenglish;
	public WebElement RequestRequestforfinancingDrawdownrequestdiscriptionenglish_611() {
		return Request_Requestforfinancing_Drawdownrequest_Discriptionenglish;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestLongNameArab_RFFT009MT']")
	private WebElement Request_Requestforfinancing_Drawdownrequest_DiscriptionArab;
	public WebElement RequestRequestforfinancingDrawdownrequestdiscriptionarab_611() {
		return Request_Requestforfinancing_Drawdownrequest_DiscriptionArab;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestDateSubmitted_RFFT009MT']")
	private WebElement Request_Requestforfinancing_Drawdownrequest_Datesubmitted;
	public WebElement RequestRequestforfinancingDrawdownrequestdatesubmitted_611() {
		return Request_Requestforfinancing_Drawdownrequest_Datesubmitted;
	}
	@FindBy(xpath = "//input[@id='drawDownRequestValueDate_RFFT009MT']")
	private WebElement Request_Requestforfinancing_Drawdownrequest_Valuedate;
	public WebElement RequestRequestforfinancingDrawdownrequestvaluedate_611() {
		return Request_Requestforfinancing_Drawdownrequest_Valuedate;
	}
	@FindBy(xpath = "//li[@id='drawDownRequestAdditionDetailsTabs_RFFT009MT']")
	private WebElement Request_Requestforfinancing_Drawdownadditionaldetailstab;
	public WebElement RequestRequestforfinancingDrawdownadditionaldetailstab_611() {
		return Request_Requestforfinancing_Drawdownadditionaldetailstab;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_drawDownRequestProduct_Class_RFFT009MT']")
	private WebElement Request_Requestforfinancing_Drawdownadditionaldetailstab_Prductclassvalue;
	public WebElement RequestRequestforfinancingDrawdownadditionaldetailstabPrductclassvalue_611() {
		return Request_Requestforfinancing_Drawdownadditionaldetailstab_Prductclassvalue;
	}


	
}






