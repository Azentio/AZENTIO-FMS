package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FMSParam_CorporatePackagesObj {
	WebDriver driver;

	public FMSParam_CorporatePackagesObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//td[text()='Parameters']")
	private WebElement Parameters;

	public WebElement Parameters() {
		return Parameters;
	}

	@FindBy(xpath="//td[text()='Corporate Packages']")
	private WebElement CorporatePackages;

	public WebElement CorporatePackages() {
		return CorporatePackages;
	}
	
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement CorporatePackages_Maintenance;

	public WebElement CorporatePackages_Maintenance() {
		return CorporatePackages_Maintenance;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_fmsCorporatePackages_cif_P039MT']")
	private WebElement CorporatePackages_Maintenance_CIF;

	public WebElement CorporatePackages_Maintenance_CIF() {
		return CorporatePackages_Maintenance_CIF;
	}
	
	@FindBy(xpath="//input[@id='fmsCorporatePackagesRate_P039MT']")
	private WebElement CorporatePackages_Maintenance_Rate;

	public WebElement CorporatePackages_Maintenance_Rate() {
		return CorporatePackages_Maintenance_Rate;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_corporatePackagesCurrency_P039MT']")
	private WebElement CorporatePackages_Maintenance_Currency;

	public WebElement CorporatePackages_Maintenance_Currency() {
		return CorporatePackages_Maintenance_Currency;
	}
	
	@FindBy(xpath="//input[@id='txt_limit_P039MT']")
	private WebElement CorporatePackages_Maintenance_Limit;

	public WebElement CorporatePackages_Maintenance_Limit() {
		return CorporatePackages_Maintenance_Limit;
	}
	
	@FindBy(xpath="//span[text()='Rates']")
	private WebElement CorporatePackages_Maintenance_RatesTab;

	public WebElement CorporatePackages_Maintenance_RatesTab() {
		return CorporatePackages_Maintenance_RatesTab;
	}
	
	@FindBy(xpath="//td[@id='add_corporatePackagesRatesGridTbl_Id_P039MT']")
	private WebElement CorporatePackages_Maintenance_RatesAddNewRow;

	public WebElement CorporatePackages_Maintenance_RatesAddNewRow() {
		return CorporatePackages_Maintenance_RatesAddNewRow;
	}
	
	@FindBy(xpath="//td[@id='td_corporatePackagesRatesGridTbl_Id_P039MT_1_fmsCorpRateVO.CLASS']")
	private WebElement CorporatePackages_Maintenance_Rates_ProductClass;

	public WebElement CorporatePackages_Maintenance_Rates_ProductClass() {
		return CorporatePackages_Maintenance_Rates_ProductClass;
	}
	
	@FindBy(xpath="(//td[@id='td_corporatePackagesRatesGridTbl_Id_P039MT_1_fmsCorpRateVO.CLASS']//..//span//div//input)[1]")
	private WebElement CorporatePackages_Maintenance_Rates_ProductClassInput;

	public WebElement CorporatePackages_Maintenance_Rates_ProductClassInput() {
		return CorporatePackages_Maintenance_Rates_ProductClassInput;
	}
	
	
	
	
	@FindBy(xpath="//td[@id='td_corporatePackagesRatesGridTbl_Id_P039MT_1_fmsCorpRateVO.GROUP_ID']")
	private WebElement CorporatePackages_Maintenance_Rates_GroupID;

	public WebElement CorporatePackages_Maintenance_Rates_GroupID() {
		return CorporatePackages_Maintenance_Rates_GroupID;
	}
	@FindBy(xpath="//td[@id='td_corporatePackagesRatesGridTbl_Id_P039MT_1_fmsCorpRateVO.GROUP_ID']/descendant::input")
	private WebElement CorporatePackages_Maintenance_Rates_GroupIDInput;

	public WebElement CorporatePackages_Maintenance_Rates_GroupIDInput() {
		return CorporatePackages_Maintenance_Rates_GroupIDInput;
	}
	@FindBy(xpath="//td[@id='td_corporatePackagesRatesGridTbl_Id_P039MT_1_fmsCorpRateVO.RATE_TYPE']")
	private WebElement CorporatePackages_Maintenance_Rates_FloatingRate;

	public WebElement CorporatePackages_Maintenance_Rates_FloatingRate() {
		return CorporatePackages_Maintenance_Rates_FloatingRate;
	}
	
	
	@FindBy(xpath="//td[@id='td_corporatePackagesRatesGridTbl_Id_P039MT_1_fmsCorpRateVO.RATE_TYPE']/descendant::input")
	private WebElement CorporatePackages_Maintenance_Rates_FloatingRateInput;

	public WebElement CorporatePackages_Maintenance_Rates_FloatingRateInput() {
		return CorporatePackages_Maintenance_Rates_FloatingRateInput;
	}
	
	@FindBy(xpath="//input[@id='new_1687874646646_fmsCorpRateVO.RATE']")
	private WebElement CorporatePackages_Maintenance_Rates_Rate;

	public WebElement CorporatePackages_Maintenance_Rates_Rate() {
		return CorporatePackages_Maintenance_Rates_Rate;
	}
	
	@FindBy(xpath="//td[@id='td_corporatePackagesRatesGridTbl_Id_P039MT_1_fmsCorpRateVO.RATE']//div//input")
	private WebElement CorporatePackages_Maintenance_Rates_RateInput;

	public WebElement CorporatePackages_Maintenance_Rates_RateInput() {
		return CorporatePackages_Maintenance_Rates_RateInput;
	}
	
	
	@FindBy(xpath="//span[text()='Group Limit']")
	private WebElement CorporatePackages_Maintenance_GroupLimitTab;

	public WebElement CorporatePackages_Maintenance_GroupLimitTab() {
		return CorporatePackages_Maintenance_GroupLimitTab;
	}
	@FindBy(xpath="//td[@id='add_corporatePackagesGroupLimitGridTbl_Id_P039MT']")
	private WebElement CorporatePackages_Maintenance_AddGroupLimit;

	public WebElement CorporatePackages_Maintenance_AddGroupLimit() {
		return CorporatePackages_Maintenance_AddGroupLimit;
	}
	
	@FindBy(xpath="//tr[@id='new_1687878225284']")
	private WebElement CorporatePackages_Maintenance_GroupIdRow;

	public WebElement CorporatePackages_Maintenance_GroupIdRow() {
		return CorporatePackages_Maintenance_GroupIdRow;
	}
	
	@FindBy(xpath="//td[@id='td_corporatePackagesGroupLimitGridTbl_Id_P039MT_1_fmsCorpGroupVO.GROUP_ID']")
	private WebElement CorporatePackages_Maintenance_GroupId;

	public WebElement CorporatePackages_Maintenance_GroupId() {
		return CorporatePackages_Maintenance_GroupId;
	}
	
	@FindBy(xpath="//td[@id='td_corporatePackagesGroupLimitGridTbl_Id_P039MT_1_fmsCorpGroupVO.GROUP_ID']/descendant::input")
	private WebElement CorporatePackages_Maintenance_GroupIdInput;

	public WebElement CorporatePackages_Maintenance_GroupIdInput() {
		return CorporatePackages_Maintenance_GroupIdInput;
	}
	@FindBy(xpath="//td[@id='td_corporatePackagesGroupLimitGridTbl_Id_P039MT_1_fmsCorpGroupVO.GROUP_NAME']")
	private WebElement CorporatePackages_Maintenance_GroupName;

	public WebElement CorporatePackages_Maintenance_GroupName() {
		return CorporatePackages_Maintenance_GroupName;
	}
	@FindBy(xpath="//td[@id='td_corporatePackagesGroupLimitGridTbl_Id_P039MT_1_fmsCorpGroupVO.GROUP_NAME']/descendant::input")
	private WebElement CorporatePackages_Maintenance_GroupNameInput;

	public WebElement CorporatePackages_Maintenance_GroupNameInput() {
		return CorporatePackages_Maintenance_GroupNameInput;
	}
	
	@FindBy(xpath="//td[@id='td_corporatePackagesGroupLimitGridTbl_Id_P039MT_1_fmsCorpGroupVO.GROUP_LIMIT']")
	private WebElement CorporatePackages_Maintenance_GroupLimit;

	public WebElement CorporatePackages_Maintenance_GroupLimit() {
		return CorporatePackages_Maintenance_GroupLimit;
	}
	@FindBy(xpath="//td[@id='td_corporatePackagesGroupLimitGridTbl_Id_P039MT_1_fmsCorpGroupVO.GROUP_LIMIT']/descendant::input")
	private WebElement CorporatePackages_Maintenance_GroupLimitInput;

	public WebElement CorporatePackages_Maintenance_GroupLimitInput() {
		return CorporatePackages_Maintenance_GroupLimitInput;
	}
	
	@FindBy(xpath="//span[text()='Branches']")
	private WebElement CorporatePackages_Maintenance_Branches;

	public WebElement CorporatePackages_Maintenance_Branches() {
		return CorporatePackages_Maintenance_Branches;
	}
	
	@FindBy(xpath="//td[@id='add_corporatePackagesBranchesGridTbl_Id_P039MT']")
	private WebElement CorporatePackages_Maintenance_AddBranches;

	public WebElement CorporatePackages_Maintenance_AddBranches() {
		return CorporatePackages_Maintenance_AddBranches;
	}
	@FindBy(xpath="//td[@id='td_corporatePackagesBranchesGridTbl_Id_P039MT_1_fmsCorpBranchVOKey.BRANCH_CODE']")
	private WebElement CorporatePackages_Maintenance_BrancheCode;

	public WebElement CorporatePackages_Maintenance_BrancheCode() {
		return CorporatePackages_Maintenance_BrancheCode;
	}
	@FindBy(xpath="//td[@id='td_corporatePackagesBranchesGridTbl_Id_P039MT_1_fmsCorpBranchVOKey.BRANCH_CODE']/descendant::input")
	private WebElement CorporatePackages_Maintenance_BrancheCodeInput;

	public WebElement CorporatePackages_Maintenance_BrancheCodeInput() {
		return CorporatePackages_Maintenance_BrancheCodeInput;
	}
	@FindBy(xpath="//label[@id='fmsCorporatePackagesMaintFormId_P039MT_Yield_Details_key']")
	private WebElement CorporatePackages_Maintenance_YieldDetails;

	public WebElement CorporatePackages_Maintenance_YieldDetails() {
		return CorporatePackages_Maintenance_YieldDetails;
	}
	
	@FindBy(xpath="//td[@id='add_corporatePackagesMultiRatesPopupGridTbl_Id_P039MT']//div//span")
	private WebElement CorporatePackages_Maintenance_YieldDetailsAdd;

	public WebElement CorporatePackages_Maintenance_YieldDetailsAdd() {
		return CorporatePackages_Maintenance_YieldDetailsAdd;
	}
	
	@FindBy(xpath="//td[@id='td_corporatePackagesMultiRatesPopupGridTbl_Id_P039MT_1_fmsCorpMultiRateVO.NO_OF_PAYMENTS']")
	private WebElement CorporatePackages_Maintenance_NumberOfPayements;

	public WebElement CorporatePackages_Maintenance_NumberOfPayements() {
		return CorporatePackages_Maintenance_NumberOfPayements;
	}
	@FindBy(xpath="//td[@id='td_corporatePackagesMultiRatesPopupGridTbl_Id_P039MT_1_fmsCorpMultiRateVO.NO_OF_PAYMENTS']//div//input")
	private WebElement CorporatePackages_Maintenance_NumberOfPayementsInput;

	public WebElement CorporatePackages_Maintenance_NumberOfPayementsInput() {
		return CorporatePackages_Maintenance_NumberOfPayementsInput;
	}
	
	@FindBy(xpath="//td[@id='td_corporatePackagesMultiRatesPopupGridTbl_Id_P039MT_1_fmsCorpMultiRateVO.MARGIN_RATE']")
	private WebElement CorporatePackages_Maintenance_Margin;

	public WebElement CorporatePackages_Maintenance_Margin() {
		return CorporatePackages_Maintenance_Margin;
	}
	
	@FindBy(xpath="//td[@id='td_corporatePackagesMultiRatesPopupGridTbl_Id_P039MT_1_fmsCorpMultiRateVO.MARGIN_RATE']/descendant::input")
	private WebElement CorporatePackages_Maintenance_MarginInput;

	public WebElement CorporatePackages_Maintenance_MarginInput() {
		return CorporatePackages_Maintenance_MarginInput;
	}
	
	@FindBy(xpath="//td[@id='td_corporatePackagesMultiRatesPopupGridTbl_Id_P039MT_1_fmsCorpMultiRateVO.FIXED_FLOATING_RATE']//input")
	private WebElement CorporatePackages_Maintenance_Fixed;

	public WebElement CorporatePackages_Maintenance_Fixed() {
		return CorporatePackages_Maintenance_Fixed;
	}
	
	@FindBy(xpath="//td[@id='td_corporatePackagesMultiRatesPopupGridTbl_Id_P039MT_1_fmsCorpMultiRateVO.CAP_RATE']//div//input")
	private WebElement CorporatePackages_Maintenance_CapRate;

	public WebElement CorporatePackages_Maintenance_CapRate() {
		return CorporatePackages_Maintenance_CapRate;
	}
	
	@FindBy(xpath="//span[text()='OK']")
	private WebElement CorporatePackages_YieldDetailsOk;

	public WebElement CorporatePackages_YieldDetailsOk() {
		return CorporatePackages_YieldDetailsOk;
	}
}
