package pageobjects.CommonElements;

 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class AT_IISPRM_057_OBJ 
{
	WebDriver driver;

 

	public AT_IISPRM_057_OBJ(WebDriver driver) 
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

	@FindBy(xpath= "//*[@id=\"_selenuimM038\"]/li/a/table/tbody/tr/td[2]")	
	private WebElement Reasoncode;
	public WebElement Reasoncode() 
	{
		return Reasoncode;
	}

	@FindBy(xpath= "//*[@id=\"M038L\"]")	
	private WebElement List;
	public WebElement List() 
	{
		return List;
	}

	@FindBy(xpath= "//*[@id=\"M038UP\"]")	
	private WebElement UpdateAfterApprove;
	public WebElement UpdateAfterApprove() 
	{
		return UpdateAfterApprove;
	}

	@FindBy(xpath= "//*[@id=\"M038N\"]")	
	private WebElement Reject;
	public WebElement Reject() 
	{
		return Reject;
	}

	@FindBy(xpath= "//*[@id=\"M038P\"]")	
	private WebElement Approve;
	public WebElement Approve() 
	{
		return Approve;
	}
	@FindBy(xpath= "//*[@id=\"M038MT\"]")	
	private WebElement Maintenance;
	public WebElement Maintenance() 
	{
		return Maintenance;
	}

	@FindBy(xpath= "(//input[@class='path-theme-cust-input textCompSize ui-state-focus ui-corner-all'])[1]")	
	private WebElement Code;
	public WebElement Code() 
	{
		return Code;
	}

	@FindBy(xpath= "(//input[@class='path-theme-cust-input textCompSize ui-state-focus ui-corner-all'])[2]")	
	private WebElement BriefDescription;
	public WebElement BriefDescription() 
	{
		return BriefDescription;
	}

	@FindBy(xpath= "(//input[@class='path-theme-cust-input textCompSize ui-state-focus ui-corner-all'])[3]")	
	private WebElement LongDescription;
	public WebElement LongDescription() 
	{
		return LongDescription;
	}

	@FindBy(xpath= "//select[@class='selectCompSize ui-state-focus ui-corner-all']")	
	private WebElement Type;
	public WebElement Type() 
	{
		return Type;
	}
	
	@FindBy(xpath= "//*[@id=\"reasonCodeMaintFormId_M038MT_Save_key\"]")	
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

	@FindBy(xpath= "//*[@id='_popup_path_sol_ok']")	
	private WebElement Ok;
	public WebElement Ok() 
	{
		return Ok;
	}
	
	@FindBy(xpath= "//*[@id=\"infoBarSearchButton_M038MT\"]")	
	private WebElement Search;
	public WebElement Search() 
	{
		return Search;
	}

	@FindBy(xpath= "//*[@id=\"reasonCodeListGridTbl_Id_M038MT_pager_left\"]/table/tbody/tr/td[7]")	
	private WebElement Clear;
	public WebElement Clear() 
	{
		return Clear;
	}

 

	@FindBy(xpath= "//*[@id=\"next_reasonCodeListGridTbl_Id_M038MT_pager\"]/span")	
	private WebElement NextButton;
	public WebElement NextButton() 
	{
		return NextButton;
	}

	@FindBy(xpath= "//*[@id=\"last_reasonCodeListGridTbl_Id_M038MT_pager\"]/span")	
	private WebElement LastButton;
	public WebElement LastButton() 
	{
		return LastButton;
	}

	@FindBy(xpath= "//*[@id=\"prev_reasonCodeListGridTbl_Id_M038MT_pager\"]/span")	
	private WebElement PrevButton;
	public WebElement PrevButton() 
	{
		return PrevButton;
	}

 

	@FindBy(xpath= "//*[@id=\"first_reasonCodeListGridTbl_Id_M038MT_pager\"]/span")	
	private WebElement FirstButton;
	public WebElement FirstButton() 
	{
		return FirstButton;
	}
	
	@FindBy(xpath= "//*[@id=\"search_reasonCodeListGridTbl_Id_M038MT\"]/div/span")	
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

	@FindBy(xpath= "//*[@id=\"fbox_reasonCodeListGridTbl_Id_M038MT\"]/table/tbody/tr[3]/td[2]/select")	
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

	@FindBy(xpath= "//*[@id=\"fbox_reasonCodeListGridTbl_Id_M038MT_search\"]")	
	private WebElement FindButton;
	public WebElement FindButton() 
	{
		return FindButton;
	}

	@FindBy(xpath= "//*[@id='td_reasonCodeListGridTbl_Id_M038MT_1_trsreasonVO.REASON_CODE']")	
	private WebElement SearchCode;
	public WebElement SearchCode() 
	{
		return SearchCode;
	}
	
	@FindBy(xpath= "//*[@id=\"td_reasonCodeListGridTbl_Id_M038MT_1_trsreasonVO.REASON_CODE\"]")	
	private WebElement GridCode;
	public WebElement GridCode() 
	{
		return GridCode;
	}

	@FindBy(xpath= "//*[@id=\"td_reasonCodeListGridTbl_Id_M038MT_1_trsreasonVO.BRIEF_DESC_ENG\"]")	
	private WebElement GridBrief;
	public WebElement GridBrief() 
	{
		return GridBrief;
	}

	@FindBy(xpath= "//*[@id=\"td_reasonCodeListGridTbl_Id_M038MT_1_trsreasonVO.BRIEF_DESC_ARAB\"]")	
	private WebElement GridLong;
	public WebElement GridLong() 
	{
		return GridLong;
	}

	@FindBy(xpath= "//*[@id=\"td_leasedAssetListGridTbl_Id_M07MT_1_trsassetVO.CODE\"]")	
	private WebElement SelectCode;
	public WebElement SelectCode() 
	{
		return SelectCode;
	}

	
	
	
	@FindBy(xpath= "(//span[@class='ui-button-text'])[2]")	
	private WebElement Delete;
	public WebElement Delete() 
	{
		return Delete;
	}
	
	
	@FindBy(xpath= "//div[@class='jMsgbox-titleWrap']")
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