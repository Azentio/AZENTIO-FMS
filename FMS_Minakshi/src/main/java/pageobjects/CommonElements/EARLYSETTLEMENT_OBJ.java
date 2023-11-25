package pageobjects.CommonElements;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class EARLYSETTLEMENT_OBJ
{
	WebDriver driver;

 

	public EARLYSETTLEMENT_OBJ(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//*[@id=\"_selenuimT016\"]/h3")	
	private WebElement EARLYSETTLEMENT;
	public WebElement EARLYSETTLEMENT() 
	{
		return EARLYSETTLEMENT;
	}

	@FindBy(xpath= "//*[@id=\"_selenuimT016BEP\"]/li")	
	private WebElement BATCHEARLYSETTLEMENT;
	public WebElement BATCHEARLYSETTLEMENT() 
	{
		return BATCHEARLYSETTLEMENT;
	}

	@FindBy(xpath= "//*[@id=\"T016BEPC\"]")	
	private WebElement CREATE;
	public WebElement CREATE() 
	{
		return CREATE;
	}
}
	
	


