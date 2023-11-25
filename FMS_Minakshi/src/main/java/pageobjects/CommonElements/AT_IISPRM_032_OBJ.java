package pageobjects.CommonElements;


	
	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	 

	public class AT_IISPRM_032_OBJ
	{
		WebDriver driver;

	 

		public AT_IISPRM_032_OBJ(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath= "//*[@id=\"iisProductClassDefMatAcFromFacilityYN_M003MT\"]")	
		private WebElement Maturityaccountfacitycheckbox;
		public WebElement Maturityaccountfacitycheckbox() 
		{
			return Maturityaccountfacitycheckbox;
		}
		
		
		
		@FindBy(xpath= "//*[@id=\"iisProductClassMaintFormId_M003MT_Save_key\"]")	
		private WebElement iisProductClassMaintFormId_M003MT_Save_key;
		public WebElement iisProductClassMaintFormId_M003MT_Save_key() {
		
			return iisProductClassMaintFormId_M003MT_Save_key;
		}
		
		
		@FindBy(xpath= "//*[@id=\"_popup_path_sol_ok\"]")	
		private WebElement okbuttonaftersave;
		public WebElement okbuttonaftersave() {
		
			return okbuttonaftersave;
		}
		}
