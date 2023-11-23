package pageobjects.iisParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepaymentPlanObj {

	WebDriver driver;

	public RepaymentPlanObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[normalize-space()='Repayment Plan Template']")
	private WebElement iisRepayment_plan_Template;

	public WebElement iisRepaymentPlanTemplate() {
		return iisRepayment_plan_Template;
	}

	@FindBy(xpath = "//a[@id='addNewGridRec_M029MT']")
	private WebElement iisRepayment_plan_Add_Code_Template_btn;

	public WebElement iisRepaymentPlanAddCodeTemplatebtn() {
		return iisRepayment_plan_Add_Code_Template_btn;
	}

	@FindBy(xpath = "//input[@id='repaymentPlanTemplateMaintTemplateCode_M029MT']")
	private WebElement iisRepayment_plan_Template_Code;

	public WebElement iisRepaymentPlanTemplateCode() {
		return iisRepayment_plan_Template_Code;
	}

	@FindBy(xpath = "//input[@id='repaymentPlanTemplateMaintTemplateCode_M029MT']")
	private WebElement iis_Template_Code_New_feild;

	public WebElement iisTemplateCodeNewFeild() {
		return iis_Template_Code_New_feild;
	}

	@FindBy(xpath = "//input[@id='repaymentPlanTemplateListGridTbl_Id_M029MT_gs_trspayplantmpltVO.TEMPLATE_CODE']")
	private WebElement iis_Template_Code_feild;

	public WebElement iisTemplateCodeFeild() {
		return iis_Template_Code_feild;
	}

	@FindBy(xpath = "//input[@id='repaymentPlanTemplateShortDescEng_M029MT']")
	private WebElement iis_Template_Code_Short_Desc;

	public WebElement iisTemplateCodeShortDesc() {
		return iis_Template_Code_Short_Desc;
	}

	@FindBy(xpath = "//input[@id='repaymentPlanTemplateShortLongEng_M029MT']")
	private WebElement iis_Template_Code_long_Desc;

	public WebElement iisTemplateCodelongDesc() {
		return iis_Template_Code_long_Desc;
	}

	@FindBy(xpath = "//tbody//td[@id=\"td_repaymentPlanTemplateListGridTbl_Id_M029MT_1_trspayplantmpltVO.TEMPLATE_CODE\"]")
	////tr[@class='ui-widget-content jqgrow ui-row-ltr']/td
	private WebElement iis_Template_Code_Rec;

	public WebElement iisTemplateCodeRec() {
		return iis_Template_Code_Rec;
	}

	

	

	@FindBy(xpath = "//tr[@added= '1']")
	private WebElement iis_Template_New_Rec;

	public WebElement iisTemplateNewRec() {
		return iis_Template_New_Rec;
	}

	// *[@id=\"new_1695618976549_trspayplantmpltdetVO.INST_NBR_FROM\"]
	// *[@id="new_1695618976549_trspayplantmpltdetVO.INST_NBR_FROM"]
	// tr[@added='1']//input[@id='new_1695473746545_trspayplantmpltdetVO.INST_NBR_FROM']
	

	


	@FindBy(xpath = "//td[@aria-describedby='repaymentPlanTemplateGrid_Id_M029MT_trspayplantmpltdetVO.PAYM_PERIOD_NBR']")
	private WebElement iis_Template_Period_Nbr_FeildNew;

	public WebElement iisTemplatePeriodNbrFeildNew() {
		return iis_Template_Period_Nbr_FeildNew;
	}

	@FindBy(xpath = "//td[@id='td_repaymentPlanTemplateGrid_Id_M029MT_1_trspayplantmpltdetVO.PAYM_PERIODICITY']//select")
	private WebElement iis_Template_DropDown;

	public WebElement iisTemplateDropDown() {
		return iis_Template_DropDown;
	}

	

	@FindBy(xpath = "//*[@id=\"_popup_path_sol_confirm_ok\"]")
	private WebElement iis_Form_Popup_confirm_Save_Btn;

	public WebElement iisFormPopupconfirmSaveBtn() {
		return iis_Form_Popup_confirm_Save_Btn;
	}

	@FindBy(xpath = "//*[@id=\"_popup_path_sol_ok\"]")
	private WebElement iis_Form_Popup_Update_confirm_Save_Btn;

	public WebElement iisFormPopupUpdateconfirmSaveBtn() {
		return iis_Form_Popup_Update_confirm_Save_Btn;
	}

	// updation process

	@FindBy(xpath = "//div[@id='gview_repaymentPlanTemplateGrid_Id_M029MT']//div[@class='ui-jqgrid-bdiv']")
	private WebElement iis_Template_Details_Table;

	public WebElement iisTemplateDetailsTable() {
		return iis_Template_Details_Table;
	}

	@FindBy(xpath = "//td[@id='del_repaymentPlanTemplateGrid_Id_M029MT']")
	private WebElement iis_Template_Details_Delete_btn;

	public WebElement iisTemplateDetailsDeletebtn() {
		return iis_Template_Details_Delete_btn;
	}

	@FindBy(xpath = "//label[@id='lbl_Approve']")
	private WebElement iis_Template_Details_Approve_btn;

	public WebElement iisTemplateDetailsApprovebtn() {
		return iis_Template_Details_Approve_btn;
	}

	@FindBy(xpath = "//tr[@id='2']")
	private WebElement iis_Template_Second_Row;

	public WebElement iisTemplateSecondRow() {
		return iis_Template_Second_Row;
	}

	//____________________________________________________
	@FindBy(xpath = "//a[@id='addNewGridRec_M029MT']")
	private WebElement iis_Template_Code_New;

	public WebElement iisTemplateCodeNew() {
		return iis_Template_Code_New;
	}
	
	@FindBy(xpath = "//div//input[@id='repaymentPlanTemplateMaintTemplateCode_M029MT']")
	private WebElement iis_repayment_Plan_Template_Maint_Template_Code_M029MT;

	public WebElement iisrepaymentPlanTemplateMaintTemplateCode_M029MT() {
		return iis_repayment_Plan_Template_Maint_Template_Code_M029MT;
	}
	
	
	@FindBy(xpath = "//input[@id='repaymentPlanTemplateShortDescEng_M029MT']")
	private WebElement iis_repayment_Plan_Template_Short_Desc_Eng_M029MT;

	public WebElement iisrepaymentPlanTemplateShortDescEng_M029MT() {
		return iis_repayment_Plan_Template_Short_Desc_Eng_M029MT;
	}

	
	@FindBy(xpath = "//input[@id='repaymentPlanTemplateShortLongEng_M029MT']")
	private WebElement iis_repayment_Plan_Template_Short_Long_Eng_M029MT;

	public WebElement iisrepaymentPlanTemplateShortLongEng_M029MT() {
		return iis_repayment_Plan_Template_Short_Long_Eng_M029MT;
	}
	
	@FindBy(xpath = "//label[@id='repaymentPlanTemplateMaintFormId_M029MT_Save_key']")
	private WebElement iis_repayment_Plan_Template_Maint_Form_Id_M029MT_Save_key;

	public WebElement iisrepaymentPlanTemplateMaintFormIdM029MT_Save_key() {
		return iis_repayment_Plan_Template_Maint_Form_Id_M029MT_Save_key;
	}
	
	@FindBy(xpath = "//a[@title='Template Details']//span[contains(text(),'Template Details')]")
	private WebElement iis_Template_Detail_Tab;

	public WebElement iisTemplateDetailTab() {
		return iis_Template_Detail_Tab;
	}

	
	@FindBy(xpath = "//div[@class='ui-pg-div']//span[@class='ui-icon ui-icon-plus']")
	private WebElement iis_Template_Details_Add_Btn;

	public WebElement iisTemplateDeatilsAddBtn() {
		return iis_Template_Details_Add_Btn;
	}
	
	@FindBy(xpath = "//tr//td[@aria-describedby='repaymentPlanTemplateGrid_Id_M029MT_trspayplantmpltdetVO.INST_NBR_FROM'][@title=' ']") // td[@tdlabel='From']/div/input
	private WebElement iis_Template_Details_Form_Feild;

	public WebElement iisTemplateDetailsFormFeild() {
		return iis_Template_Details_Form_Feild;
	}
	
	@FindBy(xpath = "//tr//td[@aria-describedby='repaymentPlanTemplateGrid_Id_M029MT_trspayplantmpltdetVO.INST_NBR_FROM'][@title]") // td[@tdlabel='From']/div/input
	private WebElement iis_Template_Details_Form_Feild_Existing_Rec;

	public WebElement iisTemplateDetailsFormFeildExistingRec() {
		return iis_Template_Details_Form_Feild_Existing_Rec;
	}
	
	@FindBy(xpath = "//tr//td[@aria-describedby='repaymentPlanTemplateGrid_Id_M029MT_trspayplantmpltdetVO.INST_NBR_FROM'][@title=' ']//input") // td[@tdlabel='From']/div/input
	private WebElement iis_Template_Details_Form_Feild_Entry;

	public WebElement iisTemplateDetailsFormFeildEntry() {
		return iis_Template_Details_Form_Feild_Entry;
	}
	
	@FindBy(xpath = "//tr//td[@aria-describedby='repaymentPlanTemplateGrid_Id_M029MT_trspayplantmpltdetVO.INST_NBR_TO'][@title]//input")
	private WebElement iis_Template_To_Feild_Entry;

	public WebElement iisTemplateToFeildEntry() {
		return iis_Template_To_Feild_Entry;
	}
	

	@FindBy(xpath = "//td[@id='td_repaymentPlanTemplateGrid_Id_M029MT_1_trspayplantmpltdetVO.PAYM_PERIOD_NBR']//div//input")
	private WebElement iis_Template_Period_Nbr_Feild_Entry;

	public WebElement iisTemplatePeriodNbrFeildEntry() {
		return iis_Template_Period_Nbr_Feild_Entry;
	}
	
	
	@FindBy(xpath = "//input[@id='repaymentPlanTemplateListGridTbl_Id_M029MT_gs_trspayplantmpltVO.TEMPLATE_CODE']")
	private WebElement iis_Srch_Template_Code;

	public WebElement iisSrchTemplateCode() {
		return iis_Srch_Template_Code;
	}
	
	//------------------------------
	@FindBy(xpath = "//tr//td[@aria-describedby='repaymentPlanTemplateGrid_Id_M029MT_trspayplantmpltdetVO.INST_NBR_FROM'][@title]") // td[@tdlabel='From']/div/input
	private WebElement iis_Template_Details_Form_Feild_Update;

	public WebElement iisTemplateDetailsFormFeildUpdate() {
		return iis_Template_Details_Form_Feild_Update;
	}
	
	@FindBy(xpath = "//tr//td[@aria-describedby='repaymentPlanTemplateGrid_Id_M029MT_trspayplantmpltdetVO.INST_NBR_FROM'][@title]") // td[@tdlabel='From']/div/input
	private WebElement iis_Template_Details_Form_Feild_Existing_Rec_Update;

	public WebElement iisTemplateDetailsFormFeildExistingRecUpdate() {
		return iis_Template_Details_Form_Feild_Existing_Rec_Update;
	}
	
	@FindBy(xpath = "//tr//td[@aria-describedby='repaymentPlanTemplateGrid_Id_M029MT_trspayplantmpltdetVO.INST_NBR_FROM'][@title]//input") // td[@tdlabel='From']/div/input
	private WebElement iis_Template_Details_Form_Feild_Entry_Update;

	public WebElement iisTemplateDetailsFormFeildEntryUpdate() {
		return iis_Template_Details_Form_Feild_Entry_Update;
	}
	
	@FindBy(xpath = "//tr//td[@aria-describedby='repaymentPlanTemplateGrid_Id_M029MT_trspayplantmpltdetVO.INST_NBR_TO'][@title]//input")
	private WebElement iis_Template_To_Feild_Entry_Update;

	public WebElement iisTemplateToFeildEntryUpdate() {
		return iis_Template_To_Feild_Entry_Update;
	}
	

	@FindBy(xpath = "//td[@id='td_repaymentPlanTemplateGrid_Id_M029MT_1_trspayplantmpltdetVO.PAYM_PERIOD_NBR']//div//input")
	private WebElement iis_Template_Period_Nbr_Feild_Entry_Update;

	public WebElement iisTemplatePeriodNbrFeildEntryUpdate() {
		return iis_Template_Period_Nbr_Feild_Entry_Update;
	}
	
	//----------------------------
	
	@FindBy(xpath = "//button[@id='repaymentPlanTemplateMaint_del_M029MT']//span[@class='ui-button-text']")
	private WebElement iis_repayment_Plan_Template_Maint_del_M029MT;

	public WebElement iisrepaymentPlanTemplateMaint_del_M029MT() {
		return iis_repayment_Plan_Template_Maint_del_M029MT;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement iis_Form_Popup_confirm_delete_Btn;

	public WebElement iisFormPopupconfirmdeleteBtn() {
		return iis_Form_Popup_confirm_delete_Btn;
	}

	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement iis_Form_Popup_Update_Delete_Btn;

	public WebElement iisFormPopupUpdateDeleteBtn() {
		return iis_Form_Popup_Update_Delete_Btn;
	}
	
	@FindBy(xpath = "//tr[@id= '1'][@class='ui-widget-content jqgrow ui-row-ltr']/td")
	private WebElement iis_Template_Code_Grid_List;

	public WebElement iisTemplateCodeGridList() {
		return iis_Template_Code_Grid_List;
	}
	
	
	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']")
	private WebElement iis_Template_Error_Pop_up;

	public WebElement iisTemplateErrorPopup() {
		return iis_Template_Error_Pop_up;
	}
	
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement iis_Template_Error_Pop_Up_Ok_btn;

	public WebElement iisTemplateErrorPopUpOkBtn() {
		return iis_Template_Error_Pop_Up_Ok_btn;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Update After Authorize']")
	private WebElement iis_Repayment_Update_and_Authorize;

	public WebElement iisTemplateUpdateandAuthorize() {
		return iis_Repayment_Update_and_Authorize;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Reject']")
	private WebElement iis_Repayment_Reject;

	public WebElement iisRepaymentReject() {
		return iis_Repayment_Reject;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Approve']")
	private WebElement iis_Repayment_Approve;

	public WebElement iisRepaymentApprove() {
		return iis_Repayment_Approve;
	}
	
	
	@FindBy(xpath = "//span[normalize-space()='List']")
	private WebElement iis_Repayment_List;

	public WebElement iisRepaymentList() {
		return iis_Repayment_List;
	}
	
	//-----------------sorting-----------------//
	
	@FindBy(xpath = "//div[@class='ui-pg-div']//span[@class='ui-icon ui-icon-search']")
	private WebElement iis_Repayment_Sort_Search_Icon;

	public WebElement iisRepaymentSortSearchIcon() {
		return iis_Repayment_Sort_Search_Icon;
	}
	
	@FindBy(xpath = "//td[@class='columns']//select")
	private WebElement iis_Repayment_Sort_First_DropDown;

	public WebElement iisRepaymentSortFirstDropDown() {
		return iis_Repayment_Sort_First_DropDown;
	}
	
	@FindBy(xpath = "//select[@class='selectopts']")
	private WebElement iis_Repayment_Sort_Second_DropDown;

	public WebElement iisRepaymentSortSecondDropDown() {
		return iis_Repayment_Sort_Second_DropDown;
	}
	
	@FindBy(xpath = "//input[@id='jqg2']")
	private WebElement iis_Repayment_Sort_Third_Input_Feild;

	public WebElement iisRepaymentSortThirdInputFeild() {
		return iis_Repayment_Sort_Third_Input_Feild;
	}
	
	@FindBy(xpath = "//a[@id='fbox_repaymentPlanTemplateListGridTbl_Id_M029MT_search']")
	private WebElement iis_Repayment_Sort_Find_Icon_Btn;

	public WebElement iisRepaymentSortFindIconBtn() {
		return iis_Repayment_Sort_Find_Icon_Btn;
	}
	
	//----------------------button check----------------------------//
	
	@FindBy(xpath = "//td[normalize-space()='Clear']")
	private WebElement iis_Repayment_Clear_Btn;

	public WebElement iisRepaymentClearBtn() {
		return iis_Repayment_Clear_Btn;
	}
	
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-seek-next']")
	private WebElement iis_Repayment_Next_Btn;

	public WebElement iisRepaymentNextBtn() {
		return iis_Repayment_Next_Btn;
	}
	
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-seek-end']")
	private WebElement iis_Repayment_Last_Btn;

	public WebElement iisRepaymentLastBtn() {
		return iis_Repayment_Last_Btn;
	}
	
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-seek-prev']")
	private WebElement iis_Repayment_Previous_Btn;

	public WebElement iisRepaymentPreviousBtn() {
		return iis_Repayment_Previous_Btn;
	}
	
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-seek-first']")
	private WebElement iis_Repayment_First_Btn;

	public WebElement iisRepaymentFirstBtn() {
		return iis_Repayment_First_Btn;
	}
	
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-close ui-icon-close-tabs-custom']")
	private WebElement iis_Screen_Close_Btn;

	public WebElement iisScreenCloseBtn() {
		return iis_Screen_Close_Btn;
	}
	
	//input[@id='_popup_path_sol_confirm_ok']
	
	//span[@class='ui-icon ui-icon-close ui-icon-close-tabs-custom']
	
}
