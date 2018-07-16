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

Mobile.startApplication('/Users/januaripanjaitan/git/Android-Automation-Testing/Android Apk/Polisi110-v0112-staging-11072018.apk', true)

Mobile.tap(findTestObject('android.widget.TextView3 - Login (28)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Email (29)'), 'fajar2@mailinator.com', 0)

Mobile.setText(findTestObject('android.widget.EditText1 (28)'), 'fajar1234', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('android.widget.TextView1 - Login (29)'), 0)

Mobile.tap(findTestObject('android.widget.ImageButton0 (6)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView3 (25)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Please write down your description (3)'), 'disabled test connection', 
    0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('android.widget.EditText0 - Please write down your specific location (1)'), 'depan kantor PT. Qlue', 
    0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('android.widget.TextView2 - Select Label (1)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView3 (26)'), 0)

Mobile.tap(findTestObject('android.widget.TextView5 - Confirm Label (1)'), 0)

Mobile.tap(findTestObject('android.widget.TextView4 - Confirm (1)'), 0)

Mobile.tap(findTestObject('android.widget.TextView2 - Yes (1)'), 0)

Mobile.closeApplication()

