package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParamestimatorsreflectswifakapplicationOBJ {
	WebDriver driver;
	
	public ParamestimatorsreflectswifakapplicationOBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='Parameters']")
	private WebElement PaRam_ParaMeters;
	public WebElement paramparameters() {
		return PaRam_ParaMeters;
	}
	@FindBy(xpath="//td[text()='Estimators']")
	private WebElement ParaMeters_Estimators;
	public WebElement parametersestimators() {
		return ParaMeters_Estimators;
	}
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement Estimators_maintenance;
	public WebElement estimatorsmaintenance() {
		return Estimators_maintenance;
	}
	@FindBy(xpath="(//input[@class='path-theme-cust-input textCompSize ui-state-focus ui-corner-all'])[1]")
	private WebElement Estimators_COde;
	public WebElement estimatorscode() {
		return Estimators_COde;
	}
	@FindBy(xpath="//label[@id='lbl_fmsEstimators_code_P034MT']")
	private WebElement Estimators_COde_touch;
	public WebElement estimatorscodetouch() {
		return Estimators_COde_touch;
	}
	@FindBy(xpath="//input[@id='fmsEstimators_brief_name_eng_P034MT']")
	private WebElement Brief_DISCription;
	public WebElement briefdiscription() {
		return Brief_DISCription;
	}
	@FindBy(xpath="//input[@id='fmsEstimators_long_name_eng_P034MT']")
	private WebElement Long_DISCription;
	public WebElement longdiscription() {
		return Long_DISCription;
	}
	@FindBy(xpath="//input[@id='fmsEstimators_brief_name_arab_P034MT']")
	private WebElement Brief_DISCription_arabic;
	public WebElement briefdiscriptionarabic() {
		return Brief_DISCription_arabic;
	}
	@FindBy(xpath="//input[@id='fmsEstimators_long_name_arab_P034MT']")
	private WebElement Long_DISCription_arabic;
	public WebElement longdiscriptionarabic() {
		return Long_DISCription_arabic;
	}
	@FindBy(xpath="//input[@id='fmsEstimators_address_1_P034MT']")
	private WebElement DISCription_AddRess;
	public WebElement discriptionaddress() {
		return DISCription_AddRess;
	}
	@FindBy(xpath="//input[@id='fmsEstimators_mobile_P034MT']")
	private WebElement moBILE_Number;
	public WebElement mobilenumber() {
		return moBILE_Number;
	}
	@FindBy(xpath="//input[@id='lookuptxt_fmsEstimators_postal_code_P034MT']")
	private WebElement POStal_Code;
	public WebElement postalcode() {
		return POStal_Code;
	}
	@FindBy(xpath="//label[@id='fmsEstimatorsFormId_P034MT_Save_key']")
	private WebElement Save_button;
	public WebElement savebutton() {
		return POStal_Code;
	}
	@FindBy(xpath="//*[@id=\"P034P\"]/span[2]")
	private WebElement Approve_screen;
	public WebElement approvescreen() {
		return Approve_screen;
	}
	@FindBy(xpath="//input[@id='fmsEstimatorsParamListGridTbl_Id_P034P_gs_CODE']")
	private WebElement Approve_screenclick_Searchbox;
	public WebElement approvescreenclicksearchbox() {
		return Approve_screenclick_Searchbox;
	}
	@FindBy(xpath="//table[@id='fmsEstimatorsParamListGridTbl_Id_P034P']")
	private WebElement Approve_searchbox_doubleclick;
	public WebElement searchboxdoubleclick() {
		return Approve_searchbox_doubleclick;
	}
	@FindBy(xpath="//label[@id='fmsEstimatorsFormId_P034P_approve_key']")
	private WebElement Final_Approve;
	public WebElement finalapprove() {
		return Final_Approve;
	}
	
	
	
	
	

}
