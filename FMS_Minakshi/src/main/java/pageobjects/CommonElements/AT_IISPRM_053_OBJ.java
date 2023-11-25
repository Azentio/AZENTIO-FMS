
	package pageobjects.CommonElements;
	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	 

	public class AT_IISPRM_053_OBJ
	{
		WebDriver driver;
		public AT_IISPRM_053_OBJ(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath= "//*[@id=\"_selenuimM00\"]/h3/table/tbody/tr/td[2]")	
		private WebElement Parameters;
		public WebElement Parameters() 
		{
			return Parameters;
		}
		
		@FindBy(xpath= "//*[@id=\"_selenuimM0123\"]/li/a")	
		private WebElement Itemtabunderparameters;
		public WebElement Itemtabunderparameters() 
		{
			return Itemtabunderparameters;
		}
		
		
		@FindBy(xpath= "//*[@id=\"_selenuimM031\"]/li/a/table/tbody/tr/td[2]")	
		private WebElement ItemProperly ;
		public WebElement ItemProperly() 
		{
			return ItemProperly ;
		}
		@FindBy(xpath= "//*[@id=\"M031MT\"]")	
		private WebElement  MaintananceunderItemProperty;
		public WebElement MaintananceunderItemProperty() 
		{
			return MaintananceunderItemProperty;
		}
		
		@FindBy(xpath= "//*[@id=\"M031L\"]")	
		private WebElement ListunderItemProperty;
		public WebElement ListunderItemProperty() 
		{
			return  ListunderItemProperty;
		}
		
		@FindBy(xpath= "//*[@id=\"M031P\"]")	
		private WebElement ApproveunderItemProperty;
		public WebElement ApproveunderItemProperty() 
		{
			return  ApproveunderItemProperty;
		}
		
		
		@FindBy(xpath= "//*[@id=\"M031P\"]")	
		private WebElement UpdateAfterApproveunderitemproperty;
		public WebElement UpdateAfterApproveunderitemproperty() 
		{
			return  UpdateAfterApproveunderitemproperty;
		}
		
		
		@FindBy(xpath= "//*[@id=\"M031N\"]")	
		private WebElement RejectunderItemProperty;
		public WebElement RejectunderItemProperty() 
		{
			return  RejectunderItemProperty;
		}
		
		@FindBy(xpath= "//*[@id=\"property_code_M031MT\"]")	
		private WebElement  CodeTab;
		public WebElement CodeTab() 
		{
			return CodeTab;
		}
		@FindBy(xpath= "//*[@id=\"brief_desc_eng_M031MT\"]")	
		private WebElement BriefDescription;
		public WebElement BriefDescription() 
		{
			return BriefDescription;
		}
		@FindBy(xpath= "(//input[@class='path-theme-cust-input textCompSize ui-state-focus ui-corner-all'])[3]")	
		private WebElement Longdescription;
		public WebElement Longdescription() 
		{
			return Longdescription;
		}
		@FindBy(xpath= "//*[@id=\"allow_duplicate_value_M031MT\"]")	
		private WebElement  Allowduplicatevalue;
		public WebElement Allowduplicatevalue() 
		{
			return Allowduplicatevalue;
		}
		
		
		/*@FindBy(xpath= "//*[@id=\"itemPropertyMaintTab2_M031MT\"]/a/span")	
		private WebElement AdditionalDeatil ;
		public WebElement AdditionalDeatil() 
		{
			return AdditionalDeatil;
			}
		
		
		@FindBy(xpath= "(//span[@class='ui-icon ui-icon-plus'])[2]")	
		private WebElement AddbuttonunderAdditioalDetail;
		public WebElement AddbuttonunderAdditioalDetail() 
		{
			return AddbuttonunderAdditioalDetail;
		}
		
		
		@FindBy(xpath= "(//tr[@class='ui-widget-content jqgrow ui-row-ltr ui-priority-secondary ui-state-highlight']/td/input)[2]")	
		private WebElement PropertyValueunderAdditionalDetail;
		public WebElement PropertyValueunderAdditionalDetail() 
		{
			return PropertyValueunderAdditionalDetail;
		}
		
		@FindBy(xpath= "(//tr[@class='ui-widget-content jqgrow ui-row-ltr ui-priority-secondary ui-state-highlight']/td/input)[3]")	
		private WebElement ErabicPropertyValueunderAdditionalDetail;
		public WebElement ErabicPropertyValueunderAdditionalDetail() 
		{
			return ErabicPropertyValueunderAdditionalDetail;
		}
		
		@FindBy(xpath= "//input[@class='path-dummy-cls']")	
		private WebElement DuplicateValueunderAdditionalDetail;
		public WebElement DuplicateValueunderAdditionalDetail() 
		{
			return DuplicateValueunderAdditionalDetail;
		}
		
		@FindBy(xpath= "//label[@class='path_btn_lbl_theme']")	
		private WebElement SavebuttonunderAdditionalDetail;
		public WebElement SavebuttonunderAdditionalDetail() 
		{
			return SavebuttonunderAdditionalDetail;
		}
		
		@FindBy(xpath= "//input[@id='_popup_path_sol_confirm_ok']")	
		private WebElement Okpopupaftersave;
		public WebElement Okpopupaftersave() 
		{
			return Okpopupaftersave;
		}
		
		@FindBy(xpath= "//input[@id='_popup_path_sol_ok']")	
		private WebElement successfullyokpopupaftersave;
		public WebElement successfullyokpopupaftersave() 
		{
			return successfullyokpopupaftersave;
		}*/
	
		@FindBy(xpath= "//*[@id=\"itemPropertyFormId_M031MT_Save_key\"]")	
		private WebElement SavebuttonunderAdditionalDetail;
		public WebElement SavebuttonunderAdditionalDetail() 
		{
			return SavebuttonunderAdditionalDetail;
		}
		
		@FindBy(xpath= "//*[@id=\"_popup_path_sol_confirm_ok\"]")	
		private WebElement Okpopupaftersave;
		public WebElement Okpopupaftersave() 
		{
			return Okpopupaftersave;
		}
		
		@FindBy(xpath= "//*[@id=\"_popup_path_sol_ok\"]")	
		private WebElement successfullyokpopupaftersave;
		public WebElement successfullyokpopupaftersave() 
		{
			return successfullyokpopupaftersave;
		}
		
		
		
		

		@FindBy(xpath= "//*[@id=\"infoBarSearchButton_M031MT\"]")	
		private WebElement SearchTabunderItemProperly ;
		public WebElement SearchTabunderItemProperly() 
		{
			return SearchTabunderItemProperly;
		}
		
		
		@FindBy(xpath= "//*[@id=\"itemPropertyListGridTbl_Id_M031MT_pager_left\"]/table/tbody/tr/td[7]")	
		private WebElement ClearSearch ;
		public WebElement ClearSearch() 
		{
			return ClearSearch;
		}
		
		
		
		
		@FindBy(xpath= "//input[@name=\"PROPERTY_CODE\"]")	
		private WebElement Propertycodeundersearchtab;
		public WebElement Propertycodeundersearchtab() 
		{
			return Propertycodeundersearchtab;
		}
			
		@FindBy(xpath= "//*[@id=\"td_itemPropertyListGridTbl_Id_M031MT_1_trs_ITEM_PROPERTYVO.PROPERTY_CODE\"]")	
		private WebElement RetriveData;
		public WebElement RetriveData() 
		{
			return RetriveData;
			}
		
		
		@FindBy(xpath= "//*[@id=\"itemPropertyListGridTbl_Id_M031MT_gs_trs_ITEM_PROPERTYVO.PROPERTY_CODE\"]")	
		private WebElement PROPERTY_CODE;
		public WebElement PROPERTY_CODE() 
		{
			return PROPERTY_CODE;
			}
		
		@FindBy(xpath= "//*[@id=\"itemPropertyListGridTbl_Id_M031MT_gs_trs_ITEM_PROPERTYVO.BRIEF_DESC_ENG\"]")	
		private WebElement BRIEF_DESC_ENG;
		public WebElement BRIEF_DESC_ENG() 
		{
			return BRIEF_DESC_ENG;
			}
		
		
		@FindBy(xpath= "//*[@id=\"itemPropertyListGridTbl_Id_M031MT_gs_trs_ITEM_PROPERTYVO.LONG_DESC_ENG\"]")	
		private WebElement LONG_DESC_ENG;
		public WebElement LONG_DESC_ENG() 
		{
			return LONG_DESC_ENG;
			}
		
		@FindBy(xpath= "//*[@id=\"td_itemPropertyListGridTbl_Id_M031MT_1_trs_ITEM_PROPERTYVO.PROPERTY_CODE\"]")	
		private WebElement selected;
		public WebElement selected() 
		{
			return selected;
			}
		
		@FindBy(xpath= "//label[@id='itemPropertyFormId_M031MT_Delete_key']")	
		private WebElement Deleteundermaininformation;
		public WebElement Deleteundermaininformation() 
		{
			return Deleteundermaininformation;
	
		}
			
		
		@FindBy(xpath= "//input[@id='_popup_path_sol_confirm_ok']")	
		private WebElement YesPopupAfterDelete;
		public WebElement YesPopupAfterDelete() 
		{
			return YesPopupAfterDelete;
	
		}
		
		
		
		@FindBy(xpath= "//input[@id='_popup_path_sol_ok']")	
		private WebElement okconfirmPopupAfterDelete;
		public WebElement okconfirmPopupAfterDelete() 
		{
			return okconfirmPopupAfterDelete;
	
		}
		
		@FindBy(xpath= "//*[@id=\"itemPropertyFormId_M031MT_Update_key\"]")	
		private WebElement updatebutton;
		public WebElement updatebutton() 
		{
			return updatebutton;
	
		}
		@FindBy(xpath= "//*[@id=\"_popup_path_sol_ok\"]")	
		private WebElement okconfirmPopupAfterupdate;
		public WebElement okconfirmPopupAfterupdate() 
		{
			return okconfirmPopupAfterupdate;
	
		}
		@FindBy(xpath= "//label[@class='path_btn_lbl_theme']")	
		private WebElement CloseScreen;
		public WebElement CloseScreen() 
		{
			return CloseScreen;
	
		}
		
		@FindBy(xpath= "//*[@id=\"search_itemPropertyListGridTbl_Id_M031MT\"]/div/span")	
		private WebElement SortSearch;
		public WebElement SortSearch() 
		{
			return SortSearch;
	
		}
		@FindBy(xpath= "//*[@id=\"fbox_itemPropertyListGridTbl_Id_M031MT\"]/table/tbody/tr[2]/th/input")	
		private WebElement Add;
		public WebElement Add() 
		{
			return Add;
	
		}
	
		@FindBy(xpath= "//*[@id=\"fbox_itemPropertyListGridTbl_Id_M031MT\"]/table/tbody/tr[3]/td[2]/select")	
		private WebElement SortOptions;
		public WebElement SortOptions() 
		{
			return SortOptions;
	
		}
		@FindBy(xpath= "//*[@id=\"jqg2\"]")	
		private WebElement SortingInput;
		public WebElement SortingInput() 
		{
			return SortingInput;
	
		}
		@FindBy(xpath= "(//span[@class='ui-icon ui-icon-search'])[2]")	
		private WebElement FindButton;
		public WebElement FindButton() 
		{
			return FindButton;
	
		}
		
		@FindBy(xpath= "//*[@id=\"next_itemPropertyListGridTbl_Id_M031MT_pager\"]/span")	
		private WebElement NextButton;
		public WebElement NextButton() 
		{
			return NextButton;
	
		}
		@FindBy(xpath= "//*[@id=\"last_itemPropertyListGridTbl_Id_M031MT_pager\"]/span")	
		private WebElement LastButton;
		public WebElement LastButton() 
		{
			return LastButton;
	
		}
		@FindBy(xpath= "//*[@id=\"prev_itemPropertyListGridTbl_Id_M031MT_pager\"]/span")	
		private WebElement PrevButton;
		public WebElement PrevButton() 
		{
			return PrevButton;
	
		}
		@FindBy(xpath= "//*[@id=\"first_itemPropertyListGridTbl_Id_M031MT_pager\"]/span")	
		private WebElement FirstButton;
		public WebElement FirstButton() 
		{
			return FirstButton;
	
		}
		
		@FindBy(xpath= "//*[@id=\"div__popup_path_sol_ok\"]/div[1]")	
		private WebElement ErrorPopup;
		public WebElement ErrorPopup() 
		{
			return ErrorPopup;
	
		}

		@FindBy(xpath= "//*[@id=\"_popup_path_sol_ok\"]")	
		private WebElement ok ;
		public WebElement ok() 
		{
			return ok;
	
		}
		
}
