package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Request_For_FinancingObj {
	
	WebDriver driver;
	public Request_For_FinancingObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
//	AT_RF_141
	@FindBy(xpath = "//td[text()='Request']")
	private WebElement FMS_core_request_module;
	public WebElement FMSCoreRequestModule() {
		return FMS_core_request_module;
	}
	
	@FindBy(xpath = "//td[text()='Request Financing']")
	private WebElement request_financing_feature;
	public WebElement requestFinancingFeature() {
		return request_financing_feature;
	}
	
	@FindBy(xpath = "//div[@id='_selenuimRFFRF00']//td[contains(text(),'Request')]")
	private WebElement request_for_financing_feature;
	public WebElement requestForFinancingFeature() {
		return request_for_financing_feature;
	}
	
	@FindBy(xpath = "//a[@id='RFFRF00MT']")
	private WebElement request_for_financing_maintanance;
	public WebElement requestForFinancingMaintanance() {
		return request_for_financing_maintanance;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_RFFRF00MT']")
	private WebElement request_for_financing_maintanance_search_btn;
	public WebElement requestForFinancingMaintananceSearchBtn() {
		return request_for_financing_maintanance_search_btn;
	}
	
	@FindBy(xpath = "//td[@id='requestFinancingGridTbl_Id_RFFRF00MT_pager_left']/table/tbody/tr/td[7]")
	private WebElement request_for_financing_maintanance_clear_btn;
	public WebElement requestForFinancingMaintananceClearBtn() {
		return request_for_financing_maintanance_clear_btn;
	}
	
	@FindBy(xpath = "//div[@id='jqgh_requestFinancingGridTbl_Id_RFFRF00MT_cifVO.SHORT_NAME_ENG']")
	private WebElement request_for_financing_main_CIF_short_name_title;
	public WebElement requestForFinancingMainCIFShortNameTitle() {
		return request_for_financing_main_CIF_short_name_title;
	}
	
	@FindBy(xpath = "//td[@id='td_requestFinancingGridTbl_Id_RFFRF00MT_1_cifVO.SHORT_NAME_ENG']")
	private WebElement request_for_financing_main_CIF_short_name_value;
	public WebElement requestForFinancingMainCIFShortNameValue() {
		return request_for_financing_main_CIF_short_name_value;
	}
	
	@FindBy(xpath = "//div[@id='jqgh_requestFinancingGridTbl_Id_RFFRF00MT_cifVO.LONG_NAME_ENG']")
	private WebElement request_for_financing_main_CIF_long_name_title;
	public WebElement requestForFinancingMainCIFLongNameTitle() {
		return request_for_financing_main_CIF_long_name_title;
	}
	
	@FindBy(xpath = "//td[@id='td_requestFinancingGridTbl_Id_RFFRF00MT_1_cifVO.LONG_NAME_ENG']")
	private WebElement request_for_financing_main_CIF_long_name_value;
	public WebElement requestForFinancingMainCIFLongNameValue() {
		return request_for_financing_main_CIF_long_name_value;
	}
	
//	@AT_RF_141_arabic
	// after change the arabic language	
	@FindBy(xpath = "//td[text()='طلب تمويل ']")
	private WebElement arabic_funding_request;
	public WebElement arabicFundingRequest() {
		return arabic_funding_request;
	}
	
	@FindBy(xpath = "//td[text()='طلب']")
	private WebElement arabic_request;
	public WebElement arabicRequest() {
		return arabic_request;
	}
	
	@FindBy(xpath = "//td[text()='طلب تمويل']")
	private WebElement arabic_request_funding_request;
	public WebElement arabicRequestFundingRequest() {
		return arabic_request_funding_request;
	}
	
	@FindBy(xpath = "//a[@id='RFFRF00AC']")
	private WebElement arabic_funding_request_approval_committee;
	public WebElement arabicFundingRequestApprovalCommittee() {
		return arabic_funding_request_approval_committee;
	}
	
	@FindBy(xpath = "//div[@id='jqgh_requestFinancingGridTbl_Id_RFFRF00AC_cifVO.SHORT_NAME_ENG']")
	private WebElement arabic_approval_committee_Searchgrid;
	public WebElement arabicApprovalCommitteeSearchGrid() {
		return arabic_approval_committee_Searchgrid;
	}
	
}
