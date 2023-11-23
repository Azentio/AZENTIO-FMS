package pageobjects.iisParam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccrualProcessObj {
	WebDriver driver;

	public AccrualProcessObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//td[normalize-space()='Periodical Processing']")
	private WebElement iis_Periodical_Processing;

	public WebElement iisPeriodicalProcessing() {
		return iis_Periodical_Processing;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Reschedule Repayment Plan - Installments Settled Not On the Due Date')]")
	private WebElement iis_Reschedule_Repayment_Plan_T10RA;

	public WebElement iisRescheduleRepaymentPlan_T10RA() {
		return iis_Reschedule_Repayment_Plan_T10RA;
	}
	
	@FindBy(xpath = "//label[@id='repaymentPlanLateSettlementFormId_T10RA_Process_key']")
	private WebElement iis_Process_Btn_T10RA;

	public WebElement iisProcessBtn_T10RA() {
		return iis_Process_Btn_T10RA;
	}
	
	@FindBy(xpath = "//div[@class = 'jMsgbox-contentWrap']")
	private WebElement iis_SuccessFull_PopUP_Message;

	public WebElement iisSuccessFullPopUpMessage() {
		return iis_SuccessFull_PopUP_Message;
	}
	
    //***********************************************************************************************************
	
	@FindBy(xpath = "//td[text()='Post Accruals']")
	private WebElement IIS_PeriodicalProcessing_PostAccruals_05;

	public WebElement IIS_PeriodicalProcessing_PostAccruals_05() {
		return IIS_PeriodicalProcessing_PostAccruals_05;
	}

	@FindBy(xpath = "//span[text()='Final Accruals']")
	private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_05;

	public WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_05() {
		return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_05;
	}

	@FindBy(xpath = "//input[@id='Specific_deal_T10EMF']")
	private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealFlag_05;

	public WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealFlag_05() {
		return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealFlag_05;
	}

	@FindBy(xpath = "//span[@id='spanLookup_postChargeAccuralProcessSpecificDeal_T10EMF']/span")
	private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealSearch_05;

	public WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealSearch_05() {
		return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDealSearch_05;
	}

	@FindBy(xpath = "//input[@id='gridtab_postChargeAccuralProcessSpecificDeal_T10EMF_gs_trsdealVO.SERIAL_NO']")
	private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDeal_05;

	public WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDeal_05() {
		return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_SpecificDeal_05;
	}
	// table[@id='gridtab_postChargeAccuralProcessSpecificDeal_T10EMF']/tbody/tr[2]//td[text()='5464']

	@FindBy(xpath = "//input[@id='fromDate_T10EMF']")
	private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate_05;

	public WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate_05() {
		return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_FromDate_05;
	}

	@FindBy(xpath = "//input[@id='toDate_T10EMF']")
	private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_ToDate_05;

	public WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_ToDate_05() {
		return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_ToDate_05;
	}

	@FindBy(xpath = "//button[@id='postChargeAccrualProcess_trialRun_T10EMF']")
	private WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_OkBtn_05;

	public WebElement IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_OkBtn_05() {
		return IIS_PeriodicalProcessing_PostAccruals_FinalAccruals_OkBtn_05;
	}
	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement IIS_Ok_609;

	public WebElement IIS_Ok_609() {
		return IIS_Ok_609;
	}

	
}


