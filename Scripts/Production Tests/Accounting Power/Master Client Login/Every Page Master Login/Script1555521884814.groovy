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

WebUI.setText(findTestObject('Page_Log in - AccountantsOffice/input_UserName'), 'KatalonMasterClient')

WebUI.setEncryptedText(findTestObject('Page_Log in - AccountantsOffice/input_Password'), 'lb6CZRuikkT48jqepzyNUg==')

WebUI.click(findTestObject('Page_Enter verification code - Acco/Submit code button -3'))

WebUI.click(findTestObject('Object Repository/Page_Welcome KatalonMasterClient -/span_Accounting Power'))

WebUI.click(findTestObject('Page_Select Client - Accounting Pow/i_Select_icon-dropdown'))

WebUI.click(findTestObject('Page_Select Client - Accounting Pow/a_Whitehorse Sales LTD White00'))

WebUI.delay(5)

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Jobs/Setup')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Jobs/Transactions')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Jobs/Analysis')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Jobs/DefaultSettings')

WebUI.delay(5)

WebUI.navigateToUrl('https://qa-app.accountingpower.com/VendorBill/Entry')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/VendorBillPayment/PayBill')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/CreditCard/ccBill')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Account/NotAuthorized')

WebUI.delay(5)

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Writeup/TransactionEntry')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Writeup/EditTransaction')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Templates/Templates')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Writeup/GJ')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/PayrollRegister/PayrollRegister')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Writeup/MoveTransactions')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Writeup/SuspenseAccount')

WebUI.delay(5)

WebUI.navigateToUrl('https://qa-app.accountingpower.com/TrialBalance/TrialBalance')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/TrialBalance/GeneralLedger')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Writeup/Journals')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/TrialBalance/ClosePeriod')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/FinancialRatios/EditRatios')

WebUI.delay(5)

WebUI.navigateToUrl('https://qa-app.accountingpower.com/PrintFinancials/Print')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/PrintFinancials/Review')

WebUI.delay(5)

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/PerformanceAnalysis')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/TrialBalance')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/CustomerList')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/JobList')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/InventorySummary')

WebUI.delay(5)

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Resources/Publications')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Resources/TrainingVideos')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Resources/Demos')

