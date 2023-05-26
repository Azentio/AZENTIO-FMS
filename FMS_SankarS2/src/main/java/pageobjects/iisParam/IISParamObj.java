package pageobjects.iisParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IISParamObj {	
	WebDriver driver;
	
	public IISParamObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//	665923_IISParam
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement IIS_parameter_feature;
	public WebElement IISParameterFeature() {
		return IIS_parameter_feature;
	}
	
	@FindBy(xpath = "//td[text()='Product Class']")
	private WebElement parameter_product_class_module;
	public WebElement parameterProductClassModule() {
		return parameter_product_class_module;
	}
	
	@FindBy(xpath = "//a[@id='M003MT']")
	private WebElement product_class_maintanance;
	public WebElement productClassMaintanance() {
		return product_class_maintanance;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_M003MT']")
	private WebElement product_class_main_search_btn;
	public WebElement productClassMainSearchBtn() {
		return product_class_main_search_btn;
	}
	
	@FindBy(xpath = "//input[@id='iISProductClassListGridTbl_Id_M003MT_gs_trsctrlclassVO.CLASS']")
	private WebElement product_class_main_search_class;
	public WebElement productClassMainSearchClass() {
		return product_class_main_search_class;
	}
	
	@FindBy(xpath = "//td[@id='td_iISProductClassListGridTbl_Id_M003MT_1_trsctrlclassVO.CLASS']")
	private WebElement product_class_main_searched_row;
	public WebElement productClassMainSearchedRow() {
		return product_class_main_searched_row;
	}
	
	@FindBy(xpath = "//li[@id='iisProductClassAdditionalInformation_M003MT']")
	private WebElement product_class_main_additional_info_tab;
	public WebElement productClassMainAdditionalInfoTab() {
		return product_class_main_additional_info_tab;
	}
	
	@FindBy(xpath = "//li[@id='iisProductClassAdditionalInformationRepaymentPlan_M003MT']")
	private WebElement main_additional_info_repayment_plan_tab;
	public WebElement mainAdditionalInfoRepaymentTab() {
		return main_additional_info_repayment_plan_tab;
	}
	
	@FindBy(xpath = "//input[@id='iisProductClassNumberOfPayments_M003MT']")
	private WebElement repayment_plan_no_of_payments_input;
	public WebElement repaymentTabNoOfPaymentInput() {
		return repayment_plan_no_of_payments_input;
	}
	
	@FindBy(xpath = "//select[@id='iisProductClassRoundingFactor_M003MT']")
	private WebElement repayment_plan_no_of_payments_dropdown;
	public WebElement repaymentTabNoOfPaymentDropdown() {
		return repayment_plan_no_of_payments_dropdown;
	}
	
	@FindBy(xpath = "//button[@id='iISProductClassMaint_save_M003MT']")
	private WebElement product_class_main_save_btn;
	public WebElement productClassMainSaveBtn() {
		return product_class_main_save_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement confirm_ok_btn;
	public WebElement confirmOkBtn() {
		return confirm_ok_btn;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement success_ok_btn;
	public WebElement successOkBtn() {
		return success_ok_btn;
	}
	
//	665923_FMSCore
	@FindBy(xpath = "//td[@id='td_ApplicationFacilityLimitDetailsGrid_WIFT001MT_1_rn']")
	private WebElement limit_details_first_row;
	public WebElement limitDetailsFirstRow() {
		return limit_details_first_row;
	}
	
	@FindBy(xpath = "//button[@id='applicationfacility_repayplan_btn_WIFT001MT']")
	private WebElement limit_details_repayment_plan_btn;
	public WebElement limitDetailsRepaymentPlanBtn() {
		return limit_details_repayment_plan_btn;
	}
	
	@FindBy(xpath = "//select[@id='Rounding_Factor_WIFT001MT']")
	private WebElement fms_repayment_plan_rounding_factor_dropdown;
	public WebElement fmsRepaymentPlanRoundingfactorDropdown() {
		return fms_repayment_plan_rounding_factor_dropdown;
	}
	
	@FindBy(xpath = "//input[@id='No_Of_Payments_WIFT001MT']")
	private WebElement fms_repayment_plan_no_of_payments_input;
	public WebElement fmsRepaymentPlanNoOfPaymentsInput() {
		return fms_repayment_plan_no_of_payments_input;
	}
			
			
	
	
	
}
