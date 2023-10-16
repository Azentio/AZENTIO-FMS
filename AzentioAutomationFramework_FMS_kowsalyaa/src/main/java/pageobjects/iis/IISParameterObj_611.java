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
	public WebElement IISparam_penalty_maintenance_gridpenaltycode_611() {
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
	@FindBy(xpath = "//span[@id='spanLookup_penaltyChargesCode_M068MT']")
	private WebElement IISparam_penalty_chargescodesearchbox;
	public WebElement IISparam_penalty_chargescodesearchbox_611() {
		return IISparam_penalty_chargescodesearchbox;
	}
	@FindBy(xpath = "//tr[@id='1']")
	private WebElement IISparam_penalty_chargescodes_doubletap;
	public WebElement IISparam_penalty_chargescodes_doubletap_611() {
		return IISparam_penalty_chargescodes_doubletap;
	}
	
	//@721485
	
	@FindBy(xpath = "//td[text()='Product Class']")
	private WebElement IISparam_Productclass;
	public WebElement IISparam_Productclass_611() {
		return IISparam_Productclass;
	}
	@FindBy(xpath = "//a[@id='M003MT']")
	private WebElement IISparam_Productclass_Maintenance;
	public WebElement IISparam_Productclass_Maintenance_611() {
		return IISparam_Productclass_Maintenance;
	}
	@FindBy(xpath = "//input[@id='lookuptxt_iisProductClassCategory_M003MT']")
	private WebElement IISparam_PC_Maintenance_Category;
	public WebElement IISparam_PC_Maintenance_Category_611() {
		return IISparam_PC_Maintenance_Category;
	}
	@FindBy(xpath = "//input[@id='iisProductClassBriefDescription_M003MT']")
	private WebElement IISparam_PC_Maintenance_briefdiscription;
	public WebElement IISparam_PC_Maintenance_briefdiscription_611() {
		return IISparam_PC_Maintenance_briefdiscription;
	}
	@FindBy(xpath = "//input[@id='iisProductClassLongDescription_M003MT']")
	private WebElement IISparam_PC_Maintenance_longdiscription;
	public WebElement IISparam_PC_Maintenance_longdiscription_611() {
		return IISparam_PC_Maintenance_longdiscription;
	}
	@FindBy(xpath = "//li[@id='iisProductClassGeneralInformationProfitCalculation_M003MT']")
	private WebElement IISparam_PC_Maintenance_profitcalculation;
	public WebElement IISparam_PC_Maintenance_profitcalculation_611() {
		return IISparam_PC_Maintenance_profitcalculation;
	}
	@FindBy(xpath = "//input[@id='iisProductClassExposureLimit_M003MT']")
	private WebElement IISparam_PC_Profitcal_Exposurelimit;
	public WebElement IISparam_PC_Profitcal_Exposurelimit_611() {
		return IISparam_PC_Profitcal_Exposurelimit;
	}
	@FindBy(xpath = "//li[@id='iisProductClassGeneralInformationDescription_M003MT']")
	private WebElement IISparam_PC_Maintenance_Discription;
	public WebElement IISparam_PC_Maintenance_Discription_611() {
		return IISparam_PC_Maintenance_Discription;
	}
	@FindBy(xpath = "//label[@id='iisProductClassMaintFormId_M003MT_Save_key']")
	private WebElement IISparam_PC_Maintenance_Savebtn;
	public WebElement IISparam_PC_Maintenance_Savebtn_611() {
		return IISparam_PC_Maintenance_Savebtn;
	}
	@FindBy(xpath = "//input[@id='iISProductClassListGridTbl_Id_M003MT_gs_trsctrlclassVO.CLASS']")
	private WebElement IISparam_PC_Maintenance_Classcode;
	public WebElement IISparam_PC_Maintenance_Classcode_611() {
		return IISparam_PC_Maintenance_Classcode;
	}
	@FindBy(xpath = "//td[@id='td_iISProductClassListGridTbl_Id_M003MT_1_trsctrlclassVO.CLASS']")
	private WebElement IISparam_PC_Maintenance_Retrivedatadoubleclick;
	public WebElement IISparam_PC_Maintenance_Retrivedatadoubleclick_611() {
		return IISparam_PC_Maintenance_Retrivedatadoubleclick;
	}
	@FindBy(xpath = "//button[@id='iISProductClassMaint_del_M003MT']")
	private WebElement IISparam_PC_Maintenance_delbtn;
	public WebElement IISparam_PC_Maintenance_delbtn_611() {
		return IISparam_PC_Maintenance_delbtn;
	}
	@FindBy(xpath = "//a[@id='infoBarSearchButton_M003MT']")
	private WebElement IISparam_PC_Maintenance_gridsearchbtn;
	public WebElement IISparam_PC_Maintenance_gridsearchbtn_611() {
		return IISparam_PC_Maintenance_gridsearchbtn;
	}
	@FindBy(xpath = "//td[@id='td_iISProductClassListGridTbl_Id_M003MT_1_trsclassVO.BRIEF_NAME_ENG']")
	private WebElement IISparam_PC_Maintenance_gridbriefnamedata;
	public WebElement IISparam_PC_Maintenance_gridbriefnamedata_611() {
		return IISparam_PC_Maintenance_gridbriefnamedata;
	}
	@FindBy(xpath = "//td[@id='td_iISProductClassListGridTbl_Id_M003MT_1_trsclassVO.CATEGORY']")
	private WebElement IISparam_PC_Maintenance_gridcategorydata;
	public WebElement IISparam_PC_Maintenance_gridcategorydata_611() {
		return IISparam_PC_Maintenance_gridcategorydata;
	}
	@FindBy(xpath = "//td[@id='td_iISProductClassListGridTbl_Id_M003MT_1_trscategoryVO.DESC_ENG']")
	private WebElement IISparam_PC_Maintenance_gridcategorydiscription;
	public WebElement IISparam_PC_Maintenance_gridcategorydiscription_611() {
		return IISparam_PC_Maintenance_gridcategorydiscription;
	}
	@FindBy(xpath = "//a[@id='M003P']")
	private WebElement IISparam_PC_Maintenance_Approvemenu;
	public WebElement IISparam_PC_Maintenance_Approvemenu_611() {
		return IISparam_PC_Maintenance_Approvemenu;
	}
	@FindBy(xpath = "//a[@id='M003L']")
	private WebElement IISparam_PC_Maintenance_Listmenu;
	public WebElement IISparam_PC_Maintenance_Listmenu_611() {
		return IISparam_PC_Maintenance_Listmenu;
	}
	@FindBy(xpath = "//a[@id='M003D']")
	private WebElement IISparam_PC_Maintenance_Duplicatemenu;
	public WebElement IISparam_PC_Maintenance_Duplicatemenu_611() {
		return IISparam_PC_Maintenance_Duplicatemenu;
	}
	@FindBy(xpath = "//td[@id='search_iISProductClassListGridTbl_Id_M003MT']")
	private WebElement IISparam_PC_Maintenance_sortingsearchbtn;
	public WebElement IISparam_PC_Maintenance_sortingsearchbtn_611() {
		return IISparam_PC_Maintenance_sortingsearchbtn;
	}
	@FindBy(xpath = "//*[@id=\"fbox_iISProductClassListGridTbl_Id_M003MT\"]/table/tbody/tr[3]/td[2]")
	private WebElement IISparam_PC_Maintenance_sortingtab;
	public WebElement IISparam_PC_Maintenance_sortingtab_611() {
		return IISparam_PC_Maintenance_sortingtab; //Class //Brief Name //Category //Category Description
	}
	@FindBy(xpath = "//*[@id=\"searchhdfbox_iISProductClassListGridTbl_Id_M003MT\"]/a")
	private WebElement IISparam_PC_Maintenance_sortingclosebtn;
	public WebElement IISparam_PC_Maintenance_sortingclosebtn_611() {
		return IISparam_PC_Maintenance_sortingclosebtn; 
	}
	@FindBy(xpath = "//td[@id='first_iISProductClassListGridTbl_Id_M003MT_pager']")
	private WebElement IISparam_PC_Maintenance_Firstbtn;
	public WebElement IISparam_PC_Maintenance_Firstbtn_611() {
		return IISparam_PC_Maintenance_Firstbtn; 
	}
	@FindBy(xpath = "//td[@id='prev_iISProductClassListGridTbl_Id_M003MT_pager']")
	private WebElement IISparam_PC_Maintenance_previousbtn;
	public WebElement IISparam_PC_Maintenance_previousbtn_611() {
		return IISparam_PC_Maintenance_previousbtn; 
	}
	@FindBy(xpath = "//td[@id='next_iISProductClassListGridTbl_Id_M003MT_pager']")
	private WebElement IISparam_PC_Maintenance_nextbtn;
	public WebElement IISparam_PC_Maintenance_nextbtn() {
		return IISparam_PC_Maintenance_nextbtn; 
	}
	@FindBy(xpath = "//td[@id='last_iISProductClassListGridTbl_Id_M003MT_pager']")
	private WebElement IISparam_PC_Maintenance_lastbtn;
	public WebElement IISparam_PC_Maintenance_lastbtn_611() {
		return IISparam_PC_Maintenance_lastbtn; 
	}
	@FindBy(xpath = "//*[@id=\"mainTabs\"]/ul/li/table/tbody/tr/td[2]/span")
	private WebElement IISparam_PC_Maintenance_tabclosebtn;
	public WebElement IISparam_PC_Maintenance_tabclosebtn_611() {
		return IISparam_PC_Maintenance_tabclosebtn; 
	}




	
}
