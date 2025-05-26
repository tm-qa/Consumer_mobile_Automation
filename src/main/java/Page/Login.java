package Page;

import Base.TestBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtil;

public class Login extends TestBase {

    public Login() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"SKIP INTRO\")")
    WebElement skipIntro;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.google.android.gms:id/cancel\")")
    WebElement cancel;

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
        Thread.sleep(5000);
        skipIntro.click();
        TestUtil.click(cancel, "cancel");
        TestUtil.sendKeys(phoneNumber, "6999912345", "mobile number entered");
        TestUtil.click(conti, "continue");
        otp();
    }
    public void otp(){
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
