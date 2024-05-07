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

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Username_username'), 'tsteger0@de.vu')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Password_password'), 'ecCUdUhlbLkZJqX8sdq8Sw==')

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/button_Sign In'))

WebUI.click(findTestObject('Page_Hot Carz Dealership/button_Get Started (1)'))

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/a_Create Employee Acct'))

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_First Name_first_name'), 'Sara')

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Last Name_last_name'), 'Walsh')

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Email Address_email'), 'Sara@email.com')

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Phone Number_phone'), '1235489632')

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Address_address'), '123 Sara Street')

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_City_city'), 'Midtown')

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Zipcode_zipcode'), '06541')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Password_password'), 'p4y+y39Ir5Oy1MY8jPt0uQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_Confirm Password_confirmPassword'), 
    'p4y+y39Ir5Oy1MY8jPt0uQ==')

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_concat(Driver, , s License ID)_driverID'), 
    'K1254521546')

WebUI.setText(findTestObject('Object Repository/Page_Hot Carz Dealership/input_SSN_SSN'), '368592741')

WebUI.click(findTestObject('Object Repository/Page_Hot Carz Dealership/button_Create Employee'))

