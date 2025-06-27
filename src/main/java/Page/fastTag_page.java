package Page;

import Base.TestBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtil;

public class fastTag_page extends TestBase {

    public fastTag_page() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    TestUtil util = new TestUtil();


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View More\")")
    WebElement ViewMore;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Fastag\")")
    WebElement Fastag;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Family Account\")")
    WebElement FamilyAccount;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Connect With Expert\")")
    WebElement ConnectWithExpert;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Emergency Fund\")")
    WebElement EmergencyFund;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Know your policy\")")
    WebElement Knowyourpolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Hidden Policies\")")
    WebElement HiddenPolicies;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Claims\").instance(0)")
    WebElement Claims;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Renewals\")")
    WebElement Renewals;


    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Know your advisor\")")
    WebElement Knowyouradvisor;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add advisor\")")
    WebElement Addadvisor;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"My family\")")
    WebElement MyFamily;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Organise all your family policies in one place\")")
    WebElement Organiseallyourfamilypoliciesinoneplace;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View Family\")")
    WebElement ViewFamily;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Claims\")")
    WebElement Claimsbottom;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Insurance\")")
    WebElement Insurancebottom;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"My family\")")
    WebElement aMyFamily;


    public void fasttage() throws InterruptedException {

       // TestUtil.click(ViewMore, "View More");

        TestUtil.click(Fastag, "Fas tag");


        util.scrollToElementAndClick(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Know your advisor\")"), "up", 1);
        Thread.sleep(1500);
        TestUtil.assertText(Knowyouradvisor, "Know your advisor");
        TestUtil.assertText(Addadvisor, "Add advisor");
        util.scrollToElementAndClick(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"My family\")"), "up", 2);
        Thread.sleep(1500);
        TestUtil.assertText(MyFamily, "My family");
        TestUtil.assertText(Organiseallyourfamilypoliciesinoneplace, "Organise all your family policies in one place");
        TestUtil.assertText(ViewFamily, "View Family");
        TestUtil.getScreenShot();

    }
}

