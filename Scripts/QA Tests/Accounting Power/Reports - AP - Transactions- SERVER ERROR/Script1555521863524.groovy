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

'Tranactions Tab \r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/TrialBalance')

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/input_Prior Year_ShowPriorYear (1)'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/input_Notes_ShowNotes (1)'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/label_Tickmarks (1)'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/input_Show debit and credit fo (1)'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/input_Show all accounts_ShowAl (1)'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/input_Includes Adjustment Deta (1)'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/input_Subtotal By Account Type (1)'))

'CURRENTLY SERVER ERROR (Issue on both DEV and PROD) '
WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/button_PDF (1)'))

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/TrialBalance')

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/a_General Ledger'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/label_Group by Periods'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/label_Show Departments'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/button_PDF (1)'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/a_Transaction Journals'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/button_PDF (1)'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/a_Departmental Transactions'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Transactions Reports - Account/select_--Select All-- Sierra N'), 
    '23677', true)

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/button_PDF (1)'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/a_Adjustment Journals'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/button_PDF (1)'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/a_Cash Register'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/button_PDF (1)'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/a_Check Register'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/button_PDF (1)'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/a_Payroll Register'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/button_PDF (1)'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/button_Archive'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/button_Excel'))

WebUI.click(findTestObject('Object Repository/Page_Transactions Reports - Account/button_Word'))

