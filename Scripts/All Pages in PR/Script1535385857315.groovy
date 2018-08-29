import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa-login.accountantsoffice.com/login?firmCode=aworldqa')

WebUI.setText(findTestObject('Page_Log in - AccountantsOffice/input_UserName'), 'greeshmaj')

WebUI.setEncryptedText(findTestObject('Page_Log in - AccountantsOffice/input_Password'), 'lb6CZRuikkT48jqepzyNUg==')

WebUI.click(findTestObject('Page_Enter verification code - Acco/Submit code button -3'))

WebUI.click(findTestObject('Page_Welcome Greeshma Johnson - Acc/span_Payroll Relief'))

WebUI.click(findTestObject('Page_Select Client - Payroll Relief/PR_Enter client code or name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Select Client - Payroll Relief/div_QATesting QATesting  - 100'))

WebUI.delay(5)

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/Contact')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/TaxInfo')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/PayTypes')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/Deductions')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/Preferences')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/Accounts')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EmployerDepartment/Department')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EmployerJob')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/PTODefaults')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/Permissions')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/EmployerSetupList')

WebUI.delay(2)

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employee')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employee/List')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employee/Import')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employee/Warnings')

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EServices/BankInfo')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EServices/Form8655')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EServices/Taxes')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EServices/Preferences')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EServices/ACHTransactions')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EServices/ACHDirectFile')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EServices/Recall')

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/ListEntry')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/Summary')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/PrintChecks')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/Allocation')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/PayrollRegister/Register')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/EmployeePaychecks')

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/PendingPayments')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/TaxForms')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/W2Forms')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/Form1099s')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/WageAdjustments')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/ComplianceOptions')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/ComplianceACA/ACAEmployer?year=0')

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Report/PayrollRegister')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Report/TaxLiabilitiesAndPayments')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Report/PayrollHistory')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Report/EmployeeList')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Report/PayrollSet?reportSetNumber=0')

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Integration/SmartLink')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Integration/ExportGLtoQBOnline')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Integration/ExportPayrollData')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Integration/SwipeClock')

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Resources/TrainingVideos')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Resources/SupportDocs')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EmploymentForms')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Resources/FormsandPubs')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Resources/Links')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Resources/Tools')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Resources/Webinars')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Resources/Marketing')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Resources/FormsandPubs?samplereports=1')

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Firm/PayrollCenter')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/PayrollActivity/TodaysPayroll?finalized=True')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/ManageCompliance/Exceptions?clientId=-1')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/ACHApplication/GetACHApplicationDetails')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Firm/Manage8655')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/TaskManager/GetTaskDetails')

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Firm/ClientManagement')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Firm/FirmOptions')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EmailsSent/GetEmailsSent')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Firm/Announcements')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Firm/Announcements')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Firm/ClientCharges')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Batch/Emailing')

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Batch/Processing')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Batch/ApprovePayrolls')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Batch/Printing')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Batch/ArchiveForms')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Batch/ProcessW2s')

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.click(findTestObject('Page_Notes - Payroll Relief/Help Icon'))

WebUiBuiltInKeywords.click(findTestObject('Page_Notes - Payroll Relief/Notes Icon'))

WebUiBuiltInKeywords.click(findTestObject('Page_Notes - Payroll Relief/Support Icon'))

WebUI.closeBrowser()

