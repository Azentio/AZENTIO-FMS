Feature: Request for Financing

@326295
Scenario: To check the new field 'History with ITFC' added at the request for finance screen header part.

Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_RF_172
And User_609 click Technical details
And User_609 click clear caches
And User_609 Click the ok button

And User_609 Click on the Johns request menu
And User_609 Click on the Joh reqs
And User_609 Click on the Request For Financing submenu under Johns request
And User_609 Click on the Maintenance screen under Johns request
And User_609 Select the Reason For Submission in Maintenance under Johns request
And User_609 Select the Date in Maintenance under Johns request
And User_609 Select the Customer in Maintenance under Johns request
And User_609 Select the Facility Type in Maintenance under Johns request
Then User_609 Check the field History with ITFC is Displaying


@326297
Scenario: To check the new field 'Officers Assigned' added at the request for finance -Recommandation Tab page

Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_RF_174
And User_609 click Technical details
And User_609 click clear caches
And User_609 Click the ok button

And User_609 Click on the Johns request menu
And User_609 Click on the Joh reqs
And User_609 Click on the Request For Financing submenu under Johns request
And User_609 Click on the Maintenance screen under Johns request
And User_609 Select the Reason For Submission in Maintenance under Johns request
And User_609 Select the Date in Maintenance under Johns request
And User_609 Select the Customer in Maintenance under Johns request
And User_609 Select the Facility Type in Maintenance under Johns request
And User_609 Enter the Total Limit in Maintenance under Johns request
And User_609 Click the Funding tab in Maintenance under Johns request
And User_609 Validate the Mudarib Share percentage is Displaying in Maintenance under Johns request
And User_609 Click the Customer Grading and Recommendations tab in Maintenance under Johns request
And User_609 Validate the User Id is Displaying under Officers Assigned in Maintenance under Johns request
And User_609 Validate the User Name is Displaying under Officers Assigned in Maintenance under Johns request
And User_609 Validate the Add icon is Displaying under Officers Assigned in Maintenance under Johns request
And User_609 Validate the Delete icon is Displaying under Officers Assigned in Maintenance under Johns request
And User_609 Click the Add icon is Displaying under Officers Assigned in Maintenance under Johns request
And User_609 Select the User Id under Officers Assigned in Maintenance under Johns request
And User_609 Click the Delete icon is Displaying under Officers Assigned in Maintenance under Johns request


