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
@LoginITRS
Scenario: To Test the login functionality of ITRS application
Given navigate to ITRS application and login with valid credentials
@LoginMTS
Scenario: To Test the login functionality of MTS application
Given navigate to MTS application and login with valid credentials
@LoginIIS
Scenario: To Test the login functionality of IIS application
Given navigate to IIS application and login with valid credentials
@LoginIISparam
Scenario: To Test the login functionality of IIS param application
Given navigate to IIS param application and login with valid credentials