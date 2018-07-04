import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\RIKKY\\git\\Repo-Sumsel\\Android Apk\\app-dev-debug (5).apk', true)

Mobile.tap(findTestObject('android.widget.TextView3 - Login (107)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Email (107)'), 'fajar2@mailinator.com', 0)

Mobile.setText(findTestObject('TextInputLayout0 - Password (9)'), 'fajar1234', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('android.widget.TextView1 - Login (108)'), 0)

Mobile.waitForElementPresent(findTestObject('Element Home/android.widget.LinearLayout3'), 0)

Mobile.scrollToText('progress wait', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.ImageView7 (3)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView4 (28)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Please write down your respond'), 'test sedang diproses', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('android.widget.TextView3 - Confirm (3)'), 0)

Mobile.closeApplication()

