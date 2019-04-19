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

WebUI.delay(6)

WebUI.navigateToUrl('https://qa-app.accountingpower.com/CustomerInvoice/Entry')

WebUI.click(findTestObject('Page_Customer Invoice - Accounting/button_Recent Invoices'))

'USE delay to click on Recent '
WebUI.delay(3)

WebUI.click(findTestObject('Page_Customer Invoice - Accounting/span_Eastern Industries - Whitehorse'))

'USe Delay to add a discount and SAVE'
WebUI.delay(10)

WebUI.click(findTestObject('Page_Customer Invoice - Accounting/button_Send'))

'Click Email'
WebUI.click(findTestObject('Page_Customer Invoice - Accounting/span_Email'))

WebUI.click(findTestObject('Page_Customer Invoice - Accounting/button_Send'))

'Click Print'
WebUI.click(findTestObject('Page_Customer Invoice - Accounting/span_Print'))

'Click list'
WebUI.click(findTestObject('Page_Customer Invoice - Accounting/button_List'))

WebUI.click(findTestObject('Page_Invoice List - Accounting Powe/span_Send_caret'))

'Send > Arhive'
WebUI.click(findTestObject('Page_Invoice List - Accounting Powe/span_Archive'))

'Make excel'
WebUI.click(findTestObject('Page_Invoice List - Accounting Powe/button_Excel'))

'Click on Recurring List'
WebUI.click(findTestObject('Page_Invoice List - Accounting Powe/button_Recurring List'))

'Select one Manual '
WebUI.click(findTestObject('Page_Recurring Invoices - Accountin/input'))

'Select one Manual '
WebUI.click(findTestObject('Page_Recurring Invoices - Accountin/input'))

'Select all manual'
WebUI.click(findTestObject('Page_Recurring Invoices - Accountin/span_Delete_ui-icon ui-icon-ch'))

'Unselect all Manual'
WebUI.click(findTestObject('Page_Recurring Invoices - Accountin/span_Delete_ui-icon ui-icon-ci'))

WebUI.navigateToUrl('https://qa-app.accountingpower.com/CustomerInvoice/Entry')

WebUI.setText(findTestObject('Object Repository/Page_Customer Invoice - Accounting/input_Bill to_searchCustomer'), 'katalon')

WebUI.setText(findTestObject('Object Repository/Page_Customer Invoice - Accounting/input_Address 2_form-control'), 'Katalon')

WebUI.delay(6)

WebUI.click(findTestObject('Page_Customer Invoice - Accounting/Select Department - Sales'))

WebUI.selectOptionByIndex(findTestObject('Page_Customer Invoice - Accounting/Select Department - Sales'), 0)

WebUI.click(findTestObject('Page_Customer Invoice - Accounting/Select Template - Sales'))

WebUI.selectOptionByIndex(findTestObject('Page_Customer Invoice - Accounting/Select Template - Sales'), 2)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Customer Invoice - Accounting/button_Save (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Customer Invoice - Accounting/button_Delete'))

WebUI.delay(15)

