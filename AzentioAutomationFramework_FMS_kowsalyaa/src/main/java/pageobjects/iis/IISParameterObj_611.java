package pageobjects.iis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IISParameterObj_611 {
	WebDriver driver;
	public IISParameterObj_611(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//td[text()='Penalty']")
	private WebElement IIS_parameter_Penalty;
	public WebElement IIS_parameter_Penalty_611() {
		return IIS_parameter_Penalty;
	}
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement IISparam_penalty_maintenance;
	public WebElement IISparam_penalty_maintenance() {
		return IISparam_penalty_maintenance;
	}
	@FindBy(xpath = "//input[@id='penaltyCode_M068MT']")
	private WebElement IISparam_penalty_maintenance_Code;
	public WebElement IISparam_penalty_maintenance_Code_611() {
		return IISparam_penalty_maintenance_Code;
	}
	@FindBy(xpath = "//input[@id='penaltyBriefNameEng_M068MT']")
	private WebElement IISparam_penalty_maintenance_briefnameng;
	public WebElement IISparam_penalty_maintenance_briefnameng_611() {
		return IISparam_penalty_maintenance_briefnameng;
	}
	@FindBy(xpath = "//input[@id='penaltyLongNameEng_M068MT']")
	private WebElement IISparam_penalty_maintenance_Longdiscription;
	public WebElement IISparam_penalty_maintenance_Longdiscription_611() {
		return IISparam_penalty_maintenance_Longdiscription;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_penaltyChargesCode_M068MT']")
	private WebElement IISparam_penalty_maintenance_chargescode;
	public WebElement IISparam_penalty_maintenance_chargescode_611() {
		return IISparam_penalty_maintenance_chargescode;
	}
	@FindBy(xpath = "//label[@id='penaltyMaintFormId_M068MT_Save_key']")
	private WebElement IISparam_penalty_maintenance_savebtn;
	public WebElement IISparam_penalty_maintenance_savebtn_611() {
		return IISparam_penalty_maintenance_savebtn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement IISparam_penalty_maintenance_confirmsaveokbtn;
	public WebElement IISparam_penalty_maintenance_confirmsaveokbtn_611() {
		return IISparam_penalty_maintenance_confirmsaveokbtn;
	}
	@FindBy(xpath = "//div[text()='Saved Successfully']")
	private WebElement IISparam_penalty_maintenance_validationsavesuccessfully;
	public WebElement IISparam_penalty_maintenance_validationsavesuccessfully_611() {
		return IISparam_penalty_maintenance_validationsavesuccessfully;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement IISparam_penalty_maintenance_savedsuccessfullyokbtn;
	public WebElement IISparam_penalty_maintenance_savedsuccessfullyokbtn_611() {
		return IISparam_penalty_maintenance_savedsuccessfullyokbtn;
	}
	@FindBy(xpath = "//input[@id='penaltyListGridTbl_Id_M068MT_gs_trspenaltyVO.PENALTY_CODE']")
	private WebElement IISparam_penalty_maintenance_penaltycode;
	public WebElement IISparam_penalty_maintenance_penaltycode_611() {
		return IISparam_penalty_maintenance_penaltycode;
	}
	@FindBy(xpath = "//div[text()='Updated Successfully']")
	private WebElement IISparam_penalty_maintenance_updatedsucessfully;
	public WebElement IISparam_penalty_maintenance_validationupdatedsucessfully_611() {
		return IISparam_penalty_maintenance_updatedsucessfully;
	}
	@FindBy(xpath = "//td[@id='td_penaltyListGridTbl_Id_M068MT_1_trspenaltyVO.PENALTY_CODE']")
	private WebElement IISparam_penalty_maintenance_retrivedatadoubleclick;
	public WebElement IISparam_penalty_maintenance_retrivedatadoubleclick_611() {
		return IISparam_penalty_maintenance_retrivedatadoubleclick;
	}
	@FindBy(xpath = "//button[@id='penaltyMaint_del_M068MT']")
	private WebElement IISparam_penalty_maintenance_delbtn;
	public WebElement IISparam_penalty_maintenance_delbtn_611() {
		return IISparam_penalty_maintenance_delbtn;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement IISparam_penalty_maintenance_Confirmdelbtn;
	public WebElement IISparam_penalty_maintenance_Confirmdelbtn_611() {
		return IISparam_penalty_maintenance_Confirmdelbtn;
	}
	@FindBy(xpath = "//div[text()='Record Was Deleted Successfully']")
	private WebElement IISparam_penalty_maintenance_validationdelsucessfully;
	public WebElement IISparam_penalty_maintenance_validationdelsucessfully_611() {
		return IISparam_penalty_maintenance_validationdelsucessfully;
	}
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement IISparam_penalty_maintenance_delsuccessfullyokbtn;
	public WebElement IISparam_penalty_maintenance_delsuccessfullyokbtn_611() {
		return IISparam_penalty_maintenance_delsuccessfullyokbtn;
	}
	@FindBy(xpath = "//a[@id='infoBarSearchButton_M068MT']")
	private WebElement IISparam_penalty_maintenance_Searchbtn;
	public WebElement IISparam_penalty_maintenance_Searchbtn_611() {
		return IISparam_penalty_maintenance_Searchbtn;
	}
	@FindBy(xpath = "//td[text()='Clear']")
	private WebElement IISparam_penalty_maintenance_clrlookupbtn;
	public WebElement IISparam_penalty_maintenance_clrlookupbtn_611() {
		return IISparam_penalty_maintenance_clrlookupbtn;
	}
	@FindBy(xpath = "//td[@id='td_penaltyListGridTbl_Id_M068MT_1_trspenaltyVO.PENALTY_CODE']")
	private WebElement IISparam_penalty_maintenance_validationpenaltycode;
	public WebElement IISparam_penalty_maintenance_validationpenaltycode_611() {
		return IISparam_penalty_maintenance_validationpenaltycode;
	}
	@FindBy(xpath = "//td[@id='td_penaltyListGridTbl_Id_M068MT_1_trspenaltyVO.BRIEF_NAME_ENG']")
	private WebElement IISparam_penalty_maintenance_validationbriefname;
	public WebElement IISparam_penalty_maintenance_validationbriefname_611() {
		return IISparam_penalty_maintenance_validationbriefname;
	}
	@FindBy(xpath = "//td[@id='td_penaltyListGridTbl_Id_M068MT_1_trspenaltyVO.LONG_NAME_ENG']")
	private WebElement IISparam_penalty_maintenance_validationlongname;
	public WebElement IISparam_penalty_maintenance_validationlongname_611() {
		return IISparam_penalty_maintenance_validationlongname;
	}
	@FindBy(xpath = "//span[text()='List']")
	private WebElement IISparam_penalty_maintenance_Listmenu;
	public WebElement IISparam_penalty_maintenance_Listmenu() {
		return IISparam_penalty_maintenance_Listmenu;
	}
	@FindBy(xpath = "//span[text()='Update After Authorize']")
	private WebElement IISparam_penalty_maintenance_UpdateafterAuthorizeMenu;
	public WebElement IISparam_penalty_maintenance_UpdateafterAuthorizeMenu_611() {
		return IISparam_penalty_maintenance_UpdateafterAuthorizeMenu;
	}
	@FindBy(xpath = "//span[text()='Reject']")
	private WebElement IISparam_penalty_maintenance_RejectMenu;
	public WebElement IISparam_penalty_maintenance_RejectMenu_611() {
		return IISparam_penalty_maintenance_RejectMenu;
	}
	@FindBy(xpath = "//span[text()='Approve']")
	private WebElement IISparam_penalty_maintenance_ApproveMenu;
	public WebElement IISparam_penalty_maintenance_ApproveMenu_611() {
		return IISparam_penalty_maintenance_ApproveMenu;
	}
	@FindBy(xpath = "//td[@id='search_penaltyListGridTbl_Id_M068MT']")
	private WebElement IISparam_penalty_maintenance_Findrecords;
	public WebElement IISparam_penalty_maintenance_Findrecords_611() {
		return IISparam_penalty_maintenance_Findrecords;
	}
	@FindBy(xpath = "//td[@class='columns']")
	private WebElement IISparam_penalty_maintenance_Sortingtab;
	public WebElement IISparam_penalty_maintenance_Sortingtab_611() {
		return IISparam_penalty_maintenance_Sortingtab;//PENALTY_CODE, BRIEF_NAME_ENG, LONG_NAME_ENG
	}
	@FindBy(xpath = "//*[@id=\"searchhdfbox_penaltyListGridTbl_Id_M068MT\"]/a/span")
	private WebElement IISparam_penalty_maintenance_Sortingtab_closebtn;
	public WebElement IISparam_penalty_maintenance_Sortingtab_closebtn_611() {
		return IISparam_penalty_maintenance_Sortingtab_closebtn;
	}
	@FindBy(xpath = "//td[@id='next_penaltyListGridTbl_Id_M068MT_pager']")
	private WebElement IISparam_penalty_maintenance_gridnextbtn;
	public WebElement IISparam_penalty_maintenance_gridnextbtn_611() {
		return IISparam_penalty_maintenance_gridnextbtn;
	}
	@FindBy(xpath = "//td[@id='last_penaltyListGridTbl_Id_M068MT_pager']")
	private WebElement IISparam_penalty_maintenance_gridlastbtn;
	public WebElement IISparam_penalty_maintenance_gridlastbtn_611() {
		return IISparam_penalty_maintenance_gridlastbtn;
	}
	@FindBy(xpath = "//td[@id='first_penaltyListGridTbl_Id_M068MT_pager']")
	private WebElement IISparam_penalty_maintenance_gridfirstbtn;
	public WebElement IISparam_penalty_maintenance_gridfirstbtn_611() {
		return IISparam_penalty_maintenance_gridfirstbtn;
	}
	@FindBy(xpath = "//td[@id='prev_penaltyListGridTbl_Id_M068MT_pager']")
	private WebElement IISparam_penalty_maintenance_gridpreviousbtn;
	public WebElement IISparam_penalty_maintenance_gridpreviousbtn_611() {
		return IISparam_penalty_maintenance_gridpreviousbtn;
	}
	@FindBy(xpath = "//span[text()='Remove Tab']")
	private WebElement IISparam_penalty_maintenance_closetabbtn;
	public WebElement IISparam_penalty_maintenance_closetabbtn_611() {
		return IISparam_penalty_maintenance_closetabbtn;
	}






}
