package Page;

import Base.TestBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Test;
import org.apache.logging.log4j.core.config.plugins.util.ResolverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.LogUtils;
import utils.TestUtil;

public class FamilyAccount extends TestBase {

    public FamilyAccount() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Family Account\")")
    WebElement familyAccount;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Get started\")")
    WebElement getStarted;


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Father\")")
    WebElement Father;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter name\")")
    WebElement Fathername;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Mother\")")
    WebElement Mother;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Spouse\")")
    WebElement Spouse;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Child\")")
    WebElement Child;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Others\")")
    WebElement Others;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Members found from your policy\")")
    WebElement memberFound;


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View Policies\")")
    WebElement ViewPolicy;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Invite\")")
    WebElement SendInvite;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Proceed\")")
    WebElement proceed;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Invite member to family account\")")
    WebElement invite;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add phone number\")")
    WebElement Mobile;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter phone number\")")
    WebElement EnterMobile;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add email address\")")
    WebElement Email;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter email address\")")
    WebElement EnterEmail;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Add more policies of Dummy\" or @text=\"Add more policies of Lovedeep\"]")
    WebElement AddMore;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Save updates\")")
    WebElement Save;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement Back;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    WebElement Back1;

    //Ashok mishra policy found family flow
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Lovedeep Singh\").instance(0)")
    WebElement kalpana;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(9)")
    WebElement Relation;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Send invite to Dummy' or @text='Send invite to Lovedeep']")
    WebElement Invitebottomsheet;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"phoneNumber\")")
    WebElement Contact;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Share invite link\")")
    WebElement InviteLinkbottomsheet;

    public void Family() throws InterruptedException {
        Thread.sleep(3000);
        TestUtil.click(familyAccount, "Family account click");
        Thread.sleep(2000);

        try {
            if (getStarted.isDisplayed()) {
                TestUtil.getScreenShot();
                LogUtils.info("Family account flow started for New user");
                TestUtil.getScreenShot();
                TestUtil.click(getStarted, "Get Started clicked");
                TestUtil util = new TestUtil();
                util.scrolltoElement("new UiSelector().text(\"Others\")");
                TestUtil.assertText(Father, "Father");
                TestUtil.assertText(Mother, "Mother");
                TestUtil.assertText(Spouse, "Spouse");
                TestUtil.assertText(Child, "Child");
                TestUtil.assertText(Others, "Others");
                TestUtil.click(Father, "Father");
                TestUtil.sendKeys(Fathername, "Dummy", "father name entered");
                TestUtil.getScreenShot();
                TestUtil.click(proceed, "proceed click");

            }
        } catch (NoSuchElementException e) {
            try {
                if (Back1.isDisplayed() && kalpana.isDisplayed()) {
                    TestUtil.getScreenShot();
                    LogUtils.info("Family account flow started for Existing user");
                    TestUtil.assertText(kalpana, "Lovedeep Singh");
                    TestUtil.assertText(memberFound, "Members found from your policy");
                    TestUtil.assertText(ViewPolicy, "View Policies");
                    TestUtil.assertText(SendInvite, "Invite");
                    TestUtil.click(kalpana, "Family account click");
                    Thread.sleep(2000);
                    TestUtil.click(Relation, "Relation click");
                    TestUtil.click(Father, "Father");
                    TestUtil.click(proceed, "proceed click");
                    Thread.sleep(3000);
                    TestUtil.getScreenShot();
                }
            } catch (NoSuchElementException d) {
                try {
                    if (Back1.isDisplayed()) {
                        TestUtil.getScreenShot();
                        LogUtils.info("Family account flow started for New user without get started CTA");
                        TestUtil.getScreenShot();
                        //  TestUtil.click(getStarted,"Get Started clicked");
                        TestUtil util = new TestUtil();
                        util.scrolltoElement("new UiSelector().text(\"Father\")");
                        TestUtil.assertText(Father, "Father");
//                        Thread.sleep(2000);
//                        driver.navigate().back();
                        TestUtil.assertText(Mother, "Mother");
                        TestUtil.assertText(Spouse, "Spouse");
                        TestUtil.assertText(Child, "Child");
                        TestUtil.assertText(Others, "Others");
                        TestUtil.click(Father, "Father");
                        TestUtil.sendKeys(Fathername, "Dummy", "father name entered");
                        TestUtil.getScreenShot();
                        TestUtil.click(proceed, "proceed click");
                    }

                } catch (RuntimeException ex) {
                    throw new RuntimeException(ex);
                }

            }

        }

        TestUtil.assertText(invite, "Invite member to family account");
        TestUtil.assertText(Mobile, "Add phone number");
        TestUtil.assertText(Email, "Add email address");
        TestUtil.getScreenShot();
        try {
            TestUtil.assertText(AddMore, "Add more policies of Dummy");
        } catch (junit.framework.ComparisonFailure e) {
            TestUtil.assertText(AddMore, "Add more policies of Lovedeep");
        }

        TestUtil.click(Mobile, "Add phone number click");
        Thread.sleep(2000);
        TestUtil.assertText(EnterMobile, "Enter phone number");
//        TestUtil.click(Email,"Add email address");
//        Thread.sleep(2000);
        TestUtil.assertText(EnterEmail, "Enter email address");
        TestUtil.getScreenShot();
        TestUtil.click(Save, "Save updates clicked");
        Thread.sleep(3000);
        try {
            TestUtil.click(AddMore, "Add more policies clicked");
        } catch (NoSuchElementException e) {
            TestUtil.click(AddMore, "Add more policies of clicked");
        }
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(Back, "Back clicked");
        Thread.sleep(2000);
        TestUtil.click(invite, "Invite member to family account clicked");
        try {
            TestUtil.click(Invitebottomsheet, "Send invite to Dummy");
            ;
        } catch (NoSuchElementException e) {
            TestUtil.click(Invitebottomsheet, "Send invite to Kalpana");
            ;
        }
        Thread.sleep(2000);
        TestUtil.sendKeys(Contact, "8208805844", "Contact number enter to invite");
        TestUtil.getScreenShot();
        TestUtil.assertText(InviteLinkbottomsheet, "Share invite link");
        TestUtil.click(Back, "Back clicked");
//        driver.navigate().back();
//        driver.navigate().back();
//        try {
//            if (getStarted.isDisplayed()) {
//                driver.navigate().back();
//            }
//        } catch (NoSuchElementException e) {
//            LogUtils.info("Catch run");
//        }
        while (true) {
            try {
                if (familyAccount.isDisplayed()) {
                    LogUtils.info("✅ Account screen visible");
                    break;
                }
            } catch (NoSuchElementException e) {
                LogUtils.info("Navigating back...");
                driver.navigate().back();
                Thread.sleep(3000); // small wait to let UI load
            }
        }
    }
}
