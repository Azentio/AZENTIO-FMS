package pageobjects.CommonElements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonElementObj {
		WebDriver driver;

		public CommonElementObj(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		// confirm Ok button

		@FindBy(xpath = "//input[@id='_popup_path_sol_confirm_ok']")
		private WebElement iis_Confirm_Ok_Button;

		public WebElement iisConfirmOkButton() {
			return iis_Confirm_Ok_Button;
		}

		// input[@id='_popup_path_sol_ok']

		@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
		private WebElement iis_Ok_Button;

		public WebElement iisOkButton() {
			return iis_Ok_Button;
		}

		@FindBy(xpath = "//span[@class='ui-icon ui-icon-close ui-icon-close-tabs-custom']")
		private WebElement iis_Screen_Close_Btn;

		public WebElement iisScreenCloseBtn() {
			return iis_Screen_Close_Btn;
		}
		

		@FindBy(xpath = "//div[@id='div__popup_path_sol_ok']")
		private WebElement iis_Error_Pop_up;

		public WebElement iisErrorPopup() {
			return iis_Error_Pop_up;
		}
		
		@FindBy(xpath = "//td[@class='columns']//select")
		private WebElement iis_Sort_First_DropDown;

		public WebElement iisSortFirstDropDown() {
			return iis_Sort_First_DropDown;
		}
		
		@FindBy(xpath = "//select[@class='selectopts']")
		private WebElement iis_Sort_Second_DropDown;

		public WebElement iisSortSecondDropDown() {
			return iis_Sort_Second_DropDown;
		}
		
		@FindBy(xpath = "//input[@id='jqg2']")
		private WebElement iis_Sort_Third_Input_Feild;

		public WebElement iisSortThirdInputFeild() {
			return iis_Sort_Third_Input_Feild;
		}
		
		
		@FindBy(xpath = "//a[@id='fboxPlanTemplateListGridTbl_Id_M029MT_search']")
		private WebElement iis_Sort_Find_Icon_Btn;

		public WebElement iisSortFindIconBtn() {
			return iis_Sort_Find_Icon_Btn;
		}
		
		@FindBy(xpath = "//div[@class='ui-pg-div']//span[@class='ui-icon ui-icon-search']")
		private WebElement iis_Sort_Btn;

		public WebElement iisSortBtn() {
			return iis_Sort_Btn;
		}
		
		
		
		@FindBy(xpath = "//td[normalize-space()='Clear']")
		private WebElement iis_Clear_Btn;

		public WebElement iisClearBtn() {
			return iis_Clear_Btn;
		}
		
		@FindBy(xpath = "//span[@class='ui-icon ui-icon-seek-next']")
		private WebElement iis_Next_Btn;

		public WebElement iisNextBtn() {
			return iis_Next_Btn;
		}
		
		@FindBy(xpath = "//span[@class='ui-icon ui-icon-seek-end']")
		private WebElement iis_Last_Btn;

		public WebElement iisLastBtn() {
			return iis_Last_Btn;
		}
		
		@FindBy(xpath = "//span[@class='ui-icon ui-icon-seek-prev']")
		private WebElement iis_Previous_Btn;

		public WebElement iisPreviousBtn() {
			return iis_Previous_Btn;
		}
		
		@FindBy(xpath = "//span[@class='ui-icon ui-icon-seek-first']")
		private WebElement iis_First_Btn;

		public WebElement iisFirstBtn() {
			return iis_First_Btn;
		}
		
		@FindBy(xpath = "//label[contains(text(), 'Save ')]")
		private WebElement iis_Save_Btn;

		public WebElement iisSaveBtn() {
			return iis_Save_Btn;
		}
		
		@FindBy(xpath = "//label[contains(text(), 'Update ')]")
		private WebElement iis_Update_Btn;

		public WebElement iisUpdateBtn() {
			return iis_Update_Btn;
		}
		
		@FindBy(xpath = "//span[contains(text(), ' Delete ')]")
		private WebElement iis_Delete_Btn;

		public WebElement iisDeleteBtn() {
			return iis_Delete_Btn;
		}

		@FindBy(xpath = "//div[@class='ui-widget-header ui-corner-top jMsgbox-headWrap']//div//a[@class= 'jMsgbox-closeWrap']")
		private WebElement iis_Error_Pop_up_Dismiss_Btn;

		public WebElement iisErrorPopupDismissBtn() {
			return iis_Error_Pop_up_Dismiss_Btn;
		}
	}


