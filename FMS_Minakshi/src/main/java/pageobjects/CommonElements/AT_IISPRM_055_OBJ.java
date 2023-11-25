package pageobjects.CommonElements;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class AT_IISPRM_055_OBJ 
{
	WebDriver driver;

 

	public AT_IISPRM_055_OBJ(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath= "//*[@id=\"_selenuimM00\"]/h3")	
	private WebElement Parameters;
	public WebElement Parameters() 
	{
		return Parameters;
	}

	@FindBy(xpath= "//*[@id=\"_selenuimM0622\"]/li/a")	
	private WebElement InsuranceCompanies;
	public WebElement InsuranceCompanies() 
	{
		return InsuranceCompanies;
	}

	/*@FindBy(xpath= "//*[@id=\"M038L\"]")	
	private WebElement List;
	public WebElement List() 
	{
		return List;
	}*/

	@FindBy(xpath= "//*[@id=\"M0622UP\"]")	
	private WebElement UpdateAfterApprove;
	public WebElement UpdateAfterApprove() 
	{
		return UpdateAfterApprove;
	}

	@FindBy(xpath= "//*[@id=\"M0622N\"]")	
	private WebElement Reject;
	public WebElement Reject() 
	{
		return Reject;
	}

	@FindBy(xpath= "//*[@id=\"M0622P\"]")	
	private WebElement Approve;
	public WebElement Approve() 
	{
		return Approve;
	}
	@FindBy(xpath= "//*[@id=\"M0622MT\"]")	
	private WebElement Maintenance;
	public WebElement Maintenance() 
	{
		return Maintenance;
	}

	@FindBy(xpath= "//*[@id=\"insuranceCompanyParamCode_M0622MT\"]")	
	private WebElement Code;
	public WebElement Code() 
	{
		return Code;
	}

	@FindBy(xpath= "//*[@id=\"insuranceCompanyParamBriefNameEng_M0622MT\"]")	
	private WebElement BriefDescription;
	public WebElement BriefDescription() 
	{
		return BriefDescription;
	}

	@FindBy(xpath= "//*[@id=\"insuranceCompanyParamLongNameEng_M0622MT\"]")	
	private WebElement LongDescription;
	public WebElement LongDescription() 
	{
		return LongDescription;
	}

	@FindBy(xpath= "	//*[@id=\"insuranceCompanyParamTrackerInsurance_M0622MT\"]")	
	private WebElement Tracker;
	public WebElement Tracker() 
	{
		return Tracker;
	}

	
	
	
	@FindBy(xpath= "//*[@id=\"insuranceCompanyParamSettlementPriorityNo_M0622MT\"]")	
	private WebElement SettlementNumber;
	public WebElement SettlementNumber() 
	{
		return SettlementNumber;
	}
	
	@FindBy(xpath= "//*[@id=\"insuranceCompanyParamMaint_save_M0622MT\"]/span[2]")	
	private WebElement Save;
	public WebElement Save() 
	{
		return Save;
	}

	@FindBy(xpath= "//*[@id=\"_popup_path_sol_confirm_ok\"]")	
	private WebElement ConfirmOk;
	public WebElement ConfirmOk() 
	{
		return ConfirmOk;
	}

	@FindBy(xpath= "//*[@id=\"_popup_path_sol_ok\"]")	
	private WebElement Ok;
	public WebElement Ok() 
	{
		return Ok;
	}
	
	@FindBy(xpath= "//*[@id=\"infoBarSearchButton_M0622MT\"]")	
	private WebElement Search;
	public WebElement Search() 
	{
		return Search;
	}

	@FindBy(xpath= "//*[@id=\"insuranceCompanyParamListGridTbl_Id_M0622MT_pager_left\"]/table/tbody/tr/td[7]")	
	private WebElement Clear;
	public WebElement Clear() 
	{
		return Clear;
	}

 

	@FindBy(xpath= "//*[@id=\"next_insuranceCompanyParamListGridTbl_Id_M0622MT_pager\"]/span")	
	private WebElement NextButton;
	public WebElement NextButton() 
	{
		return NextButton;
	}

	@FindBy(xpath= "//*[@id=\"last_insuranceCompanyParamListGridTbl_Id_M0622MT_pager\"]/span")	
	private WebElement LastButton;
	public WebElement LastButton() 
	{
		return LastButton;
	}

	@FindBy(xpath= "//*[@id=\"prev_insuranceCompanyParamListGridTbl_Id_M0622MT_pager\"]/span")	
	private WebElement PrevButton;
	public WebElement PrevButton() 
	{
		return PrevButton;
	}

 

	@FindBy(xpath= "//*[@id=\"first_insuranceCompanyParamListGridTbl_Id_M0622MT_pager\"]/span")	
	private WebElement FirstButton;
	public WebElement FirstButton() 
	{
		return FirstButton;
	}
	
	@FindBy(xpath= "//*[@id=\"search_insuranceCompanyParamListGridTbl_Id_M0622MT\"]/div/span")	
	private WebElement SortSearch;
	public WebElement SortSearch() 
	{
		return SortSearch;
	}

	@FindBy(xpath= "//*[@id=\"fbox_insuranceCompanyParamListGridTbl_Id_M0622MT\"]/table/tbody/tr[2]/th/input")	
	private WebElement Add;
	public WebElement Add() 
	{
		return Add;
	}

	@FindBy(xpath= "//*[@id=\"fbox_insuranceCompanyParamListGridTbl_Id_M0622MT\"]/table/tbody/tr[3]/td[2]/select")	
	private WebElement SortOptions;
	public WebElement SortOptions() 
	{
		return SortOptions;
	}
	
	@FindBy(xpath= "//*[@id=\"jqg1\"]")	
	private WebElement SortingInput;
	public WebElement SortingInput() 
	{
		return SortingInput;
	}

	@FindBy(xpath= "//*[@id=\"fbox_insuranceCompanyParamListGridTbl_Id_M0622MT_search\"]")	
	private WebElement FindButton;
	public WebElement FindButton() 
	{
		return FindButton;
	}

	@FindBy(xpath= "//*[@id=\"insuranceCompanyParamListGridTbl_Id_M0622MT_gs_trsinsurance_companiesVO.INSURANCE_CODE\"]")	
	private WebElement SearchCode;
	public WebElement SearchCode() 
	{
		return SearchCode;
	}
	
	@FindBy(xpath= "//*[@id=\"td_insuranceCompanyParamListGridTbl_Id_M0622MT_1_trsinsurance_companiesVO.INSURANCE_CODE\"]")	
	private WebElement GridCode;
	public WebElement GridCode() 
	{
		return GridCode;
	}

	@FindBy(xpath= "//*[@id=\"td_insuranceCompanyParamListGridTbl_Id_M0622MT_1_trsinsurance_companiesVO.BRIEF_DESC_ENG\"]")	
	private WebElement GridBrief;
	public WebElement GridBrief() 
	{
		return GridBrief;
	}

	@FindBy(xpath= "//*[@id=\"td_insuranceCompanyParamListGridTbl_Id_M0622MT_1_trsinsurance_companiesVO.LONG_DESC_ENG\"]")	
	private WebElement GridLong;
	public WebElement GridLong() 
	{
		return GridLong;
	}

	@FindBy(xpath= "//*[@id=\"insuranceCompanyParamListGridTbl_Id_M0622MT_gs_trsinsurance_companiesVO.INSURANCE_CODE\"]")	
	private WebElement SelectCode;
	public WebElement SelectCode() 
	{
		return SelectCode;
	}

	
	
	
	@FindBy(xpath= "//*[@id=\"insuranceCompanyParamMaintFormId_M0622MT_Delete_key\"]")	
	private WebElement Delete;
	public WebElement Delete() 
	{
		return Delete;
	}
	
	
	@FindBy(xpath= "//*[@id=\"div__popup_path_sol_ok\"]/div[1]")
	private WebElement ErrorPopup;
	public WebElement ErrorPopup() 
	{
		return ErrorPopup;
	}

	@FindBy(xpath= "//*[@id=\"mainTabs\"]/ul/li/table/tbody/tr/td[2]/span")	
	private WebElement CloseScreen;
	public WebElement CloseScreen() 
	{
		return CloseScreen;
	}

	@FindBy(xpath= "//*[@id=\"insuranceCompanyParamMaint_update_M0622MT\"]")	
	private WebElement Update;
	public WebElement Update() 
	{
		return Update;
	}
	@FindBy(xpath= "//*[@id=\"td_insuranceCompanyParamListGridTbl_Id_M0622MT_1_trsinsurance_companiesVO.INSURANCE_CODE\"]")	
	private WebElement insurancecode;
	public WebElement insurancecode() 
	{
		return insurancecode;
	}
	
	
}
 

