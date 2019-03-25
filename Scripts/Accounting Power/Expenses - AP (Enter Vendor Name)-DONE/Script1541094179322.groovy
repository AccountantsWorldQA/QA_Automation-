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

WebUI.setText(findTestObject('Page_Enter Bills - Accounting Power/input_Select vendor_vendorSele'), 'al')

WebUI.delay(0)

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/a_Alturas Logistics'))

WebUI.setText(findTestObject('Page_Enter Bills - Accounting Power/input_Select vendor_vendorSele'), 'Alturas Logistics')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/button_Attach'))

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/div_8655 Example.pdf'))

WebUI.delay(0)

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/button_Attach Selected'))

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/button_Preview'))

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/button_Detach'))

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/label_Has inventory items'))

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/label_Recover expenses from cu'))

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/After Job Costing-Alturas Farms'))

WebUI.selectOptionByIndex(findTestObject('Page_Enter Bills - Accounting Power/After Job Costing-Alturas Farms'), 1)

WebUI.selectOptionByValue(findTestObject('Page_Enter Bills - Accounting Power/select_--Select Account--5000'), '5873932', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Enter Bills - Accounting Power/select_--Select--Other Items'), '-1', true)

WebUI.setText(findTestObject('Page_Enter Bills - Accounting Power/input_TOTAL_form-control right'), '10')

WebUI.selectOptionByValue(findTestObject('Page_Enter Bills - Accounting Power/select_--Select--Sierra Nevada'), '23678', 
    true)

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/div_Select vendor             '))

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/button_Attach'))

WebUI.delay(0)

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/div_8655 Example.pdf'))

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/button_Attach Selected'))

WebUI.setText(findTestObject('Page_Enter Bills - Accounting Power/input_Amount_form-control righ'), '10')

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/button_Save'))

WebUI.delay(0)

WebUI.setText(findTestObject('Page_Enter Bills - Accounting Power/input_TOTAL_form-control right'), '10')

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/button_Save'))

WebUI.click(findTestObject('Page_Enter Bills - Accounting Power/button_List'))

