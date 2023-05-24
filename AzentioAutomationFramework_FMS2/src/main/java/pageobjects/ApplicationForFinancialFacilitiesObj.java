package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationForFinancialFacilitiesObj {
		WebDriver driver;

		public ApplicationForFinancialFacilitiesObj(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="_selenuimAPPLICATION")
		private WebElement WIFAKApplicationMainMenu;

		public WebElement WIFAKApplicationMainMenu() {
			return WIFAKApplicationMainMenu;
		}
		@FindBy(xpath="(//td[text()='WIFAK APPLICATION'])[2]")
		private WebElement WIFAKApplicationSubMenu;

		public WebElement WIFAKApplicationSubMenu() {
			return WIFAKApplicationSubMenu;
		}
		@FindBy(xpath="//td[text()='Application For Financial Facilities']")
		private WebElement ApplicationForFinancialFacilities;

		public WebElement ApplicationForFinancialFacilities() {
			return ApplicationForFinancialFacilities;
		}
		@FindBy(id="WIFT001MT")
		private WebElement ApplicationForFinancialFacilities_Maintenance;

		public WebElement ApplicationForFinancialFacilities_Maintenance() {
			return ApplicationForFinancialFacilities_Maintenance;
		}
		
		@FindBy(id="applicationFacilityApplicationfor_WIFT001MT")
		private WebElement ApplicationForDropdown;

		public WebElement ApplicationForDropdown() {
			return ApplicationForDropdown;
		}
		@FindBy(id="spanLookup_applicationFacilitycif_WIFT001MT")
		private WebElement CIFIDSearchIcon;

		public WebElement CIFIDSearchIcon() {
			return CIFIDSearchIcon;
		}
		@FindBy(id="refresh_gridtab_applicationFacilitycif_WIFT001MT")
		private WebElement ReloadGridInCIFNoSearchField;

		public WebElement ReloadGridInCIFNoSearchField() {
			return ReloadGridInCIFNoSearchField;
		}
		@FindBy(id="td_gridtab_applicationFacilitycif_WIFT001MT_2_cifVO.CIF_NO")
		private WebElement CIFNoSearch_FirstRecord;

		public WebElement CIFNoSearch_FirstRecord() {
			return CIFNoSearch_FirstRecord;
		}
		@FindBy(id="spanLookup_applicationFacilityFacilityType_WIFT001MT")
		private WebElement FacilityTypeSearchIcon;

		public WebElement FacilityTypeSearchIcon() {
			return FacilityTypeSearchIcon;
		}
		@FindBy(id="td_gridtab_applicationFacilityFacilityType_WIFT001MT_1_CODE")
		private WebElement FacilityTypeSearch_FirstRecord;

		public WebElement FacilityTypeSearch_FirstRecord() {
			return FacilityTypeSearch_FirstRecord;
		}
		@FindBy(id="spanLookup_applicationFacilityCountry_WIFT001MT")
		private WebElement CountryOfFinancingSearch;

		public WebElement CountryOfFinancingSearch() {
			return CountryOfFinancingSearch;
		}
		@FindBy(id="td_gridtab_applicationFacilityCountry_WIFT001MT_1_COUNTRY_CODE")
		private WebElement CountryOfFinancingFirstRecord;

		public WebElement CountryOfFinancingFirstRecord() {
			return CountryOfFinancingFirstRecord;
		}
		@FindBy(id="applicationFacilityAdditionDetailsTabs_WIFT001MT")
		private WebElement AdditionalDetailsSection;

		public WebElement AdditionalDetailsSection() {
			return AdditionalDetailsSection;
		}
		@FindBy(id="applicationFacilitytotalvalue_WIFT001MT")
		private WebElement AdditionalDetails_TotalValueField;

		public WebElement AdditionalDetails_TotalValueField() {
			return AdditionalDetails_TotalValueField;
		}
		@FindBy(id="applicationFacilityofferexpirydate_WIFT001MT")
		private WebElement AdditionalDetails_OfferExpirationDate;

		public WebElement AdditionalDetails_OfferExpirationDate() {
			return AdditionalDetails_OfferExpirationDate;
		}
		@FindBy(id="applicationFacilityLimitDetailsTabs_WIFT001MT")
		private WebElement LimitDetailsSection;

		public WebElement LimitDetailsSection() {
			return LimitDetailsSection;
		}
		@FindBy(id="add_ApplicationFacilityLimitDetailsGrid_WIFT001MT")
		private WebElement LimitDetails_AddIcon;

		public WebElement LimitDetails_AddIcon() {
			return LimitDetails_AddIcon;
		}
		@FindBy(id="spanLookup_applicationfacilityLimitDetailsCLASS_WIFT001MT")
		private WebElement LimitDetails_ProductClassSearchIcon;

		public WebElement LimitDetails_ProductClassSearchIcon() {
			return LimitDetails_ProductClassSearchIcon;
		}
		@FindBy(id="td_gridtab_applicationfacilityLimitDetailsCLASS_WIFT001MT_1_DESC_ENG")
		private WebElement LimitDetails_ProductClassFirstRecord;

		public WebElement LimitDetails_ProductClassFirstRecord() {
			return LimitDetails_ProductClassFirstRecord;
		}
		@FindBy(id="limitDetails_add_btn_WIFT001MT")
		private WebElement LimitDetails_AddButton;

		public WebElement LimitDetails_AddButton() {
			return LimitDetails_AddButton;
		}
		@FindBy(id="applicationFacilityDocumentDetailsTabs_WIFT001MT")
		private WebElement DocumentDetailsSection;

		public WebElement DocumentDetailsSection() {
			return DocumentDetailsSection;
		}
		@FindBy(id="spanLookup_applicationFacilitysolicitor_WIFT001MT")
		private WebElement DocumentDetails_SolicitorNameSearchIcon;

		public WebElement DocumentDetails_SolicitorNameSearchIcon() {
			return DocumentDetails_SolicitorNameSearchIcon;
		}
		@FindBy(id="td_gridtab_applicationFacilitysolicitor_WIFT001MT_1_CODE")
		private WebElement DocumentDetails_SolicitorNameFirstRecord;

		public WebElement DocumentDetails_SolicitorNameFirstRecord() {
			return DocumentDetails_SolicitorNameFirstRecord;
		}
		@FindBy(id="spanLookup_applicationFacilityEstimator_WIFT001MT")
		private WebElement DocumentDetails_EstimatorNameSearchField;

		public WebElement DocumentDetails_EstimatorNameSearchField() {
			return DocumentDetails_EstimatorNameSearchField;
		}
		@FindBy(id="td_gridtab_applicationFacilityEstimator_WIFT001MT_1_CODE")
		private WebElement DocumentDetails_EstimatorNameFirstRecord;

		public WebElement DocumentDetails_EstimatorNameFirstRecord() {
			return DocumentDetails_EstimatorNameFirstRecord;
		}
		@FindBy(id="applicationfacility_save_as_draft_btn_WIFT001MT")
		private WebElement DocumentDetails_SaveButton;

		public WebElement DocumentDetails_SaveButton() {
			return DocumentDetails_SaveButton;
		}
		@FindBy(id="applicationfacility_save_btn_WIFT001MT")
		private WebElement DocumentDetails_ValidateButton;

		public WebElement DocumentDetails_ValidateButton() {
			return DocumentDetails_ValidateButton;
		}
		@FindBy(id="_popup_path_sol_confirm_ok")
		private WebElement OkButtoninConfirmValidationPopup;

		public WebElement OkButtoninConfirmValidationPopup() {
			return OkButtoninConfirmValidationPopup;
		}
		@FindBy(id="_popup_path_sol_confirm_ok")
		private WebElement YesButtonInFacilityAlreadyCreatedPopup;

		public WebElement YesButtonInFacilityAlreadyCreatedPopup() {
			return YesButtonInFacilityAlreadyCreatedPopup;
		}
		@FindBy(id="_popup_path_sol_ok")
		private WebElement OkButtonInValidationSuccessFulPopup;

		public WebElement OkButtonInValidationSuccessFulPopup() {
			return OkButtonInValidationSuccessFulPopup;
		}
		@FindBy(id="WIFT001AP1")
		private WebElement ApproveRejectLevel1Section;

		public WebElement ApproveRejectLevel1Section() {
			return ApproveRejectLevel1Section;
		}
		
		@FindBy(xpath="(//span[@class='ui-icon ui-icon-refresh'])[2]")
		private WebElement ApproveLevel1Reject_ClearSearchIcon;

		public WebElement ApproveLevel1Reject_ClearSearchIcon() {
			return ApproveLevel1Reject_ClearSearchIcon;
		}
		@FindBy(id="td_applicationFacilityGridTbl_Id_WIFT001AP1_1_fmsApplVO.CODE")
		private WebElement ApproveLevel1Reject_FirstRecord;

		public WebElement ApproveLevel1Reject_FirstRecord() {
			return ApproveLevel1Reject_FirstRecord;
		}
		@FindBy(id="applicationFacilityDecision_1_WIFT001AP1")
		private WebElement ApproveLevel1Reject_DecisionField;

		public WebElement ApproveLevel1Reject_DecisionField() {
			return ApproveLevel1Reject_DecisionField;
		}
		@FindBy(id="applicationfacility_approvelevel1_btn_WIFT001AP1")
		private WebElement ApproveLevel1Reject_SubmitButton;

		public WebElement ApproveLevel1Reject_SubmitButton() {
			return ApproveLevel1Reject_SubmitButton;
		}
		@FindBy(id="_popup_path_sol_confirm_ok")
		private WebElement ApproveLevel1Reject_OkButtonInConfirmApproveProcess;

		public WebElement ApproveLevel1Reject_OkButtonInConfirmApproveProcess() {
			return ApproveLevel1Reject_OkButtonInConfirmApproveProcess;
		}
		@FindBy(id="_popup_path_sol_ok")
		private WebElement ApproveLevel1Reject_OkButtonInApprovedSuccessfullyPopup;

		public WebElement ApproveLevel1Reject_OkButtonInApprovedSuccessfullyPopup() {
			return ApproveLevel1Reject_OkButtonInApprovedSuccessfullyPopup;
		}
		@FindBy(xpath="//input[@id='lookuptxt_applicationFacilitycif_WIFT001MT']")
		private WebElement ApplicationForFinancialFacilities_CIFNoField;

		public WebElement ApplicationForFinancialFacilities_CIFNoField() {
			return ApplicationForFinancialFacilities_CIFNoField;
		}
		@FindBy(id="lookuptxt_applicationFacilityFacilityType_WIFT001MT")
		private WebElement ApplicationForFinancialFacilities_FacilityTypeField;

		public WebElement ApplicationForFinancialFacilities_FacilityTypeField() {
			return ApplicationForFinancialFacilities_FacilityTypeField;
		}
		@FindBy(id="lookuptxt_applicationFacilityCountry_WIFT001MT")
		private WebElement ApplicationForFinancialFacilities_CountryOfFinancingField;

		public WebElement ApplicationForFinancialFacilities_CountryOfFinancingField() {
			return ApplicationForFinancialFacilities_CountryOfFinancingField;
		}
		
		@FindBy(id="WIFAK APPLICATION / WIFAK APPLICATION / Application For Financial Facilities / Maintenance")
		private WebElement randomClickWIFAKApplication;

		public WebElement randomClickWIFAKApplication() {
			return randomClickWIFAKApplication;
		}
		@FindBy(id="_popup_path_sol_ok")
		private WebElement ServerRequestNotComplete_OKButton;

		public WebElement ServerRequestNotComplete_OKButton() {
			return ServerRequestNotComplete_OKButton;
		}
		
	}

