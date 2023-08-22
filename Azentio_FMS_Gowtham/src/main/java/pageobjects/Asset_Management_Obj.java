package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Asset_Management_Obj {

	WebDriver driver;

	public Asset_Management_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//@1077670
	
	@FindBy(xpath = "//td[text()='Parameters']")
	private WebElement Click_Parameters_underMenuIn_IISparam;
	public WebElement Click_Parameters_underMenuIn_IISparam_607() {
		return Click_Parameters_underMenuIn_IISparam;
	}
	
	@FindBy(xpath = "//td[text()='Product Class']")
	private WebElement Click_ProductClass_underParameters_IISparam;
	public WebElement Click_ProductClass_underParameters_IISparam_607() {
		return Click_ProductClass_underParameters_IISparam;
	}
	
	@FindBy(xpath = "//*[@id='M003MT']")
	private WebElement Click_mainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement Click_mainteanceUnder_ProductClass_underParameters_IISparam_607() {
		return Click_mainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	@FindBy(xpath = "//*[@id='infoBarSearchButton_M003MT']")
	private WebElement ClickSearch_InmainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement ClickSearch_InmainteanceUnder_ProductClass_underParameters_IISparam_607() {
		return ClickSearch_InmainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	@FindBy(xpath = "//*[@id='iISProductClassListGridTbl_Id_M003MT_gs_trsctrlclassVO.CLASS']")
	private WebElement SearchRecord_InmainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement SearchRecord_InmainteanceUnder_ProductClass_underParameters_IISparam_607() {
		return SearchRecord_InmainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	@FindBy(xpath = "//*[@id='td_iISProductClassListGridTbl_Id_M003MT_1_trsctrlclassVO.CLASS']")
	private WebElement SelectRecord_InmainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement SelectRecord_InmainteanceUnder_ProductClass_underParameters_IISparam_607() {
		return SelectRecord_InmainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	@FindBy(xpath = "//*[@id='iisProductClassLinkAssetManagementChargesBtn_M003MT']")
	private WebElement ClickLinkAssetManagementChargesBtn_InmainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement ClickLinkAssetManagementChargesBtn_InmainteanceUnder_ProductClass_underParameters_IISparam_607() {
		return ClickLinkAssetManagementChargesBtn_InmainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	@FindBy(xpath = "//*[@id='iISProductClassLinkAssetManagementChargesGrid_Id_M003MT_trsclasslinkasstmgmtchargeVO.CHARGE_CODE']")
	private WebElement CheckCodefield_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement CheckCodefield_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607() {
		return CheckCodefield_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	@FindBy(xpath = "//*[@id='iISProductClassLinkAssetManagementChargesGrid_Id_M003MT_chargeCodeDesc']")
	private WebElement CheckDescriptionField_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement CheckDescriptionField_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607() {
		return CheckDescriptionField_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	@FindBy(xpath = "//*[@id='iISProductClassLinkAssetManagementChargesGrid_Id_M003MT_trsclasslinkasstmgmtchargeVO.FLAT_AMOUNT']")
	private WebElement CheckFlatAmountField_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement CheckFlatAmountField_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607() {
		return CheckFlatAmountField_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	@FindBy(xpath = "//*[@id='iISProductClassLinkAssetManagementChargesGrid_Id_M003MT_trsclasslinkasstmgmtchargeVO.ALLOW_EDIT_CHARGE_AMOUNT_YN']")
	private WebElement CheckAllowEditField_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement CheckAllowEditField_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607() {
		return CheckAllowEditField_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	//1077671
	
	@FindBy(xpath = "//*[@id='add_iISProductClassLinkAssetManagementChargesGrid_Id_M003MT']")
	private WebElement ClickAddBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement ClickAddBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607() {
		return ClickAddBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	@FindBy(xpath = "//*[@id='td_iISProductClassLinkAssetManagementChargesGrid_Id_M003MT_1_rn']")
	private WebElement SelectLine_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement SelectLine_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam() {
		return SelectLine_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	@FindBy(xpath = "//*[@id='td_iISProductClassLinkAssetManagementChargesGrid_Id_M003MT_1_trsclasslinkasstmgmtchargeVO.CHARGE_CODE']//input")
	private WebElement SearchCode_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement SearchCode_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607() {
		return SearchCode_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	@FindBy(xpath = "//*[@id='td_iISProductClassLinkAssetManagementChargesGrid_Id_M003MT_1_trsclasslinkasstmgmtchargeVO.FLAT_AMOUNT']//input")
	private WebElement FlatAmmount_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement FlatAmmount_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607() {
		return FlatAmmount_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	@FindBy(xpath = "//*[@id='td_iISProductClassLinkAssetManagementChargesGrid_Id_M003MT_1_trsclasslinkasstmgmtchargeVO.ALLOW_EDIT_CHARGE_AMOUNT_YN']//select")
	private WebElement SelectAllowEdit_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement SelectAllowEdit_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607() {
		return SelectAllowEdit_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	
	@FindBy(xpath = "//div[text()='Cannot Proceed']")
	private WebElement Cannot_Proceed_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement Cannot_Proceed_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607() {
		return Cannot_Proceed_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	@FindBy(xpath = "//*[@id='del_iISProductClassLinkAssetManagementChargesGrid_Id_M003MT']")
	private WebElement deleteBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement deleteBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607() {
		return deleteBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	@FindBy(xpath = "//*[@id='linkAssetManagementCharges_save_btn_M003MT']")
	private WebElement OkBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement OkBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607() {
		return OkBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	@FindBy(xpath = "//*[@id='linkAssetManagementCharges_cancel_btn_M003MT']")
	private WebElement CancelBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	public WebElement CancelBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam_607() {
		return CancelBtn_InLinkAssetManagementCharges_InmainteanceUnder_ProductClass_underParameters_IISparam;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement IIS_success_popup_ok_btn;
	public WebElement IIS_SuccessPopupOkBtn_607(){
		return IIS_success_popup_ok_btn;
	}
	
	//@1080828
	
	@FindBy(xpath = "//td[text()='Asset Management']")
	private WebElement Asset_Management_under_MenuOptions;
	public WebElement Asset_Management_under_MenuOptions_607(){
		return Asset_Management_under_MenuOptions;
	}
	
	@FindBy(xpath = "//td[text()='Asset Repossession / Return']")
	private WebElement AssetRepossessionReturn_under_Asset_Management;
	public WebElement AssetRepossessionReturn_under_Asset_Management_607(){
		return AssetRepossessionReturn_under_Asset_Management;
	}
	
	@FindBy(xpath = "//*[@id='T065MT']")
	private WebElement Click_Mainteance_Under_AssetRepossessionReturn;
	public WebElement Click_Mainteance_Under_AssetRepossessionReturn_607(){
		return Click_Mainteance_Under_AssetRepossessionReturn;
	}
	
	@FindBy(xpath = "//*[@id='assetRepossessionReturn_repossessionType_T065MT']")
	private WebElement SelectRepossession_Type_InMainteance_Under_AssetRepossessionReturn;
	public WebElement SelectRepossession_Type_InMainteance_Under_AssetRepossessionReturn_607(){
		return SelectRepossession_Type_InMainteance_Under_AssetRepossessionReturn;
	}
	
	@FindBy(xpath = "//*[@id='T065Q']")
	private WebElement Click_Query_Under_AssetRepossessionReturn;
	public WebElement Click_Query_Under_AssetRepossessionReturn_607(){
		return Click_Query_Under_AssetRepossessionReturn;
	}
	
	@FindBy(xpath = "//*[@id='jqgh_assetManagementListGridTbl_Id_T065Q_trsAssetManagementVO.TRS_NO']")
	private WebElement TrancationNo_InQuery_Under_AssetRepossessionReturn;
	public WebElement TrancationNo_InQuery_Under_AssetRepossessionReturn_607(){
		return TrancationNo_InQuery_Under_AssetRepossessionReturn;
	}
	
	@FindBy(xpath = "//*[@id='T065VR']")
	private WebElement Click_Verify_Under_AssetRepossessionReturn;
	public WebElement Click_Verify_Under_AssetRepossessionReturn_607(){
		return Click_Verify_Under_AssetRepossessionReturn;
	}
	
	@FindBy(xpath = "//*[@id='jqgh_assetManagementListGridTbl_Id_T065VR_trsAssetManagementVO.TRS_NO']")
	private WebElement TrancationNo_InVerify_Under_AssetRepossessionReturn;
	public WebElement TrancationNo_InVerify_Under_AssetRepossessionReturn_607(){
		return TrancationNo_InVerify_Under_AssetRepossessionReturn;
	}
	
	@FindBy(xpath = "//*[@id='T065P']")
	private WebElement Click_Approve_Under_AssetRepossessionReturn;
	public WebElement Click_Approve_Under_AssetRepossessionReturn_607(){
		return Click_Approve_Under_AssetRepossessionReturn;
	}
	
	@FindBy(xpath = "//*[@id='jqgh_assetManagementListGridTbl_Id_T065P_trsAssetManagementVO.TRS_NO']")
	private WebElement TrancationNo_InApprove_Under_AssetRepossessionReturn;
	public WebElement TrancationNo_InApprove_Under_AssetRepossessionReturn_607(){
		return TrancationNo_InApprove_Under_AssetRepossessionReturn;
	}
	
	@FindBy(xpath = "//*[@id='T065RR']")
	private WebElement Click_Reverse_Under_AssetRepossessionReturn;
	public WebElement Click_Reverse_Under_AssetRepossessionReturn_607(){
		return Click_Reverse_Under_AssetRepossessionReturn;
	}
	
	@FindBy(xpath = "//*[@id='assetManagementListGridTbl_Id_T065RR_trsAssetManagementVO.TRS_NO']")
	private WebElement TrancationNo_Reverse_Under_AssetRepossessionReturn;
	public WebElement TrancationNo_Reverse_Under_AssetRepossessionReturn_607(){
		return TrancationNo_Reverse_Under_AssetRepossessionReturn;
	}
	
	
	//1080829
	
	
	@FindBy(xpath = "//td[text()='Asset Management Finalization']")
	private WebElement Click_AssetManagementFinalization_under_Asset_Management;
	public WebElement Click_AssetManagementFinalization_under_Asset_Management_607(){
		return Click_AssetManagementFinalization_under_Asset_Management;
	}
	
	@FindBy(xpath = "//*[@id='T066MT']")
	private WebElement Click_Mainteance_Under_AssetManagementFinalization;
	public WebElement Click_Mainteance_Under_AssetManagementFinalization_607(){
		return Click_Mainteance_Under_AssetManagementFinalization;
	}
	
	@FindBy(xpath = "//*[@id='repossession_type_T066MT']")
	private WebElement SelectRepossession_Type_InMainteance_Under_AssetManagementFinalization;
	public WebElement SelectRepossession_Type_InMainteance_Under_AssetManagementFinalization_607(){
		return SelectRepossession_Type_InMainteance_Under_AssetManagementFinalization;
	}
	
	@FindBy(xpath = "//*[@id='T066Q']")
	private WebElement Click_Query_Under_AssetManagementFinalization;
	public WebElement Click_Query_Under_AssetManagementFinalization_607(){
		return Click_Query_Under_AssetManagementFinalization;
	}
	
	@FindBy(xpath = "//*[@id='jqgh_settlementMgmtGridTbl_Id_T066Q_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement SettlementNo_InQuery_Under_AssetManagementFinalization;
	public WebElement SettlementNo_InQuery_Under_AssetManagementFinalization_607(){
		return SettlementNo_InQuery_Under_AssetManagementFinalization;
	}
	
	@FindBy(xpath = "//*[@id='T066VR']")
	private WebElement Click_Verify_Under_AssetManagementFinalization;
	public WebElement Click_Verify_Under_AssetManagementFinalization_607(){
		return Click_Verify_Under_AssetManagementFinalization;
	}
	
	@FindBy(xpath = "//*[@id='jqgh_settlementMgmtGridTbl_Id_T066VR_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement SettlementNo_InVerify_Under_AssetManagementFinalization;
	public WebElement SettlementNo_InVerify_Under_AssetManagementFinalization_607(){
		return SettlementNo_InVerify_Under_AssetManagementFinalization;
	}
	
	@FindBy(xpath = "//*[@id='T066P']")
	private WebElement Click_Approve_Under_AssetManagementFinalization;
	public WebElement Click_Approve_Under_AssetManagementFinalization_607(){
		return Click_Approve_Under_AssetManagementFinalization;
	}
	
	@FindBy(xpath = "//*[@id='jqgh_settlementMgmtGridTbl_Id_T066P_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement SettlementNo_InApprove_Under_AssetManagementFinalization;
	public WebElement SettlementNo_InApprove_Under_AssetManagementFinalization_607(){
		return SettlementNo_InApprove_Under_AssetManagementFinalization;
	}
	
	@FindBy(xpath = "//*[@id='T066RR']")
	private WebElement Click_Reverse_Under_AssetManagementFinalization;
	public WebElement Click_Reverse_Under_AssetManagementFinalization_607(){
		return Click_Reverse_Under_AssetRepossessionReturn;
	}
	
	@FindBy(xpath = "//*[@id='settlementMgmtGridTbl_Id_T066RR_trssetlmtvo.SETTLEMENT_NBR']")
	private WebElement SettlementNo_Reverse_Under_AssetManagementFinalization;
	public WebElement SettlementNo_Reverse_Under_AssetManagementFinalization_607(){
		return SettlementNo_Reverse_Under_AssetManagementFinalization;
	}
	
	
	
	
	
}
