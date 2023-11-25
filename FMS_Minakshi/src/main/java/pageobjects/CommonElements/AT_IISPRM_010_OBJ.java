package pageobjects.CommonElements;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class AT_IISPRM_010_OBJ
{
	WebDriver driver;

 

	public AT_IISPRM_010_OBJ(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//*[@id=\"td_ApplicationFacilityLimitDetailsGrid_WIFT001MT_1_fmsAppLimitDetVO.GENERAL_FACILITY_TYPE\"]")	
	private WebElement NewCreatedProductClass;
	public WebElement NewCreatedProductClass() 
	{
		return NewCreatedProductClass;
	}
	@FindBy(xpath= "//*[@id=\"applicationfacility_repayplan_btn_WIFT001MT\"]/span[2]")	
	private WebElement Replaymentplantab;
	public WebElement Replaymentplantab() 
	{
		return Replaymentplantab;
	}
	@FindBy(xpath= "//*[@id=\"repaymentPlanFormId_WIFT001MT_Create_Schedule_key\"]")	
	private WebElement CreateSchedulebtn ;
	public WebElement CreateSchedulebtn() 
	{
		return CreateSchedulebtn ;
	}
	
	@FindBy(xpath= "//*[@id=\"_popup_path_sol_confirm_ok\"]")	
	private WebElement YesbtninWarningPopup;
	public WebElement YesbtninWarningPopup() 
	{
		return YesbtninWarningPopup;
	}
	
	@FindBy(xpath= "//*[@id=\"rePaymentPlanMainTab1_WIFT001MT\"]/a/span")	
	private WebElement Plandetailbtn ;
	public WebElement Plandetailbtn() 
	{
		return Plandetailbtn;
	}
	
	@FindBy(xpath= "//*[@id=\"savebutton_WIFT001MT\"]/span[2]")	
	private WebElement SavebtnUnderPlanDeatil;
	public WebElement SavebtnUnderPlanDeatil () 
	{
		return SavebtnUnderPlanDeatil;
	}
	@FindBy(xpath= "//*[@id=\"_popup_path_sol_confirm_ok\"]")	
	private WebElement YesbtninWarningPopUnderPlanDetail;
	public WebElement YesbtninWarningPopUnderPlanDetail() 
	{
		return YesbtninWarningPopUnderPlanDetail;
	}
	@FindBy(xpath= "//*[@id=\"_popup_path_sol_ok\"]")	
	private WebElement OkbtninSuccessunderplandetail;
	public WebElement OkbtninSuccessunderplandetail() 
	{
		return OkbtninSuccessunderplandetail;
	}
	@FindBy(xpath= "//*[@id=\"applicationfacility_save_btn_WIFT001MT\"]/span[2]")	
	private WebElement Validatebtnunderplandetail;
	public WebElement Validatebtnunderplandetail() 
	{
		return Validatebtnunderplandetail;
	}
	@FindBy(xpath="//*[@id=\"_popup_path_sol_confirm_ok\"]")	
	private WebElement Okbtnaftervalidate;
	public WebElement Okbtnaftervalidate() 
	{
		return Okbtnaftervalidate;
	}
	@FindBy(xpath= "//*[@id=\"_popup_path_sol_confirm_ok\"]")	
	private WebElement  yesconfirmaftervalidate;
	public WebElement yesconfirmaftervalidate () 
	{
		return yesconfirmaftervalidate;
	}
	
	@FindBy(xpath= "//*[@id=\"_popup_path_sol_ok\"]")	
	private WebElement okconfirmaftervalidate ;
	public WebElement okconfirmaftervalidate () 
	{
		return okconfirmaftervalidate;
	}
	
	@FindBy(xpath= "/html/body/div[38]/div[1]/a/span")	
	private WebElement closesign ;
	public WebElement  closesign() 
	{
		return closesign;
	}
	
}