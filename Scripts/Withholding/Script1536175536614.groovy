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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa-login.accountantsoffice.com/login?firmCode=aworldqa')

WebUI.setText(findTestObject('Page_Log in - AccountantsOffice/input_UserName'), 'greeshmaj')

WebUI.setEncryptedText(findTestObject('Page_Log in - AccountantsOffice/input_Password'), 'lb6CZRuikkT48jqepzyNUg==')

'Clicks on the login button '
WebUI.click(findTestObject('Page_Enter verification code - Acco/Submit code button -3'))

WebUI.click(findTestObject('Page_Welcome Greeshma Johnson - Acc/span_Payroll Relief'))

WebUI.click(findTestObject('Page_Select Client - Payroll Relief/PR_Enter client code or name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Select Client - Payroll Relief/div_SZ Star Restaurant Inc szt'))

WebUI.delay(5)

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employee')

WebUI.selectOptionByValue(findTestObject('Page_EmployeeContractor Setup - Pay/select_Jessie (1)'), '1567712', true)

WebUI.click(findTestObject('Page_EmployeeContractor Setup - Pay/a_Taxes (1)'))

'Delay allows for data manipulation '
WebUI.delay(10)

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/ListEntry')

WebUiBuiltInKeywords.click(findTestObject('Page_Payroll Entry - Payroll Relief/button_Calculate (1)'))

WebUiBuiltInKeywords.click(findTestObject('Page_Payroll Entry - Payroll Relief/a_Details'))

WebUiBuiltInKeywords.click(findTestObject('Page_Payroll Review - Payroll Relie/Select Jessie - Details'))

WebUI.click(findTestObject('Page_Payroll Modify - Payroll Relie/span_238.80'))

WebUI.verifyGreaterThan(523.18, 500)

WebUI.acceptAlert()

