package pageobjects.CommonElements;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class AT_IISPRM_008_OBJ
{
	WebDriver driver;

 

	public AT_IISPRM_008_OBJ(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//*[@id=\"_selenuimM00\"]/h3/table/tbody/tr/td[1]/span/span")	
	private WebElement Parameters;
	public WebElement Parameters() 
	{
		return Parameters;
	}

 

	@FindBy(xpath= "//*[@id=\"_selenuimM003\"]/li/a/table/tbody/tr/td[1]/span/span")	
	private WebElement ProductClass;
	public WebElement ProductClass() 
	{
		return ProductClass;
	}

	@FindBy(xpath= "//*[@id=\"M003MT\"]/span[2]")	
	private WebElement Maintenance;
	public WebElement Maintenance() 
	{
		
		return Maintenance;
	}

	@FindBy(xpath= "//*[@id=\"iisProductClassAutoFinancing_M003MT\"]")	
	private WebElement Autofinancingcheckbox;
	public WebElement Autofinancingcheckbox() 
	{
		return Autofinancingcheckbox;
	}

	@FindBy(id= "lbl_iisProductClassAutoFinancing_M003MT")	
	private WebElement Autofinancingtext;
	public WebElement Autofinancingtext() 
	{
		return Autofinancingtext;
	}
	
	@FindBy(xpath= "//*[@id=\"iisProductClassAdditionalInformation_M003MT\"]")	
	private WebElement AdditionalInformationtab;
	public WebElement AdditionalInformationtab() 
	{
		return AdditionalInformationtab;
	}

	@FindBy(xpath= "//*[@id=\"iisProductClassAdditionalInformationRepaymentPlan_M003MT\"]/a")	
	private WebElement RepayementPlan;
	public WebElement RepayementPlan() 
	{
		return RepayementPlan;
	}
	
	@FindBy(xpath= "//*[@id=\"iisProductClassGracePeriodOption_M003MT\"]")	
	private WebElement Graceperiodbox;
	public WebElement Graceperiodbox() 
	{
		return Graceperiodbox;
	}
	
	
	@FindBy(xpath= "//*[@id=\"iisProductClassGrace_M003MT\"]")	
	private WebElement SetDatebox;
	public WebElement SetDatebox() 
	{
		return SetDatebox;
	}
	@FindBy(id= "iisProductClassGracePeriodicity_M003MT")	
	private WebElement Daysbox;
	public WebElement Daysbox() 
	{
		return Daysbox;
	
	}
	
	@FindBy(xpath= "//*[@id=\"lbl_iisProductClassFirstPaymentDay_M003MT\"]")	
	private WebElement FirstPaymentDay;
	public WebElement FirstPaymentDay() 
	{
		return FirstPaymentDay;
	}

	@FindBy(id= "lbl_iisProductClassCutoffDayForFirstPaymtDt_M003MT")	
	private WebElement Cutoffdayforfirstpaymentdate;
	public WebElement Cutoffdayforfirstpaymentdate() 
	{
		return Cutoffdayforfirstpaymentdate;
	}

	
	@FindBy(id="lbl_iisProductClassDefaultCommencementDateAsSystemDateYN_M003MT")	
	private WebElement Defaultcomment ;
	public WebElement Defaultcomment() 
	{
		return Defaultcomment;
	}	
	
}