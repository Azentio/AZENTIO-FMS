package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorporateScreen_016_OBJ {
	WebDriver driver;
	public CorporateScreen_016_OBJ(WebDriver driver) {
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
	
	@FindBy(xpath = "//*[@id=\"jqgh_corporatePackagesRatesGridTbl_Id_P039MT_fmsCorpRateVO.GROUP_ID\"]")
	private WebElement GroupID;
	public WebElement GroupID() {
		return GroupID;
	}
}
