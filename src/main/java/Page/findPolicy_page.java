package Page;

import Base.TestBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.LogUtils;
import utils.TestUtil;


public class findPolicy_page extends TestBase {

    public findPolicy_page() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Find a policy\")")
    WebElement findaPolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Insurance\")")
    WebElement Insurance;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Search by insurance types\")")
    WebElement Searchbyinsurancetypes;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Motor\")")
    WebElement Motor;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Life\")")
    WebElement Life;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Health\")")
    WebElement Health;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Upload\")")
    WebElement Upload;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"phoneNumber\")")
    WebElement phoneNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Credit Card\")")
    WebElement CreditCard;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Other methods to fetch health policy\")")
    WebElement Otherhealthpolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Other methods to fetch life policy\")")
    WebElement Otherlifepolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Other methods to fetch motor policy\")")
    WebElement Othermotorpolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"vehicleRegistrationNumber\")")
    WebElement vehicleRegistrationNumber; //enter

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Search\")")
    WebElement search;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"We're unable to find your policy using the vehicle registration number\")")
    WebElement unabletofindPolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Upload your policy\")")
    WebElement uploadPolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"MOTOR\")")
    WebElement MOTOR;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Motor Insurance\")")
    WebElement MotorInsurance;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Verify It's You\")")
    WebElement verifyitsyou;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Time to celebrate\")")
    WebElement timetocelebrate;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"We have found your policy!\")")
    WebElement Wefoundyourpolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement closeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement back;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Renew\")")
    WebElement Renew;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Proceed\").instance(1)")
    WebElement Expertprocced;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Proceed\").instance(0)")
    WebElement Renewprocced;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View\")")
    WebElement ViewQuote;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"What is the best renewal amount I can obtain?\")")
    WebElement Reason;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Save & Next\")")
    WebElement Save;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"pincode\")")
    WebElement pincodee;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View Details\")")
    WebElement viewDetails;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"MEDIKONDALA VENKATESH NAIDU\").instance(0)")
    WebElement medikonda;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"GURUMUKH SINGH\").instance(0)")
    WebElement GURUMUKHSINGH;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Comprehensive cover\")")
    WebElement Comprehensive;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View document\")")
    WebElement viewDocument;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Third Party only cover\")")
    WebElement thirdPartyOnly;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"name\")")
    WebElement namee;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Own Damage\")")
    WebElement OwnDamage;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Third Party\")")
    WebElement ThirdParty;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add ons\")")
    WebElement AddOns;



    public void Unabletofindpolicy(String regno) throws InterruptedException {

        TestUtil.click(findaPolicy,"finda Policy clicked");
        TestUtil.click(Motor,"Motor clicked");
        TestUtil.click(vehicleRegistrationNumber,"Motor clicked");
        Thread.sleep(1000);
        TestUtil.sendKeys(vehicleRegistrationNumber,regno,regno+" Reg number entered");
        Thread.sleep(2000);
        TestUtil.click(search,"Search clicked");
        TestUtil.assertText(unabletofindPolicy,"We're unable to find your policy using the vehicle registration number");
        TestUtil.assertText(uploadPolicy,"Upload your policy");

    }


    public void validRegNo(String regno) throws InterruptedException {
//
        TestUtil.click(findaPolicy, "finda Policy clicked");
        TestUtil.click(Motor, "Motor clicked");
        TestUtil.click(vehicleRegistrationNumber, "Motor clicked");
        Thread.sleep(1000);
        TestUtil.sendKeys(vehicleRegistrationNumber, regno, regno + " Reg number entered");
        Thread.sleep(2000);
        TestUtil.click(search, "Search clicked");
        TestUtil.assertText(MOTOR, "MOTOR");
        TestUtil.click(closeButton, "");
        TestUtil.click(back, "");
        TestUtil.getScreenShot();

        TestUtil.click(Renew, "Renew clicked");
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(Expertprocced, "Renew with expert clicked");
        TestUtil.getScreenShot();
        TestUtil.click(Reason, "Reason clicked");
        TestUtil.click(Save, "Save clicked");
        TestUtil.getScreenShot();
        TestUtil.click(closeButton, "");
        LogUtils.info("#####  Renew By my self stared  ####");
        Thread.sleep(2000);
        TestUtil.click(Renew, "Renew clicked");
        TestUtil.click(Renewprocced, "Renew by myself clicked");
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(ViewQuote, "View quote clicked");
        Thread.sleep(3000);
        TestUtil.click(closeButton, "");
       // TestUtil.click(Insurance, "Insurance clicked");
       // TestUtil.click(verifyitsyou, "Click on Verify its You");
    }
    public void pincode(int pincode) throws InterruptedException {
        TestUtil.sendKeys(pincodee, String.valueOf(pincode),pincode+" - pincode Entered");
        TestUtil.click(viewDetails,"view Details");
        Thread.sleep(2000);
        TestUtil.click(closeButton,"");
        Thread.sleep(1000);
        TestUtil.assertText(medikonda,"MEDIKONDALA VENKATESH NAIDU");
        TestUtil.assertText(thirdPartyOnly,"Third Party only cover");
        TestUtil.assertText(viewDocument,"View document");
        TestUtil.assertText(ThirdParty,"Third Party");
        TestUtil.assertText(AddOns,"Add ons");
        TestUtil.click(viewDocument,"document clicked");
        Thread.sleep(6000);
        TestUtil.getScreenShot();
    }
    public void name(String name) throws InterruptedException {
        Thread.sleep(1000);
        namee.clear();
        Thread.sleep(1000);
        TestUtil.sendKeys(namee, name,name+" - Name Entered");
        TestUtil.click(viewDetails,"view Details");
        Thread.sleep(2000);
        Thread.sleep(1000);
        TestUtil.assertText(GURUMUKHSINGH,"GURUMUKH SINGH");
        TestUtil.assertText(Comprehensive,"Comprehensive cover");
        TestUtil.assertText(viewDocument,"View document");
        TestUtil.assertText(OwnDamage,"Own Damage");
        TestUtil.assertText(ThirdParty,"Third Party");
        TestUtil.assertText(AddOns,"Add ons");
        TestUtil.click(viewDocument,"document clicked");
        Thread.sleep(6000);
        TestUtil.getScreenShot();
    }
    public void findPolicyassert(){
        TestUtil.getScreenShot();
        TestUtil.click(findaPolicy, "finda Policy clicked");
        TestUtil.click(Health, "Health clicked");
        TestUtil.getScreenShot();
        TestUtil.assertText(Upload,"Upload");
        TestUtil.click(Motor, "Motor clicked");
        TestUtil.getScreenShot();
        TestUtil.assertText(vehicleRegistrationNumber,"Enter your vehicle number");
        TestUtil.click(Life, "Life clicked");
        TestUtil.getScreenShot();
        TestUtil.assertText(phoneNumber,"Enter your mobile number");
        TestUtil.assertText(CreditCard,"Credit Card");
//        TestUtil.assertText(Upload_Policy,"Upload Policy");
//        TestUtil.assertText(Search_by_other_number,"Search by other number");

    }
}