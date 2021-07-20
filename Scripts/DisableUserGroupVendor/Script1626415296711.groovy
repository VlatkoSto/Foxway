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

WebUI.navigateToUrl('https://backoffice--23.replace.dev/login')

WebUI.setText(findTestObject('Object Repository/VendorObjects/input_UserName_UserName'), 'vlatkostoimenovski')

WebUI.setEncryptedText(findTestObject('Object Repository/VendorObjects/input_Password_Password'), '7YUge7svo+Hg0iH0yX78Ow==')

WebUI.click(findTestObject('Object Repository/VendorObjects/button_Login'))

WebUI.click(findTestObject('Object Repository/VendorObjects/a_Sourcing'))

WebUI.click(findTestObject('Object Repository/VendorObjects/a_Vendors'))

WebUI.setText(findTestObject('Object Repository/VendorObjects/input_Actions_form-control input-md filterInput'), 'istyle')

WebUI.click(findTestObject('Object Repository/VendorObjects/a_iSTYLE Bulgaria'))

WebUI.click(findTestObject('Object Repository/VendorObjects/a_Solutions'))

WebUI.click(findTestObject('Object Repository/VendorObjects/button_Configure'))

WebUI.click(findTestObject('Object Repository/VendorObjects/a_Item Groups'))

WebUI.selectOptionByValue(findTestObject('Object Repository/VendorObjects/select_MobilesTabletsSmartwatchesDonglesMob_62feea'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/VendorObjects/select_MobilesTabletsSmartwatchesDonglesMob_62feea'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/VendorObjects/select_MobilesTabletsSmartwatchesDonglesMob_62feea'), 
    '3', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/VendorObjects/select_MobilesTabletsSmartwatchesDonglesMob_62feea'), 
    '3', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/VendorObjects/select_MobilesTabletsSmartwatchesDonglesMob_62feea'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/VendorObjects/select_MobilesTabletsSmartwatchesDonglesMob_62feea'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/VendorObjects/select_MobilesTabletsSmartwatchesDonglesMob_62feea'), 
    '3', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/VendorObjects/select_MobilesTabletsSmartwatchesDonglesMob_62feea'), 
    '1', false)

WebUI.click(findTestObject('Object Repository/VendorObjects/button_Submit'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://istyle--bg--23.replace.dev/login')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Username_Username'), 'helpdesk@replacegroup.com')

WebUI.setText(findTestObject('Object Repository/VendorObjects/input_Password_Password'), 'Pirn6un112')
WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))
WebUI.click(findTestObject('Object Repository/VendorObjects/Page_Solutions/h2_Retail Tool'))
WebUI.setText(findTestObject('Object Repository/VendorObjects/input'), 'Smartwatches')
WebUI.verifyElementText(findTestObject('Object Repository/VendorObjects/div_Nothing found. Try a different search'), 'Nothing found. Try a different search.')
WebUI.delay(10)
WebUI.closeBrowser()