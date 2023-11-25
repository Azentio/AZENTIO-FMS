package pageobjects.fms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AT_FM_001FACILITYMANAGMENT {
	WebDriver driver;

	public AT_FM_001FACILITYMANAGMENT(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"_selenuim333T008\"]/li/a")
	private WebElement FacilityManagment;

	public WebElement FacilityManagment() {
		return FacilityManagment;
	}
	@FindBy(xpath = "//*[@id=\"333T008UP\"]")
	private WebElement UpdateApprove;

	public WebElement UpdateApprove() {
		return UpdateApprove;
	}
	@FindBy(xpath = "//*[@id=\"facilityManagementGridTbl_Id_333T008UP_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement clearicon;

	public WebElement clearicon() {
		return clearicon;
	}
	@FindBy(xpath = "//*[@id=\"td_facilityManagementGridTbl_Id_333T008UP_1_fmsFacilityVO.CODE\"]")
	private WebElement retrivedata;

	public WebElement retrivedata() {
		return retrivedata;
	}
	@FindBy(xpath = "(//li[@class='path-added-tab ui-state-default ui-corner-top'])[2]")
	private WebElement additionaldetail;
    public WebElement additionaldetail() {

	return additionaldetail;

	}
    @FindBy(xpath = "//*[@id=\"facilityMgtAddDetDateEffectiveFrom_333T008UP\"]")
	private WebElement effectivedate;
    public WebElement effectivedate() {

	return effectivedate;
   }
    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[6]/a")
	private WebElement effectivedateretrive;
    public WebElement effectivedateretrive() {

	return effectivedateretrive;
    }
    @FindBy(xpath = "//*[@id=\"facilitymanagement_save_btn_333T008UP\"]")
   	private WebElement savebutton;
       public WebElement savebutton() {

   	return savebutton;
       }
       @FindBy(xpath = "//*[@id=\"_popup_path_sol_confirm_ok\"]")
      	private WebElement okpopup;
          public WebElement okpopup() {

      	return okpopup;
          }
	  @FindBy(xpath = "//*[@id=\"_popup_path_sol_ok\"]")
		private WebElement oksuccessfullpopup;
	    public WebElement oksuccessfullpopup() {
	
		return oksuccessfullpopup;
	    }     
	    @FindBy(xpath = "//*[@id=\"333T008AP\"]")
		private WebElement approvescreen;
	    public WebElement approvescreen() {
	
		return approvescreen;
	    } 
	    @FindBy(xpath = "//*[@id=\"facilityManagement_approve_btn_333T008AP\"]")
		private WebElement approvebtn;
	    public WebElement approvebtn() {
	
		return approvebtn;
	    } 
	    
	    @FindBy(xpath = "//*[@id=\"facilityManagementGridTbl_Id_333T008AP_pager_left\"]/table/tbody/tr/td[7]")
		private WebElement clear;
	    public WebElement clear() {
	
		return clear;
	    } 
	    @FindBy(xpath = "//*[@id=\"td_facilityManagementGridTbl_Id_333T008AP_1_fmsFacilityVO.CODE\"]")
		private WebElement Retrivedata;
	    public WebElement Retrivedata() {
	
		return Retrivedata;
	    } 
	    @FindBy(xpath = "//*[@id=\"facilityManagement_approve_btn_333T008AP\"]")
		private WebElement confirmapprove;
	    public WebElement confirmapprove() {
	
		return confirmapprove;
	    } 
	    
	    @FindBy(xpath = "//*[@id=\"_popup_path_sol_ok\"]")
		private WebElement successfullpopup ;
	    public WebElement successfullpopup() {
	
		return successfullpopup;
	    } 
	    
}