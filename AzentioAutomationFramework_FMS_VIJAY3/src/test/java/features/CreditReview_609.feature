Feature: Credit Review
 
 @922760
 Scenario: AIBBI190512 - Error produced by system while approving the application backed from the level of Credit Review under “Request for Mod with Mana
Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_CR_001
And User_609 click Technical details
And User_609 click clear caches
And User_609 Click the ok button 
And User_609 Click on Request Menu
And User_609 Click on the Request Financing submenu in Request
And User_609 Click on the Request For Financing under Request Financing submenu in Request
And User_609 Click on the Maintenance screen in Request
And User_609 Select the Reason For Submission field in Request
And User_609 Select the Customer field in Request
And User_609 Select the Facility Type in Request
And User_609 Enter the Total Limit in Request
And User_609 Select the Customer Account in Request
And User_609 Click on the Disbursement or Sublimit tab in Request 
And User_609 Click on Add icon in Disbursement or sublimit tab in Request
And User_609 Select the Product Class in Request
#And User_609 Click on Fees or Charges label in Request
#And User_609 Click and Select the Charges in Request
And User_609 Enter the New margin value in Request
And User_609 Enable Clean flag in Product Class in Request
And User_609 Click on Add in Product Class in Request
And User_609 Click the Save Button in Request
And User_609 Click the Application confirm ok button
#And User_609 Click Ok in Confirm pop up
And User_609 Click the ok button
And User_609 Click the Validate Button in Request
And User_609 Click the ok button
And User_609 Click on Dismiss if Send Alert pop up appears in Request


And User_609 Click on Approve Level1 in Request Screen
And User_609 Select the Code in Approve Level1 in Request Screen
And User_609 Click on Customer Grading Recommendations in Approve Level1 in Request Screen
And User_609 Select the Decision in Approve Level1 in Request Screen
And User_609 Click on Approve in Approve Level1 in Request Screen
And User_609 Click the Application confirm ok button
And User_609 Click the ok button
And User_609 Click on Dismiss if Send Alert pop up appears in Request in Approve Level1


And User_609 Click on Credit Review screen in Request
And User_609 Select the Code in Credit Review screen in Request
And User_609 Click on Credit Committee Recommendations tab in Request
And User_609 Click on Recommendations Dropdown in Request
And User_609 Click on Credit Review Button in Request




@956827
 Scenario: AIBBI200077 - Java Lang NullPointer Exception at Credit Review Screen
Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_CR_002
And User_609 click Technical details
And User_609 click clear caches
And User_609 Click the ok button 
And User_609 Click on Request Menu
And User_609 Click on the Request Financing submenu in Request
And User_609 Click on the Request For Financing under Request Financing submenu in Request
And User_609 Click on the Maintenance screen in Request
And User_609 Select the Reason For Submission field in Request
And User_609 Select the Customer field in Request
And User_609 Select the Facility Type in Request
And User_609 Enter the Total Limit in Request
And User_609 Select the Customer Account in Request
And User_609 Click on the Disbursement or Sublimit tab in Request 
And User_609 Click on Add icon in Disbursement or sublimit tab in Request
And User_609 Select the Product Class in Request
And User_609 Click on Fees or Charges label in Request
And User_609 Click and Select the Charges in Request
And User_609 Enter the New margin value in Request
And User_609 Enable Clean flag in Product Class in Request
And User_609 Click on Add in Product Class in Request
And User_609 Click the Save Button in Request
And User_609 Click the Application confirm ok button
#And User_609 Click Ok in Confirm pop up
And User_609 Click the ok button
And User_609 Click the Validate Button in Request
And User_609 Click the ok button
And User_609 Click on Dismiss if Send Alert pop up appears in Request


And User_609 Click on Approve Level1 in Request Screen
And User_609 Select the Code in Approve Level1 in Request Screen
And User_609 Click on Customer Grading Recommendations in Approve Level1 in Request Screen
And User_609 Select the Decision in Approve Level1 in Request Screen
And User_609 Click on Approve in Approve Level1 in Request Screen
And User_609 Click the Application confirm ok button
And User_609 Click the ok button
And User_609 Click on Dismiss if Send Alert pop up appears in Request in Approve Level1


And User_609 Click on Credit Review screen in Request
And User_609 Select the Code in Credit Review screen in Request
And User_609 Click on Credit Committee Recommendations tab in Request
And User_609 Click on Recommendations Dropdown in Request
And User_609 Click on Credit Review Button in Request
 
