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

WebUI.navigateToUrl('https://qa-app.accountingpower.com/CreditCard/ccBill')

WebUI.click(findTestObject('Object Repository/Page_Credit Card Entries - Accounti/button_Recent Bills'))

WebUI.click(findTestObject('Object Repository/Page_Credit Card Entries - Accounti/a_Credit Card Payable  0511201'))

WebUI.click(findTestObject('Object Repository/Page_Credit Card Entries - Accounti/button_Pay'))

WebUI.click(findTestObject('Object Repository/Page_Credit Card Entries - Accounti/button_Approve Payment'))

WebUI.click(findTestObject('Object Repository/Page_Check Printing - Accounting Po/button_Checks to Be Reprinted_'))

WebUI.click(findTestObject('Object Repository/Page_Check Printing - Accounting Po/button_Print Test'))

WebUI.click(findTestObject('Object Repository/Page_Check Printing - Accounting Po/button_Done'))

WebUI.click(findTestObject('Object Repository/Page_Check Printing - Accounting Po/span_Checks to Be Reprinted_ui_1'))

WebUI.click(findTestObject('Object Repository/Page_Check Printing - Accounting Po/button_Print'))

WebUI.click(findTestObject('Object Repository/Page_Check Printing - Accounting Po/button_Record checks'))

