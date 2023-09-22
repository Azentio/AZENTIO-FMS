package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IIS_Parameter_Obj {

	WebDriver driver;
	public IIS_Parameter_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//555528
	@FindBy (xpath = "//td[text()='Promotion Type']")
	private WebElement Promotion_Type_Under_Parameters_In_IISparam;
	public WebElement Promotion_Type_Under_Parameters_In_IISparam_607() {
		return Promotion_Type_Under_Parameters_In_IISparam;
	}
	
	@FindBy (xpath = "//*[@id='M082MT']")
	private WebElement ClickMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	public WebElement ClickMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607() {
		return ClickMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	}
	
	@FindBy (xpath = "//*[@id='promotionTypeCode_M082MT']")
	private WebElement CodeFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	public WebElement CodeFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607() {
		return CodeFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	}
	
	@FindBy (xpath = "//*[@id='promotionTypeBriefNameEnglish_M082MT']")
	private WebElement BriefDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	public WebElement BriefDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607() {
		return BriefDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	}
	
	@FindBy (xpath = "//*[@id='promotionTypeLongNameEnglish_M082MT']")
	private WebElement LongDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	public WebElement LongDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607() {
		return LongDescriptionFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	}
	 
	@FindBy (xpath = "//*[@id='lbl_promotionTypeBriefDescArab_M082MT']")
	private WebElement BriefDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	public WebElement BriefDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607() {
		return BriefDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	}
	
	@FindBy (xpath = "//*[@id='lbl_promotionTypeLongDescArab_M082MT']")
	private WebElement LongDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	public WebElement LongDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam_607() {
		return LongDescriptionInArabicFieldInMainteance_UnderPromotion_Type_Under_Parameters_In_IISparam;
	}
	
	@FindBy (xpath = "//span[text()='Additional Information']")
	private WebElement ClickAdditional_Information_In_Mainteance_UnderProductClass;
	public WebElement ClickAdditional_Information_In_Mainteance_UnderProductClass_607() {
		return ClickAdditional_Information_In_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//span[text()='Limit']")
	private WebElement ClicklimitInAdditional_Information_In_Mainteance_UnderProductClass;
	public WebElement ClicklimitInAdditional_Information_In_Mainteance_UnderProductClass_607() {
		return ClicklimitInAdditional_Information_In_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//*[@id='iisProductClassPromotionType_M003MT']")
	private WebElement 	Promotion_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass;
	public WebElement Promotion_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass_607() {
		return Promotion_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass;
	}
	
	@FindBy (xpath = "//*[@id='iisProductClassInsuranceType_M003MT']")
	private WebElement Insurance_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass;
	public WebElement Insurance_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass_607() {
		return Insurance_TypeFieldInlimitInAdditional_Information_In_Mainteance_UnderProductClass;
	}
	
	
	
	
	
	
	
}
