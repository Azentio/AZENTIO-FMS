Feature: To Test the FMSiis application 
@AT_IISPRM_111
Scenario: Check basic functionality of product class module
Given user_111 navigate to the IISParam application and login with the valid credentials
And user_111 click on parameters tab
And user_111 click on product class under parameter tab
And user_111 click on maintenance under product class tab
And user_111 click on search button under product class
And user_111 click on the first option under search button
And user_111 click on profit calculation under maintainance tab
And user_111 check flag under profit calculation tab
And user_111 click on additional information
And user_111 click on repayement plan under the additional information
And user_111 validates for the Accural Entry At Revaluation 
And user_111 check the availble option of Accural Entry At Revaluation 