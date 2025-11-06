package Page;

import Base.TestBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.LogUtils;
import utils.TestUtil;

import java.io.IOException;
import java.lang.reflect.Method;

public class Login extends TestBase {
    TestUtil util = new TestUtil();

    public Login() {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"SKIP INTRO\")")
    WebElement skipIntro;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"FINISH\")")
    WebElement Finish;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_button\")")
    WebElement Allow;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.google.android.gms:id/cancel\")")
    WebElement cancel;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Remind me later\")")
    WebElement RemindLater;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"phoneNumber\")")
    WebElement phoneNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"tempUtmContent\")")
    WebElement enterUtm;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"buttonComponent\")")
    WebElement conti;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"otp0\")")
    WebElement one;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"otp1\")")
    WebElement two;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"otp2\")")
    WebElement three;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"otp3\")")
    WebElement four;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Account\")")
    WebElement Account;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Personal Settings\")")
    WebElement Personalsetting;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"TEST NAME\"]")
    WebElement TestName;


    public void login() throws InterruptedException, IOException {

        // TestUtil.click(Allow,"Allow clicked");
//        Thread.sleep(5000);
//        TestUtil.click(RemindLater,"remind later clicked");
//        Thread.sleep(2000);

//        TestUtil.click(skipIntro,"skipIntro clicked");
//        Thread.sleep(3000);
//        Finish.click();

        // driver.findElement( AppiumBy.androidUIAutomator("new UiSelector().text(\"SKIP INTRO\")")).click();

        if (TestBase.MethodName.equals("checkbyFNLN") && TestBase.env.equals("stage")) {
            TestUtil.click(cancel, "cancel");
            System.out.println("random start");
            String mob = TestUtil.getRandomMobileNumber();
            TestUtil.sendKeys(phoneNumber, mob, "mobile number entered");
            TestUtil.click(conti, "continue");
//            TestUtil.getLatestOtpFromLogs("8208805844","auth-service-676bbfcc89-fqvbq","avatar");
//            otp();
        } else {
            if (TestBase.env.equals("stage")) {
                TestUtil.click(cancel, "cancel");
                TestUtil.sendKeys(phoneNumber, "1957285639", "mobile number entered");
                TestUtil.click(conti, "continue");
                TestUtil.getLatestOtpFromLogs("1957285639", "auth-service-db6bfff84-j6grw", "avatar");
                otp();
            } else if (TestBase.env.equals("sanity")) {
                TestUtil.click(cancel, "cancel");
                TestUtil.sendKeys(phoneNumber, "7709302421", "mobile number entered");
                TestUtil.click(conti, "continue");
                TestUtil.getLatestOtpFromLogs("7709302421", "auth-service-5454499f5d-cgr8c", "sanity");
                otp();
            } else {
                TestUtil.click(cancel, "cancel");
                if (TestBase.MethodName.equals("cashless_Hospital")) {
                    TestUtil.sendKeys(phoneNumber, "8208805844", "mobile number entered");
                    TestUtil.click(conti, "continue");
                    TestUtil.GetOtpFromUser();
                    otp();
                    try {
                        WebElement msg = driver.findElement(By.xpath("//android.widget.TextView[@text=\"Unable to verify OTP for the user\"]"));
                        if (msg.isDisplayed()) { // OTP wrong
                            LogUtils.info("❌ Wrong OTP entered, reopening OTP popup...");
//                    TestUtil.click(conti, "Reopen OTP popup");
                            TestUtil.GetOtpFromUser();
                            otp();
                        }
                    } catch (NoSuchElementException e) {
                        LogUtils.info("Correct otp entered");
                    }
                }
                else if(!TestBase.MethodName.equals("cashless_Hospital")) {
                    TestUtil.sendKeys(phoneNumber, "6999912345", "mobile number entered");
                    TestUtil.click(conti, "continue");
                    otp();
                }
            }

        }
    }

    public void stgLogin(Method method) throws InterruptedException {

        //   TestUtil.click(Allow, "Allow clicked");
        TestUtil.click(cancel, "cancel");
        if (method.getName().equals("findpolicyMobNo")) {
            System.out.println("Mobile no fetch start");
            TestUtil.sendKeys(phoneNumber, "2201771144", "mobile number entered");

        } else if (method.getName().equals("findpolicyMobNoInstalllink")) {
            LogUtils.info("install link and mobile no fetch flow started ");
            TestUtil.sendKeys(phoneNumber, "1518998478", "mobile number entered");
            TestUtil.sendKeys(enterUtm, "f5c74e45-3cc6-4c44-8f69-25343c4fec3a", "UTM content entered");

        } else {
            System.out.println("6999 flow started");
            String mob = TestUtil.getRandomMobileNumber();
            TestUtil.sendKeys(phoneNumber, mob, "mobile number entered");
            TestUtil.sendKeys(enterUtm, "f5c74e45-3cc6-4c44-8f69-25343c4fec3a", "UTM content entered");
        }
        Thread.sleep(2000);
        TestUtil.click(conti, "continue");
        otp();
    }

    public void otp() {
//
        if (env.equals("sanity")) {
            TestUtil.sendKeys(one, TestUtil.Digi1, "one clicked");
            TestUtil.sendKeys(two, TestUtil.Digi2, "two clicked");
            TestUtil.sendKeys(three, TestUtil.Digi3, "three clicked");
            TestUtil.sendKeys(four, TestUtil.Digi4, "four clicked");
        }else if(TestBase.MethodName.equals("cashless_Hospital")){
            TestUtil.sendKeys(one, TestUtil.Digi1, "one clicked");
            TestUtil.sendKeys(two, TestUtil.Digi2, "two clicked");
            TestUtil.sendKeys(three, TestUtil.Digi3, "three clicked");
            TestUtil.sendKeys(four, TestUtil.Digi4, "four clicked");
        }
        else {
            TestUtil.sendKeys(one, "1", "one clicked");
            TestUtil.sendKeys(two, "2", "two clicked");
            TestUtil.sendKeys(three, "3", "three clicked");
            TestUtil.sendKeys(four, "4", "four clicked");

        }
    }


    public void profileSetting() {
        TestUtil.click(Account, "");
        Assert.assertEquals(TestName.getText(), "TEST NAME");
    }


}
