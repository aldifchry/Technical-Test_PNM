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
WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')
WebUI.maximizeWindow()


if (firstName != null && firstName.trim() != '') {
    WebUI.setText(findTestObject('Page_DEMOQA/input_Name_firstName'), firstName)
}

if (lastName != null && lastName.trim() != '') {
    WebUI.setText(findTestObject('Page_DEMOQA/input_Name_lastName'), lastName)
}

if (email != null && email.trim() != '') {
    WebUI.setText(findTestObject('Page_DEMOQA/input_Email_userEmail'), email)
}

if (gender == 'Male') {
    WebUI.click(findTestObject('Page_DEMOQA/label_Male'))
}

if (mobile != null && mobile.trim() != '') {
    WebUI.setText(findTestObject('Page_DEMOQA/input_(10 Digits)_userNumber'), mobile)
}


WebUI.scrollToPosition(0, 1000)
WebUI.click(findTestObject('Page_DEMOQA/button_Submit'))


if (isValid == 'true') {
	
		WebUI.verifyElementText(
			findTestObject('DEMOQA/popup_title'),
			'Thanks for submitting the form'
		)
	
} else {
	
	
		WebUI.verifyElementNotPresent(
			findTestObject('DEMOQA/popup_title'),
			3
		)
		
	
		
		if (scenario == 'INVALID_EMAIL') {
			WebUI.verifyElementPresent(
				findTestObject('DEMOQA/error_email'),
				3
			)
		}
		
		if (scenario == 'MOBILE_EMPTY') {
			WebUI.verifyElementPresent(
				findTestObject('DEMOQA/error_mobile'),
				3
			)
		}
	
		if (scenario == 'MOBILE_SHORT') {
			WebUI.verifyElementPresent(
				findTestObject('DEMOQA/error_mobile'),
				3
			)
		}
	
		if (scenario == 'FIRSTNAME_EMPTY') {
			WebUI.verifyElementPresent(
				findTestObject('DEMOQA/error_firstName'),
				3
			)
		}
	}
	

WebUI.closeBrowser()
