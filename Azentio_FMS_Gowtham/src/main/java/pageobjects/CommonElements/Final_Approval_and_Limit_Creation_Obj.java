package pageobjects.CommonElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Final_Approval_and_Limit_Creation_Obj {

	WebDriver driver;

	public Final_Approval_and_Limit_Creation_Obj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
