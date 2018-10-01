import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\GREESH~1.MVS\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Witholdings Editing\\20181001_133032\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://qa-login.accountantsoffice.com/login?firmCode=aworldqa')

not_run: WebUI.setText(findTestObject('Page_Log in - AccountantsOffice/input_UserName'), 'greeshmaj')

not_run: WebUI.setEncryptedText(findTestObject('Page_Log in - AccountantsOffice/input_Password'), 'lb6CZRuikkT48jqepzyNUg==')

'Clicks on the login button '
not_run: WebUI.click(findTestObject('Page_Enter verification code - Acco/Submit code button -3'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Welcome Greeshma Johnson - Acc/a_Payroll Relief'))

not_run: WebUI.clearText(findTestObject('Page_Select Client - Payroll Relief/span_Enter client code or name'))

'Delay in order to load the client \\r\\n'
not_run: WebUI.delay(10)

not_run: WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employee')

not_run: WebUI.click(findTestObject('Page_EmployeeContractor Setup - Pay/a_Taxes'))

'0- single, 1- married, 2- head of household, 3- exempt'
not_run: WebUI.selectOptionByIndex(findTestObject('Page_EmployeeContractor Setup - Pay/dropdown_filing Status'), '0')

'Use this delay to confirm what you want to test initally --  CONFIRM  AMMOUNT '
not_run: WebUI.delay(10)

not_run: WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/ListEntry')

not_run: WebUI.click(findTestObject('Page_Payroll Entry - Payroll Relief/label_Current-1'))

'select 5th index in drop down box'
not_run: WebUI.selectOptionByIndex(findTestObject('Page_Payroll Entry - Payroll Relief/select_Select.Payroll Drop Down -1'), 
    '5')

'Review changes made from recalculation'
not_run: WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/Review')

not_run: WebUI.click(findTestObject('Page_Payroll Review - Payroll Relie/span_CTWilson Jessie-1'))

'Page goes into approved section - CHANGE TO: Current & Service Weekly for next date'
not_run: WebUI.delay(5)

not_run: WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employee')

not_run: WebUI.click(findTestObject('Page_EmployeeContractor Setup - Pay/a_Taxes'))

'Delay in order to create variable change in deduction number'
not_run: WebUI.delay(10)

not_run: WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/ListEntry')

not_run: WebUI.click(findTestObject('Page_Payroll Entry - Payroll Relief/label_Current-1'))

'select 5th index in drop down box'
WebUI.selectOptionByIndex(findTestObject('Page_Payroll Entry - Payroll Relief/select_Select.Payroll Drop Down -1'), '5')

'Page goes into approved section - CHANGE TO: Current & Service Weekly for next date'
WebUI.delay(5)

'Review changes made from recalculation'
WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/Review')

WebUI.click(findTestObject('Page_Payroll Review - Payroll Relie/span_CTWilson Jessie-1'))

WebUI.delay(10)

''', 'Test Cases/Witholdings Editing', new TestCaseBinding('Test Cases/Witholdings Editing',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
