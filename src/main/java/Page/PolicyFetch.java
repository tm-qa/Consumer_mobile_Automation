package Page;

import Base.TestBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.xalan.xsltc.dom.AdaptiveResultTreeImpl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.LogUtils;
import utils.TestUtil;

public class PolicyFetch extends TestBase {
    Login lg = new Login();
    TestUtil util = new TestUtil();
    NewUser_page np = new NewUser_page();

    public PolicyFetch() {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"firstName\")")
    WebElement firstName;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"lastName\")")
    WebElement lastName;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"DD-MM-YYYY\")")
    WebElement dob; //10-10-1994

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"buttonComponent\")")
    WebElement cont;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Find a policy\")")
    WebElement findaPolicy;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Search by\n" +
            "other number\")")
    WebElement Search_by_other_number;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter your mobile number\")")
    WebElement EnterMobile;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Search\")")
    WebElement Search;

//    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pankaj\").instance(1)")
//    WebElement Pradit;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pankaj\")")
    WebElement Pradit;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"ex: Father\")")
    WebElement Relation;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Father\")")
    WebElement Father;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add\")")
    WebElement Add;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(16)")
    WebElement cartClick;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Pankaj, Total coverage: , ₹50,00,000\")")
    WebElement Pnkaj;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Know your policy\")")
    WebElement KnowPolicy;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    WebElement Share;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Call Expert\")")
    WebElement expert;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"See your other policies\")")
    WebElement otherPolici;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"PANKAJ MAHOR\").instance(0)")
    WebElement Name;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Skip\")")
    WebElement Skip;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement closeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Verify It's You\")")
    WebElement Verify;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"name\")")
    WebElement FullName;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"10-10-1994\")")
    WebElement Dob;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"DD-MM-YYYY\")")
    WebElement Dob1;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"pincode\")")
    WebElement Pincode;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View Details\")")
    WebElement View;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Insurance\")")
    WebElement Insurance;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pradip Kumar\").instance(1)")
    WebElement Pradip;

    public void Alternate_no(String num) throws InterruptedException {
        TestUtil.click(Skip, "");
       // TestUtil.click(closeButton, "close");
        TestUtil.click(findaPolicy, "finda Policy clicked");
        TestUtil.click(Search_by_other_number, "Alternate number clicked");
        TestUtil.getScreenShot();
        TestUtil.sendKeys(EnterMobile, num, "Mobile number entered");
///3299010746
        TestUtil.click(Search, "search clicked");
        Thread.sleep(2000);
        lg.otp();
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        util.scrollToElementAndClick(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Others\")"), "up", 1);
        TestUtil.click(Pradit, "policy asset clicked");
        TestUtil.getScreenShot();
        TestUtil.click(Relation, "Relation clicked");
        TestUtil.click(Father, "father clicked");
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(Add, "Add clicked");
        Thread.sleep(2000);
        driver.navigate().back();
        TestUtil.click(Pnkaj, "Pankaj Policy cart clicked");
        TestUtil.getScreenShot();
        TestUtil.click(cartClick, "Policy cart clicked");
        TestUtil.click(KnowPolicy, "Know Your Policy clicked");
        TestUtil.click(Share, "");
        Thread.sleep(4000);
         TestUtil.click(closeButton, "close");
        TestUtil.click(Share, "Share clicked");
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(Share, "");
        TestUtil.assertText(expert,"Call Expert");
        TestUtil.assertText(otherPolici,"See your other policies");
        TestUtil.assertText(Name,"PANKAJ MAHOR");
        TestUtil.BackNavigation();

    }

    public void MobileNo() throws InterruptedException {
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        np.profileCreation1("appium", "appium", "10-10-1994");
        TestUtil.click(Verify, "verify its you clicked");
        FullName.clear();
        TestUtil.sendKeys(FullName, "Pradip Kumar Pandit", "Full name entered");
        Dob.clear();
        TestUtil.sendKeys(Dob1, "10-02-1979", "DOB entered");
        Pincode.clear();
        TestUtil.sendKeys(Pincode, "814165", "Pincode entered");
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(View, "View detail clicked");
        Thread.sleep(2000);
        driver.navigate().back();
        TestUtil.click(Skip, "");
        TestUtil.click(closeButton, "close");
        TestUtil.click(Insurance, "Insurance clicked");
        Thread.sleep(1000);
        TestUtil.getScreenShot();
        LogUtils.info("Delete account started");

    }
    public void MobandInstallLink() throws InterruptedException {
        TestUtil.click(Skip,"Skip clicked");
        TestUtil.click(closeButton,"Close clicked");
        TestUtil.click(Insurance, "Insurance clicked");
        Thread.sleep(1000);
        util.scrollToElementAndClick(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Others\")"), "up", 1);
        TestUtil.getScreenShot();
        TestUtil.click(Pradip,"Pradip Kumar clicked");
        Thread.sleep(2000);
        TestUtil.click(Relation, "Relation clicked");
        TestUtil.click(Father, "father clicked");
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(Add, "Add clicked");
        Thread.sleep(3000);
        TestUtil.getScreenShot();
        driver.navigate().back();
        LogUtils.info("Delete account started");
    }

}
