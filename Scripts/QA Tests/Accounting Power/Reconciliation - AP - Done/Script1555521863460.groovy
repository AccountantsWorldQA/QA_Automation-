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

WebUI.navigateToUrl('https://qa-app.accountingpower.com/BankRec/Reconciliation')

'BANK SERVICE CHARGE - 10, INTEREST EARNED 10 - TOTAL: 276,305.00'
WebUI.delay(18)

WebUI.click(findTestObject('Page_Reconciliation - Accounting Po/button_Reconcile'))

WebUI.click(findTestObject('Page_Reconciliation - Accounting Po/button_Reconcile'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Reconciliation - Accounting Po/select_--Select Date--53120174'))

WebUI.selectOptionByIndex(findTestObject('Page_Reconciliation - Accounting Po/select_--Select Date--53120174'), '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Reconciliation - Accounting Po/button_Unreconcile'))

WebUI.click(findTestObject('Page_Reconciliation - Accounting Po/button_Yes'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Reconciliation - Accounting Po/button_Attach'))

WebUI.click(findTestObject('Page_Reconciliation - Accounting Po/div_8655 Example(2).pdf'))

WebUI.delay(0)

WebUI.click(findTestObject('Page_Reconciliation - Accounting Po/button_Attach Selected'))

WebUI.click(findTestObject('Page_Reconciliation - Accounting Po/button_Preview'))

WebUI.delay(0)

WebUI.click(findTestObject('Page_Reconciliation - Accounting Po/button_Detach'))

WebUI.click(findTestObject('Page_Reconciliation - Accounting Po/button_Send'))

WebUI.delay(0)

WebUI.click(findTestObject('Page_Reconciliation - Accounting Po/span_Archive'))

WebUI.click(findTestObject('Page_Reconciliation - Accounting Po/button_Send'))

WebUI.click(findTestObject('Page_Reconciliation - Accounting Po/button_Save'))

WebUI.delay(0)

WebUI.click(findTestObject('Page_Reconciliation - Accounting Po/span_Print'))

