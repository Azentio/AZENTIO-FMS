package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreestimatorsreflectswifakapplicationOBJ {
	WebDriver driver;
	
	public CoreestimatorsreflectswifakapplicationOBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//td[text()='WIFAK APPLICATION'])[1]")
	private WebElement WIFAK_APPLICATION1;
	public WebElement wifakapplication1() {
		return WIFAK_APPLICATION1;
	}
	@FindBy(xpath="(//td[text()='WIFAK APPLICATION'])[2]")
	private WebElement WIFAK_APPLICATION2;
	public WebElement wifakapplication2() {
		return WIFAK_APPLICATION2;
	}
	@FindBy(xpath="//td[text()='Application For Financial Facilities']")
	private WebElement Applicationfor_financial_facilities;
	public WebElement applicationforfinancialfacilities() {
		return Applicationfor_financial_facilities;
	}
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement MaintenANce_Menu;
	public WebElement maintenancemenu() {
		return MaintenANce_Menu;
	}
	@FindBy(xpath="//select[@id='applicationFacilityApplicationfor_WIFT001MT']")
	private WebElement Select_new_Facility;
	public WebElement selectnewfacility() {
		return Select_new_Facility;
	}
	@FindBy(xpath="//li[@id='applicationFacilityMainInfoTabs_WIFT001MT']/a/span[text()='Main Information']")
	private WebElement Main_Information;
	public WebElement maininformation() {
		return Main_Information;
	}
	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilitycif_WIFT001MT']")
	private WebElement CiF_NUm_seARCHbox;
	public WebElement cifnumsearchbox() {
		return CiF_NUm_seARCHbox;
	}

	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilityFacilityType_WIFT001MT']")
	private WebElement FacilityTYPEDetails_Faciltiytype;
	public WebElement facilitytypedetailsfacilitytype() {
		return FacilityTYPEDetails_Faciltiytype;
	}
	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilityCountry_WIFT001MT']")
	private WebElement FacilityTYPEDetails_COUNTRyoffinancing;
	public WebElement facilitytypedetailscountryoffinancing() {
		return FacilityTYPEDetails_COUNTRyoffinancing;
	}
	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilityRating_WIFT001MT']")
	private WebElement FacilityTYPEDetails_facilityRating;
	public WebElement facilitytypedetailsfacilityrating() {
		return FacilityTYPEDetails_facilityRating;
	}
	
	@FindBy(xpath = "//span[text()='Additional Details']")
	private WebElement secondTAb_Additionaldetails;
	public WebElement secondtabadditionaldetails() {
		return secondTAb_Additionaldetails;
	}
	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilitylimitcurrency_WIFT001MT']")
	private WebElement Additionaldetails_Currencycode ;
	public WebElement additionaldetailscurrencycode() {
		return Additionaldetails_Currencycode;
	}
	@FindBy(xpath="//input[@id='applicationFacilitytotalvalue_WIFT001MT']")
	private WebElement Additionaldetails_Totalvalue ;
	public WebElement additionaldetailstotalvalue() {
		return Additionaldetails_Totalvalue;
	}
	@FindBy(xpath="//li[@id='applicationFacilityDocumentDetailsTabs_WIFT001MT']/a/span[text()='Document Details']")
	private WebElement SeventhTab_DocumentDetails ;
	public WebElement seventhtabdocumentdetails() {
		return SeventhTab_DocumentDetails;
	}
	@FindBy(xpath="//span[@id='spanLookup_applicationFacilityEstimator_WIFT001MT']")
	private WebElement Estimatorsname_firstsearchbox ;
	public WebElement estimatorsnamefirstsearchbox() {
		return Estimatorsname_firstsearchbox;
	}
	@FindBy(xpath="//input[@id='gridtab_applicationFacilityEstimator_WIFT001MT_gs_CODE']")
	private WebElement Estimatorsname_secondsearchbox ;
	public WebElement estimatorsnamesecondsearchbox() {
		return Estimatorsname_secondsearchbox;
	}
	@FindBy(xpath="//*[@id=\"td_gridtab_applicationFacilityEstimator_WIFT001MT_1_CODE\"]")
	private WebElement Retrivedvalue_doubleclick ;
	public WebElement retrivedvaluedoubleclick() {
		return Retrivedvalue_doubleclick;
	}
	//@584744
	@FindBy(xpath="//span[text()='Update After Approve']")
	private WebElement ApplicationForFinancialfacilities_UpdateAfterApprove ;
	public WebElement applicationforfinancialfacilitiesupdateafterapprove() {
		return ApplicationForFinancialfacilities_UpdateAfterApprove;
	}
	@FindBy(xpath="//td[text()='Clear']")
	private WebElement ApplicationForFinancialfacilities_UpdateAfterApprove_clearbtn ;
	public WebElement applicationforfinancialfacilitiesupdateafterapproveclearbtn() {
		return ApplicationForFinancialfacilities_UpdateAfterApprove_clearbtn;
	}
	@FindBy(xpath="(//tr[@id='1'])[3]")
	private WebElement ApplicationForFinancialfacilities_UpdateAfterApprove_clearbtn_firstretrivedata;
	public WebElement applicationforfinancialfacilitiesupdateafterapproveclearbtnfirstretrivedata() {
		return ApplicationForFinancialfacilities_UpdateAfterApprove_clearbtn_firstretrivedata;
	}
	@FindBy(xpath="//input[@id='applicationFacilitydownpayment_WIFT001UP']")
	private WebElement Additionaldetails_Downpayment;
	public WebElement additionaldetailsdownpayment() {
		return Additionaldetails_Downpayment;
	}
	@FindBy(xpath="(//tr[@id='1'])[5]")
	private WebElement Limitdetails_Retrivedata_doubletap;
	public WebElement limitdetailsretrivedatadoubletap() {
		return Limitdetails_Retrivedata_doubletap;
	}
	@FindBy(xpath="//input[@id='applicationfacilityLimitDetailsFACILITY_VALUE_WIFT001UP']")
	private WebElement Limitdetails_FacilityValue;
	public WebElement limitdetailsfacilityvalue() {
		return Limitdetails_FacilityValue;
	}
	@FindBy(xpath="//input[@id='applicationfacilityLimitDetailsDOWN_PAYMENT_AMT_WIFT001UP']")
	private WebElement Limitdetails_DownpaymentAmount;
	public WebElement limitdetailsdownpaymentamount() {
		return Limitdetails_DownpaymentAmount;
	}
	@FindBy(xpath="//button[@id='limitDetails_edit_btn_WIFT001UP']")
	private WebElement Limitdetails_DownpaymentAmount_Editbutton;
	public WebElement limitdetailsdownpaymentamounteditbutton() {
		return Limitdetails_DownpaymentAmount_Editbutton;
	}
	@FindBy(xpath="//button[@id='applicationfacility_save_btn_WIFT001UP']")
	private WebElement Limitdetails_DownpaymentAmount_Editbutton_validate;
	public WebElement limitdetailsvalidate() {
		return Limitdetails_DownpaymentAmount_Editbutton_validate;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Confirm_validateok_btn;
	public WebElement confirmvalidateokbtn() {
		return Confirm_validateok_btn;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement Confirm_validateok_btn_validatedsuccessfully;
	public WebElement confirmvalidateokbtnvalidatedsuccessfully() {
		return Confirm_validateok_btn_validatedsuccessfully;
	}
	@FindBy(xpath="//input[@id='applicationFacilityfinancedamount_WIFT001UP']")
	private WebElement Additionaldetails_Financeamount;
	public WebElement additionaldetailsfinanceamount() {
		return Additionaldetails_Financeamount;
	}
	//771445
	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilitycifprofile_WIFT001MT']")
	private WebElement Maininformation_CIFProfile;
	public WebElement maininformationcifprofilesearchbox() {
		return Maininformation_CIFProfile;
	}


}