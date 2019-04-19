import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa-login.accountantsoffice.com/login?firmCode=aworldqa')

WebUI.setText(findTestObject('Page_Log in - AccountantsOffice/input_UserName'), 'greeshmaj')

WebUI.setEncryptedText(findTestObject('Page_Log in - AccountantsOffice/input_Password'), 'lb6CZRuikkT48jqepzyNUg==')

'Clicks on the login button '
WebUI.click(findTestObject('Page_Enter verification code - Acco/Submit code button -3'))

WebUI.click(findTestObject('Object Repository/Page_Welcome Greeshma Johnson - Acc/a_Payroll Relief'))

WebUI.click(findTestObject('Page_Select Client - Payroll Relief/span_Enter client code or name'))

WebUiBuiltInKeywords.click(findTestObject('Page_Select Client - Payroll Relief/div_SZ Star Restaurant Inc szt - Nov'))

'Delay in order to load the client \r\n'
WebUI.delay(10)

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employee')

WebUI.click(findTestObject('Page_EmployeeContractor Setup - Pay/a_Taxes'))

'0- single, 1- married, 2- head of household, 3- exempt'
WebUI.selectOptionByIndex(findTestObject('Page_EmployeeContractor Setup - Pay/dropdown_filing Status'), '0')

'Use this delay to confirm what you want to test initally --  CONFIRM  AMMOUNT '
WebUI.delay(10)

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/Summary')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/Review')

WebUI.click(findTestObject('Page_Payroll Review - Payroll Relie/span_CTWilson Jessie-1'))

'Delay in order to check over the number to create a baseline '
WebUI.delay(11)

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employee')

WebUI.click(findTestObject('Page_EmployeeContractor Setup - Pay/a_Taxes'))

'Delay in order to create variable change in deduction number'
WebUI.delay(10)

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/ListEntry')

WebUI.click(findTestObject('Page_Payroll Entry - Payroll Relief/label_Current-1'))

'select 5th index in drop down box'
WebUI.selectOptionByIndex(findTestObject('Page_Payroll Entry - Payroll Relief/select_Select.Payroll Drop Down -1'), '5')

'Page goes into approved section - CHANGE TO: Current & Service Weekly for next date'
WebUI.delay(5)

'Re-calculation for deduction change'
WebUI.click(findTestObject('Page_Payroll Entry - Payroll Relief/button_Calculate (2)'))

'Review changes made from recalculation'
WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/Review')

WebUI.click(findTestObject('Page_Payroll Review - Payroll Relie/span_CTWilson Jessie-1'))

WebUI.delay(10)

not_run: WebUI.closeBrowser()

