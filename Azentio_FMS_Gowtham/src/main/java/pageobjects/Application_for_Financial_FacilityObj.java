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

	@FindBy(xpath = "//button[@id='limitDetails_add_btn_WIFT001MT']/span[2]")
	private WebElement ClickAdd_Button_AfterEnter_ValueOn_Product_Class;

	public WebElement getClickAdd_Button_AfterEnter_ValueOn_Product_Class() {
		return ClickAdd_Button_AfterEnter_ValueOn_Product_Class;
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
	
	
}
