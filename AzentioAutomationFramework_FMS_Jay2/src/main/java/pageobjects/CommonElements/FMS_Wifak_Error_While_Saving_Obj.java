package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FMS_Wifak_Error_While_Saving_Obj {

	WebDriver driver;

	public FMS_Wifak_Error_While_Saving_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath =  "//div[@id='_selenuimCorporate']/h3/table/tbody/tr/td[2]")
	private WebElement Scrollinto_CorporateJk;
	public WebElement getScrollinto_CorporateJk() {
		return Scrollinto_CorporateJk;
	}
	
	@FindBy(xpath =  "//div[@id='_selenuimAPPLICATION']/h3/table/tbody/tr/td[1]/span")
	private WebElement Wifak_Application_first;
	public WebElement getWifak_Application_first() {
		return Wifak_Application_first;
	}
	
	@FindBy(xpath =  "//div[@id='_selenuimWIF']/li/a/table/tbody/tr/td[1]/span/span")
	private WebElement Wifak_Application_second;
	public WebElement getWifak_Application_second() {
		return Wifak_Application_second;
	}
	
	@FindBy(xpath =  "//div[@id='_selenuimWIFT001']/li/a/table/tbody/tr/td[1]/span/span")
	private WebElement Application_for_financial_facilities;
	public WebElement getApplication_for_financial_facilities() {
		return Application_for_financial_facilities;
	}
	
	@FindBy(xpath =  "//span[text()='Maintenance']")
	private WebElement maintenance;
	public WebElement getMaintenance() {
		return maintenance;
	}
	
	@FindBy(xpath =  "//select[@id='applicationFacilityApplicationfor_WIFT001MT']")
	private WebElement Application_for;
	public WebElement getApplication_for() {
		return Application_for;
	}
	
	@FindBy(xpath =  "//input[@id='lookuptxt_applicationFacilitycif_WIFT001MT']")
	private WebElement CIF_no;
	public WebElement getCIF_no() {
		return CIF_no;
	}
	
	@FindBy(xpath =  "//span[@id='spanLookup_applicationFacilitycif_WIFT001MT']/span")
	private WebElement Click_SearchIcon_On_CIF_no;
	public WebElement getClick_SearchIcon_On_CIF_no() {
		return Click_SearchIcon_On_CIF_no;
	}
	
//	@FindBy(xpath =  "//input[@id='gridtab_applicationFacilityFacilityType_WIFT001MT_gs_CODE']")   
//	private WebElement Enter_codeON_Facility_Type;
//	public WebElement getEnter_codeON_Facility_Type() {
//		return Enter_codeON_Facility_Type;
//	}

	@FindBy(xpath =  "//input[@id='lookuptxt_applicationFacilityFacilityType_WIFT001MT']")   
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
	@FindBy(xpath =  "//input[@id='lookuptxt_applicationFacilityCountry_WIFT001MT']")  
	private WebElement EnterCodeIn_Country_of_Financing;
	public WebElement getEnterCodeIn_Country_of_Financing() {
		return EnterCodeIn_Country_of_Financing;
	}
	
	@FindBy(xpath =  "//span[contains(text(),'Yes')]")  
	private WebElement Post_Approvel_yes;
	public WebElement Post_Approvel_yes() {
		return Post_Approvel_yes;
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
	@FindBy(xpath =  "//input[@name='applicationFacilityCO.fmsApplVO.FACILITY_RATING_GRADE']")
	private WebElement Enter_lineCodeOn_Facility_Rating;
	public WebElement getEnter_lineCodeOn_Facility_Rating() {
		return Enter_lineCodeOn_Facility_Rating;
	}
	
	@FindBy(xpath =  "//td[@id='applicationFacilityfacilitytypesection_WIFT001MT']/table")
	private WebElement AfterEnter_lineCodeOn_Facility_Rating_ClickOut;
	public WebElement getAfterEnter_lineCodeOn_Facility_Rating_ClickOut() {
		return AfterEnter_lineCodeOn_Facility_Rating_ClickOut;
	}
	
	
	
	
//	@FindBy(xpath =  "//td[@id='td_gridtab_applicationFacilityRating_WIFT001MT_1_LINE_NBR']")
//	private WebElement DoubleClick_lineCodeOn_Facility_Rating;
//	public WebElement getDoubleClick_lineCodeOn_Facility_Rating() {
//		return DoubleClick_lineCodeOn_Facility_Rating;
//	}
	
	
	@FindBy(xpath =  "//li[@id=\"applicationFacilityAdditionDetailsTabs_WIFT001MT\"]")
	private WebElement Clickon_additionalDetails;
	public WebElement getClickon_additionalDetails() {
		return Clickon_additionalDetails;
	}
	
	@FindBy(xpath =  "//input[@id='applicationFacilitytotalvalue_WIFT001MT']")
	private WebElement Enter_TotalValue;
	public WebElement getEnter_TotalValue() {
		return Enter_TotalValue;
	}
	
	@FindBy(xpath =  "//td[@id='applicationFacilityLimitDetailssection_WIFT001MT']/table[1]/tbody")
	private WebElement After_Enter_TotalValue_ClickOut;
	public WebElement getAfter_Enter_TotalValue_ClickOut() {
		return After_Enter_TotalValue_ClickOut;
	}
	
	
	@FindBy(xpath =  "//span[text()='Additional Details']y")
	private WebElement ClickOn_mainTab;
	public WebElement getClickOn_mainTab() {
		return ClickOn_mainTab;
	}
	
	@FindBy(xpath =  "//td[@id='applicationFacilityDateDetailssection_WIFT001MT']/table/tbody/tr[3]/td[2]/div/img")
	private WebElement Click_Offer_Expiration;
	public WebElement getClick_Offer_Expiration() {
		return Click_Offer_Expiration;
	}
	
	@FindBy(xpath =  "//input[@id='applicationFacilityofferexpirydate_WIFT001MT']")
	private WebElement Click_Offer_Expiration_SelectDate;
	public WebElement getClick_Offer_Expiration_SelectDate() {
		return Click_Offer_Expiration_SelectDate;
	}

	@FindBy(xpath =  "//li[@id='applicationFacilityLimitDetailsTabs_WIFT001MT']/a/span")
	private WebElement Select_limitDetails;
	public WebElement getSelect_limitDetails() {
		return Select_limitDetails;
	}
	
//	@FindBy(xpath =  "//td[@id='add_ApplicationFacilityLimitDetailsGrid_WIFT001MT']")
	@FindBy(id =  "add_ApplicationFacilityLimitDetailsGrid_WIFT001MT")
	private WebElement Click_AddButtonon_limit_Detail;
	public WebElement getClick_AddButtonon_limit_Detail() {
		return Click_AddButtonon_limit_Detail;
	}
	
	
	
	@FindBy(xpath =  "//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement Enter_ValueOn_Product_Class;
	public WebElement getEnter_ValueOn_Product_Class() {
		return Enter_ValueOn_Product_Class;
	}
	
	@FindBy(id =  "applicationfacilityLimitDetailsFACILITY_VALUE_WIFT001MT")
	private WebElement Enter_ValueOn_FacilityValue;
	public WebElement Enter_ValueOn_FacilityValue() {
		return Enter_ValueOn_FacilityValue;
	}
	
	@FindBy(id =  "lookuptxt_applicationfacilityLimitDetailsPURPOSE_OF_FIN_WIFT001MT")
	private WebElement Enter_ValueOn_PurposeOfFinacing;
	public WebElement Enter_ValueOn_PurposeOfFinacing() {
		return Enter_ValueOn_PurposeOfFinacing;
	}
	
	
	@FindBy(xpath =  "//span[@id='spanLookup_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement AfterEnter_ValueOn_Product_Class_Search;
	public WebElement getAfterEnter_ValueOn_Product_Class_Search() {
		return AfterEnter_ValueOn_Product_Class_Search;
	}
	
	@FindBy(id =  "ApplicationFacilityLimitDetailsGrid_WIFT001MT")
	private WebElement TableHead_LimitDetails;
	public WebElement TableHead_LimitDetails() {
		return TableHead_LimitDetails;
	}
	
	@FindBy(xpath =  "//span[@id='spanLookup_applicationfacilityLimitDetailsACC_SL_NO_WIFT001MT']/span")
	private WebElement Click_Search_Button_Account_No;
	public WebElement Click_Search_Button_Account_No() {
		return Click_Search_Button_Account_No;
	}
	
	@FindBy(xpath =  "//tr[@id='3']")
	private WebElement Double_Click_Search_Account_No;
	public WebElement Double_Click_Search_Account_No() {
		return Double_Click_Search_Account_No;
	}
	
	
	@FindBy(xpath ="//button[@id='limitDetails_add_btn_WIFT001MT']")
	private WebElement AfterEnter_ValueOn_Product_Class_Search_Scroll;
	public WebElement getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd() {
		return AfterEnter_ValueOn_Product_Class_Search_Scroll;
	}
	
	//input[@id='_popup_path_sol_ok']
	
	@FindBy(xpath =  "//input[@id='_popup_path_sol_ok']")
	private WebElement Error_Popup_OK;
	public WebElement ErrorPopupOK() {
		return Error_Popup_OK;
	}
	
	//----------------------
	
	@FindBy(xpath =  "lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT")
	private WebElement ClickAdd_Button_AfterEnter_ValueOn_Product_Class;
	public WebElement getClickAdd_Button_AfterEnter_ValueOn_Product_Class() {
		return ClickAdd_Button_AfterEnter_ValueOn_Product_Class;
	}
	@FindBy(xpath =  "//input[@id='_popup_path_sol_ok']")
	private WebElement After_ClickAdd_Button_Class_Warrning_ClickOk;
	public WebElement getAfter_ClickAdd_Button_Class_Warrning_ClickOk() {
		return After_ClickAdd_Button_Class_Warrning_ClickOk;
	}
	
	@FindBy(xpath =  "//input[@id=\"_popup_path_sol_ok\"]")
	private WebElement After_ClickAdd_Button_Class_select_rowWarrning_ClickOk;
	public WebElement getAfter_ClickAdd_Button_Class_select_rowWarrning_ClickOk() {
		return After_ClickAdd_Button_Class_select_rowWarrning_ClickOk;
	}
	
	//----------------------------
	
	@FindBy(xpath =  "//button[@id='applicationfacility_FixedAssets_btn_WIFT001MT']")
	private WebElement Click_FixedAssert_Button;
	public WebElement getClick_FixedAssert_Button() {
		return Click_FixedAssert_Button;
	}
	
	@FindBy(xpath =  "//td[@id='add_FmsIjaraFixedAssetsGrid_WIFT001MT']/div/span")
	private WebElement Click_AddButton_OnFixedAssert_screen;
	public WebElement getClick_AddButton_OnFixedAssert_screen() {
		return Click_AddButton_OnFixedAssert_screen;
	}

	//td[@id='td_FmsIjaraFixedAssetsGrid_WIFT001MT_1_rn']
	@FindBy(xpath =  "//td[@id='td_FmsIjaraFixedAssetsGrid_WIFT001MT_1_rn']")
	private WebElement Click_value_1_on_Catagory;
	public WebElement Click_value_1_on_Catagory() {
		return Click_value_1_on_Catagory;
	}
	
	
	@FindBy(xpath =  "//input[@name='lookupTxt_fmsFacilityAssetVO.CATEGORY_CODE']")
	private WebElement Enter_value_on_Catagory;
	public WebElement getEnter_value_on_Catagory() {
		return Enter_value_on_Catagory;
	}
	
	@FindBy(xpath =  "//input[@name='lookupTxt_fmsFacilityAssetVO.CLASS_CODE']")
	private WebElement Enter_value_on_Class;
	public WebElement getEnter_value_on_Class() {
		return Enter_value_on_Class;
	}
	
	@FindBy(xpath =  "//input[@name='lookupTxt_fmsFacilityAssetVO.CIF_NO']")
	private WebElement Enter_value_on_vendor;
	public WebElement getEnter_value_on_vendor() {
		return Enter_value_on_vendor;
	}
	
	@FindBy(xpath =  "//td[@id='td_FmsIjaraFixedAssetsGrid_WIFT001MT_1_fmsFacilityAssetVO.QUANTITY']/div/input")
	private WebElement Enter_value_on_quantity;
	public WebElement getEnter_value_on_quantity() {
		return Enter_value_on_quantity;
	}
	
	@FindBy(xpath =  "//td[@id='td_FmsIjaraFixedAssetsGrid_WIFT001MT_1_fmsFacilityAssetVO.UNIT']/input")
	private WebElement Enter_value_on_Unit;
	public WebElement getEnter_value_on_Unit() {
		return Enter_value_on_Unit;
	}
	
	@FindBy(xpath =  "//input[@name='lookupTxt_fmsFacilityAssetVO.CURRENCY']")
	private WebElement Enter_value_on_Cy;
	public WebElement getEnter_value_on_Cy() {
		return Enter_value_on_Cy;
	}
	
	@FindBy(xpath =  "//td[@id='td_FmsIjaraFixedAssetsGrid_WIFT001MT_1_fmsFacilityAssetVO.UNIT_COST']/div/input")
	private WebElement Enter_value_on_UnitCost;
	public WebElement getEnter_value_on_UnitCost() {
		return Enter_value_on_UnitCost;
	}   
	
	@FindBy(xpath =  "//input[@name='lookupTxt_fmsFacilityAssetVO.VAT_CODE']")
	private WebElement Enter_value_on_Vat_Code;
	public WebElement Enter_value_on_Vat_Code() {
		return Enter_value_on_Vat_Code;
	}
	
	
	
	
	
	
	@FindBy(xpath =  "/html/body/div[56]/div[11]/div/button/span")
	private WebElement Click_OkButton_OnFixedAssertKey_Screen;
	public WebElement getClick_OkButton_OnFixedAssertKey_Screen() {
		return Click_OkButton_OnFixedAssertKey_Screen;
	}
	
	@FindBy(id =  "applicationfacility_save_as_draft_btn_WIFT001MT")
	private WebElement Click_SaveButton_OnLimitDetails_Tab;
	public WebElement getClick_SaveButton_OnLimitDetails_Tab() {
		return Click_SaveButton_OnLimitDetails_Tab;
	}
	
	//-------------- Holiday 
	
	@FindBy(id =  "applicationFacilityofferexpirydate_WIFT001MT")
	private WebElement Expiratin_date_additional_Details;
	public WebElement Expiratin_date_additional_Details(){
		return Expiratin_date_additional_Details;
	}
	
	@FindBy(xpath =  "a//div[contains(text(),'Is a Holiday')]")
	private WebElement validate_holidayDate;
	public WebElement validate_holidayDate(){
		return validate_holidayDate;
	}
	
	@FindBy(id =  "_popup_path_sol_confirm_ok")
	private WebElement Confirm_theRequested_Holiday_date;
	public WebElement Confirm_theRequested_Holiday_date(){
		return Confirm_theRequested_Holiday_date;
	}
	
		
	@FindBy(id =  "_popup_path_sol_confirm_ok")
	private WebElement Confirm_theRequested_Holiday_date_In_LimitsDetails;
	public WebElement Confirm_theRequested_Holiday_date_In_LimitsDetails(){
		return Confirm_theRequested_Holiday_date_In_LimitsDetails;
	}
	
	
	
	@FindBy(xpath =  "//input[@id='applicationfacilityLimitDetailsEXPECTED_PAYMENT_DATE_WIFT001MT']")
	private WebElement Expected_Payment_Date_inLimit_Details_SubMenu;
	public WebElement ExpectedPaymenDate_inLimitDetails_SubMenu(){
		return Expected_Payment_Date_inLimit_Details_SubMenu;
	}
//	
//	@FindBy(id =  "_popup_path_sol_confirm_ok")
//	private WebElement Expected_Payment_Date_inLimit_Details_SubMenu;
//	public WebElement ExpectedPaymenDate_inLimitDetails_SubMenu(){
//		return Expected_Payment_Date_inLimit_Details_SubMenu;
//	}
	
	@FindBy(xpath =  "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement ClickOk_saveOn_Draft_WarrningScreen;
	public WebElement getClickOk_saveOn_Draft_WarrningScreen() {
		return ClickOk_saveOn_Draft_WarrningScreen;
	}
	
	@FindBy(xpath =  "//input[@id='_popup_path_sol_ok']")
	private WebElement ClickOk_OnSuccess_Screen;
	public WebElement getClickOk_OnSuccess_Screen() {
		return ClickOk_OnSuccess_Screen;
	}
	
	//-----------------------------------
	
	@FindBy(xpath =  "//label[text()='FX Settlement Expiry Date '")
	private WebElement Fx_Settlement_Expery_Date;
	public WebElement FxSettlementExperyDate() {
		return Fx_Settlement_Expery_Date;
	}
	
	@FindBy(id =  "id=applicationFacilityFxSettlementExpiryDate_WIFT001MT")
	private WebElement FxSettlementExperyDate_Above;
	public WebElement FxSettlementExperyDateAbove() {
		return FxSettlementExperyDate_Above;
	}
	
	@FindBy(xpath =  "//div[text()='[905] Date cannot be less than Running Date']")
	private WebElement FxSettlementExperyDate_Below;
	public WebElement FxSettlementExperyDateBelow() {
		return FxSettlementExperyDate_Below;
	}
	
	//-----------------------------@
	
	@FindBy(xpath =  "//span[@id='spanLookup_applicationfacilityLimitDetailsACC_SL_NO_WIFT001MT']")
	private WebElement Search_Button_In_Account_No;
	public WebElement Search_Button_In_Account_No() {
		return Search_Button_In_Account_No;
	}
	
	@FindBy(id =  "applicationfacilityLimitDetailsACC_CY_WIFT001MT")
	private WebElement Currency__Button_In_Account_No;
	public WebElement Currency__Button_In_Account_No() {
		return Currency__Button_In_Account_No;
	}
	
	@FindBy(id =  "applicationfacilityLimitDetailsACC_GL_WIFT001MT")
	private WebElement GLCode__Button_In_Account_No;
	public WebElement GLCode__Button_In_Account_No() {
		return GLCode__Button_In_Account_No;
	}
	
	@FindBy(id =  "lookuptxt_applicationfacilityLimitDetailsACC_SL_NO_WIFT001MT")
	private WebElement Serial__Button_In_Account_No;
	public WebElement Serial__Button_In_Account_No() {
		return Serial__Button_In_Account_No;
	}
	
	@FindBy(id =  "lookuptxt_applicationfacilityLimitDetailsACC_Add_Det_WIFT001MT")
	private WebElement Enter_Account_Number;
	public WebElement Enter_Account_Number() {
		return Enter_Account_Number;
	}
	
	
	
//	@FindBy(xpath =  "(//*[@id=\"3\"])[5]")
//	private WebElement Search_Button_In_Account_No_DoubleClick;
//	public WebElement Search_Button_In_Account_No_DoubleClick() {
//		return Search_Button_In_Account_No_DoubleClick;
//	}
	
//	@FindBy(xpath =  "//span[@id='spanLookup_applicationfacilityLimitDetailsACC_SL_NO_WIFT001MT']")
//	private WebElement Search_Button_In_Account_No;
//	public WebElement Search_Button_In_Account_No() {
//		return Search_Button_In_Account_No;
//	}
	
	@FindBy(id =  "applicationfacility_chargesdtls_btn_WIFT001MT")
	private WebElement Click_Charges_Details;
	public WebElement Click_Charges_Details() {
		return Click_Charges_Details;
	}
	

	@FindBy(id =  "td_FacilityChargesGrid_WIFT001MT_0_rn")
	private WebElement Click_1_In_Charges_Details;
	public WebElement Click_1_In_Charges_Details() {
		return Click_1_In_Charges_Details;
	}
	
	@FindBy(id =  "1_fmsapplchargesVO.COLLECT_AT_FAC_APPROVAL_FacilityChargesGrid_WIFT001MT")
	private WebElement Check_Flag_In_Collect_At_Fac_Approvel;
	public WebElement Check_Flag_In_Collect_At_Fac_Approvel() {
		return Check_Flag_In_Collect_At_Fac_Approvel;
	}
	
	@FindBy(xpath =  "//span[text()='Ok']")
	private WebElement Click_Ok_Button_In_Collect_At_Fac_Approvel;
	public WebElement Click_Ok_Button_In_Collect_At_Fac_Approvel() {
		return Click_Ok_Button_In_Collect_At_Fac_Approvel;
	}
	
	@FindBy(id =  "_popup_path_sol_confirm_ok")
	private WebElement Ok_Button_In_Waring_Screen;
	public WebElement Ok_Button_In_Waring_Screen() {
		return Ok_Button_In_Waring_Screen;
	}
	
	@FindBy(xpath =  "//div[text()='Warning']")
	private WebElement Waring_Screen;
	public WebElement Waring_Screen() {
		return Waring_Screen;
	}
	
	//div[text()='Warning']
	@FindBy(id =  "_popup_path_sol_confirm_ok")
	private WebElement Ok_Button_In_Confirm_Screen;
	public WebElement Ok_Button_In_Confirm_Screen() {
		return Ok_Button_In_Confirm_Screen;
	}
	
	@FindBy(id =  "_popup_path_sol_ok")
	private WebElement Ok_Button_In_Sucess_Screen;
	public WebElement Ok_Button_In_Sucess_Screen() {
		return Ok_Button_In_Sucess_Screen;
	}
	
	@FindBy(id =  "applicationfacility_save_btn_WIFT001MT")
	private WebElement ValidateButton;
	public WebElement ValidateButton() {
		return ValidateButton;
	}
	
	@FindBy(xpath =  "//div[text()='Please wait while server request completes']")
	private WebElement PopupBefore_ValidateButton;
	public WebElement PopupBefore_ValidateButton() {
		return PopupBefore_ValidateButton;
	}
	
	@FindBy(xpath =  "//input[@id='_popup_path_sol_ok']")
	private WebElement ServerReuest;
	public WebElement ServerReuest() {
		return ServerReuest;
	}
	
	@FindBy(xpath =  "//span[contains(text(),'Document Details')]")
	private WebElement Click_Document_Details;
	public WebElement Click_Document_Details() {
		return Click_Document_Details;
	}
	
	@FindBy(xpath =  "//input[@name='applicationFacilityCO.fmsApplSolestVO.SOLICITOR']")
	private WebElement EnterTheValue_Solicitor_Name;
	public WebElement EnterTheValue_Solicitor_Name() {
		return EnterTheValue_Solicitor_Name;
	}
	
	@FindBy(xpath =  "//input[@name='applicationFacilityCO.fmsApplSolestVO.ESTIMATOR']")
	private WebElement EnterTheValue_Estimator_Name;
	public WebElement EnterTheValue_Estimator_Name() {
		return EnterTheValue_Estimator_Name;
	}
	
	
	
	
	
	
	@FindBy(id =  "_popup_path_sol_confirm_ok")
	private WebElement Informatio_Refresh_page_Cancel;
	public WebElement Informatio_Refresh_page_Cancel() {
		return Informatio_Refresh_page_Cancel;
	}
	
	
		
	//-------- 592279 TSR- SUPT170522 - Label missing limit Details
	
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Item_Key")
	private WebElement Items_InLImitDetails_SubMenu;
	public WebElement Items_InLImitDetails_SubMenu() {
		return Items_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_ProductClass_key")
	private WebElement ProductClass_InLImitDetails_SubMenu;
	public WebElement ProductClass_InLImitDetails_SubMenu() {
		return ProductClass_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_ProductClass_key")
	private WebElement Type_InLImitDetails_SubMenu;
	public WebElement Type_InLImitDetails_SubMenu() {
		return Type_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_CashNonCash_key")
	private WebElement CaseNonCase_InLImitDetails_SubMenu;
	public WebElement CaseNonCase_InLImitDetails_SubMenu() {
		return CaseNonCase_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Facilityvalue_key")
	private WebElement FacilityValue_InLImitDetails_SubMenu;
	public WebElement FacilityValue_InLImitDetails_SubMenu() {
		return FacilityValue_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Exchangerate_key")
	private WebElement ExchangeRate_InLImitDetails_SubMenu;
	public WebElement ExchangeRate_InLImitDetails_SubMenu() {
		return ExchangeRate_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_CVValue_key")
	private WebElement CvValue_InLImitDetails_SubMenu;
	public WebElement CvValue_InLImitDetails_SubMenu() {
		return CvValue_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_DownPayment_key")
	private WebElement DownPaymentPercentage_InLImitDetails_SubMenu;
	public WebElement DownPaymentPercentage_InLImitDetails_SubMenu() {
		return DownPaymentPercentage_InLImitDetails_SubMenu;
	}
	
	@FindBy(xpath =  "//input[@name='applicationFacilityCO.fmsApplVO.DOWN_PAYMENT_PERC']")
	private WebElement DownPaymentAmount_InLImitDetails_SubMenu;
	public WebElement DownPaymentAmount_InLImitDetails_SubMenu() {
		return DownPaymentAmount_InLImitDetails_SubMenu;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilitydownpayment_WIFT001MT']")
	private WebElement DownPaymentAmo_InLImitDetails_SubMenu;
	public WebElement DownPaymentAmo_InLImitDetails_SubMenu() {
		return DownPaymentAmo_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilityLimitDetailsDownPaymentToVendorPerc_WIFT001MT")
	private WebElement DownPaymentToVendorPerc_InLImitDetails_SubMenu;
	public WebElement DownPaymentToVendorPerc_InLImitDetails_SubMenu() {
		return DownPaymentToVendorPerc_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applFacilityLimitDetailsDownPaymentToVendorAmt_WIFT001MT")
	private WebElement DownPaymentToVendorAmt_InLImitDetails_SubMenu;
	public WebElement DownPaymentToVendorAmt_InLImitDetails_SubMenu() {
		return DownPaymentToVendorAmt_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applFacilityLimitDetailsTotalDownPaymentPerc_WIFT001MT")
	private WebElement TotalDownPaymentPerc_InLImitDetails_SubMenu;
	public WebElement TotalDownPaymentPerc_InLImitDetails_SubMenu() {
		return TotalDownPaymentPerc_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applFacilityLimitDetailsTotalDownPayment_WIFT001MT")
	private WebElement TotalDownPayment_InLImitDetails_SubMenu;
	public WebElement TotalDownPayment_InLImitDetails_SubMenu() {
		return TotalDownPayment_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_TotalFacilityValue_key")
	private WebElement TotalFacilityValue_InLImitDetails_SubMenu;
	public WebElement TotalFacilityValue_InLImitDetails_SubMenu() {
		return TotalFacilityValue_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_value_date_key")
	private WebElement ValueDate_InLImitDetails_SubMenu;
	public WebElement ValueDate_InLImitDetails_SubMenu() {
		return ValueDate_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_maturity_date_key")
	private WebElement Maturity_Date_InLImitDetails_SubMenu;
	public WebElement Maturity_Date_InLImitDetails_SubMenu() {
		return Maturity_Date_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_ExpectedPaymentDate_key")
	private WebElement ExpectedPaymentDate_InLImitDetails_SubMenu;
	public WebElement ExpectedPaymentDate_InLImitDetails_SubMenu() {
		return ExpectedPaymentDate_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_status_key")
	private WebElement status_InLImitDetails_SubMenu;
	public WebElement status_InLImitDetails_SubMenu() {
		return status_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_checkingOn_key")
	private WebElement CheckingOn_InLImitDetails_SubMenu;
	public WebElement CheckingOn_InLImitDetails_SubMenu() {
		return CheckingOn_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Account_No_key")
	private WebElement AccountNo_InLImitDetails_SubMenu;
	public WebElement AccountNo_InLImitDetails_SubMenu() {
		return AccountNo_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationfacilityLimitDetailsACC_Desc_WIFT001MT")
	private WebElement AccountName_InLImitDetails_SubMenu;
	public WebElement AccountName_InLImitDetails_SubMenu() {
		return AccountName_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_FundTransferRate_key")
	private WebElement FundTransferRate_InLImitDetails_SubMenu;
	public WebElement FundTransferRate_InLImitDetails_SubMenu() {
		return FundTransferRate_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_TFAMarginRate_key")
	private WebElement TFAMarginRate_InLImitDetails_SubMenu;
	public WebElement TFAMarginRate_InLImitDetails_SubMenu() {
		return TFAMarginRate_InLImitDetails_SubMenu;
	}
	 
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_EcoSector_key")
	private WebElement EcoSector_InLImitDetails_SubMenu;
	public WebElement EcoSector_InLImitDetails_SubMenu() {
		return EcoSector_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_SubEcoSector_key")
	private WebElement SubEcoSector_InLImitDetails_SubMenu;
	public WebElement SubEcoSector_InLImitDetails_SubMenu() {
		return SubEcoSector_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_TFA_Tenure_Days_Key")
	private WebElement TFATenureDays_InLImitDetails_SubMenu;
	public WebElement TFATenureDays_InLImitDetails_SubMenu() {
		return TFATenureDays_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_DiscountingMarginPer_key")
	private WebElement DiscountingMarginPer_InLImitDetails_SubMenu;
	public WebElement DiscountingMarginPer_InLImitDetails_SubMenu() {
		return DiscountingMarginPer_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Remarks_key")
	private WebElement Remarks_InLImitDetails_SubMenu;
	public WebElement Remarks_InLImitDetails_SubMenu() {
		return Remarks_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Payment_method_key")
	private WebElement PaymentMethod_InLImitDetails_SubMenu;
	public WebElement PaymentMethod_InLImitDetails_SubMenu() {
		return PaymentMethod_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Purpose_of_financing_key")
	private WebElement Purposeoffinancing_InLImitDetails_SubMenu;
	public WebElement Purposeoffinancing_InLImitDetails_SubMenu() {
		return Purposeoffinancing_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_InstallmentAmount_key")
	private WebElement InstallmentAmount_InLImitDetails_SubMenu;
	public WebElement InstallmentAmount_InLImitDetails_SubMenu() {
		return InstallmentAmount_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_NoofInstallments_key")
	private WebElement NoofInstallments_InLImitDetails_SubMenu;
	public WebElement NoofInstallments_InLImitDetails_SubMenu() {
		return NoofInstallments_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_SecurityDepositAmount_key")
	private WebElement SecurityDepositAmount_InLImitDetails_SubMenu;
	public WebElement SecurityDepositAmount_InLImitDetails_SubMenu() {
		return SecurityDepositAmount_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_AmendedSecurityDepositAmount_key")
	private WebElement AmendedSecurityDepositAmount_InLImitDetails_SubMenu;
	public WebElement AmendedSecurityDepositAmount_InLImitDetails_SubMenu() {
		return AmendedSecurityDepositAmount_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_cap_rate_key")
	private WebElement CapRate_InLImitDetails_SubMenu;
	public WebElement CapRate_InLImitDetails_SubMenu() {
		return CapRate_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_selling_price_key")
	private WebElement selling_price_InLImitDetails_SubMenu;
	public WebElement selling_price_InLImitDetails_SubMenu() {
		return selling_price_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_floor_rate_method_key")
	private WebElement floorRateMethod_InLImitDetails_SubMenu;
	public WebElement floorRateMethod_InLImitDetails_SubMenu() {
		return floorRateMethod_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_floor_rate_percentage_key")
	private WebElement FloorRatePercentage_InLImitDetails_SubMenu;
	public WebElement FloorRatePercentage_InLImitDetails_SubMenu() {
		return FloorRatePercentage_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_credit_spread_key")
	private WebElement CreditSpread_InLImitDetails_SubMenu;
	public WebElement CreditSpread_InLImitDetails_SubMenu() {
		return CreditSpread_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_sublimit_lower_limit_perc_key")
	private WebElement SublimitLowerLimitPerc_InLImitDetails_SubMenu;
	public WebElement SublimitLowerLimitPerc_InLImitDetails_SubMenu() {
		return SublimitLowerLimitPerc_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_sublimit_lower_limit_amount_key")
	private WebElement SublimitLowerLimitAmount_InLImitDetails_SubMenu;
	public WebElement SublimitLowerLimitAmount_InLImitDetails_SubMenu() {
		return SublimitLowerLimitAmount_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationfacilityLimitDetailsCLEAN_FLAG_WIFT001MT")
	private WebElement CleanFlag_InLImitDetails_SubMenu;
	public WebElement CleanFlag_InLImitDetails_SubMenu() {
		return CleanFlag_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Revolving_One_off_key")
	private WebElement RevolvingOneOff_InLImitDetails_SubMenu;
	public WebElement RevolvingOneOff_InLImitDetails_SubMenu() {
		return RevolvingOneOff_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilityLimitApplyPenalty_WIFT001MT")
	private WebElement ApplyPenalty_InLImitDetails_SubMenu;
	public WebElement ApplyPenalty_InLImitDetails_SubMenu() {
		return ApplyPenalty_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilitylimitPenaltyOnDueAmount_WIFT001MT")
	private WebElement PenaltyOnDueAmount_InLImitDetails_SubMenu;
	public WebElement PenaltyOnDueAmount_InLImitDetails_SubMenu() {
		return PenaltyOnDueAmount_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilitylimitGracePeriod_WIFT001MT")
	private WebElement GracePeriod_InLImitDetails_SubMenu;
	public WebElement GracePeriod_InLImitDetails_SubMenu() {
		return GracePeriod_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilitylimityielddetchargestype_WIFT001MT")
	private WebElement chargestype_InLImitDetails_SubMenu;
	public WebElement chargestype_InLImitDetails_SubMenu() {
		return chargestype_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Vat_code_key")
	private WebElement Vatcode_InLImitDetails_SubMenu;
	public WebElement Vatcode_InLImitDetails_SubMenu() {
		return Vatcode_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationfacilityLimitDetails_PPR_YN_WIFT001MT")
	private WebElement PPR_InLImitDetails_SubMenu;
	public WebElement PPR_InLImitDetails_SubMenu() {
		return PPR_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationfacilityLimitDetails_REGIMENTAL_AGENT_WIFT001MT")
	private WebElement REGIMENTAL_AGENT_InLImitDetails_SubMenu;
	public WebElement REGIMENTAL_AGENT_InLImitDetails_SubMenu() {
		return REGIMENTAL_AGENT_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationfacilityLimitDetails_BUDGET_ALLOCATION_WIFT001MT")
	private WebElement BUDGET_ALLOCATION_InLImitDetails_SubMenu;
	public WebElement BUDGET_ALLOCATION_InLImitDetails_SubMenu() {
		return BUDGET_ALLOCATION_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationfacilityLimitDetails_CONTRACTED_YN_WIFT001MT")
	private WebElement CONTRACTED_InLImitDetails_SubMenu;
	public WebElement CONTRACTED_InLImitDetails_SubMenu() {
		return CONTRACTED_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_comments_and_conditions_key")
	private WebElement comments_and_conditions_InLImitDetails_SubMenu;
	public WebElement comments_and_conditions_InLImitDetails_SubMenu() {
		return comments_and_conditions_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_transaction_cy")
	private WebElement transaction_cy_InLImitDetails_SubMenu;
	public WebElement transaction_cy_InLImitDetails_SubMenu() {
		return transaction_cy_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_MaximumTenure_PeriodicityNo_key")
	private WebElement MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu;
	public WebElement MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu() {
		return MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_MaximumTenure_PeriodicityType_key")
	private WebElement MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu;
	public WebElement MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu() {
		return MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_MinimumTenure_PeriodicityNo_key")
	private WebElement MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu;
	public WebElement MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu() {
		return MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_MinimumTenure_PeriodicityType_key")
	private WebElement MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu;
	public WebElement MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu() {
		return MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_MaximumTenureforfinancing_PeriodicityNo_key")
	private WebElement MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu;
	public WebElement MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu() {
		return MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_MaximumTenureforfinancing_PeriodicityType_key")
	private WebElement MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu;
	public WebElement MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu() {
		return MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_FloatingRate_key")
	private WebElement FloatingRate_InLImitDetails_SubMenu;
	public WebElement FloatingRate_InLImitDetails_SubMenu() {
		return FloatingRate_InLImitDetails_SubMenu;
	}
	
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_FloatingRatePeriodicity_key")
	private WebElement FloatingRatePeriodicit_InLImitDetails_SubMenu;
	public WebElement FloatingRatePeriodicit_InLImitDetails_SubMenu() {
		return FloatingRatePeriodicit_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_FloatingRatePeriodicityType_key")
	private WebElement FloatingRatePeriodicityType_InLImitDetails_SubMenu;
	public WebElement FloatingRatePeriodicityType_InLImitDetails_SubMenu() {
		return FloatingRatePeriodicityType_InLImitDetails_SubMenu;
	}
	
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_MarginRate_key")
	private WebElement MarginRate_InLImitDetails_SubMenu;
	public WebElement MarginRate_InLImitDetails_SubMenu() {
		return MarginRate_InLImitDetails_SubMenu;
	}
	

	@FindBy(id =  "lbl_applicationFacilityLimitTotalYield_WIFT001MT")
	private WebElement TotalYield_InLImitDetails_SubMenu;
	public WebElement TotalYield_InLImitDetails_SubMenu() {
		return TotalYield_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilitylimitlipdetlipperiod_WIFT001MT")
	private WebElement lip_period_InLImitDetails_SubMenu;
	public WebElement lip_period_InLImitDetails_SubMenu() {
		return lip_period_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilitylimitlipstartdate_WIFT001MT")
	private WebElement limitlipstartdate_InLImitDetails_SubMenu;
	public WebElement limitlipstartdate_InLImitDetails_SubMenu() {
		return limitlipstartdate_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilitylimitlipdetlipperiodamended_WIFT001MT")
	private WebElement lip_period_amende_InLImitDetails_SubMenu;
	public WebElement lip_period_amende_InLImitDetails_SubMenu() {
		return lip_period_amende_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilitylimitzeroentrycost_WIFT001MT")
	private WebElement zeroentrycost_InLImitDetails_SubMenu;
	public WebElement zeroentrycost_InLImitDetails_SubMenu() {
		return zeroentrycost_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilityLimitTranscationMaturity_WIFT001MT")
	private WebElement TranscationMaturity_InLImitDetails_SubMenu;
	public WebElement TranscationMaturity_InLImitDetails_SubMenu() {
		return TranscationMaturity_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilityLimitTranscationType_WIFT001MT")
	private WebElement TranscationType_InLImitDetails_SubMenu;
	public WebElement TranscationType_InLImitDetails_SubMenu() {
		return TranscationType_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilityLimitMaturityAction_WIFT001MT")
	private WebElement MaturityAction_InLImitDetails_SubMenu;
	public WebElement MaturityAction_InLImitDetails_SubMenu() {
		return MaturityAction_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_bank_no_key")
	private WebElement bank_no_InLImitDetails_SubMenu;
	public WebElement bank_no_InLImitDetails_SubMenu() {
		return bank_no_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_acc_no_key")
	private WebElement acc_no_InLImitDetails_SubMenu;
	public WebElement acc_no_InLImitDetails_SubMenu() {
		return acc_no_InLImitDetails_SubMenu;
	}
	
	
	@FindBy(id =  "limitDetails_add_btn_WIFT001MT")
	private WebElement add_btn_InLImitDetails_SubMenu;
	public WebElement add_btn_InLImitDetails_SubMenu() {
		return add_btn_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "limitDetails_close_btn_WIFT001MT")
	private WebElement close_btn_InLImitDetails_SubMenu;
	public WebElement close_btn_InLImitDetails_SubMenu() {
		return close_btn_InLImitDetails_SubMenu;
	}
	
	//-------------@579604  Scenario: TSR - KCB170047
	
	
	
	@FindBy(xpath =  "//select[@id='applicationFacilityApplicationfor_WIFT001MT']")
	private WebElement Application_for_Decrease;
	public WebElement Application_for_Decrease() {
		return Application_for_Decrease;
	}
	
	@FindBy(id =  "lookuptxt_applicationFacilityExistingFacilityRef_WIFT001MT")
	private WebElement ExistingFacility_Ref;
	public WebElement ExistingFacility_Ref() {
		return ExistingFacility_Ref;
	}
	
	@FindBy(xpath =  "//span[text()='Additional Details']")
	private WebElement Click_AdditionalDetails;
	public WebElement Click_AdditionalDetails() {
		return Click_AdditionalDetails;
	}
	
	@FindBy(xpath =  "//input[@name='applicationFacilityCO.TOTAL_AMOUNT']")
	private WebElement TOTAL_AMOUNT_InAdditionalDetails;
	public WebElement TOTAL_AMOUNT_InAdditionalDetails() {
		return TOTAL_AMOUNT_InAdditionalDetails;
	}
	
	@FindBy(xpath =  "//input[@name='applicationFacilityCO.fmsApplVO.DOWN_PAYMENT_PERC']")
	private WebElement DOWN_PAYMENT_PERC_InAdditionalDetails;
	public WebElement DOWN_PAYMENT_PERC_InAdditionalDetails() {
		return DOWN_PAYMENT_PERC_InAdditionalDetails;
	}
	
	
	
	//-------------------- @574947  Scenario: TSR-EWB170043
   
	@FindBy(id =  "applicationfacilityLimitDetailsCLEAN_FLAG_WIFT001MT")
	private WebElement CLEAN_FLAG_In_LimitsDetails;
	public WebElement CLEAN_FLAG_In_LimitsDetails() {
		return CLEAN_FLAG_In_LimitsDetails;
	}
	
	@FindBy(id =  "td_ApplicationFacilityLimitDetailsGrid_WIFT001MT_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE")
	private WebElement ProductClass_In_LimitsDetails;
	public WebElement ProductClass_In_LimitsDetails() {
		return ProductClass_In_LimitsDetails;
	}
	
	@FindBy(id =  "applicationfacility_repayplan_btn_WIFT001MT")
	private WebElement RepaymentPlan_btn_In_LimitsDetails;
	public WebElement RepaymentPlan_btn_In_LimitsDetails() {
		return RepaymentPlan_btn_In_LimitsDetails;
	}
	
	
	@FindBy(xpath =  "//Button[@id='applicationfacility_save_as_draft_btn_WIFT001MT']")
	private WebElement SaveButton_OnLimitDetails_Tab;
	public WebElement SaveButton_OnLimitDetails_Tab() {
		return SaveButton_OnLimitDetails_Tab;
	}
	
	@FindBy(xpath =  "//button[@id='savebutton_WIFT001MT']")
	private WebElement SaveButton_RepaymentPlan;
	public WebElement SaveButton_RepaymentPlan() {
		return SaveButton_RepaymentPlan;
	}
	
//	_popup_path_sol_confirm_ok
	@FindBy(xpath =  "_popup_path_sol_confirm_ok")
	private WebElement Waring_RepaymentPlan;
	public WebElement Waring_RepaymentPlan() {
		return Waring_RepaymentPlan;
	}
	
	//_popup_path_sol_ok
	@FindBy(id =  "_popup_path_sol_ok")
	private WebElement SaveInformation_RepaymentPlan;
	public WebElement SaveInformation_RepaymentPlan() {
		return SaveInformation_RepaymentPlan;
	}
	
    @FindBy(id =  "_popup_path_sol_confirm_ok")
	private WebElement WaringButton_OnLimitDetails_Tab;
	public WebElement WaringButton_OnLimitDetails_Tab() {
	return WaringButton_OnLimitDetails_Tab;
	}
	
	
	 @FindBy(id =  "_popup_path_sol_ok")
		private WebElement Waring_OnLimitDetails_Tab;
		public WebElement Waring_OnLimitDetails_Tab() {
		return Waring_OnLimitDetails_Tab;
		}
	
	@FindBy(id =  "_popup_path_sol_ok")
	private WebElement SucessButton_OnLimitDetails_Tab;
	public WebElement SucessButton_OnLimitDetails_Tab() {
	return SucessButton_OnLimitDetails_Tab;
	}
	
	@FindBy(id =  "No_Of_Payments_WIFT001MT")
	private WebElement No_Of_Payments_InRepaymentPlan;
	public WebElement No_Of_Payments_InRepaymentPlan() {
	return No_Of_Payments_InRepaymentPlan;
	}
	//_popup_path_sol_ok
	@FindBy(id =  "_popup_path_sol_ok")
	private WebElement Popup_NoOfPayments_InRepaymentPlan;
	public WebElement Popup_NoOfPayments_InRepaymentPlan() {
	return Popup_NoOfPayments_InRepaymentPlan;
	}
	
	@FindBy(xpath =  "//button[@id='createSchedule_WIFT001MT']")
	private WebElement createSchedule_InRepaymentPlan;
	public WebElement createSchedule_InRepaymentPlan() {
	return createSchedule_InRepaymentPlan;
	}
	
	@FindBy(id =  "_popup_path_sol_confirm")
	private WebElement Warning_popup_No_In_RepaymentPlan;
	public WebElement Warning_popup_No_In_RepaymentPlan() {
	return Warning_popup_No_In_RepaymentPlan;
	}
	
	@FindBy(xpath =  "//button[@id='applicationfacility_save_btn_WIFT001MT']")
	private WebElement Validate_Button;
	public WebElement Validate_Button() {
	return Validate_Button;
	}
	
//	_popup_path_sol_confirm_ok      Warning_ConfirmValidateProcess
//  _popup_path_sol_confirm_ok      Confirm_alreadyCreated
//  _popup_path_sol_confirm_ok       Success_ValidateSuccessfully
//  dismissbut_WIFT001MT			SendAlert_Dismiss
	
	
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
    private WebElement warning_popup_ok_btn;
    public WebElement WarningPopupOkBtn() {
        return warning_popup_ok_btn;
    }

    @FindBy(xpath = "//*[@id='_popup_path_sol_ok']")
    private WebElement success_popup_ok_btn;
    public WebElement SuccessPopupOkBtn() {
        return success_popup_ok_btn;
    }

    @FindBy(xpath = "//button[@id='applicationfacility_save_btn_WIFT001MT']")
    private WebElement limit_details_validate_btn;
    public WebElement limitDetailsValidateBtn() {
        return limit_details_validate_btn;
    }

    @FindBy(xpath = "//div[text()='CONFIRM']")
    private WebElement confirm_popup;
    public WebElement confirmPopup() {
        return confirm_popup;
    }

    @FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
    private WebElement facility_already_created_popup_Msg;
    public WebElement facilityAlreadyCreatedPopupMsg() {
        return facility_already_created_popup_Msg;
    }

    @FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
    private WebElement facility_already_created_popup;
    public WebElement facilityAlreadyCreatedPopup() {
        return facility_already_created_popup;
    }

    @FindBy(xpath = "//div[text()='Success']")
    private WebElement success_popup;
    public WebElement successPopup() {
        return success_popup;
    }

    @FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
    private WebElement success_popup_msg;
    public WebElement successPopupMessage() {
        return success_popup_msg;
    }

    @FindBy(xpath = "(//a[@class='ui-dialog-titlebar-close ui-corner-all'])[9]")
    private WebElement send_alert_popup;
    public WebElement sendAlertPopup() {
        return send_alert_popup;
    }
	
	
	
	
	
	@FindBy(xpath =  "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Validate_Warning_ConfirmValidateProcess;
	public WebElement Validate_Warning_ConfirmValidateProcess() {
	return Validate_Warning_ConfirmValidateProcess;
	}
	
	@FindBy(xpath =  "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Validate_Confirm_alreadyCreated;
	public WebElement Validate_Confirm_alreadyCreated() {
	return Validate_Confirm_alreadyCreated;
	}
	
	@FindBy(xpath =  "//input[@id='_popup_path_sol_ok']")
	private WebElement Validate_Success_ValidateSuccessfull;
	public WebElement Validate_Success_ValidateSuccessfull() {
	return Validate_Success_ValidateSuccessfull;
	}
	
	@FindBy(xpath =  "//span[text()=' Dismiss ']")
	private WebElement Validate_SendAlert_Dismiss;
	public WebElement Validate_SendAlert_Dismiss() {
	return Validate_SendAlert_Dismiss;
	}
	
	//------------------approvel level
	
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
	private WebElement approve_level1_select_decision;
	public WebElement approveLevel1SelectDecision() {
		return approve_level1_select_decision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel1_btn_WIFT001AP1']")
	private WebElement approve_level1_submit_btn;
	public WebElement approveLevel1SubmitBtn() {
		return approve_level1_submit_btn;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP1_gs_fmsApplVO.CODE']")
	private WebElement Enter_ValidateCode_approve_level1;
	public WebElement Enter_ValidateCode_approve_level1() {
		return Enter_ValidateCode_approve_level1;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP2_gs_fmsApplVO.CODE']")
	private WebElement Enter_ValidateCode_approve_level2;
	public WebElement Enter_ValidateCode_approve_level2() {
		return Enter_ValidateCode_approve_level2;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP3_gs_fmsApplVO.CODE']")
	private WebElement Enter_ValidateCode_approve_level3;
	public WebElement Enter_ValidateCode_approve_level3() {
		return Enter_ValidateCode_approve_level3;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP1_1_fmsApplVO.CODE']")
	private WebElement ClickTheValue_ValidateCode_approve_level1;
	public WebElement ClickTheValue_ValidateCode_approve_level1() {
		return ClickTheValue_ValidateCode_approve_level1;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP2_1_fmsApplVO.CODE']")
	private WebElement ClickTheValue_ValidateCode_approve_level2;
	public WebElement ClickTheValue_ValidateCode_approve_level2() {
		return ClickTheValue_ValidateCode_approve_level2;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP3_1_fmsApplVO.CODE']")
	private WebElement ClickTheValue_ValidateCode_approve_level3;
	public WebElement ClickTheValue_ValidateCode_approve_level3() {
		return ClickTheValue_ValidateCode_approve_level3;
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
	public WebElement approveLevel2SelectDecision() {
		return approve_level2_select_devision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel2_btn_WIFT001AP2']")
	private WebElement approve_level2_submit_btn;
	public WebElement approveLevel2SubmitBtn() {
		return approve_level2_submit_btn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement button_confirm_ok;
	public WebElement ButtonConfirmOk1() {
		return button_confirm_ok;
	}
	
	@FindBy(xpath = "//*[@id='_popup_path_sol_ok']")
	private WebElement button_success_ok;
	public WebElement ButtonSuccessOk1() {
		return button_success_ok;
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
	public WebElement approveLevel3SelectDecision() {
		return approve_level3_select_devision;
	}
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel3_btn_WIFT001AP3']")
	private WebElement approve_level3_submit_btn;
	public WebElement approveLevel3SubmitBtn() {
		return approve_level3_submit_btn;
	}
	
	
	//----------------- @814762 facility management screen
	
	
	
	@FindBy(xpath = "//td[text()='Facilities Management']")
	private WebElement facilityManagement_screen;
	public WebElement facilityManagement_screen() {
		return facilityManagement_screen;
	}
	
	@FindBy(xpath = "//a[@id='WIFT008UP']/span[text()='Update After Approve']")
	private WebElement updateAfterApprove_screen;
	public WebElement updateAfterApprove_screen() {
		return updateAfterApprove_screen;
	}
	
	@FindBy(xpath = "//td[@id='facilityManagementGridTbl_Id_WIFT008UP_pager_left']/table/tbody/tr/td[7][text()='Clear']")
	private WebElement clearButton_InUpdateApproveScreen;
	public WebElement clearButton_InUpdateApproveScreen() {
		return clearButton_InUpdateApproveScreen;
	}
	
	@FindBy(xpath = "//table[@id='facilityManagementGridTbl_Id_WIFT008UP']/tbody/tr[2]")
	private WebElement retriveData_InUpdateApproveScreen;
	public WebElement retriveData_InUpdateApproveScreen() {
		return retriveData_InUpdateApproveScreen;
	}
	
	@FindBy(id = "facilityApplicationDetailsTab_WIFT008UP")
	private WebElement facilityApplicationDetails_InUpdateApproveScreen;
	public WebElement facilityApplicationDetails_InUpdateApproveScreen() {
		return facilityApplicationDetails_InUpdateApproveScreen;
	}
	
	@FindBy(id = "facilityMgtAppDet_Exceed_Facility_Sublimit_WIFT008UP")
	private WebElement exceedFacilityAtSublimit_InUpdateApproveScreen;
	public WebElement exceedFacilityAtSublimit_InUpdateApproveScreen() {
		return exceedFacilityAtSublimit_InUpdateApproveScreen;
	}
	
	@FindBy(id = "facilityManagementSubjectFullRepaymentYN_WIFT008UP")
	private WebElement subjectTofullRepayment_InUpdateApproveScreen;
	public WebElement subjectTofullRepayment_InUpdateApproveScreen() {
		return subjectTofullRepayment_InUpdateApproveScreen;
	}
	
	@FindBy(id = "facilityLimitDetailsTab_WIFT008UP")
	private WebElement facilityLimitDetails_InUpdateApproveScreen;
	public WebElement facilityLimitDetails_InUpdateApproveScreen() {
		return facilityLimitDetails_InUpdateApproveScreen;
	}
	
	@FindBy(xpath = "//td[@id='td_FacilityManagementFacilityLimitDetailsGrid_WIFT008UP_1_fmsFacilityDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement productClass_InfacilityLimitDetails_InUpdateApproveScreen;
	public WebElement productClass_InfacilityLimitDetails_InUpdateApproveScreen() {
		return productClass_InfacilityLimitDetails_InUpdateApproveScreen;
	}
	
	@FindBy(id = "facilityMgtLimitDetailsCAP_RATE_WIFT008UP")
	private WebElement capRate_InLimitDetails_InUpdateApproveScreen;
	public WebElement capRate_InLimitDetails_InUpdateApproveScreen() {
		return capRate_InLimitDetails_InUpdateApproveScreen;
	}
	
	@FindBy(id = "facilityMgtLimitDetailsSELLING_PRICE_WIFT008UP")
	private WebElement sellingPrice_InLimitDetails_InUpdateApproveScreen;
	public WebElement sellingPrice_InLimitDetails_InUpdateApproveScreen() {
		return sellingPrice_InLimitDetails_InUpdateApproveScreen;
	}
	
	@FindBy(id = "facilityManagement_limitDetails_edit_btn_WIFT008UP")
	private WebElement EditBUtton_InLimitDetails_InUpdateApproveScreen;
	public WebElement EditBUtton_InLimitDetails_InUpdateApproveScreen() {
		return EditBUtton_InLimitDetails_InUpdateApproveScreen;
	}
	
	@FindBy(id = "DocumentDetailsTab_WIFT008UP")
	private WebElement documentDetails_InUpdateApproveScreen;
	public WebElement documentDetails_InUpdateApproveScreen() {
		return documentDetails_InUpdateApproveScreen;
	}
	
	@FindBy(id = "td_FacilityManagementDocumentDetailsGrid_WIFT008UP_0_rn")
	private WebElement clickfirstRow1buttonButton_InDocumentDetails;
	public WebElement clickfirstRow1buttonButton_InDocumentDetails() {
		return clickfirstRow1buttonButton_InDocumentDetails;
	}
	
	
	@FindBy(xpath = "//td[@id='td_FacilityManagementDocumentDetailsGrid_WIFT008UP_1_fmsFacDocumentsVO.SOL_DATE_SENT']")
	private WebElement solicitorDataSend_InDocumentDetails;
	public WebElement solicitorDataSend_InDocumentDetails() {
		return solicitorDataSend_InDocumentDetails;
	}
	
	@FindBy(xpath = "//td[@id='td_FacilityManagementDocumentDetailsGrid_WIFT008UP_1_fmsFacDocumentsVO.SOL_DATE_REC']")
	private WebElement solicitorDataReceived_InDocumentDetails;
	public WebElement solicitorDataReceived_InDocumentDetails() {
		return solicitorDataReceived_InDocumentDetails;
	}
	
	@FindBy(xpath = "//td[@id='td_FacilityManagementDocumentDetailsGrid_WIFT008UP_1_fmsFacDocumentsVO.EST_DATE_SENT']")
	private WebElement estimatorDateSent_InDocumentDetails;
	public WebElement estimatorDateSent_InDocumentDetails() {
		return estimatorDateSent_InDocumentDetails;
	}
	
	@FindBy(xpath = "//td[@id='td_FacilityManagementDocumentDetailsGrid_WIFT008UP_1_fmsFacDocumentsVO.EST_DATE_REC']")
	private WebElement estimatorDateRecevied_InDocumentDetails;
	public WebElement estimatorDateRecevied_InDocumentDetails() {
		return estimatorDateRecevied_InDocumentDetails;
	}
	
	@FindBy(xpath = "//td[@id='td_FacilityManagementDocumentDetailsGrid_WIFT008UP_1_fmsFacDocumentsVO.CUSTODIAN_SENT']")
	private WebElement custodianDateSent_InDocumentDetails;
	public WebElement custodianDateSent_InDocumentDetails() {
		return custodianDateSent_InDocumentDetails;
	}
	
	@FindBy(xpath = "//td[@id='td_FacilityManagementDocumentDetailsGrid_WIFT008UP_1_fmsFacDocumentsVO.CUSTODIAN_SENT']")
	private WebElement solicitorDataSendRow2_InDocumentDetails;
	public WebElement solicitorDataSendRow2_InDocumentDetails() {
		return solicitorDataSendRow2_InDocumentDetails;
	}
	
	@FindBy(xpath = "//a[@id='WIFT008AP']/span[text()='Approve/Reject']")
	private WebElement approveRejectScreen_FM;
	public WebElement approveRejectScreen_FM() {
		return approveRejectScreen_FM;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008AP_gs_fmsFacilityVO.CODE']")
	private WebElement enterCode_InapprovelScreen;
	public WebElement enterCode_InapprovelScreen() {
		return enterCode_InapprovelScreen;
	}
	
//	@FindBy(xpath = "//tr[@id='1']")
//	private WebElement selectFirstRow_InapprovelScreen;
//	public WebElement enterCode_InapprovelScreen() {
//		return enterCode_InapprovelScreen;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
