package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacilitiesManagmentObj {
	WebDriver driver;

	public FacilitiesManagmentObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	//*****************************************************************************************************************************
		//@AT_FM_018
		
		@FindBy(xpath = "//td[normalize-space()='Parameters']")
		private WebElement Sads_Parameter_Menu;
		public WebElement SadsParameterMenu() {
			return Sads_Parameter_Menu;
		}
		
		@FindBy(xpath = "//td[normalize-space()='Account Restrictions']")
		private WebElement Rescrict_Account_Module;
		public WebElement RescrictAccountModule() {
			return Rescrict_Account_Module;
		}
		
		@FindBy(xpath = "//a[@id='UR00M']//span[contains(text(),'Maintenance')]")
		private WebElement Rescrict_Account_Maintenance;
		public WebElement RescrictAccountMaintenance() {
			return Rescrict_Account_Maintenance;
		}
		
		@FindBy(xpath = "//div//input[@name='ctsRestrictionsVO.CODE']")
		private WebElement Rescrict_Code_Feild;
		public WebElement RescrictCodeFeild() {
			return Rescrict_Code_Feild;
		}
		
		@FindBy(xpath = "//input[@id='description_UR00M']")
		private WebElement Rescrict_Account_Description;
		public WebElement RescrictAccountDescription() {
			return Rescrict_Account_Description;
		}
		
		
		@FindBy(xpath = "//td[@id='td_ctsRestOptTreeGridTbl_Id_UR00M_1_progDesc']")
		private WebElement Rescrict_Account_App_Root_Rec;
		public WebElement RescrictAccountAppRecRoot() {
			return Rescrict_Account_App_Root_Rec;
		}
		
		@FindBy(xpath = "//input[@id='ROOT__ROOT_hasRestrictionYN_ctsRestOptTreeGridTbl_Id_UR00M']")
		private WebElement Rescrict_Account_App_Root_Flag;
		public WebElement RescrictAccountAppRootFlag() {
			return Rescrict_Account_App_Root_Flag;
		}
		
		@FindBy(xpath = "//td[@id='td_ctsRestBranchesTreeGridTbl_Id_UR00M_1_progDesc']")
		private WebElement Rescrict_Account_Companies_Root_Rec;
		public WebElement RescrictAccountCompaniesRecRoot() {
			return Rescrict_Account_Companies_Root_Rec;
		}
		
		@FindBy(xpath = "//input[@id='ROOT__ROOT__branchGrid_hasRestrictionYN_ctsRestBranchesTreeGridTbl_Id_UR00M']")
		private WebElement Rescrict_Account_Companies_Root_Flag;
		public WebElement RescrictAccountCompaniesRootFlag() {
			return Rescrict_Account_Companies_Root_Flag;
		}
		
		@FindBy(xpath = "//input[@id='userGridId_UR00M_gs_usrVO.USER_ID']")
		private WebElement Rescrict_Account_User_Id_Search_Bar;
		public WebElement RescrictAccountUserIdSearchBar() {
			return Rescrict_Account_User_Id_Search_Bar;
		}
		
		@FindBy(xpath = "//td[@id='td_userGridId_UR00M_1_usrVO.USER_ID']")
		private WebElement Rescrict_Account_User_Id_Searched_Rec;
		public WebElement RescrictAccountUserIdSearchedRec() {
			return Rescrict_Account_User_Id_Searched_Rec;
		}
		
		@FindBy(xpath = "//td[@id='add_restrictionsGridTbl_Id_UR00M']//span[@class='ui-icon ui-icon-plus']")
		private WebElement Rescrict_Account_Add_Icon_Btn;
		public WebElement RescrictAccountAddIconBtn() {
			return Rescrict_Account_Add_Icon_Btn;
		}	
		
		@FindBy(xpath = "//tr[@added = '1']//td[@tdlabel = 'Restriction Type']//select")
		private WebElement Rescrict_Account_Restrict_Type_DropDown;
		public WebElement RescrictAccountRestrictTypeDropDown() {
			return Rescrict_Account_Restrict_Type_DropDown;
		}
		
		@FindBy(xpath = "//span[@class='ui-icon ui-icon-search live-search-ui']")
		private WebElement Rescrict_Account_Gl_Code_Search_Icon;
		public WebElement RescrictAccountGlCodeSearchIcon() {
			return Rescrict_Account_Gl_Code_Search_Icon;
		}
		
		@FindBy(xpath = "//input[@id='gridtab_glCode_no_UR00M_gs_GL_CODE']")
		private WebElement Rescrict_Account_Gl_Code_Search_Feild;
		public WebElement RescrictAccountGlCodeSearchFeild() {
			return Rescrict_Account_Gl_Code_Search_Feild;
		}
		
		@FindBy(xpath = "//td[@title= '805224']")
		private WebElement Rescrict_Account_Gl_Code_Searched_Rec;
		public WebElement RescrictAccountGlCodeSearchedRec() {
			return Rescrict_Account_Gl_Code_Searched_Rec;
		}
		
		@FindBy(xpath = "//label[@id='ctsRestrictionsFormId_UR00M_Save_key']")
		private WebElement Rescrict_Account_Save_key;
		public WebElement RescrictAccountSave_key() {
			return Rescrict_Account_Save_key;
		}
		
		@FindBy(xpath = "//td[normalize-space()='Reports']")
		private WebElement Reports_Menu;
		public WebElement ReportsMenu() {
			return Reports_Menu;
		}
		
		@FindBy(xpath = "//span[normalize-space()='Customer Accounts Balances']")
		private WebElement Reports_Customer_Accounts_Balances_Module;
		public WebElement ReportsCustomerAccountsBalancesModule() {
			return Reports_Customer_Accounts_Balances_Module;
		}
		
		@FindBy(xpath = "//input[@id= 'lookuptxt_p_param_RA_GL_NUMBER_U004C']")
		private WebElement Reports_Customer_Accounts_Balances_GL_Feild;
		public WebElement ReportsCustomerAccountsBalancesGL_Feild() {
			return Reports_Customer_Accounts_Balances_GL_Feild;
		}
		
		@FindBy(xpath = "//label[@id='retrieve_key']")
		private WebElement Reports_Retrive_Btn;
		public WebElement ReportsRetriveBtn() {
			return Reports_Retrive_Btn;
		}
		
		//**************************************************************************************************************************
		//@AT_FM_027
		
		@FindBy(xpath = "//a[@id='CSMRF00CV']//span[contains(text(),'Credit Review')]")
		private WebElement Credit_Review_Module;
		public WebElement CreditReviewModule() {
			return Credit_Review_Module;
		}
		
		@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_CSMRF00CV_gs_fmsRequestFinancingVO.CODE']")
		private WebElement Credit_Review_Search_Code;
		public WebElement CreditReviewSearchCode() {
			return Credit_Review_Search_Code;
		}
		
		@FindBy(xpath = "//span[normalize-space()='Credit Committee Recommendations']")
		private WebElement Credit_Review_Credit_Committee_Recommendations_Tab;
		public WebElement CreditReviewCommitteeRecommendationsTab() {
			return Credit_Review_Credit_Committee_Recommendations_Tab;
		}
		
		@FindBy(xpath = "//span[normalize-space()='Recommendations']")
		private WebElement Credit_Review_Cr_Recommendations_Bar;
		public WebElement CreditReviewCrRecommendationsBar() {
			return Credit_Review_Cr_Recommendations_Bar;
		}
		
		@FindBy(xpath = "//tr[@id='RequestFinancingRecommendationsGridId_CSMRF00CVghead_0']//td//span")
		private WebElement Credit_Review_Cr_Recommendations_Bar_Add_Icon;
		public WebElement CreditReviewCrRecommendationsBarAddIcon() {
			return Credit_Review_Cr_Recommendations_Bar_Add_Icon;
		}
		
		@FindBy(xpath = "//tr[@id = '1']//td[@id='td_RequestFinancingRecommendationsGridId_CSMRF00CV_1_fmsApplRecommendVO.CR_RECOMMENDATION']")
		private WebElement Credit_Review_Cr_Recommendations_Rec;
		public WebElement CreditReviewCrRecommendationsRec() {
			return Credit_Review_Cr_Recommendations_Rec;
		}
		
		@FindBy(xpath = "//td[@tdlabel = 'CR Recommendation']//select")
		private WebElement Credit_Review_Cr_Recommendations_Rec_CR_DropDown;
		public WebElement CreditReviewCrRecommendationsRecCRDropDown() {
			return Credit_Review_Cr_Recommendations_Rec_CR_DropDown;
		}
		
		@FindBy(xpath = "//label[@id='requestFinancingFormId_CSMRF00CV_Credit_Review_Key']")
		private WebElement Credit_Review_Submit_Btn;
		public WebElement CreditReviewSubmitBtn() {
			return Credit_Review_Submit_Btn;
		}
		
		@FindBy(xpath = "//span[normalize-space()='Approval Committee Recommendations']")
		private WebElement Approval_Committe_Recommendation_Module;
		public WebElement ApprovalCommitteRecommendationModule() {
			return Approval_Committe_Recommendation_Module;
		}
		
		@FindBy(xpath = "//input[@id='requestFinancingGridTbl_Id_CSMRF00AC_gs_fmsRequestFinancingVO.CODE']")
		private WebElement Approval_Committe_Recommendation_Search_Code;
		public WebElement ApprovalCommitteRecommendationSearchCode() {
			return Approval_Committe_Recommendation_Search_Code;
		}
		
		@FindBy(xpath = "//input[@id='statusDesc_CSMRF00AC']")
		private WebElement Approval_Committe_Recommendation_Status;
		public WebElement ApprovalCommitteRecommendationStatus() {
			return Approval_Committe_Recommendation_Status;
		}
		
		
		@FindBy(xpath = "//td//input[@prevvalue = 'Reviewed']")
		private WebElement Approval_Committe_Recommendation_Status_Reviewed;
		public WebElement ApprovalCommitteRecommendationStatusReviewed() {
			return Approval_Committe_Recommendation_Status_Reviewed;
		}
		
		//**********************************************************************************************************************
		//@AT_FM_021
		
        @FindBy(xpath = "//span[contains(text(), 'Approve Level 1/Reject')]")
		private WebElement Aff_Approve_Level_1_Reject;
		public WebElement AffApproveLevel1Reject() {
			return Aff_Approve_Level_1_Reject;
		}
		
		@FindBy(xpath = "//input[@id='applicationFacilityGridTbl_Id_WIFT001AP1_gs_fmsApplVO.CODE']")
		private WebElement Aff_Approve_Level_1_Search_Code;
		public WebElement AffApproveLevel1SearchCode() {
			return Aff_Approve_Level_1_Search_Code;
		}
		
		
		@FindBy(xpath = "//tr[@id = '1']//td[@tdlabel= 'Code'][contains(text(),'5872')]")
		private WebElement Aff_Approve_Level_1_Search_Rec;
		public WebElement AffApproveLevel1SearchRec() {
			return Aff_Approve_Level_1_Search_Rec;
		}
		
		@FindBy(xpath = "//button[@id = 'applicationFacility_submit_btn_WIFT001MT']//span[contains(text(),'Submit')]")
		private WebElement Aff_Approve_Level_1_Submit;
		public WebElement AffApproveLevel1Submit() {
			return Aff_Approve_Level_1_Submit;
		}
		
		
		@FindBy(xpath = "//select[@name='applicationFacilityCO.fmsAppl3BlobsVO.DECISION_P1']")
		private WebElement Aff_Approve_Level_1_Decision1;
		public WebElement AffApproveLevel1Decision1() {
			return Aff_Approve_Level_1_Decision1;
		}
}

