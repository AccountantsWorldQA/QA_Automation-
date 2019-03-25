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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa-login.accountantsoffice.com/login?firmCode=aworldqa')

WebUI.setText(findTestObject('Page_Log in - AccountantsOffice/input_UserName'), 'greeshmaj')

WebUI.setEncryptedText(findTestObject('Page_Log in - AccountantsOffice/input_Password'), 'lb6CZRuikkT48jqepzyNUg==')

WebUI.click(findTestObject('Page_Enter verification code - Acco/Submit code button -3'))

WebUI.click(findTestObject('Page_Welcome Greeshma Johnson - Acc/span_Payroll Relief'))

WebUI.click(findTestObject('Page_Select Client - Payroll Relief/PR_Enter client code or name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Select Client - Payroll Relief/Blank_enter_client'))

WebUI.setText(findTestObject('Page_Select Client - Payroll Relief/Blank_enter_client'), 'jt')

WebUI.click(findTestObject('Page_Select Client - Payroll Relief/div_JT Landscaping JT-Utah  -'))

WebUI.delay(6)

'Employer > Contact'
WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/EmployerContact')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/PaySchedules')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/TaxInfo')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/EmployerPayTypes')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/EmployerDeductions')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/Preferences')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/Accounts')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/Locations')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EmployerDepartment/Department')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/EmployerDepartment/Classifications')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EmployerDepartment/Groups')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EmployerJob')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employer/PTODefaults')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employer/Permissions')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employer/EmployerSetupList')

WebUI.delay(2)

'Employees '
WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employee')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employee/List')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employee/Import')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Employee/Warnings')

WebUiBuiltInKeywords.delay(2)

'E- Services '
WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EServices/Status')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EServices/BankInfo')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EServices/Form8655')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/EServices/ApplicationEFT')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EServices/Taxes')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EServices/Preferences')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EServices/ProcessingCharges')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EServices/ACHTransactions')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/EServices/ACHDirectFile')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/EServices/Recall')

WebUiBuiltInKeywords.delay(2)

'Payroll processing '
WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/ListEntry')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/ByPaycheck?payCheckId=37029645')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/Import')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/Options')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/Summary')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/PrintChecks')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/Allocation')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/PayrollRegister/Register')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Payroll/EmployeePaychecks')

WebUiBuiltInKeywords.delay(2)

'Compliance'
WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/PendingPayments')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/PaymentsMade')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/AdditionalPayments')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/SpecialPaymentOptions')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/TaxForms')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/W2Forms')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/Form1099s?year=2018')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/AllocatedTips/AllocatedTips')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/WageAdjustments')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/ComplianceOptions')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/ComplianceACA/ACAEmployer?year=0')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/ComplianceACA/ACAEmployee')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/ComplianceACA/ACAForms')

WebUiBuiltInKeywords.delay(2)

'Reports'
WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Report/PayrollRegister')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Report/TaxLiabilitiesAndPayments')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Report/PayrollHistory')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Report/EmployeeList')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Report/PayrollSet?reportSetNumber=0')

WebUiBuiltInKeywords.delay(2)

'Integration '
WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Integration/SmartLink')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Integration/ExportGLtoQBOnline')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Integration/workerscompexport#')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Integration/SwipeClock')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Integration/PayrollAPIKeys')

WebUiBuiltInKeywords.delay(2)

'Resources '
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

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/ManageCompliance/UnsuccessfulEfile')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/ManageCompliance/RejectedEfile')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/ManageCompliance/FutureDueForms')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/ManageCompliance/PastDueForms')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/ManageCompliance/ManageTaxes')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/ManageCompliance/FederalLookback')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/ACHApplication/GetACHApplicationDetails')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Firm/Manage8655')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/TaskManager/GetTaskDetails')

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Firm/SelectClient')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Firm/ClientManagement')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Firm/FirmOptions')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/EmailsSent/GetEmailsSent')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Firm/Announcements')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Firm/ClientActivity')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Firm/ClientCharges')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Batch/Emailing')

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Batch/Processing')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Batch/ApprovePayrolls')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Batch/Printing')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Batch/ArchiveForms')

WebUiBuiltInKeywords.navigateToUrl('https://qa-app.payrollrelief.com/Batch/ProcessW2s')

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Batch/Process1099s')

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.click(findTestObject('Page_Select Client - Payroll Relief/Help PR'))

WebUiBuiltInKeywords.click(findTestObject('Page_Dashboard - Payroll Relief/Select Client PR'))

WebUiBuiltInKeywords.click(findTestObject('Page_Notes - Payroll Relief/Chat PR'))

WebUI.click(findTestObject('Page_Notes - Payroll Relief/Notes PR'))

WebUI.click(findTestObject('Page_Dashboard - Payroll Relief/Dashboard PR'))

WebUI.closeBrowser()

