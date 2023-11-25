package pageobjects.iisParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FMSAccureAdditionalProfitObj {
	
	WebDriver driver;
	public FMSAccureAdditionalProfitObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Clear cache for FMS Core
	@FindBy(xpath = "//span[@id='tech_details_icon']")
	private WebElement IIS_core_tech_details_icon;
	public WebElement IISCoreTechDetailsIcon_482() {
		return IIS_core_tech_details_icon;
	}
	
	 @FindBy(xpath= "//td[text()='Parameters']")	
     private WebElement iisParam_Parameters;
	 public WebElement iisParam_Parameters(){
        return iisParam_Parameters;

	}

		

	 @FindBy(xpath= "//td[text()='Product Class']")	
     private WebElement iisParam_ProductClass;
   	 public WebElement iisParam_ProductClass(){
        return iisParam_ProductClass;
    }

		

	 @FindBy(xpath= "//span[text()='Maintenance']")	
     private WebElement iisParam_Maintenance;
     public WebElement iisParam_Maintenance(){
        return iisParam_Maintenance;
    }

		

	 @FindBy(xpath= "//span[text()='Profit Calculation']")	
     private WebElement iisparam_ProfitCalculation;
     public WebElement iisparam_ProfitCalculation(){
        return iisparam_ProfitCalculation;
     }
     
   
    // @FindBy(xpath= "//select[@name='iisproductclassCO.trsclassextendedVO.ACCR_ADD_PRFT_ON_DEAL_RATE_YN']")
     @FindBy(xpath= "//select[@name='iisproductclassCO.trsclassextendedVO.ACCR_ADD_PRFT_ON_DEAL_RATE_YN']//option[@selected]")	
     private WebElement accureAdditionalProfitDrpdwn;
     public WebElement accureAdditionalProfitDrpdwn(){
        return accureAdditionalProfitDrpdwn; 
     }
           
     @FindBy(xpath= "//input[@name='iisproductclassCO.trsclassextendedVO.ADDITIONAL_PROFIT_RATE']")	
     private WebElement additionalProfitPenaltyOverDealRateTextfield;
     public WebElement additionalProfitPenaltyOverDealRateTextfield() {
        return additionalProfitPenaltyOverDealRateTextfield;
     }  
     
     
     @FindBy(xpath= "//label[text()='Allow Multiple Settlement Account ']")	
     private WebElement allowMultipleSettlementAccountCheckBox;
     public WebElement allowMultipleSettlementAccountCheckBox() {
        return allowMultipleSettlementAccountCheckBox;
     }  
   
     
     @FindBy(xpath= "//label[text()='Accrue additional profit based on deal rate ']")	
     private WebElement accrueAdditionalProfitBasedOnDealRateText;
     public WebElement accrueAdditionalProfitBasedOnDealRateText() {
        return accrueAdditionalProfitBasedOnDealRateText;
     }  
     
     //budget
     @FindBy(xpath= "//td[text()='Budget']")	
     private WebElement iisParam_Budget;
     public WebElement iisParam_Budget() {
        return iisParam_Budget;
     }  
     
     
     @FindBy(xpath= "//a[@id='M063MT']")	
     private WebElement iisParam_Budget_Maintainence;
     public WebElement iisParam_Budget_Maintainence() {
        return iisParam_Budget_Maintainence;
     }  
   
     
     @FindBy(xpath= "//a[text()=' Search ']")	
     private WebElement iisParam_Budget_SearchBtn;
     public WebElement iisParam_Budget_SearchBtn() {
        return iisParam_Budget_SearchBtn;
     } 
   
     
    
     @FindBy(xpath= "//input[@name='budgetCO.trsBUDGETVO.FISCAL_YEAR']")	
     private WebElement iisParam_Budget_BudgetYear;
     public WebElement iisParam_Budget_BudgetYear() {
        return iisParam_Budget_BudgetYear;
     }  
     
     
     
     
     @FindBy(xpath= "//span[@id='spanLookup_division_code_M063MT']")	
     private WebElement iisParam_Budget_DivisionSearchLookup;
     public WebElement iisParam_Budget_DivisionSearchLookup() {
        return iisParam_Budget_DivisionSearchLookup;
     }  
     
   
     @FindBy(xpath= "//tr[@id='1']")	
     private WebElement iisParam_Budget_firstOptionDivisionSearchLookUP;
     public WebElement iisParam_Budget_firstOptionDivisionSearchLookUP() {
        return iisParam_Budget_firstOptionDivisionSearchLookUP;
     }  
     
     
     @FindBy(xpath= "//span[@id='spanLookup_nostro_sl_M063MT']")	
     private WebElement iisParam_Budget_BranchCodeSearchLookUp;
     public WebElement iisParam_Budget_BranchCodeSearchLookUp() {
        return iisParam_Budget_BranchCodeSearchLookUp;
     } 
     
     
     @FindBy(xpath= "(//tr[@id='1'])[2]")	
     private WebElement iisParam_Budget_FirstOptionBranchCodeSearchLookUp;
     public WebElement iisParam_Budget_FirstOptionBranchCodeSearchLookUp() {
        return iisParam_Budget_FirstOptionBranchCodeSearchLookUp;
     } 
     
     @FindBy(xpath= "//label[text()='Save ']")	
     private WebElement iisParam_Budget_SaveBtn;
     public WebElement iisParam_Budget_SaveBtn() {
        return iisParam_Budget_SaveBtn;
     } 
     
     
     @FindBy(xpath= "//label[text()='Delete ']")	
     private WebElement iisParam_Budget_DeleteBtn;
     public WebElement iisParam_Budget_DeleteBtn() {
        return iisParam_Budget_DeleteBtn;
     } 
     
     
  
  
     @FindBy(xpath= "//input[@id='_popup_path_sol_confirm_ok']")	
     private WebElement iisParam_Budget_SaveConformationOK;
     public WebElement iisParam_Budget_SaveConformationOK() {
        return iisParam_Budget_SaveConformationOK;
     } 
     
     
     
     @FindBy(xpath= "//div[text()='Saved_Successfully_key']")	
     private WebElement iisParam_Budget_SavedSuccessfullyPopUp;
     public WebElement iisParam_Budget_SavedSuccessfullyPopUp() {
        return iisParam_Budget_SavedSuccessfullyPopUp;
     } 
     
     @FindBy(xpath= "//div[text()='Updated Succesfully']")	
     private WebElement iisParam_Budget_UpdatedSuccessfullyPopUp;
     public WebElement iisParam_Budget_UpdatedSuccessfullyPopUp() {
        return iisParam_Budget_UpdatedSuccessfullyPopUp;
     } 
     
     
     @FindBy(xpath= "//input[@id='_popup_path_sol_ok']")	
     private WebElement iisParam_Budget_DeleteConfirmOk;
     public WebElement iisParam_Budget_DeleteConfirmOk() {
        return iisParam_Budget_DeleteConfirmOk;
     } 
     
     
     @FindBy(xpath= "//div[text()='Deleted successfully']")	
     private WebElement iisParam_Budget_DeletedSuccessfullyPopup;
     public WebElement iisParam_Budget_DeletedSuccessfullyPopup() {
        return iisParam_Budget_DeletedSuccessfullyPopup;
     } 
     
     
   
   
     @FindBy(xpath= "//input[@id='budgetListGridTbl_Id_M063MT_gs_trsBUDGETVO.FISCAL_YEAR']")	
     private WebElement iisParam_Budget_Search_FiscalYear;
     public WebElement iisParam_Budget_Search_FiscalYear() {
        return iisParam_Budget_Search_FiscalYear;
     } 
     
     @FindBy(xpath= "//tbody//tr[@id = '1']//td[@tdlabel=\"Fiscal Year\"]")	
     private WebElement iisParam_Budget_Search_FirstOptionFiscalYear;
     public WebElement iisParam_Budget_Search_FirstOptionFiscalYear() {
        return iisParam_Budget_Search_FirstOptionFiscalYear;
     } 
     

     
     //control record
     @FindBy(xpath= "//td[text()='Control Record']/ancestor::a")	
     private WebElement iisParam_ControlRecord;
     public WebElement iisParam_ControlRecord() {
        return iisParam_ControlRecord;
     }  
     
     @FindBy(xpath= "//span[text()='CONTROL RECORD MAINTENANCE']/ancestor::a")	
     private WebElement iisParam_ControlRecordMaintainence;
     public WebElement iisParam_ControlRecordMaintainence() {
        return iisParam_ControlRecordMaintainence;
     }  
     
     
     @FindBy(xpath= "//span[text()='JV and Printing']/ancestor::a")	
     private WebElement iisParam_CR_JVAndPrinting;
     public WebElement iisParam_CR_JVAndPrinting() {
        return iisParam_CR_JVAndPrinting;
     }  
     
     
     @FindBy(xpath= "//label[text()='Customized JV Description ']/ancestor::span")	
     private WebElement iisParam_CR_CustomizedJVDescription;
     public WebElement iisParam_CR_CustomizedJVDescription() {
        return iisParam_CR_CustomizedJVDescription;
     }  
     
     @FindBy(xpath= "//tr[@id='1']//span[text()='By GL']")	
     private WebElement iisParam_CR_JVDescriptionFormat;
     public WebElement iisParam_CR_JVDescriptionFormat() {
        return iisParam_CR_JVDescriptionFormat;
     }  
     
     @FindBy(xpath= "//a[text()=' Search ']")	
     private WebElement iisParam_SearchBtn;
     public WebElement iisParam_SearchBtn() {
        return iisParam_SearchBtn;
     } 
   
     
     @FindBy(xpath= "//tr[@id='1']")	
     private WebElement iisParam_firstOptionUnderSearchBtn;
     public WebElement iisParam_firstOptionUnderSearchBtn() {
        return iisParam_firstOptionUnderSearchBtn;
     } 
     
     
     @FindBy(xpath= "//label[text()='Principal Installment ']/ancestor::span")	
     private WebElement iisParam_ProfCal_PrincipalInstallment;
     public WebElement iisParam_ProfCal_PrincipalInstallment() {
        return iisParam_ProfCal_PrincipalInstallment;
     } 
   
   
     @FindBy(xpath= "//label[text()='Link Charges ']/ancestor::span")	
     private WebElement iisParam_ProfCal_LinkCharges;
     public WebElement iisParam_ProfCal_LinkCharges() {
        return iisParam_ProfCal_LinkCharges;
     } 
     
     @FindBy(xpath= "//label[text()='Additional Fields ']/ancestor::span")	
     private WebElement iisParam_ProfCal_AdditionalFields;
     public WebElement iisParam_ProfCal_AdditionalFields() {
        return iisParam_ProfCal_AdditionalFields;
     } 
     
     @FindBy(xpath= "//label[text()='Eco Sector Validation Period ']/ancestor::span")	
     private WebElement iisParam_ProfCal_EcoSectorValidationPeriod;
     public WebElement iisParam_ProfCal_EcoSectorValidationPeriod() {
        return iisParam_ProfCal_EcoSectorValidationPeriod;
     } 
     
     @FindBy(xpath= "//label[text()='Define Accounts ']/ancestor::span")	
     private WebElement iisParam_ProfCal_DefineAccounts;
     public WebElement iisParam_ProfCal_DefineAccounts() {
        return iisParam_ProfCal_DefineAccounts;
     } 
     
     @FindBy(xpath= "//label[text()='Link Charges To Deal Plan ']/ancestor::span")	
     private WebElement iisParam_ProfCal_LinkChargesToDealPlan;
     public WebElement iisParam_ProfCal_LinkChargesToDealPlan() {
        return iisParam_ProfCal_LinkChargesToDealPlan;
     } 
     
     @FindBy(xpath= "//label[text()='Set Reports ']/ancestor::span")	
     private WebElement iisParam_ProfCal_SetReports;
     public WebElement iisParam_ProfCal_SetReports() {
        return iisParam_ProfCal_SetReports;
     } 
     
     @FindBy(xpath= "//label[text()='Set Fiscal implication ']/ancestor::span")	
     private WebElement iisParam_ProfCal_SetFiscalImplication;
     public WebElement iisParam_ProfCal_SetFiscalImplication() {
        return iisParam_ProfCal_SetFiscalImplication;
     } 
     
     @FindBy(xpath= "//label[text()='Remittance through CSM ']")	
     private WebElement iisParam_PC_RemittanceThroughCSM;
     public WebElement iisParam_PC_RemittanceThroughCSM() {
        return iisParam_PC_RemittanceThroughCSM;
     } 
     
     
     @FindBy(xpath= "//div[text()='Minimum value should be 1 1']")	
     private WebElement iisParam_Budget_invalidTextfieldError;
     public WebElement iisParam_Budget_invalidTextfieldError() {
        return iisParam_Budget_invalidTextfieldError;
     }
     
     @FindBy(xpath= "//div[text()='L/N']/ancestor::tr")	
     private WebElement iisParam_Budget_RetRecord_MenuTab;
     public WebElement iisParam_Budget_RetRecord_MenuTab() {
        return iisParam_Budget_RetRecord_MenuTab;
     }
     
   
     @FindBy(xpath= "//table[@id='budgetGrid_Id_M063MT']")	
     private WebElement iisParam_Budget_RetRecord_Lists;
     public WebElement iisParam_Budget_RetRecord_Lists() {
        return iisParam_Budget_RetRecord_Lists;
     }
     
     
     @FindBy(xpath= "//span[@class='ui-icon ui-icon-seek-first']")	
     private WebElement iisParam_Budget_FirstBtn;
     public WebElement iisParam_Budget_FirstBtn() {
        return iisParam_Budget_FirstBtn;
     }
     
     @FindBy(xpath= "//span[@class='ui-icon ui-icon-seek-prev']")	
     private WebElement iisParam_Budget_PreviousBtn;
     public WebElement iisParam_Budget_PreviousBtn() {
        return iisParam_Budget_PreviousBtn;
     }
     
     @FindBy(xpath= "//span[@class='ui-icon ui-icon-seek-next']")	
     private WebElement iisParam_Budget_NextBtn;
     public WebElement iisParam_Budget_NextBtn() {
        return iisParam_Budget_NextBtn;
     }
     
     @FindBy(xpath= "//span[@class='ui-icon ui-icon-seek-end']")	
     private WebElement iisParam_Budget_LastBtn;
     public WebElement iisParam_Budget_LastBtn() {
        return iisParam_Budget_LastBtn;
     }
     
     
   
}
