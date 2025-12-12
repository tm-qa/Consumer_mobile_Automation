package Page;

import Base.TestBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtil;

public class AyushPay extends TestBase {
    TestUtil util = new TestUtil();

    public AyushPay() {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy (uiAutomator = "new UiSelector().text(\"Emergency Fund\")")
    WebElement  emergencyFund;

    @AndroidFindBy (uiAutomator = "new UiSelector().text(\"Medical Loan\")")
    WebElement  MedicalLoan;

    @AndroidFindBy (uiAutomator = "new UiSelector().text(\"Search for Hospitals in your area here...\")")
    WebElement  HospitalSearch;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement closeButton;
    @AndroidFindBy (uiAutomator = "new UiSelector().text(\"Pune Netralaya, Pune\")")
    WebElement  HospitalSelect;
    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"Get plan at ₹399/ year\")")
    WebElement  GetPlan;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Skip\")")
    WebElement Skip;
    public void AyushPayCheck() throws InterruptedException {
//        if(TestBase.env.equals("stage")){
//            TestUtil.click(Skip, "Continue clicked");
//        }
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        try{
            TestUtil.click(MedicalLoan,"medical Loan clicked");
        }
        catch (Exception e){
            TestUtil.click(emergencyFund,"Emergency Fund clicked");
        }
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        util.scrollToElementAndClick(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"Search for Hospitals in your area here...\")"),"up",2);
        Thread.sleep(3000);
        //TestUtil.click(closeButton, "close");
        TestUtil.sendKeys(HospitalSearch,"PUNE","Area name entered");
        Thread.sleep(3000);
        TestUtil.getScreenShot();
//        TestUtil.click(HospitalSelect,"Hospital selected");
//        Thread.sleep(3000);
//        TestUtil.click(HospitalSelect,"Hospital selected");
//        Thread.sleep(3000);
//        TestUtil.getScreenShot();
//        TestUtil.click(GetPlan,"Get Plan at 399 clicked");
//        Thread.sleep(3000);
//        TestUtil.getScreenShot();


    }
}
