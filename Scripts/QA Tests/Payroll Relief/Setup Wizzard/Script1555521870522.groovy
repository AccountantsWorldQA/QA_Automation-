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

WebUI.click(findTestObject('Page_Welcome Greeshma Johnson - Acc/span_Payroll Relief'))

WebUI.click(findTestObject('Page_Select Client - Payroll Relief/PR_Enter client code or name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Select Client - Payroll Relief/Blank_enter_client'))

WebUI.setText(findTestObject('Page_Select Client - Payroll Relief/Blank_enter_client'), 'Gj')

WebUI.click(findTestObject('Page_Select Client - Payroll Relief/div_GJPayroll GJPayroll'))

WebUI.delay(3)

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employer/EmployerContact')

WebUI.delay(0)

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employer/clientsetup')

not_run: WebUI.click(findTestObject('Page_Contact - Payroll Relief/a_Setup Wizard'))

not_run: WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Employer/clientsetup')

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/div_First pay date_control-label col-sm-1 col-md-1 col-lg-1'))

CustomKeywords.'com.katalon.plugin.keyword.calendar.SetDateCalendarKeyword.setDate'(findTestObject('Agoda/calendar'), 4, 
    10, 2019, 2000, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

CustomKeywords.'com.katalon.plugin.keyword.calendar.SetDateCalendarKeyword.setDate'(findTestObject('Agoda/calendar'), 4, 
    15, 2019, 2000, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/Federal EIN Number- 2018'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input__form-control input-vali'), '11-1245869')

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/Employer State ID- 2018'))

WebUI.setText(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input_Employer State ID_form-c_12'), 
    '11-2090934')

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/button_Next (2)'))

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input (2)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/select_--Select--Fixed Amt ()'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input_AmtPct_form-control'), '5')

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/div_Select Applicable Deductio'))

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/button_Next (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input_Department Name_form-con'), 'Testing Department')

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/button_Next (2)'))

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/label_per Pay Period'))

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/label_By Calendar Year'))

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/button_Next (2)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/select_SelectCorporationLimite'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input_Business Website_form-co'), 'primemax.com')

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/div_Business Information'))

WebUI.setText(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input__form-control'), '5')

WebUI.setText(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input__form-control_2'), '5')

WebUI.setText(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input_Net DD per Payday_form-c'), '5000')

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/div_PTO Policy'))

WebUI.setText(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input__form-control'), 'Greeshma')

WebUI.setText(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input__form-control_3'), 'Greeshma')

WebUI.setText(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input_Full Home Address_form-c'), '12 Road')

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/div_PTO Policy'))

WebUI.setText(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input__form-control'), 'Plants')

WebUI.setText(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input__form-control_4'), 'Plants')

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/div_PTO Policy'))

WebUI.setText(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input_Equity()_form-control ri'), '5')

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/div_PTO Policy'))

WebUI.setText(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input__form-control'), 'CEO')

WebUI.setText(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/input__form-control_5'), 'CEO')

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/div_PTO Policy'))

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Client Setup - Payroll Relief/button_Close'))

WebUI.closeBrowser()

