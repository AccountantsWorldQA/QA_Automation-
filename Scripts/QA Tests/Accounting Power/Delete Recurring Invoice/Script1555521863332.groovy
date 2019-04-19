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

WebUI.navigateToUrl('https://qa-app.accountingpower.com/CustomerInvoice/List')

WebUI.click(findTestObject('Object Repository/Page_Invoice List - Accounting Powe/button_Recurring List (1)'))

'Delete a Recurring Invoice'
WebUI.delay(10)

WebUI.navigateToUrl('https://qa-app.accountingpower.com/CustomerInvoice/Entry')

'Select any past invoice'
WebUI.delay(3)

WebUI.click(findTestObject('Page_Customer Invoice - Accounting /span_Nickels Payless( 1076 )'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Customer Invoice - Accounting/Make invoice Recurring- AP1'))

WebUI.click(findTestObject('Page_Customer Invoice - Accounting/Discription Name - AP1'))

WebUI.setText(findTestObject(null), 'Automated')

WebUI.click(findTestObject('Page_Customer Invoice - Accounting/Select Month - AP1'))

WebUI.selectOptionByIndex(findTestObject('Page_Customer Invoice - Accounting/Select Month - AP1'), 3)

WebUI.click(findTestObject('Page_Customer Invoice - Accounting/Select Date - AP1'))

WebUI.selectOptionByIndex(findTestObject('Page_Customer Invoice - Accounting/Select Date - AP1'), 3)

WebUI.click(findTestObject('Page_Customer Invoice - Accounting/Start Date - AP1'))

WebUI.click(findTestObject('Page_Customer Invoice - Accounting/End Date - AP1'))

WebUI.setText(findTestObject('Page_Customer Invoice - Accounting/Start Date - AP1'), '111318')

WebUI.setText(findTestObject('Page_Customer Invoice - Accounting/End Date - AP1'), '101022')

WebUI.delay(0)

WebUI.click(findTestObject('Page_Customer Invoice - Accounting /button_Ok'))

WebUI.click(findTestObject('Page_Customer Invoice - Accounting /button_Save'))

WebUI.click(findTestObject('Page_Customer Invoice - Accounting /button_List'))

WebUI.click(findTestObject('Object Repository/Page_Invoice List - Accounting Powe/button_Recurring List (1)'))

