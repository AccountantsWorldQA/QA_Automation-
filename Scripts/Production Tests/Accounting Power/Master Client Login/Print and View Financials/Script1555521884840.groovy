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

WebUI.setText(findTestObject('Page_Log in - AccountantsOffice/input_UserName (2)'), 'KatalonMasterClient')

WebUI.setEncryptedText(findTestObject('Page_Log in - AccountantsOffice/input_Password (2)'), 'lb6CZRuikkT48jqepzyNUg==')

WebUI.click(findTestObject('Page_Enter verification code - Acco/Submit code button -3 (1)'))

WebUI.click(findTestObject('Page_Welcome KatalonMasterClient -/span_Accounting Power'))

WebUI.click(findTestObject('Page_Select Client - Accounting Pow/i_Select_icon-dropdown'))

WebUI.click(findTestObject('Page_Select Client - Accounting Pow/a_Whitehorse Sales LTD White00'))

WebUI.delay(5)

WebUI.navigateToUrl('https://qa-app.accountingpower.com/PrintFinancials/Print')

WebUI.click(findTestObject('Page_Print Financials - Accounting/Print_Financials'))

WebUI.delay(5)

WebUI.navigateToUrl('https://qa-app.accountingpower.com/PrintFinancials/Review')

WebUI.click(findTestObject('Object Repository/Page_View Financials - Accounting P/button_View'))

WebUI.click(findTestObject('Object Repository/Page_View Financials - Accounting P/button_Excel'))

