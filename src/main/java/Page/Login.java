package Page;

import Base.TestBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtil;

public class Login extends TestBase {
    TestUtil util = new TestUtil();
    public Login() {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(25)")
    WebElement skipIntro;
    @AndroidFindBy(uiAutomator ="new UiSelector().text(\"FINISH\")")
    WebElement Finish;

    @AndroidFindBy(uiAutomator ="new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_button\")" )
    WebElement Allow;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.google.android.gms:id/cancel\")")
    WebElement cancel;
    @AndroidFindBy(uiAutomator ="new UiSelector().text(\"Remind me later\")")
    WebElement RemindLater;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"phoneNumber\")")
    WebElement phoneNumber;

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


    public void login() throws InterruptedException {

          TestUtil.click(Allow,"Allow clicked");
//        Thread.sleep(5000);
//        TestUtil.click(RemindLater,"remind later clicked");
//        Thread.sleep(2000);

//        TestUtil.click(skipIntro,"skipIntro clicked");
//        Thread.sleep(3000);
//        Finish.click();

        // driver.findElement( AppiumBy.androidUIAutomator("new UiSelector().text(\"SKIP INTRO\")")).click();

          TestUtil.click(cancel, "cancel");
        TestUtil.sendKeys(phoneNumber, "6999912345", "mobile number entered");
        TestUtil.click(conti, "continue");
        otp();
    }

    public void otp() {
        TestUtil.sendKeys(one, "1", "one clicked");
        TestUtil.sendKeys(two, "2", "two clicked");
        TestUtil.sendKeys(three, "3", "three clicked");
        TestUtil.sendKeys(four, "4", "four clicked");
    }

    public void profileSetting() {
        TestUtil.click(Account, "");
        Assert.assertEquals(TestName.getText(), "TEST NAME");
    }


}
