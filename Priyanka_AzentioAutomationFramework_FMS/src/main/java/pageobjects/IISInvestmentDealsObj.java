package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IISInvestmentDealsObj {
	WebDriver driver;

	public IISInvestmentDealsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//td[text()='Investment Deals -Combined without Trade Deal']")
	private WebElement InvestmentDeals_CombinedwithoutTradeDeal;

	public WebElement InvestmentDeals_CombinedwithoutTradeDeal() {
		return InvestmentDeals_CombinedwithoutTradeDeal;
	}
	
	
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement InvestmentDeals_Maintenance;

	public WebElement InvestmentDeals_Maintenance() {
		return InvestmentDeals_Maintenance;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_investmentDeals_PARTY_T022MT']")
	private WebElement InvestmentDeals_Party;

	public WebElement InvestmentDeals_Party() {
		return InvestmentDeals_Party;
	}
	
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement InvestmentDeals_Party_confirm_ok;

	public WebElement InvestmentDeals_Party_confirm_ok() {
		return InvestmentDeals_Party_confirm_ok;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_trsdealVO_DEAL_TYPE_T022MT']")
	private WebElement InvestmentDeals_Category;

	public WebElement InvestmentDeals_Category() {
		return InvestmentDeals_Category;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_investmentDeals_CLASS_T022MT']")
	private WebElement InvestmentDeals_ProductClass;

	public WebElement InvestmentDeals_ProductClass() {
		return InvestmentDeals_ProductClass;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_trsdealVO_DD_DEAL_CY_T022MT']")
	private WebElement InvestmentDeals_DealCY;

	public WebElement InvestmentDeals_DealCY() {
		return InvestmentDeals_DealCY;
	}
	
	@FindBy(xpath="//input[@id='trsdealVO_DD_DEAL_AMOUNT_T022MT']")
	private WebElement InvestmentDeals_Amount;

	public WebElement InvestmentDeals_Amount() {
		return InvestmentDeals_Amount;
	}
	
	@FindBy(xpath="//input[@id='trsdealVO_DD_DEAL_EXPECTED_YIELD_T022MT']")
	private WebElement InvestmentDeals_Yield;

	public WebElement InvestmentDeals_Yield() {
		return InvestmentDeals_Yield;
	}
	
	@FindBy(xpath="//span[text()='Contributor Details']")
	private WebElement InvestmentDeals_ContributorDetails;

	public WebElement InvestmentDeals_ContributorDetails() {
		return InvestmentDeals_ContributorDetails;
	}
	
	@FindBy(xpath="//tr[@id='new_1690365920479']")
	private WebElement InvestmentDeals_ContributorDetailsRecord;

	public WebElement InvestmentDeals_ContributorDetailsRecord() {
		return InvestmentDeals_ContributorDetailsRecord;
	}
	
	@FindBy(xpath="//span[@id='spanLookup_nostro_sl_T022MT']")
	private WebElement InvestmentDeals_NostroDetails_searchIcon;

	public WebElement InvestmentDeals_NostroDetails_searchIcon() {
		return InvestmentDeals_NostroDetails_searchIcon;
	}
	
	@FindBy(xpath="//td[@id='td_gridtab_nostro_sl_T022MT_1_amfVO.BRANCH_CODE']")
	private WebElement InvestmentDeals_NostroDetails_selectRecord;

	public WebElement InvestmentDeals_NostroDetails_selectRecord() {
		return InvestmentDeals_NostroDetails_selectRecord;
	}
	
	@FindBy(xpath="//span[@id='spanLookup_matr_ac_sl_T022MT']")
	private WebElement InvestmentDeals_MaturityDetails_searchIcon;

	public WebElement InvestmentDeals_MaturityDetails_searchIcon() {
		return InvestmentDeals_MaturityDetails_searchIcon;
	}
	
	@FindBy(xpath="//td[@id='td_gridtab_matr_ac_sl_T022MT_1_amfVO.BRANCH_CODE']")
	private WebElement InvestmentDeals_MaturityDetails_selectRecord;

	public WebElement InvestmentDeals_MaturityDetails_selectRecord() {
		return InvestmentDeals_MaturityDetails_selectRecord;
	}
	
	@FindBy(xpath="//label[@id='lblContribDetSave']")
	private WebElement InvestmentDeals_ContribDetSave;

	public WebElement InvestmentDeals_ContribDetSave() {
		return InvestmentDeals_ContribDetSave;
	}
	@FindBy(xpath="//label[@id='investmentDeals_Save_btn_label_T022MT']")
	private WebElement InvestmentDeals_Save;

	public WebElement InvestmentDeals_Save() {
		return InvestmentDeals_Save;
	}
	
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement InvestmentDeals_Save_Confrim;

	public WebElement InvestmentDeals_Save_Confrim() {
		return InvestmentDeals_Save_Confrim;
	}
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement InvestmentDeals_alertOk;

	public WebElement InvestmentDeals_alertOk() {
		return InvestmentDeals_alertOk;
	}
	
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement InvestmentDeals_InformationOk;

	public WebElement InvestmentDeals_InformationOk() {
		return InvestmentDeals_InformationOk;
	}
	
	@FindBy(xpath="//label[@id='investmentDealsFormId_T022MT_Repayment_plan_key']")
	private WebElement InvestmentDeals_Repayment_plan;

	public WebElement InvestmentDeals_Repayment_plan() {
		return InvestmentDeals_Repayment_plan;
	}
	
	@FindBy(xpath="//label[@id='Create_Schedule_key']")
	private WebElement InvestmentDeals_Create_Schedule;

	public WebElement InvestmentDeals_Create_Schedule() {
		return InvestmentDeals_Create_Schedule;
	}
	
	@FindBy(xpath="//input[@id='grace_period_compounding_yn_T022MT']")
	private WebElement InvestmentDeals_compoundingCheckBox;

	public WebElement InvestmentDeals_compoundingCheckBox() {
		return InvestmentDeals_compoundingCheckBox;
	}
	@FindBy(xpath="//body/div[43]/div[1]/a[1]/span[1]")
	private WebElement InvestmentDeals_RepaymentSchedule_close;

	public WebElement InvestmentDeals_RepaymentSchedule_close() {
		return InvestmentDeals_RepaymentSchedule_close;
	}
	
	
	@FindBy(xpath="//button[@id='investmentDeals_Validate_btn_T022MT']")
	private WebElement InvestmentDeals_Validate;

	public WebElement InvestmentDeals_Validate() {
		return InvestmentDeals_Validate;
	}
	
	
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement InvestmentDeals_Validate_confirm;

	public WebElement InvestmentDeals_Validate_confirm() {
		return InvestmentDeals_Validate_confirm;
	}
	
	@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
	private WebElement InvestmentDeals_Validate_confirm_ok;

	public WebElement InvestmentDeals_Validate_confirm_ok() {
		return InvestmentDeals_Validate_confirm_ok;
	}
	
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement InvestmentDeals_Validate_confirmation;

	public WebElement InvestmentDeals_Validate_confirmation() {
		return InvestmentDeals_Validate_confirmation;
	}
}
