package Page;

import Base.TestBase;
import Page.Login;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.LogUtils;
import utils.TestUtil;


public class NewUser_page extends TestBase {

    public NewUser_page() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

TestUtil util = new TestUtil();
    Login lg = new Login();
    NewUser_page user = new NewUser_page();
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"firstName\")")
    WebElement firstName;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"lastName\")")
    WebElement lastName;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"DD-MM-YYYY\")")
    WebElement dob; //10-10-1994

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"buttonComponent\")")
    WebElement cont;


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Life\")")
    WebElement Life;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement closeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Health\")")
    WebElement Health;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Account\")")
    WebElement Account;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Delete Account\")")
    WebElement Deleteacoount;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Logout\")")
    WebElement logout;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Login with your phone number\")")
    WebElement loginwithyourmoblile;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.google.android.gms:id/cancel\")")
    WebElement cancel;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View document\")")
    WebElement viewdoc; //enter

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"ASHOK MISHRA\").instance(0)")
    WebElement AshokMishra;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement back;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(15)")
    WebElement Home;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Insurance\")")
    WebElement Insurance;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Active\")")
    WebElement Active;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Maruti Dzire\")")
    WebElement Selectvehicle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Ashok (You)\").instance(0)")
    WebElement HealthMember;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Kalpana\")")
    WebElement HEalthNominee;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add now\").instance(0)")
    WebElement AddNow_vehicle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"ex: MH01AB1234\")")
    WebElement AddNow_vehicleclicked;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add now\").instance(0)")
    WebElement AddNow_Health;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add now\").instance(1)")
    WebElement AddNow_Life;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add now\").instance(2)")
    WebElement AddNow_Other;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Own Damage\")")
    WebElement Od;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"MOTOR\")")
    WebElement MOTOR;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Third Party\")")
    WebElement tp;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add ons\")")
    WebElement addon;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"View document\")")
    WebElement ViewDoc;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"D167831863 \")")
    WebElement policyNo;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Comprehensive cover\").instance(0)")
    WebElement Comprehensivecover;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement payasaddon;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pay As You Drive\")")
    WebElement payasaddon1;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pay less if you drive less\")")
    WebElement paylessdriver;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    WebElement backhome;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement Closeinvitefamily;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Know your policy, View your policy details\")")
    WebElement knowpolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"phoneNumber\")")
    WebElement phoneNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"buttonComponent\")")
    WebElement conti;




    public void profileCreation(String FN,String LN, String DOB) throws InterruptedException {
        TestUtil.sendKeys(firstName,FN,"first Name select");
        TestUtil.sendKeys(lastName,LN,"last Name Select");
        TestUtil.sendKeys(dob,DOB,"DOB entered");
        Thread.sleep(1000);
        TestUtil.click(cont,"Continue clicked");
        try {
            TestUtil.click(Insurance, "Insurance clicked");
            Thread.sleep(2000);
            TestUtil.getScreenShot();
        } catch (InterruptedException e) {
            user.byname();
        }
//        try {
//           TestUtil.click(closeButton,"Close add");
//        }catch (Exception e){
//        }
    }
    public void prof(){
        TestUtil.click(cancel,"");
        TestUtil.sendKeys(phoneNumber, "6999912345", "mobile number entered");
        TestUtil.click(conti, "continue");
        lg.otp();
    }

    public void profileLogout() throws InterruptedException {
        try {
            TestUtil.click(Account,"Account clicked");

        }catch (Exception e){
            TestUtil.click(closeButton,"Close add");
            TestUtil.click(Account,"Account clicked");
        }
        TestUtil.click(logout,"Logout Clicked");
        TestUtil.click(cancel,"");
        TestUtil.assertText(loginwithyourmoblile,"Login with your phone number");
        Thread.sleep(3000);
        TestUtil.getScreenShot();
    }

    public void deleteAccount() throws InterruptedException {
        try {
            TestUtil.click(Account,"Account clicked");

        }catch (Exception e){
            TestUtil.click(closeButton,"Close add");
            TestUtil.click(Account,"Account clicked");
        }
        TestUtil.click(Deleteacoount,"last Name Select");
        lg.otp();
        Thread.sleep(25000);
        TestUtil.getScreenShot();
    }

    public void byname() throws InterruptedException {
        Thread.sleep(3000);
        TestUtil.click(closeButton,"Close add");
      //  TestUtil.click(viewdoc,"view doc Select");
        Thread.sleep(4000);
       // TestUtil.assertText(AshokMishra,"ASHOK MISHRA");
//        Thread.sleep(4000);
//        TestUtil.click(back,"Back clicked");
//        Thread.sleep(4000);
//        TestUtil.click(Home,"Home clicked");
//        Thread.sleep(4000);
//        TestUtil.click(Insurance,"");
//        Thread.sleep(4000);
        //TestUtil.click(Active,"");
        TestUtil.assertText(HealthMember,"Ashok (You)");
        TestUtil.assertText(HEalthNominee,"Kalpana");
       // TestUtil.assertText(AddNow_vehicle,"Add now");
        TestUtil.click(AddNow_vehicle,"Vehicle Add Now clicked");
        TestUtil.assertText(AddNow_vehicleclicked,"ex: MH01AB1234");
        TestUtil.click(closeButton,"Close add");
        Thread.sleep(2000);
        util.scrollToElementAndClick(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Add now\").instance(2)"),"up",1);
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(closeButton,"Close add Other");
       // TestUtil.assertText(AddNow_Health,"Add now");
        TestUtil.click(AddNow_Health,"Health Add Now clicked");
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(closeButton,"Close add now Health");
//        util.scrollToElementAndClick(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Add now\").instance(1)"),"up",1);
//        LogUtils.info("Life Add Now Clicked");
      //  TestUtil.assertText(AddNow_Life,"Add now");
        TestUtil.click(AddNow_Life,"Life Add Now clicked");
        Thread.sleep(2000);
          TestUtil.getScreenShot();
        TestUtil.click(closeButton,"Close add Life");
       // TestUtil.assertText(AddNow_Other,"Add now");
       // TestUtil.click(AddNow_Other,"Other Add Now clicked");
       // TestUtil.getScreenShot();
        util.scrollToElementAndClick(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"MARUTI SUZUKI DZIRE\")"),"down",1);
       // util.scrolltoElement("new UiSelector().text(\"Maruti Dzire\")");
        Thread.sleep(3000);
     //   TestUtil.click(Selectvehicle,"Vehicle clicked");

        TestUtil.assertText(AshokMishra,"ASHOK MISHRA");
        TestUtil.assertText(Comprehensivecover,"Comprehensive cover");
        TestUtil.assertText(policyNo,"D167831863 ");
        TestUtil.click(Comprehensivecover,"Comprehensive cover clicked");
        TestUtil.click(knowpolicy,"Know Your policy");
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.assertText(Od,"Own Damage");
        TestUtil.assertText(tp,"Third Party");
        TestUtil.assertText(addon,"Add ons");
        TestUtil.click(addon,"add on clicked");
        TestUtil.click(ViewDoc,"View Doc clicked");
        Thread.sleep(5000);
        TestUtil.getScreenShot();
        TestUtil.click(closeButton,"Close add");
        closeButton.isDisplayed();
        try {
            TestUtil.click(closeButton,"Close add");
            Thread.sleep(4000);
            util.scrollToElementAndClick(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Pay As You Drive\")"),"up",1);
        }catch (Exception e){
            util.scrollToElementAndClick(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Pay As You Drive\")"),"up",1);
        }

        Thread.sleep(2000);
       // TestUtil.getScreenShot();
        TestUtil.assertText(paylessdriver,"Pay less if you drive less");
        Thread.sleep(2000);
        TestUtil.getScreenShot();
    }

}