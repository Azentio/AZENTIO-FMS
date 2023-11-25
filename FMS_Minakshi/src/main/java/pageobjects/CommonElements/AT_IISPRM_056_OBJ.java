package pageobjects.CommonElements;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class AT_IISPRM_056_OBJ 
{
	WebDriver driver;

 

	public AT_IISPRM_056_OBJ(WebDriver driver) 
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

	@FindBy(xpath= "//*[@id=\"_selenuimM0621\"]/li/a/table")	
	private WebElement InsuranceType ;
	public WebElement InsuranceType() 
	{
		return InsuranceType;
	}

	@FindBy(xpath= "")	
	private WebElement List;
	public WebElement List() 
	{
		return List;
	}

	@FindBy(xpath= "//*[@id=\"M0621UP\"]")	
	private WebElement UpdateAfterApprove;
	public WebElement UpdateAfterApprove() 
	{
		return UpdateAfterApprove;
	}

	@FindBy(xpath= "//*[@id=\"M0621N\"]")	
	private WebElement Reject;
	public WebElement Reject() 
	{
		return Reject;
	}

	@FindBy(xpath= "//*[@id=\"M0621P\"]")	
	private WebElement Approve;
	public WebElement Approve() 
	{
		return Approve;
	}
	@FindBy(xpath= "//span[text()='Maintenance']/parent::a[@id='M0621MT']")	
	private WebElement Maintenance;
	public WebElement Maintenance() 
	{
		return Maintenance;
	}

	@FindBy(xpath= "//*[@id=\"insuranceTypeParamCode_M0621MT\"]")	
	private WebElement Code;
	public WebElement Code() 
	{
		return Code;
	}

	@FindBy(xpath= "//*[@id=\"insuranceTypeParamBriefNameEnglish_M0621MT\"]")	
	private WebElement BriefDescription;
	public WebElement BriefDescription() 
	{
		return BriefDescription;
	}

	@FindBy(xpath= "//*[@id=\"insuranceTypeParamLongNameEnglish_M0621MT\"]")	
	private WebElement LongDescription;
	public WebElement LongDescription() 
	{
		return LongDescription;
	}

	
	
	@FindBy(xpath= "(//label[@class='path_btn_lbl_theme'])[1]")	
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
	
	@FindBy(xpath= "//*[@id=\"infoBarSearchButton_M0621MT\"]")	
	private WebElement Search;
	public WebElement Search() 
	{
		return Search;
	}
	
	@FindBy(xpath= "//*[@id=\"insuranceTypeParamListGridTbl_Id_M0621MT_pager_left\"]/table/tbody/tr/td[7]")	
	private WebElement Clear;
	public WebElement Clear() 
	{
		return Clear;
	}

 
	
	@FindBy(xpath= "//*[@id=\"next_insuranceTypeParamListGridTbl_Id_M0621MT_pager\"]/span")	
	private WebElement NextButton;
	public WebElement NextButton() 
	{
		return NextButton;
	}

	@FindBy(xpath= "//*[@id=\"last_insuranceTypeParamListGridTbl_Id_M0621MT_pager\"]/span")	
	private WebElement LastButton;
	public WebElement LastButton() 
	{
		return LastButton;
	}

	@FindBy(xpath= "//*[@id=\"prev_insuranceTypeParamListGridTbl_Id_M0621MT_pager\"]/span")	
	private WebElement PrevButton;
	public WebElement PrevButton() 
	{
		return PrevButton;
	}

 

	@FindBy(xpath= "//*[@id=\"first_insuranceTypeParamListGridTbl_Id_M0621MT_pager\"]/span")	
	private WebElement FirstButton;
	public WebElement FirstButton() 
	{
		return FirstButton;
	}
	
	@FindBy(xpath= "(//span[@class='ui-icon ui-icon-search'])[2]")	
	private WebElement SortSearch;
	public WebElement SortSearch() 
	{
		return SortSearch;
	}

	@FindBy(xpath= "//input[@class='add-rule ui-add']")	
	private WebElement Add;
	public WebElement Add() 
	{
		return Add;
	}

	@FindBy(xpath= "//*[@id=\"fbox_insuranceTypeParamListGridTbl_Id_M0621MT\"]/table/tbody/tr[3]/td[2]/select")	
	private WebElement SortOptions;
	public WebElement SortOptions() 
	{
		return SortOptions;
	}
	
	@FindBy(xpath= "//input[@class='input-elm']")	
	private WebElement SortingInput;
	public WebElement SortingInput() 
	{
		return SortingInput;
	}

	@FindBy(xpath= "//*[@id=\"fbox_insuranceTypeParamListGridTbl_Id_M0621MT_search\"]")	
	private WebElement FindButton;
	public WebElement FindButton() 
	{
		return FindButton;
	}

	@FindBy(xpath= "//*[@id=\"insuranceTypeParamListGridTbl_Id_M0621MT_gs_trsinsurance_typesVO.COMP_CODE\"]")	
	private WebElement COMP_CODE;
	public WebElement COMPCODE() 
	{
		return COMP_CODE;
	}
	
	@FindBy(xpath= "//*[@id=\"insuranceTypeParamListGridTbl_Id_M0621MT_gs_trsinsurance_typesVO.INSURANCE_TYPE\"]")	
	private WebElement InsuranceTypeCode;
	public WebElement InsuranceTypeCode() 
	{
		return InsuranceTypeCode;
	}

	@FindBy(xpath= "//*[@id=\"insuranceTypeParamListGridTbl_Id_M0621MT_gs_trsinsurance_typesVO.BRIEF_DESC_ENG\"]")	
	private WebElement GridBrief;
	public WebElement GridBrief() 
	{
		return GridBrief;
	}

	@FindBy(xpath= "//*[@id=\"insuranceTypeParamListGridTbl_Id_M0621MT_gs_trsinsurance_typesVO.LONG_DESC_ENG\"]")	
	private WebElement GridLong;
	public WebElement GridLong() 
	{
		return GridLong;
	}

	@FindBy(xpath= "//*[@id=\"td_insuranceTypeParamListGridTbl_Id_M0621MT_1_trsinsurance_typesVO.INSURANCE_TYPE\"]")	
	private WebElement SelectCode;
	public WebElement SelectCode() 
	{
		return SelectCode;
	}

	
	
	
	@FindBy(xpath= "//*[@id=\"insuranceTypeParamMaintFormId_M0621MT_Delete_key\"]")	
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

}
 

