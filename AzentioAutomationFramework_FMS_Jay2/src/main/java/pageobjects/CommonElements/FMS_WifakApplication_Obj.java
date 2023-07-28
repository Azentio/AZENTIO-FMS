package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FMS_WifakApplication_Obj {

	WebDriver driver;

	public FMS_WifakApplication_Obj(WebDriver driver) {
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
	public WebElement getWifak_Application_first_610() {
		return Wifak_Application_first;
	}
	
	@FindBy(xpath =  "//div[@id='_selenuimWIF']/li/a/table/tbody/tr/td[1]/span/span")
	private WebElement Wifak_Application_second;
	public WebElement getWifak_Application_second_610() {
		return Wifak_Application_second;
	}
	
	@FindBy(xpath = "//a[@id='tech_details_icon_id']")
	private WebElement technicalDetails_610;
	public WebElement technicalDetails_610() {
		return technicalDetails_610; 
	}

    @FindBy(xpath = "//label[contains(text(),'Clear Cache ')]")
	private WebElement FSM_ClearCacheInTechnicalDetailsIcon_610;
	public WebElement FSM_ClearCacheInTechnicalDetailsIcon_610() {
        return FSM_ClearCacheInTechnicalDetailsIcon_610;
    }
	
	@FindBy(id = "_popup_path_sol_ok")
    private WebElement Ok;
    public WebElement Ok() {
        return Ok;
    }

   	
	//-----Facilities Management  in application for facility
	@FindBy(xpath =  "//td[text()='Facilities Management']")
	private WebElement Click_Facilities_Management;
	public WebElement Click_Facilities_Management_610() {
		return Click_Facilities_Management;
	}
	
	@FindBy(xpath =  "//a[@id='WIFT008MT']")
	private WebElement Click_Maintenance_In_Facilities_Management;
	public WebElement Click_Maintenance_In_Facilities_Management_610() {
		return Click_Maintenance_In_Facilities_Management;
	}
	
	@FindBy(id =  "lookuptxt_facilityMgtMainApplicationRef_WIFT008MT")
	private WebElement Click_Application_Ref;
	public WebElement Click_Application_Ref_610() {
		return Click_Application_Ref;
	}
	
		
	@FindBy(xpath =  "//span[text()='Facility Limit Details']")
	private WebElement Click_facility_Limit_Details;
	public WebElement Click_facility_Limit_Details_610() {
		return Click_facility_Limit_Details;
	}
	
	@FindBy(id =  "td_FacilityManagementFacilityLimitDetailsGrid_WIFT008MT_1_fmsFacilityDetVO.GENERAL_FACILITY_TYPE")
	private WebElement DoubleClick_ProductClassIN_facility_Limit_Details;
	public WebElement DoubleClick_ProductClassIN_facility_Limit_Details_610() {
		return DoubleClick_ProductClassIN_facility_Limit_Details;
	}
	
	@FindBy(id =  "facilityMgtLimitDetailsMATURITY_DATE_WIFT008MT")
	private WebElement Enter_Previous_dataIn_MaturityDate;
	public WebElement Enter_Previous_dataIn_MaturityDate_610() {
		return Enter_Previous_dataIn_MaturityDate;
	}
	
	@FindBy(xpath =  "//div[text()='[20158] Maturity Date cannot be Less than System Date']")
	private WebElement Validate_dataIn_MaturityDate;
	public WebElement Validate_dataIn_MaturityDate_610() {
		return Validate_dataIn_MaturityDate;
	}
	//----------------------
	@FindBy(xpath =  "//td[text()='Application For Financial Facilities']")
	private WebElement Application_for_financial_facilities;
	public WebElement getApplication_for_financial_facilities_610() {
		return Application_for_financial_facilities;
	}
	
	@FindBy(xpath =  "//span[text()='Maintenance']")
	private WebElement maintenance;
	public WebElement getMaintenance_610() {
		return maintenance;
	}
	
	@FindBy(xpath =  "//select[@id='applicationFacilityApplicationfor_WIFT001MT']")
	private WebElement Application_for;
	public WebElement getApplication_for_610() {
		return Application_for;
	}
	
	@FindBy(xpath =  "//input[@id='lookuptxt_applicationFacilitycif_WIFT001MT']")
	private WebElement CIF_no;
	public WebElement getCIF_no_610() {
		return CIF_no;
	}
	
	@FindBy(xpath =  "//span[@id='spanLookup_applicationFacilitycif_WIFT001MT']/span")
	private WebElement Click_SearchIcon_On_CIF_no;
	public WebElement getClick_SearchIcon_On_CIF_no_610() {
		return Click_SearchIcon_On_CIF_no;
	}
	

	@FindBy(xpath =  "//input[@id='lookuptxt_applicationFacilityFacilityType_WIFT001MT']")   
	private WebElement Enter_codeOn_Facility_Type;
	public WebElement getEnter_codeOn_Facility_Type_610() {
		return Enter_codeOn_Facility_Type;
	}
		

	@FindBy(xpath =  "//input[@id='lookuptxt_applicationFacilityCountry_WIFT001MT']")  
	private WebElement EnterCodeIn_Country_of_Financing;
	public WebElement getEnterCodeIn_Country_of_Financing_610() {
		return EnterCodeIn_Country_of_Financing;
	}
	
	@FindBy(xpath =  "//span[contains(text(),'Yes')]")  
	private WebElement Post_Approvel_yes;
	public WebElement Post_Approvel_yes_610() {
		return Post_Approvel_yes;
	}

	@FindBy(xpath =  "//input[@name='applicationFacilityCO.fmsApplVO.FACILITY_RATING_GRADE']")
	private WebElement Enter_lineCodeOn_Facility_Rating;
	public WebElement getEnter_lineCodeOn_Facility_Rating_610() {
		return Enter_lineCodeOn_Facility_Rating;
	}
	
	@FindBy(xpath =  "//td[@id='applicationFacilityfacilitytypesection_WIFT001MT']/table")
	private WebElement AfterEnter_lineCodeOn_Facility_Rating_ClickOut;
	public WebElement getAfterEnter_lineCodeOn_Facility_Rating_ClickOut_610() {
		return AfterEnter_lineCodeOn_Facility_Rating_ClickOut;
	}
	
		
	@FindBy(xpath =  "//li[@id='applicationFacilityAdditionDetailsTabs_WIFT001MT']")
	private WebElement Clickon_additionalDetails;
	public WebElement getClickon_additionalDetails_610() {
		return Clickon_additionalDetails;
	}
	
	@FindBy(xpath =  "//input[@id='applicationFacilitytotalvalue_WIFT001MT']")
	private WebElement Enter_TotalValue;
	public WebElement getEnter_TotalValue_610() {
		return Enter_TotalValue;
	}
	
	@FindBy(xpath =  "//td[@id='applicationFacilityLimitDetailssection_WIFT001MT']/table[1]/tbody")
	private WebElement After_Enter_TotalValue_ClickOut;
	public WebElement getAfter_Enter_TotalValue_ClickOut_610() {
		return After_Enter_TotalValue_ClickOut;
	}
	
	
	@FindBy(xpath =  "//span[text()='Additional Details']y")
	private WebElement ClickOn_mainTab;
	public WebElement getClickOn_mainTab_610() {
		return ClickOn_mainTab;
	}
	
	@FindBy(xpath =  "//td[@id='applicationFacilityDateDetailssection_WIFT001MT']/table/tbody/tr[3]/td[2]/div/img")
	private WebElement Click_Offer_Expiration;
	public WebElement getClick_Offer_Expiration_610() {
		return Click_Offer_Expiration;
	}
	
	@FindBy(xpath =  "//input[@id='applicationFacilityofferexpirydate_WIFT001MT']")
	private WebElement Click_Offer_Expiration_SelectDate;
	public WebElement getClick_Offer_Expiration_SelectDate_610() {
		return Click_Offer_Expiration_SelectDate;
	}

	@FindBy(xpath =  "//li[@id='applicationFacilityLimitDetailsTabs_WIFT001MT']/a/span")
	private WebElement Select_limitDetails;
	public WebElement getSelect_limitDetails_610() {
		return Select_limitDetails;
	}
	
//	@FindBy(xpath =  "//td[@id='add_ApplicationFacilityLimitDetailsGrid_WIFT001MT']")
	@FindBy(xpath =  "//td[@id='add_ApplicationFacilityLimitDetailsGrid_WIFT001MT']")
	private WebElement getClick_AddButtonon_limit_Detail;
	public WebElement getClick_AddButtonon_limit_Detail_610() {
		return getClick_AddButtonon_limit_Detail;
	}
	
	
	
	@FindBy(xpath =  "//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement Enter_ValueOn_Product_Class;
	public WebElement getEnter_ValueOn_Product_Class_610() {
		return Enter_ValueOn_Product_Class;
	}
	
	@FindBy(xpath =  "//input[@id='applicationFacilityfinancedamount_WIFT001MT']")
	private WebElement financeAmount_InAdditionalDetails_610;
	public WebElement financeAmount_InAdditionalDetails_610() {
		return financeAmount_InAdditionalDetails_610;
	}
	
	//input[@id='applicationfacilityLimitDetailsFACILITY_VALUE_WIFT001MT']
	@FindBy(xpath =  "//input[@id='applicationfacilityLimitDetailsFACILITY_VALUE_WIFT001MT']")
	private WebElement facilityValue_InAdditionalDetails_610;
	public WebElement facilityValue_InAdditionalDetails_610() {
		return facilityValue_InAdditionalDetails_610;
	}
	
	@FindBy(xpath =  "//input[@id='applicationFacilitydownpayment_WIFT001MT']")
	private WebElement downPayment_InAdditionalDetails;
	public WebElement downPayment_InAdditionalDetails_610() {
		return downPayment_InAdditionalDetails;
	}
	
	@FindBy(xpath =  "//input[@id='applFacilityLimitDetailsTotalDownPayment_WIFT001MT']")
	private WebElement totaldownPayment_InLimitsDetails;
	public WebElement totaldownPayment_InLimitsDetails_610() {
		return totaldownPayment_InLimitsDetails;
	}
	
	//input[@id='applicationfacilityLimitDetailsDOWN_PAYMENT_AMT_WIFT001MT']
	@FindBy(xpath =  "//input[@id='applicationfacilityLimitDetailsDOWN_PAYMENT_AMT_WIFT001MT']")
	private WebElement downPaymentAnount_InLimitsDetails;
	public WebElement downPaymentAnount_InLimitsDetails_610() {
		return downPaymentAnount_InLimitsDetails;
	}
	
	@FindBy(id =  "applicationfacilityLimitDetailsFACILITY_VALUE_WIFT001MT")
	private WebElement Enter_ValueOn_FacilityValue;
	public WebElement Enter_ValueOn_FacilityValue_610() {
		return Enter_ValueOn_FacilityValue;
	}
	
	@FindBy(xpath =  "//div[text()='Please wait while server request completes']")
	private WebElement SeverReruest_Popup;
	public WebElement SeverReruest_Popup_610() {
		return SeverReruest_Popup;
	}
	
	@FindBy(xpath =  "//input[@id='_popup_path_sol_ok']")
	private WebElement ServerReuestOK;
	public WebElement ServerReuestOK_610() {
		return ServerReuestOK;
	}
	
	@FindBy(id =  "lookuptxt_applicationfacilityLimitDetailsPURPOSE_OF_FIN_WIFT001MT")
	private WebElement Enter_ValueOn_PurposeOfFinacing;
	public WebElement Enter_ValueOn_PurposeOfFinacing_610() {
		return Enter_ValueOn_PurposeOfFinacing;
	}
	
	
	@FindBy(xpath =  "//span[@id='spanLookup_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement AfterEnter_ValueOn_Product_Class_Search;
	public WebElement getAfterEnter_ValueOn_Product_Class_Search_610() {
		return AfterEnter_ValueOn_Product_Class_Search;
	}
	
	@FindBy(id =  "ApplicationFacilityLimitDetailsGrid_WIFT001MT")
	private WebElement TableHead_LimitDetails;
	public WebElement TableHead_LimitDetails_610() {
		return TableHead_LimitDetails;
	}
	
	@FindBy(xpath =  "//span[@id='spanLookup_applicationfacilityLimitDetailsACC_SL_NO_WIFT001MT']/span")
	private WebElement Click_Search_Button_Account_No;
	public WebElement Click_Search_Button_Account_No_610() {
		return Click_Search_Button_Account_No;
	}
	
	@FindBy(xpath =  "//tr[@id='3']")
	private WebElement Double_Click_Search_Account_No;
	public WebElement Double_Click_Search_Account_No_610() {
		return Double_Click_Search_Account_No;
	}
	
	
	@FindBy(xpath ="//button[@id='limitDetails_add_btn_WIFT001MT']")
	private WebElement getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd;
	public WebElement getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd_610() {
		return getAfterEnter_ValueOn_Product_Class_Scroll_ToAdd;
	}
	
	//input[@id='_popup_path_sol_ok']
	
	@FindBy(xpath =  "//input[@id='_popup_path_sol_ok']")
	private WebElement Error_Popup_OK;
	public WebElement ErrorPopupOK_610() {
		return Error_Popup_OK;
	}
	
	//----------------------
	
	@FindBy(xpath =  "lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT")
	private WebElement ClickAdd_Button_AfterEnter_ValueOn_Product_Class;
	public WebElement getClickAdd_Button_AfterEnter_ValueOn_Product_Class_610() {
		return ClickAdd_Button_AfterEnter_ValueOn_Product_Class;
	}
	@FindBy(xpath =  "//input[@id='_popup_path_sol_ok']")
	private WebElement After_ClickAdd_Button_Class_Warrning_ClickOk;
	public WebElement getAfter_ClickAdd_Button_Class_Warrning_ClickOk_610() {
		return After_ClickAdd_Button_Class_Warrning_ClickOk;
	}
	
	@FindBy(xpath =  "//input[@id=\"_popup_path_sol_ok\"]")
	private WebElement After_ClickAdd_Button_Class_select_rowWarrning_ClickOk;
	public WebElement getAfter_ClickAdd_Button_Class_select_rowWarrning_ClickOk_610() {
		return After_ClickAdd_Button_Class_select_rowWarrning_ClickOk;
	}
	
	//----------------------------
	
	@FindBy(xpath =  "//button[@id='applicationfacility_FixedAssets_btn_WIFT001MT']")
	private WebElement Click_FixedAssert_Button;
	public WebElement getClick_FixedAssert_Button_610() {
		return Click_FixedAssert_Button;
	}
	
	@FindBy(xpath =  "//td[@id='add_FmsIjaraFixedAssetsGrid_WIFT001MT']/div/span")
	private WebElement Click_AddButton_OnFixedAssert_screen;
	public WebElement getClick_AddButton_OnFixedAssert_screen_610() {
		return Click_AddButton_OnFixedAssert_screen;
	}

	//td[@id='td_FmsIjaraFixedAssetsGrid_WIFT001MT_1_rn']
	@FindBy(xpath =  "//td[@id='td_FmsIjaraFixedAssetsGrid_WIFT001MT_1_rn']")
	private WebElement Click_value_1_on_Catagory;
	public WebElement Click_value_1_on_Catagory_610() {
		return Click_value_1_on_Catagory;
	}
	
	
	@FindBy(xpath =  "//input[@name='lookupTxt_fmsFacilityAssetVO.CATEGORY_CODE']")
	private WebElement Enter_value_on_Catagory;
	public WebElement getEnter_value_on_Catagory_610() {
		return Enter_value_on_Catagory;
	}
	
	@FindBy(xpath =  "//input[@name='lookupTxt_fmsFacilityAssetVO.CLASS_CODE']")
	private WebElement Enter_value_on_Class;
	public WebElement getEnter_value_on_Class_610() {
		return Enter_value_on_Class;
	}
	
	@FindBy(xpath =  "//input[@name='lookupTxt_fmsFacilityAssetVO.CIF_NO']")
	private WebElement Enter_value_on_vendor;
	public WebElement getEnter_value_on_vendor_610() {
		return Enter_value_on_vendor;
	}
	
	@FindBy(xpath =  "//td[@id='td_FmsIjaraFixedAssetsGrid_WIFT001MT_1_fmsFacilityAssetVO.QUANTITY']/div/input")
	private WebElement Enter_value_on_quantity;
	public WebElement getEnter_value_on_quantity_610() {
		return Enter_value_on_quantity;
	}
	
	@FindBy(xpath =  "//td[@id='td_FmsIjaraFixedAssetsGrid_WIFT001MT_1_fmsFacilityAssetVO.UNIT']/input")
	private WebElement Enter_value_on_Unit;
	public WebElement getEnter_value_on_Unit_610() {
		return Enter_value_on_Unit;
	}
	
	@FindBy(xpath =  "//input[@name='lookupTxt_fmsFacilityAssetVO.CURRENCY']")
	private WebElement Enter_value_on_Cy;
	public WebElement getEnter_value_on_Cy_610() {
		return Enter_value_on_Cy;
	}
	
	@FindBy(xpath =  "//td[@id='td_FmsIjaraFixedAssetsGrid_WIFT001MT_1_fmsFacilityAssetVO.UNIT_COST']/div/input")
	private WebElement Enter_value_on_UnitCost;
	public WebElement getEnter_value_on_UnitCost_610() {
		return Enter_value_on_UnitCost;
	}   
	
	@FindBy(xpath =  "//input[@name='lookupTxt_fmsFacilityAssetVO.VAT_CODE']")
	private WebElement Enter_value_on_Vat_Code;
	public WebElement Enter_value_on_Vat_Code_610() {
		return Enter_value_on_Vat_Code;
	}
	
	
	@FindBy(xpath =  "//td[@id='td_FmsIjaraFixedAssetsGrid_WIFT001MT_1_fmsFacilityAssetVO.VAT_AMOUNT']")
	private WebElement ValidateVATAmountDisplaying_FixedAssert_610;
	public WebElement ValidateVATAmountDisplaying_FixedAssert_610() {
		return ValidateVATAmountDisplaying_FixedAssert_610;
	}
	
	
	
	@FindBy(xpath =  "/html/body/div[56]/div[11]/div/button/span")
	private WebElement Click_OkButton_OnFixedAssertKey_Screen;
	public WebElement getClick_OkButton_OnFixedAssertKey_Screen_610() {
		return Click_OkButton_OnFixedAssertKey_Screen;
	}
	
	@FindBy(xpath =  "//button[@id='applicationfacility_save_as_draft_btn_WIFT001MT']")
	private WebElement SaveButton_OnLimitDetail;
	public WebElement SaveButton_OnLimitDetail_610() {
		return SaveButton_OnLimitDetail;
	}
	
	//-------------- Holiday 
	
	@FindBy(xpath =  "//input[@id='applicationFacilityofferexpirydate_WIFT001MT']")
	private WebElement Expiratin_date_additional_Details;
	public WebElement Expiratin_date_additional_Details_610(){
		return Expiratin_date_additional_Details;
	}
	
	@FindBy(xpath =  "a//div[contains(text(),'Is a Holiday')]")
	private WebElement validate_holidayDate;
	public WebElement validate_holidayDate_610(){
		return validate_holidayDate;
	}
	
	@FindBy(id =  "_popup_path_sol_confirm_ok")
	private WebElement Confirm_theRequested_Holiday_date;
	public WebElement Confirm_theRequested_Holiday_date_610(){
		return Confirm_theRequested_Holiday_date;
	}
	
		
	@FindBy(id =  "_popup_path_sol_confirm_ok")
	private WebElement Confirm_theRequested_Holiday_date_In_LimitsDetails;
	public WebElement Confirm_theRequested_Holiday_date_In_LimitsDetails_610(){
		return Confirm_theRequested_Holiday_date_In_LimitsDetails;
	}
	
	
	
	@FindBy(xpath =  "//input[@id='applicationfacilityLimitDetailsEXPECTED_PAYMENT_DATE_WIFT001MT']")
	private WebElement Expected_Payment_Date_inLimit_Details_SubMenu;
	public WebElement ExpectedPaymenDate_inLimitDetails_SubMenu_610(){
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
	public WebElement getClickOk_saveOn_Draft_WarrningScreen_610() {
		return ClickOk_saveOn_Draft_WarrningScreen;
	}
	
	@FindBy(xpath =  "//input[@id='_popup_path_sol_ok']")
	private WebElement ClickOk_OnSuccess_Screen;
	public WebElement getClickOk_OnSuccess_Screen_610() {
		return ClickOk_OnSuccess_Screen;
	}
	
	//-----------------------------------
	
	@FindBy(xpath =  "//label[text()='FX Settlement Expiry Date '")
	private WebElement Fx_Settlement_Expery_Date;
	public WebElement FxSettlementExperyDate_610() {
		return Fx_Settlement_Expery_Date;
	}
	
	@FindBy(id =  "id=applicationFacilityFxSettlementExpiryDate_WIFT001MT")
	private WebElement FxSettlementExperyDate_Above;
	public WebElement FxSettlementExperyDateAbove_610() {
		return FxSettlementExperyDate_Above;
	}
	
	@FindBy(xpath =  "//div[text()='[905] Date cannot be less than Running Date']")
	private WebElement FxSettlementExperyDate_Below;
	public WebElement FxSettlementExperyDateBelow_610() {
		return FxSettlementExperyDate_Below;
	}
	
	//-----------------------------@
	
	@FindBy(xpath =  "//span[@id='spanLookup_applicationfacilityLimitDetailsACC_SL_NO_WIFT001MT']")
	private WebElement Search_Button_In_Account_No;
	public WebElement Search_Button_In_Account_No_610() {
		return Search_Button_In_Account_No;
	}
	
	@FindBy(id =  "applicationfacilityLimitDetailsACC_CY_WIFT001MT")
	private WebElement Currency__Button_In_Account_No;
	public WebElement Currency__Button_In_Account_No_610() {
		return Currency__Button_In_Account_No;
	}
	
	@FindBy(id =  "applicationfacilityLimitDetailsACC_GL_WIFT001MT")
	private WebElement GLCode__Button_In_Account_No;
	public WebElement GLCode__Button_In_Account_No_610() {
		return GLCode__Button_In_Account_No;
	}
	
	@FindBy(id =  "lookuptxt_applicationfacilityLimitDetailsACC_SL_NO_WIFT001MT")
	private WebElement Serial__Button_In_Account_No;
	public WebElement Serial__Button_In_Account_No_610() {
		return Serial__Button_In_Account_No;
	}
	
	@FindBy(id =  "lookuptxt_applicationfacilityLimitDetailsACC_Add_Det_WIFT001MT")
	private WebElement Enter_Account_Number;
	public WebElement Enter_Account_Number_610() {
		return Enter_Account_Number;
	}
			
	
	@FindBy(id =  "applicationfacility_chargesdtls_btn_WIFT001MT")
	private WebElement Click_Charges_Details;
	public WebElement Click_Charges_Details_610() {
		return Click_Charges_Details;
	}
	

	@FindBy(id =  "td_FacilityChargesGrid_WIFT001MT_0_rn")
	private WebElement Click_1_In_Charges_Details;
	public WebElement Click_1_In_Charges_Details_610() {
		return Click_1_In_Charges_Details;
	}
	
	@FindBy(id =  "1_fmsapplchargesVO.COLLECT_AT_FAC_APPROVAL_FacilityChargesGrid_WIFT001MT")
	private WebElement Check_Flag_In_Collect_At_Fac_Approvel;
	public WebElement Check_Flag_In_Collect_At_Fac_Approvel_610() {
		return Check_Flag_In_Collect_At_Fac_Approvel;
	}
	
	@FindBy(xpath =  "//span[text()='Ok']")
	private WebElement Click_Ok_Button_In_Collect_At_Fac_Approvel;
	public WebElement Click_Ok_Button_In_Collect_At_Fac_Approvel_610() {
		return Click_Ok_Button_In_Collect_At_Fac_Approvel;
	}
	
	@FindBy(id =  "_popup_path_sol_confirm_ok")
	private WebElement Ok_Button_In_Waring_Screen;
	public WebElement Ok_Button_In_Waring_Screen_610() {
		return Ok_Button_In_Waring_Screen;
	}
	
	@FindBy(xpath =  "//div[text()='Warning']")
	private WebElement Waring_Screen;
	public WebElement Waring_Screen_610() {
		return Waring_Screen;
	}
	
	//div[text()='Warning']
	@FindBy(id =  "_popup_path_sol_confirm_ok")
	private WebElement Ok_Button_In_Confirm_Screen;
	public WebElement Ok_Button_In_Confirm_Screen_610() {
		return Ok_Button_In_Confirm_Screen;
	}
	
	@FindBy(id =  "_popup_path_sol_ok")
	private WebElement Ok_Button_In_Sucess_Screen;
	public WebElement Ok_Button_In_Sucess_Screen_610() {
		return Ok_Button_In_Sucess_Screen;
	}
	
	@FindBy(id =  "applicationfacility_save_btn_WIFT001MT")
	private WebElement ValidateButton;
	public WebElement ValidateButton_610() {
		return ValidateButton;
	}
	
	@FindBy(xpath =  "//div[text()='Please wait while server request completes']")
	private WebElement PopupBefore_ValidateButton;
	public WebElement PopupBefore_ValidateButton_610() {
		return PopupBefore_ValidateButton;
	}
	
	@FindBy(xpath =  "//input[@id='_popup_path_sol_ok']")
	private WebElement ServerReuest;
	public WebElement ServerReuest_610() {
		return ServerReuest;
	}
	
	@FindBy(xpath =  "//span[contains(text(),'Document Details')]")
	private WebElement Click_Document_Details;
	public WebElement Click_Document_Details_610() {
		return Click_Document_Details;
	}
	
	@FindBy(xpath =  "//input[@name='applicationFacilityCO.fmsApplSolestVO.SOLICITOR']")
	private WebElement EnterTheValue_Solicitor_Name;
	public WebElement EnterTheValue_Solicitor_Name_610() {
		return EnterTheValue_Solicitor_Name;
	}
	
	@FindBy(xpath =  "//input[@name='applicationFacilityCO.fmsApplSolestVO.ESTIMATOR']")
	private WebElement EnterTheValue_Estimator_Name;
	public WebElement EnterTheValue_Estimator_Name_610() {
		return EnterTheValue_Estimator_Name;
	}
	
		
	@FindBy(id =  "_popup_path_sol_confirm_ok")
	private WebElement Informatio_Refresh_page_Cancel;
	public WebElement Informatio_Refresh_page_Cancel_610() {
		return Informatio_Refresh_page_Cancel;
	}
	
	
		
	//-------- 592279 TSR- SUPT170522 - Label missing limit Details
	
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Item_Key")
	private WebElement Items_InLImitDetails_SubMenu;
	public WebElement Items_InLImitDetails_SubMenu_610() {
		return Items_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_ProductClass_key")
	private WebElement ProductClass_InLImitDetails_SubMenu;
	public WebElement ProductClass_InLImitDetails_SubMenu_610() {
		return ProductClass_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_ProductClass_key")
	private WebElement Type_InLImitDetails_SubMenu;
	public WebElement Type_InLImitDetails_SubMenu_610() {
		return Type_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_CashNonCash_key")
	private WebElement CaseNonCase_InLImitDetails_SubMenu;
	public WebElement CaseNonCase_InLImitDetails_SubMenu_610() {
		return CaseNonCase_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Facilityvalue_key")
	private WebElement FacilityValue_InLImitDetails_SubMenu;
	public WebElement FacilityValue_InLImitDetails_SubMenu_610() {
		return FacilityValue_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Exchangerate_key")
	private WebElement ExchangeRate_InLImitDetails_SubMenu;
	public WebElement ExchangeRate_InLImitDetails_SubMenu_610() {
		return ExchangeRate_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_CVValue_key")
	private WebElement CvValue_InLImitDetails_SubMenu;
	public WebElement CvValue_InLImitDetails_SubMenu_610() {
		return CvValue_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_DownPayment_key")
	private WebElement DownPaymentPercentage_InLImitDetails_SubMenu;
	public WebElement DownPaymentPercentage_InLImitDetails_SubMenu_610() {
		return DownPaymentPercentage_InLImitDetails_SubMenu;
	}
	
	@FindBy(xpath =  "//input[@id='applicationfacilityLimitDetailsDOWN_PAYMENT_AMT_WIFT001MT']")
	private WebElement DownPaymentAmount_InLImitDetails_SubMenu;
	public WebElement DownPaymentAmount_InLImitDetails_SubMenu_610() {
		return DownPaymentAmount_InLImitDetails_SubMenu;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilitydownpayment_WIFT001MT']")
	private WebElement DownPaymentAmo_InLImitDetails_SubMenu;
	public WebElement DownPaymentAmo_InLImitDetails_SubMenu_610() {
		return DownPaymentAmo_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilityLimitDetailsDownPaymentToVendorPerc_WIFT001MT")
	private WebElement DownPaymentToVendorPerc_InLImitDetails_SubMenu;
	public WebElement DownPaymentToVendorPerc_InLImitDetails_SubMenu_610() {
		return DownPaymentToVendorPerc_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applFacilityLimitDetailsDownPaymentToVendorAmt_WIFT001MT")
	private WebElement DownPaymentToVendorAmt_InLImitDetails_SubMenu;
	public WebElement DownPaymentToVendorAmt_InLImitDetails_SubMenu_610() {
		return DownPaymentToVendorAmt_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applFacilityLimitDetailsTotalDownPaymentPerc_WIFT001MT")
	private WebElement TotalDownPaymentPerc_InLImitDetails_SubMenu;
	public WebElement TotalDownPaymentPerc_InLImitDetails_SubMenu_610() {
		return TotalDownPaymentPerc_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applFacilityLimitDetailsTotalDownPayment_WIFT001MT")
	private WebElement TotalDownPayment_InLImitDetails_SubMenu;
	public WebElement TotalDownPayment_InLImitDetails_SubMenu_610() {
		return TotalDownPayment_InLImitDetails_SubMenu;
	}
	
	@FindBy(xpath =  "//input[@id='applicationfacilityLimitDetailsTOTAl_FACILITY_VALUE_WIFT001MT']")
	private WebElement TotalFacilityValue_InLImitDetails_SubMenu;
	public WebElement TotalFacilityValue_InLImitDetails_SubMenu_610() {
		return TotalFacilityValue_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_value_date_key")
	private WebElement ValueDate_InLImitDetails_SubMenu;
	public WebElement ValueDate_InLImitDetails_SubMenu_610() {
		return ValueDate_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_maturity_date_key")
	private WebElement Maturity_Date_InLImitDetails_SubMenu;
	public WebElement Maturity_Date_InLImitDetails_SubMenu_610() {
		return Maturity_Date_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_ExpectedPaymentDate_key")
	private WebElement ExpectedPaymentDate_InLImitDetails_SubMenu;
	public WebElement ExpectedPaymentDate_InLImitDetails_SubMenu_610() {
		return ExpectedPaymentDate_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_status_key")
	private WebElement status_InLImitDetails_SubMenu;
	public WebElement status_InLImitDetails_SubMenu_610() {
		return status_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_checkingOn_key")
	private WebElement CheckingOn_InLImitDetails_SubMenu;
	public WebElement CheckingOn_InLImitDetails_SubMenu_610() {
		return CheckingOn_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Account_No_key")
	private WebElement AccountNo_InLImitDetails_SubMenu;
	public WebElement AccountNo_InLImitDetails_SubMenu_610() {
		return AccountNo_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationfacilityLimitDetailsACC_Desc_WIFT001MT")
	private WebElement AccountName_InLImitDetails_SubMenu;
	public WebElement AccountName_InLImitDetails_SubMenu_610() {
		return AccountName_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_FundTransferRate_key")
	private WebElement FundTransferRate_InLImitDetails_SubMenu;
	public WebElement FundTransferRate_InLImitDetails_SubMenu_610() {
		return FundTransferRate_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_TFAMarginRate_key")
	private WebElement TFAMarginRate_InLImitDetails_SubMenu;
	public WebElement TFAMarginRate_InLImitDetails_SubMenu_610() {
		return TFAMarginRate_InLImitDetails_SubMenu;
	}
	 
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_EcoSector_key")
	private WebElement EcoSector_InLImitDetails_SubMenu;
	public WebElement EcoSector_InLImitDetails_SubMenu_610() {
		return EcoSector_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_SubEcoSector_key")
	private WebElement SubEcoSector_InLImitDetails_SubMenu;
	public WebElement SubEcoSector_InLImitDetails_SubMenu_610() {
		return SubEcoSector_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_TFA_Tenure_Days_Key")
	private WebElement TFATenureDays_InLImitDetails_SubMenu;
	public WebElement TFATenureDays_InLImitDetails_SubMenu_610() {
		return TFATenureDays_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_DiscountingMarginPer_key")
	private WebElement DiscountingMarginPer_InLImitDetails_SubMenu;
	public WebElement DiscountingMarginPer_InLImitDetails_SubMenu_610() {
		return DiscountingMarginPer_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Remarks_key")
	private WebElement Remarks_InLImitDetails_SubMenu;
	public WebElement Remarks_InLImitDetails_SubMenu_610() {
		return Remarks_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Payment_method_key")
	private WebElement PaymentMethod_InLImitDetails_SubMenu;
	public WebElement PaymentMethod_InLImitDetails_SubMenu_610() {
		return PaymentMethod_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Purpose_of_financing_key")
	private WebElement Purposeoffinancing_InLImitDetails_SubMenu;
	public WebElement Purposeoffinancing_InLImitDetails_SubMenu_610() {
		return Purposeoffinancing_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_InstallmentAmount_key")
	private WebElement InstallmentAmount_InLImitDetails_SubMenu;
	public WebElement InstallmentAmount_InLImitDetails_SubMenu_610() {
		return InstallmentAmount_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_NoofInstallments_key")
	private WebElement NoofInstallments_InLImitDetails_SubMenu;
	public WebElement NoofInstallments_InLImitDetails_SubMenu_610() {
		return NoofInstallments_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_SecurityDepositAmount_key")
	private WebElement SecurityDepositAmount_InLImitDetails_SubMenu;
	public WebElement SecurityDepositAmount_InLImitDetails_SubMenu_610() {
		return SecurityDepositAmount_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_AmendedSecurityDepositAmount_key")
	private WebElement AmendedSecurityDepositAmount_InLImitDetails_SubMenu;
	public WebElement AmendedSecurityDepositAmount_InLImitDetails_SubMenu_610() {
		return AmendedSecurityDepositAmount_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_cap_rate_key")
	private WebElement CapRate_InLImitDetails_SubMenu;
	public WebElement CapRate_InLImitDetails_SubMenu_610() {
		return CapRate_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_selling_price_key")
	private WebElement selling_price_InLImitDetails_SubMenu;
	public WebElement selling_price_InLImitDetails_SubMenu_610() {
		return selling_price_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_floor_rate_method_key")
	private WebElement floorRateMethod_InLImitDetails_SubMenu;
	public WebElement floorRateMethod_InLImitDetails_SubMenu_610() {
		return floorRateMethod_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_floor_rate_percentage_key")
	private WebElement FloorRatePercentage_InLImitDetails_SubMenu;
	public WebElement FloorRatePercentage_InLImitDetails_SubMenu_610() {
		return FloorRatePercentage_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_credit_spread_key")
	private WebElement CreditSpread_InLImitDetails_SubMenu;
	public WebElement CreditSpread_InLImitDetails_SubMenu_610() {
		return CreditSpread_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_sublimit_lower_limit_perc_key")
	private WebElement SublimitLowerLimitPerc_InLImitDetails_SubMenu;
	public WebElement SublimitLowerLimitPerc_InLImitDetails_SubMenu_610() {
		return SublimitLowerLimitPerc_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_sublimit_lower_limit_amount_key")
	private WebElement SublimitLowerLimitAmount_InLImitDetails_SubMenu;
	public WebElement SublimitLowerLimitAmount_InLImitDetails_SubMenu_610() {
		return SublimitLowerLimitAmount_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationfacilityLimitDetailsCLEAN_FLAG_WIFT001MT")
	private WebElement CleanFlag_InLImitDetails_SubMenu;
	public WebElement CleanFlag_InLImitDetails_SubMenu_610() {
		return CleanFlag_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Revolving_One_off_key")
	private WebElement RevolvingOneOff_InLImitDetails_SubMenu;
	public WebElement RevolvingOneOff_InLImitDetails_SubMenu_610() {
		return RevolvingOneOff_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilityLimitApplyPenalty_WIFT001MT")
	private WebElement ApplyPenalty_InLImitDetails_SubMenu;
	public WebElement ApplyPenalty_InLImitDetails_SubMenu_610() {
		return ApplyPenalty_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilitylimitPenaltyOnDueAmount_WIFT001MT")
	private WebElement PenaltyOnDueAmount_InLImitDetails_SubMenu;
	public WebElement PenaltyOnDueAmount_InLImitDetails_SubMenu_610() {
		return PenaltyOnDueAmount_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilitylimitGracePeriod_WIFT001MT")
	private WebElement GracePeriod_InLImitDetails_SubMenu;
	public WebElement GracePeriod_InLImitDetails_SubMenu_610() {
		return GracePeriod_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilitylimityielddetchargestype_WIFT001MT")
	private WebElement chargestype_InLImitDetails_SubMenu;
	public WebElement chargestype_InLImitDetails_SubMenu_610() {
		return chargestype_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_Vat_code_key")
	private WebElement Vatcode_InLImitDetails_SubMenu;
	public WebElement Vatcode_InLImitDetails_SubMenu_610() {
		return Vatcode_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationfacilityLimitDetails_PPR_YN_WIFT001MT")
	private WebElement PPR_InLImitDetails_SubMenu;
	public WebElement PPR_InLImitDetails_SubMenu_610() {
		return PPR_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationfacilityLimitDetails_REGIMENTAL_AGENT_WIFT001MT")
	private WebElement REGIMENTAL_AGENT_InLImitDetails_SubMenu;
	public WebElement REGIMENTAL_AGENT_InLImitDetails_SubMenu_610() {
		return REGIMENTAL_AGENT_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationfacilityLimitDetails_BUDGET_ALLOCATION_WIFT001MT")
	private WebElement BUDGET_ALLOCATION_InLImitDetails_SubMenu;
	public WebElement BUDGET_ALLOCATION_InLImitDetails_SubMenu_610() {
		return BUDGET_ALLOCATION_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationfacilityLimitDetails_CONTRACTED_YN_WIFT001MT")
	private WebElement CONTRACTED_InLImitDetails_SubMenu;
	public WebElement CONTRACTED_InLImitDetails_SubMenu_610() {
		return CONTRACTED_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_comments_and_conditions_key")
	private WebElement comments_and_conditions_InLImitDetails_SubMenu;
	public WebElement comments_and_conditions_InLImitDetails_SubMenu_610() {
		return comments_and_conditions_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_transaction_cy")
	private WebElement transaction_cy_InLImitDetails_SubMenu;
	public WebElement transaction_cy_InLImitDetails_SubMenu_610() {
		return transaction_cy_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_MaximumTenure_PeriodicityNo_key")
	private WebElement MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu;
	public WebElement MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu_610() {
		return MaximumTenure_PeriodicityNo_key_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_MaximumTenure_PeriodicityType_key")
	private WebElement MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu;
	public WebElement MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu_610() {
		return MaximumTenure_PeriodicityType_key_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_MinimumTenure_PeriodicityNo_key")
	private WebElement MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu;
	public WebElement MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu_610() {
		return MinimumTenure_PeriodicityNo_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_MinimumTenure_PeriodicityType_key")
	private WebElement MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu;
	public WebElement MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu_610() {
		return MinimumTenure_PeriodicityType_key_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_MaximumTenureforfinancing_PeriodicityNo_key")
	private WebElement MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu;
	public WebElement MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu_610() {
		return MaximumTenureforfinancing_PeriodicityNo_key_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_MaximumTenureforfinancing_PeriodicityType_key")
	private WebElement MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu;
	public WebElement MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu_610() {
		return MaximumTenureforfinancing_PeriodicityType_key_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_FloatingRate_key")
	private WebElement FloatingRate_InLImitDetails_SubMenu;
	public WebElement FloatingRate_InLImitDetails_SubMenu_610() {
		return FloatingRate_InLImitDetails_SubMenu;
	}
	
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_FloatingRatePeriodicity_key")
	private WebElement FloatingRatePeriodicit_InLImitDetails_SubMenu;
	public WebElement FloatingRatePeriodicit_InLImitDetails_SubMenu_610() {
		return FloatingRatePeriodicit_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_FloatingRatePeriodicityType_key")
	private WebElement FloatingRatePeriodicityType_InLImitDetails_SubMenu;
	public WebElement FloatingRatePeriodicityType_InLImitDetails_SubMenu_610() {
		return FloatingRatePeriodicityType_InLImitDetails_SubMenu;
	}
	
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_MarginRate_key")
	private WebElement MarginRate_InLImitDetails_SubMenu;
	public WebElement MarginRate_InLImitDetails_SubMenu_610() {
		return MarginRate_InLImitDetails_SubMenu;
	}
	

	@FindBy(id =  "lbl_applicationFacilityLimitTotalYield_WIFT001MT")
	private WebElement TotalYield_InLImitDetails_SubMenu;
	public WebElement TotalYield_InLImitDetails_SubMenu_610() {
		return TotalYield_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilitylimitlipdetlipperiod_WIFT001MT")
	private WebElement lip_period_InLImitDetails_SubMenu;
	public WebElement lip_period_InLImitDetails_SubMenu_610() {
		return lip_period_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilitylimitlipstartdate_WIFT001MT")
	private WebElement limitlipstartdate_InLImitDetails_SubMenu;
	public WebElement limitlipstartdate_InLImitDetails_SubMenu_610() {
		return limitlipstartdate_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilitylimitlipdetlipperiodamended_WIFT001MT")
	private WebElement lip_period_amende_InLImitDetails_SubMenu;
	public WebElement lip_period_amende_InLImitDetails_SubMenu_610() {
		return lip_period_amende_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilitylimitzeroentrycost_WIFT001MT")
	private WebElement zeroentrycost_InLImitDetails_SubMenu;
	public WebElement zeroentrycost_InLImitDetails_SubMenu_610() {
		return zeroentrycost_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilityLimitTranscationMaturity_WIFT001MT")
	private WebElement TranscationMaturity_InLImitDetails_SubMenu;
	public WebElement TranscationMaturity_InLImitDetails_SubMenu_610() {
		return TranscationMaturity_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilityLimitTranscationType_WIFT001MT")
	private WebElement TranscationType_InLImitDetails_SubMenu;
	public WebElement TranscationType_InLImitDetails_SubMenu_610() {
		return TranscationType_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "lbl_applicationFacilityLimitMaturityAction_WIFT001MT")
	private WebElement MaturityAction_InLImitDetails_SubMenu;
	public WebElement MaturityAction_InLImitDetails_SubMenu_610() {
		return MaturityAction_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_bank_no_key")
	private WebElement bank_no_InLImitDetails_SubMenu;
	public WebElement bank_no_InLImitDetails_SubMenu_610() {
		return bank_no_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "applicationfacilityLimitPopupFormId_WIFT001MT_acc_no_key")
	private WebElement acc_no_InLImitDetails_SubMenu;
	public WebElement acc_no_InLImitDetails_SubMenu_610() {
		return acc_no_InLImitDetails_SubMenu;
	}
	
	
	@FindBy(id =  "limitDetails_add_btn_WIFT001MT")
	private WebElement add_btn_InLImitDetails_SubMenu;
	public WebElement add_btn_InLImitDetails_SubMenu_610() {
		return add_btn_InLImitDetails_SubMenu;
	}
	
	@FindBy(id =  "limitDetails_close_btn_WIFT001MT")
	private WebElement close_btn_InLImitDetails_SubMenu;
	public WebElement close_btn_InLImitDetails_SubMenu_610() {
		return close_btn_InLImitDetails_SubMenu;
	}
	
	//-------------@579604  Scenario: TSR - KCB170047
	
	
	
	@FindBy(xpath =  "//select[@id='applicationFacilityApplicationfor_WIFT001MT']")
	private WebElement Application_for_Decrease;
	public WebElement Application_for_Decrease_610() {
		return Application_for_Decrease;
	}
	
	@FindBy(id =  "lookuptxt_applicationFacilityExistingFacilityRef_WIFT001MT")
	private WebElement ExistingFacility_Ref;
	public WebElement ExistingFacility_Ref_610() {
		return ExistingFacility_Ref;
	}
	
	@FindBy(xpath =  "//span[text()='Additional Details']")
	private WebElement Click_AdditionalDetails;
	public WebElement Click_AdditionalDetails_610() {
		return Click_AdditionalDetails;
	}
	
	@FindBy(xpath =  "//input[@name='applicationFacilityCO.TOTAL_AMOUNT']")
	private WebElement TOTAL_AMOUNT_InAdditionalDetails;
	public WebElement TOTAL_AMOUNT_InAdditionalDetails_610() {
		return TOTAL_AMOUNT_InAdditionalDetails;
	}
	
	@FindBy(xpath =  "//input[@name='applicationFacilityCO.fmsApplVO.DOWN_PAYMENT_PERC']")
	private WebElement DOWN_PAYMENT_PERC_InAdditionalDetails;
	public WebElement DOWN_PAYMENT_PERC_InAdditionalDetails_610() {
		return DOWN_PAYMENT_PERC_InAdditionalDetails;
	}
	
	
	
	//-------------------- @574947  Scenario: TSR-EWB170043
   
	@FindBy(xpath =  "//input[@id='applicationfacilityLimitDetailsCLEAN_FLAG_WIFT001MT']")
	private WebElement CLEAN_FLAG_In_LimitsDetails;
	public WebElement CLEAN_FLAG_In_LimitsDetails_610() {
		return CLEAN_FLAG_In_LimitsDetails;
	}
	
	//input[@id='applicationfacilityLimitDetailsFacilityRiskRatingValueDate_WIFT001MT']
	@FindBy(xpath =  "//input[@id='applicationfacilityLimitDetailsFacilityRiskRatingValueDate_WIFT001MT']")
	private WebElement FRRValueDate_In_LimitsDetails;
	public WebElement FRRValueDate_In_LimitsDetails_610() {
		return FRRValueDate_In_LimitsDetails;
	}
	
	@FindBy(id =  "td_ApplicationFacilityLimitDetailsGrid_WIFT001MT_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE")
	private WebElement ProductClass_In_LimitsDetails;
	public WebElement ProductClass_In_LimitsDetails_610() {
		return ProductClass_In_LimitsDetails;
	}
	
	@FindBy(id =  "applicationfacility_repayplan_btn_WIFT001MT")
	private WebElement RepaymentPlan_btn_In_LimitsDetails;
	public WebElement RepaymentPlan_btn_In_LimitsDetails_610() {
		return RepaymentPlan_btn_In_LimitsDetails;
	}
	
	
	@FindBy(xpath =  "//button[@id='facilitymanagement_save_btn_WIFT008UP']")
	private WebElement SaveButton_DocumentDetails_updateafter_Tab;
	public WebElement SaveButton_DocumentDetails_updateafter_Tab_610() {
		return SaveButton_DocumentDetails_updateafter_Tab;
	}
	
	@FindBy(xpath =  "//button[@id='savebutton_WIFT001MT']")
	private WebElement SaveButton_RepaymentPlan;
	public WebElement SaveButton_RepaymentPlan_610() {
		return SaveButton_RepaymentPlan;
	}
	
//	_popup_path_sol_confirm_ok
	@FindBy(xpath =  "_popup_path_sol_confirm_ok")
	private WebElement Waring_RepaymentPlan;
	public WebElement Waring_RepaymentPlan_610() {
		return Waring_RepaymentPlan;
	}
	
	//_popup_path_sol_ok
	@FindBy(id =  "_popup_path_sol_ok")
	private WebElement SaveInformation_RepaymentPlan;
	public WebElement SaveInformation_RepaymentPlan_610() {
		return SaveInformation_RepaymentPlan;
	}
	
    @FindBy(id =  "_popup_path_sol_confirm_ok")
	private WebElement WaringButton_OnLimitDetails_Tab;
	public WebElement WaringButton_OnLimitDetails_Tab_610() {
	return WaringButton_OnLimitDetails_Tab;
	}
	
	
	 @FindBy(id =  "_popup_path_sol_ok")
		private WebElement Waring_OnLimitDetails_Tab;
		public WebElement Waring_OnLimitDetails_Tab_610() {
		return Waring_OnLimitDetails_Tab;
		}
	
	@FindBy(id =  "_popup_path_sol_ok")
	private WebElement SucessButton_OnLimitDetails_Tab;
	public WebElement SucessButton_OnLimitDetails_Tab_610() {
	return SucessButton_OnLimitDetails_Tab;
	}
	
	@FindBy(id =  "No_Of_Payments_WIFT001MT")
	private WebElement No_Of_Payments_InRepaymentPlan;
	public WebElement No_Of_Payments_InRepaymentPlan_610() {
	return No_Of_Payments_InRepaymentPlan;
	}
	//_popup_path_sol_ok
	@FindBy(id =  "_popup_path_sol_ok")
	private WebElement Popup_NoOfPayments_InRepaymentPlan;
	public WebElement Popup_NoOfPayments_InRepaymentPlan_610() {
	return Popup_NoOfPayments_InRepaymentPlan;
	}
	
	@FindBy(xpath =  "//button[@id='createSchedule_WIFT001MT']")
	private WebElement createSchedule_InRepaymentPlan;
	public WebElement createSchedule_InRepaymentPlan_610() {
	return createSchedule_InRepaymentPlan;
	}
	
	@FindBy(id =  "_popup_path_sol_confirm")
	private WebElement Warning_popup_No_In_RepaymentPlan;
	public WebElement Warning_popup_No_In_RepaymentPlan_610() {
	return Warning_popup_No_In_RepaymentPlan;
	}
	
	@FindBy(xpath =  "//button[@id='applicationfacility_save_btn_WIFT001MT']")
	private WebElement Validate_Button;
	public WebElement Validate_Button_610() {
	return Validate_Button;
	}
	
	//-----limitDetailsValidateButton
    
    @FindBy(xpath = "//button[@id='applicationfacility_save_btn_WIFT001MT']")
    private WebElement limit_details_validate_btn;
    public WebElement limitDetailsValidateBtn_610() {
        return limit_details_validate_btn;
    }

    @FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
    private WebElement warning_popup_ok_btn;
    public WebElement WarningPopupOkBtn_610() {
        return warning_popup_ok_btn;
    } 
    
    @FindBy(xpath = "//div[text()='CONFIRM']")
    private WebElement confirm_popup;
    public WebElement confirmPopup_610() {
        return confirm_popup;
    }

    @FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
    private WebElement facility_already_created_popup_Msg;
    public WebElement facilityAlreadyCreatedPopupMsg_610() {
        return facility_already_created_popup_Msg;
    }

    @FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
    private WebElement facilityAlreadyCreatedPopup_610;
    public WebElement facilityAlreadyCreatedPopup_610() {
        return facilityAlreadyCreatedPopup_610;
    }

    @FindBy(xpath = "//div[text()='Success']")
    private WebElement success_popup;
    public WebElement successPopup_610() {
        return success_popup;
    }

    //class
    @FindBy(xpath = "//div[@class='jMsgbox-contentWrap']")
    private WebElement success_popup_msg;
    public WebElement successPopupMessage_610() {
        return success_popup_msg;
    }

    @FindBy(xpath = "//a[@id='dismissbut_WIFT001MT']/span")
    private WebElement sendAlertPopup;
    public WebElement sendAlertPopup_610() {
        return sendAlertPopup;
    }
    
    //-----------------
    
    @FindBy(xpath = "//a[@id='dismissbut_WIFT001AP3']")
    private WebElement sendAlertPopup1_610;
    public WebElement sendAlertPopup1_610() {
        return sendAlertPopup1_610;
    }
	
    @FindBy(xpath = "//a[@id='dismissbut_WIFT008UP']/span")
    private WebElement sendAlertPopup_facilityManagement;
    public WebElement sendAlertPopup_facilityManagement_610() {
        return sendAlertPopup_facilityManagement;
    }
	
	
	@FindBy(xpath =  "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Validate_Warning_ConfirmValidateProcess;
	public WebElement Validate_Warning_ConfirmValidateProcess_610() {
	return Validate_Warning_ConfirmValidateProcess;
	}
	
	@FindBy(xpath =  "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Validate_Confirm_alreadyCreated;
	public WebElement Validate_Confirm_alreadyCreated_610() {
	return Validate_Confirm_alreadyCreated;
	}
	
	@FindBy(xpath =  "//input[@id='_popup_path_sol_ok']")
	private WebElement Validate_Success_ValidateSuccessfull;
	public WebElement Validate_Success_ValidateSuccessfull_610() {
	return Validate_Success_ValidateSuccessfull;
	}
	
	@FindBy(xpath =  "//span[text()=' Dismiss ']")
	private WebElement Validate_SendAlert_Dismiss;
	public WebElement Validate_SendAlert_Dismiss_610() {
	return Validate_SendAlert_Dismiss;
	}
	
	//------------------approvel level
	
	@FindBy(xpath = "//a[@id='WIFT001AP1']")
    private WebElement application_financial_facility_approve1;
    public WebElement applicationFinancialFacilityApproveLevel1_610() {
        return application_financial_facility_approve1;
    }
	@FindBy(xpath = "//*[@id=\"applicationFacilityGridTbl_Id_WIFT001AP1_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement approve1_clear_btn;
	public WebElement approve1ClearBtn_610() {
		return approve1_clear_btn;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP1_1_fmsApplVO.CODE']")
	private WebElement approve_level1_retrive_data;
	public WebElement approveLevel1RetriveData_610() {
		return approve_level1_retrive_data;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision_1_WIFT001AP1']")
	private WebElement approve_level1_select_decision;
	public WebElement approveLevel1SelectDecision_610() {
		return approve_level1_select_decision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel1_btn_WIFT001AP1']")
	private WebElement approve_level1_submit_btn;
	public WebElement approveLevel1SubmitBtn_610() {
		return approve_level1_submit_btn;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP1_gs_fmsApplVO.CODE']")
	private WebElement Enter_ValidateCode_approve_level1;
	public WebElement Enter_ValidateCode_approve_level1_610() {
		return Enter_ValidateCode_approve_level1;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP2_gs_fmsApplVO.CODE']")
	private WebElement Enter_ValidateCode_approve_level2;
	public WebElement Enter_ValidateCode_approve_level2_610() {
		return Enter_ValidateCode_approve_level2;
	}
	
	@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP3_gs_fmsApplVO.CODE']")
	private WebElement Enter_ValidateCode_approve_level3;
	public WebElement Enter_ValidateCode_approve_level3_610() {
		return Enter_ValidateCode_approve_level3;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP1_1_fmsApplVO.CODE']")
	private WebElement ClickTheValue_ValidateCode_approve_level1;
	public WebElement ClickTheValue_ValidateCode_approve_level1_610() {
		return ClickTheValue_ValidateCode_approve_level1;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP2_1_fmsApplVO.CODE']")
	private WebElement ClickTheValue_ValidateCode_approve_level2;
	public WebElement ClickTheValue_ValidateCode_approve_level2_610() {
		return ClickTheValue_ValidateCode_approve_level2;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP3_1_fmsApplVO.CODE']")
	private WebElement ClickTheValue_ValidateCode_approve_level3;
	public WebElement ClickTheValue_ValidateCode_approve_level3_610() {
		return ClickTheValue_ValidateCode_approve_level3;
	}
	
    @FindBy(xpath = "//a[@id='WIFT001AP2']")
	private WebElement application_financial_facility_approve2;
	public WebElement applicationFinancialFacilityApproveLevel2_610() {
		return application_financial_facility_approve2;
	} 
	
    @FindBy(xpath = "//*[@id=\"applicationFacilityGridTbl_Id_WIFT001AP2_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement approve2_clear_btn;
	public WebElement approve2ClearBtn_610() {
		return approve2_clear_btn;
	} 
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP2_1_fmsApplVO.CODE']")
	private WebElement approve_level2_retrive_data;
	public WebElement approveLevel2RetriveData_610() {
		return approve_level2_retrive_data;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision2_WIFT001AP2']")
	private WebElement approve_level2_select_devision;
	public WebElement approveLevel2SelectDecision_610() {
		return approve_level2_select_devision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel2_btn_WIFT001AP2']")
	private WebElement approve_level2_submit_btn;
	public WebElement approveLevel2SubmitBtn_610() {
		return approve_level2_submit_btn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement button_confirm_ok;
	public WebElement ButtonConfirmOk1_610() {
		return button_confirm_ok;
	}
	
	@FindBy(xpath = "//*[@id='_popup_path_sol_ok']")
	private WebElement button_success_ok;
	public WebElement ButtonSuccessOk1_610() {
		return button_success_ok;
	}

    @FindBy(xpath = "//a[@id='WIFT001AP3']")
	private WebElement application_financial_facility_approve3;
	public WebElement applicationFinancialFacilityApproveLevel3_610() {
		return application_financial_facility_approve3;
	}

    @FindBy(xpath = "//*[@id=\"applicationFacilityGridTbl_Id_WIFT001AP3_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement approve3_clear_btn;
	public WebElement approve3ClearBtn_610() {
		return approve3_clear_btn;
	}
	
	@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001AP3_1_fmsApplVO.CODE']")
	private WebElement approve_level3_retrive_data;
	public WebElement approveLevel3RetriveData_610() {
		return approve_level3_retrive_data;
	}
	
	@FindBy(xpath = "//select[@id='applicationFacilityDecision3_WIFT001AP3']")
	private WebElement approve_level3_select_devision;
	public WebElement approveLevel3SelectDecision_610() {
		return approve_level3_select_devision;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_approvelevel3_btn_WIFT001AP3']")
	private WebElement approve_level3_submit_btn;
	public WebElement approveLevel3SubmitBtn_610() {
		return approve_level3_submit_btn;
	}
	
	
	//----------------- @814762 facility management screen
	
	
	
	@FindBy(xpath = "//td[text()='Facilities Management']")
	private WebElement facilityManagement_screen;
	public WebElement facilityManagement_screen_610() {
		return facilityManagement_screen;
	}
	
	@FindBy(xpath = "//a[@id='WIFT008UP']/span[text()='Update After Approve']")
	private WebElement updateAfterApprove_screen;
	public WebElement updateAfterApprove_screen_610() {
		return updateAfterApprove_screen;
	}
	
	@FindBy(xpath = "//td[@id='facilityManagementGridTbl_Id_WIFT008UP_pager_left']/table/tbody/tr/td[7][text()='Clear']")
	private WebElement clearButton_InUpdateApproveScreen;
	public WebElement clearButton_InUpdateApproveScreen_610() {
		return clearButton_InUpdateApproveScreen;
	}
	
	@FindBy(xpath = "//table[@id='facilityManagementGridTbl_Id_WIFT008UP']/tbody/tr[2]")
	private WebElement retriveData_InUpdateApproveScreen;
	public WebElement retriveData_InUpdateApproveScreen_610() {
		return retriveData_InUpdateApproveScreen;
	}
	
	@FindBy(id = "facilityApplicationDetailsTab_WIFT008UP")
	private WebElement facilityApplicationDetails_InUpdateApproveScreen;
	public WebElement facilityApplicationDetails_InUpdateApproveScreen_610() {
		return facilityApplicationDetails_InUpdateApproveScreen;
	}
	
	@FindBy(xpath = "//input[@name='facilityManagementCO.fmsFacilityVO.FACILITY_MARGIN']")
	private WebElement cashMargin_InUpdateApproveScreen;
	public WebElement cashMargin_InUpdateApproveScreen_610() {
		return cashMargin_InUpdateApproveScreen;
	}
	
	@FindBy(id = "facilityMgtAppDet_Exceed_Facility_Sublimit_WIFT008UP")
	private WebElement exceedFacilityAtSublimit_InUpdateApproveScreen;
	public WebElement exceedFacilityAtSublimit_InUpdateApproveScreen_610() {
		return exceedFacilityAtSublimit_InUpdateApproveScreen;
	}
	
	@FindBy(id = "facilityManagementSubjectFullRepaymentYN_WIFT008UP")
	private WebElement subjectTofullRepayment_InUpdateApproveScreen;
	public WebElement subjectTofullRepayment_InUpdateApproveScreen_610() {
		return subjectTofullRepayment_InUpdateApproveScreen;
	}
	
	@FindBy(id = "facilityLimitDetailsTab_WIFT008UP")
	private WebElement facilityLimitDetails_InUpdateApproveScreen;
	public WebElement facilityLimitDetails_InUpdateApproveScreen_610() {
		return facilityLimitDetails_InUpdateApproveScreen;
	}
	
	@FindBy(xpath = "//td[@id='td_FacilityManagementFacilityLimitDetailsGrid_WIFT008UP_1_fmsFacilityDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement productClass_InfacilityLimitDetails_InUpdateApproveScreen;
	public WebElement productClass_InfacilityLimitDetails_InUpdateApproveScreen_610() {
		return productClass_InfacilityLimitDetails_InUpdateApproveScreen;
	}
	
	////input[@name='facilityManagementCO.fmsFacilityDetCO.fmsFacilityDetVO.CAP_RATE']
	@FindBy(xpath = "//input[@name='facilityManagementCO.fmsFacilityDetCO.fmsFacilityDetVO.CAP_RATE']")
	private WebElement capRate_InLimitDetails_InUpdateApproveScreen;
	public WebElement capRate_InLimitDetails_InUpdateApproveScreen_610() {
		return capRate_InLimitDetails_InUpdateApproveScreen;
	}
	
	@FindBy(xpath = "//input[@name='facilityManagementCO.fmsFacilityDetCO.fmsFacilityDetVO.SELLING_PRICE']")
	private WebElement sellingPrice_InLimitDetails_InUpdateApproveScreen;
	public WebElement sellingPrice_InLimitDetails_InUpdateApproveScreen_610() {
		return sellingPrice_InLimitDetails_InUpdateApproveScreen;
	}
	
	@FindBy(id = "facilityManagement_limitDetails_edit_btn_WIFT008UP")
	private WebElement EditBUtton_InLimitDetails_InUpdateApproveScreen;
	public WebElement EditBUtton_InLimitDetails_InUpdateApproveScreen_610() {
		return EditBUtton_InLimitDetails_InUpdateApproveScreen;
	}
	
	@FindBy(id = "DocumentDetailsTab_WIFT008UP")
	private WebElement documentDetails_InUpdateApproveScreen;
	public WebElement documentDetails_InUpdateApproveScreen_610() {
		return documentDetails_InUpdateApproveScreen;
	}
	
	@FindBy(id = "td_FacilityManagementDocumentDetailsGrid_WIFT008UP_0_rn")
	private WebElement clickfirstRow1buttonButton_InDocumentDetails;
	public WebElement clickfirstRow1buttonButton_InDocumentDetails_610() {
		return clickfirstRow1buttonButton_InDocumentDetails;
	}
	
	
	@FindBy(xpath = "//td[@id='td_FacilityManagementDocumentDetailsGrid_WIFT008UP_1_fmsFacDocumentsVO.SOL_DATE_SENT']/input")
	private WebElement solicitorDataSend_InDocumentDetails;
	public WebElement solicitorDataSend_InDocumentDetails_610() {
		return solicitorDataSend_InDocumentDetails;
	}
	
	@FindBy(xpath = "//input[@id='1_fmsFacDocumentsVO.SOL_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement solicitorDataReceived_InDocumentDetails;
	public WebElement solicitorDataReceived_InDocumentDetails_610() {
		return solicitorDataReceived_InDocumentDetails;
	}
	
	@FindBy(xpath = "//input[@id='1_fmsFacDocumentsVO.EST_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement estimatorDateSent_InDocumentDetails;
	public WebElement estimatorDateSent_InDocumentDetails_610() {
		return estimatorDateSent_InDocumentDetails;
	}
	
	@FindBy(xpath = "//input[@id='1_fmsFacDocumentsVO.EST_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement estimatorDateRecevied_InDocumentDetails;
	public WebElement estimatorDateRecevied_InDocumentDetails_610() {
		return estimatorDateRecevied_InDocumentDetails;
	}
	
	@FindBy(xpath = "//input[@id='1_fmsFacDocumentsVO.CUSTODIAN_SENT_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement custodianDateSent_InDocumentDetails;
	public WebElement custodianDateSent_InDocumentDetails_610() {
		return custodianDateSent_InDocumentDetails;
	}
	
	@FindBy(xpath = "//td[@id='td_FacilityManagementDocumentDetailsGrid_WIFT008UP_2_fmsFacDocumentsVO.SOL_DATE_SENT']")
	private WebElement clicksolicitorDataSendRow2_InDocumentDetails;
	public WebElement clicksolicitorDataSendRow2_InDocumentDetails_610() {
		return clicksolicitorDataSendRow2_InDocumentDetails;
	}
	
	@FindBy(xpath = "//input[@id='2_fmsFacDocumentsVO.SOL_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement solicitorDataSendRow2_InDocumentDetails;
	public WebElement solicitorDataSendRow2_InDocumentDetails_610() {
		return solicitorDataSendRow2_InDocumentDetails;
	}
	
	@FindBy(xpath = "//input[@id='2_fmsFacDocumentsVO.SOL_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement solicitorDataDataRecived2_InDocumentDetails;
	public WebElement solicitorDataDataRecived2_InDocumentDetails_610() {
		return solicitorDataDataRecived2_InDocumentDetails;
	}
	
	@FindBy(xpath = "//input[@id='2_fmsFacDocumentsVO.EST_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement estimatorDateSent2_InDocumentDetails;
	public WebElement estimatorDateSent2_InDocumentDetails_610() {
		return estimatorDateSent2_InDocumentDetails;
	}
	
	@FindBy(xpath = "//input[@id='2_fmsFacDocumentsVO.EST_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement estimatorDateReceviedt2_InDocumentDetails;
	public WebElement estimatorDateReceviedt2_InDocumentDetails_610() {
		return estimatorDateReceviedt2_InDocumentDetails;
	}
	
	@FindBy(xpath = "//input[@id='2_fmsFacDocumentsVO.CUSTODIAN_SENT_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement custodianDateSent2_InDocumentDetails;
	public WebElement custodianDateSent2_InDocumentDetails_610() {
		return custodianDateSent2_InDocumentDetails;
	}
	
	@FindBy(xpath = "//a[@id='WIFT008AP']/span[text()='Approve/Reject']")
	private WebElement approveRejectScreen_FM;
	public WebElement approveRejectScreen_FM_610() {
		return approveRejectScreen_FM;
	}
	
	@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008AP_gs_fmsFacilityVO.CODE']")
	private WebElement enterCode_InapprovelScreen;
	public WebElement enterCode_InapprovelScreen_610() {
		return enterCode_InapprovelScreen;
	}
	
	@FindBy(xpath = "(//tr[@id='1'])[2]")
	private WebElement selectFirstRow_InapprovelScreen;
	public WebElement selectFirstRow_InapprovelScreen_610() {
		return selectFirstRow_InapprovelScreen;
	}
	
	
	@FindBy(xpath = "//span[text()='Facility Application Details']")
	private WebElement facilityApplicationDetails_InapprovelScreen;
	public WebElement facilityApplicationDetails_InapprovelScreen_610() {
		return facilityApplicationDetails_InapprovelScreen;
	}
	
	@FindBy(xpath = "//input[@name='facilityManagementCO.fmsFacilityVO.EXCEED_SUBLIMIT_FACILITY_YN']")
	private WebElement exceedFacilityAtSublimit_InapprovelScreen;
	public WebElement exceedFacilityAtSublimit_InapprovelScreen_610() {
		return exceedFacilityAtSublimit_InapprovelScreen;
	}
	
	@FindBy(xpath = "//input[@name='facilityManagementCO.fmsFacilityVO.SUBJECT_FULL_REPAYMENT_YN']")
	private WebElement subjectToFullRepayment_InapprovelScreen;
	public WebElement subjectToFullRepayment_InapprovelScreen_610() {
		return subjectToFullRepayment_InapprovelScreen;
	}
	
	@FindBy(id = "facilityLimitDetailsTab_WIFT008AP")
	private WebElement facilityLimitDetails_InapprovelScreen;
	public WebElement facilityLimitDetails_InapprovelScreen_610() {
		return facilityLimitDetails_InapprovelScreen;
	}
	
	@FindBy(xpath = "//td[@id='td_FacilityManagementFacilityLimitDetailsGrid_WIFT008AP_1_fmsFacilityDetVO.GENERAL_FACILITY_TYPE']")
	private WebElement productClass_InapprovelScreen;
	public WebElement productClass_InapprovelScreen_610() {
		return productClass_InapprovelScreen;
	}
	
	
	@FindBy(xpath = "//input[@name='facilityManagementCO.fmsFacilityDetCO.fmsFacilityDetVO.CAP_RATE']")
	private WebElement capRate_InapprovelScreen;
	public WebElement capRate_InapprovelScreen_610() {
		return capRate_InapprovelScreen;
	}
	
	
	@FindBy(xpath = "//input[@name='facilityManagementCO.fmsFacilityDetCO.fmsFacilityDetVO.SELLING_PRICE']")
	private WebElement sellingPrice_InapprovelScreen;
	public WebElement sellingPrice_InapprovelScreen_610() {
		return sellingPrice_InapprovelScreen;
	}
	
	@FindBy(xpath = "//button[@id='limitDetails_close_btn_WIFT008AP']")
	private WebElement closeButton_InapprovelScreen;
	public WebElement closeButton_InapprovelScreen_610() {
		return closeButton_InapprovelScreen;
	}
	
	@FindBy(xpath = "//span[text()='Document Details']")
	private WebElement documentDetails_InapprovelScreen;
	public WebElement documentDetails_InapprovelScreen_610() {
		return documentDetails_InapprovelScreen;
	}
	
	//td[@id='td_FacilityManagementDocumentDetailsGrid_WIFT008AP_1_fmsFacDocumentsVO.SOL_DATE_SENT']
	
	@FindBy(xpath = "//td[@id='td_FacilityManagementDocumentDetailsGrid_WIFT008AP_1_fmsFacDocumentsVO.SOL_DATE_SENT']")
	private WebElement solicitorDateSent_InapprovelScreen;
	public WebElement solicitorDateSent_InapprovelScreen_610() {
		return solicitorDateSent_InapprovelScreen;
	}
	
	
	
	//-----------------@315144 
	 //  Scenario: Remaining Cash margin updation after complete utilization of facility value -IIAB150154
	
	
	@FindBy(xpath = "//input[@id='facilityMgtAppDetFacilityMargin_WIFT008UP']")
	private WebElement cashMargin_InFacilityAppDetails_approvel_610;
	public WebElement cashMargin_InFacilityAppDetails_approvel_610() {
		return cashMargin_InFacilityAppDetails_approvel_610;
	}
	
	@FindBy(xpath = "//button[@id='facilityManagement_approve_btn_WIFT008AP']")
	private WebElement approvelbutton_InFacilityAppDetails_610;
	public WebElement approvelbutton_InFacilityAppDetails_610() {
		return approvelbutton_InFacilityAppDetails_610;
	}
	
	@FindBy(xpath = "//td[text()='Draw Down Request']")
	private WebElement drawDownRequest_Screen_610;
	public WebElement drawDownRequest_Screen_610() {
		return drawDownRequest_Screen_610;
	}
	
	@FindBy(xpath = "//a[@id='WIFT009MT']/span[text()='Maintenance']")
	private WebElement drawDownRequestMaintenance_Screen_610;
	public WebElement drawDownRequestMaintenance_Screen_610() {
		return drawDownRequestMaintenance_Screen_610;
	}
	
	
	@FindBy(id = "lookuptxt_drawDownRequestFacilityReference_WIFT009MT")
	private WebElement facilityReference_drawDownMainInformation_610;
	public WebElement facilityReference_drawDownMainInformation_610() {
		return facilityReference_drawDownMainInformation_610;
	}
	
	@FindBy(xpath = "//input[@id='lookuptxt_drawDownRequestDrawDownType_WIFT009MT']")
	private WebElement drawdownType_drawDownMainInformation_610;
	public WebElement drawdownType_drawDownMainInformation_610() {
		return drawdownType_drawDownMainInformation_610;
	}
	
	@FindBy(xpath = "//input[@name='drawdownRequestCO.fmsDrawDownVO.LONG_NAME_ENG']")
	private WebElement descriptionEnglish_drawDownMainInformation_610;
	public WebElement descriptionEnglish_drawDownMainInformation_610() {
		return descriptionEnglish_drawDownMainInformation_610;
	}
	
	@FindBy(xpath = "//input[@id='drawDownRequestLongNameArab_WIFT009MT']")
	private WebElement descriptionArab_drawDownMainInformation_610;
	public WebElement descriptionArab_drawDownMainInformation_610() {
		return descriptionArab_drawDownMainInformation_610;
	}
	
	@FindBy(xpath = "//input[@name='drawdownRequestCO.fmsDrawDownVO.DATE_SUBMITTED']")
	private WebElement dateDatesubmitted_drawDownMainInformation_610;
	public WebElement dateDatesubmitted_drawDownMainInformation_610() {
		return dateDatesubmitted_drawDownMainInformation_610;
	}
	
	@FindBy(xpath = "//input[@name='drawdownRequestCO.fmsDrawDownVO.VALUE_DATE']")
	private WebElement valueDatesubmitted_drawDownMainInformation_610;
	public WebElement valueDatesubmitted_drawDownMainInformation_610() {
		return valueDatesubmitted_drawDownMainInformation_610;
	}
	
	@FindBy(xpath = "//span[text()='Drawdown Additional Details']")
	private WebElement DrawdownAdditionalDetails_Screen_610;
	public WebElement DrawdownAdditionalDetails_Screen_610() {
		return DrawdownAdditionalDetails_Screen_610;
	}
	
	//input[@id='facilityMgtMainFinancedAmount_WIFT008UP']
	@FindBy(xpath = "//input[@id='facilityMgtMainFinancedAmount_WIFT008UP']")
	private WebElement facilityManagementFinanceAmt_Validate_610;
	public WebElement facilityManagementFinanceAmt_Validate_610() {
		return facilityManagementFinanceAmt_Validate_610;
	}
	
	@FindBy(xpath = "//input[@id='drawDownRequestFC_Amount_WIFT009MT']")
	private WebElement FCAmount_DrawdownAdditionalDetails_Screen_610;
	public WebElement FCAmount_DrawdownAdditionalDetails_Screen_610() {
		return FCAmount_DrawdownAdditionalDetails_Screen_610;
	}
	
	//  check flag in param screen
	
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement fms_param_parameter;
	public WebElement fmsParamParameter_610() {
		return fms_param_parameter;
	}
	
	@FindBy(xpath = "//td[text()='Facility Type']")
	private WebElement param_facility_type;
	public WebElement paramFacilityType_610() {
		return param_facility_type;
	}
	
	@FindBy(xpath = "//a[@id='P008UP']")
	private WebElement facility_type_update_after_approve;
	public WebElement facilityTypeUpdateAfterApprove_610() {
		return facility_type_update_after_approve;
	}
	
	@FindBy(id = "fmsFacilityTypeListGridTbl_Id_P008UP_gs_CODE")
	private WebElement facility_type_search_code;
	public WebElement facilityTypeSearchCode_610() {
		return facility_type_search_code;
	}
	
	@FindBy(id = "td_fmsFacilityTypeListGridTbl_Id_P008UP_1_CODE")
	private WebElement facility_type_search_code_result;
	public WebElement facilityTypeSearchCodeResult_610() {
		return facility_type_search_code_result;
	}
	
	@FindBy(id = "td_fmsFacilityTypeListGridTbl_Id_P008UP_3_CODE")
	private WebElement facilityTypeSearchCodeResultRow3_610;
	public WebElement facilityTypeSearchCodeResultRow3_610() {
		return facilityTypeSearchCodeResultRow3_610;
	}
	
	@FindBy(xpath = "//li[@id='fmsFacilityTypeDetailsTab_P008UP']")
	private WebElement facilty_type_facility_details;
	public WebElement facilityTypeFacilityDetails_610() {
		return facilty_type_facility_details;
	}
	
	@FindBy(id = "Fms_facility_type_stp_facility_requirments_Div_P008UP")
	private WebElement STP_facility_req;
	public WebElement STPFacilityReq_610() {
		return STP_facility_req;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_customer_grading_P008UP']")
	private WebElement customer_grading_flag;
	public WebElement customerGradingFlag_610() {
		return customer_grading_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_grade_overwrite_P008UP']")
	private WebElement overwrite_grading_flag;
	public WebElement OverwriteGradingFlag_610() {
		return overwrite_grading_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_credit_review_P008UP']")
	private WebElement credit_review_flag;
	public WebElement creditReviewFlag_610() {
		return credit_review_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_committee_approval_P008UP']")
	private WebElement committee_approval_flag;
	public WebElement committeeApprovalFlag_610() {
		return committee_approval_flag;
	}
	
	@FindBy(xpath = "//select[@id='fmsFacilityType_members_number_P008UP']")
	private WebElement committee_approval_flag_member_dropdown;
	public WebElement committeeApprovalFlagMemberDropdown_610() {
		return committee_approval_flag_member_dropdown;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_credit_authorize_P008UP']")
	private WebElement credit_authorzie_flag;
	public WebElement creditAuthorzieFlag_610() {
		return credit_authorzie_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_issue_offer_P008UP']")
	private WebElement issue_facility_offer_flag;
	public WebElement issueFacilityOfferFlag_610() {
		return issue_facility_offer_flag;
	}

	@FindBy(xpath = "//input[@id='fmsFacilityType_client_response_P008UP']")
	private WebElement client_response_flag;
	public WebElement clientResponseFlag_610() {
		return client_response_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_document_validation_yn_P008UP']")
	private WebElement document_validation_flag;
	public WebElement documentValidationFlag_610() {
		return document_validation_flag;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_final_approval_P008UP']")
	private WebElement final_approval_flag;
	public WebElement finalApprovalFlag_610() {
		return final_approval_flag;
	}
		
	@FindBy(xpath = "//input[@id='fmsFacilityType_active_facility_P008UP']")
	private WebElement create_active_facility_flag;
	public WebElement createActiveFacilityFlag_610() {
		return create_active_facility_flag;
	}	
	
	@FindBy(xpath = "//input[@id='fmsFacilityType_auto_approve_P008UP']")
	private WebElement auto_appprove_facility_flag;
	public WebElement autoApproveFacilityFlag_610() {
		return auto_appprove_facility_flag;
	}
	
	@FindBy(xpath = "//button[@id='fmsFacilityTypeMaint_update_P008UP']")
	private WebElement update_after_approve_update_btn;
	public WebElement updateAfterApproveUpdateBtn_610() {
		return update_after_approve_update_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement confirm_popup_ok_btn;
	public WebElement confirmPopupOkBtn_610() {
		return confirm_popup_ok_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement success_popup_ok_btn;
	public WebElement successPopupOkBtn_610() {
		return success_popup_ok_btn;
	}
	
	@FindBy(xpath = "//a[@id='P008P']")
	private WebElement facility_type_approve_menu;
	public WebElement facilityTypeApproveMenu_610() {
		return facility_type_approve_menu;
	}
	
	@FindBy(xpath = "//input[@id='fmsFacilityTypeListGridTbl_Id_P008P_gs_CODE']")
	private WebElement approve_search_code;
	public WebElement approveSearchCode_610() {
		return approve_search_code;
	}
	
	@FindBy(xpath = "//td[@id='td_fmsFacilityTypeListGridTbl_Id_P008P_1_CODE']")
	private WebElement approve_search_code_result;
	public WebElement approveSearchCodeResult_610() {
		return approve_search_code_result;
	}
	
	@FindBy(xpath = "//*[@id=\"fmsFacilityTypeMaint_approve_P008P\"]")
	private WebElement facility_type_approve_btn;
	public WebElement facilityTypeApproveBtn_610() {
		return facility_type_approve_btn;
	}

//----Committee Approval
	
	//-------------approvel level 3 
	
		@FindBy(xpath =  "//select[@id='applicationFacilityDecision3_WIFT001AP3']")
		private WebElement approveLevel3ForwardDecision_610;
		public WebElement approveLevel3ForwardDecision_610() {
			return approveLevel3ForwardDecision_610;
		} 
		
		@FindBy(xpath =  "//textarea[@id='applicationFacilityReommemdation3_WIFT001AP3']")
		private WebElement approveLevel3RecommendationCmt_610;
		public WebElement approveLevel3RecommendationCmt_610() {
			return approveLevel3RecommendationCmt_610;
		} 
		
		//---------
		
		@FindBy(xpath =  "//a[@id='WIFT002MT']//span[text()='Approval Committee Recommendations ']")
		private WebElement ApprovalCommitteeRecommendationsScreen_610;
		public WebElement ApprovalCommitteeRecommendationsScreen_610() {
			return ApprovalCommitteeRecommendationsScreen_610;
		} 
		
		@FindBy(xpath =  "//input[@id='applicationFacilityGridTbl_Id_WIFT002MT_gs_fmsApplVO.CODE']")
		private WebElement enterFacilityCodeIn_ApprovalCommitteeRecommendationsScreen_610;
		public WebElement enterFacilityCodeIn_ApprovalCommitteeRecommendationsScreen_610() {
			return enterFacilityCodeIn_ApprovalCommitteeRecommendationsScreen_610;
		} 
		
		@FindBy(xpath =  "//input[@id='applicationFacilityGridTbl_Id_WIFT002MT_gs_fmsApplVO.CIF']")
		private WebElement enterCIFCodeIn_ApprovalCommitteeRecommendationsScreen_610;
		public WebElement enterCIFCodeIn_ApprovalCommitteeRecommendationsScreen_610() {
			return enterCIFCodeIn_ApprovalCommitteeRecommendationsScreen_610;
		} 
	
		//---------------------
		
		@FindBy(xpath = "//span[contains(text(),'Approval Committee Recommendations ')]")
		private WebElement WifakApplication_ApprovalCommitteeRecommendations;
		public WebElement WifakApplication_ApprovalCommitteeRecommendations() {
			return WifakApplication_ApprovalCommitteeRecommendations;
		}
		
		@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT002MT_gs_fmsApplVO.CODE']")
		private WebElement WifakApplication_ApprovalCommitteeRecommendations_Code;
		public WebElement WifakApplication_ApprovalCommitteeRecommendations_Code() {
			return WifakApplication_ApprovalCommitteeRecommendations_Code;
		}
		
		@FindBy(xpath = "//span[contains(text(),' Recommend ')]")
		private WebElement WifakApplication_ApprovalCommitteeRecommendations_Recommend;
		public WebElement WifakApplication_ApprovalCommitteeRecommendations_Recommend() {
			return WifakApplication_ApprovalCommitteeRecommendations_Recommend;
		}
		
		@FindBy(xpath = "//span[text()='Approval Committees Recommendation User Id : JAY']")
		private WebElement ApprovalCommitteesRecommendationPopup_610;
		public WebElement ApprovalCommitteesRecommendationPopup_610() {
			return ApprovalCommitteesRecommendationPopup_610;
		}
		
		@FindBy(xpath = "//span[text()='Approval Committees Recommendation']")
		private WebElement AuthorizeRejectScreen_ApprovalCommitteesRecommendationPopup_610;
		public WebElement AuthorizeRejectScreen_ApprovalCommitteesRecommendationPopup_610() {
			return AuthorizeRejectScreen_ApprovalCommitteesRecommendationPopup_610;
		}
		
		@FindBy(xpath = "//span[@id='ui-dialog-title-applicationFacilityCifDetailsDiv_id_WIFT004MT']//following::a/span[text()='close']")
		private WebElement closeIcon_AuthorizeRejectScreen_ApprovalCommitteesRecommendationPopup_610;
		public WebElement closeIcon_AuthorizeRejectScreen_ApprovalCommitteesRecommendationPopup_610() {
			return closeIcon_AuthorizeRejectScreen_ApprovalCommitteesRecommendationPopup_610;
		}
		
		@FindBy(xpath = "(//td[@tdlabel='Recommended By' and text()='JAY'])[1]")
		private WebElement selectUserJAY_ApprovalCommitteesRecommendationPopup_610;
		public WebElement selectUserJAY_ApprovalCommitteesRecommendationPopup_610() {
			return selectUserJAY_ApprovalCommitteesRecommendationPopup_610;
		}
		
		@FindBy(xpath = "(//td[@tdlabel='Recommended By' and text()='JAY'])[1]//parent::tr/td[@tdlabel='Comments']/textarea")
		private WebElement enterCMT_UserJAY_ApprovalCommitteesRecommendationPopup_610;
		public WebElement enterCMT_UserJAY_ApprovalCommitteesRecommendationPopup_610() {
			return enterCMT_UserJAY_ApprovalCommitteesRecommendationPopup_610;
		}
		
		@FindBy(xpath = "(//td[text()='JAY' and @tdlabel='Recommended By'])[1]")
		private WebElement selectUserJAy_InApprovalCommitteesRecommendationPopup_610;
		public WebElement selectUserJAy_InApprovalCommitteesRecommendationPopup_610() {
			return selectUserJAy_InApprovalCommitteesRecommendationPopup_610;
		}
		
		
		@FindBy(xpath = "//select[@gridid='ApplicationFacilityRecommendationGrid_WIFT002MT']")
		private WebElement WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation;
		public WebElement WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation() {
			return WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation;
		}
		
		@FindBy(xpath = "//span[text()='OK']")
		private WebElement WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation_Ok;
		public WebElement WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation_Ok() {
			return WifakApplication_ApprovalCommitteeRecommendations_Recommend_Recommendation_Ok;
		}
		
		//-------------------------Authorize Reject Application For Financial Facilities screen
		
		@FindBy(xpath = "//span[text()='Authorize/Reject Application For Financial Facilities']")
		private WebElement AuthorizeRejectApplicationForFinancialFacilitiesscreen_610;
		public WebElement AuthorizeRejectApplicationForFinancialFacilitiesscreen_610() {
			return AuthorizeRejectApplicationForFinancialFacilitiesscreen_610;
		}
		
		@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT004MT_gs_fmsApplVO.CODE']")
		private WebElement Enter_ValidateCode_AuthorizeRejectApplication_610;
		public WebElement Enter_ValidateCode_AuthorizeRejectApplication_610() {
			return Enter_ValidateCode_AuthorizeRejectApplication_610;
		}
		
		@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT004MT_1_fmsApplVO.CODE']")
		private WebElement ClickTheValue_AuthorizeRejectApplication_610;
		public WebElement ClickTheValue_AuthorizeRejectApplication_610() {
			return ClickTheValue_AuthorizeRejectApplication_610;
		}
		
		@FindBy(xpath = "//label[@id='applicationfacilityFormId_WIFT004MT_approvalcommittiees_key']")
		private WebElement approvalcommittieeskey_AuthorizeRejectApplication_610;
		public WebElement approvalcommittieeskey_AuthorizeRejectApplication_610() {
			return approvalcommittieeskey_AuthorizeRejectApplication_610;
		}
		
		
		
		//Approval commitee comments => (//td[@tdlabel='Recommended By' and text()='JAY'])[1]//parent::tr/td[@tdlabel='Comments']
		
		@FindBy(xpath = "(//td[@tdlabel='Recommended By' and text()='JAY'])[1]//parent::tr/td[@tdlabel='Comments']")
		private WebElement enterCMT_UserJAY_AuthorizeRejectApplication_610;
		public WebElement enterCMT_UserJAY_AuthorizeRejectApplication_610() {
			return enterCMT_UserJAY_AuthorizeRejectApplication_610;
		}
		
		//-----application for ff search nd retrive
		
		@FindBy(xpath = "//a[@id='infoBarSearchButton_WIFT001MT']")
		private WebElement searchbutton_ApplicationForFinancialFacilities_610;
		public WebElement searchbutton_ApplicationForFinancialFacilities_610() {
			return searchbutton_ApplicationForFinancialFacilities_610;
		}
		
		@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001MT_gs_fmsApplVO.CODE']")
		private WebElement searchCode_ApplicationForFinancialFacilities_610;
		public WebElement searchCode_ApplicationForFinancialFacilities_610() {
			return searchCode_ApplicationForFinancialFacilities_610;
		}
		
		@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001MT_1_fmsApplVO.CODE']")
		private WebElement retriveFirstRow_ApplicationForFinancialFacilities_610;
		public WebElement retriveFirstRow_ApplicationForFinancialFacilities_610() {
			return retriveFirstRow_ApplicationForFinancialFacilities_610;
		}
		
		@FindBy(xpath = "//label[@id='applicationfacilityFormId_WIFT001MT_approvalcommittiees_key']")
		private WebElement approvalcommittieeskey_ApplicationForFinancialFacilities_610;
		public WebElement approvalcommittieeskey_ApplicationForFinancialFacilities_610() {
			return approvalcommittieeskey_ApplicationForFinancialFacilities_610;
		}
		
		//---------------Repayment plan
		
		@FindBy(xpath = "//div[text()='Do you want to create tentative schedule ?']")
		private WebElement createTentativeSchedulePopup_InRepaymentPlan_610;
		public WebElement createTentativeSchedulePopup_InRepaymentPlan_610() {
			return createTentativeSchedulePopup_InRepaymentPlan_610;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement createTentativeSchedulePopupYes_InRepaymentPlan_610;
		public WebElement createTentativeSchedulePopupYes_InRepaymentPlan_610() {
			return createTentativeSchedulePopupYes_InRepaymentPlan_610;
		}
		
		@FindBy(xpath = "//label[@id='repaymentPlanFormId_WIFT001MT_JVD_key']")
		private WebElement JournalVoucherDetailsButton_InRepaymentPlan_610;
		public WebElement JournalVoucherDetailsButton_InRepaymentPlan_610() {
			return JournalVoucherDetailsButton_InRepaymentPlan_610;
		}
		
		@FindBy(xpath = "//li[@id='rePaymentPlanMainTab2_WIFT001MT']")
		private WebElement ScheduleDetailsMenu_InRepaymentPlan_610;
		public WebElement ScheduleDetailsMenu_InRepaymentPlan_610() {
			return ScheduleDetailsMenu_InRepaymentPlan_610;
		}
		
		@FindBy(xpath = "//span[@id='ui-dialog-title-fmsRepaymentPlanDiv_id_WIFT001MT']")
		private WebElement RepaymentPlanPopup_InRepaymentPlan_610;
		public WebElement RepaymentPlanPopup_InRepaymentPlan_610() {
			return RepaymentPlanPopup_InRepaymentPlan_610;
		}
		
		@FindBy(xpath = "//div[@id='jqgh_repaumentPlanScheduleGridTbl_Id_WIFT001MT_VALUE_DATE']")
		private WebElement dueDateInRepaymentPlanPopup_InRepaymentPlan_610;
		public WebElement dueDateInRepaymentPlanPopup_InRepaymentPlan_610() {
			return dueDateInRepaymentPlanPopup_InRepaymentPlan_610;
		}
		
		@FindBy(xpath = "//span[contains(text(),' Print Schedule ')]")
		private WebElement clickPrintSchedule_InRepaymentPlan_610;
		public WebElement clickPrintSchedule_InRepaymentPlan_610() {
			return createTentativeSchedulePopupYes_InRepaymentPlan_610;
		}
		
		@FindBy(xpath = "Report data is generated, do you want to open report?")
		private WebElement ReportDataIsGeneratedPopup_InRepaymentPlan_610;
		public WebElement ReportDataIsGeneratedPopup_InRepaymentPlan_610() {
			return ReportDataIsGeneratedPopup_InRepaymentPlan_610;
		}
		
		@FindBy(xpath = "//span[text()='Remove Tab']")
		private WebElement RemoveTab_InRepaymentPlan_610;
		public WebElement RemoveTab_InRepaymentPlan_610() {
			return RemoveTab_InRepaymentPlan_610;
		}
		
		
		@FindBy(xpath = "//div[text()='Information']")
		private WebElement InformationPopup_InRepaymentPlan_610;
		public WebElement InformationPopup_InRepaymentPlan_610() {
			return InformationPopup_InRepaymentPlan_610;
		}
		
		@FindBy(xpath = "//div[text()='Changes made, are you sure you want to quit']")
		private WebElement confirmRemoveTab_InRepaymentPlan_610;
		public WebElement confirmRemoveTab_InRepaymentPlan_610() {
			return confirmRemoveTab_InRepaymentPlan_610;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement okButton_610;
		public WebElement okButton_610() {
			return okButton_610;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
		private WebElement successokButton_610;
		public WebElement successokButton_610() {
			return successokButton_610;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm']")
		private WebElement NoButton_610;
		public WebElement NoButton_610() {
			return okButton_610;
		}
		
		@FindBy(xpath = "//td[@id='del_ApplicationFacilityLimitDetailsGrid_WIFT001MT']")
		private WebElement deleteButtonIcon_610;
		public WebElement deleteButtonIcon_610() {
			return deleteButtonIcon_610;
		}
		
		//---------------approvel 1 limit nd repayment 
		
		@FindBy(xpath = "//li[@id='applicationFacilityLimitDetailsTabs_WIFT001AP1']")
		private WebElement approvel1_LimitsDetails_610;
		public WebElement approvel1_LimitsDetails_610() {
			return approvel1_LimitsDetails_610;
		}
		
		@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001AP1_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
		private WebElement approvel1_productClass_610;
		public WebElement approvel1_productClass_610() {
			return approvel1_productClass_610;
		}
		
		@FindBy(xpath = "//button[@id='applicationfacility_repayplan_btn_WIFT001AP1']")
		private WebElement approvel1_RepaymentPlan_btn_In_LimitsDetails_610;
		public WebElement approvel1_RepaymentPlan_btn_In_LimitsDetails_610() {
			return approvel1_RepaymentPlan_btn_In_LimitsDetails_610;
		}
		
		@FindBy(xpath = "//li[@id='rePaymentPlanMainTab2_WIFT001AP1']")
		private WebElement approvel1_ScheduleDetails_In_LimitsDetails_610;
		public WebElement approvel1_ScheduleDetails_In_LimitsDetails_610() {
			return approvel1_ScheduleDetails_In_LimitsDetails_610;
		}
		
		@FindBy(xpath = "//td[@id='td_repaumentPlanScheduleGridTbl_Id_WIFT001AP1_1_VALUE_DATE']")
		private WebElement approvel1_ValidateValuesIN_ScheduleDetails_In_LimitsDetails_610;
		public WebElement approvel1_ValidateValuesIN_ScheduleDetails_In_LimitsDetails_610() {
			return approvel1_ValidateValuesIN_ScheduleDetails_In_LimitsDetails_610;
		}
		
		@FindBy(xpath = "//span[@id='ui-dialog-title-fmsRepaymentPlanDiv_id_WIFT001AP1']//parent::div/a/span[text()='close']")
		private WebElement approvel1_CloseIcon_ScheduleDetails_In_LimitsDetails_610;
		public WebElement approvel1_CloseIcon_ScheduleDetails_In_LimitsDetails_610() {
			return approvel1_CloseIcon_ScheduleDetails_In_LimitsDetails_610;
		}
		
		@FindBy(xpath = "//li[@id='applicationFacilityMainInfoTabs_WIFT001AP1']")
		private WebElement approvel1_MainInformation_610;
		public WebElement approvel1_MainInformation_610() {
			return approvel1_MainInformation_610;
		}
		
		
		//---------------approvel 2 limit nd repayment 
		
				@FindBy(xpath = "//li[@id='applicationFacilityLimitDetailsTabs_WIFT001AP2']")
				private WebElement approvel2_LimitsDetails_610;
				public WebElement approvel2_LimitsDetails_610() {
					return approvel2_LimitsDetails_610;
				}
				
				@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001AP2_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
				private WebElement approvel2_productClass_610;
				public WebElement approvel2_productClass_610() {
					return approvel2_productClass_610;
				}
				
				@FindBy(xpath = "//button[@id='applicationfacility_repayplan_btn_WIFT001AP2']")
				private WebElement approvel2_RepaymentPlan_btn_In_LimitsDetails_610;
				public WebElement approvel2_RepaymentPlan_btn_In_LimitsDetails_610() {
					return approvel2_RepaymentPlan_btn_In_LimitsDetails_610;
				}
				
				@FindBy(xpath = "//li[@id='rePaymentPlanMainTab2_WIFT001AP2']")
				private WebElement approvel2_ScheduleDetails_In_LimitsDetails_610;
				public WebElement approvel2_ScheduleDetails_In_LimitsDetails_610() {
					return approvel2_ScheduleDetails_In_LimitsDetails_610;
				}
				
				@FindBy(xpath = "//td[@id='td_repaumentPlanScheduleGridTbl_Id_WIFT001AP2_1_VALUE_DATE']")
				private WebElement approvel2_ValidateValuesIN_ScheduleDetails_In_LimitsDetails_610;
				public WebElement approvel2_ValidateValuesIN_ScheduleDetails_In_LimitsDetails_610() {
					return approvel2_ValidateValuesIN_ScheduleDetails_In_LimitsDetails_610;
				}
				
				@FindBy(xpath = "//span[@id='ui-dialog-title-fmsRepaymentPlanDiv_id_WIFT001AP2']//parent::div/a/span[text()='close']")
				private WebElement approvel2_CloseIcon_ScheduleDetails_In_LimitsDetails_610;
				public WebElement approvel2_CloseIcon_ScheduleDetails_In_LimitsDetails_610() {
					return approvel2_CloseIcon_ScheduleDetails_In_LimitsDetails_610;
				}
				
				@FindBy(xpath = "//li[@id='applicationFacilityMainInfoTabs_WIFT001AP2']")
				private WebElement approvel2_MainInformation_610;
				public WebElement approvel2_MainInformation_610() {
					return approvel2_MainInformation_610;
				}
				
				//---------------approvel 2 limit nd repayment 
				
				@FindBy(xpath = "//li[@id='applicationFacilityLimitDetailsTabs_WIFT001AP3']")
				private WebElement approvel3_LimitsDetails_610;
				public WebElement approvel3_LimitsDetails_610() {
					return approvel3_LimitsDetails_610;
				}
				
				@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001AP3_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
				private WebElement approvel3_productClass_610;
				public WebElement approvel3_productClass_610() {
					return approvel3_productClass_610;
				}
				
				@FindBy(xpath = "//button[@id='applicationfacility_repayplan_btn_WIFT001AP3']")
				private WebElement approvel3_RepaymentPlan_btn_In_LimitsDetails_610;
				public WebElement approvel3_RepaymentPlan_btn_In_LimitsDetails_610() {
					return approvel3_RepaymentPlan_btn_In_LimitsDetails_610;
				}
				
				@FindBy(xpath = "//li[@id='rePaymentPlanMainTab2_WIFT001AP3']")
				private WebElement approvel3_ScheduleDetails_In_LimitsDetails_610;
				public WebElement approvel3_ScheduleDetails_In_LimitsDetails_610() {
					return approvel3_ScheduleDetails_In_LimitsDetails_610;
				}
				
				@FindBy(xpath = "//td[@id='td_repaumentPlanScheduleGridTbl_Id_WIFT001AP3_1_VALUE_DATE']")
				private WebElement approvel3_ValidateValuesIN_ScheduleDetails_In_LimitsDetails_610;
				public WebElement approvel3_ValidateValuesIN_ScheduleDetails_In_LimitsDetails_610() {
					return approvel3_ValidateValuesIN_ScheduleDetails_In_LimitsDetails_610;
				}
				
				@FindBy(xpath = "//span[@id='ui-dialog-title-fmsRepaymentPlanDiv_id_WIFT001AP3']//parent::div/a/span[text()='close']")
				private WebElement approvel3_CloseIcon_ScheduleDetails_In_LimitsDetails_610;
				public WebElement approvel3_CloseIcon_ScheduleDetails_In_LimitsDetails_610() {
					return approvel3_CloseIcon_ScheduleDetails_In_LimitsDetails_610;
				}
				
				@FindBy(xpath = "//li[@id='applicationFacilityMainInfoTabs_WIFT001AP3']")
				private WebElement approvel3_MainInformation_610;
				public WebElement approvel3_MainInformation_610() {
					return approvel3_MainInformation_610;
				}
				
		//--------Floating Rate in limit Detail
			
		@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT001MT']")
		private WebElement FloatingRateinlimitDetail_610;
		public WebElement FloatingRateinlimitDetail_610() {
			return FloatingRateinlimitDetail_610;
		}
		
		@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_NBR_WIFT001MT']")
		private WebElement FloatingRatePeriodicityinlimitDetail_610;
		public WebElement FloatingRatePeriodicityinlimitDetail_610() {
			return FloatingRatePeriodicityinlimitDetail_610;
		}
		
		@FindBy(xpath = "//select[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_TYPE_WIFT001MT']")
		private WebElement FloatingRatePeriodicityTypeinlimitDetail_610;
		public WebElement FloatingRatePeriodicityTypeinlimitDetail_610() {
			return FloatingRatePeriodicityTypeinlimitDetail_610;
		}
		
		//---------Approval Committee Recommendations
		
		@FindBy(xpath = "//li[@id='applicationFacilityLimitDetailsTabs_WIFT002MT']")
		private WebElement LimitDetailsTabs_ApprovalCommitteeRecommendations__610;
		public WebElement LimitDetailsTabs_ApprovalCommitteeRecommendations__610() {
			return LimitDetailsTabs_ApprovalCommitteeRecommendations__610;
		}
		
		@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT002MT_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
		private WebElement productClass_ApprovalCommitteeRecommendations__610;
		public WebElement productClass_ApprovalCommitteeRecommendations__610() {
			return productClass_ApprovalCommitteeRecommendations__610;
		}
		
		@FindBy(xpath = "//label[@id='applicationfacilityLimitPopupFormId_WIFT002MT_FloatingRate_key']")
		private WebElement FloatingRate_key_ApprovalCommitteeRecommendations__610;
		public WebElement FloatingRate_key_ApprovalCommitteeRecommendations__610() {
			return FloatingRate_key_ApprovalCommitteeRecommendations__610;
		}
		
		@FindBy(xpath = "//label[@id='applicationfacilityLimitPopupFormId_WIFT002MT_FloatingRatePeriodicity_key']")
		private WebElement FloatingRatePeriodicity_key_ApprovalCommitteeRecommendations__610;
		public WebElement FloatingRatePeriodicity_key_ApprovalCommitteeRecommendations__610() {
			return FloatingRatePeriodicity_key_ApprovalCommitteeRecommendations__610;
		}
		
		@FindBy(xpath = "//label[@id='applicationfacilityLimitPopupFormId_WIFT002MT_FloatingRatePeriodicityType_key']")
		private WebElement FloatingRatePeriodicityType_key_ApprovalCommitteeRecommendations__610;
		public WebElement FloatingRatePeriodicityType_key_ApprovalCommitteeRecommendations__610() {
			return FloatingRatePeriodicityType_key_ApprovalCommitteeRecommendations__610;
		}
		
		///------Final Approval Screen
		
		@FindBy(xpath = "//span[text()='Final Approval ']")
		private WebElement FinalApprovalScreenInAFFF__610;
		public WebElement FinalApprovalScreenInAFFF__610() {
			return FinalApprovalScreenInAFFF__610;
		}
		
		@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT0061MT_gs_fmsApplVO.CODE']")
		private WebElement Enter_ValidateCode_InFinalApprovalScreenInAFFF__610;
		public WebElement Enter_ValidateCode_InFinalApprovalScreenInAFFF__610() {
			return Enter_ValidateCode_InFinalApprovalScreenInAFFF__610;
		}
		
		@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT0061MT_1_fmsApplVO.CODE']")
		private WebElement ClickTheValue_ValidateCode_InFinalApprovalScreenInAFFF__610;
		public WebElement ClickTheValue_ValidateCode_InFinalApprovalScreenInAFFF__610() {
			return ClickTheValue_ValidateCode_InFinalApprovalScreenInAFFF__610;
		}
		
		@FindBy(xpath = "//li[@id='applicationFacilityLimitDetailsTabs_WIFT0061MT']")
		private WebElement LimitDetailsTabs_InFinalApprovalScreenInAFFF__610;
		public WebElement LimitDetailsTabs_InFinalApprovalScreenInAFFF__610() {
			return LimitDetailsTabs_InFinalApprovalScreenInAFFF__610;
		}
		
		@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT0061MT_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE']")
		private WebElement ProductClass_InFinalApprovalScreenInAFFF__610;
		public WebElement ProductClass_InFinalApprovalScreenInAFFF__610() {
			return ProductClass_InFinalApprovalScreenInAFFF__610;
		}
		
		@FindBy(xpath = "//label[@id='applicationfacilityFormId_WIFT0061MT_Charges_Details_key']")
		private WebElement ChargesDetails_key_InFinalApprovalScreenInAFFF__610;
		public WebElement ChargesDetails_key_InFinalApprovalScreenInAFFF__610() {
			return ChargesDetails_key_InFinalApprovalScreenInAFFF__610;
		}
		
		@FindBy(xpath = "//span[@id='ui-dialog-title-facilitySubLimitChargesDetailsDiv_id_WIFT0061MT']")
		private WebElement ChargesDetails_Screen_InFinalApprovalScreenInAFFF__610;
		public WebElement ChargesDetails_Screen_InFinalApprovalScreenInAFFF__610() {
			return ChargesDetails_Screen_InFinalApprovalScreenInAFFF__610;
		}
		
		@FindBy(xpath = "//div[@id='applicationFacilityOtherDetailsCollapse_WIFT0061MT']")
		private WebElement otherDetails_InFinalApprovalScreenInAFFF__610;
		public WebElement otherDetails_InFinalApprovalScreenInAFFF__610() {
			return otherDetails_InFinalApprovalScreenInAFFF__610;
		}
		
		
		@FindBy(xpath = "//input[@id='lookuptxt_applicationFacilityRejectReason_WIFT0061MT']")
		private WebElement RejectReasonIn_otherDetails_InFinalApprovalScreenInAFFF__610;
		public WebElement RejectReasonIn_otherDetails_InFinalApprovalScreenInAFFF__610() {
			return RejectReasonIn_otherDetails_InFinalApprovalScreenInAFFF__610;
		}
		
				
		@FindBy(xpath = "//textarea[@id='applicationFacilitycomments_WIFT0061MT']")
		private WebElement commentsIn_otherDetails_InFinalApprovalScreenInAFFF__610;
		public WebElement commentsIn_otherDetails_InFinalApprovalScreenInAFFF__610() {
			return commentsIn_otherDetails_InFinalApprovalScreenInAFFF__610;
		}
		
		@FindBy(xpath = "//button[@id='applicationfacility_finalreject_btn_WIFT0061MT']")
		private WebElement rejectButtonIn_otherDetails_InFinalApprovalScreenInAFFF__610;
		public WebElement rejectButtonIn_otherDetails_InFinalApprovalScreenInAFFF__610() {
			return rejectButtonIn_otherDetails_InFinalApprovalScreenInAFFF__610;
		}
		
		//---------------Issue Facility Offer 
		
		@FindBy(xpath = "//a[@id='WIFT005MT']/span[text()='Issue Facility Offer ']")
		private WebElement IssueFacilityOffer_Screen__610;
		public WebElement IssueFacilityOffer_Screen__610() {
			return IssueFacilityOffer_Screen__610;
		}
		
		@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT005MT_gs_fmsApplVO.CODE']")
		private WebElement Enter_ValidateCode_InIssueFacilityOffer_Screen__610;
		public WebElement Enter_ValidateCode_InIssueFacilityOffer_Screen__610() {
			return Enter_ValidateCode_InIssueFacilityOffer_Screen__610;
		}
		
		@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT005MT_1_fmsApplVO.CODE']")
		private WebElement ClickTheValue_ValidateCode_InIssueFacilityOffer_Screen__610;
		public WebElement ClickTheValue_ValidateCode_InIssueFacilityOffer_Screen__610() {
			return ClickTheValue_ValidateCode_InIssueFacilityOffer_Screen__610;
		}
		
		@FindBy(xpath = "//button[@id='applicationfacility_issueoffer_btn_WIFT005MT']")
		private WebElement issueoffer_btn_InIssueFacilityOffer_Screen__610;
		public WebElement issueoffer_btn_InIssueFacilityOffer_Screen__610() {
			return issueoffer_btn_InIssueFacilityOffer_Screen__610;
		}
		
		//--1st ok button
		
		@FindBy(xpath = "//div[text()='ERROR']")
		private WebElement errorPopup_InIssueFacilityOffer_Screen__610;
		public WebElement errorPopup_InIssueFacilityOffer_Screen__610() {
			return errorPopup_InIssueFacilityOffer_Screen__610;
		}
		
		@FindBy(xpath = "//div[text()='ERROR']/parent::div/following-sibling::center/input[@id='_popup_path_sol_ok']")
		private WebElement errorPopupOkButton_InIssueFacilityOffer_Screen__610;
		public WebElement errorPopupOkButton_InIssueFacilityOffer_Screen__610() {
			return errorPopupOkButton_InIssueFacilityOffer_Screen__610;
		}
		
		//---2nd success ok
		
						
				///------Final Approval Screen
				
								
				@FindBy(xpath = "//button[@id='applicationfacility_finalapproval_btn_WIFT0061MT']")
				private WebElement finalapproval_btn_InFinalApprovalScreenInAFFF__610;
				public WebElement finalapproval_btn_InFinalApprovalScreenInAFFF__610() {
					return finalapproval_btn_InFinalApprovalScreenInAFFF__610;
				}
								
								
				//---------Do you need to reload the tab
				
				@FindBy(xpath = "//div[text()='WARNING']")
				private WebElement DoYouNeedToReloadTheWaringPopup__610;
				public WebElement DoYouNeedToReloadTheWaringPopup__610() {
					return DoYouNeedToReloadTheWaringPopup__610;
				}
				
				@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
				private WebElement DoYouNeedToReloadTheTab__610;
				public WebElement DoYouNeedToReloadTheTab__610() {
					return DoYouNeedToReloadTheTab__610;
				}
				
				
				//-------------Validate Check the Status of Final Rejection in AFFF
				
				
				@FindBy(xpath = "//input[@id='statusDesc_WIFT001MT']")
				private WebElement CheckTheStatusof_FinalRejection_InAFFF__610;
				public WebElement CheckTheStatusof_FinalRejection_InAFFF__610() {
					return CheckTheStatusof_FinalRejection_InAFFF__610;
				}
				
				
				//------------Client Response
				
				@FindBy(xpath = "//span[text()='Client Response ']")
				private WebElement ClientResponse__610;
				public WebElement ClientResponse__610() {
					return ClientResponse__610;
				}
				
				@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT006MT_gs_fmsApplVO.CODE']")
				private WebElement Enter_ValidateCode_InClientResponse__610;
				public WebElement Enter_ValidateCode_InClientResponse__610() {
					return Enter_ValidateCode_InClientResponse__610;
				}
				
				@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT006MT_1_fmsApplVO.CODE']")
				private WebElement ClickTheValue_ValidateCode_InClientResponse__610;
				public WebElement ClickTheValue_ValidateCode_InClientResponse__610() {
					return ClickTheValue_ValidateCode_InClientResponse__610;
				}
				
				@FindBy(xpath = "//button[@id='applicationfacility_accept_btn_WIFT006MT']")
				private WebElement accept_btn_InClientResponse__610;
				public WebElement accept_btn_InClientResponse__610() {
					return accept_btn_InClientResponse__610;
				}
				
				//---1st ok
				
				@FindBy(xpath = "//a[@id='dismissbut_WIFT006MT']")
				private WebElement dismissBtn_InClientResponse__610;
				public WebElement dismissBtn_InClientResponse__610() {
					return dismissBtn_InClientResponse__610;
				}
				
				//--2nd success ok
				
				
				
				//----------------Document Validation
				
				@FindBy(xpath = "//span[text()='Document Validation']")
				private WebElement DocumentValidation__610;
				public WebElement DocumentValidation__610() {
					return DocumentValidation__610;
				}
				
				@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT0062MT_gs_fmsApplVO.CODE']")
				private WebElement Enter_ValidateCode_InDocumentValidation_Screen__610;
				public WebElement Enter_ValidateCode_InDocumentValidation_Screen__610() {
					return Enter_ValidateCode_InDocumentValidation_Screen__610;
				}
				
				@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT0062MT_1_fmsApplVO.CODE']")
				private WebElement ClickTheValue_ValidateCode_InDocumentValidation_Screen__610;
				public WebElement ClickTheValue_ValidateCode_InDocumentValidation_Screen__610() {
					return ClickTheValue_ValidateCode_InDocumentValidation_Screen__610;
				}

				@FindBy(xpath = "//button[@id='applicationfacility_documentvalidate_btn_WIFT0062MT']")
				private WebElement validate_btn_InDocumentValidation_Screen__610;
				public WebElement validate_btn_InDocumentValidation_Screen__610() {
					return validate_btn_InDocumentValidation_Screen__610;
				}
				
				
				//-------ok 
				//-----------success ok
				
			//------------------Authorize Reject Application
				
				
				@FindBy(xpath = "//button[@id='applicationfacility_authorize_btn_WIFT004MT']")
				private WebElement authorize_btn_AuthorizeRejectApplication_610;
				public WebElement authorize_btn_AuthorizeRejectApplication_610() {
					return authorize_btn_AuthorizeRejectApplication_610;
				}
				
				//----ok
				//----success ok
				
				@FindBy(xpath = "//a[@id='dismissbut_WIFT004MT']")
				private WebElement dismiss_btn_AuthorizeRejectApplication_610;
				public WebElement dismiss_btn_AuthorizeRejectApplication_610() {
					return dismiss_btn_AuthorizeRejectApplication_610;
				}
				
				
				//-------------Facilities Management  Maintenance
				
				
				@FindBy(xpath = "//a[@id='WIFT008MT']/span[text()='Maintenance']")
				private WebElement FacilitiesManagement_MaintenanceScreen_610;
				public WebElement FacilitiesManagement_MaintenanceScreen_610() {
					return FacilitiesManagement_MaintenanceScreen_610;
				}
				
				@FindBy(xpath = "//a[@id='infoBarSearchButton_WIFT008MT']")
				private WebElement SearchButton_FacilitiesManagement_MaintenanceScreen_610;
				public WebElement SearchButton_FacilitiesManagement_MaintenanceScreen_610() {
					return SearchButton_FacilitiesManagement_MaintenanceScreen_610;
				}
								
				@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008MT_gs_fmsFacilityVO.CODE']")
				private WebElement Enter_ValidateCodeIN_FacilitiesManagement_MaintenanceScreen_610;
				public WebElement Enter_ValidateCodeIN_FacilitiesManagement_MaintenanceScreen_610() {
					return Enter_ValidateCodeIN_FacilitiesManagement_MaintenanceScreen_610;
				}
				
				@FindBy(xpath = "//input[@id='facilityManagementGridTbl_Id_WIFT008MT_gs_fmsFacilityVO.FROM_APPLICATION']")
				private WebElement Enter_ValidateCodeINApplicationRef_FacilitiesManagement_MaintenanceScreen_610;
				public WebElement Enter_ValidateCodeINApplicationRef_FacilitiesManagement_MaintenanceScreen_610() {
					return Enter_ValidateCodeINApplicationRef_FacilitiesManagement_MaintenanceScreen_610;
				}
				
				@FindBy(xpath = "//td[@id='td_facilityManagementGridTbl_Id_WIFT008MT_1_fmsFacilityVO.CODE']")
				private WebElement ClickTheValue_ValidateCode_FacilitiesManagement_MaintenanceScreen_610;
				public WebElement ClickTheValue_ValidateCode_FacilitiesManagement_MaintenanceScreen_610() {
					return ClickTheValue_ValidateCode_FacilitiesManagement_MaintenanceScreen_610;
				}
				
				@FindBy(xpath = "//label[@id='facilityManagementForm_WIFT008MT_journal_voucher_details_key']")
				private WebElement journalVoucherDetailsKey_FacilitiesManagement_MaintenanceScreen_610;
				public WebElement journalVoucherDetailsKey_FacilitiesManagement_MaintenanceScreen_610() {
					return journalVoucherDetailsKey_FacilitiesManagement_MaintenanceScreen_610;
				}
								
				@FindBy(xpath = "//span[@id='ui-dialog-title-facilityManagementJVdetailsDiv_id_WIFT008MT']")
				private WebElement JVdetailsDivpopup_FacilitiesManagement_MaintenanceScreen_610;
				public WebElement JVdetailsDivpopup_FacilitiesManagement_MaintenanceScreen_610() {
					return JVdetailsDivpopup_FacilitiesManagement_MaintenanceScreen_610;
				}
				
								
				//--------- wait CIF No prevalue 
				
				
				@FindBy(xpath = "//input[@id='facilityMgtMainCif_WIFT008MT']")
				private WebElement waitCIFNOPrevalue_FacilitiesManagement_MaintenanceScreen_610;
				public WebElement waitCIFNOPrevalue_FacilitiesManagement_MaintenanceScreen_610() {
					return waitCIFNOPrevalue_FacilitiesManagement_MaintenanceScreen_610;
				}
				
				
				//----------The Requested Date 01/07/2023 Is a Holiday in AFFF
				
				@FindBy(xpath = "//div[text()='[344] The Requested Date 01/07/2023 Is a Holiday']")
				private WebElement TheRequestedDate_additionalDetails_AFFF_610;
				public WebElement TheRequestedDate_additionalDetails_AFFF_610() {
					return TheRequestedDate_additionalDetails_AFFF_610;
				}
				
				
				
			//-------------Update After Approve	 in AFFF
				
				
				@FindBy(xpath = "//span[text()='Update After Approve']")
				private WebElement UpdateAfterApproveScreen_AFFF_610;
				public WebElement UpdateAfterApproveScreen_AFFF_610() {
					return UpdateAfterApproveScreen_AFFF_610;
				}
				
				
				@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001UP_gs_fmsApplVO.CODE']")
				private WebElement Enter_ValidateCode_UpdateAfterApproveScreen_AFFF_610;
				public WebElement Enter_ValidateCode_UpdateAfterApproveScreen_AFFF_610() {
					return Enter_ValidateCode_UpdateAfterApproveScreen_AFFF_610;
				}
								
				@FindBy(xpath = "//td[@id='td_applicationFacilityGridTbl_Id_WIFT001UP_1_fmsApplVO.CODE']")
				private WebElement ClickTheValue_ValidateCode_UpdateAfterApproveScreen_AFFF_610;
				public WebElement ClickTheValue_ValidateCode_UpdateAfterApproveScreen_AFFF_610() {
					return ClickTheValue_ValidateCode_UpdateAfterApproveScreen_AFFF_610;
				}
				
				
				@FindBy(xpath = "//li[@id='applicationFacilityAdditionDetailsTabs_WIFT001UP']")
				private WebElement AdditionDetailsTabs_In_UpdateAfterApproveScreen_AFFF_610;
				public WebElement AdditionDetailsTabs_In_UpdateAfterApproveScreen_AFFF_610() {
					return AdditionDetailsTabs_In_UpdateAfterApproveScreen_AFFF_610;
				}
				
				@FindBy(xpath = "//input[@id='applicationFacilityofferexpirydate_WIFT001UP']")
				private WebElement offerexpirydate_In_UpdateAfterApproveScreen_AFFF_610;
				public WebElement offerexpirydate_In_UpdateAfterApproveScreen_AFFF_610() {
					return offerexpirydate_In_UpdateAfterApproveScreen_AFFF_610;
				}
				
				@FindBy(xpath = "//button[@id='applicationfacility_save_btn_WIFT001UP']")
				private WebElement ValidateButtonAddDetailsSCreen_In_UpdateAfterApproveScreen_AFFF_610;
				public WebElement ValidateButtonAddDetailsSCreen_In_UpdateAfterApproveScreen_AFFF_610() {
					return ValidateButtonAddDetailsSCreen_In_UpdateAfterApproveScreen_AFFF_610;
				}
				
				@FindBy(xpath = "//a[@id='dismissbut_WIFT001UP']/span")
				private WebElement sendAlertPopup_In_UpdateAfterApproveScreen_AFFF_610;
				public WebElement sendAlertPopup_In_UpdateAfterApproveScreen_AFFF_610() {
					return sendAlertPopup_In_UpdateAfterApproveScreen_AFFF_610;
				}
				
				
				//------------Addition Details Tab in approve level1
				
				
				@FindBy(xpath = "//li[@id='applicationFacilityAdditionDetailsTabs_WIFT001AP1']")
				private WebElement AdditionDetailsTabs_In_Approvelevel1_AFFF_610;
				public WebElement AdditionDetailsTabs_In_Approvelevel1_AFFF_610() {
					return AdditionDetailsTabs_In_Approvelevel1_AFFF_610;
				}
				
				@FindBy(xpath = "//INPUT[@id='applicationFacilityofferexpirydate_WIFT001AP1']")
				private WebElement ValidateOfferExpirydate_In_Approvelevel1_AFFF_610;
				public WebElement ValidateOfferExpirydate_In_Approvelevel1_AFFF_610() {
					return ValidateOfferExpirydate_In_Approvelevel1_AFFF_610;
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
}
