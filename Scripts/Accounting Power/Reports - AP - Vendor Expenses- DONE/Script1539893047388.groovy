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

'Vendor Card '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/VendorCard')

WebUI.click(findTestObject('Object Repository/Page_Vendor Expenses Reports - Acco/a_Vendor Card'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Vendor Expenses Reports - Acco/select_--Select All--Acme Supp'), 
    '126751', true)

WebUI.click(findTestObject('Object Repository/Page_Vendor Expenses Reports - Acco/input_concat(Show only 1099 ve'))

WebUI.click(findTestObject('Object Repository/Page_Vendor Expenses Reports - Acco/button_PDF'))

WebUI.click(findTestObject('Object Repository/Page_Vendor Expenses Reports - Acco/a_Vendor List'))

WebUI.click(findTestObject('Object Repository/Page_Vendor Expenses Reports - Acco/button_PDF'))

WebUI.click(findTestObject('Object Repository/Page_Vendor Expenses Reports - Acco/a_Vendor Profile Detail'))

WebUI.click(findTestObject('Object Repository/Page_Vendor Expenses Reports - Acco/button_PDF'))

WebUI.click(findTestObject('Object Repository/Page_Vendor Expenses Reports - Acco/a_Accounts Payable Aging'))

WebUI.click(findTestObject('Object Repository/Page_Vendor Expenses Reports - Acco/button_PDF'))

WebUI.click(findTestObject('Object Repository/Page_Vendor Expenses Reports - Acco/a_Vendor Register'))

WebUI.click(findTestObject('Object Repository/Page_Vendor Expenses Reports - Acco/button_PDF'))

WebUI.click(findTestObject('Object Repository/Page_Vendor Expenses Reports - Acco/a_Vendor Bills Summary'))

WebUI.click(findTestObject('Object Repository/Page_Vendor Expenses Reports - Acco/button_PDF'))

WebUI.closeBrowser()

