Feature: IIS Parameter

@420879
Scenario: Checking the New flag Buy back at Product class and Default flag value and Category visibility

Given navigate to IIS Params application and login with valid credentials
And User_609 get the test data set id for AT_IISPRM_007
And User_609 Click on the Parameters menu in iis
And User_609 Click on the Product Class submenu
And User_609 Click on the Maintenance screen in Product Class under Parameters
And User_609 Click on the Search Button in Product Class under Parameters
And User_609 Select the Product Class in Product Class under Parameters
And User_609 Click on the Profit Calculation tab in Product Class under Parameters
Then User_609 Check the flag Buy Back is displaying and Enable it in Product Class under Parameters

@563259
Scenario: Product Class – Checking the new field % of Deal Tenure to the existing Lock in Period field

Given navigate to IIS Params application and login with valid credentials
And User_609 get the test data set id for AT_IISPRM_030
And User_609 Click on the Parameters menu in iis
And User_609 Click on the Product Class submenu
And User_609 Click on the Maintenance screen in Product Class under Parameters
And User_609 Click on the Search Button in Product Class under Parameters
And User_609 Select the Product Class in Product Class under Parameters

And User_609 Click on the Additional Information2 tab in Product Class under Parameters
Then User_609 Check the field percentage of Deal Tenure available in Period field in Product Class under Parameters


@585453
Scenario: Check Project finance deal radio button at the level of product class screen

Given navigate to IIS Params application and login with valid credentials
And User_609 get the test data set id for AT_IISPRM_036
And User_609 Click on the Parameters menu in iis
And User_609 Click on the Product Class submenu
And User_609 Click on the Maintenance screen in Product Class under Parameters
And User_609 Click on the Search Button in Product Class under Parameters
And User_609 Select the Product Class in Product Class under Parameters
And User_609 Click on the Profit Calculation tab in Product Class under Parameters

Then User_609 Select the Calculate Profit in Product Class under Parameters
Then User_609 Select the Profit Distribution Method in Product Class under Parameters

And User_609 Click on the Additional Information2 tab in Product Class under Parameters
And User_609 Click the Allocation Others tab in Product Class under Parameters
Then User_609 Check the Project Finance deal is Displaying in Product Class under Parameters

@606866
Scenario: Create a new product class in M003 screen

Given navigate to IIS Params application and login with valid credentials
#And User_609 get the test data set id for AT_IISPRM_038
And User_609 Click on the Parameters menu in iis
And User_609 Click on the Product Class submenu
And User_609 Click on the Maintenance screen in Product Class under Parameters
Then User_609 Validate the Maintenance Button loads completely in Product Class under Parameters

@606865
Scenario: Check Project finance deal radio button at the level of product class screen

Given navigate to IIS Params application and login with valid credentials
And User_609 get the test data set id for AT_IISPRM_037
And User_609 Click on the Parameters menu in iis
And User_609 Click on the Product Class submenu
And User_609 Click on the Maintenance screen in Product Class under Parameters

And User_609 Select the Application in Product Class under Parameters
And User_609 Select the Customer in Product Class under Parameters
And User_609 Enter the Product Class Code in Product Class under Parameters
And User_609 Enter the Brief Description in Product Class under Parameters
And User_609 Enter the Long Description in Product Class under Parameters

And User_609 Click on the Profit Calculation tab in Product Class under Parameters
And User_609 Enter the Exposure Limit in Product Class under Parameters
And User_609 Check the Profit Upfront flag in Product Class under Parameters
Then User_609 Select the Calculate Profit in Product Class under Parameters
Then User_609 Select the Profit Distribution Method in Product Class under Parameters
And User_609 Click on the Additional Information tab in Product Class under Parameters
And User_609 Check the VAT Applicable flag in Product Class under Parameters
And User_609 Select the VAT Code in Product Class under Parameters
And User_609 Select the VAT Percentage On in Product Class under Parameters
And User_609 Check the Include Vat Settlement flag in Product Class under Parameters
And User_609 Click on the Save Button in Product Class under Parameters


@721421
Scenario: Third Party Details -basic Testing

Given navigate to IIS Params application and login with valid credentials
And  User_609 get the test data set id for AT_IISPRM_070
And  User_609 Click on the Parameters menu in iis
And  User_609 Click on the Third Party Details submenu in iis
And  User_609 Click on the Maintenance screen in Third Party Details under Parameters
And  User_609 Enter the Short Name in Third Party Details under Parameters
And  User_609 Enter the Long Name in Third Party Details under Parameters
And  User_609 Click on the Save Button in Third Party Details under Parameters
And  User_609 Click on the Search Button in Third Party Details under Parameters
And  User_609 Select the Record in Third Party Details under Parameters
And  User_609 Update the Record in Third Party Details under Parameters
And  User_609 Click on the Save Button in Third Party Details under Parameters
And  User_609 Click on the Search Button in Third Party Details under Parameters
And  User_609 Select the Record in Third Party Details under Parameters
And  User_609 Click on the Delete Button in Third Party Details under Parameters
Then User_609 Validate the List screen is Displaying in Third Party Details under Parameters
Then User_609 Validate the Approve screen is Displaying in Third Party Details under Parameters
Then User_609 Validate the Reject screen is Displaying in Third Party Details under Parameters
Then User_609 Validate the Update After Approve screen is Displaying in Third Party Details under Parameters
And  User_609 Click on the Search Button in Third Party Details under Parameters
Then User_609 Validate the Grid list shows Company code in Third Party Details under Parameters
Then User_609 Validate the Grid list shows code in Third Party Details under Parameters
Then User_609 Validate the Grid list shows Brief name in Third Party Details under Parameters
Then User_609 Validate the Grid list shows Long name in Third Party Details under Parameters
Then User_609 Validate the Next Page Button working properly in Third Party Details under Parameters
Then User_609 Validate the Last Page Button working properly in Third Party Details under Parameters
Then User_609 Validate the Prev Page Button working properly in Third Party Details under Parameters
Then User_609 Validate the First Page Button working properly in Third Party Details under Parameters
Then User_609 Validate the Sorting Functionality working properly in Third Party Details under Parameters

@721429
Scenario: Yield Roster -basic Testing

Given navigate to IIS Params application and login with valid credentials
And  User_609 get the test data set id for AT_IISPRM_071
And  User_609 Click on the Parameters menu in iis
And  User_609 Click on the Yield under Parameters menu in iis
And  User_609 Click on the Yield Roster submenu in iis
And  User_609 Click on the Maintenance screen in Yield Roster under Parameters
And  User_609 Enter the Code in Yield Roster under Parameters
And  User_609 Enter the Brief Name in Yield Roster under Parameters
And  User_609 Enter the Long Name in Yield Roster under Parameters
And  User_609 Click on the Save Button in Yield Roster under Parameters
And  User_609 Click on the Search Button in Yield Roster under Parameters
And  User_609 Select the Record in Yield Roster under Parameters
And  User_609 Update the Record in Yield Roster under Parameters
And  User_609 Click on the Save Button in Yield Roster under Parameters
And  User_609 Click on the Search Button in Yield Roster under Parameters
And  User_609 Select the Record in Yield Roster under Parameters
And  User_609 Click on the Delete Button in Yield Roster under Parameters
Then User_609 Validate the List screen is Displaying in Yield Roster under Parameters
Then User_609 Validate the Approve screen is Displaying in Yield Roster under Parameters
Then User_609 Validate the Reject screen is Displaying in Yield Roster under Parameters
Then User_609 Validate the Update After Approve screen is Displaying in Yield Roster under Parameters
Then User_609 Validate the Grid list shows code in Yield Roster under Parameters
Then User_609 Validate the Grid list shows Brief name in Yield Roster under Parameters
Then User_609 Validate the Grid list shows Long name in Yield Roster under Parameters
Then User_609 Validate the Grid list shows Brief name in Arab in Yield Roster under Parameters
Then User_609 Validate the Grid list shows Long name in Arab in Yield Roster under Parameters
Then User_609 Validate the Next Page Button working properly in Yield Roster under Parameters
Then User_609 Validate the Last Page Button working properly in Yield Roster under Parameters
Then User_609 Validate the Prev Page Button working properly in Yield Roster under Parameters
Then User_609 Validate the First Page Button working properly in Yield Roster under Parameters
Then User_609 Validate the Sorting Functionality working properly in Yield Roster under Parameters


@721437
Scenario: Yield Register- basic Testing

Given navigate to IIS Params application and login with valid credentials
And  User_609 get the test data set id for AT_IISPRM_072
And  User_609 Click on the Parameters menu in iis
And  User_609 Click on the Yield under Parameters menu in iis
And  User_609 Click on the Yield Register submenu in iis
And  User_609 Click on the Maintenance screen in Yield Register under Parameters
And  User_609 Enter the Register Number in Yield Register under Parameters
And  User_609 Select the Party Type in Yield Roster under Parameters
And  User_609 Select the Product Type in Yield Roster under Parameters
And  User_609 Select the Product Class in Yield Roster under Parameters
And  User_609 Enter the Brief Name in Yield Register under Parameters
And  User_609 Enter the Long Name in Yield Register under Parameters
And  User_609 Click on the Save Button in Yield Register under Parameters
And  User_609 Click on the Search Button in Yield Register under Parameters
And  User_609 Select the Record in Yield Register under Parameters
And  User_609 Click on the Add icon in Yield Register under Parameters
And  User_609 Select the Currency Type in Yield Register under Parameters
And  User_609 Enter the Period Number in Yield Register under Parameters
And  User_609 Select the Period Type in Yield Register under Parameters
And  User_609 Select the Yield Roster Code in Yield Register under Parameters
And  User_609 Select the Modarib Rate Roster Code in Yield Register under Parameters
And  User_609 Enter the From Date in Yield Register under Parameters
And  User_609 Enter the To Date in Yield Register under Parameters
#And  User_609 Update the Record in Yield Register under Parameters
And  User_609 Click on the Save Button in Yield Register under Parameters
And  User_609 Click on the Search Button in Yield Register under Parameters
And  User_609 Select the Record in Yield Register under Parameters
And  User_609 Click on the Delete Button in Yield Register under Parameters
And  User_609 Click on the Search Button in Yield Register under Parameters
Then User_609 Validate the Grid list shows code in Yield Register under Parameters
Then User_609 Validate the Grid list shows Brief name in Yield Register under Parameters
Then User_609 Validate the Grid list shows Product Type in Yield Register under Parameters
Then User_609 Validate the Grid list shows Product Class in Yield Register under Parameters
Then User_609 Validate the Grid list shows Status in Yield Register under Parameters
Then User_609 Validate the Next Page Button working properly in Yield Register under Parameters
Then User_609 Validate the Last Page Button working properly in Yield Register under Parameters
Then User_609 Validate the Prev Page Button working properly in Yield Register under Parameters
Then User_609 Validate the First Page Button working properly in Yield Register under Parameters
Then User_609 Validate the Approve screen is Displaying in Yield Register under Parameters

Then User_609 Validate the Suspend screen is Displaying in Yield Register under Parameters
Then User_609 Validate the Reactivate screen is Displaying in Yield Register under Parameters
Then User_609 Validate the Sorting Functionality working properly in Yield Register under Parameters

#And  User_609 Click on the Approve screen in Yield Register under Parameters
#And  User_609 Select the Code in  Approve screen in Yield Register under Parameters
#And  User_609 Click on the Approve Button in Approve screen in Yield Register under Parameters
#
#And  User_609 Click on the Suspend screen in Yield Register under Parameters
#And  User_609 Select the Code in Suspend screen in Yield Register under Parameters
#And  User_609 Click on the Suspend Button in Suspend screen in Yield Register under Parameters
#
#And  User_609 Click on the Reactivate screen in Yield Register under Parameters
#And  User_609 Select the Code in Reactivate screen in Yield Register under Parameters
#And  User_609 Click on the Reactivate Button in Reactivate screen in Yield Register under Parameters

@721445
Scenario: Upload Rate -basic Testing






