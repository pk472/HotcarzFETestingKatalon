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

WebUI.navigateToUrl('http://localhost:3000')

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/a_Account'))

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/a_Dont have an account Sign Up'))

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_First Name_first_name'), 'Joe')

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Last Name_last_name'), '')

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/label_Last Name'))

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Last Name_last_name'), 'Jackson')

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Email Address_email'), 'joe@email.com')

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Phone Number_phone'), '')

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/label_Phone Number'))

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Phone Number_phone'), '2558559685')

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_concat(Driver, , s License ID)_driverID'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/label_Drivers License ID'))

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_concat(Driver, , s License ID)_driverID'), 
    'K215465486546')

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Username_username'), '')

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/label_Username'))

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Username_username'), 'joe123')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Password_password'), '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Password_password'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/button_Sign Up'))

