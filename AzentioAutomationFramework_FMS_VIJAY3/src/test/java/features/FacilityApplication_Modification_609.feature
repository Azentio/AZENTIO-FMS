Feature: FacilityApplication - Modification

@578246
Scenario: BMOUPI170539 - "Drawn Down Value exceeds Sub Limit Value for Line 1" validation on Facility Modification
Given navigate to FMS application and login with valid credentials2
And User_609 get the test data set id for AT_FAM_004
And User_609 Click on Corporate JK menu                
And User_609 Click on Corporate Fin submenu under Corporate JK        
And User_609 Click on Request For Financing under Corporate Fin submenu          
And User_609 Click on the Maintenance under Request for Financing in Corporate JK          
And User_609 Select the Reason for Submission in Corporate JK               
And User_609 Select the Customer in Corporate JK
And User_609 Select Facility Type in Corporate JK
And User_609 Enter the Total Limit in Corporate JK                         
And User_609 Click on the Sublimit tab in Corporate JK                       
And User_609 Click on Add icon under Sublimit tab in Corporate JK              
And User_609 Select the Product Class in Corporate JK
And User_609 Enable the Clean Flag in Corporate JK                
And User_609 Enter the New Margin Value in Corporate JK            
And User_609 Click on Add in Corporate JK					
And User_609 Click on Save button in Corporate JK							
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click on Validate button in Corporate JK 						
And User_609 Click on Dismiss if Send Alert pop up appears in Corporate JK			
And User_609 Click on Approve Level1 in Corporate JK												
And User_609 Select the Code in Approve Level1 in Corporate JK
And User_609 Click on Customer Grading and Recommendations tab in Corporate JK      
And User_609 Select the Dicision in Approve Level1 in Corporate JK  
And User_609 Select the Dicision Forward to in Approve Level1 in Corporate JK            
And User_609 Click on Approve in Approve Level1 in Corporate JK                
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click on Dismiss if Send Alert pop up appears in Approve Level1 in Corporate JK				
And User_609 Click on Approve Level3 in Corporate JK												
And User_609 Select the Code in Approve Level3 in Corporate JK
And User_609 Click on Customer Grading and Recommendations tab in Corporate JK      
And User_609 Select the Dicision in Approve Level3 in Corporate JK              

And User_609 Click on Approve in Approve Level3 in Corporate JK                
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click on Dismiss if Send Alert pop up appears in Approve Level3 in Corporate JK				



And User_609 Click on Credit Review under Corporate Fin submenu
And User_609 Select the Code in Credit Review in Corporate JK
And User_609 Click on Credit Committee Recommendations tab in Corporate JK
And User_609 Click on Recommendations Dropdown in Corporate JK
And User_609 Click on Recommendations AddIcon in Corporate JK
And User_609 Select the Recommended By in Corporate JK
And User_609 Select the CR Recommendation in Corporate JK
And User_609 Click on Credit Review Button in Corporate JK
And User_609 Click the Application confirm ok button
And User_609 Click the Application ok button
And User_609 Click on Dismiss if Send Alert pop up appears in Credit Review in Corporate JK




And User_609 Select the Reason for Submission after Approve in Corporate JK
And User_609 Select Existing Facility Number in Corporate JK							

	//span[@id='spanLookup_fmsFacilityFromFacility_CFIRF00MT']/span
	//input[@id='gridtab_fmsFacilityFromFacility_CFIRF00MT_gs_fmsFacilityVO.FROM_APPLICATION']
	//table[@id='gridtab_fmsFacilityFromFacility_CFIRF00MT']/tbody/tr[2]/td[text()='0000004798']
#	
#And User_609 Click on Modification Reason in Corporate JK               //label[text()='Modification Reason ']
#And User_609 Click on Add icon in Modification Reason in Corporate JK			//td[@id='add_reguestFinancingModificationRejectReasonGrid_CFIRF00MT']
#
#wait for element => //span[@id='ui-dialog-title-modifyRejectRequestDetailsDiv_id_CFIRF00MT']
#And User_609 Select the Reason in Modification Reason in Corporate JK		
#
#//table[@id='reguestFinancingModificationRejectReasonGrid_CFIRF00MT']/tbody/tr[2]/td[1]     =>select row
#//td[@id='td_reguestFinancingModificationRejectReasonGrid_CFIRF00MT_1_fmsRequestFinancingModifyReasonVO.TRIGGER_TYPE']/select 		=>select option(Internal)
#//td[@id='td_reguestFinancingModificationRejectReasonGrid_CFIRF00MT_1_fmsRequestFinancingModifyReasonVO.DETAILS']/textarea      =>enter details
#
#And User_609 Click on Ok Button in Modification Reason in Corporate JK				//span[text()='Ok']			 =>ok
#
#
#
#
#
#
#
#
#And User_609 Enter the Total Limit in Corporate JK                         //input[@id='requestFinancingFacilityTotalvalue_CFIRF00MT']
#And User_609 Click on the Sublimit tab in Corporate JK                       //li[@id='requestFinancingLimitDtlsTabs_CFIRF00MT']/a/span[text()='Disbursement/Sublimit']
#And User_609 Click on Add icon under Sublimit tab in Corporate JK              //td[@id='add_RequestFinancingLimitDetailsGridId_CFIRF00MT']/div/span
#And User_609 Select the Product Class in Corporate JK
#
#//span[@id='spanLookup_requestFinancingLimitDetailsGeneralFacilityProductClass_CFIRF00MT']/span
#//input[@id='gridtab_requestFinancingLimitDetailsGeneralFacilityProductClass_CFIRF00MT_gs_CODE']
#//table[@id='gridtab_requestFinancingLimitDetailsGeneralFacilityProductClass_CFIRF00MT']/tbody/tr[2]/td[text()='1']
#
#
#And User_609 Enable the Clean Flag in Corporate JK                //input[@id='requestFinancingLimitDetailsCleanFlagdChkBox_CFIRF00MT']
#And User_609 Enter the New Maargin Value in Corporate JK            //input[@id='requestFinancingLimitDetailsRfNewMargin_CFIRF00MT']
#
#
#And User_609 Click on Add in Corporate JK					//button[@id='limitDetails_add_btn_CFIRF00MT']/span[contains(text(),' Add ')]
#
#And User_609 Click on Save button in Corporate JK							//label[@id='requestFinancingFormId_CFIRF00MT_save_key']
#And User_609 Click the Application confirm ok button
#And User_609 Click the Application ok button
#And User_609 Click on Validate button in Corporate JK 						//label[@id='requestFinancingFormId_CFIRF00MT_Validate_key']
#And User_609 Click on Dismiss if Send Alert pop up appears in Corporate JK			//a[@id='dismissbut_CFIRF00MT']/span
#
#
#
#
#
#And User_609 Click on Credit Review in Corporate JK				 //a[@id='CFIRF00CV']/span[text()='Credit Review']
#
#And User_609 Click on Credit Committee Recommendations tab in Credit Review in Corporate JK		//li[@id='creditCommitteeRecommendationsTab_CFIRF00CV']/a/span[text()='Credit Committee Recommendations']
#
#And User_609 Click on Recommendations under Credit Committee Recommendations in Credit Review in Corporate JK  		//div[@id='requestFinancingCreditReviewRecommandations_CFIRF00CV']/div/span[text()='Recommendations']
#
#And User_609 Click on add icon in Recommendations under Credit Committee Recommendations in Credit Review in Corporate JK //table[@id='RequestFinancingRecommendationsGridId_CFIRF00CV']/tbody/tr[2]/td/span
#
#And User_609 Select 
#	//td[text()='VIJAYK' and @tdlabel  = 'Recommended By']
#	//td[text()='VIJAYK' and @tdlabel  = 'Recommended By']//parent::tr/td[@tdlabel='CR Recommendation']  =>select recommended for approve
#
#And User_609Click on Credit Review Button in Corporate JK         //label[@id='requestFinancingFormId_CFIRF00CV_Credit_Review_Key']
#




















   