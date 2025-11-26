package Page;

import Base.TestBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import utils.LogUtils;
import utils.TestUtil;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Cashless extends TestBase {

    public Cashless() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Find a policy\")")
    WebElement findaPolicy;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Motor\")")
    WebElement Motor;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"vehicleRegistrationNumber\")")
    WebElement MotorNumber;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Search\")")
    WebElement Search;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Insurance\")")
    WebElement Insurance;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement back;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Hero Motocorp Pleasure\")")
    WebElement Hero;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(21)")
    WebElement Assetclk;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"pincode\")")
    WebElement Pincode;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"View Details\"]")
    WebElement ViewDetail1;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Cashless garages\")")
    WebElement Cashlessgrg;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_one_time_button\")")
    WebElement Locatoionper;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement closeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button1\")")
    WebElement Location;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter City\")")
    WebElement City;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter Garage Name\")")
    WebElement Garage;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"8114050920\")")
    WebElement Mobile;

    /// Garage
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View more\").instance(1)")
    WebElement ViewMore;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View more\")")
    WebElement ViewMore1;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Suraj (You)\")")
    WebElement Suraj;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(15)")
    WebElement PolicyPDP;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Know your policy, View your policy details\")")
    WebElement KnowPolicy;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View Cashless Hospitals\")")
    WebElement CashlesHospital;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"All Insurer\")")
    WebElement AllInsurer;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Manipal Cigna Health Insurance\")")
    WebElement cigna;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter Pincode\")")
    WebElement pincode;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View All\")")
    WebElement Viewall;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Gandhi Hospital\")")
    WebElement Gandhi;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(5)")
    WebElement share;

    public void GarageSearch() throws InterruptedException {
        TestUtil.click(findaPolicy, "Find a Policy clicked");
        TestUtil.sendKeys(MotorNumber, "MH12QD3579", "Vehicle number enter");
        Thread.sleep(3000);
        TestUtil.click(Search, "Search clicked");
        Thread.sleep(5000);
        TestUtil.click(back, "Cross clicked");
        Thread.sleep(3000);
        TestUtil.click(back, "back clicked");
        TestUtil.click(Insurance, "Insurance clicked");
        TestUtil.click(Hero, "Policy clicked");
        TestUtil.click(Assetclk, "Asset clicked");
        TestUtil.sendKeys(Pincode, "411046", "Pincode enter");
        TestUtil.click(ViewDetail1, "View Detail clicked");
        Thread.sleep(3000);
        TestUtil.click(Assetclk, "Asset clicked");
        TestUtil.click(Cashlessgrg, "Cashless garage clicked");
        Thread.sleep(3000);
        TestUtil.click(Locatoionper, "Loaction permission done");
        Thread.sleep(2000);
        TestUtil.click(back, "Cross clicked");
        Thread.sleep(2000);
        driver.navigate().back();
        TestUtil.click(Cashlessgrg, "Cashless garage clicked");
        Thread.sleep(4000);
//        TestUtil.click(Location,"Loaction permission done");
//        Thread.sleep(3000);
        TestUtil.getScreenShot();
        TestUtil.sendKeys(City, "Pune", "City entered");
        Thread.sleep(3000);
        TestUtil.getScreenShot();
        TestUtil.sendKeys(Garage, "KANPUR CAR CARE CENTER", "Garage Name entered");
        TestUtil.getScreenShot();
        TestUtil.click(Mobile, "Mobile clicked");
        Thread.sleep(3000);
        TestUtil.getScreenShot();
    }

    public void CashlessHospital() throws InterruptedException {
        TestUtil.click(Insurance, "Insurance clicked");
        Thread.sleep(4000);
        ViewMoreLoop();
        TestUtil.click(PolicyPDP, "Policy clicked");
        TestUtil.click(KnowPolicy, "Know your policy clicked");
        Thread.sleep(2000);
//         TestUtil.click(back, "Cross clicked");
        TestUtil.scrolltoElement("new UiSelector().text(\"View Cashless Hospitals\")");
        Thread.sleep(3000);
        TestUtil.click(closeButton, "Close add");
        TestUtil.getScreenShot();
        TestUtil.click(CashlesHospital, "Cashless Hospital clicked");
        Thread.sleep(2000);
        TestUtil.click(Locatoionper, "Loaction permission done");
        Thread.sleep(2000);
           driver.navigate().back();
        TestUtil.click(CashlesHospital, "Cashless Hospital clicked");
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(AllInsurer, "All insurer clicked");
        TestUtil.click(cigna, "Cigna insurer clicked");
        TestUtil.sendKeys(pincode, "411028", "Pincode entered");
        Thread.sleep(3000);
        TestUtil.waitUntilVisibilityOfElement(Viewall);
        TestUtil.getScreenShot();
        TestUtil.click(Viewall, "View all clicked");
        Thread.sleep(3000);
        TestUtil.click(Gandhi, "Gandhi Hospital clicked");
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(share, "Share button clicked");
        Thread.sleep(3000);
        TestUtil.getScreenShot();

    }

    public void ViewMoreLoop() {
        //Update this logic on proper way as curent logic takes time
        while (true) {
            try {
                TestUtil.click(Suraj, "Suraj policy clicked");
                Thread.sleep(3000);
                TestUtil.getScreenShot();
                LogUtils.info("Heath policy found");
                break;
            } catch (TimeoutException | InterruptedException e) {
                LogUtils.info("Suraj health policy not found");
                try {
                    LogUtils.info("Retrying clicking View more cta");
                    try {
                        TestUtil.click(ViewMore, "View more clicked");
                        Thread.sleep(2000);
                    } catch (TimeoutException w) {
                        TestUtil.click(ViewMore1, "View more1 clicked");
                    }
                    TestUtil util = new TestUtil();
                    util.scrolltoElement("new UiSelector().description(\"Rajesh, Not covered\")");
                    //new UiSelector().className("android.view.ViewGroup").instance(30)

                    Thread.sleep(3000); // small wait
                } catch (Exception ex) {
                    System.out.println("View More button not found, stopping.");
                    break;
                }
            }
        }
    }
}
