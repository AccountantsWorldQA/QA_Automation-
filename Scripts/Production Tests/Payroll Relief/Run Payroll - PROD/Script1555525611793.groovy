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

WebUI.navigateToUrl('https://login.accountantsoffice.com/login?firmCode=ewizards')

WebUI.setText(findTestObject('Page_Log in - AccountantsOffice/input_User Name_UserName (2)'), 'gjohnson')

WebUI.setEncryptedText(findTestObject('Page_Log in - AccountantsOffice/input_Password_Password (3)'), 'lb6CZRuikkT48jqepzyNUg==')

WebUI.click(findTestObject('Page_Log in - AccountantsOffice/input_Password_btn btn-default (1)'))

WebUI.click(findTestObject('Page_Select verification method - AccountantsOffice/input_or_btn btn-default (2)'))

WebUI.delay(25, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Enter verification code - AccountantsOffice/input_Remember this browser_btn btn-default (2)'))

WebUI.click(findTestObject('Page_Welcome Greeshma CSO Admin - Accountants Office/span_Payroll Relief (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Select Client - Payroll Relief/input_concat(id(  select2-drop-mask  ))_s2id_autogen2_search (2)'), 
    'wi')

WebUI.click(findTestObject('Page_Select Client - Payroll Relief/div_Widget Manufacturing Corp AWSample  - 06102019'))

WebUI.delay(15)

WebUI.navigateToUrl('https://app.payrollrelief.com/Payroll/ListEntry')

WebUI.click(findTestObject('Object Repository/Page_Dashboard - Payroll Relief/a_Payroll Entry (2)'))

WebUI.click(findTestObject('Page_Payroll Entry - Payroll Relief/button_Calculate (4)'))

WebUI.click(findTestObject('Page_Payroll Entry - Payroll Relief/button_Calculate (4)'))

WebUI.click(findTestObject('Object Repository/Page_Payroll Summary - Payroll Relief/button_EMail'))

WebUI.click(findTestObject('Object Repository/Page_Payroll Summary - Payroll Relief/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_Payroll Summary - Payroll Relief/button_Report'))

WebUI.click(findTestObject('Object Repository/Page_Payroll Summary - Payroll Relief/button_Approve'))

WebUI.click(findTestObject('Object Repository/Page_Print Checks - Payroll Relief/button_Archive (1)'))

WebUI.click(findTestObject('Object Repository/Page_Print Checks - Payroll Relief/button_Yes (1)'))

WebUI.click(findTestObject('Object Repository/Page_Print Checks - Payroll Relief/button_Email Reports (1)'))

WebUI.click(findTestObject('Object Repository/Page_Print Checks - Payroll Relief/button_Yes (1)'))

WebUI.click(findTestObject('Object Repository/Page_Print Checks - Payroll Relief/button_Print'))

WebUI.click(findTestObject('Object Repository/Page_Print Checks - Payroll Relief/button_OK'))

WebUI.delay(25)

