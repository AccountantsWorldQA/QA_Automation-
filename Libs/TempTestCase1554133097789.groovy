import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\GREESH~1.MVS\\AppData\\Local\\Temp\\Katalon\\20190401_113817\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://qa-login.accountantsoffice.com/login?firmCode=aworldqa\')\n\nWebUI.setText(findTestObject(\'Page_Log in - AccountantsOffice/input_UserName\'), \'greeshmaj\')\n\nWebUI.setEncryptedText(findTestObject(\'Page_Log in - AccountantsOffice/input_Password\'), \'lb6CZRuikkT48jqepzyNUg==\')\n\nWebUI.click(findTestObject(\'Page_Enter verification code - Acco/Submit code button -3\'))\n\nWebUI.click(findTestObject(\'Page_Welcome Greeshma Johnson - Acc/span_Payroll Relief\'))\n\nWebUI.click(findTestObject(\'Page_Select Client - Payroll Relief/PR_Enter client code or name\'), FailureHandling.STOP_ON_FAILURE)\n\nWebUI.setText(findTestObject(\'Page_Select Client - Payroll Relief/input_concat(id(  s2id_autogen2_search  ))_s2id_autogen2_search\'), \n    \'jt fam\')\n\nWebUI.setText(findTestObject(\'Page_Select Client - Payroll Relief/input_concat(id(  select2-drop-mask  ))_s2id_autogen2_search\'), \n    \'jt family\')\n\nWebUI.delay(10)\n\nWebUI.navigateToUrl(\'https://qa-app.payrollrelief.com/Compliance/W2Forms\')\n\nWebUI.click(findTestObject(\'Page_W-2 Forms - Payroll Relief/span_W-2 Copy A  W-3\'))\n\nWebUI.delay(4)\n\nWebUI.click(findTestObject(\'Page_W-2 Forms - Payroll Relief/div_Print W-3_ui-widget-overlay ui-front\'))\n\nWebUI.click(findTestObject(\'Page_W-2 Forms - Payroll Relief/button_Print W-2_ui-dialog-titlebar-close\'))\n\nWebUI.click(findTestObject(\'Page_W-2 Forms - Payroll Relief/button_Archive\'))\n\nWebUI.click(findTestObject(\'Page_W-2 Forms - Payroll Relief/button_Exceptions\'))\n\n', FailureHandling.STOP_ON_FAILURE, true)

