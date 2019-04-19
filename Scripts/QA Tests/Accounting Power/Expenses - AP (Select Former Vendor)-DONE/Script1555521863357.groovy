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

WebUI.click(findTestObject('Page_Select Client - Accounting Pow/a_Expenses'))

WebUI.click(findTestObject('Page_Select Client - Accounting Pow/a_Enter Bills'))

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/button_Recent Bills (1)'))

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/span_Alturas Logistics(None)'))

WebUI.delay(0)

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/label_Has inventory items'))

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/label_Recover expenses from cu'))

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/label_Has job costing'))

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/After Job Costing-Alturas Farms'))

WebUI.selectOptionByIndex(findTestObject('Page_Enter Bills - Accounting Power/After Job Costing-Alturas Farms'), 1)

WebUI.setText(findTestObject('Page_Enter Bills - Accounting Power/input_TOTAL_form-control right'), '10')

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/button_Save'))

WebUI.delay(0)

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/button_Preview'))

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/button_Detach'))

WebUI.delay(0)

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/button_Attach'))

WebUI.delay(0)

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/div_8655 Example.pdf'))

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/button_Attach Selected'))

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/button_Save'))

WebUI.delay(0)

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/button_List'))

WebUI.click(findTestObject('Object Repository/Page_Vendors - Accounting Power/button_Excel (1)'))

WebUI.click(findTestObject('Object Repository/Page_Vendors - Accounting Power/button_Recurring Bills'))

WebUI.closeBrowser()

