package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChecknewfieldatsublimittabOBJ {
	WebDriver driver;
	public ChecknewfieldatsublimittabOBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this );
	}
	@FindBy(xpath = "//*[@id=\"applicationFacilityDateDetailssection_WIFT001MT\"]/table/tbody/tr[3]/td[2]/div/img")
	private WebElement additional_tab_expire_calender;
	public WebElement additionalTabExpireCalender() {
		return additional_tab_expire_calender;
	}

	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]")
	private WebElement additional_tab_expire_date;
	public WebElement additionalTabExpireDate() {
		return additional_tab_expire_date;
	}
	
	@FindBy(xpath="//button[@id='limitDetails_add_btn_WIFT001MT']")
	private WebElement Add_product_class;
    public WebElement addProductclass() {
		return Add_product_class;
	}
	@FindBy(xpath="//li[@id='applicationFacilityDocumentDetailsTabs_WIFT001MT']")
	private WebElement Documentdetails_Tab;
    public WebElement documentdetailstab() {
		return Documentdetails_Tab;
	}
    @FindBy(xpath="//input[@id='lookuptxt_applicationFacilitysolicitor_WIFT001MT']")
	private WebElement DocumentdetailsTab_SolicitorName_searchbox;
    public WebElement solicitornamesearchbox() {
		return DocumentdetailsTab_SolicitorName_searchbox;
	}

    
    @FindBy(xpath="//input[@id='lookuptxt_applicationFacilityEstimator_WIFT001MT']")
	private WebElement DocumentdetailsTab_EstimatorName_searchbox;
    public WebElement estimatornamesearchbox() {
		return DocumentdetailsTab_EstimatorName_searchbox;
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
	
	@FindBy(xpath = "//a[@id='WIFT001AP2']")
	private WebElement application_financial_facility_approve2;
	public WebElement applicationFinancialFacilityApproveLevel2() {
		return application_financial_facility_approve2;
	}
	
	@FindBy(xpath = "//a[@id='WIFT001AP3']")
	private WebElement application_financial_facility_approve3;
	public WebElement applicationFinancialFacilityApproveLevel3() {
		return application_financial_facility_approve3;
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
	@FindBy(xpath = "//td[text()='Reopen Rejected Applications']")
	private WebElement Reopen_rejected_application;
	public WebElement reopenrejectedapplication() {
		return Reopen_rejected_application;
	}
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Reopen_rejected_application_maintenance;
	public WebElement reopenrejectedapplicationmaintenance() {
		return Reopen_rejected_application_maintenance;
	}
	@FindBy(xpath = "//a[@id='//a[@id='infoBarSearchButton_WIFT0063MT']']")
	private WebElement maintenance_Searchbox;
	public WebElement maintenancesearchbox() {
		return maintenance_Searchbox;
	}
	@FindBy(xpath = "//*[@id='applicationFacilityGridTbl_Id_WIFT0063MT_pager_left']/table/tbody/tr/td[7]")
	private WebElement maintenance_Searchbox_Clear;
	public WebElement maintenancesearchboxclear() {
		return maintenance_Searchbox_Clear;
	}
	@FindBy(xpath = "(//tr[@id='1'])[6]")
	private WebElement maintenance_Searchbox_Clear_retrivedata;
	public WebElement maintenancesearchboxclearretrivedata() {
		return maintenance_Searchbox_Clear_retrivedata;
	}



	
	
	
	
	
	
	
	

}
