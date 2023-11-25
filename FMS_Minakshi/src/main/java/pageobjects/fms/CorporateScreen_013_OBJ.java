package pageobjects.fms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorporateScreen_013_OBJ {
	WebDriver driver;
	public CorporateScreen_013_OBJ(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//*[@id=\"language_key\"]")
	private WebElement Language;
	public WebElement Language() {
		return Language;
	}
	@FindBy(xpath = "//div[@id='div_language_key']/div/ul/table/tbody/tr/td/li/a[@id='fr']")
	private WebElement French;
	public WebElement French() {
		return French;
	}
	@FindBy(xpath = "//*[@id=\"_selenuimP000\"]/h3")
	private WebElement Parameter;
	public WebElement Parameter() {
		return Parameter;
	}
	@FindBy(xpath = "//*[@id=\"_selenuimP039\"]/li/a")
	private WebElement Coporatepackage;
	public WebElement Coporatepackage() {
		return Coporatepackage;
	}
	@FindBy(xpath = "//*[@id=\"P039MT\"]")
	private WebElement maintanance;
	public WebElement maintanance() {
		return maintanance;
	}
	@FindBy(xpath = "//*[@id=\"corporatePackagesTabGroupLimit_P039MT\"]/a")
	private WebElement GroupLimit;
	public WebElement GroupLimit() {
		return GroupLimit;
	}
	@FindBy(xpath = "//*[@id=\"add_corporatePackagesGroupLimitGridTbl_Id_P039MT\"]/div/span")
	private WebElement Addicon;
	public WebElement Addicon() {
		return Addicon;
	}
	@FindBy(xpath = "//*[@id=\"td_corporatePackagesGroupLimitGridTbl_Id_P039MT_1_fmsCorpGroupVO.GROUP_ID\"]")
	private WebElement Groupidtab;
	public WebElement Groupidtab() {
		return Groupidtab;
	}
	@FindBy(xpath = "//*[@id=\"jqgh_corporatePackagesGroupLimitGridTbl_Id_P039MT_fmsCorpGroupVO.GROUP_ID\"]")
	private WebElement Groupid;
	public WebElement Groupid() {
		return Groupid;
	}
	@FindBy(xpath = "//*[@id=\"jqgh_corporatePackagesGroupLimitGridTbl_Id_P039MT_fmsCorpGroupVO.GROUP_NAME\"]")
	private WebElement Groupname;
	public WebElement Groupname() {
		return Groupname;
	}
	@FindBy(xpath = "//*[@id=\"jqgh_corporatePackagesGroupLimitGridTbl_Id_P039MT_fmsCorpGroupVO.GROUP_LIMIT\"]")
	private WebElement limit;
	public WebElement limit() {
		return limit;
	}
	@FindBy(xpath = "//*[@id=\"jqgh_corporatePackagesGroupLimitGridTbl_Id_P039MT_fmsCorpGroupVO.GROUP_UTILIZED\"]")
	private WebElement utilizedlimit;
	public WebElement utilizedlimit() {
		return utilizedlimit;
	}
	@FindBy(xpath = "//*[@id=\"jqgh_corporatePackagesGroupLimitGridTbl_Id_P039MT_remainingLimit\"]")
	private WebElement Remaininglimit;
	public WebElement Remaininglimit() {
		return Remaininglimit;
	}
	@FindBy(xpath = "//*[@id=\"add_corporatePackagesGroupLimitGridTbl_Id_P039MT\"]/div/span")
	private WebElement insert;
	public WebElement insert() {
		return insert;
	}
	@FindBy(xpath = "//*[@id=\"del_corporatePackagesGroupLimitGridTbl_Id_P039MT\"]/div/span")
	private WebElement Delete;
	public WebElement Delete() {
		return Delete;
	}
}
