package pageobjects.CommonElements;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class AT_RF_143_OBJ
{
	WebDriver driver;
	public AT_RF_143_OBJ(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath= "//*[@id=\"trsChargesMainTab2_M08MT\"]/a/span")	
	private WebElement Additionaldetail;
	public WebElement Additionaldetail() 
	{
		return Additionaldetail;
	}
	@FindBy(xpath= "(//input[@class='path-theme-cust-input textCompSize ui-state-focus ui-corner-all'])[6]")	
	private WebElement Flatammount;
	public WebElement Flatammount() 
	{
		return Flatammount;
	}
	@FindBy(xpath= "//*[@id=\"trscharges_ALLOW_TO_EDIT_CHARGES_M08MT\"]")	
	private WebElement Allowtoeditcharge;
	public WebElement Allowtoeditcharge() 
	{
		return Allowtoeditcharge;
	}
	@FindBy(xpath= "//*[@id=\"trscharges_EDIT_ACC_INCIDENTAL_SCR_YN_M08MT\"]")	
	private WebElement flatammountcirrencytype;
	public WebElement flatammountcirrencytype() 
	{
		return flatammountcirrencytype;
	}
	@FindBy(xpath= "//*[@id=\"trscharges_ALLOW_TO_EDIT_CHARGE_PER_YN_M08MT\"]")	
	private WebElement Allowtoeditchargepercentage;
	public WebElement Allowtoeditchargepercentage() 
	{
		return Allowtoeditchargepercentage;
	}
	@FindBy(xpath= "//*[@id=\"spanLookup_trschargesDeferredYear_acc_sl_no_M08MT\"]/span")	
	private WebElement chargereceivable;
	public WebElement chargereceivable() 
	{
		return chargereceivable;
	}
	@FindBy(xpath= "//*[@id=\"td_gridtab_trschargesDeferredYear_acc_sl_no_M08MT_1_amfVO.BRANCH_CODE\"]")	
	private WebElement retrivedata;
	public WebElement retrivedata() 
	{
		return retrivedata;
	}
	@FindBy(xpath= "//*[@id=\"requestFinancingFormId_CSMRF00MT_Fees_Charges_Key\"]")	
	private WebElement feescharges;
	public WebElement feescharges() 
	{
		return feescharges;
	}
	@FindBy(xpath= "//*[@id=\"requestFinancingLimitDtlsTabs_CSMRF00MT\"]/a/span")	
	private WebElement Disbursement;
	public WebElement Disbursement() 
	{
		return Disbursement;
	}
	@FindBy(xpath= "//*[@id=\"lookuptxt_requestFinancingLimitDetailsGeneralFacilityProductClass_CSMRF00MT\"]")	
	private WebElement productclass;
	public WebElement productclass() 
	{
		return productclass;
	}
	@FindBy(xpath= "//*[@id=\"limitDetails_add_btn_CSMRF00MT\"]")	
	private WebElement addbutton;
	public WebElement addbutton() 
	{
		return addbutton;
	}
	@FindBy(xpath= "//*[@id=\"add_RequestFinancingLimitDetailsGridId_CSMRF00MT\"]/div/span")	
	private WebElement addicon;
	public WebElement addicon() 
	{
		return addicon;
	}
}