Feature: To Test the FMS application login
@LOGIN
Scenario: To Test the login functionality of FMS application
Given navigate to FMS application and login with valid credentials
And logout from the application
@LoginFMSparam
Scenario: To Test the login functionality of FMS param application
Given navigate to FMS param application and login with valid credentials
And logout from the application
@LoginSADS
Scenario: To Test the login functionality of FMS sads application
Given navigate to FMS sads application and login with valid credentials
And logout from the application 
@LoginIISFMSparam
Scenario: To Test the login functionality of IIS FMS param application
Given navigate to IIS FMS Param application and login with valid credentials
And logout from the application
@LoginIISFMS
Scenario: To Test the login functionality of IIS FMS application
Given navigate to IIS FMS application and login with valid credentials
And logout from the application