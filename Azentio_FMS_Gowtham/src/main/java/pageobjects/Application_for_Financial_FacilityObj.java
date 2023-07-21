package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Application_for_Financial_FacilityObj {
	WebDriver driver;

	public Application_for_Financial_FacilityObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@id='_selenuimCorporate']/h3/table/tbody/tr/td[2]")
	private WebElement Scrollinto_CorporateJk;

	public WebElement getScrollinto_CorporateJk() {
		return Scrollinto_CorporateJk;
	}

	@FindBy(xpath = "//div[@id='_selenuimAPPLICATION']/h3/table/tbody/tr/td[1]/span")
	private WebElement Wifak_Application_first;

	public WebElement getWifak_Application_first() {
		return Wifak_Application_first;
	}

	@FindBy(xpath = "//div[@id='_selenuimWIF']/li/a/table/tbody/tr/td[1]/span/span")
	private WebElement Wifak_Application_second;

	public WebElement getWifak_Application_second() {
		return Wifak_Application_second;
	}

	@FindBy(xpath = "//div[@id='_selenuimWIFT001']/li/a/table/tbody/tr/td[1]/span/span")
	private WebElement Application_for_financial_facilities;

	public WebElement getApplication_for_financial_facilities() {
		return Application_for_financial_facilities;
	}

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement maintenance;

	public WebElement getMaintenance() {
		return maintenance;
	}

	@FindBy(xpath = "//select[@id='applicationFacilityApplicationfor_WIFT001MT']")
	private WebElement Application_for;

	public WebElement getApplication_for() {
		return Application_for;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilitycif_WIFT001MT']")
	private WebElement CIF_no;

	public WebElement getCIF_no() {
		return CIF_no;
	}

	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilitycif_WIFT001MT']/span")
	private WebElement Click_SearchIcon_On_CIF_no;

	public WebElement getClick_SearchIcon_On_CIF_no() {
		return Click_SearchIcon_On_CIF_no;
	}

//	@FindBy(xpath =  "//input[@id='gridtab_applicationFacilityFacilityType_WIFT001MT_gs_CODE']")   
//	private WebElement Enter_codeON_Facility_Type;
//	public WebElement getEnter_codeON_Facility_Type() {
//		return Enter_codeON_Facility_Type;
//	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityFacilityType_WIFT001MT']")
	private WebElement Enter_codeOn_Facility_Type;

	public WebElement getEnter_codeOn_Facility_Type() {
		return Enter_codeOn_Facility_Type;
	}

//	@FindBy(xpath =  "//td[@id='td_gridtab_applicationFacilityFacilityType_WIFT001MT_1_BRIEF_NAME_ENG']") 
//	private WebElement DoubleClick_Select_Facility_Type;
//	public WebElement getDoubleClick_Select_Facility_Type() {
//		return DoubleClick_Select_Facility_Type;
//	}

//	@FindBy(xpath =  "//span[@id='spanLoop_applicationFacilityCountry_WIFT001MT']/span")   
//	private WebElement Select_Country_of_Financing_icon;
//	public WebElement getSelect_Country_of_Financing_icon() {
//		return Select_Country_of_Financing_icon;
//	}
//	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityCountry_WIFT001MT']")
	private WebElement EnterCodeIn_Country_of_Financing;

	public WebElement getEnterCodeIn_Country_of_Financing() {
		return EnterCodeIn_Country_of_Financing;
	}

//	@FindBy(xpath =  "//td[@id='td_gridtab_applicationFacilityCountry_WIFT001MT_1_COUNTRY_CODE']")  
//	private WebElement DoubleClick_Select_Country_of_Financing;
//	public WebElement getDoubleClick_Select_Country_of_Financing() {
//		return DoubleClick_Select_Country_of_Financing;
//	}

//	@FindBy(xpath =  "//span[@id='spanLoop_applicationFacilityRating_WIFT001MT']/span") 
//	private WebElement Select_Facility_Rating_SearchIcon;
//	public WebElement getSelect_Facility_Rating_SearchIcon() {
//		return Select_Facility_Rating_SearchIcon;
//	}
//	
	@FindBy(xpath = "//input[@name='applicationFacilityCO.fmsApplVO.FACILITY_RATING_GRADE']")
	private WebElement Enter_lineCodeOn_Facility_Rating;

	public WebElement getEnter_lineCodeOn_Facility_Rating() {
		return Enter_lineCodeOn_Facility_Rating;
	}

	@FindBy(xpath = "//td[@id='applicationFacilityfacilitytypesection_WIFT001MT']/table")
	private WebElement AfterEnter_lineCodeOn_Facility_Rating_ClickOut;

	public WebElement getAfterEnter_lineCodeOn_Facility_Rating_ClickOut() {
		return AfterEnter_lineCodeOn_Facility_Rating_ClickOut;
	}

//	@FindBy(xpath =  "//td[@id='td_gridtab_applicationFacilityRating_WIFT001MT_1_LINE_NBR']")
//	private WebElement DoubleClick_lineCodeOn_Facility_Rating;
//	public WebElement getDoubleClick_lineCodeOn_Facility_Rating() {
//		return DoubleClick_lineCodeOn_Facility_Rating;
//	}

	@FindBy(xpath = "//span[text()='Additional Details']")
	private WebElement Clickon_additionalDetails;

	public WebElement getClickon_additionalDetails() {
		return Clickon_additionalDetails;
	}

	@FindBy(xpath = "//input[@id='applicationFacilitytotalvalue_WIFT001MT']")
	private WebElement Enter_TotalValue;

	public WebElement getEnter_TotalValue() {
		return Enter_TotalValue;
	}

	@FindBy(xpath = "//td[@id='applicationFacilityLimitDetailssection_WIFT001MT']/table[1]/tbody")
	private WebElement After_Enter_TotalValue_ClickOut;

	public WebElement getAfter_Enter_TotalValue_ClickOut() {
		return After_Enter_TotalValue_ClickOut;
	}

	@FindBy(xpath = "//span[text()='Additional Details']y")
	private WebElement ClickOn_mainTab;

	public WebElement getClickOn_mainTab() {
		return ClickOn_mainTab;
	}

	@FindBy(xpath = "//td[@id='applicationFacilityDateDetailssection_WIFT001MT']/table/tbody/tr[3]/td[2]/div/img")
	private WebElement Click_Offer_Expiration;

	public WebElement getClick_Offer_Expiration() {
		return Click_Offer_Expiration;
	}

	@FindBy(xpath = "//input[@id='applicationFacilityofferexpirydate_WIFT001MT']")
	private WebElement Click_Offer_Expiration_SelectDate;

	public WebElement getClick_Offer_Expiration_SelectDate() {
		return Click_Offer_Expiration_SelectDate;
	}

	@FindBy(xpath = "//li[@id='applicationFacilityLimitDetailsTabs_WIFT001MT']/a/span")
	private WebElement Select_limitDetails;

	public WebElement getSelect_limitDetails() {
		return Select_limitDetails;
	}

	@FindBy(xpath = "//td[@id='add_ApplicationFacilityLimitDetailsGrid_WIFT001MT']/div/span")
	private WebElement Click_AddButtonon_limit_Detail;

	public WebElement getClick_AddButtonon_limit_Detail() {
		return Click_AddButtonon_limit_Detail;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement Enter_ValueOn_Product_Class;

	public WebElement getEnter_ValueOn_Product_Class() {
		return Enter_ValueOn_Product_Class;
	}

	@FindBy(xpath = "//label[@id='applicationfacilityLimitPopupFormId_WIFT001MT_ProductClass_key']")
	private WebElement AfterEnter_ValueOn_Product_Class_Search;

	public WebElement getAfterEnter_ValueOn_Product_Class_Search() {
		return AfterEnter_ValueOn_Product_Class_Search;
	}

	@FindBy(xpath = "//button[@id='limitDetails_add_btn_WIFT001MT']/span[1]")
	private WebElement AfterEnter_ValueOn_Product_Class_Search_Scroll;

	public WebElement getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd() {
		return AfterEnter_ValueOn_Product_Class_Search_Scroll;
	}
	@FindBy(xpath = "//span[@id='spanLookup_applicationfacilityLimitDetailsACC_SL_NO_WIFT001MT']")
	private WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_GLCodeSearch;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_GLCodeSearch() {
		return Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_GLCodeSearch;
	}
	
    @FindBy(xpath = "//input[@id='gridtab_applicationfacilityLimitDetailsACC_SL_NO_WIFT001MT_gs_amfVO.GL_CODE']")
	private WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_GLCode;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_GLCode() {
		return Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_GLCode;
	}
	
	@FindBy(xpath = "//*[@id='td_gridtab_applicationfacilityLimitDetailsACC_SL_NO_WIFT001MT_1_amfVO.BRANCH_CODE']")
	private WebElement SelectFirst_line_in_Account_in_productClass_wifak;
	public WebElement SelectFirst_line_in_Account_in_productClass_wifak_607() {
	 return SelectFirst_line_in_Account_in_productClass_wifak;
	}

	@FindBy(xpath = "//button[@id='limitDetails_add_btn_WIFT001MT']/span[2]")
	private WebElement ClickAdd_Button_AfterEnter_ValueOn_Product_Class;

	public WebElement getClickAdd_Button_AfterEnter_ValueOn_Product_Class() {
		return ClickAdd_Button_AfterEnter_ValueOn_Product_Class;
	}
	@FindBy(xpath = "//label[@id='applicationfacilityFormId_WIFT001MT_Charges_Details_key']")
	private WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetails;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetails() {
		return Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetails;
	}
	
	@FindBy(xpath = "//span[@id='ui-dialog-title-facilitySubLimitChargesDetailsDiv_id_WIFT001MT']")
	private WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetailsWait;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetailsWait() {
		return Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetailsWait;
	}
	
	@FindBy(xpath = "//table[@id='FacilityChargesGrid_WIFT001MT']/tbody/tr/td[@tdlabel='Code']")
	private WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetails_CodeClick;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetails_CodeClick() {
		return Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetails_CodeClick;
	}
	
	@FindBy(xpath = "//table[@id='FacilityChargesGrid_WIFT001MT']/tbody/tr/td[@tdlabel='Collect At Fac. Approval']/input")
	private WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetails_CodeSelect;
	public WebElement Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetails_CodeSelect() {
		return Applicationforfinancialfacilities_Maintenance_LimitDetailsTab_ChargesDetails_CodeSelect;
	}
	
	@FindBy(xpath = "//span[text()='Ok']")
	private WebElement ChargesDetails_Ok;
	public WebElement ChargesDetails_Ok() {
		return ChargesDetails_Ok;
	}

	@FindBy(xpath = "//*[@id='WIFT0061MT']")
	private WebElement Click_finalApproval_under_wifakApplication;
	public WebElement Click_finalApproval_under_wifakApplication_607() {
		return Click_finalApproval_under_wifakApplication;
	}
	
	
	@FindBy(xpath = "//*[@id='applicationFacilityGridTbl_Id_WIFT0061MT_gs_fmsApplVO.CODE']")
	private WebElement searchCode_InfinalApproval_under_wifakApplication;
	public WebElement searchCode_InfinalApproval_under_wifakApplication_607() {
		return searchCode_InfinalApproval_under_wifakApplication;
	}
	
	@FindBy(xpath = "//*[@id='td_applicationFacilityGridTbl_Id_WIFT0061MT_1_fmsApplVO.CODE']")
	private WebElement SelectRecord_InfinalApproval_under_wifakApplication;
	public WebElement SelectRecord_InfinalApproval_under_wifakApplication() {
		return SelectRecord_InfinalApproval_under_wifakApplication;
	}
	
//	@FindBy(xpath = "//*[@id='div__popup_path_sol_ok']/div[2]/div")
//	private WebElement limit_details_validate_success_msg;
//	public WebElement limitDetailsValidateSuccessMsg() {
//		return limit_details_validate_success_msg;
//	}
	
	@FindBy(xpath = "//*[@id=\"_popup_path_sol_ok\"]")
	private WebElement Success_Popup;
	public WebElement Success_Popup() {
		return Success_Popup;
	}
	

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement After_ClickAdd_Button_Class_Warrning_ClickOk;

	public WebElement getAfter_ClickAdd_Button_Class_Warrning_ClickOk() {
		return After_ClickAdd_Button_Class_Warrning_ClickOk;
	}

	@FindBy(xpath = "//input[@id=\"_popup_path_sol_ok\"]")
	private WebElement After_ClickAdd_Button_Class_select_rowWarrning_ClickOk;

	public WebElement getAfter_ClickAdd_Button_Class_select_rowWarrning_ClickOk() {
		return After_ClickAdd_Button_Class_select_rowWarrning_ClickOk;
	}

	@FindBy(xpath = "//button[@id='applicationfacility_FixedAssets_btn_WIFT001MT']")
	private WebElement Click_FixedAssert_Button;

	public WebElement getClick_FixedAssert_Button() {
		return Click_FixedAssert_Button;
	}

	@FindBy(xpath = "//td[@id='add_FmsIjaraFixedAssetsGrid_WIFT001MT']/div/span")
	private WebElement Click_AddButton_OnFixedAssert_screen;

	public WebElement getClick_AddButton_OnFixedAssert_screen() {
		return Click_AddButton_OnFixedAssert_screen;
	}

	@FindBy(xpath = "//td[@id='td_FmsIjaraFixedAssetsGrid_WIFT001MT_1_fmsFacilityAssetVO.CATEGORY_CODE']")
	private WebElement clickEnter_value_on_Catagory;

	public WebElement clickEnter_value_on_Catagory() {
		return clickEnter_value_on_Catagory;
	}

	@FindBy(xpath = "//table[@name='fmsFacilityAssetVO.CATEGORY_CODE']//input")
	private WebElement Enter_value_on_Catagory;

	public WebElement getEnter_value_on_Catagory() {
		return Enter_value_on_Catagory;
	}

	@FindBy(xpath = "//table[@name='fmsFacilityAssetVO.CATEGORY_CODE']//span")
	private WebElement AfterEnter_value_on_Catagory_Search;

	public WebElement AfterEnter_value_on_Catagory_Search() {
		return AfterEnter_value_on_Catagory_Search;
	}

	@FindBy(xpath = "//table[@name='fmsFacilityAssetVO.CLASS_CODE']//input")
	private WebElement Enter_value_on_Class;

	public WebElement getEnter_value_on_Class() {
		return Enter_value_on_Class;
	}

	@FindBy(xpath = "//table[@name='fmsFacilityAssetVO.CLASS_CODE']//span")
	private WebElement AfterEnter_value_on_Class_Search;

	public WebElement AfterEnter_value_on_Class_Search() {
		return AfterEnter_value_on_Class_Search;
	}

	@FindBy(xpath = "//table[@name='fmsFacilityAssetVO.SL_NO']//input")
	private WebElement Enter_value_on_Sl;

	public WebElement Enter_value_on_Sl() {
		return Enter_value_on_Sl;
	}

	@FindBy(xpath = "//table[@name='fmsFacilityAssetVO.CIF_NO']//input")
	private WebElement Enter_value_on_vendor;

	public WebElement getEnter_value_on_vendor() {
		return Enter_value_on_vendor;
	}

	@FindBy(xpath = "//table[@name='fmsFacilityAssetVO.CIF_NO']//span")
	private WebElement AfterEnter_value_on_vendor_search;

	public WebElement AfterEnter_value_on_vendor_search() {
		return AfterEnter_value_on_vendor_search;
	}

	@FindBy(xpath = "//td[@id='td_FmsIjaraFixedAssetsGrid_WIFT001MT_1_fmsFacilityAssetVO.QUANTITY']//input")
	private WebElement Enter_value_on_quantity;

	public WebElement getEnter_value_on_quantity() {
		return Enter_value_on_quantity;
	}

	@FindBy(xpath = "//td[@id='td_FmsIjaraFixedAssetsGrid_WIFT001MT_1_fmsFacilityAssetVO.UNIT']//input")
	private WebElement Enter_value_on_Unit;

	public WebElement getEnter_value_on_Unit() {
		return Enter_value_on_Unit;
	}

	@FindBy(xpath = "//table[@name='fmsFacilityAssetVO.CURRENCY']//input")
	private WebElement Enter_value_on_Cy;

	public WebElement getEnter_value_on_Cy() {
		return Enter_value_on_Cy;
	}

	@FindBy(xpath = "//table[@name='fmsFacilityAssetVO.CURRENCY']//span/span")
	private WebElement AfterEnter_value_on_Cy_Search;

	public WebElement AfterEnter_value_on_Cy_Search() {
		return AfterEnter_value_on_Cy_Search;
	}

	@FindBy(xpath = "//td[@id='td_FmsIjaraFixedAssetsGrid_WIFT001MT_1_fmsFacilityAssetVO.UNIT_COST']//input")
	private WebElement Enter_value_on_UnitCost;

	public WebElement getEnter_value_on_UnitCost() {
		return Enter_value_on_UnitCost;
	}

	@FindBy(xpath = "//span[text()='OK']")
	private WebElement Click_OkButton_OnFixedAssertKey_Screen;

	public WebElement getClick_OkButton_OnFixedAssertKey_Screen() {
		return Click_OkButton_OnFixedAssertKey_Screen;
	}

	@FindBy(xpath = "//*[@id=\"_popup_path_sol_confirm_ok\"]")
	private WebElement Click_OkButton_Warrning_Screen_ForLessAmmount;

	public WebElement Click_OkButton_Warrning_Screen_ForLessAmmount() {
		return Click_OkButton_Warrning_Screen_ForLessAmmount;
	}

	@FindBy(xpath = "//Button[@id='applicationfacility_save_as_draft_btn_WIFT001MT']")
	private WebElement Click_SaveButton_OnLimitDetails_Tab;

	public WebElement getClick_SaveButton_OnLimitDetails_Tab() {
		return Click_SaveButton_OnLimitDetails_Tab;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement ClickOk_saveOn_Draft_WarrningScreen;

	public WebElement getClickOk_saveOn_Draft_WarrningScreen() {
		return ClickOk_saveOn_Draft_WarrningScreen;
	}

	@FindBy(xpath = "//div[text()='Success']")
	private WebElement SuccessScreen_Validate;

	public WebElement SuccessScreen_Validate() {
		return SuccessScreen_Validate;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement ClickOk_OnSuccess_Screen;

	public WebElement getClickOk_OnSuccess_Screen() {
		return ClickOk_OnSuccess_Screen;
	}

	// *********TestCase no - 917005
	
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement FmsParametersMenu;
	public WebElement Fms_ParametersMenu() {
		return FmsParametersMenu;
	}

	@FindBy(xpath = "//span[text()='Main Information']")
	private WebElement goto_MainInformation_Tab;

	public WebElement goto_MainInformation_Tab() {
		return goto_MainInformation_Tab;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilitycreditrating_WIFT001MT']")
	private WebElement ClickOn_CreditRating;

	public WebElement ClickOn_CreditRating() {
		return ClickOn_CreditRating;
	}

	@FindBy(xpath = "//button[@id='applicationfacility_documentchecklist_btn_WIFT001MT']")
	private WebElement ClickOn_Document_Checklist;

	public WebElement ClickOn_Document_Checklist() {
		return ClickOn_Document_Checklist;
	}

	@FindBy(xpath = "//td[@id='td_FacilityDocumentCheckListGrid_WIFT001MT_0_rn']")
	private WebElement Click_forSelect_row_on_Document_Checklist;

	public WebElement Click_forSelect_row_on_Document_Checklist() {
		return Click_forSelect_row_on_Document_Checklist;
	}

	@FindBy(xpath = "//input[@id='documentFile_WIFT001MT']")
	private WebElement In_Document_Checklist_Click_Choose_File;

	public WebElement In_Document_Checklist_Click_Choose_File() {
		return In_Document_Checklist_Click_Choose_File;
	}

	@FindBy(xpath = "//a[@id='document_UploadBtn_WIFT001MT']//span[2]")
	private WebElement In_Document_Checklist_Click_UploadDocs;

	public WebElement In_Document_Checklist_Click_UploadDocs() {
		return In_Document_Checklist_Click_UploadDocs;
	}

	@FindBy(xpath = "//div[text()='Success']")
	private WebElement Click_ok_Sucess_screen_after_docUpload;

	public WebElement Click_ok_Sucess_screen_after_docUpload() {
		return Click_ok_Sucess_screen_after_docUpload;
	}

	// ****127787
	@FindBy(xpath = "//td[text()='Facility Type']")
	private WebElement ParametersFacilityType;

	public WebElement Parameters_FacilityType() {
		return ParametersFacilityType;
	}

	@FindBy(id = "P008UP")
	private WebElement FacilityType_UpdateAfterApprove;

	public WebElement FacilityType_UpdateAfterApprove() {
		return FacilityType_UpdateAfterApprove;
	}

	@FindBy(id = "fmsFacilityTypeListGridTbl_Id_P008UP_gs_CODE")
	private WebElement FacilityTypeUpdateAfterApproveCode;

	public WebElement FacilityType_UpdateAfterApprove_Code() {
		return FacilityTypeUpdateAfterApproveCode;
	}

	@FindBy(xpath = "//td[@id='td_fmsFacilityTypeListGridTbl_Id_P008UP_2_CODE' and text()='221']")
	private WebElement FacilityTypeUpdateAfterApproveSelectCode;

	public WebElement FacilityType_UpdateAfterApprove_SelectCode() {
		return FacilityTypeUpdateAfterApproveSelectCode;
	}

	@FindBy(xpath = "//li[@id='fmsFacilityTypeDetailsTab_P008UP']/a/span[text()='Facility Details']")
	private WebElement FacilityTypeUpdateAfterApproveFacilityDetails;

	public WebElement FacilityType_UpdateAfterApprove_FacilityDetails() {
		return FacilityTypeUpdateAfterApproveFacilityDetails;
	}

	@FindBy(xpath = "//span[text()='Application Requirements And Details']")
	private WebElement FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetails;

	public WebElement FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails() {
		return FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetails;
	}

	@FindBy(id = "fmsFacilityType_apply_corp_pkg_P008UP")
	private WebElement FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetailsApplyCorporatePackage;

	public WebElement FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_ApplyCorporatePackage() {
		return FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetailsApplyCorporatePackage;
	}

	@FindBy(id = "fmsFacilityType_corp_pkg_allow_edit_at_app_P008UP")
	private WebElement FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetailsAllowtoEditApplication;

	public WebElement FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoEditApplication() {
		return FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetailsAllowtoEditApplication;
	}

	@FindBy(id = "fmsFacilityType_corp_pkg_allow_edit_rate_csm_P008UP")
	private WebElement FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetailsAllowtoeditCorporatePackageRate;

	public WebElement FacilityType_UpdateAfterApprove_FacilityDetails_ApplicationRequirementsandDetails_AllowtoeditCorporatePackageRate() {
		return FacilityTypeUpdateAfterApproveFacilityDetailsApplicationRequirementsandDetailsAllowtoeditCorporatePackageRate;
	}

	@FindBy(xpath = "//label[text()='Update ']")
	private WebElement ScrolltoUpdate;

	public WebElement ScrolltoUpdate() {
		return ScrolltoUpdate;
	}
	
	//***299886
	
	@FindBy(xpath = "//input[@id='applicationFacilitydownpayment_WIFT001MT']")
	private WebElement enter_valueOn_downPayment_inAdditionalDetails;

	public WebElement enter_valueOn_downPayment_inAdditionalDetails() {
		return enter_valueOn_downPayment_inAdditionalDetails;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilitydownpaymentperc_WIFT001MT']")
	private WebElement checkValue_visibleOn_downPayment_inAdditionalDetails;

	public WebElement checkValue_visibleOn_downPayment_inAdditionalDetails() {
		return checkValue_visibleOn_downPayment_inAdditionalDetails;
	}
	
	@FindBy(xpath = "//div[text()='Down Payment']")
	private WebElement down_payment_popup;

	public WebElement down_payment_popup() {
		return down_payment_popup;
	}
	@FindBy(xpath = "//a[@id='WIFAK APPLICATION / WIFAK APPLICATION / Application For Financial Facilities / Maintenance']")
	private WebElement clickOut_after_enterValueOn_down_payment;

	public WebElement clickOut_after_enterValueOn_down_payment() {
		return clickOut_after_enterValueOn_down_payment;
	}
	
	
	
	
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement Fms_ParametersMenu;
	public WebElement Fms_ParametersMenu1() {
		return Fms_ParametersMenu;
	}
	
	@FindBy(xpath = "//td[text()='Facility Type']")
	private WebElement FacilityTypeSubmenu;
	public WebElement FacilityType_Submenu() {
		return FacilityTypeSubmenu;
	}
	
	/*
	 * @FindBy(id = "P008UP") private WebElement FacilityTypeUpdateafterapprove;
	 * public WebElement FacilityType_Updateafterapprove() { return
	 * FacilityTypeUpdateafterapprove; }
	 */
	
	@FindBy(id =  "fmsFacilityTypeListGridTbl_Id_P008UP_gs_CODE")
	private WebElement FacilityTypeCode;
	public WebElement FacilityType_Code() {
		return FacilityTypeCode;
	}
	
	@FindBy(id =  "td_fmsFacilityTypeListGridTbl_Id_P008UP_1_CODE and")
	private WebElement FacilityTypeSelectCode;
	public WebElement FacilityType_SelectCode() {
		return FacilityTypeSelectCode;
	}
	
	@FindBy(xpath = "//span[text()='Facility Details']//ancestor::li[@id='fmsFacilityTypeDetailsTab_P008UP']")
	private WebElement FacilityTypeFacilitydetails;
	public WebElement FacilityType_Facilitydetails() {
		return FacilityTypeFacilitydetails;
	}
	
	@FindBy(xpath = "//span[text()='STP Facility Requirements']")
	private WebElement FacilityTypeFacilitydetailsSTPFacilityRequirements;
	public WebElement FacilityType_Facilitydetails_STPFacilityRequirements() {
		return FacilityTypeFacilitydetailsSTPFacilityRequirements;
	}
	
	@FindBy(xpath = "//span[text()='STP Facility Requirements']")
	private WebElement DoubleClick_aftersearchCode_Onupdateafterapprove_on_params;
	public WebElement DoubleClick_aftersearchCode_Onupdateafterapprove_on_params() {
		return DoubleClick_aftersearchCode_Onupdateafterapprove_on_params;
	}
	
	@FindBy(xpath = "//span[text()='STP Facility Requirements']")
	private WebElement Click_STP_Facility_Requirements_under_facilityDetails;
	public WebElement Click_STP_Facility_Requirements_under_facilityDetails() {
		return Click_STP_Facility_Requirements_under_facilityDetails;
	}
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsFACILITY_VALUE_WIFT001MT']")
	private WebElement Add_facilityValue_OnLimitDetails;
	public WebElement Add_facilityValue_OnLimitDetails() {
		return Add_facilityValue_OnLimitDetails;
	}
	
	@FindBy(xpath = "//span[contains(text(),' Save ')]")
	private WebElement Click_saveButtonOn_Limitdetails;
	public WebElement Click_saveButtonOn_Limitdetails() {
		return Click_saveButtonOn_Limitdetails;
	}
	
	@FindBy(xpath = "//span[contains(text(),' Validate ')]")
	private WebElement Click_ValidateButtonOn_Limitdetails;
	public WebElement Click_ValidateButtonOn_Limitdetails() {
		return Click_ValidateButtonOn_Limitdetails;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Document Details')]")
	private WebElement Click_Document_details;
	public WebElement Click_Document_details() {
		return Click_Document_details;
	}
	
	@FindBy(xpath = "//span[contains(text(),' Save ')]")
	private WebElement Scroll_downTo_SaveValiate_button_ONDocomentDetails;
	public WebElement Scroll_downTo_SaveValiate_button_ONDocomentDetails() {
		return Scroll_downTo_SaveValiate_button_ONDocomentDetails;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilitysolicitor_WIFT001MT']")
	private WebElement Entervalue_On_Solicitor_Name_InDocomentDetails;
	public WebElement Entervalue_On_Solicitor_Name_InDocomentDetails() {
		return Entervalue_On_Solicitor_Name_InDocomentDetails;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilitysolicitor_WIFT001MT']")
	private WebElement ClickSearchAfter_Entervalue_On_Solicitor_Name_InDocomentDetails;
	public WebElement ClickSearchAfter_Entervalue_On_Solicitor_Name_InDocomentDetails() {
		return ClickSearchAfter_Entervalue_On_Solicitor_Name_InDocomentDetails;
	}
	
	
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityEstimator_WIFT001MT']")
	private WebElement Entervalue_On_Estimator_Name_InDocomentDetails;
	public WebElement Entervalue_On_Estimator_Name_InDocomentDetails() {
		return Entervalue_On_Estimator_Name_InDocomentDetails;
	}
	
	@FindBy(xpath = "//span[@id='spanLookup_applicationFacilityEstimator_WIFT001MT']")
	private WebElement ClickSearchAfter_Entervalue_On_Estimator_Name_InDocomentDetails;
	public WebElement ClickSearchAfter_Entervalue_On_Estimator_Name_InDocomentDetails() {
		return ClickSearchAfter_Entervalue_On_Estimator_Name_InDocomentDetails;
	}
	
	
	@FindBy(xpath = "//span[contains(text(),' Validate ')]")
	private WebElement Click_validate_button_on_docomentDetails;
	public WebElement Click_validate_button_on_docomentDetails() {
		return Click_validate_button_on_docomentDetails;
	}
	
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Click_ok_saveOn_draft;
	public WebElement Click_ok_saveOn_draft() {
		return Click_ok_saveOn_draft;
	}
	
	

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement Click_ok_onScuccessWarnning_for_applicationFacility;
	public WebElement Click_ok_onScuccessWarnning_for_applicationFacility() {
		return Click_ok_onScuccessWarnning_for_applicationFacility;
	}
	
	
	//*[@id="_popup_path_sol_ok"]
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement ServerLoding_pop;
	public WebElement ServerLoding_pop() {
		return ServerLoding_pop;
	}
	
	//clp
	@FindBy(xpath = "//li[@id='applicationFacilityDocumentDetailsTabs_WIFT001MT']")
	private WebElement main_document_details_tab;
	public WebElement mainDocumentDetailsTab() {
		return main_document_details_tab;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilitysolicitor_WIFT001MT']")
	private WebElement document_details_solicitor_name;
	public WebElement documentDetailsSolicitorName() {
		return document_details_solicitor_name;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityEstimator_WIFT001MT']")
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
	
	@FindBy(xpath = "//*[@id='_popup_path_sol_ok']")
	private WebElement button_success_ok;
	public WebElement ButtonSuccessOk() {
		return button_success_ok;
	}

	@FindBy(xpath = "//div[text()='CONFIRM']")
	private WebElement confirm_popup;
	public WebElement confirmPopup_610() {
		return confirm_popup;
	}
	
	@FindBy(xpath = "//a[@id='dismissbut_WIFT001MT']/span")
	private WebElement sendAlertPopup;
	public WebElement sendAlertPopup_610() {
		return sendAlertPopup;
	}
	
	@FindBy(xpath = "//*[@id='dismissbut_WIFT001AP3']")
	private WebElement sendAlertPopupIn_ApproveLev3Under_wifak;
	public WebElement sendAlertPopupIn_ApproveLev3Under_wifak_607() {
		return sendAlertPopupIn_ApproveLev3Under_wifak;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement facilityAlreadyCreatedPopup_610;
	public WebElement facilityAlreadyCreatedPopup_610() {
		return facilityAlreadyCreatedPopup_610;
	}
	
	

	
	@FindBy(xpath = "//button[@id='applicationfacility_save_btn_WIFT001MT']")
	private WebElement limit_details_validate_btn;
	public WebElement limitDetailsValidateBtn() {
		return limit_details_validate_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement facility_already_created_popup;
	public WebElement facilityAlreadyCreatedPopup() {
		return facility_already_created_popup;
	}
	
	@FindBy(xpath = "//*[@id=\"div__popup_path_sol_ok\"]/div[2]/div")
	private WebElement limit_details_validate_success_msg;
	public WebElement limitDetailsValidateSuccessMsg() {
		return limit_details_validate_success_msg;
	}
	
	@FindBy(xpath = "//a[@id='WIFT001AP1']")
	private WebElement application_financial_facility_approve1;
	public WebElement applicationFinancialFacilityApproveLevel1() {
		return application_financial_facility_approve1;
	}
	
	@FindBy(xpath = "//*[@id=\"applicationFacilityGridTbl_Id_WIFT001AP1_pager_left\"]/table/tbody/tr/td[7]")
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
	
	@FindBy(xpath = "//a[@id='WIFT001AP2']")
	private WebElement application_financial_facility_approve2;
	public WebElement applicationFinancialFacilityApproveLevel2() {
		return application_financial_facility_approve2;
	}
	
	@FindBy(xpath = "//*[@id=\"applicationFacilityGridTbl_Id_WIFT001AP2_pager_left\"]/table/tbody/tr/td[7]")
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
	
	@FindBy(xpath = "//a[@id='WIFT001AP3']")
	private WebElement application_financial_facility_approve3;
	public WebElement applicationFinancialFacilityApproveLevel3() {
		return application_financial_facility_approve3;
	}
	
	@FindBy(xpath = "//*[@id=\"applicationFacilityGridTbl_Id_WIFT001AP3_pager_left\"]/table/tbody/tr/td[7]")
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
	
	@FindBy(xpath = "//*[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT001MT']")
	private WebElement EnterFloatingRate_In_LimitDetails_mainteance_under_wifak;
	public WebElement EnterFloatingRate_In_LimitDetails_mainteance_under_wifak_607() {
		return EnterFloatingRate_In_LimitDetails_mainteance_under_wifak;
	}
	
	@FindBy(xpath = "//*[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_NBR_WIFT001MT']")
	private WebElement EnterFloating_Rate_Periodicity_In_LimitDetails_mainteance_under_wifak;
	public WebElement EnterFloating_Rate_Periodicity_In_LimitDetails_mainteance_under_wifak_607() {
		return EnterFloating_Rate_Periodicity_In_LimitDetails_mainteance_under_wifak;
	}
	
	@FindBy(xpath = "//*[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_TYPE_WIFT001MT']")
	private WebElement EnterFloating_Rate_Periodicity_Type_In_LimitDetails_mainteance_under_wifak;
	public WebElement EnterFloating_Rate_Periodicity_Type_In_LimitDetails_mainteance_under_wifak_607() {
		return EnterFloating_Rate_Periodicity_Type_In_LimitDetails_mainteance_under_wifak;
	}
	
	@FindBy(xpath = "//*[@id='WIFT005MT']")
	private WebElement IssueFacilityOffer_under_WifakApplication;
	public WebElement IssueFacilityOffer_under_WifakApplication_607() {
		return IssueFacilityOffer_under_WifakApplication;
	}
	
	@FindBy(xpath = "//*[@id='applicationFacilityGridTbl_Id_WIFT005MT_gs_fmsApplVO.CODE']")
	private WebElement SearchRecordIn_IssueFacilityOffer_under_WifakApplication;
	public WebElement SearchRecordIn_IssueFacilityOffer_under_WifakApplication_607() {
		return SearchRecordIn_IssueFacilityOffer_under_WifakApplication;
	}
	
	@FindBy(xpath = "//*[@id='td_applicationFacilityGridTbl_Id_WIFT005MT_1_fmsApplVO.CODE']")
	private WebElement selectRecordIn_IssueFacilityOffer_under_WifakApplication;
	public WebElement selectRecordIn_IssueFacilityOffer_under_WifakApplication_607() {
		return selectRecordIn_IssueFacilityOffer_under_WifakApplication;
	}
	
	@FindBy(xpath = "//*[@id='applicationFacilityLimitDetailsTabs_WIFT005MT']")
	private WebElement limitDetailsIn_IssueFacilityOffer_under_WifakApplication;
	public WebElement limitDetailsIn_IssueFacilityOffer_under_WifakApplication_607() {
		return limitDetailsIn_IssueFacilityOffer_under_WifakApplication;
	}
	
	@FindBy(xpath = "//*[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT005MT_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement SelectproductClass_InlimitDetailsIn_IssueFacilityOffer_under_WifakApplication;
	public WebElement SelectproductClass_InlimitDetailsIn_IssueFacilityOffer_under_WifakApplication_607() {
		return SelectproductClass_InlimitDetailsIn_IssueFacilityOffer_under_WifakApplication;
	}
	
	@FindBy(xpath = "//*[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT005MT']")
	private WebElement CheckFloatingRate_InlimitDetailsIn_IssueFacilityOffer_under_WifakApplication;
	public WebElement CheckFloatingRate_InlimitDetailsIn_IssueFacilityOffer_under_WifakApplication_607() {
		return CheckFloatingRate_InlimitDetailsIn_IssueFacilityOffer_under_WifakApplication;
	}
	
	
	
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityExistingFacilityRef_WIFT001MT']")
	private WebElement Existing_Facility_Ref_near_Application_for;
	public WebElement Existing_Facility_Ref_near_Application_for() {
		return Existing_Facility_Ref_near_Application_for;
	}	
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsCLEAN_FLAG_WIFT001MT']")
    private WebElement limit_details_new_record_clean_flag;
    public WebElement limitDetailsNewRecordCleanFlag() {
        return limit_details_new_record_clean_flag;
    }
    
    @FindBy(xpath = "//*[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT001MT']")
	private WebElement Floating_rate_Searchbox;
	public WebElement floatingRateSearchbox() {
		return Floating_rate_Searchbox;
	}
	
	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_NBR_WIFT001MT']")
	private WebElement Floatingrate_Periodicity_Searchbox;
	public WebElement floatingrateperiodicitysearchbox() {
		return Floatingrate_Periodicity_Searchbox;
	}
	@FindBy(xpath ="//select[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_TYPE_WIFT001MT']")
	private WebElement Floatingrate_PeriodicityType_Searchbox;
	public WebElement floatingrateperiodicitytypesearchbox() {
		return Floatingrate_PeriodicityType_Searchbox;
	}
	
	
	
	//@636898
	@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityExistingFacilityRef_WIFT001MT']")
	private WebElement main_existing_facility_ref;
	public WebElement mainExistingFacilityRef() {
		return main_existing_facility_ref;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityfinancedamount_WIFT001MT']")
	private WebElement additional_tab_finance_amount;
	public WebElement additionalTabFinanceAmount() {
		return additional_tab_finance_amount;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityApplicationfor_WIFT001MT']")
	private WebElement select_decrease_inApplicationFor;
	public WebElement select_decrease_inApplicationFor() {
		return select_decrease_inApplicationFor;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilitytotalvalue_WIFT001MT']")
    private WebElement main_additional_tab_total_value;
    public WebElement mainAdditionalTabTotalValue() {
        return main_additional_tab_total_value;
    }
	
	@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001MT_1_fmsAppLimitDetVO.FACILITY_VALUE']")
	private WebElement limit_details_product_facility_value;
	public WebElement limitDetailsProductFacilityValue() {
		return limit_details_product_facility_value;
	}
	
	@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001MT_1_fmsAppLimitDetVO.CV_VALUE']")
	private WebElement limit_details_product_CV_value;
	public WebElement limitDetailsProductCVValue() {
		return limit_details_product_CV_value;
	}
	
	@FindBy(xpath = "//button[@id='limitDetails_edit_btn_WIFT001MT']")
	private WebElement limit_details_product_edit_btn;
	public WebElement limitDetailsProductEditBtn() {
		return limit_details_product_edit_btn;
	}
	
	
	@FindBy(xpath = "//input[@id='applicationFacilitytotalvalue_WIFT001MT']")
	private WebElement TotalValue_in_additionalDetails;
	public WebElement TotalValue_in_additionalDetails() {
		return TotalValue_in_additionalDetails;
	}
	

	@FindBy(xpath = "//input[@id='applicationFacilitydownpaymentperc_WIFT001MT']")
	private WebElement DownPayment_precent;
	public WebElement DownPayment_precent() {
		return DownPayment_precent;
	}
	
	
	@FindBy(xpath = "//button[@id='applicationfacility_save_as_draft_btn_WIFT001MT']")
	private WebElement Click_SaveButton_AfterEdit_downPayment;
	public WebElement Click_SaveButton_AfterEdit_downPayment() {
		return Click_SaveButton_AfterEdit_downPayment;
	}
	
	
	@FindBy(xpath = "//*[@id='applicationFacilitydownpaymentperc_WIFT001MT']")
	private WebElement Enter_downPayment;
	public WebElement Enter_downPayment() {
		return Enter_downPayment;
	}
	
	
	@FindBy(xpath = "//*[@id='applicationFacilitytotalvalue_WIFT001MT']")
	private WebElement Enter_total_value_on_additionalDetails;
	public WebElement Enter_total_value_on_additionalDetails() {
		return Enter_total_value_on_additionalDetails;
	}
	
	//@539219
	
		@FindBy(xpath = "//span[text()='Approval Committee Recommendations ']")
		private WebElement Click_Approval_Committee_Recommendations;
		public WebElement Click_Approval_Committee_Recommendations() {
			return Click_Approval_Committee_Recommendations;
		}
		
		@FindBy(xpath = "//td[@id='applicationFacilityGridTbl_Id_WIFT002MT_pager_left']/table/tbody/tr/td[7]")
		private WebElement Click_ClearSearch_InApproval_Committee_Recommendations;
		public WebElement Click_ClearSearch_InApproval_Committee_Recommendations() {
			return Click_ClearSearch_InApproval_Committee_Recommendations;
		}
		
		@FindBy(xpath="//a[@id='dismissbut_CSMRF00MT']/span")
	    private WebElement SendAlert_pop;
	    public WebElement SendAlert_pop() {
	      return SendAlert_pop;
	    }
	    
	  
	    @FindBy(xpath="//*[@id='td_applicationFacilityGridTbl_Id_WIFT002MT_1_fmsApplVO.CODE']")
	    private WebElement select_the_record_InApproval_Committee_Recommendations;
	    public WebElement select_the_record_InApproval_Committee_Recommendations() {
	      return select_the_record_InApproval_Committee_Recommendations;
	    }
	
	  
	    @FindBy(xpath="//span[contains(text(),' Recommend ')]")
	    private WebElement Click_recommend_button_in_the_Approval_Committee_Recommendations_Screen;
	    public WebElement Click_recommend_button_in_the_Approval_Committee_Recommendations_Screen() {
	      return Click_recommend_button_in_the_Approval_Committee_Recommendations_Screen;
	    }
	
	  
	    @FindBy(xpath="//td[@tdlabel='Recommended By' and text()='GOWTHAM']//following::td[@tdlabel='Recommendation']/select")
	    private WebElement select_approve_In_recommendaionDropDown;
	    public WebElement select_approve_In_recommendaionDropDown() {
	      return select_approve_In_recommendaionDropDown;
	    }
	  
	    @FindBy(xpath="//td[@tdlabel='Recommended By' and text()='GOWTHAM']//following::td[@tdlabel='Recommendation']//following::input[@name='lookupTxt_fmsApplRecommendVO.COMMENT_CODE']")
	    private WebElement enter_comment_code_In_recommendaionPopup;
	    public WebElement enter_comment_code_In_recommendaionPopup() {
	      return enter_comment_code_In_recommendaionPopup;
	    }
	  
	    @FindBy(xpath="//span[text()='OK']")
	    private WebElement Click_ok_After_enterValues_On_recommendaion;
	    public WebElement Click_ok_After_enterValues_On_recommendaion() {
	      return Click_ok_After_enterValues_On_recommendaion;
	    }
	
	  //1038989
		
		@FindBy(xpath = "//*[@id='applicationFacilityDownPaymentToVendorPerc_WIFT001MT']")
		private WebElement Down_Payment_to_VendorPercentage_In_AdditionalDetailsTab;
		public WebElement Down_Payment_to_VendorPercentage_In_AdditionalDetailsTab_607() {
			return Down_Payment_to_VendorPercentage_In_AdditionalDetailsTab;
		}
		
		@FindBy(xpath = "//*[@id='applFacilityDownPaymentToVendor_WIFT001MT']")
		private WebElement Down_Payment_to_Vendor_In_AdditionalDetailsTab;
		public WebElement Down_Payment_to_Vendor_In_AdditionalDetailsTab_607() {
			return Down_Payment_to_Vendor_In_AdditionalDetailsTab;
		}
		
		@FindBy(xpath = "//*[@id='applFacilityTotalDownPaymentPerc_WIFT001MT']")
		private WebElement Total_Down_PaymentPercentage_In_AdditionalDetailsTab;
		public WebElement Total_Down_PaymentPercentage_In_AdditionalDetailsTab_607() {
			return Total_Down_PaymentPercentage_In_AdditionalDetailsTab;
		}
		
		@FindBy(xpath = "//*[@id='applFacilityTotalDownPayment_WIFT001MT']")
		private WebElement Total_Down_Payment_In_AdditionalDetailsTab;
		public WebElement Total_Down_Payment_In_AdditionalDetailsTab_607() {
			return Total_Down_Payment_In_AdditionalDetailsTab;
		}
		
		@FindBy(xpath = "//*[@id='applicationFacilityLimitDetailsDownPaymentToVendorPerc_WIFT001MT']")
		private WebElement LimitDetails_Down_Payment_to_VendorPercentage;
		public WebElement LimitDetails_Down_Payment_to_VendorPercentage_607() {
			return LimitDetails_Down_Payment_to_VendorPercentage;
		}
		
		@FindBy(xpath = "//*[@id='applFacilityLimitDetailsDownPaymentToVendorAmt_WIFT001MT']")
		private WebElement LimitDetails_Down_Payment_to_Vendor;
		public WebElement LimitDetails_Down_Payment_to_Vendor_607() {
			return LimitDetails_Down_Payment_to_Vendor;
		}
		
		@FindBy(xpath = "//*[@id='applFacilityLimitDetailsTotalDownPaymentPerc_WIFT001MT']")
		private WebElement LimitDetails_Total_Down_PaymentPercentage;
		public WebElement LimitDetails_Total_Down_PaymentPercentage_607() {
			return LimitDetails_Total_Down_PaymentPercentage;
		}
		
		@FindBy(xpath = "//*[@id='applFacilityLimitDetailsTotalDownPayment_WIFT001MT']")
		private WebElement LimitDetails_Total_Down_Payment;
		public WebElement LimitDetails_Total_Down_Payment_607() {
			return LimitDetails_Total_Down_Payment;
		}
		
		@FindBy(xpath = "//*[@id='reqFinancingLimitDownPaymentToVendorPerc_CSMRF00MT']")
		private WebElement Down_Payment_to_VendorPercentage_In_FacilitytypeDetailsTab;
		public WebElement Down_Payment_to_VendorPercentage_In_FacilitytypeDetailsTab_607() {
			return Down_Payment_to_VendorPercentage_In_FacilitytypeDetailsTab;
		}
		
		@FindBy(xpath = "//*[@id='reqFinancingLimitDownPaymentToVendor_CSMRF00MT']")
		private WebElement Down_Payment_to_Vendor_In_FacilitytypeDetailsTab;
		public WebElement Down_Payment_to_Vendor_In_FacilitytypeDetailsTab_607() {
			return Down_Payment_to_Vendor_In_FacilitytypeDetailsTab;
		}
		
		@FindBy(xpath = "//*[@id='reqFinancingLimitTotalDownPaymentPerc_CSMRF00MT']")
		private WebElement Total_Down_PaymentPercentage_In_FacilitytypeDetailsTab;
		public WebElement Total_Down_PaymentPercentage_InFacilitytypeDetailsTab_607() {
			return Total_Down_PaymentPercentage_In_FacilitytypeDetailsTab;
		}
		
		@FindBy(xpath = "//*[@id='reqFinancingLimitTotalDownPayment_CSMRF00MT']")
		private WebElement Total_Down_Payment_In_FacilitytypeDetailsTab;
		public WebElement Total_Down_Payment_In_FacilitytypeDetailsTab_607() {
			return Total_Down_Payment_In_FacilitytypeDetailsTab;
		}
		
		@FindBy(xpath = "//*[@id='requestFinanceLimitDetailsDownPaymentToVendorPerc_CSMRF00MT']")
		private WebElement DisbursementSub_LimitDetails_Down_Payment_to_VendorPercentage;
		public WebElement DisbursementSub_LimitDetails_Down_Payment_to_VendorPercentage_607() {
			return DisbursementSub_LimitDetails_Down_Payment_to_VendorPercentage;
		}
		
		@FindBy(xpath = "//*[@id='requestFinanceLimitDetailsDownPaymentToVendorAmt_CSMRF00MT']")
		private WebElement DisbursementSub_LimitDetails_Down_Payment_to_Vendor;
		public WebElement DisbursementSub_LimitDetails_Down_Payment_to_Vendor_607() {
			return DisbursementSub_LimitDetails_Down_Payment_to_Vendor;
		}
		
		@FindBy(xpath = "//*[@id='requestFinanceLimitDetailsTotalDownPaymentPerc_CSMRF00MT']")
		private WebElement DisbursementSub_LimitDetails_Total_Down_PaymentPercentage;
		public WebElement DisbursementSub_LimitDetails_Total_Down_PaymentPercentage_607() {
			return DisbursementSub_LimitDetails_Total_Down_PaymentPercentage;
		}
		
		@FindBy(xpath = "//*[@id='requestFinanceLimitDetailsTotalDownPayment_CSMRF00MT']")
		private WebElement DisbursementSub_LimitDetails_Total_Down_Payment;
		public WebElement DisbursementSub_LimitDetails_Total_Down_Payment_607() {
			return DisbursementSub_LimitDetails_Total_Down_Payment;
		}
		
		//127735
		
		@FindBy(xpath = "//*[@id='applicationfacility_collateralDetails_btn_WIFT001MT']")
		private WebElement Click_collateral_details_in_applicationForFinancialFacilites;
		public WebElement Click_collateral_details_in_applicationForFinancialFacilites_607() {
			return Click_collateral_details_in_applicationForFinancialFacilites;
		}
		
		@FindBy(xpath = "//*[@id='add_FacilityCollateralGrid_WIFT001MT']")
		private WebElement ClickAddBtn_In_collateral_details_in_applicationForFinancialFacilites;
		public WebElement ClickAddBtn_In_collateral_details_in_applicationForFinancialFacilites_607() {
			return ClickAddBtn_In_collateral_details_in_applicationForFinancialFacilites;
		}
		
		
		@FindBy(xpath = "//*[@id='td_FacilityCollateralGrid_WIFT001MT_1_rn']")
		private WebElement SelectFirstRow_In_collateral_details_in_applicationForFinancialFacilites;
		public WebElement SelectFirstRow_In_collateral_details_in_applicationForFinancialFacilites_607() {
			return SelectFirstRow_In_collateral_details_in_applicationForFinancialFacilites;
		}
		
		
		@FindBy(xpath = "//*[@name='lookupTxt_fmsAppcollateralsVO.COLLATERAL']")
		private WebElement EnterCollateral_In_collateral_details_in_applicationForFinancialFacilites;
		public WebElement EnterCollateral_In_collateral_details_in_applicationForFinancialFacilites_607() {
			return EnterCollateral_In_collateral_details_in_applicationForFinancialFacilites;
		}
		
		@FindBy(xpath = "//span[text()='Ok']")
		private WebElement Clickok_AfterLinkcollateral_In_collateral_details;
		public WebElement Clickok_AfterLinkcollateral_In_collateral_details_607() {
			return Clickok_AfterLinkcollateral_In_collateral_details;
		}
		
		
		@FindBy(xpath = "//*[@id='facilityLimitDetailsTab_WIFT008MT']")
		private WebElement Click_facilityLimitDetails;
		public WebElement Click_facilityLimitDetails_607() {
			return Click_facilityLimitDetails;
		}
		
		@FindBy(xpath = "//*[@id='facilityManagement_collateralDetails_btn_WIFT008MT']")
		private WebElement Click_collateralDetails_in_mainteance_under_FacilityManagement;
		public WebElement Click_collateralDetails_in_mainteance_under_FacilityManagement_607() {
			return Click_collateralDetails_in_mainteance_under_FacilityManagement;
		}
		
		@FindBy(xpath = "//*[@id='td_FacilityManagementFacilityLimitDetailsGrid_WIFT008MT_0_rn']")
		private WebElement selectRow_InfacilityLimitDetailsTabin_mainteance_under_FacilityManagement;
		public WebElement selectRow_InfacilityLimitDetailsTabin_mainteance_under_FacilityManagement_607() {
			return selectRow_InfacilityLimitDetailsTabin_mainteance_under_FacilityManagement;
		}
		
		@FindBy(xpath = "//*[@id='td_FacilityCollateralGrid_WIFT008MT_0_rn']")
		private WebElement selectRow_InCollateralDetails_mainteance_under_FacilityManagement;
		public WebElement selectRow_InCollateralDetails_mainteance_under_FacilityManagement_607() {
			return selectRow_InCollateralDetails_mainteance_under_FacilityManagement;
		}
		
		@FindBy(xpath = "//*[@id='collateral_query_btn_WIFT008MT']")
		private WebElement ClickQuerybtn_InCollateralDetails_mainteance_under_FacilityManagement;
		public WebElement ClickQuerybtn_InCollateralDetails_mainteance_under_FacilityManagement_607() {
			return ClickQuerybtn_InCollateralDetails_mainteance_under_FacilityManagement;
		}
		
		@FindBy(xpath = "//*[@id='collateralCode_WIFT008MT']")
		private WebElement CheckCode_InCollateralDetails_mainteance_under_FacilityManagement;
		public WebElement CheckCode_InCollateralDetails_mainteance_under_FacilityManagement_607() {
			return CheckCode_InCollateralDetails_mainteance_under_FacilityManagement;
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
		
		@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement Confirmsave_popup_okbutton;
		public WebElement confirmsavepopupokbutton() {
		return Confirmsave_popup_okbutton;
		}
		
		@FindBy(xpath="//input[@id=\'_popup_path_sol_ok\']")
	    private WebElement Click_okOn_save_pop;
	    public WebElement Click_okOn_save_pop() {
	      return Click_okOn_save_pop;
	    }
		
		
		//135014
	  
	    @FindBy(xpath="//div[text()='ERROR']/parent::div/following-sibling::center/input[@id='_popup_path_sol_ok']")
	    private WebElement ErrorPuppop;
	    public WebElement ErrorPuppop() {
	      return ErrorPuppop;
	    }
	    
	    @FindBy(xpath = "//*[@id='applicationfacility_issueoffer_btn_WIFT005MT']")
		private WebElement ClickIssueOffer_BtnIn_IssueFacilityOffer_under_WifakApplication;
		public WebElement ClickIssueOffer_BtnIn_IssueFacilityOffer_under_WifakApplication_607() {
			return ClickIssueOffer_BtnIn_IssueFacilityOffer_under_WifakApplication;
		}
	  
	    @FindBy(xpath="//*[@id='infoBarSearchButton_WIFT001MT']")
	    private WebElement Click_Search_In_mainteance_underWifak;
	    public WebElement Click_Search_In_mainteance_underWifak_607() {
	      return Click_Search_In_mainteance_underWifak;
	    }
	  
	    @FindBy(xpath="//*[@id='applicationFacilityGridTbl_Id_WIFT001MT_gs_fmsApplVO.CODE']")
	    private WebElement SearchRecord_In_mainteance_underWifak;
	    public WebElement SearchRecord_In_mainteance_underWifak_607() {
	      return SearchRecord_In_mainteance_underWifak;
	    }
	  
	    @FindBy(xpath="//*[@id='td_applicationFacilityGridTbl_Id_WIFT001MT_1_fmsApplVO.CODE']")
	    private WebElement SelectRecord_In_mainteance_underWifak;
	    public WebElement SelectRecord_In_mainteance_underWifak() {
	      return SelectRecord_In_mainteance_underWifak;
	    }
	  
	    @FindBy(xpath="//*[@id='statusDesc_WIFT001MT']")
	    private WebElement CheckSts_In_mainteance_underWifak;
	    public WebElement CheckSts_In_mainteance_underWifak_607() {
	      return CheckSts_In_mainteance_underWifak;
	    }
	    
	   //733338
	    
	  
	    @FindBy(xpath="//*[@id='applicationFacilitydatecreated_WIFT001MT']")
	    private WebElement getAppCreatedDate_InMainteance_under_Wifak;
	    public WebElement getAppCreatedDate_InMainteance_under_Wifak_607() {
	      return getAppCreatedDate_InMainteance_under_Wifak;
	    }
	    
	  
	    @FindBy(xpath="//*[@id='WIFT006MT']")
	    private WebElement Click_ClientRespose_under_Wifak;
	    public WebElement Click_ClientRespose_under_Wifak_607() {
	      return Click_ClientRespose_under_Wifak;
	    }
	  
	    @FindBy(xpath="//*[@id='applicationFacilityGridTbl_Id_WIFT006MT_gs_fmsApplVO.CODE']")
	    private WebElement SearchRecord_InClientRespose_under_Wifak;
	    public WebElement SearchRecord_InClientRespose_under_Wifak_607() {
	      return SearchRecord_InClientRespose_under_Wifak;
	    }
	  
	    @FindBy(xpath="//*[@id='td_applicationFacilityGridTbl_Id_WIFT006MT_1_fmsApplVO.CODE']")
	    private WebElement SelectRecord_InClientRespose_under_Wifak;
	    public WebElement SelectRecord_InClientRespose_under_Wifak_607() {
	      return SelectRecord_InClientRespose_under_Wifak;
	    }
	  
	    @FindBy(xpath="//*[@id='applicationfacility_accept_btn_WIFT006MT']")
	    private WebElement ClickAcceptBtn_InClientRespose_under_Wifak;
	    public WebElement ClickAcceptBtn_InClientRespose_under_Wifak_607() {
	      return ClickAcceptBtn_InClientRespose_under_Wifak;
	    }
	    
	    
	    
	    
	    
	    
		
	
}
