package Page;

import Base.TestBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtil;


public class NewUser_page extends TestBase {

    public NewUser_page() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    Login lg = new Login();

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

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Insurance\")")
    WebElement Insurance;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Active\")")
    WebElement Active;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Own Damage\")")
    WebElement Od;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"MOTOR\")")
    WebElement MOTOR;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Third Party\")")
    WebElement tp;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add ons\")")
    WebElement addon;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"D167831863 \")")
    WebElement policyNo;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Comprehensive cover\")")
    WebElement Comprehensivecover;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pay As You Drive\")")
    WebElement payasaddon;

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
            TestUtil.click(closeButton,"Close add");
        }catch (Exception e){
        }
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
        Thread.sleep(10000);
        TestUtil.getScreenShot();
    }

    public void byname() throws InterruptedException {
        TestUtil.click(closeButton,"Close add");
       // TestUtil.click(viewdoc,"view doc Select");
        TestUtil.assertText(AshokMishra,"ASHOK MISHRA");
        TestUtil.click(back,"Back clicked");
        TestUtil.click(back,"Back clicked");
        TestUtil.click(Insurance,"");
        TestUtil.click(Active,"");
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
        Thread.sleep(2000);
        try {
            TestUtil.click(payasaddon,"pay as add on clicked");

        }catch (Exception e){
            TestUtil.click(closeButton,"Close add");
            TestUtil.click(payasaddon,"pay as add on clicked");
        }

        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.assertText(paylessdriver,"Pay less if you drive less");
        Thread.sleep(2000);
        TestUtil.getScreenShot();
    }

}