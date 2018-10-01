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

WebUI.click(findTestObject('Object Repository/Page_Welcome Greeshma Staff - Accou/span_Accounting Power CAS'))

WebUI.click(findTestObject('Page_Select Client - Payroll Relief/span_Enter client code or name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Select Client - Accounting Pow/span_Enter client code or name -2'))

WebUI.click(findTestObject('Page_Select Client - Accounting Pow/div_KatalonQA KatalonQA -2'))

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

'Company > Setup'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/CompanySetup/Setup')

'Company > Account\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Company/AccountSetup')

'Company > Banks/ Credit Card\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Bank/List')

'Company > Payroll\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Employee/Setup')

'Company > Permissions\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Company/Permissions')

'Company > Alerts\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Company/Alerts')

'Company > Checklist\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Company/SetupCheckList')

WebUI.delay(5)

'Banking > Check Writing '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Checks/AddCheck')

'Banking > Check Printing\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Checks/List')

'Banking > Cash Recipts\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/CustomerPayments/CashReceipts')

'Banking > Upload E-Statements\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Bank/EStatement')

'Banking > Cash Transfers\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Bank/TransferFunds')

'Banking > Reconciliation'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Bank/SetupBank?bankRecType=A')

'Banking > Register\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/CashCheckRegister/CashRegister')

WebUI.delay(5)

'Sales > Customer Invoice'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/CustomerInvoice/Entry')

'Sales > Invoice List\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/CustomerInvoice/List')

'Sales >Payments\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/CustomerPayments/Payments')

'Sales > Customer Center> Customers'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Customer/Setup')

'Sales > Customer Center > Customer List \r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Customer/List')

'Sales > Customers Center > Customer Transactions '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Customer/TransactionList')

'Sales  > Customer Center > Customer Statements '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Customer/Statement')

'Sales > Customer Center > Refund Checks '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Customer/Refund')

'Sales > Setup Products '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Product/Setup')

'Sales > Sales tax payments '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Sales/SalesTaxPayment')

'Sales > Preferences'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Sales/Preferences')

'Sales > Customize Invoice '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Sales/CustomizeInvoice')

WebUI.delay(5)

'Job Costing > Setup '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Jobs/Setup')

'Job Costing > Tranasactions \r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Jobs/Transactions')

'Job Costing > Ananalysis \r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Jobs/Analysis')

'Job Costing > Settings\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Jobs/DefaultSettings')

WebUI.delay(0)

'Expenses > Enter Bills\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/VendorBill/Entry')

'Expenses > Pay Bills\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/VendorBillPayment/PayBill')

'Expenses > Credit Card'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/CreditCard/ccBill')

'Expenses > Vendor Setup \r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Vendor/Setup')

'Expenses > Vendor List\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Vendor/List')

'Expenses > Bill List\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Vendor/BillList')

'Expenses > Bill Payment'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Vendor/PaymentList')

'Expenses > Process 1099'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Utilities/Process1099s')

WebUI.delay(0)

'Inventory '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Inventory/Adjustment')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Inventory/Summary')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Inventory/Setup')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Inventory/Update')

WebUI.navigateToUrl('https://qa-app.accountingpower.com/Inventory/Preferences')

WebUI.delay(0)

'Write Up > Entry'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Writeup/TransactionEntry')

'Write Up > Edit Transaction '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Writeup/EditTransaction')

'Write Up > Template\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Templates/Templates')

'Write Up > General Journal'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Writeup/GJ')

'Write Up > Payroll Register'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/PayrollRegister/PayrollRegister')

'Write Up > Move\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Writeup/MoveTransactions')

'Write Up > Suspense'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Writeup/SuspenseAccount')

WebUI.delay(0)

'Trial Balance > Trial Balance \r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/TrialBalance/TrialBalance')

'Trial Balance > General Ledger '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/TrialBalance/GeneralLedger')

'Trial Balance > Journal'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Writeup/Journals')

'Trial Balance > Tax Links\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/TaxLinks')

'Trial Balance > Adjustments'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Adjustment/AdjustmentJournals')

'Trial Balance > Close Period '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/TrialBalance/ClosePeriod')

'Trial Balance > Close Year'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/TrialBalance/CloseYear')

'Trial Balance > Budget'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Budget/Entry')

'Trial Balance > Financial Ratio'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/FinancialRatios/EditRatios')

WebUI.delay(0)

'Financials > Print Financials \r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/PrintFinancials/Print')

'View Financials'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/PrintFinancials/Review')

'Financial Preferences'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/FinancialPreferences/GeneralOptions')

'Cash flow formatting'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Financials/CashFlow')

'Customize'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/CustomFinancials/Customize')

'Group Codes'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/CustomFinancials/GroupCodes')

'Letters'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Financials/Letters')

WebUI.delay(0)

'Reports > Company Reports > Performance Analysis\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/PerformanceAnalysis')

'Reports > Company Reports > Chart of Accounts'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/ChartOfAccounts')

'Reports > Company Reports >Group Codes'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/GroupCodes')

'Reports > Company Reports > Budget Report'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/BudgetReport')

'Reports > Company Reports >Employee List'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/EmployeeList')

'Reports > Company Reports > Company Profile'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/CompanyProfile')

'Reports > Company Reports > Activity Log'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/ExceptionReport')

'Trial Balance'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/TrialBalance')

'Reports > Transactions Reports > General Ledger '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/GeneralLedger')

'Reports > Transactions Reports > Transaction Journals'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/TransactionJournals')

'Reports > Transactions Reports > Departmental Tranaction '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/DepartmentalTransactions')

'Reports > Transactions Reports > Adjustment Journals'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/AdjustmentJournals')

'Reports > Transactions Reports > Cash Register '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/CashRegister')

'Reports > Transactions Reports > Check Register '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/CheckRegister')

'Reports > Transactions Reports > Payroll Register'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/PayrollRegister')

'Customer Sales Reports > Customer List '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/CustomerList')

'Customer Sales Reports > Customer Receipts '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/CustomerReceipts')

'Customer Sales Reports > Financial Charges'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/FinanceCharges')

'Customer Sales Reports > Sales Tax Liability'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/SalesTaxLiability')

'Customer Sales Reports > Accounts Receivable'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/AccountsReceivableAging')

'Customer Sales Reports > Invoice Register'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/InvoiceRegister')

'Customer Sales Reports > Sales Report'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/SalesReport')

'Customer Sales Reports > Customer Balances'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/CustomerBalances')

'Customer Sales Reports > Products Services'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/ProductsAndServices')

'Customer Sales Reports > Past Due Invoices'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/CustomerInvoiceSummary')

'Vendor Expenses Reports > Vendor Card'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/VendorCard')

'Vendor Expenses Reports > Vendor List'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/VendorProfileSummary')

'Vendor Expenses Reports > Vendor Profile Detail '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/VendorProfileDetail')

'Vendor Expenses Reports > Accounts Payable Aging'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/AccountsPayableAging')

'Vendor Expenses Reports > Vendor Register'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/VendorRegister')

'Vendor Expenses Reports > Vendor Bills Summary'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/VendorExpenseSummary')

'Job Costing Reports > Job List'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/JobList')

'Job Costing Reports > Job Profit and Loss Summary'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/JobProfitLossSummary')

'Job Costing Reports > Job Profitability '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/JobProfitability')

'Inventory Reports > Inventory Summary'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/InventorySummary')

'Inventory Reports > Cost of Goods Sold'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/CostOfGoodsSold')

'Inventory Reports > Profitability '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/Profitability')

'Inventory Reports > Transactions'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/Transactions')

'Report Sets'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Report/ReportSet')

WebUI.delay(0)

'Utility > Purge all Transactions'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Utilities/UploadDocuments')

WebUI.delay(0)

'Integration > Tranasfer from Payroll'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Integration/ExportPayrollData')

'Standard Import\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Integration/Import')

'QB Online Import'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Integration/QBOnlineImport')

'Import data from QuickBooks PC'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Integration/AccountingLink')

'Export'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Integration/Export')

'Sync with Bill.Com'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/BillDotCom')

WebUI.delay(0)

'Resources > Support Doc\r\n'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Resources/SupportingDocs')

'Publications'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Resources/Publications')

'Training Videos'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Resources/TrainingVideos')

'Demos'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Resources/Demos')

'Webinars'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Resources/Webinars')

WebUI.delay(0)

'Client Center > Client Snapshot'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Firm/ClientSnapshot')

'Manage Client Notifications'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Firm/ClientActivity')

'Bill Payment Services'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Firm/BillPaymentService')

WebUI.delay(0)

'Firm Admin > Client Managment '
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Firm/ClientManagement')

'Firm Admin > Email Log'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Email/EmailLog')

'Firm Admin > Consolidate'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/SetupConsolidated/SetupConsolidatedCompany?isNew=True')

'Firm Admin > Firm Options'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Firm/FirmOptions')

'Firm Admin > Enhansement'
WebUI.navigateToUrl('https://qa-app.accountingpower.com/Firm/Announcements')

WebUI.delay(0)

WebUI.click(findTestObject('Page_Notes - Accounting Power/Notes Icon'))

WebUI.click(findTestObject('Page_Alerts - Accounting Power/Alert Icon'))

WebUI.click(findTestObject('Page_Dashboard - Accounting Power/Dashboard Icon'))

WebUI.click(findTestObject('Page_Notes - Accounting Power/Help Icon'))

WebUI.click(findTestObject('Page_Notes - Accounting Power/Support Icon AP'))

WebUI.click(findTestObject('Page_Notes - Accounting Power/Cloud Icon AP'))

