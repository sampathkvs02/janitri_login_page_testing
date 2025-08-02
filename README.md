LOGIN PAGE TESTING

Set up your Automation Framework:
Use Java and Selenium WebDriver
Use Maven for dependency management
Use TestNG or JUnit as the test runner
Implement Page Object Model (POM) design pattern
Create a BaseTest class for browser setup/teardown
Page Object Class (LoginPage.java) should include:
Locators for:
User ID input
Password input
Login button
Password visibility toggle (eye icon)

Methods:
testLoginButtonDisabledWhenFieldAreEmpty()
testPasswordMaskedbutton()
testInvalidLoginShowErrorMsg()
Test Scenarios to Automate (without valid credentials):
Attempt login with blank fields and verify UI behavior
Enter any random credentials and click login – capture and print any error message shown
Validate password masking/unmasking toggle
