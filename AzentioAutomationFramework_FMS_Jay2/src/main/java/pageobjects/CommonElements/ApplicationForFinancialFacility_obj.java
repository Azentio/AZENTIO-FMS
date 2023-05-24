package pageobjects.CommonElements;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataProvider.ExcelData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ApplicationForFinancialFacility_obj {
	WebDriver driver;
	public ApplicationForFinancialFacility_obj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement FmsParameters;
	public WebElement FmsParameters() {
		return FmsParameters;
	}
	
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
	
	@FindBy(xpath = "//td[@id='td_fmsFacilityTypeListGridTbl_Id_P008UP_1_CODE' and text()='369']")
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
	private WebElement Apply_Corporate_Package;
	public WebElement ApplyCorporatePackage() {
		return Apply_Corporate_Package;
	}
	
	@FindBy(id = "fmsFacilityTypeMaintFormId_P008UP_Update_key")
	private WebElement Application_Requirement_Updatebutton;
	public WebElement ApplicationRequirement_Updatebutton() {
		return Application_Requirement_Updatebutton;
	}
	
	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement popup_path_sol_confirm_ok;
	public WebElement popuppathConfirm_ok() {
		return popup_path_sol_confirm_ok;
	}
	
	@FindBy(id = "_popup_path_sol_ok")
	private WebElement popup_path_sol_ok;
	public WebElement informatioPopupOk() {
		return popup_path_sol_ok;
	}
	
	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement Approve_Menu;
	public WebElement ApproveMenu() {
		return Approve_Menu;
	}
	
	@FindBy(id = "fmsFacilityTypeListGridTbl_Id_P008P_gs_CODE")
	private WebElement Search_for_code_ApproveMenu;
	public WebElement SearchforcodeApproveMenu() {
		return Search_for_code_ApproveMenu;
	}

	
	
	@FindBy(xpath = "//td[@id='td_fmsFacilityTypeListGridTbl_Id_P008P_1_CODE' and text()='369']")
	private WebElement Search_for_codeSelect_ApproveMenu;
	public WebElement SearchforcodeSelectApproveMenu() {
		return Search_for_codeSelect_ApproveMenu;
	}
	
	@FindBy(xpath = "//li[@id='fmsFacilityTypeDetailsTab_P008P']/a/span[text()='Facility Details']")
	private WebElement Facility_Details_ApproveMenu;
	public WebElement FacilityDetailsApproveMenu() {
		return Facility_Details_ApproveMenu;
	}
	
		
	@FindBy(id = "fmsFacilityTypeMaintFormId_P008P_approve_key")
	private WebElement Click_ApproveIn_ApproveMenu;
	public WebElement ClickApproveInApproveMenu() {
		return Click_ApproveIn_ApproveMenu;
	}
	
	@FindBy(id = "_popup_path_sol_confirm_ok")
	private WebElement Click_Confirm_ApproveMenu;
	public WebElement ClickConfirmApproveMenu() {
		return Click_Confirm_ApproveMenu;
	}
	
	@FindBy(id = "_popup_path_sol_ok")
	private WebElement Click_InformationConfirm_ApproveMenu;
	public WebElement ClickInformationConfirmApproveMenu() {
		return Click_InformationConfirm_ApproveMenu;
	}
	
	
	//--------------------
	
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
	
	@FindBy(xpath =  "//input[@id='lookuptxt_applicationFacilityFacilityType_WIFT001MT']")   
	private WebElement Enter_codeOn_Facility_Type;
	public WebElement getEnter_codeOn_Facility_Type() {
		return Enter_codeOn_Facility_Type;
	}
	
	@FindBy(id =  "ApplycooratepackageChkBox_WIFT001MT")   
	private WebElement Apply_Corporate_Package_button_IsDisabled;
	public WebElement ApplyCorporatePackagebuttonIsDisabled() {
		return Apply_Corporate_Package_button_IsDisabled;
	}
	
	
	//--------------------------------------------------------
	
	
	
}
