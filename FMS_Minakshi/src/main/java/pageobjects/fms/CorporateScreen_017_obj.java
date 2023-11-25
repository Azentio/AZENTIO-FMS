package pageobjects.fms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorporateScreen_017_obj {
	WebDriver driver;
	public CorporateScreen_017_obj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//*[@id=\"infoBarSearchButton_P039MT\"]")
	private WebElement SearchButton;
	public WebElement SearchButton() {
		return SearchButton;
	}
	@FindBy(xpath = "//*[@id=\"corporatePackagesListGridTbl_Id_P039MT_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement ClearIcon;
	public WebElement ClearIcon() {
		return ClearIcon;
	}
	@FindBy(xpath = "//*[@id=\"corporatePackagesListGridTbl_Id_P039MT_gs_fmsCorpPkgVO.CODE\"]")
	private WebElement CodeTab;
	public WebElement CodeTab() {
		return CodeTab;
	}
	@FindBy(xpath = "//*[@id=\"td_corporatePackagesListGridTbl_Id_P039MT_1_fmsCorpPkgVO.CODE\"]")
	private WebElement RetriveData;
	public WebElement RetriveData() {
		return RetriveData;
	}
	@FindBy(xpath = "//*[@id=\"add_corporatePackagesRatesGridTbl_Id_P039MT\"]/div/span")
	private WebElement Addicon;
	public WebElement Addicon() {
		return Addicon;
	}
	@FindBy(xpath = "//*[@id=\"td_corporatePackagesRatesGridTbl_Id_P039MT_1_fmsCorpRateVO.CLASS\"]")
	private WebElement ProductClass;
	public WebElement ProductClass() {
		return ProductClass;
	}
	@FindBy(xpath = "(//input[@class='liveSearchText liveSearchCompSize ui-widget-content liveSearchInputCorner'])[1]")
	private WebElement ProductClasstab;
	public WebElement ProductClasstab() {
		return ProductClasstab;
	}
	
	
	@FindBy(xpath = "//*[@id=\"fmsCorporatePackagesMaintFormId_P039MT_Yield_Details_key\"]")
	private WebElement YeildDetail;
	public WebElement YeildDetail() {
		return YeildDetail;
	}
	@FindBy(xpath = "//*[@id=\"gview_corporatePackagesMultiRatesPopupGridTbl_Id_P039MT\"]/div[3]")
	private WebElement YeildDetailScreen;
	public WebElement YeildDetailScreen() {
		return YeildDetailScreen;
	}
	@FindBy(xpath = "//*[@id=\"add_corporatePackagesMultiRatesPopupGridTbl_Id_P039MT\"]/div/span")
	private WebElement AddunderYeildDetail;
	public WebElement AddunderYeildDetail() {
		return AddunderYeildDetail;
	}
	@FindBy(xpath = "//*[@id=\"td_corporatePackagesMultiRatesPopupGridTbl_Id_P039MT_1_fmsCorpMultiRateVO.NO_OF_PAYMENTS\"]")
	private WebElement NumberOfPaymentstab;
	public WebElement NumberOfPaymentstab() {
		return NumberOfPaymentstab;
	}
	@FindBy(xpath = "(//input[@class='editable'])[1]")
	private WebElement NumberOfPayments;
	public WebElement NumberOfPayments() {
		return NumberOfPayments;
	}
	@FindBy(xpath = "(//input[@class='editable'])[2]")
	private WebElement Margine;
	public WebElement Margine() {
		return Margine;
	}
	@FindBy(xpath = "(//input[@class='editable'])[3]")
	private WebElement Fixed;
	public WebElement Fixed() {
		return Fixed;
	}
	@FindBy(xpath = "(//input[@class='editable'])[4]")
	private WebElement CapRate;
	public WebElement CapRate() {
		return CapRate;
	}
	
}
