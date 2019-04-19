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

WebUI.click(findTestObject('Page_Setup - Accounting Power/MAIN AP Client - Whitehorse'))

WebUI.delay(2)

'Job Costing\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/JobList')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/select_--Select All-- Arlinson'), 
    '66921', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/select_--Select-- A B C D'), 
    '1458', true)

WebUI.click(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/label_Completed'))

WebUI.click(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/label_Customer'))

WebUI.click(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/button_PDF'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/select_--Select-- A B C D'), 
    '--Select--', true)

WebUI.click(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/label_Active'))

WebUI.click(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/label_Job'))

WebUI.click(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/button_PDF'))

WebUI.click(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/a_Job Profit and Loss Summary'))

WebUI.click(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/button_PDF'))

WebUI.click(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/a_Job Profitability'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/select_--Select All-- Arlinson'), 
    '66921', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/select_--Select--1st Project'), 
    '311', true)

WebUI.click(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/label_Account'))

WebUI.click(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/button_PDF'))

WebUI.click(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/button_Archive'))

WebUI.click(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/button_Excel'))

WebUI.click(findTestObject('Object Repository/Page_Job Costing Reports - Accounti/button_Word'))

