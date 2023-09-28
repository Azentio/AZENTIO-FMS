package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IIS_Parameter_Obj {

	WebDriver driver;
	public IIS_Parameter_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//555528
	@FindBy (xpath = "//td[text()='Promotion Type']")
	private WebElement Promotion_Type_Under_Parameters_In_IISparam;
	public WebElement Promotion_Type_Under_Parameters_In_IISparam_607() {
		return Promotion_Type_Under_Parameters_In_IISparam;
	}
	
	@FindBy (xpath = "//*[@id='M082MT']")
	private WebElement ClickMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	public WebElement ClickMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607() {
		return ClickMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	}
	
	@FindBy (xpath = "//*[@id='promotionTypeCode_M082MT']")
	private WebElement CodeFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	public WebElement CodeFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607() {
		return CodeFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	}
	
	@FindBy (xpath = "//*[@id='promotionTypeBriefNameEnglish_M082MT']")
	private WebElement BriefDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	public WebElement BriefDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607() {
		return BriefDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	}
	
	@FindBy (xpath = "//*[@id='promotionTypeLongNameEnglish_M082MT']")
	private WebElement LongDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	public WebElement LongDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607() {
		return LongDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	}
	 
	@FindBy (xpath = "//*[@id='lbl_promotionTypeBriefDescArab_M082MT']")
	private WebElement BriefDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	public WebElement BriefDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607() {
		return BriefDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	}
	
	@FindBy (xpath = "//*[@id='lbl_promotionTypeLongDescArab_M082MT']")
	private WebElement LongDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	public WebElement LongDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607() {
		return LongDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	}
	
	@FindBy (xpath = "//span[text()='Additional Information']")
	private WebElement ClickAdditional_Information_In_Mainteance_UnderProductClass;
	public WebElement ClickAdditional_Information_In_Mainteance_UnderProductClass_607() {
		return ClickAdditional_Information_In_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//span[text()='Limit']")
	private WebElement ClicklimitInAdditional_Information_In_Mainteance_UnderProductClass;
	public WebElement ClicklimitInAdditional_Information_In_Mainteance_UnderProductClass_607() {
		return ClicklimitInAdditional_Information_In_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//*[@id='iisProductClassPromotionType_M003MT']")
	private WebElement 	Promotion_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass;
	public WebElement Promotion_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass_607() {
		return Promotion_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//*[@id='iisProductClassInsuranceType_M003MT']")
	private WebElement Insurance_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass;
	public WebElement Insurance_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass_607() {
		return Insurance_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass;
	}
	
	//721374
	
	@FindBy (xpath = "//td[text()='Desk Management']")
	private WebElement Click_DeskManagement_Under_Parameters;
	public WebElement Click_DeskManagement_Under_Parameters_607() {
		return Click_DeskManagement_Under_Parameters;
	}

	@FindBy (xpath = "//*[@id='M073MT']")
	private WebElement Click_Mainteance_UnderDeskManagement;
	public WebElement Click_Mainteance_UnderDeskManagement_607() {
		return Click_Mainteance_UnderDeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='deskManagementCode_M073MT']")
	private WebElement CodeIn_Mainteance_UnderDeskManagement;
	public WebElement CodeIn_Mainteance_UnderDeskManagement_607() {
		return CodeIn_Mainteance_UnderDeskManagement;
	}	
	
	@FindBy (xpath = "//*[@id='deskManagementBriefDescEng_M073MT']")
	private WebElement BriefDescriptionIn_Mainteance_UnderDeskManagement;
	public WebElement BriefDescriptionIn_Mainteance_UnderDeskManagement_607() {
		return BriefDescriptionIn_Mainteance_UnderDeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='deskManagementBriefLongEng_M073MT']")
	private WebElement LongDescriptionIn_Mainteance_UnderDeskManagement;
	public WebElement LongDescriptionIn_Mainteance_UnderDeskManagement_607	() {
		return LongDescriptionIn_Mainteance_UnderDeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='deskManagementMaint_save_M073MT']")
	private WebElement SaveBtnIn_Mainteance_UnderDeskManagement;
	public WebElement SaveBtnIn_Mainteance_UnderDeskManagement_607() {
		return SaveBtnIn_Mainteance_UnderDeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='_popup_path_sol_confirm_ok']")
	private WebElement ConfirmPopup_InIISparam;
	public WebElement ConfirmPopup_InIISparam_607() {
		return ConfirmPopup_InIISparam;
	}
	
	@FindBy (xpath = "//*[@id='_popup_path_sol_ok']")
	private WebElement SuccessPopup_InIISparam;
	public WebElement SuccessPopup_InIISparam_607() {
		return SuccessPopup_InIISparam;
	}
	
	@FindBy (xpath = "//*[@id='M073P']")
	private WebElement ClickApprove_Under_DeskManagement;
	public WebElement ClickApprove_Under_DeskManagement_607() {
		return ClickApprove_Under_DeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='M073UP']")
	private WebElement ClickUpdateAfterApprove_Under_DeskManagement;
	public WebElement ClickUpdateAfterApprove_Under_DeskManagement_607() {
		return ClickUpdateAfterApprove_Under_DeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='deskManagementListGridTbl_Id_M073UP_gs_trsDeskMgmtVO.CODE']")
	private WebElement Search_DeskCode_InUpdateAfterApprove_Under_DeskManagement;
	public WebElement Search_DeskCode_InUpdateAfterApprove_Under_DeskManagement_607() {
		return Search_DeskCode_InUpdateAfterApprove_Under_DeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='td_deskManagementListGridTbl_Id_M073UP_1_trsDeskMgmtVO.CODE']")
	private WebElement SelectRecordIn_DeskCode_InUpdateAfterApprove_Under_DeskManagement;
	public WebElement SelectRecordIn_DeskCode_InUpdateAfterApprove_Under_DeskManagement_607() {
		return SelectRecordIn_DeskCode_InUpdateAfterApprove_Under_DeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='deskManagementBriefDescEng_M073UP']")
	private WebElement ReEnterBriefDescription_InUpdateAfterApprove_Under_DeskManagement;
	public WebElement ReEnterBriefDescription_InUpdateAfterApprove_Under_DeskManagement_607() {
		return ReEnterBriefDescription_InUpdateAfterApprove_Under_DeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='deskManagementMaint_Update_Btn_M073UP']")
	private WebElement ClickUpdateBtn_InUpdateAfterApprove_Under_DeskManagement;
	public WebElement ClickUpdateBtn_InUpdateAfterApprove_Under_DeskManagement_607() {
		return ClickUpdateBtn_InUpdateAfterApprove_Under_DeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='infoBarSearchButton_M073MT']")
	private WebElement ClickSearchBtnIn_Mainteance_UnderDeskManagement;
	public WebElement ClickSearchBtnIn_Mainteance_UnderDeskManagement_607() {
		return ClickSearchBtnIn_Mainteance_UnderDeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='deskManagementListGridTbl_Id_M073MT_gs_trsDeskMgmtVO.CODE']")
	private WebElement SearchRecordIn_Mainteance_UnderDeskManagement;
	public WebElement SearchRecordIn_Mainteance_UnderDeskManagement() {
		return SearchRecordIn_Mainteance_UnderDeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='td_deskManagementListGridTbl_Id_M073MT_1_trsDeskMgmtVO.CODE']")
	private WebElement SelectRecordIn_Mainteance_UnderDeskManagement;
	public WebElement SelectRecordIn_Mainteance_UnderDeskManagement_607() {
		return SelectRecordIn_Mainteance_UnderDeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='deskManagementMaint_del_M073MT']")
	private WebElement ClickDelBtnIn_Mainteance_UnderDeskManagement;
	public WebElement ClickDelBtnIn_Mainteance_UnderDeskManagement_607() {
		return ClickDelBtnIn_Mainteance_UnderDeskManagement;
	}
	
	@FindBy (xpath = "//*[@id=\"td_deskManagementListGridTbl_Id_M073MT_1_trsDeskMgmtVO.BRIEF_NAME_ENG\"]")
	private WebElement CheckBriefNameShowWhileSearchIn_Mainteance_UnderDeskManagement;
	public WebElement CheckBriefNameShowWhileSearchIn_Mainteance_UnderDeskManagement_607() {
		return CheckBriefNameShowWhileSearchIn_Mainteance_UnderDeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='td_deskManagementListGridTbl_Id_M073MT_1_trsDeskMgmtVO.LONG_NAME_ENG']")
	private WebElement CheckLongNameShowWhileSearchIn_Mainteance_UnderDeskManagement;
	public WebElement CheckLongNameShowWhileSearchIn_Mainteance_UnderDeskManagement_607() {
		return CheckLongNameShowWhileSearchIn_Mainteance_UnderDeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='fbox_deskManagementListGridTbl_Id_M073MT']/table/tbody/tr[3]/td[2]/select")
	private WebElement SelectDeskCodeShortingIn_Mainteance_UnderDeskManagement;
	public WebElement SelectDeskCodeShortingIn_Mainteance_UnderDeskManagement_607() {
		return SelectDeskCodeShortingIn_Mainteance_UnderDeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='M073N']")
	private WebElement RejectUnderDeskManagement;
	public WebElement RejectUnderDeskManagement_607() {
		return RejectUnderDeskManagement;
	}
	
	@FindBy (xpath = "//*[@id=\"Parameters / Desk Management / Maintenance\"]//parent::td//following::td[1]/span")
	private WebElement Close_DeskManagement_MaintenanceTab;
	public WebElement Close_DeskManagement_MaintenanceTab_607() {
		return Close_DeskManagement_MaintenanceTab;
	}
	
	@FindBy (xpath = "//*[@id='searchhdfbox_deskManagementListGridTbl_Id_M073MT']/a/span")
	private WebElement Close_SortingPopup;
	public WebElement Close_SortingPopup_607() {
		return Close_SortingPopup;
	}
	
	@FindBy (xpath = "//*[@id='search_deskManagementListGridTbl_Id_M073MT']/div/span")
	private WebElement ClickSearchInGridList_In_Mainteance_UnderDeskManagement;
	public WebElement ClickSearchInGridList_In_Mainteance_UnderDeskManagement_607() {
		return ClickSearchInGridList_In_Mainteance_UnderDeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='last_deskManagementListGridTbl_Id_M073MT_pager']")
	private WebElement LastBtn_In_Mainteance_UnderDeskManagement;
	public WebElement LastBtn_In_Mainteance_UnderDeskManagement_607() {
		return LastBtn_In_Mainteance_UnderDeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='first_deskManagementListGridTbl_Id_M073MT_pager']")
	private WebElement FirstBtn_In_Mainteance_UnderDeskManagement;
	public WebElement FirstBtn_In_Mainteance_UnderDeskManagement_607() {
		return FirstBtn_In_Mainteance_UnderDeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='next_deskManagementListGridTbl_Id_M073MT_pager']")
	private WebElement nextBtn_In_Mainteance_UnderDeskManagement;
	public WebElement nextBtn_In_Mainteance_UnderDeskManagement_607() {
		return nextBtn_In_Mainteance_UnderDeskManagement;
	}
	
	@FindBy (xpath = "//*[@id='prev_deskManagementListGridTbl_Id_M073MT_pager']")
	private WebElement PreviousBtn_In_Mainteance_UnderDeskManagement;
	public WebElement PreviousBtn_In_Mainteance_UnderDeskManagement_607() {
		return PreviousBtn_In_Mainteance_UnderDeskManagement;
	}
	
	//721382
	
	@FindBy (xpath = "//td[text()='Email']")
	private WebElement Click_Email_UnderMenuOptions;
	public WebElement Click_Email_UnderMenuOptions_607() {
		return Click_Email_UnderMenuOptions;
	}
	
	@FindBy (xpath = "//*[@id='_selenuimM066MT']")
	private WebElement Mainteance_UnderEmail;
	public WebElement Mainteance_UnderEmail_607() {
		return Mainteance_UnderEmail;
	}
	
	@FindBy (xpath = "//*[@id='M066UP']")
	private WebElement UpdateAfterAuthorize_UnderEmail;
	public WebElement UpdateAfterAuthorize_UnderEmail_607() {
		return UpdateAfterAuthorize_UnderEmail;
	}
	
	@FindBy (xpath = "//*[@id='M066N']")
	private WebElement Reject_UnderEmail;
	public WebElement Reject_UnderEmail_607() {
		return Reject_UnderEmail;
	}
	
	@FindBy (xpath = "//*[@id='M066P']")
	private WebElement approve_UnderEmail;
	public WebElement approve_UnderEmail_607() {
		return approve_UnderEmail;
	}
	
	@FindBy (xpath = "//*[@id='add_emailIdsGrid_Id_M066MT']/div/span")
	private WebElement ClickAddBtn_InMainteance_UnderEmail;
	public WebElement ClickAddBtn_InMainteance_UnderEmail_607() {
		return ClickAddBtn_InMainteance_UnderEmail;
	}
	
	@FindBy(xpath = "(//*[@id='td_emailIdsGrid_Id_M066MT_1_trsemail_detailsVO.WINDOW_REFERENCE'])[2]")
	private WebElement SelectRow_InMainteance_UnderEmail;
	public WebElement SelectRow_InMainteance_UnderEmail_607() {
		return SelectRow_InMainteance_UnderEmail;
	}
	
	@FindBy(xpath = "//*[@id='td_emailIdsGrid_Id_M066MT_1_trsemail_detailsVO.EMAIL_ID']/input")
	private WebElement EnterEmailInRow_InMainteance_UnderEmail;
	public WebElement EnterEmailInRow_InMainteance_UnderEmail_607() {
		return EnterEmailInRow_InMainteance_UnderEmail;
	}
	
	@FindBy(xpath = "//*[@id='del_emailIdsGrid_Id_M066MT']")
	private WebElement DeleteBtn_InMainteance_UnderEmail;
	public WebElement DeleteBtn_InMainteance_UnderEmail_607() {
		return DeleteBtn_InMainteance_UnderEmail;
	}
	
	@FindBy(xpath = "//*[@id='emailIdMaint_save_M066MT']")
	private WebElement SaveBtn_InMainteance_UnderEmail;
	public WebElement SaveBtn_InMainteance_UnderEmail_607() {
		return SaveBtn_InMainteance_UnderEmail;
	}
	
	@FindBy(xpath = "//*[@id='td_emailIdsGrid_Id_M066MT_1_trsemail_detailsVO.TO_CC_BCC_IND']")
	private WebElement SelectFirstRow_InMainteance_UnderEmail;
	public WebElement SelectFirstRow_InMainteance_UnderEmail_607() {
		return SelectFirstRow_InMainteance_UnderEmail;
	}
	
	@FindBy(xpath = "//*[@id='1_trsemail_detailsVO.TO_CC_BCC_IND_emailIdsGrid_Id_M066MT']")
	private WebElement IndicatorInFirstRow_InMainteance_UnderEmail;
	public WebElement IndicatorInFirstRow_InMainteance_UnderEmail_607() {
		return IndicatorInFirstRow_InMainteance_UnderEmail;
	}
	
	@FindBy(xpath = "//a[text()='Parameters / Email / Maintenance']//parent::td//following::span[1]")
	private WebElement Close_ParameterEmailMainteance_Tab;
	public WebElement Close_ParameterEmailMainteance_Tab_607() {
		return Close_ParameterEmailMainteance_Tab;
	}
	
	
	//721389
	
	@FindBy(xpath = "//td[text()='Board Members']")
	private WebElement ClickBoardMembers_Under_Parameters;
	public WebElement ClickBoardMembers_Under_Parameters_607() {
		return ClickBoardMembers_Under_Parameters;
	}
	
	@FindBy(xpath = "//*[@id='M019MT']")
	private WebElement Click_Mainteance_Under_BoardMembers;
	public WebElement Click_Mainteance_Under_BoardMembers_607() {
		return Click_Mainteance_Under_BoardMembers;
	}
	
	@FindBy(xpath = "//*[@id='M019L']")
	private WebElement List_Under_BoardMembers;
	public WebElement List_Under_BoardMembers_607() {
		return List_Under_BoardMembers;
	}
	
	@FindBy(xpath = "//*[@id='M019UP']")
	private WebElement UpdateAfterAuthorize_Under_BoardMembers;
	public WebElement UpdateAfterAuthorize_Under_BoardMembers_607() {
		return UpdateAfterAuthorize_Under_BoardMembers;
	}
	
	@FindBy(xpath = "//*[@id='M019N']")
	private WebElement Reject_Under_BoardMembers;
	public WebElement Reject_Under_BoardMembers_607() {
		return Reject_Under_BoardMembers;
	}
	
	@FindBy(xpath = "//*[@id='M019P']")
	private WebElement Approve_Under_BoardMembers;
	public WebElement Approve_Under_BoardMembers_607() {
		return Approve_Under_BoardMembers;
	}
	
	@FindBy(xpath = "//*[@id='trsBoard_MembersVO_MEMBER_ID_M019MT']")
	private WebElement Enter_MemberID_InMainteance_Under_BoardMembers;
	public WebElement Enter_MemberID_InMainteance_Under_BoardMembers_607() {
		return Enter_MemberID_InMainteance_Under_BoardMembers;
	}
	
	@FindBy(xpath = "//*[@id='trsBoard_MembersVO_SHORT_NAME_ENG_M019MT']")
	private WebElement Enter_BriefDescription_InMainteance_Under_BoardMembers;
	public WebElement Enter_BriefDescription_InMainteance_Under_BoardMembers_607() {
		return Enter_BriefDescription_InMainteance_Under_BoardMembers;
	}
	
	@FindBy(xpath = "//*[@id='trsBoard_MembersVO_LONG_NAME_ENG_M019MT']")
	private WebElement Enter_LongDescription_InMainteance_Under_BoardMembers;
	public WebElement Enter_LongDescription_InMainteance_Under_BoardMembers_607() {
		return Enter_LongDescription_InMainteance_Under_BoardMembers;
	}
	
	@FindBy(xpath = "//*[@id='tRSBoardMembersMaint_save_M019MT']")
	private WebElement ClickSaveBtn_InMainteance_Under_BoardMembers;
	public WebElement ClickSaveBtn_InMainteance_Under_BoardMembers_607() {
		return ClickSaveBtn_InMainteance_Under_BoardMembers;
	}
	
	@FindBy(xpath = "//*[@id='infoBarSearchButton_M019MT']")
	private WebElement ClickSearchBtn_InMainteance_Under_BoardMembers;
	public WebElement ClickSearchBtn_InMainteance_Under_BoardMembers_607() {
		return ClickSearchBtn_InMainteance_Under_BoardMembers;
	}
	
	@FindBy(xpath = "//*[@id='td_tRSBoardMembersListGridTbl_Id_M019MT_1_trsBoard_MembersVO.MEMBER_ID']")
	private WebElement SelectRecord_InMainteance_Under_BoardMembers;
	public WebElement SelectRecord_InMainteance_Under_BoardMembers_607() {
		return SelectRecord_InMainteance_Under_BoardMembers;
	}
	
	@FindBy(xpath = "//*[@id='tRSBoardMembersMaint_update_M019MT']")
	private WebElement ClickUpdateBtn_InMainteance_Under_BoardMembers;
	public WebElement ClickUpdateBtn_InMainteance_Under_BoardMembers_607() {
		return ClickUpdateBtn_InMainteance_Under_BoardMembers;
	}
	
	@FindBy(xpath = "//*[@id='tRSBoardMembersMaint_del_M019MT']")
	private WebElement ClickDelBtn_InMainteance_Under_BoardMembers;
	public WebElement ClickDelBtn_InMainteance_Under_BoardMembers_607() {
		return ClickDelBtn_InMainteance_Under_BoardMembers;
	}
	
	@FindBy(xpath = "//*[@id='td_tRSBoardMembersListGridTbl_Id_M019MT_1_trsBoard_MembersVO.SHORT_NAME_ENG']")
	private WebElement CheckShortNameEngShow_InSearch_InMainteance_Under_BoardMembers;
	public WebElement CheckShortNameEngShow_InSearch_InMainteance_Under_BoardMembers_607() {
		return CheckShortNameEngShow_InSearch_InMainteance_Under_BoardMembers;
	}
	
	@FindBy(xpath = "//*[@id='td_tRSBoardMembersListGridTbl_Id_M019MT_1_trsBoard_MembersVO.LONG_NAME_ENG']")
	private WebElement CheckLongNameEngShow_InSearch_InMainteance_Under_BoardMembers;
	public WebElement CheckLongNameEngShow_InSearch_InMainteance_Under_BoardMembers_607() {
		return CheckLongNameEngShow_InSearch_InMainteance_Under_BoardMembers;
	}
	
	@FindBy(xpath = "//*[@id='search_tRSBoardMembersListGridTbl_Id_M019MT']")
	private WebElement ClickSearch_InGridList_InMainteance_Under_BoardMembers;
	public WebElement ClickSearch_InGridList_InMainteance_Under_BoardMembers_607() {
		return ClickSearch_InGridList_InMainteance_Under_BoardMembers;
	}
	
	@FindBy(xpath = "//*[@id='fbox_tRSBoardMembersListGridTbl_Id_M019MT']/table/tbody/tr[3]/td[2]/select")
	private WebElement SelectMemberIDShorting_InGridList_InMainteance_Under_BoardMembers;
	public WebElement SelectMemberIDShorting_InGridList_InMainteance_Under_BoardMembers_607() {
		return SelectMemberIDShorting_InGridList_InMainteance_Under_BoardMembers;
	}
	
	@FindBy(xpath = "//*[@id='searchhdfbox_tRSBoardMembersListGridTbl_Id_M019MT']/a")
	private WebElement CloseSortingPopup_InMainteance_Under_BoardMembers;
	public WebElement CloseSortingPopup_InMainteance_Under_BoardMembers_607() {
		return CloseSortingPopup_InMainteance_Under_BoardMembers;
	}
	
	@FindBy (xpath = "//*[@id='last_tRSBoardMembersListGridTbl_Id_M019MT_pager']")
	private WebElement LastBtn_In_Mainteance_UnderBoardMembers;
	public WebElement LastBtn_In_Mainteance_UnderBoardMembers_607() {
		return LastBtn_In_Mainteance_UnderBoardMembers;
	}
	
	@FindBy (xpath = "//*[@id='first_tRSBoardMembersListGridTbl_Id_M019MT_pager']")
	private WebElement FirstBtn_In_Mainteance_UnderBoardMembers;
	public WebElement FirstBtn_In_Mainteance_UnderBoardMembers_607() {
		return FirstBtn_In_Mainteance_UnderBoardMembers;
	}
	
	@FindBy (xpath = "//*[@id='next_tRSBoardMembersListGridTbl_Id_M019MT_pager']")
	private WebElement nextBtn_In_Mainteance_UnderBoardMembers;
	public WebElement nextBtn_In_Mainteance_UnderBoardMembers_607() {
		return nextBtn_In_Mainteance_UnderBoardMembers;
	}
	
	@FindBy (xpath = "//*[@id='prev_tRSBoardMembersListGridTbl_Id_M019MT_pager']")
	private WebElement PreviousBtn_In_Mainteance_UnderBoardMembers;
	public WebElement PreviousBtn_In_Mainteance_UnderBoardMembers_607() {
		return PreviousBtn_In_Mainteance_UnderBoardMembers;
	}
	
	@FindBy (xpath = "//a[text()='Parameters / Board Members / Maintenance']//parent::td//following::td[1]")
	private WebElement Close_ParametersBoardMembersMaintenance_Tab;
	public WebElement Close_ParametersBoardMembersMaintenance_Tab_607() {
		return Close_ParametersBoardMembersMaintenance_Tab;
	}
	
	
	//721405
	
	@FindBy(xpath = "//td[text()='Certificate Types']")
	private WebElement ClickCertificateTypes_Under_Parameters;
	public WebElement ClickCertificateTypes_Under_Parameters_607() {
		return ClickCertificateTypes_Under_Parameters;
	}
	
	@FindBy(xpath = "//*[@id='M052MT']")
	private WebElement Click_Mainteance_Under_CertificateTypes;
	public WebElement Click_Mainteance_Under_CertificateTypes_607() {
		return Click_Mainteance_Under_CertificateTypes;
	}
	
	@FindBy(xpath = "//*[@id='M052L']")
	private WebElement List_Under_CertificateTypes;
	public WebElement List_Under_CertificateTypes_607() {
		return List_Under_CertificateTypes;
	}
	
	@FindBy(xpath = "//*[@id='M052P']")
	private WebElement UpdateAfterAuthorize_Under_CertificateTypes;
	public WebElement UpdateAfterAuthorize_Under_CertificateTypes_607() {
		return UpdateAfterAuthorize_Under_CertificateTypes;
	}
	
	@FindBy(xpath = "//*[@id='M052N']")
	private WebElement Reject_Under_CertificateTypes;
	public WebElement Reject_Under_CertificateTypes_607() {
		return Reject_Under_CertificateTypes;
	}
	
	@FindBy(xpath = "//*[@id='M052P']")
	private WebElement Approve_Under_CertificateTypes;
	public WebElement Approve_Under_CertificateTypes_607() {
		return Approve_Under_CertificateTypes;
	}
	
	@FindBy(xpath = "//*[@id='certificateTypeCode_M052MT']")
	private WebElement Enter_Code_InMainteance_Under_CertificateTypes;
	public WebElement Enter_Code_InMainteance_Under_CertificateTypes_607() {
		return Enter_Code_InMainteance_Under_CertificateTypes;
	}
	
	@FindBy(xpath = "//*[@id='brief_desc_eng_M052MT']")
	private WebElement Enter_BriefDescription_InMainteance_Under_CertificateTypes;
	public WebElement Enter_BriefDescription_InMainteance_Under_CertificateTypes_607() {
		return Enter_BriefDescription_InMainteance_Under_CertificateTypes;
	}
	
	@FindBy(xpath = "//*[@id='long_desc_eng_M052MT']")
	private WebElement Enter_LongDescription_InMainteance_Under_CertificateTypes;
	public WebElement Enter_LongDescription_InMainteance_Under_CertificateTypes_607() {
		return Enter_LongDescription_InMainteance_Under_CertificateTypes;
	}
	
	@FindBy(xpath = "//*[@id='tRSCertificateTypesMaint_save_M052MT']")
	private WebElement ClickSaveBtn_InMainteance_Under_CertificateTypes;
	public WebElement ClickSaveBtn_InMainteance_Under_CertificateTypes_607() {
		return ClickSaveBtn_InMainteance_Under_CertificateTypes;
	}
	
	@FindBy(xpath = "//*[@id='infoBarSearchButton_M052MT']")
	private WebElement ClickSearchBtn_InMainteance_Under_CertificateTypes;
	public WebElement ClickSearchBtn_InMainteance_Under_CertificateTypes_607() {
		return ClickSearchBtn_InMainteance_Under_CertificateTypes;
	}
	
	@FindBy(xpath = "//*[@id='td_tRSCertificateTypesListGridTbl_Id_M052MT_1_trs_CERTIFICATE_TYPESVO.CERTIFICATE_CODE']")
	private WebElement SelectRecord_InMainteance_Under_CertificateTypes;
	public WebElement SelectRecord_InMainteance_Under_CertificateTypes_607() {
		return SelectRecord_InMainteance_Under_CertificateTypes;
	}
	
	@FindBy(xpath = "//*[@id='RSCertificateTypesMaint_update_M052MT']")
	private WebElement ClickUpdateBtn_InMainteance_Under_CertificateTypes;
	public WebElement ClickUpdateBtn_InMainteance_Under_CertificateTypes_607() {
		return ClickUpdateBtn_InMainteance_Under_CertificateTypes;
	}
	
	@FindBy(xpath = "//*[@id='tRSCertificateTypesMaint_delete_M052MT']")
	private WebElement ClickDelBtn_InMainteance_Under_CertificateTypes;
	public WebElement ClickDelBtn_InMainteance_Under_CertificateTypes_607() {
		return ClickDelBtn_InMainteance_Under_CertificateTypes;
	}
	
	@FindBy(xpath = "//*[@id='td_tRSCertificateTypesListGridTbl_Id_M052MT_1_trs_CERTIFICATE_TYPESVO.BRIEF_DESC_ENG']")
	private WebElement CheckBriefDescription_InSearch_InMainteance_Under_CertificateTypes;
	public WebElement CheckBriefDescription_InSearch_InMainteance_Under_CertificateTypes_607() {
		return CheckBriefDescription_InSearch_InMainteance_Under_CertificateTypes;
	}
	
	@FindBy(xpath = "//*[@id='td_tRSCertificateTypesListGridTbl_Id_M052MT_1_trs_CERTIFICATE_TYPESVO.LONG_DESC_ENG']")
	private WebElement CheckLongDescription_InSearch_InMainteance_Under_CertificateTypes;
	public WebElement CheckLongDescription_InSearch_InMainteance_Under_CertificateTypes_607() {
		return CheckLongDescription_InSearch_InMainteance_Under_CertificateTypes;
	}
	
	@FindBy(xpath = "//*[@id='search_tRSCertificateTypesListGridTbl_Id_M052MT']/div/span")
	private WebElement ClickSearch_InGridList_InMainteance_Under_CertificateTypes;
	public WebElement ClickSearch_InGridList_InMainteance_Under_CertificateTypes_607() {
		return ClickSearch_InGridList_InMainteance_Under_CertificateTypes;
	}
	
	@FindBy(xpath = "//*[@id='fbox_tRSCertificateTypesListGridTbl_Id_M052MT']/table/tbody/tr[3]/td[2]/select")
	private WebElement SelectCertificateCodeInShorting_InGridList_InMainteance_Under_CertificateTypes;
	public WebElement SelectCertificateCodeInShorting_InGridList_InMainteance_Under_CertificateTypes_607() {
		return SelectCertificateCodeInShorting_InGridList_InMainteance_Under_CertificateTypes;
	}
	
	@FindBy(xpath = "//*[@id='searchhdfbox_tRSCertificateTypesListGridTbl_Id_M052MT']/a/span")
	private WebElement CloseSortingPopup_InMainteance_Under_CertificateTypes;
	public WebElement CloseSortingPopup_InMainteance_Under_CertificateTypes_607() {
		return CloseSortingPopup_InMainteance_Under_CertificateTypes;
	}
	
	@FindBy (xpath = "//*[@id='last_tRSCertificateTypesListGridTbl_Id_M052MT_pager']")
	private WebElement LastBtn_In_Mainteance_UnderCertificateTypes;
	public WebElement LastBtn_In_Mainteance_UnderCertificateTypes_607() {
		return LastBtn_In_Mainteance_UnderCertificateTypes;
	}
	
	@FindBy (xpath = "//*[@id='first_tRSCertificateTypesListGridTbl_Id_M052MT_pager']")
	private WebElement FirstBtn_In_Mainteance_UnderCertificateTypes;
	public WebElement FirstBtn_In_Mainteance_UnderCertificateTypes_607() {
		return FirstBtn_In_Mainteance_UnderCertificateTypes;
	}
	
	@FindBy (xpath = "//*[@id='next_tRSCertificateTypesListGridTbl_Id_M052MT_pager']")
	private WebElement nextBtn_In_Mainteance_UnderCertificateTypes;
	public WebElement nextBtn_In_Mainteance_UnderCertificateTypes_607() {
		return nextBtn_In_Mainteance_UnderCertificateTypes;
	}
	
	@FindBy (xpath = "//*[@id='prev_tRSCertificateTypesListGridTbl_Id_M052MT_pager']")
	private WebElement PreviousBtn_In_Mainteance_UnderCertificateTypes;
	public WebElement PreviousBtn_In_Mainteance_UnderCertificateTypes_607() {
		return PreviousBtn_In_Mainteance_UnderCertificateTypes;
	}
	
	@FindBy (xpath = "//a[text()='Parameters / Certificate Types / Maintenance']//parent::td//following::td[1]")
	private WebElement Close_ParametersCertificateTypesMaintenance_Tab;
	public WebElement Close_ParametersCertificateTypesMaintenance_Tab_607() {
		return Close_ParametersCertificateTypesMaintenance_Tab;
	}
	
	//721413
	
	
	@FindBy(xpath = "//td[text()='Reason Codes']")
	private WebElement ClickReasonCodes_Under_Parameters;
	public WebElement ClickReasonCodes_Under_Parameters_607() {
		return ClickReasonCodes_Under_Parameters;
	}
	
	@FindBy(xpath = "//*[@id='M038MT']")
	private WebElement Click_Mainteance_Under_ReasonCodes;
	public WebElement Click_Mainteance_Under_ReasonCodes_607() {
		return Click_Mainteance_Under_ReasonCodes;
	}
	
	@FindBy(xpath = "//*[@id='M038L']")
	private WebElement List_Under_ReasonCodes;
	public WebElement List_Under_ReasonCodess_607() {
		return List_Under_ReasonCodes;
	}
	
	@FindBy(xpath = "//*[@id='M038UP']")
	private WebElement UpdateAfterAuthorize_Under_ReasonCodes;
	public WebElement UpdateAfterAuthorize_Under_ReasonCodes_607() {
		return UpdateAfterAuthorize_Under_ReasonCodes;
	}
	
	@FindBy(xpath = "//*[@id='M038N']")
	private WebElement Reject_Under_ReasonCodes;
	public WebElement Reject_Under_ReasonCodes_607() {
		return Reject_Under_ReasonCodes;
	}
	
	@FindBy(xpath = "//*[@id='M038P']")
	private WebElement Approve_Under_ReasonCodes;
	public WebElement Approve_Under_ReasonCodes_607() {
		return Approve_Under_ReasonCodes;
	}
	
	@FindBy(xpath = "//*[@id='reasoncodeCode_M038MT']")
	private WebElement Enter_Code_InMainteance_Under_ReasonCodes;
	public WebElement Enter_Code_InMainteance_Under_ReasonCodes_607() {
		return Enter_Code_InMainteance_Under_ReasonCodes;
	}
	
	@FindBy(xpath = "//*[@id='reasonCodeBriefNameEnglish_M038MT']")
	private WebElement Enter_BriefDescription_InMainteance_Under_ReasonCodes;
	public WebElement Enter_BriefDescription_InMainteance_Under_ReasonCodes_607() {
		return Enter_BriefDescription_InMainteance_Under_ReasonCodes;
	}
	
	@FindBy(xpath = "//*[@id='reasonCodeLongNameEnglish_M038MT']")
	private WebElement Enter_LongDescription_InMainteance_Under_ReasonCodes;
	public WebElement Enter_LongDescription_InMainteance_Under_ReasonCodes_607() {
		return Enter_LongDescription_InMainteance_Under_ReasonCodes;
	}
	
	@FindBy(xpath = "//*[@id='reasonCodeMaint_save_M038MT']")
	private WebElement ClickSaveBtn_InMainteance_Under_ReasonCodes;
	public WebElement ClickSaveBtn_InMainteance_Under_ReasonCodes_607() {
		return ClickSaveBtn_InMainteance_Under_ReasonCodes;
	}
	
	@FindBy(xpath = "//*[@id='infoBarSearchButton_M038MT']")
	private WebElement ClickSearchBtn_InMainteance_Under_ReasonCodes;
	public WebElement ClickSearchBtn_InMainteance_Under_ReasonCodes_607() {
		return ClickSearchBtn_InMainteance_Under_ReasonCodes;
	}
	
	@FindBy(xpath = "//*[@id='td_reasonCodeListGridTbl_Id_M038MT_1_trsreasonVO.REASON_CODE']")
	private WebElement SelectRecord_InMainteance_Under_ReasonCodes;
	public WebElement SelectRecord_InMainteance_Under_ReasonCodes_607() {
		return SelectRecord_InMainteance_Under_ReasonCodes;
	}
	
	@FindBy(xpath = "//*[@id='reasonCodeMaint_del_M038MT']")
	private WebElement ClickDelBtn_InMainteance_Under_ReasonCodes;
	public WebElement ClickDelBtn_InMainteance_Under_ReasonCodes_607() {
		return ClickDelBtn_InMainteance_Under_ReasonCodes;
	}
	
	@FindBy(xpath = "//*[@id='td_reasonCodeListGridTbl_Id_M038MT_1_trsreasonVO.BRIEF_DESC_ENG']")
	private WebElement CheckBriefDescription_InSearch_InMainteance_Under_ReasonCodes;
	public WebElement CheckBriefDescription_InSearch_InMainteance_Under_ReasonCodes_607() {
		return CheckBriefDescription_InSearch_InMainteance_Under_ReasonCodes;
	}
	
	@FindBy(xpath = "//*[@id='td_reasonCodeListGridTbl_Id_M038MT_1_trsreasonVO.BRIEF_DESC_ARAB']")
	private WebElement CheckLongDescription_InSearch_InMainteance_Under_ReasonCodes;
	public WebElement CheckLongDescription_InSearch_InMainteance_Under_ReasonCodes_607() {
		return CheckLongDescription_InSearch_InMainteance_Under_ReasonCodes;
	}
	
	@FindBy(xpath = "//*[@id='search_reasonCodeListGridTbl_Id_M038MT']/div/span")
	private WebElement ClickSearch_InGridList_InMainteance_Under_ReasonCodes;
	public WebElement ClickSearch_InGridList_InMainteance_Under_ReasonCodes_607() {
		return ClickSearch_InGridList_InMainteance_Under_ReasonCodes;
	}
	
	@FindBy(xpath = "//*[@id='fbox_reasonCodeListGridTbl_Id_M038MT']/table/tbody/tr[3]/td[2]/select")
	private WebElement SelectCertificateCodeInShorting_InGridList_InMainteance_Under_ReasonCodes;
	public WebElement SelectCertificateCodeInShorting_InGridList_InMainteance_Under_ReasonCodes_607() {
		return SelectCertificateCodeInShorting_InGridList_InMainteance_Under_ReasonCodes;
	}
	
	@FindBy(xpath = "//*[@id='searchhdfbox_reasonCodeListGridTbl_Id_M038MT']/a/span")
	private WebElement CloseSortingPopup_InMainteance_Under_ReasonCodes;
	public WebElement CloseSortingPopup_InMainteance_Under_ReasonCodes_607() {
		return CloseSortingPopup_InMainteance_Under_ReasonCodes;
	}
	
	@FindBy (xpath = "//*[@id='last_reasonCodeListGridTbl_Id_M038MT_pager']")
	private WebElement LastBtn_In_Mainteance_UnderReasonCodes;
	public WebElement LastBtn_In_Mainteance_UnderReasonCodes_607() {
		return LastBtn_In_Mainteance_UnderReasonCodes;
	}
	
	@FindBy (xpath = "//*[@id='last_reasonCodeListGridTbl_Id_M038MT_pager']")
	private WebElement FirstBtn_In_Mainteance_UnderReasonCodes;
	public WebElement FirstBtn_In_Mainteance_UnderReasonCodes_607() {
		return FirstBtn_In_Mainteance_UnderReasonCodes;
	}
	
	@FindBy (xpath = "//*[@id='next_reasonCodeListGridTbl_Id_M038MT_pager']")
	private WebElement nextBtn_In_Mainteance_UnderReasonCodes;
	public WebElement nextBtn_In_Mainteance_UnderReasonCodes_607() {
		return nextBtn_In_Mainteance_UnderReasonCodes;
	}
	
	@FindBy (xpath = "//*[@id='prev_reasonCodeListGridTbl_Id_M038MT_pager']")
	private WebElement PreviousBtn_In_Mainteance_UnderReasonCodes;
	public WebElement PreviousBtn_In_Mainteance_UnderReasonCodes_607() {
		return PreviousBtn_In_Mainteance_UnderReasonCodes;
	}
	
	@FindBy (xpath = "//a[text()='Parameters / Reason Codes / Maintenance']//parent::td//following::td[1]")
	private WebElement Close_ParametersReasonCodesMaintenance_Tab;
	public WebElement Close_ParametersReasonCodesMaintenance_Tab_607() {
		return Close_ParametersReasonCodesMaintenance_Tab;
	}
	
	@FindBy (xpath = "//*[@id='reasonCodeListGridTbl_Id_M038MT_gs_trsreasonVO.REASON_CODE']")
	private WebElement SearchReasonCode_In_Mainteance_UnderReasonCodes;
	public WebElement SearchReasonCode_In_Mainteance_UnderReasonCodes_607() {
		return SearchReasonCode_In_Mainteance_UnderReasonCodes;
	}
	
	
}
