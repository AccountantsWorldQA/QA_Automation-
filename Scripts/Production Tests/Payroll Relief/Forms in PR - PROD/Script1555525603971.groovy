import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa-login.accountantsoffice.com/login?firmCode=aworldqa')

WebUI.setText(findTestObject('Page_Log in - AccountantsOffice/input_UserName'), 'greeshmaj')

WebUI.setEncryptedText(findTestObject('Page_Log in - AccountantsOffice/input_Password'), 'lb6CZRuikkT48jqepzyNUg==')

WebUI.click(findTestObject('Page_Enter verification code - Acco/Submit code button -3'))

WebUI.click(findTestObject('Page_Welcome Greeshma Johnson - Acc/span_Payroll Relief'))

WebUI.click(findTestObject('Page_Select Client - Payroll Relief/PR_Enter client code or name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Select Client - Payroll Relief/input_concat(id(  s2id_autogen2_search  ))_s2id_autogen2_search'), 
    'jt fam')

WebUI.setText(findTestObject('Page_Select Client - Payroll Relief/input_concat(id(  select2-drop-mask  ))_s2id_autogen2_search'), 
    'jt family')

WebUI.delay(10)

WebUI.navigateToUrl('https://qa-app.payrollrelief.com/Compliance/W2Forms')

WebUI.click(findTestObject('Object Repository/Page_W-2 Forms - Payroll Relief/span_W-2 Copy A  W-3'))

'Close the window '
WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_W-2 Forms - Payroll Relief/span_W-2 (4-up)'))

'Close the window '
WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_W-2 Forms - Payroll Relief/span_W-2 Copy BC'))

'Close the window '
WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_W-2 Forms - Payroll Relief/span_W-2 Copy 1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_W-2 Forms - Payroll Relief/select_All StatesArizonaColoradoDistrict of ColumbiaIdahoMaineMassachusettsMinnesotaNew YorkOklahomaOregonUtahVirginia'), 
    'AZ', true)

WebUI.click(findTestObject('Object Repository/Page_W-2 Forms - Payroll Relief/button_OK'))

'Close the window '
WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_W-2 Forms - Payroll Relief/span_W-2 Copy 2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_W-2 Forms - Payroll Relief/select_All StatesArizonaColoradoDistrict of ColumbiaIdahoMaineMassachusettsMinnesotaNew YorkOklahomaOregonUtahVirginia'), 
    'VA', true)

WebUI.click(findTestObject('Object Repository/Page_W-2 Forms - Payroll Relief/button_OK'))

'Close the window and select OK '
WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_W-2 Forms - Payroll Relief/span_W-2 Copy D  W-3'))

'Select the W-3 Checkbox '
WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_W-2 Forms - Payroll Relief/button_Print W-2_ui-dialog-titlebar-close'))

WebUI.click(findTestObject('Object Repository/Page_W-2 Forms - Payroll Relief/span_W-2 4PS'))

'Close the window '
WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_W-2 Forms - Payroll Relief/input'))

WebUI.click(findTestObject('Object Repository/Page_W-2 Forms - Payroll Relief/button_Print'))

'Delay for conclusion '
WebUI.delay(4)

