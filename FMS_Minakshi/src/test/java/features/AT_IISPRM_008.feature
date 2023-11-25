Feature: To Test the FMSiis application 

Scenario: to check the modification at the level of IIS

Given navigate to the IISParam Application and login with valid credentials
And user click on parameters
And user click on product class under the parameters
And user click on maintenance under the product class
And user click on search tab
And user click on class field and enter data
And user double click on retrive record
And user checking the auto financingbox under the general information
And user click on additional information
And user click on repayement plan under the additional information
And check the flag enable grace period under the informational repayment plan tab
And first payment date and cutoff date for first payment date is visible
And user check default comment date checkbox