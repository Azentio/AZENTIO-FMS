Feature: Testing the Functionality of Request for financing
@AT_RF_076
Scenario: Request for Financing & Application
Given navigate to FMS application and login with valid credentials 
And User click on msdemo menu under FMS application
And User click the msdemo Sub Menu under msdemo
And User click on Request For Financing Sub Menu in msdemo
And User click Maintenace under Request for financing
#And User update test data set for AT_AFF_024
And User click on Reason For Submission tab in maintenence screen
And User click on Customer tab in maintenence screen
And User Search the Facility Type under Maintenance screen in REQUEST FOR FINANCING
And User_482 click on Disbursement tab
And User_482 click on add icon btn under disbursement
And User_482 click on product class
And User_482 enter the product class code
And User_482 click on the add button
And User_482 select the newly added product class rec
And User_482 click on the pricing details tab
#And User_482 click on add button under pricing details tab
And User_482 click on the markup spreadsheet perc under pricing details tab
And User_482 enter the markup spreadsheet perc under pricing details tab
And User_482 click on the floor perc under pricing details tab
And User_482 enter the floor perc under pricing details tab
And User_482 click on the cap perc under pricing details tab
And User_482 enter the cap perc under pricing details tab
And User_483 click on the ohk button under pricing details tab  
And User_482 click on the funding tab
And User_482 click on the add icon btn under funding 
And User_482 click on the new fund rec 
And User_482 enter the fund code 
And User_482 click on condition tab 
And User_482 click on Signing Agreemen days
And User_482 enter Signing Agreemen days
And User_482 click on Effectiveness days
And User_482 enter the Effectiveness days
And User_482 click on the First Disbursement Days
And User_482 enter the Disbursement Days
And User_482 click on the Utilization days
And User_482 enter the Full Utilization days
And User_482 save the request 
#And User_482 clear the cache
And User_482 validate the request