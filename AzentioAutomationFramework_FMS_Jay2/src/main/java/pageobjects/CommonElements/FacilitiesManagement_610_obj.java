package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacilitiesManagement_610_obj {

	WebDriver driver;

	public FacilitiesManagement_610_obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath =  "//input[@id='fmsFacilityType_enable_revolving_oneoff_P008UP']")
	private WebElement allowChangeRevolvingFlag_InMainDetails_610;
	public WebElement allowChangeRevolvingFlag_InMainDetails_610() {
		return allowChangeRevolvingFlag_InMainDetails_610;
	}
	
	@FindBy(xpath =  "//input[@id='fmsFacilityType_change_after_utilization_P008UP']")
	private WebElement changeAfterUtilizationFlag_InMainDetails_610;
	public WebElement changeAfterUtilizationFlag_InMainDetails_610() {
		return changeAfterUtilizationFlag_InMainDetails_610;
	}
	
	//---------------@834955_02
	
	@FindBy(xpath =  "//select[@id='applicationFacilityRevolvingOneoff_WIFT001MT']")
	private WebElement revolvingOneOff_InFacilityType_610;
	public WebElement revolvingOneOff_InFacilityType_610() {
		return revolvingOneOff_InFacilityType_610;
	}
	
	
}
