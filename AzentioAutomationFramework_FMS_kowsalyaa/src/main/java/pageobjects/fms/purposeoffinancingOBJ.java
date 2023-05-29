package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class purposeoffinancingOBJ {
	WebDriver driver;
	public purposeoffinancingOBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this );
	}
	//Fms_Param
	@FindBy(xpath ="//td[text()='Purpose of Financing']")
	private WebElement Parameter_PurposeOfFinancing;
	public WebElement purposeoffinancing() {
		return Parameter_PurposeOfFinancing;
	
    }
	@FindBy(xpath ="//span[text()='Maintenance']")
	private WebElement PurposeOfFinancing_Maintenence;
	public WebElement purposeoffinancingmaintenance() {
		return PurposeOfFinancing_Maintenence;
	
    }
	@FindBy(xpath ="//input[@id='purposefinancingFormIdCode_P038MT']")
	private WebElement Maintenence_Code;
	public WebElement maintenancecode() {
		return Maintenence_Code;
	}
	@FindBy(xpath ="//input[@id='purposefinancingFormIdAdditionalNumber_P038MT']")
	private WebElement Additional_Number;
	public WebElement additionalnumber() {
		return Additional_Number;
	}
	@FindBy(xpath ="//input[@id='purposefinancingFormIdDescription_eng_P038MT']")
	private WebElement Discription;
	public WebElement discription() {
		return Discription;
	}
	@FindBy(xpath ="//span[text()='Product Class']")
	private WebElement Product_Class;
	public WebElement productclass() {
		return Product_Class;
	}
	@FindBy(xpath ="//*[@id=\"add_purposeFinancingProductClassGrid_P038MT\"]/div/span")
	private WebElement Product_Class_Addbutton;
	public WebElement productclassaddbutton() {
		return Product_Class_Addbutton;
	}
	@FindBy(xpath ="new_1685274582032_purposeFinancingProductClassVO.PRODUCTCLASS_lookuptxt_purposeFinancingProductClassGrid_P038MT")
	private WebElement Product_Class_Searchbutton;
	public WebElement productclasssearchbutton() {
		return Product_Class_Searchbutton;
	}
	@FindBy(xpath ="//label[@id='purposefinancingFormId_P038MT_Save_key']")
	private WebElement Product_Class_Savebutton ;
	public WebElement productclasssavebutton() {
		return Product_Class_Savebutton;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Save_button_confirm_ok;
	public WebElement saveButtonConfirmOk() {
		return Save_button_confirm_ok;
	}
	
	@FindBy(xpath = "//*[@id='_popup_path_sol_ok']")
	private WebElement Save_button_success_ok;
	public WebElement saveButtonSuccessOk() {
		return Save_button_success_ok;
	}
	@FindBy(xpath ="//a[@id='P038P']]")
	private WebElement Purposeofinancing_Approve ;
	public WebElement purposeoffinancingapprove() {
		return Purposeofinancing_Approve;
	}
	@FindBy(xpath ="//input[@id='purposeFinancingListGridTbl_Id_P038P_gs_purposeFinancingVO.CODE']")
	private WebElement Approve_Searchbox ;
	public WebElement approvesearchbox() {
		return Approve_Searchbox;
	}
	@FindBy(xpath ="//tr[@id='1']")
	private WebElement Approve_Searchbox_Retrivedata ;
	public WebElement approvesearchboxretrivedata() {
		return Approve_Searchbox_Retrivedata;
	}
	@FindBy(xpath ="//label[@id='purposefinancingFormId_P038P_approve_key']")
	private WebElement Approve_button ;
	public WebElement approvebutton() {
		return Approve_button;
	}
	
	//Fms core
	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
	private WebElement Product_Class_Value;
	public WebElement productclassvalue() {
		return Product_Class_Value;
	
    }
	@FindBy(xpath = "//span[@id='spanLookup_applicationfacilityLimitDetailsPURPOSE_OF_FIN_WIFT001MT']")
	private WebElement Retrived_PurposeOfFinancing;
	public WebElement retrivedpurposeoffinancing() {
		return Retrived_PurposeOfFinancing;
	}
}
	
