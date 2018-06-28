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

Mobile.startApplication('C:\\Users\\RIKKY\\git\\Repo-Sumsel\\Android Apk\\Polisi110_Staging200618.apk', true)

Mobile.tap(findTestObject('android.widget.TextView3 - Login (11)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Email (12)'), 'fajar2@mailinator.com', 0)

Mobile.setText(findTestObject('android.widget.EditText1 (11)'), 'fajar1234', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('android.widget.TextView1 - Login (12)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView0 (11)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView5 (15)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView2 (6)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView15 (1)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Search by name'), 'ONE', 0)

Mobile.tap(findTestObject('android.widget.ImageView3 (6)'), 0)

Mobile.tap(findTestObject('android.widget.TextView3 - Confirm'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('android.widget.EditText1 - Type your group name'), 'test lagi', 0)

Mobile.tap(findTestObject('android.widget.ImageView10 (2)'), 0)

Mobile.tap(findTestObject('android.widget.ImageView3 (7)'), 0)

Mobile.tap(findTestObject('android.widget.TextView3 - Confirm (1)'), 0)

Mobile.closeApplication()

