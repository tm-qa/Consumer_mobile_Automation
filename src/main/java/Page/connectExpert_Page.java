package Page;

import Base.TestBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtil;

public class connectExpert_Page extends TestBase {

    public connectExpert_Page() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement closebutton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Family Account\")")
    WebElement FamilyAccount;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Connect With Expert\")")
    WebElement ConnectWithExpert;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Health\")")
    WebElement Health;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Life\")")
    WebElement Life;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Motor\")")
    WebElement Motor;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Save & Next\")")
    WebElement SaveNext;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Know your policy\")")
    WebElement Knowyourpolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Review Insurance Portfolio\")")
    WebElement ReviewInsurancePortfolio;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Purchase a New Policy\")")
    WebElement PurchaseNewPolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Save on Taxes with Insurance\")")
    WebElement SaveonTaxeswithInsurance;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Renew Policy\")")
    WebElement RenewPolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter reason here\")")
    WebElement Enterreasonhere;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Schedule A Call\")")
    WebElement SchedulCall;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Congratulations! Your call has been scheduled\")")
    WebElement CongratulationsYourcallhasbeenscheduled;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add Policy\")")
    WebElement AddPolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"My family\")")
    WebElement aMyFamily;


    public void connectWithExpertSchedule() throws InterruptedException {
        TestUtil.click(ConnectWithExpert, "Connect With Expert");
        Thread.sleep(1500);
        TestUtil.getScreenShot();
        TestUtil.click(Health, "Health click");
        TestUtil.click(SaveNext, "Save Next click");
        TestUtil.click(Knowyourpolicy, "Know your policy click");
        TestUtil.click(SaveNext, "Save Next click");
        TestUtil.sendKeys(Enterreasonhere,"Appium reson enter Test","Messaege entered");
        TestUtil.click(SaveNext, "Save Next click");
        TestUtil.click(SchedulCall, "Schedule a Call click");
        TestUtil.assertText(CongratulationsYourcallhasbeenscheduled, "Congratulations! Your call has been scheduled");
        TestUtil.assertText(AddPolicy, "Add Policy");
    }

    public void connectExpertCheck() throws InterruptedException {
        TestUtil.click(ConnectWithExpert, "Connect With Expert");
        Thread.sleep(1500);
        TestUtil.getScreenShot();
        TestUtil.click(Health, "Health click");
        TestUtil.click(SaveNext, "Save Next click");
        TestUtil.click(closebutton, "close button click");

        TestUtil.click(ConnectWithExpert, "Connect With Expert");
        TestUtil.click(Life, "Life click");
        TestUtil.click(SaveNext, "Save Next click");
        TestUtil.click(closebutton, "close button click");

        TestUtil.click(ConnectWithExpert, "Connect With Expert");
        TestUtil.click(Motor, "Motor click");
        TestUtil.click(SaveNext, "Save Next click");
        TestUtil.click(closebutton, "close button click");
    }
}
