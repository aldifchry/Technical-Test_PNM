import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject
// Date of birth
// Subject
// Hobbies
// Address
// State & City
// Submit
// ===== ASSERTION (FIXED) =====
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.maximizeWindow()

WebUI.scrollToPosition(0, 500)

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Name_firstName'), 'Aldi')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Name_lastName'), 'Fachry')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Email_userEmail'), 'aldifachry@example.com')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Male'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_(10 Digits)_userNumber'), '0877383075')

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEMOQA/select_190019011902190319041905190619071908_246ee1'), 
    '2010', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEMOQA/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_5'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Subjects_subjectsInput'), 'Testing')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Sports'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/textarea_Current Address_currentAddress'), 'Setia Budi')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Select State'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_NCR'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Select City'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Jaipur'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))

TestObject popupTitle = new TestObject('dynamicPopupTitle')

popupTitle.addProperty('id', ConditionType.EQUALS, 'example-modal-sizes-title-lg')

WebUI.waitForElementVisible(popupTitle, 10)

WebUI.verifyElementText(popupTitle, 'Thanks for submitting the form')

WebUI.closeBrowser()

