package Page;

import Base.TestBase;
import Page.Login;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
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
    FamilyAccount fa = new FamilyAccount();

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
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement back;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    WebElement back2;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Claims\").instance(1)")
    WebElement Claim;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Raise a claim\")")
    WebElement RaiseClaim;
    @AndroidFindBy(uiAutomator ="new UiSelector().className(\"android.view.ViewGroup\").instance(23)")
    WebElement RaiseClaim1;
    @AndroidFindBy(uiAutomator ="new UiSelector().text(\"Upload your policy\")")
    WebElement Upload_your_policy;

    @AndroidFindBy(uiAutomator ="new UiSelector().text(\"Yes\")")
    WebElement Yes;

    @AndroidFindBy(uiAutomator ="new UiSelector().text(\"View Claim\")")
    WebElement Viewclaim;

    @AndroidFindBy(uiAutomator ="new UiSelector().text(\"No\")")
    WebElement No;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View Details\")")
    WebElement ViewDetail;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"View Details\"]")
    WebElement ViewDetail1;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Verify It's You\")")
    WebElement Verify;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"pincode\")")
    WebElement Pincode;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add policy document\")")
    WebElement AddDoc;


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View document\")")
    WebElement viewdoc; //enter

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"ASHOK MISHRA\").instance(0)")
    WebElement AshokMishra;

    @AndroidFindBy(uiAutomator ="new UiSelector().text(\"Maruti Dzire\")")
    WebElement Vehiclename;
    @AndroidFindBy(uiAutomator ="new UiSelector().text(\"MARUTI SUZUKI DZIRE\")")
    WebElement Vehiclename1;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement back1;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Home\")")
    WebElement Home;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Find a policy\")")
    WebElement findaPolicy;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Motor\")")
    WebElement Motor;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"vehicleRegistrationNumber\")")
    WebElement MotorNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Search\")")
    WebElement Search;
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

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add now\").instance(1)")
    WebElement AddNow_Health;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add now\").instance(2)")
    WebElement AddNow_Life;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add now\").instance(3)")
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

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(13)")
    WebElement backhome;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement Closeinvitefamily;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Know your policy, View your policy details\")")
    WebElement knowpolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"phoneNumber\")")
    WebElement phoneNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"buttonComponent\")")
    WebElement conti;




    public void profileCreation(String FN, String LN, String DOB) throws InterruptedException {
        TestUtil.sendKeys(firstName, FN, "first Name select");
        TestUtil.sendKeys(lastName, LN, "last Name Select");
        TestUtil.sendKeys(dob, DOB, "DOB entered");
        Thread.sleep(1000);
        TestUtil.click(cont, "Continue clicked");
        if (TestBase.env.equals("stage")) {
            Thread.sleep(2000);
            TestUtil.getScreenShot();
            driver.navigate().back();
//            TestUtil.assertText(ConnectEmail, "Connect Gmail to Find Policies");
//            TestUtil.assertText(AlternateMtd, "Try Alternate Methods");
//            TestUtil.click(Skip, "Continue clicked");
            TestUtil.click(closeButton, "close");
        } else {
            LogUtils.info("Prod methods started");
        }

        if(!TestBase.MethodName.equals("InstallLink")) {
            try {
                if (Insurance.isDisplayed()) {
                    TestUtil.click(Insurance, "Insurance clicked");
                    Thread.sleep(6000);
                    TestUtil.getScreenShot();
                    LogUtils.info("Claims flow started");
//Claims
                    TestUtil.click(Home, "Home clicked");
                    TestUtil.click(findaPolicy, "Find a Policy clicked");
                    TestUtil.click(Motor, "Motor clicked");
                    TestUtil.sendKeys(MotorNumber, "MH12QD3579", "Vehicle number enter");
                    Thread.sleep(3000);
                    TestUtil.click(Search, "Search clicked");
                    Thread.sleep(5000);
                    TestUtil.click(back, "Cross clicked");
                    Thread.sleep(3000);
                    TestUtil.click(back, "back clicked");
                    TestUtil.click(Claim, "Claim clicked");
                    TestUtil.click(RaiseClaim, "RaiseClaim clicked");
                    TestUtil.click(ViewDetail, "View Detail clicked");
                    Thread.sleep(3000);
                    TestUtil.getScreenShot();
                    TestUtil.click(Verify, "verify its you clicked");
                    Thread.sleep(3000);
                    TestUtil.getScreenShot();
                    TestUtil.click(closeButton, "Close add");
                    TestUtil.sendKeys(Pincode, "411046", "Pincode enter");
                    TestUtil.click(ViewDetail1, "View Detail clicked");
                    Thread.sleep(3000);
//                TestUtil.click(closeButton,"Close add");
//                Thread.sleep(3000);
                    TestUtil.getScreenShot();
                    TestUtil.click(AddDoc, "Add Policy Document clicked");
                    Thread.sleep(3000);
                    TestUtil.getScreenShot();
                    TestUtil.click(back2, "back clicked");
                    TestUtil.click(back, "back clicked");
                    TestUtil.assertText(Upload_your_policy, "Upload your policy");
                    TestUtil.click(RaiseClaim1, "raise a Claim clicked");
                    Thread.sleep(2000);
                }

                if (TestBase.env.equals("stage")) {
                    TestUtil.assertText(Yes, "Yes");
                    TestUtil.assertText(No, "No");
                    TestUtil.click(Yes, "claim raised");
                    Thread.sleep(2000);
                    TestUtil.getScreenShot();
                    driver.navigate().back();
                    TestUtil.click(Viewclaim, "click on view claim status");
                    Thread.sleep(2000);
                    TestUtil.getScreenShot();
                } else if (TestBase.env.equals("prod")) {
                    TestUtil.assertText(Yes, "Yes");
                    TestUtil.assertText(No, "No");
                    TestUtil.getScreenShot();
                }

            } catch (NoSuchElementException e) {
                NewUser_page user = new NewUser_page();
                user.byname();
            }
        }
    }
    public void profileCreation1(String FN,String LN, String DOB) throws InterruptedException {
        TestUtil.sendKeys(firstName, FN, "first Name select");
        TestUtil.sendKeys(lastName, LN, "last Name Select");
        TestUtil.sendKeys(dob, DOB, "DOB entered");
        Thread.sleep(1000);
        TestUtil.click(cont, "Continue clicked");
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
        Thread.sleep(7000);
        TestUtil.assertText(HealthMember,"Ashok (You)");
        TestUtil.assertText(HEalthNominee,"Kalpana");
       // TestUtil.assertText(AddNow_vehicle,"Add now");
        TestUtil.click(AddNow_vehicle,"Vehicle Add Now clicked");
        TestUtil.assertText(AddNow_vehicleclicked,"ex: MH01AB1234");
        TestUtil.click(closeButton,"Close add");
        Thread.sleep(4000);
        util.scrollToElementAndClick(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Others\")"), "up", 1);
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(AddNow_Other,"Other Add Now clicked");
        TestUtil.click(closeButton,"Close add Other");
       // TestUtil.assertText(AddNow_Health,"Add now");
        TestUtil.click(AddNow_Health,"Health Add Now clicked");
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(closeButton,"Close add now Health");
        TestUtil.click(AddNow_Life,"Life Add Now clicked");
        Thread.sleep(2000);
          TestUtil.getScreenShot();
        TestUtil.click(closeButton,"Close add Life");
        try {
            util.scrollToElementAndClick(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"MARUTI SUZUKI DZIRE\")"), "down", 1);
            TestUtil.click(Vehiclename1,"Vehicle card click");
            driver.navigate().back();
        }catch (NoSuchElementException e){
          //util.scrollToElementAndClick(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Maruti Dzire\")"), "down", 1);
            TestUtil.click(Vehiclename1,"Vehicle card catch click");
        }
        Thread.sleep(3000);
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
       // TestUtil.click(closeButton,"Close add");
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

LogUtils.info("Family account flow started");

       // TestUtil.click(backhome,"back clicked");
      //  TestUtil.click(closeButton, "Close click from PDP");
      //  TestUtil.click(closeButton, "Close click from policy List");
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        TestUtil.click(Home, "Home clicked");
        fa.Family();

    }

}
