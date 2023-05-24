Feature: To Test the FMS application
@535096
Scenario: BIPL160092-Application for One Off Facility Creation
#Prerequestics: Make sure Allow to add sublimits in multiple groups checkbox is checked
Given navigate to FMS application2 and login with valid credentials
And Click the request for financin in fms application
And Click the request for financing under request for financin
And click the maintenence under request for financing
And click the reason for submission search box
And click the customer search box
And click the facility type details
And Enter the facility type code under facility type
And Enter the total limit under global limit
And Click the Disbursement Sublimit under maintenance screen
And Add the limits under Disbursement Sublimit
And Add the product class values in product searchbox
And Add all the Above limit values
And Navigate to Request details section
And Navigate to Group limit section
And Click on Add new row icon in Group limit section
And Enter Group id, Group limit, Group name for row no 1
And Click on Add new row icon in Group limit section
And Enter Group id, Group limit for row no2
And Validate the Group limits exeeded error popup


@535146
Scenario: BIPL160092-Application for Revolving Facility Creation
#Prerequestics: Make sure Allow to add sublimits in multiple groups checkbox is checked
Given navigate to FMS application2 and login with valid credentials
And Click the request for financin in fms application
And Click the request for financing under request for financin
And click the maintenence under request for financing
And click the reason for submission search box
And click the customer search box
And click the facility type details
And Enter the facility type code under facility type
And Enter the total limit under global limit
And Click the Disbursement Sublimit under maintenance screen
And Add the limits under Disbursement Sublimit
And Add the product class values in product searchbox
And Add all the Above limit values
And Navigate to Request details section
And Navigate to Group limit section
And Click on Add new row icon in Group limit section
And Enter Group id, Group limit, Group name for row no 1
And Click on Add new row icon in Group limit section
And Enter Group id, Group limit for row no2
And Validate the Group limits exeeded error popup


@535486
Scenario: BIPL160092-Application for Facility Creation with Cash & Non cash products
#Prerequestics: Make sure Allow to add sublimits in multiple groups checkbox is checked
Given navigate to FMS application2 and login with valid credentials
And Click the request for financin in fms application
And Click the request for financing under request for financin
And click the maintenence under request for financing
And click the reason for submission search box
And click the customer search box
And click the facility type details
And Enter the facility type code under facility type
And Enter the total limit under global limit
And Click the Disbursement Sublimit under maintenance screen
And Add the limits under Disbursement Sublimit
And Add the product class values in product searchbox
And Add all the Above limit values
And Navigate to Request details section
And Navigate to Group limit section
And Click on Add new row icon in Group limit section
And Enter Group id, Group limit, Group name for row no 1
And Click on Add new row icon in Group limit section
And Enter Group id, Group limit for row no2
And Validate the Group limits exeeded error popup


