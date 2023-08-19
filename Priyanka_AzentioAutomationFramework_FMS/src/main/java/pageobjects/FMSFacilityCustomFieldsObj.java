package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FMSFacilityCustomFieldsObj {


	WebDriver driver;

	public FMSFacilityCustomFieldsObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath="//td[contains(text(),'Parameters')]")
	private WebElement fmsPara_Parameters;

	public WebElement fmsPara_Parameters() {
		return fmsPara_Parameters;
	}
	

	@FindBy(xpath="//td[contains(text(),'Facility Custom Fields')]")
	private WebElement fmsPara_Parameters_FacilityCustomFields;

	public WebElement fmsPara_Parameters_FacilityCustomFields() {
		return fmsPara_Parameters_FacilityCustomFields;
	}
	@FindBy(xpath="//td[contains(text(),'Maintain Facility Custom Fields')]")
	private WebElement fmsPara_Parameters_MaintainFacilityCustomFields;

	public WebElement fmsPara_Parameters_MaintainFacilityCustomFields() {
		return fmsPara_Parameters_MaintainFacilityCustomFields;
	}
	
	@FindBy(xpath="//a[@id='P050FLMT']")
	private WebElement fmsPara_Parameters_Maintenance;

	public WebElement fmsPara_Parameters_Maintenance() {
		return fmsPara_Parameters_Maintenance;
	}

	
	
}
