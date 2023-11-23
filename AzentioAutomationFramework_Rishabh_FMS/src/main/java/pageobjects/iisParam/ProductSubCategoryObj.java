package pageobjects.iisParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSubCategoryObj {
	WebDriver driver;

	public ProductSubCategoryObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[normalize-space()='Product Sub Category']")
	private WebElement Product_Sub_Category_Module;

	public WebElement ProductSubCategoryModule() {
		return Product_Sub_Category_Module;
	}

	@FindBy(xpath = "//a[@id='M032MT']//span[contains(text(),'Maintenance')]")
	private WebElement Product_Sub_Category_Module_Maintenance;

	public WebElement ProductSubCategoryModuleMaintenance() {
		return Product_Sub_Category_Module_Maintenance;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_CATEGORY_CODE_M032MT']")
	private WebElement product_Sub_Category_CO_trs_CATEGORYSUBVO_CATEGORY_CODE;

	public WebElement productSubCategoryCOtrsCATEGORYSUBVOCATEGORYCODE() {
		return product_Sub_Category_CO_trs_CATEGORYSUBVO_CATEGORY_CODE;
	}

	@FindBy(xpath = "//span[@class='ui-icon ui-icon-search live-search-ui']")
	private WebElement product_Sub_Category_CO_trs_CATEGORYSUBVO_CATEGORY_LOOKUP_BTN;

	public WebElement productSubCategoryCOtrsCATEGORYSUBVOCATEGORYLOOKUPBTN() {
		return product_Sub_Category_CO_trs_CATEGORYSUBVO_CATEGORY_LOOKUP_BTN;
	}

	@FindBy(xpath = "//input[@id='gridtab_CATEGORY_CODE_M032MT_gs_APP_NAME']")
	private WebElement gridtab_CATEGORY_CODE_M032MT_gs_APP_NAME;

	public WebElement gridtabCATEGORYCODEM032MTgsAPP_NAME() {
		return gridtab_CATEGORY_CODE_M032MT_gs_APP_NAME;
	}

	@FindBy(xpath = "//input[@id='gridtab_CATEGORY_CODE_M032MT_gs_CATEGORY_CODE']")
	private WebElement gridtab_CATEGORY_CODE_M032MT_gs_CATEGORY_CODE;

	public WebElement gridtabCATEGORYCODEM032MTgsCATEGORYCODE() {
		return gridtab_CATEGORY_CODE_M032MT_gs_CATEGORY_CODE;
	}

	@FindBy(xpath = "//td[@id='td_gridtab_CATEGORY_CODE_M032MT_1_APP_NAME']")
	private WebElement gridtab_CATEGORY_CODE_M032MT_Retrived_Rec;

	public WebElement gridtabCATEGORYCODEM032MTRetrivedRec() {
		return gridtab_CATEGORY_CODE_M032MT_Retrived_Rec;
	}

	@FindBy(xpath = "//input[@id='SUBCATEGORY_CODE_M032MT']")
	private WebElement SUBCATEGORY_CODE_M032MT;

	public WebElement SUBCATEGORYCODEM032MT() {
		return SUBCATEGORY_CODE_M032MT;
	}
	
	//input[@id='trscategorysub_brief_desc_eng_M032MT']

	@FindBy(xpath = "//input[@id='trscategorysub_brief_desc_eng_M032MT']")
	private WebElement trscategorysub_brief_desc_eng_M032MT;

	public WebElement trscategorysubbriefdescengM032MT() {
		return trscategorysub_brief_desc_eng_M032MT;
	}

	@FindBy(xpath = "//input[@id='trscategorysub_long_desc_eng_M032MT']")
	private WebElement trscategorysub_long_desc_eng_M032MT;

	public WebElement trscategorysublongdescengM032MT() {
		return trscategorysub_long_desc_eng_M032MT;
	}

	@FindBy(xpath = "//*[@id=\"div__popup_path_sol_ok\"]/div[1]")
	private WebElement Error_Popup;

	public WebElement ErrorPopup() {
		return Error_Popup;
	}

	@FindBy(xpath = "//*[@id=\"_popup_path_sol_ok\"]")
	private WebElement Error_Popup_OK_Btn;

	public WebElement ErrorPopupOKBtn() {
		return Error_Popup_OK_Btn;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_M032MT']")
	private WebElement info_Bar_Search_Button;

	public WebElement infoBarSearchButton() {
		return info_Bar_Search_Button;
	}

	@FindBy(xpath = "//input[@id='productSubCategoryListGridTbl_Id_M032MT_gs_trsCATEGORYSUBVO.APP_NAME']")
	private WebElement APP_NAME_Feild;

	public WebElement APPNAMEFeild() {
		return APP_NAME_Feild;
	}

	@FindBy(xpath = "//input[@id='productSubCategoryListGridTbl_Id_M032MT_gs_trsCATEGORYSUBVO.CATEGORY_CODE']")
	private WebElement CATEGORY_CODE_Feild;

	public WebElement CATEGORYCODEFeild() {
		return CATEGORY_CODE_Feild;
	}
	
	@FindBy(xpath = "//input[@id='productSubCategoryListGridTbl_Id_M032MT_gs_trsCATEGORYSUBVO.SUBCATEGORY_CODE']")
	private WebElement SUBCATEGORY_CODE_Feild;

	public WebElement SUBCATEGORYCODEFeild() {
		return SUBCATEGORY_CODE_Feild;
	}
	
	@FindBy(xpath = "//td[@id='td_productSubCategoryListGridTbl_Id_M032MT_1_trsCATEGORYSUBVO.APP_NAME']")
	private WebElement Searched_Record;

	public WebElement SearchedRecord() {
		return Searched_Record;
	}
	
	@FindBy(xpath = "//td[@id='td_productSubCategoryListGridTbl_Id_M032MT_1_trsCATEGORYSUBVO.CATEGORY_CODE']")
	private WebElement Searched_RecordCatCodeKey;

	public WebElement SearchedRecordCatCodeKey() {
		return Searched_RecordCatCodeKey;
	}
	
	@FindBy(xpath = "//td[@id='td_productSubCategoryListGridTbl_Id_M032MT_1_trsCATEGORYSUBVO.SUBCATEGORY_CODE']")
	private WebElement Searched_Record_Sub_Cat;

	public WebElement SearchedRecordSubCat() {
		return Searched_Record_Sub_Cat;
	}
	
	//tr[@id ='1']//td
	
	
	@FindBy(xpath = "	//tr[@id ='1']//td")
	private WebElement Searched_Record_Details;

	public WebElement SearchedRecordDetails() {
		return Searched_Record_Details;
	}
	

	@FindBy(xpath = "//label[@id='productSubCategoryMaintFormId_M032MT_update_key']")
	private WebElement Updated_Button;

	public WebElement UpdatedButton() {
		return Updated_Button;
	}
	
	//span[normalize-space()='Delete']
	@FindBy(xpath = "//span[normalize-space()='Delete']")
	private WebElement Delete_Button;

	public WebElement DeleteButton() {
		return Delete_Button;
	}
	
	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']")
	private WebElement iis_Error_Pop_up;

	public WebElement iisErrorPopup() {
		return iis_Error_Pop_up;
	}
	
	//input[@id='_popup_path_sol_ok']
	@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']")
	private WebElement iis_Error_Pop_Up_Ok_Btn;

	public WebElement iisErrorPopUpOkBtn() {
		return iis_Error_Pop_Up_Ok_Btn;
	}
	
	@FindBy(xpath = "//a[@id='addNewGridRec_M032MT']")
	private WebElement New_Buton;

	public WebElement NewButon() {
		return New_Buton;
	}
	
	@FindBy(xpath = "//a[@id='M032L']//span[contains(text(),'List')]")
	private WebElement Product_Sub_Category_list ;

	public WebElement  ProductSubCategory_List() {
		return Product_Sub_Category_list;
	}
	
	@FindBy(xpath = "//span[normalize-space()='Update After Approve']")
	private WebElement Product_Sub_Category_Update_After_Approve;

	public WebElement ProductSubCategory_Update_After_Approve() {
		return Product_Sub_Category_Update_After_Approve;
	}
	
	@FindBy(xpath = "//a[@id='M032N']//span[contains(text(),'Reject')]")
	private WebElement Product_Sub_Category_Reject;

	public WebElement ProductSubCategoryReject() {
		return Product_Sub_Category_Reject;
	}
	

	@FindBy(xpath = "//a[@id='M032P']//span[contains(text(),'Approve')]")
	private WebElement Product_Sub_Category_Approve;

	public WebElement ProductSubCategoryApprove() {
		return Product_Sub_Category_Approve;
	}
	
	
	@FindBy(xpath = "//*[@id=\"search_productSubCategoryListGridTbl_Id_M032MT\"]/div/span")
	private WebElement Product_Sub_Category_Sort_Icon_Button;

	public WebElement ProductSubCategorySortIconButton() {
		return Product_Sub_Category_Sort_Icon_Button;
	}
	
	@FindBy(xpath = "//*[@id=\"productSubCategoryListGridTbl_Id_M032MT_pager_left\"]/table/tbody/tr/td[7]")
	private WebElement Product_Sub_Category_Clear_Icon_Button;

	public WebElement ProductSubCategoryClearIconButton() {
		return Product_Sub_Category_Clear_Icon_Button;
	}
	
	@FindBy(xpath = "//td[@class='columns']//select")
	private WebElement Sorting_first_Coloum;

	public WebElement SortingfirstColoum() {
		return Sorting_first_Coloum;
	}
	
	@FindBy(xpath = "//select[@class='selectopts']")
	private WebElement Sorting_Second_Coloum;

	public WebElement Sorting_Secondary_Coloum() {
		return Sorting_Second_Coloum;
	}
	
	
	@FindBy(xpath = "//*[@id='jqg2']")
	private WebElement Sorting_Third_Coloum;

	public WebElement Sorting_Third_Coloum() {
		return Sorting_Third_Coloum;
	}
	
	@FindBy(xpath = "//*[@id='fbox_productSubCategoryListGridTbl_Id_M032MT_search']")
	private WebElement Sort_Find_Icon_Btn;

	public WebElement SortFindIconBtn() {
		return Sort_Find_Icon_Btn;
	}
	
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-seek-next']")
	private WebElement Product_Sub_Category_Next_Btn;

	public WebElement ProductSubCategoryNextBtn() {
		return Product_Sub_Category_Next_Btn;
	}
	
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-seek-end']")
	private WebElement Product_Sub_Category_Last_Btn;

	public WebElement ProductSubCategoryLastBtn() {
		return Product_Sub_Category_Last_Btn;
	}
	
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-seek-prev']")
	private WebElement Product_Sub_Category_Previous_Btn;

	public WebElement ProductSubCategoryPreviousBtn() {
		return Product_Sub_Category_Previous_Btn;
	}
	
	@FindBy(xpath = "//span[@class='ui-icon ui-icon-seek-first']")
	private WebElement Product_Sub_Category_First_Btn;

	public WebElement ProductSubCategoryFirstBtn() {
		return Product_Sub_Category_First_Btn;
	}

}