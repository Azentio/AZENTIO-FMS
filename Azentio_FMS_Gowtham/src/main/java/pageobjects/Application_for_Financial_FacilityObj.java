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
	
	
	
	
	
	
}
