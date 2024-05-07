import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/a_Account (4)'))

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Username_username (4)'), 'aclavering1@desdev.cn')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Password_password (4)'), 'Cesw9hU3cbp8cpyvg9QKBQ==')

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/button_Get Started (4)'))

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/button_Edit Appointment (2)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Hot Carz Dealership/select_ScheduledDoneCancelled (1)'), 
    'Done', true)

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/textarea_Info for appointment20_comment (1)'), 
    'Finished')

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/button_Update Appointment (2)'))

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/button_Get Started (4)'))

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/button_Edit Appointment (2)'))

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/button_Close (3)'))

