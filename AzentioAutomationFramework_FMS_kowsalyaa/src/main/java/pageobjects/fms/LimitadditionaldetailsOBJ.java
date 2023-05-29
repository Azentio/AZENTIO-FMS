package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LimitadditionaldetailsOBJ {
	WebDriver driver;
	public LimitadditionaldetailsOBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this );
	}
	@FindBy(xpath ="//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement Productclass_Value ;
	public WebElement productclassvalue() {
		return Productclass_Value;
	
    }
	@FindBy(xpath ="//td[text()='Facilities Management']")
	private WebElement Facility_Management ;
	public WebElement facilitymanagement() {
		return Facility_Management;
	
    }
	@FindBy(xpath ="(//span[text()='Update After Approve'])[1]")
	private WebElement Facility_Management_Updateafter_Approve ;
	public WebElement updateafterapprove() {
		return Facility_Management_Updateafter_Approve;
	}
	@FindBy(xpath ="//*[@id=\"facilityLimitDetailsTab_WIFT008MT\"]")
	private WebElement Facility_Limit_details ;
	public WebElement facilitylimitdetails() {
		return Facility_Limit_details;
	}
	@FindBy(xpath ="//input[@id='facilityMgtLimitDetailsyielddetrate_WIFT008MT']")
	private WebElement Limit_Additional_details_Rate ;
	public WebElement limitadditionaldetailsRate() {
		return Limit_Additional_details_Rate;
	}
	@FindBy(xpath ="//input[@id='facilityMgtLimitDetailsAdditionalMarginRate_WIFT008MT']")
	private WebElement Limit_Additional_details_MarginRate ;
	public WebElement limitadditionaldetailsMarginRate() {
		return Limit_Additional_details_MarginRate;
	}
	@FindBy(xpath ="//input[@id='1_fmsFacDocumentsVO.SOL_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement Solicitor_Datesent;
	public WebElement solicitordatesent() {
		return Solicitor_Datesent;
	}
	@FindBy(xpath ="//input[@id='1_fmsFacDocumentsVO.SOL_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement Solicitor_Datereceived ;
	public WebElement solicitordatereceived() {
		return Solicitor_Datereceived;
	}
	@FindBy(xpath ="//input[@id='1_fmsFacDocumentsVO.EST_DATE_SENT_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement Estimator_Datesent;
	public WebElement estimatordatesent() {
		return Estimator_Datesent;
	}
	@FindBy(xpath ="//input[@id='1_fmsFacDocumentsVO.EST_DATE_REC_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement Estimator_DateReceived ;
	public WebElement estimatordatereceived() {
		return Estimator_DateReceived;
	}
	@FindBy(xpath ="//input[@id='1_fmsFacDocumentsVO.CUSTODIAN_SENT_FacilityManagementDocumentDetailsGrid_WIFT008UP']")
	private WebElement Custodian_datesent;
	public WebElement custodiandatesent() {
		return Custodian_datesent;
	}
	@FindBy(xpath ="//*[@id=\"facilitymanagement_save_btn_WIFT008UP\"]/span[2]")
	private WebElement Datedetails_Save;
	public WebElement datedetailssave() {
		return Datedetails_Save;
	}
	@FindBy(xpath ="//span[text()='Approve/Reject']")
	private WebElement FacilityMangement_Approve;
	public WebElement facilitymanagementapprove() {
		return FacilityMangement_Approve;
	}
	@FindBy(xpath ="//*[@id=\"facilityManagementGridTbl_Id_WIFT008AP_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement Approve_Clearbutton;
	public WebElement approveclearbutton() {
		return Approve_Clearbutton;
	}
	@FindBy(xpath ="//*[@id=\"FacilityManagementFacilityLimitDetailsGrid_WIFT008AP\"]")
	private WebElement Productclass_Retrivedata_doubleclick;
	public WebElement pcretrivedatadoubleclick() {
		return Productclass_Retrivedata_doubleclick;
	}
	@FindBy(xpath ="//*[@id=\"limitDetails_close_btn_WIFT008AP\"]/span[2]")
	private WebElement Close_Button;
	public WebElement closebutton() {
		return Close_Button;
	}
	@FindBy(xpath ="(//span[text()='Maintenance'])[1]")
	private WebElement FacilityManagement_Maintenance;
	public WebElement facilitymanagementmaintenance() {
		return FacilityManagement_Maintenance;
	}
	@FindBy(xpath ="//*[@id=\"facilityManagementGridTbl_Id_WIFT008MT_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement FacilityManagement_Maintenance_Clear;
	public WebElement facilitymanagementmaintenanceclear() {
		return FacilityManagement_Maintenance_Clear;
	}
	





}
