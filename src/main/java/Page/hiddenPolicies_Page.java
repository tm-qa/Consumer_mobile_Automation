package Page;

import Base.TestBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtil;

public class hiddenPolicies_Page extends TestBase {

    public hiddenPolicies_Page() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement closebutton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Family Account\")")
    WebElement FamilyAccount;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Hidden Policies\")")
    WebElement HiddenPolicies;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"CreditCardprovider\")")
    WebElement search;


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(4)")
    WebElement sbi;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"SBI Card ELITE\")")
    WebElement sbiElite;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add to my policies\")")
    WebElement addtoPolicy;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View other policies\")")
    WebElement View_other_policies;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"CreditCardprovider\")")
    WebElement creditcardname;

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


    public void Hiddenpolicies() throws InterruptedException {
        TestUtil.click(HiddenPolicies, "Hidden Policies");
        Thread.sleep(1500);
        TestUtil.getScreenShot();
        TestUtil.sendKeys(search, "SBI", "Messaege entered");
        Thread.sleep(1500);
        TestUtil.getScreenShot();
        TestUtil.click(sbi,"SBI selected");
        Thread.sleep(2000);
        TestUtil.click(sbiElite,"SBI card selected");
        Thread.sleep(2000);
        TestUtil.click(addtoPolicy,"Add to my policy clicked");
        TestUtil.assertText(View_other_policies,"View other policies");

        TestUtil.getScreenShot();


    }

}

