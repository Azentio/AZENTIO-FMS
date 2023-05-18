package pageobjects.fmsParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facility_CategoryObj {
	
	WebDriver driver;
	public Facility_CategoryObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
		// @299883
		@FindBy(xpath = "//td[text()='Parameters']")
		private WebElement fms_param_parameter;
		public WebElement fmsParamParameter() {
			return fms_param_parameter;
		}
		
		@FindBy(xpath = "//td[text()='Facility Category']")
		private WebElement parameter_facility_category;
		public WebElement parameterFacilityCategory() {
			return parameter_facility_category;
		}
		
		@FindBy(xpath = "//a[@id='P009MT']")
		private WebElement facility_category_main;
		public WebElement facilityCategoryMain() {
			return facility_category_main;
		}
		
		@FindBy(xpath = "//a[@id='infoBarSearchButton_P009MT']")
		private WebElement main_search_btn;
		public WebElement mainSearchBtn() {
			return main_search_btn;
		}
		
		@FindBy(xpath = "(//td[text()='Treasury'])[1]")
		private WebElement main_search_result;
		public WebElement mainSearchResult() {
			return main_search_result;
		}
		
		@FindBy(xpath = "//input[@id='lookuptxt_cif_type_P009MT']")
		private WebElement main_cif_input;
		public WebElement mainCIFInput() {
			return main_cif_input;
		}
		
		@FindBy(xpath = "//span[@id='spanLookup_cif_type_P009MT']")
		private WebElement main_cif_type_search_option;
		public WebElement mainCIFTypeSearchOption() {
			return main_cif_type_search_option;
		}
		
		@FindBy(id = "td_gridtab_cif_type_P009MT_5_TYPE_CODE")
		private WebElement main_cif_type_data;
		public WebElement mainCIFTypeData() {
			return main_cif_type_data;
		}
		
		@FindBy(xpath = "//button[@id='facilitycategory_save_btn_P009MT']")
		private WebElement main_save_btn;
		public WebElement mainSaveBtn() {
			return main_save_btn;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement button_confirm_ok;
		public WebElement ButtonConfirmOk() {
			return button_confirm_ok;
		}
		
		@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
		private WebElement button_success_ok;
		public WebElement ButtonSuccessOk() {
			return button_success_ok;
		}
		

}
