
package pageobjects.CommonElements;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class AT_IISPRM_009_OBJ
{
	WebDriver driver;

 

	public AT_IISPRM_009_OBJ(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//*[@id=\"M003MT\"]/span[2]")	
	private WebElement Maintenance;
	public WebElement Maintenance() 
	{
		
		return Maintenance;
	}

	
	
	@FindBy(xpath= "//a[text()=' Search ']")	
	private WebElement Searchtab;
	public WebElement Searchtab() 
	{
		return Searchtab;
	}
	@FindBy(xpath= "//input[@name='trsctrlclassVO.CLASS']")	
	private WebElement productClassTextBox ;
	public WebElement productClassTexBox () 
	{
		return productClassTextBox;
	}
	@FindBy(xpath= "//tr[@class='ui-widget-content jqgrow ui-row-ltr']")	
	private WebElement ProductClass100;
	public WebElement ProductClass100() 
	{
		return ProductClass100;
	}
	@FindBy(id= "lbl_iisProductClassDisablPlanDefaltFromFmsYN_M003MT")	
	private WebElement DisableplandefaultfromFMSText;
	public WebElement DisableplandefaultfromFMSText() 
	{
		return DisableplandefaultfromFMSText;
	}
	@FindBy(xpath= "//*[@id=\"iisProductClassDisablPlanDefaltFromFmsYN_M003MT\"]")	
	private WebElement DisableplandefaultfromFMSBox;
	public WebElement DisableplandefaultfromFMSBox() 
	{
		return DisableplandefaultfromFMSBox;
	}
	
}