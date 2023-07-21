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
	
	//@127920_Fms_Core
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


	

	
}






