package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;

public class Draw_Down_Request_Obj {

	WebDriver driver;

	public Draw_Down_Request_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//@1039017
	@FindBy(xpath = "//*[@id='facilityManagmentVendorDownPaymentAmt_WIFT008MT']")
	private WebElement Check_Down_Payment_to_VendorPercentage_In_CIF_Details;
	public WebElement Check_Down_Payment_to_VendorPercentage_In_CIF_Details_607() {
		return Check_Down_Payment_to_VendorPercentage_In_CIF_Details;
	}
	
	@FindBy(xpath = "//*[@id='facilityManagmentVendorDownPaymentPerc_WIFT008MT']")
	private WebElement Check_Down_Payment_to_Vendor_In_CIF_Details;
	public WebElement Check_Down_Payment_to_Vendor_CIF_Details_607() {
		return Check_Down_Payment_to_Vendor_In_CIF_Details;
	}
	
	@FindBy(xpath = "//*[@id=\"facilityManagmentTotalDownPaymentAmt_WIFT008MT\"]")
	private WebElement Total_Down_Payment_In_CIF_Details;
	public WebElement Total_Down_Payment_In_CIF_Details_607() {
		return Total_Down_Payment_In_CIF_Details;
	}
	
	@FindBy(xpath = "//*[@id='facilityManagementTotalDownPaymentPerc_WIFT008MT']")
	private WebElement Check_Total_Down_PaymentPercentage_In_CIF_Details;
	public WebElement Check_Total_Down_PaymentPercentage_In_CIF_Details_607() {
		return Check_Total_Down_PaymentPercentage_In_CIF_Details;
	}
	
	@FindBy(xpath = "//span[text()='Facility Limit Details']")
	private WebElement Click_Facility_Limit_Details;
	public WebElement Click_Facility_Limit_Details_607() {
		return Click_Facility_Limit_Details;
	}
	
	@FindBy(xpath = "//*[@id='td_FacilityManagementFacilityLimitDetailsGrid_WIFT008MT_1_fmsFacilityDetVO.CLASS']")
	private WebElement DoubleClick_ProductClass_In_Facility_Limit_Details;
	public WebElement DoubleClick_ProductClass_In_Facility_Limit_Details_607() {
		return DoubleClick_ProductClass_In_Facility_Limit_Details;
	}
	
	@FindBy(xpath = "//*[@id='facilityMgtLimitDetailsVENDOR_DOWN_PAYMENT_PERC_WIFT008MT']")
	private WebElement Check_Down_Payment_to_VendorPercentage_In_limit_Details_facilityMng;
	public WebElement Check_Down_Payment_to_VendorPercentage_In_limit_Details_facilityMng_607() {
		return Check_Down_Payment_to_VendorPercentage_In_limit_Details_facilityMng;
	}
	
	@FindBy(xpath = "//*[@id='facilityMgtLimitDetailsVENDOR_DOWN_PAYMENT_AMT_WIFT008MT']")
	private WebElement Check_Down_Payment_to_Vendor_In_limit_Details_facilityMng;
	public WebElement Check_Down_Payment_to_Vendor_In_limit_Details_facilityMng_607() {
		return Check_Down_Payment_to_Vendor_In_limit_Details_facilityMng;
	}
	
	@FindBy(xpath = "//*[@id='facilityMgtLimitTotalDownPaymentPerc_WIFT008MT']")
	private WebElement Total_Down_PaymentPercentage_In_limit_Details_facilityMng;
	public WebElement Total_Down_PaymentPercentage_In_limit_Details_facilityMng_607() {
		return Total_Down_PaymentPercentage_In_limit_Details_facilityMng;
	}
	
	@FindBy(xpath = "//*[@id='facilityMgtLimitTotalDownPayment_WIFT008MT']")
	private WebElement Check_Total_Down_Payment_In_limit_Details_facilityMng;
	public WebElement Check_Total_Down_Payment_In_limit_Details_facilityMng_607() {
		return Check_Total_Down_Payment_In_limit_Details_facilityMng;
	}
	
	@FindBy(xpath = "//td[text()='Facilities Management']")
	private WebElement ClickfacilityManagement_under_RequestForFinancing;
	public WebElement ClickfacilityManagement_under_RequestForFinancing_607() {
		return ClickfacilityManagement_under_RequestForFinancing;
	}
	
	@FindBy(xpath = "//*[@id='CSMT008MT']")
	private WebElement ClickMainteance_under_RequestForFinancing;
	public WebElement ClickMainteance_under_RequestForFinancing_607() {
		return ClickMainteance_under_RequestForFinancing;
	}
	
	@FindBy(xpath = "//*[@id='infoBarSearchButton_CSMT008MT']")
	private WebElement Click_search_InMainteance_under_RequestForFinancing;
	public WebElement Click_search_InMainteance_under_RequestForFinancing_607() {
		return Click_search_InMainteance_under_RequestForFinancing;
	}
	
	@FindBy(xpath = "//*[@id='facilityManagementGridTbl_Id_CSMT008MT_pager_left']/table/tbody/tr/td[7]")
	private WebElement Click_Clearsearch_InMainteance_under_RequestForFinancing;
	public WebElement Click_Clearsearch_InMainteance_under_RequestForFinancing_607() {
		return Click_Clearsearch_InMainteance_under_RequestForFinancing;
	}
	
	@FindBy(xpath = "//*[@id='td_facilityManagementGridTbl_Id_CSMT008MT_1_fmsFacilityVO.CODE']")
	private WebElement SelectRecord_InMainteance_under_RequestForFinancing;
	public WebElement SelectRecord_InMainteance_under_RequestForFinancing_607() {
		return SelectRecord_InMainteance_under_RequestForFinancing;
	}
	
	@FindBy(xpath = "//*[@id='facilityManagmentVendorDownPaymentAmt_CSMT008MT']")
	private WebElement CheckDown_Payment_to_Vendor_InMainteance_under_RequestForFinancing;
	public WebElement CheckDown_Payment_to_Vendor_InMainteance_under_RequestForFinancing_607() {
		return CheckDown_Payment_to_Vendor_InMainteance_under_RequestForFinancing;
	}
	
	@FindBy(xpath = "//*[@id='facilityManagmentVendorDownPaymentPerc_CSMT008MT']")
	private WebElement CheckDown_Payment_to_VendorPercentage_InMainteance_under_RequestForFinancing;
	public WebElement CheckDown_Payment_to_VendorPercentage_InMainteance_under_RequestForFinancing_607() {
		return CheckDown_Payment_to_VendorPercentage_InMainteance_under_RequestForFinancing;
	}
	
	@FindBy(xpath = "//*[@id=\"facilityManagmentTotalDownPaymentAmt_CSMT008MT\"]")
	private WebElement CheckTotal_Down_Payment_InMainteance_under_RequestForFinancing;
	public WebElement CheckTotal_Down_Payment_InMainteance_under_RequestForFinancing_607() {
		return CheckTotal_Down_Payment_InMainteance_under_RequestForFinancing;
	}
	
	@FindBy(xpath = "//*[@id='facilityManagementTotalDownPaymentPerc_CSMT008MT']")
	private WebElement CheckTotal_Down_PaymentPercentage_InMainteance_under_RequestForFinancing;
	public WebElement CheckTotal_Down_PaymentPercentage_InMainteance_under_RequestForFinancing_607() {
		return CheckTotal_Down_PaymentPercentage_InMainteance_under_RequestForFinancing;
	}
	
	@FindBy(xpath = "//span[text()='Facility Limit Details']")
	private WebElement Click_facilitylimitDetailsTab_InMainteance_under_RequestForFinancing;
	public WebElement Click_facilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607() {
		return Click_facilitylimitDetailsTab_InMainteance_under_RequestForFinancing;
	}
	
	@FindBy(xpath = "//*[@id='td_FacilityManagementFacilityLimitDetailsGrid_CSMT008MT_0_rn']")
	private WebElement SelectRecord_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing;
	public WebElement SelectRecord_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607() {
		return SelectRecord_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing;
	}
	
	@FindBy(xpath = "//*[@id='facilityMgtLimitDetailsVENDOR_DOWN_PAYMENT_PERC_CSMT008MT']")
	private WebElement CheckDown_Payment_to_VendorPercentage_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing;
	public WebElement CheckDown_Payment_to_VendorPercentage_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607() {
		return CheckDown_Payment_to_VendorPercentage_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing;
	}
	
	@FindBy(xpath = "//*[@id='facilityMgtLimitDetailsVENDOR_DOWN_PAYMENT_AMT_CSMT008MT']")
	private WebElement CheckDown_Payment_to_Vendor_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing;
	public WebElement CheckDown_Payment_to_Vendor_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607() {
		return CheckDown_Payment_to_Vendor_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing;
	}
	
	@FindBy(xpath = "//*[@id='facilityMgtLimitTotalDownPaymentPerc_CSMT008MT']")
	private WebElement CheckTotal_Down_PaymentPercentage_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing;
	public WebElement CheckTotal_Down_PaymentPercentage_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607() {
		return CheckTotal_Down_PaymentPercentage_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing;
	}
	
	@FindBy(xpath = "//*[@id='facilityMgtLimitTotalDownPayment_CSMT008MT']")
	private WebElement CheckTotal_Down_Payment_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing;
	public WebElement CheckTotal_Down_Payment_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing_607() {
		return CheckTotal_Down_Payment_InfacilitylimitDetailsTab_InMainteance_under_RequestForFinancing;
	}
	
	
	
	
	//1039018
	
	@FindBy(xpath = "//*[@id='applicationfacilityLimitDetailsDOWN_PAYMENT_PERCENTAGE_WIFT001MT']")
	private WebElement Check_Down_Payment_percentage_in_LimitDetails_In_Application_For_Financial_Facilities;
	public WebElement Check_Down_Payment_percentage_in_LimitDetails_In_Application_For_Financial_Facilities_607() {
		return Check_Down_Payment_percentage_in_LimitDetails_In_Application_For_Financial_Facilities;
	}
	
	@FindBy(xpath = "//*[@id='applFacilityLimitDetailsTotalDownPayment_WIFT001MT']")
	private WebElement Check_Down_Payment_in_LimitDetails_In_Application_For_Financial_Facilities;
	public WebElement Check_Down_Payment_in_LimitDetails_In_Application_For_Financial_Facilities_607() {
		return Check_Down_Payment_percentage_in_LimitDetails_In_Application_For_Financial_Facilities;
	}
	
	@FindBy(xpath = "//*[@id='applicationFacilityLimitDetailsDownPaymentToVendorPerc_WIFT001MT']")
	private WebElement LimitDetails_Down_Payment_to_VendorPercentage;
	public WebElement LimitDetails_Down_Payment_to_VendorPercentage_607() {
		return LimitDetails_Down_Payment_to_VendorPercentage;
	}
	
	@FindBy(xpath = "//*[@id='applFacilityLimitDetailsDownPaymentToVendorAmt_WIFT001MT']")
	private WebElement LimitDetails_Down_Payment_to_Vendor;
	public WebElement LimitDetails_Down_Payment_to_Vendor_607() {
		return LimitDetails_Down_Payment_to_Vendor;
	}
	
	@FindBy(xpath = "//*[@id='applFacilityLimitDetailsTotalDownPaymentPerc_WIFT001MT']")
	private WebElement LimitDetails_Total_Down_PaymentPercentage;
	public WebElement LimitDetails_Total_Down_PaymentPercentage_607() {
		return LimitDetails_Total_Down_PaymentPercentage;
	}
	
	@FindBy(xpath = "//*[@id='applFacilityLimitDetailsTotalDownPayment_WIFT001MT']")
	private WebElement LimitDetails_Total_Down_Payment;
	public WebElement LimitDetails_Total_Down_Payment_607() {
		return LimitDetails_Total_Down_Payment;
	}
	
	@FindBy(xpath = "//*[@id='requestFinancingLimitDetailsDownPaymentPercentage_CSMRF00MT']")
	private WebElement DisbursementSub_LimitDetails_Down_Payment_Down_PaymentPercentage;
	public WebElement DisbursementSub_LimitDetails_Down_Payment_Down_PaymentPercentage_607() {
		return DisbursementSub_LimitDetails_Down_Payment_Down_PaymentPercentage;
	}
	
	@FindBy(xpath = "//*[@id='requestFinancingLimitDetailsDownPaymentAmount_CSMRF00MT']")
	private WebElement DisbursementSub_LimitDetails_Down_Payment_Down_PaymentAmmount;
	public WebElement DisbursementSub_LimitDetails_Down_Payment_Down_PaymentAmmount_607() {
		return DisbursementSub_LimitDetails_Down_Payment_Down_PaymentAmmount;
	}
	
	@FindBy(xpath = "//*[@id='requestFinanceLimitDetailsDownPaymentToVendorPerc_CSMRF00MT']")
	private WebElement DisbursementSub_LimitDetails_Down_Payment_to_VendorPercentage;
	public WebElement DisbursementSub_LimitDetails_Down_Payment_to_VendorPercentage_607() {
		return DisbursementSub_LimitDetails_Down_Payment_to_VendorPercentage;
	}
	
	@FindBy(xpath = "//*[@id='requestFinanceLimitDetailsDownPaymentToVendorAmt_CSMRF00MT']")
	private WebElement DisbursementSub_LimitDetails_Down_Payment_to_Vendor;
	public WebElement DisbursementSub_LimitDetails_Down_Payment_to_Vendor_607() {
		return DisbursementSub_LimitDetails_Down_Payment_to_Vendor;
	}
	
	@FindBy(xpath = "//*[@id='requestFinanceLimitDetailsTotalDownPaymentPerc_CSMRF00MT']")
	private WebElement DisbursementSub_LimitDetails_Total_Down_PaymentPercentage;
	public WebElement DisbursementSub_LimitDetails_Total_Down_PaymentPercentage_607() {
		return DisbursementSub_LimitDetails_Total_Down_PaymentPercentage;
	}
	
	@FindBy(xpath = "//*[@id='requestFinanceLimitDetailsTotalDownPayment_CSMRF00MT']")
	private WebElement DisbursementSub_LimitDetails_Total_Down_Payment;
	public WebElement DisbursementSub_LimitDetails_Total_Down_Payment_607() {
		return DisbursementSub_LimitDetails_Total_Down_Payment;
	}
	
	//@1105450
	
	@FindBy(xpath = "//td[text()='Link Template to Product Class/Facility Type']")
	private WebElement Click_Link_Template_to_Product_ClassFacility_Type_under_Parameters;
	public WebElement Click_Link_Template_to_Product_ClassFacility_Type_under_Parameters_607() {
		return Click_Link_Template_to_Product_ClassFacility_Type_under_Parameters;
	}
	
	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement Click_Maintenance_under_Link_Template_to_Product_ClassFacility_Type;
	public WebElement Click_Maintenance_under_Link_Template_to_Product_ClassFacility_Type_607() {
		return Click_Maintenance_under_Link_Template_to_Product_ClassFacility_Type;
	}
	
	@FindBy(xpath = "(//span[text()='Details_key'])[1]")
	private WebElement Click_DetailsKey_in_ProductClass;
	public WebElement Click_DetailsKey_in_ProductClass_607() {
		return Click_DetailsKey_in_ProductClass;
	}
	
	@FindBy(xpath = "//label[text()='Hamish Al Jiddiya /Down payment ']")
	private WebElement Check_title_OnDetailsKey_in_ProductClass;
	public WebElement Check_title_OnDetailsKey_in_ProductClass_607() {
		return Check_title_OnDetailsKey_in_ProductClass;
	}
	
	@FindBy(xpath = "//span[text()='OK']")
	private WebElement ClickOk_After_Check_title_OnDetailsKey_in_ProductClass;
	public WebElement ClickOk_After_Check_title_OnDetailsKey_in_ProductClass_607() {
		return ClickOk_After_Check_title_OnDetailsKey_in_ProductClass;
	}
	
	
	@FindBy(xpath = "//span[text()='Facility Type']")
	private WebElement ClickFacility_In_Maintenance_underLink_Template_to_Product_ClassFacility_Type;
	public WebElement ClickFacility_In_Maintenance_underLink_Template_to_Product_ClassFacility_Type_607() {
		return ClickFacility_In_Maintenance_underLink_Template_to_Product_ClassFacility_Type;
	}
	
	@FindBy(xpath = "//*[@id='td_LinkTemplateFacilityTypeGrid_P0038MT_1_fmsFacTypeTemplateVO.FACILITY_TYPE']//following::span[text()='Details_key'][1]")
	private WebElement Click_DetailsKey_in_FacilityType;
	public WebElement Click_DetailsKey_in_FacilityType_607() {
		return Click_DetailsKey_in_FacilityType;
	}
	
	@FindBy(xpath = "//label[text()='Hamish Al Jiddiya /Down payment ']")
	private WebElement Check_title_OnDetailsKey_in_FacilityType;
	public WebElement Check_title_OnDetailsKey_in_FacilityType_607() {
		return Check_title_OnDetailsKey_in_FacilityType;
	}
	
	
	//1039019_2
	
	@FindBy(xpath = "//td[text()='Facilities Management']")
	private WebElement Click_facilityManagement_UnderRequest_financing;
	public WebElement Click_facilityManagement_UnderRequest_financing_607() {
		return Click_facilityManagement_UnderRequest_financing;
	}
	
	@FindBy(xpath = "//*[@id='RFFT008MT']")
	private WebElement Click_mainteance_under_facilityManagement;
	public WebElement Click_mainteance_under_facilityManagement_607() {
		return Click_mainteance_under_facilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='infoBarSearchButton_RFFT008MT']")
	private WebElement ClickSearch_Inmainteance_under_facilityManagement;
	public WebElement ClickSearch_Inmainteance_under_facilityManagement_607() {
		return ClickSearch_Inmainteance_under_facilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='facilityManagementGridTbl_Id_RFFT008MT_gs_statusDesc']")
	private WebElement SearchSts_mainteance_under_facilityManagement;
	public WebElement SearchSts_mainteance_under_facilityManagement_607() {
		return SearchSts_mainteance_under_facilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='td_facilityManagementGridTbl_Id_RFFT008MT_1_fmsFacilityVO.CODE']")
	private WebElement SelectRecord_mainteance_under_facilityManagement;
	public WebElement SelectRecord_mainteance_under_facilityManagement_607() {
		return SelectRecord_mainteance_under_facilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='facilityMangementCode_RFFT008MT']")
	private WebElement getRecordCodeIn_mainteance_under_facilityManagement;
	public WebElement getRecordCodeIn_mainteance_under_facilityManagement_607() {
		return getRecordCodeIn_mainteance_under_facilityManagement;
	}
	
	@FindBy(xpath = "//td[text()='Draw Down Request']")
	private WebElement Click_Draw_Down_Request_under_facilityManagement;
	public WebElement Click_Draw_Down_Request_under_facilityManagement_607() {
		return Click_Draw_Down_Request_under_facilityManagement;
	}
	
	@FindBy(xpath = "//*[@id='RFFT009MT']")
	private WebElement Click_mainteance_under_Draw_Down_Request;
	public WebElement Click_mainteance_under_Draw_Down_Request_607() {
		return Click_mainteance_under_Draw_Down_Request;
	}
	
	@FindBy(xpath = "//*[@id='lookuptxt_drawDownRequestFacilityReference_RFFT009MT']")
	private WebElement EnterCodeIn_Facility_Reference_mainteance_under_Draw_Down_Request;
	public WebElement EnterCodeIn_Facility_Reference_mainteance_under_Draw_Down_Request_607() {
		return EnterCodeIn_Facility_Reference_mainteance_under_Draw_Down_Request;
	}
	
	@FindBy(xpath = "//*[@id='drawDownRequestAdditionDetailsTabs_RFFT009MT']")
	private WebElement Click_drawDownRequestAdditionDetails_TabsIn_mainteance_under_Draw_Down_Request;
	public WebElement Click_drawDownRequestAdditionDetails_TabsIn_mainteance_under_Draw_Down_Request_607() {
		return Click_drawDownRequestAdditionDetails_TabsIn_mainteance_under_Draw_Down_Request;
	}
	
	@FindBy(xpath = "//*[@id='drawDownRequestFormId_RFFT009MT_Down_Payment_Key']")
	private WebElement Check_Down_Payment_InAdditionDetails_TabsIn_mainteance_under_Draw_Down_Request;
	public WebElement Check_Down_Payment_InAdditionDetails_TabsIn_mainteance_under_Draw_Down_Request_607() {
		return Check_Down_Payment_InAdditionDetails_TabsIn_mainteance_under_Draw_Down_Request;
	}
	
	
	@FindBy(xpath = "//*[@id='drawDownRequestFormId_RFFT009MT_down_payment_to_vendor_key']")
	private WebElement Checkdown_payment_to_vendor_InAdditionDetails_TabsIn_mainteance_under_Draw_Down_Request;
	public WebElement Checkdown_payment_to_vendor_InAdditionDetails_TabsIn_mainteance_under_Draw_Down_Request_607() {
		return Checkdown_payment_to_vendor_InAdditionDetails_TabsIn_mainteance_under_Draw_Down_Request;
	}
	
	@FindBy(xpath = "//*[@id='lbl_drwadownRequestTotalDownPayment_RFFT009MT']")
	private WebElement Checkdown_TotalDownPayment_InAdditionDetails_TabsIn_mainteance_under_Draw_Down_Request;
	public WebElement Checkdown_TotalDownPayment_InAdditionDetails_TabsIn_mainteance_under_Draw_Down_Request_607() {
		return Checkdown_TotalDownPayment_InAdditionDetails_TabsIn_mainteance_under_Draw_Down_Request;
	}
	
	
	
	
	
	
	
}
