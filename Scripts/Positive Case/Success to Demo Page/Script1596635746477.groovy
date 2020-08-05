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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://dev.mile.app/request-demo')
WebUI.maximizeWindow()
def Verify_Demo = WebUI.getText(findTestObject('Verify/VerifDemo_Page'))
WebUI.verifyMatch(Verify_Demo, 'Fill your detail information', true)

WebUI.setText(findTestObject('Text_Btn/Name_txt'), 'halim Testing')
WebUI.setText(findTestObject('Text_Btn/Email_txt'), 'halim@mileapp.com')
WebUI.setText(findTestObject('Text_Btn/Phone_txt'), '812345678')
WebUI.setText(findTestObject('Text_Btn/Organization_txt'), 'Script Automation Halim')
WebUI.click(findTestObject('Text_Btn/RequestDemo_btn'))

def Verify_Home = WebUI.getText(findTestObject('Verify/VerifHome_Page'))
WebUI.verifyMatch(Verify_Home, 'Login', true)

WebUI.delay(5)

WebUI.closeBrowser()