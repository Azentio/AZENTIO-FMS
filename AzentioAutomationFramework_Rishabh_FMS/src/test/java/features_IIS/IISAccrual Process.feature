Feature: To check the Accrual Process Feature

@AT_AP_026
Scenario: Process the “Reschedule Repayment Plan - Installments Settled Not On the Due Date” from periodical process
Given navigate to IIS application and login with valid credentials
And user get the test data for test case AT_AP_026
And User_05 Click on the Periodical Processing Module 
And User_05 Click on the Reschedule Repayment Plan Installments Settled Not On the Due Date Under Periodical Processing Module 
And User_05 Selects the Record
And User_05 Click on the Process Button
And User_05 Validate the Process will ran successfully 

@AT_AP_027

Scenario: Run the profit accrual on 30/06/2014 from periodical process
Given navigate to IIS application and login with valid credentials
And user get the test data for test case AT_AP_027
And User_05 Click on the Periodical Processing Module 
And User_05 Click the Post Accruals under Periodical Processing menu
And User_05 Click the Final Accruals under Post Accruals in Periodical Processing
And User_05 Enable the Specific Deal Flag in Periodical Processing
And User_05 Select the Deal number under Final Accruals in Periodical Processing
And User_05 Select the From Date under Final Accruals in Periodical Processing
And User_05 Select the To Date under Final Accruals in Periodical Processing
And User_05 Click the Ok Button under Final Accruals in Periodical Processing