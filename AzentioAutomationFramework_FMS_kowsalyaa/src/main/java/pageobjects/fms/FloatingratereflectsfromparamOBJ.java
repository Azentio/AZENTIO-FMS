package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FloatingratereflectsfromparamOBJ {
	WebDriver driver;
	
	public FloatingratereflectsfromparamOBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath="//td[text()='Parameters']")
//	private WebElement IIS_Parameter;
//    public WebElement iisparameter() {
//		return IIS_Parameter;
//	}
//    @FindBy(xpath="//span[text()='Maintenance']")
//	private WebElement Parameter_Maintenance;
//    public WebElement parametermaintenance() {
//		return Parameter_Maintenance;
//	}
//    @FindBy(xpath="//*[@id=\"infoBarSearchButton_M003MT\"]")
//   	private WebElement Parameter_Maintenance_Search1;
//       public WebElement parametermaintenancesearch1() {
//   		return Parameter_Maintenance_Search1;
//   	}
//    @FindBy(xpath="//*[@id=\"gview_iISProductClassListGridTbl_Id_M003MT\"]/div[2]/div/table/thead/tr[2]/th[2]/div")
//      	private WebElement Parameter_Maintenance_Search2;
//          public WebElement parametermaintenancesearch2() {
//      		return Parameter_Maintenance_Search2;
//      	}
//    @FindBy(xpath="//*[@id=\"iISProductClassListGridTbl_Id_M003MT\"]")
//        	private WebElement Aboveserachbox_Doubleclick;
//            public WebElement abovesearchboxdoubleclick() {
//        		return Aboveserachbox_Doubleclick;
//        	}
//    @FindBy(xpath="//*[@id=\"iisProductClassGeneralInformationProfitCalculation_M003MT\"]/a/span")
//        	private WebElement Profit_CalculationTab;
//            public WebElement profitcalculationtab() {
//        		return Profit_CalculationTab;
//        	}
//            @FindBy(xpath="//input[@id='iisProductClassFloatingRate_M003MT']")
//        	private WebElement Floatingrate_flagcheck;
//            public WebElement floatingrateflagcheck() {
//        		return Floatingrate_flagcheck;
//        	}
//            @FindBy(xpath="//*[@id=\"iisProductClassAdditionalInformation_M003MT\"]/a/span")
//        	private WebElement Additional_InformationTab;
//            public WebElement additionalinformationtab() {
//        		return Additional_InformationTab;
//        	}
//            @FindBy(xpath="//input[@id='iisProductClassDefaultRatePeriodicityFromFMS_M003MT']")
//        	private WebElement Defaultrate_PeriodicityFmsflagcheck;
//            public WebElement defaultrateperiodicityfmsflagcheck() {
//        		return Defaultrate_PeriodicityFmsflagcheck;
//        	}
//            @FindBy(xpath="//input[@id='iisProductClassDefaultMarginOfFMS_M003MT']")
//        	private WebElement Defaultmargin_Fmsflagcheck;
//            public WebElement defaultmarginfmsflagcheck() {
//        		return Defaultmargin_Fmsflagcheck;
//        	}
//            @FindBy(xpath="//*[@id=\"iisProductClassAdditionalInformationLimit_M003MT\"]/a")
//        	private WebElement Additional_InformationTab_LimitTab ;
//            public WebElement additionalinformationtablimittab() {
//        		return Additional_InformationTab_LimitTab;
//        	}
//            @FindBy(xpath="//input[@id='iisProductClassAllowToEditFloatingRateInFMS_M003MT']")
//        	private WebElement Allowedit_Floatingrateflagcheck ;
//            public WebElement alloweditfloatingrateflagcheck() {
//        		return Allowedit_Floatingrateflagcheck;
//        	}
//            @FindBy(xpath="//*[@id=\"_selenuimM001\"]/li/a/table/tbody/tr/td[2]")
//        	private WebElement Floatingrate_Menubar ;
//            public WebElement floatingratemenubar() {
//        		return Floatingrate_Menubar;
//        	}
//            @FindBy(xpath="//*[@id=\"M001GMT\"]/span[2]")
//        	private WebElement Floatingrate_Globalmaintenance ;
//            public WebElement floatingrateglobalmaintenance() {
//        		return Floatingrate_Globalmaintenance;
//        	}
//            @FindBy(xpath="//*[@id=\"infoBarSearchButton_M001GMT\"]")
//        	private WebElement Globalmaintenance_Firstsearchbox ;
//            public WebElement globalmaintenancefirstsearchbox() {
//        		return Globalmaintenance_Firstsearchbox;
//        	}
//            @FindBy(xpath="//input[@id='floatingRateGlobalListGridTbl_Id_M001GMT_gs_IBOR_HDRVO.IBOR_CODE']")
//        	private WebElement Globalmaintenance_Secondsearchbox ;
//            public WebElement globalmaintenancesecondsearchbox() {
//        		return Globalmaintenance_Secondsearchbox;
//        	}
//            @FindBy(xpath="")
//        	private WebElement Secondsearchbox_DoubleTap ;
//            public WebElement secondsearchboxdoubletap() {
//        		return Secondsearchbox_DoubleTap;
//        	}
            @FindBy(xpath="(//td[text()='WIFAK APPLICATION'])[1]")
        	private WebElement FIRST_WIFAK_APPLICATION;
        	public WebElement firstwifakapplication() {
        		return FIRST_WIFAK_APPLICATION;
        	}
        	@FindBy(xpath="(//td[text()='WIFAK APPLICATION'])[2]")
        	private WebElement WIFAK_APPLICATION2;
        	public WebElement wifakapplication2() {
        		return WIFAK_APPLICATION2;
        	}
        	@FindBy(xpath="//td[text()='Application For Financial Facilities']")
        	private WebElement Applicationfor_financial_facilities;
        	public WebElement applicationforfinancialfacilities() {
        		return Applicationfor_financial_facilities;
        	}
        	@FindBy(xpath="//span[text()='Maintenance']")
        	private WebElement MaintenANce_Menu;
        	public WebElement maintenancemenu() {
        		return MaintenANce_Menu;
        	}
        	@FindBy(xpath="//select[@id='applicationFacilityApplicationfor_WIFT001MT']")
        	private WebElement Select_new_Facility;
        	public WebElement selectnewfacility() {
        		return Select_new_Facility;
        	}
        	@FindBy(xpath="//li[@id='applicationFacilityMainInfoTabs_WIFT001MT']/a/span[text()='Main Information']")
        	private WebElement Main_Information;
        	public WebElement maininformation() {
        		return Main_Information;
        	}
        	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilitycif_WIFT001MT']")
        	private WebElement CiF_NUm_seARCHbox;
        	public WebElement cifnumsearchbox() {
        		return CiF_NUm_seARCHbox;
        	}

        	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilityFacilityType_WIFT001MT']")
        	private WebElement FacilityTYPEDetails_Faciltiytype;
        	public WebElement facilitytypedetailsfacilitytype() {
        		return FacilityTYPEDetails_Faciltiytype;
        	}
        	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilityCountry_WIFT001MT']")
        	private WebElement FacilityTYPEDetails_COUNTRyoffinancing;
        	public WebElement facilitytypedetailscountryoffinancing() {
        		return FacilityTYPEDetails_COUNTRyoffinancing;
        	}
        	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilityRating_WIFT001MT']")
        	private WebElement FacilityTYPEDetails_facilityRating;
        	public WebElement facilitytypedetailsfacilityrating() {
        		return FacilityTYPEDetails_facilityRating;
        	}
        	
        	@FindBy(xpath = "//span[text()='Additional Details']")
        	private WebElement secondTAb_Additionaldetails;
        	public WebElement secondtabadditionaldetails() {
        		return secondTAb_Additionaldetails;
        	}
        	@FindBy(xpath="//input[@id='lookuptxt_applicationFacilitylimitcurrency_WIFT001MT']")
        	private WebElement Additionaldetails_Currencycode ;
        	public WebElement additionaldetailscurrencycode() {
        		return Additionaldetails_Currencycode;
        	}
        	@FindBy(xpath="//input[@id='applicationFacilitytotalvalue_WIFT001MT']")
        	private WebElement Additionaldetails_Totalvalue ;
        	public WebElement additionaldetailstotalvalue() {
        		return Additionaldetails_Totalvalue;
        	}
        	@FindBy(xpath="//label[@id='applicationfacilityFormId_WIFT001MT_total_value_key']")
        	private WebElement Additionaldetails_Totalvalue_Touch ;
        	public WebElement additionaldetailstotalvaluetouch() {
        		return Additionaldetails_Totalvalue_Touch;
        	}
//        	
//        	@FindBy(xpath = "//*[@id=\"applicationFacilityDateDetailssection_WIFT001MT\"]/table/tbody/tr[3]/td[2]/div/img")
//        	private WebElement Additionaldetails_expirecalender;
//        	public WebElement additionalTabExpireCalender() {
//        		return Additionaldetails_expirecalender;
//        	}
//        	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[4]")
//        	private WebElement Additionaldetails_expireDate;
//        	public WebElement additionalTabExpireDate() {
//        		return Additionaldetails_expireDate;
//        	}
        	@FindBy(xpath = "//*[@id=\"applicationFacilityLimitDetailsTabs_WIFT001MT\"]")
        	private WebElement Limitdetails_Tab;
        	public WebElement limitdetailstab() {
        		return Limitdetails_Tab;
        	}
        	@FindBy(xpath = "//*[@id=\"add_ApplicationFacilityLimitDetailsGrid_WIFT001MT\"]/div/span")
        	private WebElement LimitdetailsTab_Addbutton;
        	public WebElement limitdetailstabaddbutton() {
        		return LimitdetailsTab_Addbutton;
        	}
        	@FindBy(xpath = "//input[@id='lookuptxt_applicationfacilityLimitDetailsCLASS_WIFT001MT']")
        	private WebElement Productclass_Searchbox;
        	public WebElement productclasssearchbox() {
        		return Productclass_Searchbox;
        	}
        	@FindBy(xpath = "//*[@id='lookuptxt_applicationfacilityLimitDetailsFLOATING_RATE_WIFT001MT']")
        	private WebElement Floating_rate_Searchbox;
        	public WebElement floatingRateSearchbox() {
        		return Floating_rate_Searchbox;
        	}
        	
        	@FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_NBR_WIFT001MT']")
        	private WebElement Floatingrate_Periodicity_Searchbox;
        	public WebElement floatingrateperiodicitysearchbox() {
        		return Floatingrate_Periodicity_Searchbox;
        	}
        	@FindBy(xpath ="//select[@id='applicationfacilityLimitDetailsFLOAT_RATE_PERIODICITY_TYPE_WIFT001MT']")
        	private WebElement Floatingrate_PeriodicityType_Searchbox;
        	public WebElement floatingrateperiodicitytypesearchbox() {
        		return Floatingrate_PeriodicityType_Searchbox;
        	}
        	
   	
   	
   	
   	
	
	

}
