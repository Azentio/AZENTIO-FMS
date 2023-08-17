package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IISChargesObj {
	
	WebDriver driver;
	public	IISChargesObj(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//td[text()='Parameters']")
	private WebElement IIS_Parameters;
	
	public WebElement IIS_Parameters()
	{
		return IIS_Parameters;
	}
	

	@FindBy(xpath="//td[text()='Charges']")
	private WebElement IIS_Charges;
	
	public WebElement IIS_Charges()
	{
		return IIS_Charges;
	}
	
	@FindBy(xpath="//span[text()='Maintenance']")
	private WebElement IIS_Maintenance;
	
	public WebElement IIS_Maintenance()
	{
		return IIS_Maintenance;
	}
	
	@FindBy(xpath="//input[@id='trsChargesCode_M08MT']")
	private WebElement IIS_Charges_Code;
	
	public WebElement IIS_Charges_Code()
	{
		return IIS_Charges_Code;
	}
	
	@FindBy(xpath="//input[@id='trsCHARGESVO_brief_name_eng_M08MT']")
	private WebElement IIS_Charges_BriefDes;
	
	public WebElement IIS_Charges_BriefDes()
	{
		return IIS_Charges_BriefDes;
	}
	
	@FindBy(xpath="//input[@id='trsCHARGESVO_long_name_eng_M08MT']")
	private WebElement IIS_Charges_LongDes;
	
	public WebElement IIS_Charges_LongDes()
	{
		return IIS_Charges_LongDes;
	}

}
