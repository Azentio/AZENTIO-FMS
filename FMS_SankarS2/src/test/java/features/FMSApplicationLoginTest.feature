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

@LOGINCSM
Scenario: To Test the login functionality of CSM application
Given navigate to CSM application and login with valid credentials
And logout from the application