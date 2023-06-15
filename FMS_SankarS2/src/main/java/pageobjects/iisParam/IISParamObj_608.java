package pageobjects.iisParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IISParamObj_608 {	
	WebDriver driver;
	
	public IISParamObj_608(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//	AT_RF_014_IISParam
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement IIS_parameter_feature;
	public WebElement IISParameterFeature_608() {
		return IIS_parameter_feature;
	}
	
	@FindBy(xpath = "//td[text()='Product Class']")
	private WebElement parameter_product_class_module;
	public WebElement parameterProductClassModule_608() {
		return parameter_product_class_module;
	}
	
	@FindBy(xpath = "//a[@id='M003MT']")
	private WebElement product_class_maintanance;
	public WebElement productClassMaintanance_608() {
		return product_class_maintanance;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_M003MT']")
	private WebElement product_class_main_search_btn;
	public WebElement productClassMainSearchBtn_608() {
		return product_class_main_search_btn;
	}
	
	@FindBy(xpath = "//input[@id='iISProductClassListGridTbl_Id_M003MT_gs_trsctrlclassVO.CLASS']")
	private WebElement product_class_main_search_class;
	public WebElement productClassMainSearchClass_608() {
		return product_class_main_search_class;
	}
	
	@FindBy(xpath = "//td[text()='Ijara']")
	private WebElement product_class_main_search_row_label;
	public WebElement productClassMainSearchRowLabel_608() {
		return product_class_main_search_row_label;
	}
	
	@FindBy(xpath = "//td[@id='td_iISProductClassListGridTbl_Id_M003MT_1_trsctrlclassVO.CLASS']")
	private WebElement product_class_main_searched_row;
	public WebElement productClassMainSearchedRow_608() {
		return product_class_main_searched_row;
	}
	
	@FindBy(xpath = "//li[@id='iisProductClassAdditionalInformation_M003MT']")
	private WebElement product_class_main_additional_info_tab;
	public WebElement productClassMainAdditionalInfoTab_608() {
		return product_class_main_additional_info_tab;
	}
	
	@FindBy(xpath = "//li[@id='iisProductClassAdditionalInformationRepaymentPlan_M003MT']")
	private WebElement main_additional_info_repayment_plan_tab;
	public WebElement mainAdditionalInfoRepaymentTab_608() {
		return main_additional_info_repayment_plan_tab;
	}
	
	@FindBy(xpath = "//input[@id='iisProductClassNumberOfPayments_M003MT']")
	private WebElement repayment_plan_no_of_payments_input;
	public WebElement repaymentTabNoOfPaymentInput_608() {
		return repayment_plan_no_of_payments_input;
	}
	
	@FindBy(xpath = "//select[@id='iisProductClassRoundingFactor_M003MT']")
	private WebElement repayment_plan_no_of_payments_dropdown;
	public WebElement repaymentTabNoOfPaymentDropdown_608() {
		return repayment_plan_no_of_payments_dropdown;
	}
	
	@FindBy(xpath = "//button[@id='iISProductClassMaint_save_M003MT']")
	private WebElement product_class_main_save_btn;
	public WebElement productClassMainSaveBtn_608() {
		return product_class_main_save_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement confirm_popup_ok_btn;
	public WebElement confirmPopupOkBtn_608() {
		return confirm_popup_ok_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement success_popup_ok_btn;
	public WebElement successPopupOkBtn_608() {
		return success_popup_ok_btn;
	}
	
//	AT_RF_014_FMSCore
	@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001MT_1_rn']")
	private WebElement limit_details_first_row;
	public WebElement limitDetailsFirstRow_608() {
		return limit_details_first_row;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_repayplan_btn_WIFT001MT']")
	private WebElement limit_details_repayment_plan_btn;
	public WebElement limitDetailsRepaymentPlanBtn_608() {
		return limit_details_repayment_plan_btn;
	}
	
	@FindBy(xpath = "//select[@id='Rounding_Factor_WIFT001MT']")
	private WebElement fms_repayment_plan_rounding_factor_dropdown;
	public WebElement fmsRepaymentPlanRoundingfactorDropdown_608() {
		return fms_repayment_plan_rounding_factor_dropdown;
	}
	
	@FindBy(xpath = "//input[@id='No_Of_Payments_WIFT001MT']")
	private WebElement fms_repayment_plan_no_of_payments_input;
	public WebElement fmsRepaymentPlanNoOfPaymentsInput_608() {
		return fms_repayment_plan_no_of_payments_input;
	}
			
			
	
	
	
}
