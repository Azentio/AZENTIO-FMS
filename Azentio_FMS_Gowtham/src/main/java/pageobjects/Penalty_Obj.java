package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Penalty_Obj {

	WebDriver driver;
	public Penalty_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//td[text()='Penalty']")
	private WebElement Penalty_Under_Parameters_In_IISparam;
	public WebElement Penalty_Under_Parameters_In_IISparam_607() {
		return Penalty_Under_Parameters_In_IISparam;
	}
	
	@FindBy (xpath = "//*[@id=\"M068MT\"]")
	private WebElement ClickMaintenance_Under_Penalty_Under_Parameters;
	public WebElement ClickMaintenance_Under_Penalty_Under_Parameters_607() {
		return ClickMaintenance_Under_Penalty_Under_Parameters;
	}
	
	@FindBy (xpath = "//select[@id='penaltyType_M068MT']")
	private WebElement SelectPenaltyType_UnderMaintenance_Under_Penalty;
	public WebElement SelectPenaltyType_UnderMaintenance_Under_Penalty_607() {
		return SelectPenaltyType_UnderMaintenance_Under_Penalty;
	}
	
	@FindBy (xpath = "//*[@id='penaltyCalcBasedOn_M068MT']")
	private WebElement PenaltyCalculationBased_on_InMaintenance_Under_Penalty;
	public WebElement PenaltyCalculationBased_on_InMaintenance_Under_Penalty_607() {
		return PenaltyCalculationBased_on_InMaintenance_Under_Penalty;
	}
	
	@FindBy (xpath = "//select[@id='penaltyType_M068MT']")
	private WebElement Apply_Deal_Rate_InMaintenance_Under_Penalty;
	public WebElement Apply_Deal_Rate_InMaintenance_Under_Penalty_607() {
		return Apply_Deal_Rate_InMaintenance_Under_Penalty;
	}
	
	@FindBy (xpath = "//span[text()='Profit Calculation']")
	private WebElement Click_Profit_CalculationIn_Mainteance_UnderProductClass;
	public WebElement Click_Profit_CalculationIn_Mainteance_UnderProductClass_607() {
		return Click_Profit_CalculationIn_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//*[@id='iisProductClassAccr_add_prft_on_deal_rate_M003MT']")
	private WebElement ClickAccrueAdditionalProfitBasedOnDealRate_In_Profit_CalculationIn_Mainteance_UnderProductClass;
	public WebElement ClickAccrueAdditionalProfitBasedOnDealRate_In_Profit_CalculationIn_Mainteance_UnderProductClass_607() {
		return ClickAccrueAdditionalProfitBasedOnDealRate_In_Profit_CalculationIn_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//*[@id='iisProductClassSetFiscalImplication_M003MT']")
	private WebElement ClickSet_Fiscal_implicationIn_Mainteance_UnderProductClass;
	public WebElement ClickSet_Fiscal_implicationIn_Mainteance_UnderProductClass_607() {
		return ClickSet_Fiscal_implicationIn_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//b[text()='Additional Profit Accrual']")
	private WebElement Additional_Profit_AccrualFieldIn_Mainteance_UnderProductClass;
	public WebElement Additional_Profit_AccrualFieldIn_Mainteance_UnderProductClass_607() {
		return Additional_Profit_AccrualFieldIn_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//*[@id='infoBarSearchButton_M003MT']")
	private WebElement Searchbtn_In_Mainteance_UnderProductClass;
	public WebElement Searchbtn_In_Mainteance_UnderProductClass_607() {
		return Searchbtn_In_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//*[@id='iISProductClassListGridTbl_Id_M003MT_gs_trsctrlclassVO.CLASS']")
	private WebElement SearchRecord_In_Mainteance_UnderProductClass;
	public WebElement SearchRecord_In_Mainteance_UnderProductClass_607() {
		return SearchRecord_In_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//*[@id='td_iISProductClassListGridTbl_Id_M003MT_1_trsctrlclassVO.CLASS']")
	private WebElement SelectRecord_In_Mainteance_UnderProductClass;
	public WebElement SelectRecord_In_Mainteance_UnderProductClass_607() {
		return SelectRecord_In_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//span[text()='Additional Information (2)']")
	private WebElement ClickAdditional_Information_In_Mainteance_UnderProductClass;
	public WebElement ClickAdditional_Information_In_Mainteance_UnderProductClass_607() {
		return ClickAdditional_Information_In_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//*[@id='iisProductClassAdditionalInformationSettlement_M003MT']")
	private WebElement clickSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass;
	public WebElement clickSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass_607() {
		return clickSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//*[@id='iisProductClassRepaymentApportionmentBtn_M003MT']")
	private WebElement click_RepaymentApportionmentBtn_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass;
	public WebElement click_RepaymentApportionmentBtn_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass_607() {
		return click_RepaymentApportionmentBtn_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//*[@id='add_iISProductClassRepaymentApportionmentGrid_Id_M003MT']/div/span")
	private WebElement click_AddBtn_InRepaymentApportionment_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass;
	public WebElement click_AddBtn_InRepaymentApportionment_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass_607() {
		return click_AddBtn_InRepaymentApportionment_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//*[@id='td_iISProductClassRepaymentApportionmentGrid_Id_M003MT_1_trsclassstlmtaptnmtVO.DUE_TYPE_ORDER']")
	private WebElement SelectFirstline_InRepaymentApportionment_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass;
	public WebElement SelectFirstline_InRepaymentApportionment_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass_607() {
		return SelectFirstline_InRepaymentApportionment_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//*[@id='td_iISProductClassRepaymentApportionmentGrid_Id_M003MT_1_trsclassstlmtaptnmtVO.APPORTIONMENT_IND']/select")
	private WebElement SelectProductClassRepaymentApportionment_InRepaymentApportionment_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass;
	public WebElement SelectProductClassRepaymentApportionment_InRepaymentApportionment_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass_607() {
		return SelectProductClassRepaymentApportionment_InRepaymentApportionment_InSettlementInAdditional_InformationTab__In_Mainteance_UnderProductClass;
	}
	
	
	
	
	
	
}
