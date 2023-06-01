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
	
	@FindBy(xpath =  "//td[@id='add_ApplicationFacilityLimitDetailsGrid_WIFT001MT']")
	private WebElement Click_AddButtonon_limit_Detail;
	public WebElement getClick_AddButtonon_limit_Detail() {
		return Click_AddButtonon_limit_Detail;
	}
	
	@FindBy(xpath =  "//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement Enter_ValueOn_Product_Class;
	public WebElement getEnter_ValueOn_Product_Class() {
		return Enter_ValueOn_Product_Class;
	}
	
	@FindBy(xpath =  "//span[@id='spanLookup_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement AfterEnter_ValueOn_Product_Class_Search;
	public WebElement getAfterEnter_ValueOn_Product_Class_Search() {
		return AfterEnter_ValueOn_Product_Class_Search;
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
	
	@FindBy(xpath =  "//Button[@id='applicationfacility_save_as_draft_btn_WIFT001MT']")
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
	
	
	
	@FindBy(id =  "applicationfacilityLimitDetailsEXPECTED_PAYMENT_DATE_WIFT001MT")
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
	
	@FindBy(id =  "applicationFacilityDocumentDetailsTabs_WIFT001AP1")
	private WebElement Click_Document_Details;
	public WebElement Click_Document_Details() {
		return Click_Document_Details;
	}
	
	@FindBy(id =  "applicationFacilityDocumentDetailsTabs_WIFT001AP1")
	private WebElement EnterTheValue_Solicitor_Name;
	public WebElement EnterTheValue_Solicitor_Name() {
		return EnterTheValue_Solicitor_Name;
	}
	
	@FindBy(id =  "applicationFacilityDocumentDetailsTabs_WIFT001AP1")
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
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_DownPaymentAmount_key")
	private WebElement DownPaymentAmount_InLImitDetails_SubMenu;
	public WebElement DownPaymentAmount_InLImitDetails_SubMenu() {
		return DownPaymentAmount_InLImitDetails_SubMenu;
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
	
}
