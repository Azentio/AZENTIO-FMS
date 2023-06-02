package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CashcolletralamtdecreasedOBJ {
	WebDriver driver;
	public CashcolletralamtdecreasedOBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this );
	}
	//fmsparam 640874
//	@FindBy(xpath ="//td[text()='Control Record']")
//	private WebElement Param_Control_Record ;
//	public WebElement paramcontrolrecord() {
//		return Param_Control_Record;
//	}
//	@FindBy(xpath ="//input[@id='collateral_verification_required_yn_P007MT']")
//	private WebElement Param_Control_Record_Colletralverification_Required ;
//	public WebElement paramcontrolrecordcolletralverificationrequired() {
//		return Param_Control_Record_Colletralverification_Required;
//	}
	
	
	
	@FindBy(xpath ="//td[text()='Collateral Type']")
	private WebElement Param_Colletraltype ;
	public WebElement paramcolletraltype() {
		return Param_Colletraltype;
	}
	@FindBy(xpath ="//span[text()='Maintenance']")
	private WebElement Colletraltype_Maintenance ;
	public WebElement Paramcolletraltypemaintenance() {
		return Colletraltype_Maintenance;
	}
	@FindBy(xpath ="//input[@id='txt_code_P002MT']")
	private WebElement Colletraltype_Maintenance_searchcode ;
	public WebElement Paramcolletraltypemaintenancesearchcode() {
		return Colletraltype_Maintenance_searchcode;
	}
	@FindBy(xpath ="//input[@id='txt_brief_description_eng_P002MT']")
	private WebElement Brief_Discription ;
	public WebElement Parambriefdiscription() {
		return Brief_Discription;
	}
	@FindBy(xpath ="//input[@id='txt_long_description_eng_P002MT']")
	private WebElement Long_Discription ;
	public WebElement Paramlongdiscription() {
		return Long_Discription;
	}
	@FindBy(xpath ="//input[@id='txt_facility_coverage_P002MT']")
	private WebElement Facility_Coverage ;
	public WebElement Paramfacilitycoverage() {
		return Facility_Coverage;
	}
	@FindBy(xpath ="//input[@id='chk_box_allow_to_edit_P002MT']")
	private WebElement Allowetodit_Box ;
	public WebElement Paramallowtoedit() {
		return Allowetodit_Box;
	}
	@FindBy(xpath ="//select[@id='txt_asset_type_P002MT']")
	private WebElement Asset_Type ;
	public WebElement Paramassettype() {
		return Asset_Type;
	}
	@FindBy(xpath ="//label[@id='collateralTypeMaintFormId_P002MT_Save_key']")
	private WebElement Maintenance_Save_button ;
	public WebElement Parammaintenancesavebutton() {
		return Maintenance_Save_button;
	}
	@FindBy(xpath ="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Confirm_Save_Process ;
	public WebElement Paramconfirmsaveprocess() {
		return Confirm_Save_Process;
	}
//	@FindBy(xpath ="_popup_path_sol_ok")
//	private WebElement Record_Saved_Successfully ;
//	public WebElement Paramrecordsavedsuccessfully() {
//		return Record_Saved_Successfully;
//	}
	@FindBy(xpath ="//a[@id='P002P']")
	private WebElement Colletraltype_Approve ;
	public WebElement Paramcolletraltypeapprove() {
		return Colletraltype_Approve;
	}
//	@FindBy(xpath ="//*[@id=\"collateralTypeListGridTbl_Id_P002P_pager_left\"]/table/tbody/tr/td[7]")
//	private WebElement Approve_Clearbtn ;
//	public WebElement approveclearbtn() {
//		return Approve_Clearbtn;
//	}
	@FindBy(xpath ="//tr[@id='1']")
	private WebElement CodeRetrive_Data ;
	public WebElement Paramcoderetrivedatadoubletap() {
		return CodeRetrive_Data;
	}
	@FindBy(xpath ="//label[@id='collateralTypeMaintFormId_P002P_approve_key']")
	private WebElement Cashcolletral_Approve;
	public WebElement Paramcashcolletralapprove() {
		return Cashcolletral_Approve;
	}
	@FindBy(xpath ="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Confirm_Approve_Process;
	public WebElement Paramconfirmapproveprocess() {
		return Confirm_Approve_Process;
	}
	@FindBy(xpath ="//input[@id='_popup_path_sol_ok']")
	private WebElement RecordApproved_Success;
	public WebElement Paramrecordapprovesuccess() {
		return RecordApproved_Success;
	}
	//fmscore 640874
	@FindBy(xpath ="//td[text()='Collateral Management']")
	private WebElement Colletral_Management;
	public WebElement colletralmanagement() {
		return Colletral_Management;
	}
	@FindBy(xpath ="//a[@id='T014MT']")
	private WebElement Colletral_Management_Maintenance;
	public WebElement colletralmanagementmaintenance() {
		return Colletral_Management_Maintenance;
	}
	@FindBy(xpath ="//input[@id='lookuptxt_collateralManagementCollateralType_T014MT']")
	private WebElement Colletral_Management_Maintenance_Searchbox;
	public WebElement colletralmanagementmaintenancesearchbox() {
		return Colletral_Management_Maintenance_Searchbox;
	}
	@FindBy(xpath ="//input[@id='fmscollateralValidFrom_T014MT']")
	private WebElement Valid_From_Date;
	public WebElement validfromdate() {
		return Valid_From_Date;
	}
	@FindBy(xpath ="//input[@id='fmscollateralValidTo_T014MT']")
	private WebElement Valid_to_Date;
	public WebElement validtodate() {
		return Valid_to_Date;
	}
	@FindBy(xpath ="//input[@id='fmscollateralBriefNameEng_T014MT']")
	private WebElement Maininformation_Brief_Discription;
	public WebElement maininformationbriefdiscription() {
		return Maininformation_Brief_Discription;
	}
	@FindBy(xpath ="//input[@id='fmscollateralLongNameEng_T014MT']")
	private WebElement Maininformation_Long_Discription;
	public WebElement maininformationlongdiscription() {
		return Maininformation_Long_Discription;
	}
	@FindBy(xpath ="//input[@id='lookuptxt_fmscollateralCif_T014MT']")
	private WebElement Maininformation_Cifno;
	public WebElement maininformationcifno() {
		return Maininformation_Cifno;
	}
	@FindBy(xpath ="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Do_youwantto_Proceedpopup;
	public WebElement doyouwanttoproceedpopup() {
		return Do_youwantto_Proceedpopup;
	}
	@FindBy(xpath ="//input[@id='lookuptxt_fmscollateralCurrency_T014MT']")
	private WebElement Maininformation_Colletral_Currency;
	public WebElement maininformationcolletralcurrency() {
		return Maininformation_Colletral_Currency;
	}
	@FindBy(xpath ="//span[text()='Collateral Cash Details']")
	private WebElement Collateral_Cash_Details;
	public WebElement colletralcashdetailstab() {
		return Collateral_Cash_Details;
	}
	@FindBy(xpath ="//td[@id='add_CollateralManagementCashGuarantorGrid_T014MT']")
	private WebElement Collateral_Cash_Details_Addbtn;
	public WebElement colletralcashdetailstabaddbtn() {
		return Collateral_Cash_Details_Addbtn;
	}
	@FindBy(xpath ="//*[@id=\"new_1685603620319_accAdditionalRef_spanLookup_CollateralManagementCashGuarantorGrid_T014MT\"]/span")
	private WebElement Additional_Reference_Searchbox;
	public WebElement additionalreferenecesearchbox() {
		return Additional_Reference_Searchbox;
	}
	@FindBy(xpath ="(//tr[@id='1'])[2]")
	private WebElement Additional_Reference_Retrivedata_doubletap;
	public WebElement additionalReferenceretrivedatadoubletap() {
		return Additional_Reference_Retrivedata_doubletap;
	}
	@FindBy(xpath ="//input[@id='new_1685603620319_fmsCollateralDetVO.AMOUNT']")
	private WebElement Amount_Details;
	public WebElement additionalReferenceamountdetails() {
		return Amount_Details;
	}
	@FindBy(xpath ="//button[@id='collateralManagement_save_btn_T014MT']")
	private WebElement colletralmanagment_Save_Button;
	public WebElement colletralmanagmentsavebtn() {
		return colletralmanagment_Save_Button;
	}
	@FindBy(xpath ="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement Confirm_Saveprocessok;
	public WebElement colletralmanagmentconfirmsaveprocessok() {
		return Confirm_Saveprocessok;
	}
//	@FindBy(xpath ="//input[@id='_popup_path_sol_ok']")
//	private WebElement Save_successfully;
//	public WebElement savesuccessfully() {
//		return Save_successfully;
//	}
	@FindBy(xpath ="//a[@id='T014AP']")
	private WebElement Colletralmanagement_Approve;
	public WebElement colletralmanagementapprove() {
		return Colletralmanagement_Approve;
	}
	@FindBy(xpath ="//*[@id=\"collateralManagementGridTbl_Id_T014AP_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement Colletralmanagement_Approve_clrbtn;
	public WebElement colletralmanagementapproveclrbtn() {
		return Colletralmanagement_Approve_clrbtn;
	}
	@FindBy(xpath ="(//tr[@id='1'])[2]")
	private WebElement Colletralmanagement_Approve_retrivedata_doubletap;
	public WebElement colletralmanagementapproveretrivedatadoubletap() {
		return Colletralmanagement_Approve_retrivedata_doubletap;
	}
	@FindBy(xpath ="//*[@id=\"collateralManagement_approve_btn_T014AP\"]/span[2]")
	private WebElement Colletralmanagement_Approve_retrivedata_doubletap_finalapprove;
	public WebElement colletralmanagementapproveretrivedatadoubletapfinalapprove() {
		return Colletralmanagement_Approve_retrivedata_doubletap_finalapprove;
	}

}
