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

WebUI.acceptAlert()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa-login.accountantsoffice.com/login?firmCode=aworldqa')

WebUI.setText(findTestObject('Page_Log in - AccountantsOffice/input_UserName'), 'gjmissing')

WebUI.setEncryptedText(findTestObject('Page_Log in - AccountantsOffice/input_Password'), 'QJblfja5Cso=')

WebUI.click(findTestObject('Page_Enter verification code - Acco/Submit code button -3'))

WebUI.click(findTestObject('Page_Welcome Greeshma Johnson - Acc/span_Payroll Relief'))

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employer/EmployerContact')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employer/PaySchedules')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employer/TaxInfo')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employer/EmployerPayTypes')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employer/EmployerDeductions')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employer/Preferences')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employer/Accounts')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/EmployerDepartment/Department')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/EmployerJob')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employer/PTODefaults')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employer/ClientPermissions')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employer/EmployerSetupList')

WebUI.delay(10)

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employee')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employee/List')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employee/Import')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employee/Warnings')

WebUI.delay(0)

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/EServices/Status')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/EServices/ACHTransactions')

WebUI.navigateToUrl('')

WebUI.delay(0)

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/ListEntry')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/ByPaycheck')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/Import')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/Options')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/ListEntry')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/ByPaycheck')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/Import')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/Options')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/PrintChecks')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/PrintThirdPartyChecks')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/Allocation')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/PayrollRegister/Register')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/EmployeePaychecks')

WebUI.delay(0)

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/PendingPayments')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/PaymentsMade')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/AdditionalPayments')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/SpecialPaymentOptions')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/TaxForms')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/W2Forms')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/Form1099s')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/ComplianceACA/ACAEmployer?year=0')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/ComplianceACA/ACAEmployee')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/ComplianceACA/ACAForms')

WebUI.delay(0)

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/PayrollRegister')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/ContractorPaymentRegister')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/PayrollSummary')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/CheckRecord')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/DirectDeposits')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/DeductionsRegister')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/PayrollComparison')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/TaxLiabilitiesAndPayments')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/TaxPayments')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/FederalWHAndUISummary')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/StateWHAndUISummary')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/PendingTaxPayments')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/TaxableWages')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/W2Report')

WebUI.navigateToUrl('')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/PayrollHistory')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/CheckRegister')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/HiredOrTerminatedEmployees')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/ContractorList')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/EmployeePayroll')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/ContractorPaymentSummary')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/EmployeeHoursPaid')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/EmployeeEarningsAndTaxes')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/EmployeeEarningsByType')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/AccruableBenefits')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/EmployeePaystubs')

WebUI.delay(0)

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Report/PayrollSet?reportSetNumber=0')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Integration/SmartLink')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Integration/ExportGLtoQBOnline')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Integration/ExportPayrollData')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Integration/workerscompexport')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Integration/PayrollAPIKeys')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Resources/TrainingVideos')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/EmploymentForms')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Resources/FormsandPubs')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Resources/Links')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Resources/FormsandPubs?samplereports=1')

WebUI.delay(0)

