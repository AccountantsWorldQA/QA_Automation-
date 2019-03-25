import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa-login.accountantsoffice.com/login?firmCode=aworldqa')

WebUI.setText(findTestObject('Page_Log in - AccountantsOffice/input_UserName'), 'greeshmaj')

WebUI.setEncryptedText(findTestObject('Page_Log in - AccountantsOffice/input_Password'), 'lb6CZRuikkT48jqepzyNUg==')

WebUI.click(findTestObject('Page_Enter verification code - Acco/Submit code button -3'))

WebUI.click(findTestObject('Page_Welcome Greeshma Staff - Accou/span_Accounting Power CAS'))

WebUI.click(findTestObject('Page_Select Client - Payroll Relief/span_Enter client code or name'), FailureHandling.STOP_ON_FAILURE)

'****Client needs to be changed. '
WebUI.click(findTestObject('Page_Setup - Accounting Power/MAIN AP Client - Whitehorse'))

WebUI.delay(2)

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/PerformanceAnalysis')

WebUI.click(findTestObject('Object Repository/Page_Company Reports - Accounting P/a_Performance Analysis'))

WebUI.click(findTestObject('Object Repository/Page_Company Reports - Accounting P/button_PDF'))

WebUI.click(findTestObject('Object Repository/Page_Company Reports - Accounting P/a_Chart of Accounts'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Company Reports - Accounting P/select_All Asset Liability Cap'), 
    'A', true)

WebUI.click(findTestObject('Object Repository/Page_Company Reports - Accounting P/button_PDF'))

WebUI.click(findTestObject('Object Repository/Page_Company Reports - Accounting P/a_Group Codes'))

WebUI.click(findTestObject('Object Repository/Page_Company Reports - Accounting P/button_PDF'))

WebUI.click(findTestObject('Object Repository/Page_Company Reports - Accounting P/a_Budget Report'))

WebUI.click(findTestObject('Object Repository/Page_Company Reports - Accounting P/input_Show Annual_ShowAnnual'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Company Reports - Accounting P/select_--Select All-- Main Sto'), 
    '4634', true)

WebUI.click(findTestObject('Object Repository/Page_Company Reports - Accounting P/button_PDF'))

WebUI.click(findTestObject('Object Repository/Page_Company Reports - Accounting P/a_Employee List'))

WebUI.click(findTestObject('Object Repository/Page_Company Reports - Accounting P/button_PDF'))

WebUI.click(findTestObject('Object Repository/Page_Company Reports - Accounting P/a_Company Profile'))

WebUI.click(findTestObject('Object Repository/Page_Company Reports - Accounting P/button_PDF'))

WebUI.click(findTestObject('Object Repository/Page_Company Reports - Accounting P/a_Activity Log'))

WebUI.click(findTestObject('Object Repository/Page_Company Reports - Accounting P/button_PDF'))

