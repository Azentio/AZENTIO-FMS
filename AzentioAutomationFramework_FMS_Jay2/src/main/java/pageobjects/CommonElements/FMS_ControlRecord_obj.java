package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FMS_ControlRecord_obj {
	
	WebDriver driver;
	public FMS_ControlRecord_obj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement fms_param_parameter;
	public WebElement fmsParamParameter() {
		return fms_param_parameter;
	}
	
	@FindBy(xpath = "//td[text()='Control Record']")
	private WebElement param_control_records;
	public WebElement paramControlRecords() {
		return param_control_records;
	}
	
	@FindBy(xpath = "//a[@id='P007UP']")
	private WebElement control_records_update_after_approve;
	public WebElement controlRecordsUpdateAfterApprove() {
		return control_records_update_after_approve;
	}
	
	//FmsCtrlRecord_cifGenLimit_P007UP
	@FindBy(id = "FmsCtrlRecord_cifGenLimit_P007UP")
	private WebElement General_Limit_ByCIF;
	public WebElement GeneralLimitByCIF() {
		return General_Limit_ByCIF;
	}
	
	
        @FindBy(xpath = "//button[@id='fmsControlRecordMaint_update_P007UP']")
	private WebElement update_after_update_btn;
	public WebElement updateAfterUpdateBtn() {
		return update_after_update_btn;
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
	
	@FindBy(xpath = "//a[@id='P007P']")
	private WebElement control_records_approve;
	public WebElement controlRecordsApprove() {
		return control_records_approve;
	}
	
	@FindBy(xpath = "//button[@id='fmsControlRecordMaint_approve_P007P']" )
	private WebElement approve_button;
	public WebElement approveButton() {
		return approve_button;
	}
}
