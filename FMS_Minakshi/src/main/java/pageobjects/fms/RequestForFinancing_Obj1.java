package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestForFinancing_Obj1 {
	WebDriver driver;

	public RequestForFinancing_Obj1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//td[text()='msdemo']/parent::tr/ancestor::h3")
	private WebElement msdemo_Under_MenuOption_Request_For_Financing;
	public WebElement msdemo_Under_MenuOption_Request_For_Financing() {
		return msdemo_Under_MenuOption_Request_For_Financing;

	}

	

	@FindBy(xpath = "//td[text()='msdemo']/parent::tr/ancestor::a")
	private WebElement msdemo_Title_Under_MenuOption_Request_For_Financing;
	public WebElement msdemo_Title_Under_MenuOption_Request_For_Financing() {
		return msdemo_Title_Under_MenuOption_Request_For_Financing;

	}

	

	@FindBy(xpath = "//td[text()='Request For Financing']/parent::tr/ancestor::a")
	private WebElement msdemo_RequestForFinance_Under_MenuOption_Request_For_Financing;
    public WebElement msdemo_RequestForFinance_Under_MenuOption_Request_For_Financing() {
     return msdemo_RequestForFinance_Under_MenuOption_Request_For_Financing;

	}

	

	@FindBy(xpath = "//span[text()='Maintenance']/parent::a")
	private WebElement msdemo_Maintainence_Under_MenuOption_Request_For_Financing;
	public WebElement msdemo_Maintainence_Under_MenuOption_Request_For_Financing() {
		return msdemo_Maintainence_Under_MenuOption_Request_For_Financing;

	}
	
	@FindBy(xpath = "//*[@id=\"requestFinancingApplicationFor_567RF00MT\"]")
	private WebElement reasonForSubmissionSelect;
	public WebElement reasonForSubmissionSelect() {
		return reasonForSubmissionSelect;
	}

	
	
	@FindBy(xpath = "//input[@id=\"lookuptxt_requestFinanacingCif_567RF00MT\"]")
	private WebElement customerCIF;
	public WebElement customerCIF() {
		return customerCIF;
	}

	
	@FindBy(xpath = "//*[@id=\"lookuptxt_requestFinancingFacilityType_567RF00MT\"]")
	private WebElement facilityTypeInRequestForFinancingScreen;
	public WebElement facilityTypeInRequestForFinancingScreen() {
		return facilityTypeInRequestForFinancingScreen;
	}

	
	
	@FindBy(xpath = "//input[@id=\"requestFinancingInfoCompletionDate_567RF00MT\"]")
	private WebElement Completiondate;
	public WebElement Completiondate() {
		return Completiondate;
	}

	
	
	@FindBy(xpath = "//*[@id=\"requestFinancingFacilityTotalvalue_567RF00MT\"]")
	private WebElement totallimit;
	public WebElement totallimit() {
		return totallimit;
	}

	
	
	@FindBy(xpath = "//*[@id=\"requestFinancingHistorywithITFC_567RF00MT\"]")
	private WebElement historywithitfc;
	public WebElement historywithitfc() {
		return historywithitfc;
	}

	
	
	@FindBy(xpath = "(//li[@class='path-added-tab ui-state-default ui-corner-top'])[1]")
	private WebElement disbursementOrSublimitInRequestForFinancingScreen;

	public WebElement disbursementOrSublimitInRequestForFinancingScreen() {
		return disbursementOrSublimitInRequestForFinancingScreen;
	}

	
	
	@FindBy(xpath = "//*[@id=\"add_RequestFinancingLimitDetailsGridId_567RF00MT\"]/div/span")
	private WebElement addIconInDisbursementOrSublimitScreen;

	public WebElement addIconInDisbursementOrSublimitScreen() {
		return addIconInDisbursementOrSublimitScreen;
	}

	
	@FindBy(xpath = "")
	private WebElement productClassInLimitDetailsPopUp;

	public WebElement productClassInLimitDetailsPopUp() {
		return productClassInLimitDetailsPopUp;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_requestFinancingLimitDetailsGeneralFacilityProductClass_333RF00MT']")
    private WebElement Product_Class;

	public WebElement ProductClass() {
		return Product_Class;	
	}

	@FindBy(xpath = "//span[normalize-space()='Add']")
    private WebElement Product_Class_Add;

	public WebElement ProductClassAdd() {
		return Product_Class_Add;	
	}

	@FindBy(xpath = "//tr[@id = '1']//td[@title = 'Product Class']")
    private WebElement Product_Class_Rec;

	public WebElement PricingClassRec() {
		return Product_Class_Rec;	
	}

	@FindBy(xpath = "//button[@id='requstFinancing_PricingDetails_btn_333RF00MT']//span[@class='ui-button-text']")
    private WebElement PricingDetails_Btn;

	public WebElement PricingDetailsBtn() {
		return PricingDetails_Btn;	
	}


	@FindBy(xpath = "//td[@id='td_fmsPricingDetailsGrid_333RF00MT_1_fmsApplYieldDetVO.MARGIN_RATE']")
    private WebElement Markup_Spread_Rec;

	public WebElement MarkupSpreadRec() {
		return Markup_Spread_Rec;	
	}

	@FindBy(xpath = "//input[@id='1_fmsApplYieldDetVO.MARGIN_RATE_fmsPricingDetailsGrid_333RF00MT']")
    private WebElement Markup_Spread_Input;

	public WebElement MarkupSpreadInput() {
		return Markup_Spread_Input;	
	}


	@FindBy(xpath = "//input[@id='1_fmsApplYieldDetVO.MINIMUM_YIELD_fmsPricingDetailsGrid_333RF00MT']")
    private WebElement Floor_Input;

	public WebElement FloorInput() {
		return Floor_Input;	
	}


	@FindBy(xpath = "//input[@id='1_fmsApplYieldDetVO.MAXIMUM_YIELD_fmsPricingDetailsGrid_333RF00MT']")
    private WebElement Cap_Input;

	public WebElement CapInput() {
		return Cap_Input;	
	}


	@FindBy(xpath = "//span[normalize-space()='OK']")
    private WebElement Pricing_Details_OK_Btn;

	public WebElement PricingDetailsOKBtn() {
		return Pricing_Details_OK_Btn;	
	}


	@FindBy(xpath = "//span[normalize-space()='Funding']")
    private WebElement Funding_Tab;

	public WebElement FundingTab() {
		return Funding_Tab;	
	}


	@FindBy(xpath = "//td[@id='add_RequestFinancingfundlimitsLimitDetailsGrid_333RF00MT']//span[@class='ui-icon ui-icon-plus']")
    private WebElement Funding_Add_Btn;

	public WebElement FundingAddBtn() {
		return Funding_Add_Btn;	
	}


	@FindBy(xpath = "//tr[@added = '1']//td[@tdlabel= 'Fund Code']")
    private WebElement Funding_Fund_Rec;

	public WebElement FundingFundRec() {
		return Funding_Fund_Rec;	
	}


	@FindBy(xpath = "//input[@id='new_1697539432181_fmsApplFundLimitDetVO.FUND_CODE_lookuptxt_RequestFinancingfundlimitsLimitDetailsGrid_333RF00MT']")
    private WebElement Funding_Fund_Code;

	public WebElement FundingFundCode() {
		return Funding_Fund_Code;	
	}

	@FindBy(xpath = "//span[normalize-space()='Conditions']")
    private WebElement Conditions_Tab;

	public WebElement ConditionsTab() {
		return Conditions_Tab;	
	}

	@FindBy(xpath = "//input[@id='fmsTimeLimitsDivSignAgreementFromDays_333RF00MT']")
    private WebElement Signing_Agreement_From_Day;

	public WebElement SigningAgreementFromDay() {
		return Signing_Agreement_From_Day;	
	}

	@FindBy(xpath = "//input[@id='fmsTimeLimitsDivEffectiveFromDays_333RF00MT']")
    private WebElement Effective_From_Days;

	public WebElement EffectiveFromDays() {
		return Effective_From_Days;	
	}

	@FindBy(xpath = "//input[@id='fmsTimeLimitsDivFirstDisburseFromDays_333RF00MT']")
    private WebElement First_Disburse_From_Days;

	public WebElement FirstDisburseFromDays() {
		return First_Disburse_From_Days;	
	}

	@FindBy(xpath = "//input[@id='fmsTimeLimitsDivfullUtilizationFromDays_333RF00MT']")
    private WebElement full_Utilization_From_Days;

	public WebElement fullUtilizationFromDays() {
		return full_Utilization_From_Days;	
	}


 

	@FindBy(xpath = "//input[@id='fmsTimeLimitsDivfullUtilizationFromDays_333RF00MT']")
    private WebElement Commodities_and_Security_Components;

	public WebElement CommoditiesandSecurityComponents() {
		return Commodities_and_Security_Components;	
	}

	@FindBy(xpath = "//td[@id='add_fmsApprovalcommoditiesDetailsGrid_333RF00MT']//span[@class='ui-icon ui-icon-plus']")
    private WebElement Add_Commodities_Btn;

	public WebElement AddCommoditiesBtn() {
		return Add_Commodities_Btn;	
	}


	@FindBy(xpath = "//td[@id='td_fmsApprovalcommoditiesDetailsGrid_333RF00MT_1_fmsApprvdCommdtyDetVO.CATEGORY']")
    private WebElement Commodities_New_Rec;

	public WebElement CommoditiesNewRec() {
		return Commodities_New_Rec;	
	}

	@FindBy(xpath = "//input[@id='new_1697548069573_fmsApprvdCommdtyDetVO.CATEGORY_lookuptxt_fmsApprovalcommoditiesDetailsGrid_333RF00MT']")
    private WebElement Commodities_Category_Input;

	public WebElement CommoditiesCategoryInput() {
		return Commodities_Category_Input;	
	}

	@FindBy(xpath = "//input[@id='new_1697548069573_fmsApprvdCommdtyDetVO.SUB_CATEGORY_lookuptxt_fmsApprovalcommoditiesDetailsGrid_333RF00MT']")
    private WebElement Commodities_Sub_Category_Code;

	public WebElement CommoditiesSubCategoryCode() {
		return Commodities_Sub_Category_Code;	
	}

	@FindBy(xpath = "//input[@id='new_1697548069573_fmsApprvdCommdtyDetVO.COMMODITY_lookuptxt_fmsApprovalcommoditiesDetailsGrid_333RF00MT']")
    private WebElement Commodities_Code;

	public WebElement CommoditiesCode() {
		return Commodities_Code;	
	}


	@FindBy(xpath = "//input[@id='new_1697548069573_fmsApprvdCommdtyDetVO.COMMODITY_lookuptxt_fmsApprovalcommoditiesDetailsGrid_333RF00MT']")
    private WebElement Expected_perc;

	public WebElement Expectedperc() {
		return Expected_perc;	
	}

	@FindBy(xpath = "//span[normalize-space()='Source/Destination']")
    private WebElement Source_Destination_Tab;

	public WebElement SourceDestinationTab() {
		return Source_Destination_Tab;	
	}

	@FindBy(xpath = "//td[@id='add_fmsSpecificCountriesGrid_333RF00MT']//span[@class='ui-icon ui-icon-plus']")
    private WebElement Source_Destination_Add_Btn;

	public WebElement SourceDestinationAddBtn() {
		return Source_Destination_Add_Btn;	
	}


	@FindBy(xpath = "//td[@id='td_fmsSpecificCountriesGrid_333RF00MT_1_fmsSpecificDetailsVO.COUNTRY_CODE']")
    private WebElement Source_Destination_Specific_Country_Code_Rec;

	public WebElement SourceDestinationSpecificCountryCodeRec() {
		return Source_Destination_Specific_Country_Code_Rec;	
	}
	//input[@id='new_1697541248366_fmsSpecificDetailsVO.EXPECTED_PERC']

	@FindBy(xpath = "//input[@id='new_1697541248366_fmsSpecificDetailsVO.EXPECTED_PERC']")
    private WebElement Source_Destination_Specific_Country_EXPECTED_PERC;

	public WebElement SourceDestinationSpecificCountryEXPECTEDPERC() {
		return Source_Destination_Specific_Country_EXPECTED_PERC;	
	}

	@FindBy(xpath = "//label[@id='requestFinancingFormId_333RF00MT_save_key']")
    private WebElement Save_Btn;

	public WebElement SaveBtn() {
		return Save_Btn;	
	}

	@FindBy(xpath = "//label[@id='requestFinancingFormId_333RF00MT_Validate_key']")
    private WebElement Validate_Btn;

	public WebElement ValidateBtn() {
		return Validate_Btn;	
	}


	@FindBy(xpath = "//td[normalize-space()='CONSUMER FINANCE']")
    private WebElement CONSUMER_FINANCE;

	public WebElement CONSUMERFINANCE() {
		return CONSUMER_FINANCE;	
	}

	@FindBy(xpath = "//input[@id='lookuptxt_requestFinanacingCif_333RF00MT']")
	private WebElement Customer_CIF_Feild;

 

	public WebElement CustomerCIFFeild() {
		return Customer_CIF_Feild;
	}
	
	
	
}
