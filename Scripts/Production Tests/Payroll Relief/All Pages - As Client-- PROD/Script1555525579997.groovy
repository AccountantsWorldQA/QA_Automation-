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

WebUI.navigateToUrl('https://login.accountantsoffice.com/login?firmCode=ewizards')

WebUI.setText(findTestObject('Page_Log in - AccountantsOffice/input_User Name_UserName'), 'greeshmaclient')

WebUI.setEncryptedText(findTestObject('Page_Log in - AccountantsOffice/input_Password_Password'), 'lb6CZRuikkT48jqepzyNUg==')

WebUI.click(findTestObject('Page_Log in - AccountantsOffice/input_Password_btn btn-default'))

WebUI.click(findTestObject('Object Repository/Page_Select verification method - AccountantsOffice/input_or_btn btn-default'))

WebUI.delay(20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Enter verification code - AccountantsOffice/input_Remember this browser_btn btn-default'))

WebUI.click(findTestObject('Object Repository/Page_Welcome Greeshma Client - Accountants Office/span_Payroll Relief'))

WebUI.navigateToUrl('https://app.payrollrelief.com/Employer/EmployerContact')

WebUI.navigateToUrl('https://app.payrollrelief.com/Employer/PaySchedules')

WebUI.navigateToUrl('https://app.payrollrelief.com/Employer/TaxInfo')

WebUI.navigateToUrl('https://app.payrollrelief.com/Employer/EmployerPayTypes')

WebUI.navigateToUrl('https://app.payrollrelief.com/Employer/EmployerPayTypes')

WebUI.navigateToUrl('https://app.payrollrelief.com/Employer/Preferences')

WebUI.navigateToUrl('https://app.payrollrelief.com/Employer/Accounts')

WebUI.navigateToUrl('https://app.payrollrelief.com/Employer/Locations')

WebUI.navigateToUrl('https://app.payrollrelief.com/Employer/Locations')

WebUI.navigateToUrl('https://app.payrollrelief.com/EmployerJob')

WebUI.navigateToUrl('https://app.payrollrelief.com/Employer/PTODefaults')

WebUI.navigateToUrl('https://app.payrollrelief.com/Employer/ClientPermissions')

WebUI.navigateToUrl('https://app.payrollrelief.com/Employer/EmployerSetupList')

WebUI.navigateToUrl('15')

WebUI.navigateToUrl('https://app.payrollrelief.com/Employee')

WebUI.navigateToUrl('https://app.payrollrelief.com/Employee/List')

WebUI.navigateToUrl('https://app.payrollrelief.com/Employee/Import')

WebUI.navigateToUrl('https://app.payrollrelief.com/Employee/Warnings')

WebUI.navigateToUrl('15')

WebUI.navigateToUrl('https://app.payrollrelief.com/EServices/Status')

WebUI.navigateToUrl('https://app.payrollrelief.com/EServices/ACHTransactions')

WebUI.navigateToUrl('15')

WebUI.navigateToUrl('https://app.payrollrelief.com/Payroll/ListEntry')

WebUI.navigateToUrl('https://app.payrollrelief.com/Payroll/Summary')

WebUI.navigateToUrl('https://app.payrollrelief.com/Payroll/PrintChecks')

WebUI.navigateToUrl('https://app.payrollrelief.com/Payroll/Allocation')

WebUI.navigateToUrl('https://app.payrollrelief.com/PayrollRegister/Register')

WebUI.navigateToUrl('https://app.payrollrelief.com/Payroll/EmployeePaychecks')

WebUI.navigateToUrl('15')

WebUI.navigateToUrl('https://app.payrollrelief.com/Compliance/PendingPayments')

WebUI.navigateToUrl('https://app.payrollrelief.com/Compliance/TaxForms')

WebUI.navigateToUrl('https://app.payrollrelief.com/Compliance/W2Forms')

WebUI.navigateToUrl('https://app.payrollrelief.com/Compliance/Form1099s')

WebUI.navigateToUrl('https://app.payrollrelief.com/ComplianceACA/ACAEmployer?year=0')

WebUI.navigateToUrl('15')

WebUI.navigateToUrl('https://app.payrollrelief.com/Report/PayrollRegister')

WebUI.navigateToUrl('https://app.payrollrelief.com/Report/TaxLiabilitiesAndPayments')

WebUI.navigateToUrl('https://app.payrollrelief.com/Report/PayrollHistory')

WebUI.navigateToUrl('https://app.payrollrelief.com/Report/EmployeeList')

WebUI.navigateToUrl('https://app.payrollrelief.com/Report/PayrollSet?reportSetNumber=0')

WebUI.navigateToUrl('15')

WebUI.navigateToUrl('https://app.payrollrelief.com/Integration/SmartLink')

WebUI.navigateToUrl('https://app.payrollrelief.com/Integration/ExportGLtoQBOnline')

WebUI.navigateToUrl('https://app.payrollrelief.com/Integration/ExportPayrollData')

WebUI.navigateToUrl('https://app.payrollrelief.com/Integration/workerscompexport')

WebUI.navigateToUrl('https://app.payrollrelief.com/Integration/PayrollAPIKeys')

WebUI.delay(15)

WebUI.navigateToUrl('https://app.payrollrelief.com/Resources/TrainingVideos')

WebUI.navigateToUrl('https://app.payrollrelief.com/EmploymentForms')

WebUI.navigateToUrl('https://app.payrollrelief.com/Resources/FormsandPubs')

WebUI.navigateToUrl('https://app.payrollrelief.com/Resources/Links')

WebUI.navigateToUrl('https://app.payrollrelief.com/Resources/FormsandPubs?samplereports=1')

WebUI.delay(15)

