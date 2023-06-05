package pageobjects.fms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestforfinancingoutwardlcOBJ {
WebDriver driver;
	
	public RequestforfinancingoutwardlcOBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//select[@id='applicationfacilityLimitDetailsGENERAL_FACILITY_TYPE_WIFT001MT']")
    private WebElement limit_details_item;
    public WebElement limitDetailsItem() {
        return limit_details_item;
    }

    @FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsMATURITY_DATE_WIFT001MT']/following-sibling::img")
    private WebElement limit_details_maturity_date_calender;
    public WebElement limitDetailsMaturityDateCalender() {
        return limit_details_maturity_date_calender;
    }

    @FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[6]")
    private WebElement limit_details_maturity_date;
    public WebElement limitDetailsMaturityDate() {
        return limit_details_maturity_date;
    }
    @FindBy(xpath = "//input[@id='applicationfacilityLimitDetailsCLEAN_FLAG_WIFT001MT']")
    private WebElement limit_details_new_record_clean_flag;
    public WebElement limitDetailsNewRecordCleanFlag() {
        return limit_details_new_record_clean_flag;
    }
}
