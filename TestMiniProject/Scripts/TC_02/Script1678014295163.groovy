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

WebUI.navigateToUrl('https://pongvarid.github.io/probation_client_nuxt/?fbclid#/auth/login/')

WebUI.click(findTestObject('Object Repository/TC_02_object/Page_/span_'))

WebUI.click(findTestObject('Object Repository/TC_02_object/Page_/a_'))

WebUI.setText(findTestObject('Object Repository/TC_02_object/Page_/input__input-46'), 'Bas')

WebUI.setEncryptedText(findTestObject('Object Repository/TC_02_object/Page_/input__input-49'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/TC_02_object/Page_/input__input-52'), 'aeHFOx8jV/A=')

WebUI.setText(findTestObject('Object Repository/TC_02_object/Page_/input__input-55'), '64021878@up.ac.th')

WebUI.setText(findTestObject('Object Repository/TC_02_object/Page_/input__input-58'), 'Goast')

WebUI.click(findTestObject('Object Repository/TC_02_object/Page_/input__input-61'))

WebUI.setText(findTestObject('Object Repository/TC_02_object/Page_/input__input-61'), 'ต.แม่กา อ.เมือง จ.พะเยา')

WebUI.click(findTestObject('Object Repository/TC_02_object/Page_/span__1'))

WebUI.closeBrowser()

