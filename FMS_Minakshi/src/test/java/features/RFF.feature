Feature: Testing the Functionality of Request for financing
@AT_RF_110
Scenario: TSR - ITFCI170564 
Given navigate to FMS application and login with valid credentials
And User_482 update Test data set for AT_RF_110
And User_482 click Technical details
And User_482 click clear caches
And User_482 click on the Johns Request module and after johns sub module
And User_482 click on the Request For finnancing under sub Johns Request
And User_482 click on the maintenance under Request For finnancing
And User_482 select the new request from the request for submission drop down
And User_482 click on info completion date
And User_482 enter the infor completion date 
And User_482 click on the customer 
And User_482 enter the customer code 
And User_482 click on the Facility type
And User_482 enter the Facility type 
And User_482 select the History with ITFC
And User_482 click on the total limit 
And User_482 enter the total limit
And User_482 click on the commodities and security component tab
And User_482 click on add button under commodities and security component tab
And User_482 click on the category under approve commmodities
And User_482 enter the category under approve commmodities 
And User_482 click on the sub category code under approve commmodities
And User_482 enter the sub category code under approve commmodities
And User_482 click on commodities code
And User_482 enter on commodities code
And User_482 click on expected perc
And User_482 enter on expected perc
And User_482 click on the Source Destination tab
And User_482 click on the add  button under specific country
And User_482 click on the country code new rec
And User_482 enter the Country code
And User_482 click on the expected perc under specific country
And User_482 enter expected per under specific country
And User_482 click on Disbursement tab
And User_482 click on add icon btn under disbursement
And User_482 click on product class
And User_482 enter the product class code
And User_482 click on the add button
And User_482 select the newly added product class rec
And User_482 click on the pricing details tab
And User_482 click on add button under pricing details tab
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
And User_482 validate the request
And User_482 Confirm validate the request
And User_482 fetch the Request code from the pop up
And User_482 close the screen
And User_482 click on the aprrove 1 tab under maintenence
And User_482 click on the search button under Approve level one
And User_482 click on clear button under search
And User_482 click on the code under Approve level one
And User_482 enter the code under Approve level one
And User_482 selects the record
And User_482 double click on the retrived record under Approve level one
And User_482 click on Customer Grading Tab
And User_482 select the approve from the approve level one dropdown
And User_482 click on the Approve btn under under Approve level one

@AT_RF_108

Scenario: TSR - ITFCI170394
Given navigate to FMS application and login with valid credentials
#And User_482 update Test data set for AT_RF_110
And User_482 click on the Johns Request module and after johns sub module
And User_482 click on the facilty managment screen under johns sub module 
And User_482 click on the maintenance under facility managment screen 
And User_482 click on the search button under facility managment screen 
And User_482 click on the code feild under facility managment screen 
And User_482 enter the facility code
And User_482 double click on the the retrieved rec
And User_482 click on the additonal tab under facilty managment screen 
And User_482 click on the commodities and security component screen 
And User_482 validate is the system is defaulting Coverage Type and Required Coverage perc from Application to Facility