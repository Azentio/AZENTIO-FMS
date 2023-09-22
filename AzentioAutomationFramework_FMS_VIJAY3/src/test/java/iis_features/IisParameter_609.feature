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
