package pageobjects.iisParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductClassObj {
	WebDriver driver;
	public ProductClassObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Parameter Tab
	@FindBy(xpath = "//td[normalize-space()='Parameters']")
	private WebElement iis_Parameter_tab ;
	public WebElement iisParametertab() {
		return iis_Parameter_tab ;
	}
	
    //product Class Module
	@FindBy(xpath = "//td[normalize-space()='Product Class']")
	private WebElement iis_Product_Class_Module ;
	public WebElement iisProductClassModule() {
		return iis_Product_Class_Module ;
	}
	
	//Maintenance screen
	@FindBy(xpath = "//span[normalize-space()='Maintenance']")
	private WebElement iis_Product_Class_Maintenance ;
	public WebElement iisProductClassMaintenance() {
		return iis_Product_Class_Maintenance ;
	}
	
	//iisProductClassAdditionalInformation_M003MT
	@FindBy(xpath = "//li[@id='iisProductClassAdditionalInformation_M003MT']")
	private WebElement iis_Product_Class_Additional_Information_M003MT;
	public WebElement iisProductClassAdditionalInformation_M003MT() {
		return iis_Product_Class_Additional_Information_M003MT ;
	}
	
	//iisProductClassAdditionalInformationRepaymentPlan_M003MT
	@FindBy(xpath = "//span[normalize-space()='Repayment Plan']")
	private WebElement iis_Product_Class_Additional_Information_Repayment_Plan_M003MT;
	public WebElement iisProductClassAdditionalInformationRepaymentPlan_M003MT() {
		return iis_Product_Class_Additional_Information_Repayment_Plan_M003MT ;
	}
	
	//iisproductclassCO.trsclassVO.GRACE_PERIOD_MAX_NBR
	@FindBy(xpath = "//input[@id='iisProductClassMaxGracePeriod_M003MT']")
	private WebElement iis_product_classCO_trsclassVO_GRACE_PERIOD_MAX_NBR;
	public WebElement iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_NBR() {
		return iis_product_classCO_trsclassVO_GRACE_PERIOD_MAX_NBR ;
    }

	//iis_product_classCO_trsclassVO_GRACE_PERIOD_MAX_TYPE
	@FindBy(xpath = "//select[@id='iisProductClassMaxGracePeriod2_M003MT']")
	private WebElement iis_product_classCO_trsclassVO_GRACE_PERIOD_MAX_TYPE;
	public WebElement iisproductclassCOtrsclassVOGRACE_PERIOD_MAX_TYPE() {
		return iis_product_classCO_trsclassVO_GRACE_PERIOD_MAX_TYPE ;
    }
	
}
