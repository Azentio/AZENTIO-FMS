package pageobjects.CommonElements;
	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	 

	public class AT_IISPRM_054_OBJ
	{
		WebDriver driver;
		public AT_IISPRM_054_OBJ(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		

		@FindBy(xpath= "//*[@id=\"_selenuimM00\"]/h3/table/tbody/tr/td[1]/span/span")	
		private WebElement Parameters;
		public WebElement Parameters() 
		{
			return Parameters;
		}
		
		
		@FindBy(xpath= "//*[@id=\"_selenuimM008\"]/li/a")	
		private WebElement ChargesTabunderParameter;
		public WebElement ChargesTabunderParameter() 
		{
			return  ChargesTabunderParameter;
		}
	
		@FindBy(xpath= "//*[@id=\"M08MT\"]")	
		private WebElement  MaintananceUnderCharge;
		public WebElement MaintananceUnderCharge() 
		{
			return MaintananceUnderCharge;
		}
		
	

		@FindBy(xpath= "//*[@id=\"M08L\"]")	
		private WebElement ListUnderCharge;
		public WebElement ListUnderCharge() 
		{
			return ListUnderCharge;
		}
		
		@FindBy(xpath= "//*[@id=\"M08P\"]")	
		private WebElement ApproveUnderCharge;
		public WebElement ApproveUnderCharge() 
		{
			return ApproveUnderCharge;
		}
		
		
		@FindBy(xpath= "(//input [@class='path-theme-cust-input textCompSize ui-state-focus ui-corner-all'])[1]")	
		private WebElement CodeTabunderMaintanancecharge;
		public WebElement CodeTabunderMaintanancecharge() 
		{
			return CodeTabunderMaintanancecharge;
		}
		@FindBy(xpath= "(//input [@class='path-theme-cust-input textCompSize ui-state-focus ui-corner-all'])[2]")	
		private WebElement BriefDescriptionunderMaintanancecharge;
		public WebElement BriefDescriptionunderMaintanancecharge() 
		{
			return BriefDescriptionunderMaintanancecharge;
		}
		@FindBy(xpath= "(//input [@class='path-theme-cust-input textCompSize ui-state-focus ui-corner-all'])[3]")	
		private WebElement LongDescriptionunderMaintanancecharge;
		public WebElement LongDescriptionunderMaintanancecharge() 
		{
			return LongDescriptionunderMaintanancecharge;
		}
		@FindBy(xpath= "//*[@id=\"infoBarSearchButton_M08MT\"]")	
		private WebElement SearchTabunderMaintanancecharge;
		public WebElement SearchTabunderMaintanancecharge() 
		{
			return SearchTabunderMaintanancecharge;
		}
		
		@FindBy(xpath= "//*[@id=\"trsChargesMaintFormId_M08MT_Save_key\"]")	
		private WebElement  savebutton;
		public WebElement savebutton() 
		{
			return savebutton;
		}
		@FindBy(xpath= "//*[@id=\"_popup_path_sol_confirm_ok\"]")	
		private WebElement  Okaftersave;
		public WebElement Okaftersave() 
		{
			return Okaftersave;
		}
		@FindBy(xpath= "//*[@id=\"_popup_path_sol_ok\"]")	
		private WebElement  successfulOkaftersave;
		public WebElement successfulOkaftersave() 
		{
			return successfulOkaftersave;
		}
		
		@FindBy(xpath= "//*[@id=\"trsChargesListGridTbl_Id_M08MT_gs_trsCHARGESVO.CODE\"]")	
		private WebElement searchcode;
		public WebElement searchcode() 
		{
			return searchcode;
		}
		
		
		@FindBy(xpath= "//span[@class='ui-icon ui-icon-close ui-icon-close-tabs-custom']")	
		private WebElement CloseTab;
		public WebElement CloseTab() 
		{
			return CloseTab;
		}
		@FindBy(xpath= "//label[text()='Delete ']/parent::span")	
		private WebElement Delete;
		public WebElement Delete() 
		{
			return Delete;
		}
		
		@FindBy(xpath= "//*[@id=\"_popup_path_sol_confirm_ok\"]")	
		private WebElement Deleteconfirm;
		public WebElement Deleteconfirm() 
		{
			return Deleteconfirm;
		}
		
		
		@FindBy(xpath= "//*[@id=\"_popup_path_sol_ok\"]")	
		private WebElement Deleteok;
		public WebElement Deleteok() 
		{
			return Deleteok;
		}

		@FindBy(xpath= "//div[@class='jMsgbox-titleWrap']")
		private WebElement errorpop;
		public WebElement errorpop() 
		{
			return errorpop;
		}
		
		@FindBy(xpath= "//input[@class='ui-button-text fg-button ui-button ui-corner-all ui-widget ui-state-default ui-button-text-only']")
		private WebElement ok;
		public WebElement ok() 
		{
			return ok;
		}
		
		
		@FindBy(xpath= "//*[@id=\"trsChargesListGridTbl_Id_M08MT_pager_left\"]/table/tbody/tr/td[7]")
		private WebElement Clear;
		public WebElement Clear() 
		{
			return Clear;
		}
		@FindBy(xpath= "//*[@id=\"search_trsChargesListGridTbl_Id_M08MT\"]/div/span")
		private WebElement shortsearch;
		public WebElement shortsearch() 
		{
			return shortsearch;
		}
		
		
		@FindBy(xpath= "(//span[@class='ui-icon ui-icon-seek-next'])[1]")
		private WebElement Next;
		public WebElement Next() 
		{
			return Next;
		}
		@FindBy(xpath= "(//span[@class='ui-icon ui-icon-seek-end'])[1]")
		private WebElement Last;
		public WebElement Last() 
		{
			return Last;
		}
		@FindBy(xpath= "(//span[@class='ui-icon ui-icon-seek-prev'])[1]")
		private WebElement Pre;
		public WebElement Pre() 
		{
			return Pre;
		}
		@FindBy(xpath= "(//span[@class='ui-icon ui-icon-seek-first'])[1]")
		private WebElement first;
		public WebElement first() 
		{
			return first;
		}
		
		@FindBy(xpath= "//*[@id=\"fbox_trsChargesListGridTbl_Id_M08MT_search\"]")
		private WebElement find;
		public WebElement find() 
		{
			return find;
		}
		@FindBy(xpath= "//*[@id=\"fbox_trsChargesListGridTbl_Id_M08MT\"]/table/tbody/tr[3]/td[2]/select")
		private WebElement sortoption;
		public WebElement sortoption() 
		{
			return sortoption;
		}
		@FindBy(xpath= "//*[@id=\"jqg1\"]")
		private WebElement sortinput;
		public WebElement sortinput() 
		{
			return sortinput;
		}
		
		@FindBy(xpath= "//*[@id=\"td_trsChargesListGridTbl_Id_M08MT_1_trsCHARGESVO.CODE\"]")
		private WebElement Gridcode;
		public WebElement Gridcode() 
		{
			return Gridcode;
		}
		@FindBy(xpath= "//*[@id=\"td_trsChargesListGridTbl_Id_M08MT_1_trsCHARGESVO.BRIEF_NAME_ENG\"]")
		private WebElement GridBrief;
		public WebElement GridBrief() 
		{
			return GridBrief;
		}
		@FindBy(xpath= "//*[@id=\"td_trsChargesListGridTbl_Id_M08MT_1_trsCHARGESVO.LONG_NAME_ENG\"]")
		private WebElement Gridlong;
		public WebElement Gridlong() 
		{
			return Gridlong;
		}
		
		@FindBy(xpath= "//input[@class='add-rule ui-add']")
		private WebElement Add;
		public WebElement Add() 
		{
			return Add;
		}
		
		
	}