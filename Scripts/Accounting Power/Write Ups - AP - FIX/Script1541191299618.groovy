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

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Writeup/TransactionEntry')

WebUI.click(findTestObject('Page_Transaction Entry - Accounting/DatePicker_WriteUp'))

WebUI.setText(findTestObject('Page_Transaction Entry - Accounting/DatePicker_WriteUp'), '021118')

WebUI.click(findTestObject('Page_Transaction Entry - Accounting/div_Date                      '))

'No issues thus far - Select 4 tranactions to post '
WebUI.delay(25)

WebUI.click(findTestObject('Page_Transaction Entry - Accounting/button_Post All Journals'))

'Choose time to span a Tranaction and remove'
WebUI.delay(5)

'Manually Click on Sales\r\n'
WebUI.click(findTestObject('Page_Transaction Entry - Accounting/Sales_List'))

WebUI.navigateToUrl('https://qa-app.accountingpower.com/writeup/edittransaction')

WebUI.click(findTestObject('Page_Edit Transaction - Accounting/DatePicker_WriteUp_2'))

WebUI.setText(findTestObject('Page_Edit Transaction - Accounting/DatePicker_WriteUp_2'), '020318')

WebUI.click(findTestObject('Page_Transaction Entry - Accounting/div_Date                      '))

WebUI.click(findTestObject('Page_Edit Transaction - Accounting/DatePicker_WriteUp_2_End'))

WebUI.setText(findTestObject('Page_Edit Transaction - Accounting/DatePicker_WriteUp_2_End'), '022818')

WebUI.click(findTestObject('Page_Transaction Entry - Accounting/div_Date                      '))

WebUI.click(findTestObject('Page_Edit Transaction - Accounting/Show_Offset'))

WebUI.delay(5)

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Templates/Templates')

WebUI.click(findTestObject('Page_Transaction Templates - Accoun/button_Add New'))

WebUI.setText(findTestObject('Page_Transaction Templates - Accoun/input_Template Code_templatena'), 'QATemplate')

WebUI.click(findTestObject('Page_Transaction Entry - Accounting/div_Date                      '))

WebUI.click(findTestObject('Page_Transaction Templates - Accoun/button_Add New_1'))

WebUI.click(findTestObject('Page_Transaction Templates - Accoun/i_Department_icon-dropdown'))

'Use Delay to make adjustments to Template'
WebUI.delay(10)

WebUI.setText(findTestObject('Page_Transaction Templates - Accoun/input_Template Code_templatena'), 'qa')

WebUI.click(findTestObject('Page_Transaction Templates - Accoun/button_Templates'))

WebUI.click(findTestObject('Page_Transaction Templates - Accoun/ul_QATemplate'))

WebUI.click(findTestObject('Page_Transaction Templates - Accoun/button_Delete'))

WebUI.delay(10)

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Writeup/GJ')

WebUI.click(findTestObject('Page_General Journal - Accounting P/select_-- Select --1 KatalonTe'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_General Journal - Accounting P/select_-- Select --1 KatalonTe'), 
    '1', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_General Journal - Accounting P/button_Attach (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_General Journal - Accounting P/select_-- Select --1 KatalonTe'), 
    '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_General Journal - Accounting P/button_Attach (1)'))

WebUI.click(findTestObject('Object Repository/Page_General Journal - Accounting P/div_Outlook Setup IMAP-SMTP_fr_2'))

WebUI.click(findTestObject('Object Repository/Page_General Journal - Accounting P/button_Attach Selected (1)'))

WebUI.click(findTestObject('Object Repository/Page_General Journal - Accounting P/button_Save (1)'))

WebUI.selectOptionByIndex(findTestObject('Object Repository/Page_General Journal - Accounting P/select_-- Select --1 KatalonTe'), 
    '2', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_General Journal - Accounting P/button_Preview (1)'))

WebUI.click(findTestObject('Object Repository/Page_General Journal - Accounting P/button_Detach (1)'))

WebUI.click(findTestObject('Object Repository/Page_General Journal - Accounting P/button_Delete (1)'))

WebUI.click(findTestObject('Object Repository/Page_General Journal - Accounting P/button_Yes (1)'))

