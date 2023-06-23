package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestforfinancingOBJ {
	WebDriver driver;
	
	public RequestforfinancingOBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//td[text()='REQUEST FOR FINANCIN']")
	private WebElement REQUEST_FOR_FINANCIN;
    public WebElement REQUESTFORFINANCIN() {
		return REQUEST_FOR_FINANCIN;
	}
	@FindBy(xpath="//td[text()='Request For Financing']")
	private WebElement Request_For_Financing;
    public WebElement RequestForFinancing() {
		return Request_For_Financing;
	}
    @FindBy(xpath="//span[text()='Maintenance']")
	private WebElement RequestForFinancing_Maintenance;
    public WebElement requestforfinancingmaintenance() {
		return RequestForFinancing_Maintenance;
	}
   
    
    @FindBy(xpath="//select[@id='requestFinancingApplicationFor_CSMRF00MT']")
	private WebElement Reason_For_Submission;
    public WebElement reasonforsubmisson() {
		return Reason_For_Submission;
	}
    @FindBy(xpath="(//input[@class='path-theme-cust-input liveSearchText liveSearchCompSize ui-state-focus liveSearchInputCorner'])[5]")
	private WebElement Customer_Search_box;
    public WebElement customersearchbox() {
		return Customer_Search_box;
	}
//    @FindBy(xpath="//label[@id='requestFinancingCustomer_CSMRF00MT']")
//	private WebElement CUSTOMER;
//    public WebElement customer() {
//		return CUSTOMER;
//	}
    @FindBy(xpath="//span[text()='Facility Type Details']")
	private WebElement Facility_Type_details;
    public WebElement facilitytypedetails() {
		return Facility_Type_details;
	}
    @FindBy(xpath="//input[@id='lookuptxt_requestFinancingFacilityType_CSMRF00MT']")
	private WebElement Facility_Type_details_searchbox;
    public WebElement facilitytypedetailssearchbox() {
		return Facility_Type_details_searchbox;
	}
//    @FindBy(xpath="//*[@id=\"rerquestFinancingMainLimitTabsContent_CSMRF00MT\"]/div/table[1]/tbody/tr/td[1]/fieldset")
//	private WebElement FacIltytype_touch;
//    public WebElement facilitytypetouch() {
//		return FacIltytype_touch;
//	}
    @FindBy(xpath="//input[@id='requestFinancingFacilityTotalvalue_CSMRF00MT']")
	private WebElement ToTal_Limit_Search_box;
    public WebElement totallimitsearchbox() {
		return ToTal_Limit_Search_box;
	}
//    @FindBy(xpath="//label[@id='requestFinancingFormId_CSMRF00MT_Total_Limit_Key']")
//	private WebElement ToTal_Limit;
//    public WebElement totallimit() {
//		return ToTal_Limit;
//	}

	
//	  @FindBy(xpath="//label[@id='requestFinancingFormId_CSMRF00MT_save_key']")
//	  private WebElement LIMIT_Savebutton; 
//	  public WebElement limitsavebutton() {
//		  return LIMIT_Savebutton; 
//		  }
//	  
//	  @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']") 
//	  private WebElement confirm_save_button; 
//	  public WebElement confirmsavebutton() {
//	   return confirm_save_button; }
//	  
//	  @FindBy(xpath="//input[@id='_popup_path_sol_ok']") 
//	  private WebElement Record_saved_successfully; 
//	  public WebElement recordsavedsuccessfully() {
//		  return Record_saved_successfully;
//	  }
	 
    @FindBy(xpath="//li[@id='requestFinancingLimitDtlsTabs_CSMRF00MT']/a/span[text()='Disbursement/Sublimit']")
	private WebElement Disbursement_SUBlimit;
    public WebElement disbursementsublimit() {
		return Disbursement_SUBlimit;
	}
    @FindBy(xpath="//td[@id='add_RequestFinancingLimitDetailsGridId_CSMRF00MT']/div/span")
	private WebElement Disbursement_SUBlimit_aDD_Button;
    public WebElement disbursementsublimitaddbutton() {
		return Disbursement_SUBlimit_aDD_Button;
	}
    @FindBy(xpath="//input[@id=\'lookuptxt_requestFinancingLimitDetailsGeneralFacilityProductClass_CSMRF00MT\']")
	private WebElement Product_class_searchbox;
    public WebElement productclasssearchbox() {
		return Product_class_searchbox;
	}
    @FindBy(xpath="//label[@id='requestfinancingLimitPopupFormId_CSMRF00MT_Product_Class_Key']")
	private WebElement Product_class;
    public WebElement productclass() {
		return Product_class;
	}
    @FindBy(id="//input[@id='requestFinancingLimitDetailsFacilityRiskRatingScore_CSMRF00MT']")
	private WebElement Facility_Risk_Rating;
    public WebElement facilityriskrating() {
		return Facility_Risk_Rating;
	}
    @FindBy(id="//input[@id='requestFinancingLimitDetailsFacilityRiskRatingValueDate_CSMRF00MT']")
	private WebElement FRR_Value_Date;
    public WebElement frrvaluedate() {
		return FRR_Value_Date;
	}
    @FindBy(id="requestFinancingLimitDetailsRfNewMargin_CSMRF00MT")
	private WebElement MaRgin_search_box;
    public WebElement marginsearchbox() {
		return MaRgin_search_box;
	}
//    @FindBy(xpath="(//label[@id='requestfinancingLimitPopupFormId_CSMRF00MT_MarignRate_key'])[1]")
//	private WebElement MaRgin;
//    public WebElement margin() {
//		return MaRgin;
//	}
//    @FindBy(xpath="//input[@id=\'requestFinancingLimitDetailsPeriodicityNbr_CSMRF00MT\']")
//	private WebElement TeNURe;
//    public WebElement tenure() {
//		return TeNURe;
//	}
    @FindBy(xpath="//button[@id=\'limitDetails_add_btn_CSMRF00MT\']")
	private WebElement ADD_Button;
    public WebElement finaladdbutton() {
		return ADD_Button;
	}
    @FindBy(xpath="//label[@id=\'requestFinancingFormId_CSMRF00MT_save_key\']")
	private WebElement Save_Button;
    public WebElement savebutton() {
		return Save_Button;
	}
    @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
   	private WebElement Confirmsave_popup_okbutton;
       public WebElement confirmsavepopupokbutton() {
   		return Confirmsave_popup_okbutton;
   	}
    @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
    private WebElement Confirmsave_Successfully_popup;
    public WebElement confirmsavesuccessfullypopup() {
      return Confirmsave_Successfully_popup;
    }
    @FindBy(xpath="//label[@id='requestFinancingFormId_CSMRF00MT_Validate_key']")
    private WebElement Validate_button;
    public WebElement validatebutton() {
      return Validate_button;
    }
    @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
    private WebElement Confirmvalidate_popup_okbutton;
    public WebElement confirmvalidatepopupokbutton() {
      return Confirmvalidate_popup_okbutton;
    }
    @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
    private WebElement FacilityAlready_create_sameDetails;
    public WebElement facilityalreadycreatesamedetails() {
      return FacilityAlready_create_sameDetails;
    }
    @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
    private WebElement Validate_Successfully_popup;
    public WebElement validatesuccessfullypopup() {
      return Validate_Successfully_popup;
    }
    @FindBy(xpath="//span[text()='Approve Level 1']")
    private WebElement Approve_level1;
    public WebElement approvelevel1() {
      return Approve_level1;
    }
    @FindBy(xpath="//input[@id='requestFinancingGridTbl_Id_CSMRF00P1_gs_fmsRequestFinancingVO.CODE']")
    private WebElement Approve_level1_Retrivedata_Searchbox;
    public WebElement approvelevel1retrivedatasearchbox() {
      return Approve_level1_Retrivedata_Searchbox;
    }

	/*
	 * @FindBy(xpath="(//span[@class='ui-icon ui-icon-refresh'])[3]") private
	 * WebElement Clear_beforesymbol; public WebElement clearbeforesymbol() { return
	 * Clear_beforesymbol; }
	 */
	/*
	 * @FindBy(xpath="(//tr[@id='1'])[7]") private WebElement
	 * EXIsting_value_doubletap; public WebElement existingvaluedoubletap() { return
	 * EXIsting_value_doubletap; }
	 */
    @FindBy(xpath="//td[@id='td_requestFinancingGridTbl_Id_CSMRF00P1_1_fmsRequestFinancingVO.CODE']")
    private WebElement Approve_level1_searchcode_doubletap;
    public WebElement approvelevel1searchcodedoubletap() {
      return Approve_level1_searchcode_doubletap;
    }
    @FindBy(xpath="(//span[text()='Customer Grading & Recommendations'])[3]")
    private WebElement customer_Grading_RECOmmendation;
    public WebElement customergradingrecommendation() {
      return customer_Grading_RECOmmendation;
    }
    @FindBy(xpath="//select[@id='requestDecisionForward_1_CSMRF00P1']")
    private WebElement DecisioN_SelectForward;
    public WebElement decisionselectforward() {
      return DecisioN_SelectForward;
    }
    @FindBy(xpath="//select[@id='requestDecisionForwardP1_CSMRF00P1']")
    private WebElement Select_Approval_Committee;
    public WebElement selectapprovalcommittee() {
      return Select_Approval_Committee;
    }
    
    @FindBy(xpath="//select[@id='requestP1approvalCommitte_CSMRF00P1']")
    private WebElement Approval_Committee_Investment_committee ;
    public WebElement approvalcommitteeinvestmentcommittee() {
      return Approval_Committee_Investment_committee;
    }
    @FindBy(xpath="//label[@id='requestFinancingFormId_CSMRF00P1_approve_key']")
    private WebElement Approve_button ;
    public WebElement approvebutton() {
      return Approve_button;
    }
    
    @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
    private WebElement ConfirmApprove_PRocess_okpopup;
    public WebElement confirmapproveprocessokpopup() {
      return ConfirmApprove_PRocess_okpopup;
    }
    @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
    private WebElement Approved_successfully_popup;
    public WebElement approvedsuccessfullypopup() {
      return Approved_successfully_popup;
    }
    @FindBy(xpath="//span[text()='Approval Committee Recommendations ']")
    private WebElement Approval_Committee_Recommendation;
    public WebElement approvalcommitteerecommendation() {
      return Approval_Committee_Recommendation;
    }
    @FindBy(xpath="(//input[@name='fmsRequestFinancingVO.CODE'])[3]")
    private WebElement Approval_Committee_Recommendation_searchbox;
    public WebElement approvalcommitteerecommendationretrivedatasearchbox() {
      return Approval_Committee_Recommendation_searchbox;
    }
	/*
	 * @FindBy(xpath="(//span[@class='ui-icon ui-icon-refresh'])[2]") private
	 * WebElement clEAR_before_symbol1; public WebElement clearbeforesymbol1() {
	 * return clEAR_before_symbol1; }
	 */
	/*
	 * @FindBy(xpath="(//tr[@id='1'])[2]") private WebElement
	 * EXisting_Record_DOUBletap; public WebElement existingrecorddoubletap() {
	 * return EXisting_Record_DOUBletap; }
	 */
    @FindBy(xpath="//td[@id='td_requestFinancingGridTbl_Id_CSMRF00AC_1_fmsRequestFinancingVO.CODE']")
    private WebElement Approval_Committee_Recommendation_searchbox_Doubletap;
    public WebElement approvalcommitteerecommendationretrivedatasearchboxdoubletap() {
      return Approval_Committee_Recommendation_searchbox_Doubletap;
    }
    @FindBy(xpath="(//span[text()='Credit Committee Recommendations'])[2]")
    private WebElement Credit_committee_recommendation;
    public WebElement creditcommitterecommendation() {
      return Credit_committee_recommendation;
    }
    @FindBy(xpath="//div[@id='requestFinancingCreditReviewRecommandations_CSMRF00AC']/div/span[text()='Recommendations']")
    private WebElement Recommendations;
    public WebElement recommendations() {
      return Recommendations;
    }
    @FindBy(xpath="//span[@class='ui-icon ui-icon-circlesmall-plus tree-wrap-ltr']")
    private WebElement Recommendation_Add_button;
    public WebElement recommendationaddbutton() {
      return Recommendation_Add_button;
    }
    @FindBy(xpath="(//tr[@id='1'])[6]")
    private WebElement Recommendation_Add_button_name_doubletap;
    public WebElement recommendationaddbuttonnamedoubletap() {
      return Recommendation_Add_button_name_doubletap;
    }
    @FindBy(xpath="(//select[@class='editable'])[1]")
    private WebElement Recommendation_Send_back;
    public WebElement recommendationsendback() {
      return Recommendation_Send_back;
    }
    @FindBy(xpath="(//select[@class='editable'])[2]")
    private WebElement Sendbacklevel_Maintenancelevel;
    public WebElement sendbacklevelmaintenancelevel() {
      return Sendbacklevel_Maintenancelevel;
    }
    @FindBy(xpath="//label[@id='requestFinancingFormId_CSMRF00AC_Recommendation_key']")
    private WebElement Approve_Recommendation;
    public WebElement approverecommendation() {
      return Approve_Recommendation;
    }
    
    @FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
    private WebElement Confirm_recommendation_popup;
    public WebElement confirmrecommendationpopup() {
      return Confirm_recommendation_popup;
    }
    @FindBy(xpath="//input[@id='_popup_path_sol_ok']")
    private WebElement Confirm_recommendation_popup_successfully;
    public WebElement confirmrecommendationpopupsuccessfully() {
      return Confirm_recommendation_popup_successfully;
    }
    //@FindBy(xpath="//input[@id='_popup_path_sol_confirm_ok']")
   // private WebElement Refresh_page;
   // public WebElement refreshpage() {
    //  return Refresh_page;
   // }
//    @FindBy(xpath="//span[text()='Maintenance']")
//	private WebElement Maintenance;
//    public WebElement maintenance() {
//		return Maintenance;
//	}
    @FindBy(xpath="//a[@id='infoBarSearchButton_CSMRF00MT']")
    private WebElement Requestforfinancing_Maintenance_Searchbox;
    public WebElement requestforfinancingmaintenancesearchbox() {
      return Requestforfinancing_Maintenance_Searchbox;
    }
    @FindBy(xpath="(//input[@name='fmsRequestFinancingVO.CODE'])[1]")
    private WebElement Maintenance_COde_Searchbox;
    public WebElement maintenancecodesearchbox() {
      return Maintenance_COde_Searchbox;
    }
    @FindBy(xpath="(//tr[@id='1'])[1]")
    private WebElement Maintenance_Codevalue_Doubletap;
    public WebElement maintenancecodevaluedoubletap() {
      return Maintenance_Codevalue_Doubletap;
    }
    
    
    
    
    
    
    
    
 






    
    
    
    
    
    
  
  


















}
