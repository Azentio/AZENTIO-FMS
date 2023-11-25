package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 
public class AT_IISPRM_111_OBJ 
{
	WebDriver driver;

 

	public AT_IISPRM_111_OBJ(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath= "//td[text()='Parameters']")	
    private WebElement iisParam_Parameters;
	 public WebElement iisParam_Parameters(){
       return iisParam_Parameters;



	}

	 @FindBy(xpath= "//td[text()='Product Class']")	
    private WebElement iisParam_ProductClass;
  	 public WebElement iisParam_ProductClass(){
       return iisParam_ProductClass;
  	 }


	 @FindBy(xpath= "//span[text()='Maintenance']")	
    private WebElement iisParam_Maintenance;
    public WebElement iisParam_Maintenance(){
       return iisParam_Maintenance;
   }
	
	
    @FindBy(xpath= "//a[text()=' Search ']")	
    private WebElement iisParam_SearchBtn;
    public WebElement iisParam_SearchBtn() {
       return iisParam_SearchBtn;
    } 


    @FindBy(xpath= "//tr[@id='1']")	
    private WebElement iisParam_firstOptionUnderSearchBtn;
    public WebElement iisParam_firstOptionUnderSearchBtn() {
       return iisParam_firstOptionUnderSearchBtn;
    }
    @FindBy(xpath= "//span[text()='Profit Calculation']")	
    private WebElement iisparam_ProfitCalculation;
    public WebElement iisparam_ProfitCalculation(){
       return iisparam_ProfitCalculation;
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
	
	
	@FindBy(xpath= "//*[@id=\"lbl_iisProductClassMantDimPrftDistOnReschYN_M003MT\"]")	
	private WebElement Maintain_Diminishing_Profit_Dist_upon_Rescheduling;
	public WebElement MaintainDiminishingProfitDistuponRescheduling() 
	{
		return Maintain_Diminishing_Profit_Dist_upon_Rescheduling;
	}
	
	@FindBy(xpath= "//*[@id=\"lbl_iisProductClassRetinTrnfrdPrftOnReschYN_M003MT\"]")	
	private WebElement Retain_Transferred_Profit_Upon_Rescheduling;
	public WebElement RetainTransferredProfitUponRescheduling() 
	{
		return Retain_Transferred_Profit_Upon_Rescheduling;
	}
	
	
	@FindBy(xpath= "//*[@id=\"lbl_iisProductClassRecognizeProfitUpFront_M003MT\"]")	
	private WebElement Recognize_Profit_Up_Front;
	public WebElement RecognizeProfitUpFront() 
	{
		return Recognize_Profit_Up_Front;
	}
	
	
	@FindBy(xpath= "//*[@id=\"lbl_iisProductClassAccuralEntryAtRevaluation_M003MT\"]")	
	private WebElement Accural_Entry_At_Revaluation;
	public WebElement AccuralEntryAtRevaluation() 
	{
		return Accural_Entry_At_Revaluation;
	}
	
	@FindBy(xpath= "//*[@id=\"iisProductClassAccuralEntryAtRevaluation_M003MT\"]")	
	private WebElement Revaluation;
	public WebElement Revaluation() 
	{
		return Revaluation;
	}
	
	@FindBy(xpath= "//*[@id=\"iisProductClassAccuralEntryAtRevaluation_M003MT\"]//option[contains(text(),'Reversal')]")	
	private WebElement Reversal;
	public WebElement Reversal() 
	{
		return Reversal;
	}
	
	@FindBy(xpath= "//*[@id=\"iisProductClassAccuralEntryAtRevaluation_M003MT\"]//option[contains(text(),'Reverse & Rebook')]")	
	private WebElement ReverseRebook;

	public WebElement ReverseRebook() 
	{
		return ReverseRebook;

	}
	@FindBy(xpath= "//*[@id=\"iisProductClassAccuralEntryAtRevaluation_M003MT\"]//option[contains(text(),'Adjustment')]")	
	private WebElement Adjustment;
	public WebElement Adjustment() 
	{
		return Adjustment;
	}
	@FindBy(xpath= "//*[@id=\"iISProductClassListGridTbl_Id_M003MT_gs_trsctrlclassVO.CLASS\"]")	
	private WebElement productClassTexBox;
	public WebElement productClassTexBox() 
	{
		return productClassTexBox;
	}
	@FindBy(xpath= "//*[@id=\"td_iISProductClassListGridTbl_Id_M003MT_1_trsctrlclassVO.CLASS\"]")	
	private WebElement productClass0876;
	public WebElement productClass0876() 
	{
		return productClass0876;
	}
}


