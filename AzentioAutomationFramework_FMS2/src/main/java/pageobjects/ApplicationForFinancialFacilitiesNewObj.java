package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationForFinancialFacilitiesNewObj {
	
	
		WebDriver driver;
		public ApplicationForFinancialFacilitiesNewObj(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		// 862019
		@FindBy(xpath = "(//td[text()='WIFAK APPLICATION'])[1]")
		private WebElement wifak_application_first;
		public WebElement wifakApplicationFirst() {
			return wifak_application_first;
		}
		
		@FindBy(xpath = "(//td[text()='WIFAK APPLICATION'])[2]")
		private WebElement wifak_application_second;
		public WebElement wifakApplicationSecond() {
			return wifak_application_second;
		}
		
		@FindBy(xpath = "//td[text()='Application For Financial Facilities']")
		private WebElement wifak_application_child_application_financial_facility;
		public WebElement applicationFinancialFacility() {
			return wifak_application_child_application_financial_facility;
		}
		
		@FindBy(xpath = "//a[@id='WIFT001AP1']")
		private WebElement application_financial_facility_approve1;
		public WebElement applicationFinancialFacilityApproveLevel1() {
			return application_financial_facility_approve1;
		}
		
		@FindBy(xpath = "//input[@name='fmsApplVO.CODE']")
		private WebElement application_financial_facility_search_code;
		public WebElement applicationFinancialFacilitySearchCode() {
			return application_financial_facility_search_code;
		}
		
		@FindBy(xpath = "//td[@tdlabel='Code']")
		private WebElement application_financial_facility_search_result;
		public WebElement applicationFinancialFacilitySearchResult() {
			return application_financial_facility_search_result;
		}
		
		@FindBy(xpath = "//a[@title='History Log']")
		private WebElement application_financial_facility_historylog;
		public WebElement applicationFinancialFacilityHistoryLog() {
			return application_financial_facility_historylog;
		}
		
		// 843959	
		@FindBy(xpath = "//a[@id='WIFT001MT']")
		private WebElement app_financial_facility_main;
		public WebElement appFinancialFacilityMaintanance() {
			return app_financial_facility_main;
		}
		
		@FindBy(xpath = "//select[@id='applicationFacilityApplicationfor_WIFT001MT']")
		private WebElement main_application_for_dropdown;
		public WebElement mainApplicationForDropdown() {
			return main_application_for_dropdown;
		}
		
		@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilitycif_WIFT001MT']")
		private WebElement main_cif_no;
		public WebElement mainCIFNo() {
			return main_cif_no;
		}
		
		// Touch the screen once
		@FindBy(xpath = "//label[@id='applicationfacilityFormId_WIFT001MT_CIF_No_key']")
		private WebElement cif_touch;
		public WebElement cifTouch() {
			return cif_touch;
		}
		
		@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityFacilityType_WIFT001MT']")
		private WebElement main_facility_type;
		public WebElement mainFacilityType() {
			return main_facility_type;
		}
		
		@FindBy(xpath = "//label[@id='applicationfacilityFormId_WIFT001MT_FacilityType_key']")
		private WebElement facility_touch;
		public WebElement facilityTouch() {
			return facility_touch;
		}
		
		@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityCountry_WIFT001MT']")
		private WebElement main_country_of_financing;
		public WebElement mainCountryOfFinancing() {
			return main_country_of_financing;
		}
		
		@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityRating_WIFT001MT']")
		private WebElement main_facility_rating;
		public WebElement mainFacilityRating() {
			return main_facility_rating;
		}
		
		@FindBy(xpath = "//span[text()='Additional Details']")
		private WebElement main_additional_tab;
		public WebElement mainAdditionalTab() {
			return main_additional_tab;
		}
		
		@FindBy(xpath = "//label[@id='applicationfacilityFormId_WIFT001MT_total_value_key']")
		private WebElement main_additional_tab_screen;
		public WebElement mainAdditionalTabScreen() {
			return main_additional_tab_screen;
		}
		
		@FindBy(xpath = "//input[@id='applicationFacilitytotalvalue_WIFT001MT']")
		private WebElement main_additional_tab_total_value;
		public WebElement mainAdditionalTabTotalValue() {
			return main_additional_tab_total_value;
		}
		@FindBy(id="_popup_path_sol_ok")
		private WebElement ServerRequestNotComplete_OKButton;

		public WebElement ServerRequestNotComplete_OKButton() {
			return ServerRequestNotComplete_OKButton;
		}
		
		
		@FindBy(xpath = "//input[@id='applicationFacilityofferexpirydate_WIFT001MT']")
		private WebElement additional_tab_expire_date;
		public WebElement additionalTabExpireDate() {
			return additional_tab_expire_date;
		}
		
		@FindBy(xpath = "//li[@id='applicationFacilityLimitDetailsTabs_WIFT001MT']")
		private WebElement main_limit_details_tab;
		public WebElement mainLimitDetailsTab() {
			return main_limit_details_tab;
		}
		
		@FindBy(xpath = "//td[@id='add_ApplicationFacilityLimitDetailsGrid_WIFT001MT']")
		private WebElement limit_details_tab_add_new_record_btn;
		public WebElement limitDetailsTabAddNewRecordBtn() {
			return limit_details_tab_add_new_record_btn;
		}
		
		@FindBy(xpath="//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
		private WebElement limit_details_new_record_product_class;
		public WebElement limitDetailsNewRecordProductClass() {
			return limit_details_new_record_product_class;
		}
		
		@FindBy(xpath = "//label[@id='applicationfacilityLimitPopupFormId_WIFT001MT_ProductClass_key']")
		private WebElement limit_details_new_record_screen;
		public WebElement limitDetailsNewRecordScreenTouch() {
			return limit_details_new_record_screen;
		}
		
		@FindBy(xpath="//input[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT001MT']")
		private WebElement limit_details_floating_rate;
		public WebElement limitDetailsFloatingRate() {
			return limit_details_floating_rate;
		}
		
		@FindBy(xpath="//input[@id='applicationFacilityLimitTotalYield_WIFT001MT']")
		private WebElement limit_details_yield_details;
		public WebElement limitDetailsYieldDetails() {
			return limit_details_yield_details;
		}
		
		
		// 296063
		@FindBy(xpath = "//span[@id='spanLookup_applicationfacilityLimitDetailsACC_SL_NO_WIFT001MT']")
		private WebElement account_no_search;
		public WebElement accountNoSearch() {
			return account_no_search;
		}
		
		@FindBy(xpath = "(//td[@tdlabel='Branch Code'])[1]")
		private WebElement retrive_account_no;
		public WebElement retriveAccountNo() {
			return retrive_account_no;
		}
		
		@FindBy(xpath = "//button[@id='limitDetails_add_btn_WIFT001MT']")
		private WebElement clicks_add_btn;
		public WebElement clickAddBtn() {
			return clicks_add_btn;
		}
		
		@FindBy(xpath = "//button[@id='applicationfacility_chargesdtls_btn_WIFT001MT']")
		private WebElement limit_details_charges_details_btn;
		public WebElement limitDetailsChargesDetailsBtn() {
			return limit_details_charges_details_btn;
		}
		
		@FindBy(xpath = "//td[@id='add_FacilityChargesGrid_WIFT001MT']")
		private WebElement charges_details_add_new_btn;
		public WebElement chargesDetailsAddNewBtn() {
			return charges_details_add_new_btn;
		}
		
		@FindBy(xpath = "(//td[@tdlabel='Code'])[5")
		private WebElement charges_details_code_label;
		public WebElement chargesDetailsCodeLabel() {
			return charges_details_code_label;
		}
		
		@FindBy(xpath = "//input[@name='lookupTxt_fmsapplchargesVO.CHARGES_CODE']")
		private WebElement charges_details_code;
		public WebElement chargesDetailsCode() {
			return charges_details_code;
		}
		
		@FindBy(xpath = "//input[@id=\"new_1683877339032_fmsapplchargesVO.COLLECT_AT_FAC_APPROVAL\"]")
		private WebElement charges_details_check_fac_approval;
		public WebElement chargesDetailsCheckFacApproval() {
			return charges_details_check_fac_approval;
		}
		
		@FindBy(xpath = "//span[text()='Ok']")
		private WebElement charges_details_Ok_btn;
		public WebElement chargesDetailsOkBtn() {
			return charges_details_Ok_btn;
		}
		
		@FindBy(xpath = "//li[@id='applicationFacilityDocumentDetailsTabs_WIFT001MT']")
		private WebElement main_document_details_tab;
		public WebElement mainDocumentDetailsTab() {
			return main_document_details_tab;
		}
		
		@FindBy(xpath = "//span[@id='spanLookup_applicationFacilitysolicitor_WIFT001AP1']")
		private WebElement document_details_solicitor_search;
		public WebElement documentDetailsSolicitorSearch() {
			return document_details_solicitor_search;
		}	
		
		@FindBy(id="lookuptxt_applicationFacilitysolicitor_WIFT001MT")
		private WebElement document_details_solicitor_name;
		public WebElement documentDetailsSolicitorName() {
			return document_details_solicitor_name;
		}
		
		@FindBy(xpath = "//span[@id='spanLookup_applicationFacilityEstimator_WIFT001AP1']")
		private WebElement document_details_estimator_search;
		public WebElement documentDetailsEstimatorSearch() {
			return document_details_estimator_search;
		}
		
		@FindBy(id="lookuptxt_applicationFacilityEstimator_WIFT001MT")
		private WebElement document_details_estimator_name;
		public WebElement documentDetailsEstimatorName() {
			return document_details_estimator_name;
		}	
		
		@FindBy(xpath = "//button[@id='applicationfacility_save_as_draft_btn_WIFT001MT']")
		private WebElement limit_details_save_btn;
		public WebElement limitDetailsSaveBtn() {
			return limit_details_save_btn;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement button_confirm_ok;
		public WebElement ButtonConfirmOk() {
			return button_confirm_ok;
		}
		
		@FindBy(xpath = "(//input[@value='Ok'])[2]")
		private WebElement button_success_ok;
		public WebElement ButtonSuccessOk() {
			return button_success_ok;
		}
		
		@FindBy(xpath = "//button[@id='applicationfacility_save_btn_WIFT001MT']")
		private WebElement limit_details_validate_btn;
		public WebElement limitDetailsValidateBtn() {
			return limit_details_validate_btn;
		}
		
		@FindBy(xpath = "//a[@id='WIFT001AP2']")
		private WebElement application_financial_facility_approve2;
		public WebElement applicationFinancialFacilityApproveLevel2() {
			return application_financial_facility_approve2;
		}
		
		@FindBy(xpath = "//a[@id='WIFT001AP3']")
		private WebElement application_financial_facility_approve3;
		public WebElement applicationFinancialFacilityApproveLevel3() {
			return application_financial_facility_approve3;
		}
		
		@FindBy(xpath = "(//td[text()='Clear'])[1]")
		private WebElement approve1_clear_btn;
		public WebElement approve1ClearBtn() {
			return approve1_clear_btn;
		}
		
		@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP1_1_fmsApplVO.CODE']")
		private WebElement approve_level1_retrive_data;
		public WebElement approveLevel1RetriveData() {
			return approve_level1_retrive_data;
		}
		
		@FindBy(xpath = "//select[@id='applicationFacilityDecision_1_WIFT001AP1']")
		private WebElement approve_level1_select_devision;
		public WebElement approveLevel1SelectDevision() {
			return approve_level1_select_devision;
		}
		
		@FindBy(xpath = "//button[@id='applicationfacility_approvelevel1_btn_WIFT001AP1']")
		private WebElement approve_level1_submit_btn;
		public WebElement approveLevel1SubmitBtn() {
			return approve_level1_submit_btn;
		}
		
		@FindBy(xpath = "(//td[text()='Clear'])[3]")
		private WebElement approve2_clear_btn;
		public WebElement approve2ClearBtn() {
			return approve2_clear_btn;
		} 
		
		@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP2_1_fmsApplVO.CODE']")
		private WebElement approve_level2_retrive_data;
		public WebElement approveLevel2RetriveData() {
			return approve_level2_retrive_data;
		}
		
		@FindBy(xpath = "//select[@id='applicationFacilityDecision2_WIFT001AP2']")
		private WebElement approve_level2_select_devision;
		public WebElement approveLevel2SelectDevision() {
			return approve_level2_select_devision;
		}
		
		@FindBy(xpath = "//button[@id='applicationfacility_approvelevel2_btn_WIFT001AP2']")
		private WebElement approve_level2_submit_btn;
		public WebElement approveLevel2SubmitBtn() {
			return approve_level2_submit_btn;
		}	
		
		@FindBy(xpath = "(//td[text()='Clear'])[4]")
		private WebElement approve3_clear_btn;
		public WebElement approve3ClearBtn() {
			return approve3_clear_btn;
		}
		
		@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP3_1_fmsApplVO.CODE']")
		private WebElement approve_level3_retrive_data;
		public WebElement approveLevel3RetriveData() {
			return approve_level3_retrive_data;
		}
		
		@FindBy(xpath = "//select[@id='applicationFacilityDecision3_WIFT001AP3']")
		private WebElement approve_level3_select_devision;
		public WebElement approveLevel3SelectDevision() {
			return approve_level3_select_devision;
		}
		
		@FindBy(xpath = "//button[@id='applicationfacility_approvelevel3_btn_WIFT001AP3']")
		private WebElement approve_level3_submit_btn;
		public WebElement approveLevel3SubmitBtn() {
			return approve_level3_submit_btn;
		}	
		
		
//		@294466
		
		@FindBy(xpath = "//tr[@id='1']")
		private WebElement searched_data;
		public WebElement searchedData() {
			return searched_data;
		}
		
		
		@FindBy(xpath = "//td[text()='Clear']")
		private WebElement clear_btn;
		public WebElement clearBtn() {
			return clear_btn;
		}
		
		@FindBy(xpath = "//button[@id='applicationfacility_bmrecommendations_btn_WIFT001AP1']")
		private WebElement additional_details_BM_recommend_btn;
		public WebElement additionalDetailsBMRecommedBtn() {
			return additional_details_BM_recommend_btn;
		}
		
		@FindBy(xpath = "//textarea[@id='applicationFacilityBMRecommendations_WIFT001AP1']")
		private WebElement BM_recommendations_tab;
		public WebElement BMRecommedTab() {
			return BM_recommendations_tab;
		}
		@FindBy(id="lblapplicationFacilityDocdetailsSolictorssectionC_WIFT001MT")
		private WebElement SolicitorEstimatorHeader;
		public WebElement SolicitorEstimatorHeader() {
			return SolicitorEstimatorHeader;
		}
		@FindBy(xpath="//input[@value='Yes ']")
		private WebElement FacilityAlreadyExistPopup;
		public WebElement FacilityAlreadyExistPopup() {
			return FacilityAlreadyExistPopup;
		}
		@FindBy(xpath = "//td[text()='VYSAKH - RETAIL']/ancestor::h3/parent::div/following::div/h3//td[text()='WIFAK APPLICATION']")
		private WebElement fms_WifakApplicationMainMenu;

		public WebElement fmsWifakApplicationMainMenu() {
			return fms_WifakApplicationMainMenu;
		}

		@FindBy(xpath = "//td[text()='VYSAKH - RETAIL']/ancestor::h3/parent::div/following::div/ul/div//a//td[text()='WIFAK APPLICATION']")
		private WebElement fms_WifakApplicationInWifakApplication;

		public WebElement fmsWifakApplicationInWifakApplication() {
			return fms_WifakApplicationInWifakApplication;
		}

		@FindBy(xpath = "//div[@id='_selenuimWIFT001']//td[text()='Application For Financial Facilities']")
		private WebElement fms_ApplicationForFinancialFacilitiesInWifalkApplicationSubMenu;

		public WebElement fmsApplicationForFinancialFacilitiesInWifalkApplicationSubMenu() {
			return fms_ApplicationForFinancialFacilitiesInWifalkApplicationSubMenu;
		}

		@FindBy(id = "WIFT001MT")
		private WebElement fms_MaintenanceInApplicationForFinancialFacilities;

		public WebElement fmsMaintenanceInApplicationForFinancialFacilities() {
			return fms_MaintenanceInApplicationForFinancialFacilities;
		}

		@FindBy(id = "advanced_options_key")
		private WebElement fms_AdvancedOptionsInMaintenanceScreen;

		public WebElement fmsAdvancedOptionsInMaintenanceScreen() {
			return fms_AdvancedOptionsInMaintenanceScreen;
		}

		@FindBy(id = "settings_key")
		private WebElement fms_SettingsInAdvancedOptions;

		public WebElement fmsSettingsInAdvancedOptions() {
			return fms_SettingsInAdvancedOptions;
		}

		@FindBy(id = "config_icon_lookuptxt_applicationFacilityRating_WIFT001MT")
		private WebElement fms_IconInFacilityRatingUnderSettings;

		public WebElement fmsIconInFacilityRatingUnderSettings() {
			return fms_IconInFacilityRatingUnderSettings;
		}

		@FindBy(xpath = "//div[@id='customization_options_div']//span[text()='Maintenance']")
		private WebElement fms_MaintenanceInIcon;

		public WebElement fmsMaintenanceInIcon() {
			return fms_MaintenanceInIcon;
		}

		@FindBy(id = "fldcust_requiredFlag_WIFT001MT")
		private WebElement fms_RequiredFieldInCustomizationDetailsForFacilityRatingPopUpMenu;

		public WebElement fmsRequiredFieldInCustomizationDetailsForFacilityRatingPopUpMenu() {
			return fms_RequiredFieldInCustomizationDetailsForFacilityRatingPopUpMenu;
		}

		@FindBy(xpath = "//option[text()='Required']")
		private WebElement fms_SelectTheRequiredOptionInTheRequiredField;

		public WebElement fmsSelectTheRequiredOptionInTheRequiredField() {
			return fms_SelectTheRequiredOptionInTheRequiredField;
		}

		// ***********************************************
		@FindBy(xpath = "//option[text()='Not Required']")
		private WebElement fms_SelectTheNotRequiredOptioInTheRequiredField;

		public WebElement fmsSelectTheNotRequiredOptioInTheRequiredField() {
			return fms_SelectTheNotRequiredOptioInTheRequiredField;
		}

		// ***********************************************************

		@FindBy(id = "fieldCust_saveBtn")
		private WebElement fms_SaveButtonInPopUpMenu;

		public WebElement fmsSaveButtonInPopUpMenu() {
			return fms_SaveButtonInPopUpMenu;
		}

		@FindBy(id = "_popup_path_sol_ok")
		private WebElement fms_OkButtonInInformationPopUpMenu;

		public WebElement fmsOkButtonInInformationPopUpMenu() {
			return fms_OkButtonInInformationPopUpMenu;
		}

		@FindBy(id = "fieldCust_closeBtn")
		private WebElement fms_CloseButtonInPopUpMenu;

		public WebElement fmsCloseButtonInPopUpMenu() {
			return fms_CloseButtonInPopUpMenu;
		}
		
		
		@FindBy(xpath = "//span[text()='Approve']")
		private WebElement fms_ApproveInIconUnderSettingsScreen;

		public WebElement fmsApproveInIconUnderSettingsScreen() {
			return fms_ApproveInIconUnderSettingsScreen;
		}
		
		@FindBy(id="fieldCust_saveBtn")
		private WebElement fms_ApproveInCustomizationDetailsForFacilityRatingPopUpMenu;

		public WebElement fmsApproveInCustomizationDetailsForFacilityRatingPopUpMenu() {
			return fms_ApproveInCustomizationDetailsForFacilityRatingPopUpMenu;
		}
		
		@FindBy(id="_popup_path_sol_ok")
		private WebElement fms_OkButtonInformationPopUpMenu;

		public WebElement fmsOkButtonInformationPopUpMenu() {
			return fms_OkButtonInformationPopUpMenu;
		}
		
		@FindBy(id="fieldCust_closeBtn")
		private WebElement fms_CloseButtonInCustomizationDetailsForFacilityRatingPopUpMenu;

		public WebElement fmsCloseButtonInCustomizationDetailsForFacilityRatingPopUpMenu() {
			return fms_CloseButtonInCustomizationDetailsForFacilityRatingPopUpMenu;
		}
		
		@FindBy(id="_popup_path_sol_confirm_ok")
		private WebElement fms_OkButtonInWarningPopUpMenu;

		public WebElement fmsOkButtonInWarningPopUpMenu() {
			return fms_OkButtonInWarningPopUpMenu;
		}
		
		@FindBy(xpath="//label[text()='Facility Rating ']")
		private WebElement fms_ValidateTheFacilityRatingFieldisRequired;

		public WebElement fmsValidateTheFacilityRatingFieldisRequired() {
			return fms_ValidateTheFacilityRatingFieldisRequired;
		}
		@FindBy(id="lookuptxt_applicationFacilityMarketedBy_WIFT001MT")
		private WebElement FMS_MarketedByField;

		public WebElement FMS_MarketedByField() {
			return FMS_MarketedByField;
		}


		
		
	}


