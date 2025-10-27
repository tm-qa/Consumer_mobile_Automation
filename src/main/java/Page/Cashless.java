package Page;

import Base.TestBase;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import junit.framework.Test;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.LogUtils;
import utils.TestUtil;

public class Cashless extends TestBase {

    public Cashless(){
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
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button1\")")
    WebElement Location;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter City\")")
    WebElement City;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Enter Garage Name\")")
    WebElement Garage;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"8114050920\")")
    WebElement Mobile;

    ///Garage
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View more\").instance(1)")
    WebElement ViewMore;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View more\")")
    WebElement ViewMore1;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Suraj (You)\")")
    WebElement Suraj;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(15)")
    WebElement PolicyPDP;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Know your policy, View your policy details\")")
    WebElement KnowPolicy;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View Cashless Hospitals\")")
    WebElement CashlesHospital;

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
        TestUtil.click(Hero,"Policy clicked");
        TestUtil.click(Assetclk,"Asset clicked");
        TestUtil.sendKeys(Pincode, "411046", "Pincode enter");
        TestUtil.click(ViewDetail1, "View Detail clicked");
        Thread.sleep(3000);
        TestUtil.click(Assetclk,"Asset clicked");
        TestUtil.click(Cashlessgrg,"Cashless garage clicked");
        Thread.sleep(3000);
        TestUtil.click(Locatoionper,"Loaction permission done");
        driver.navigate().back();
        TestUtil.click(Cashlessgrg,"Cashless garage clicked");
        Thread.sleep(4000);
//        TestUtil.click(Location,"Loaction permission done");
//        Thread.sleep(3000);
        TestUtil.getScreenShot();
        TestUtil.sendKeys(City,"Pune","City entered");
        Thread.sleep(3000);
        TestUtil.getScreenShot();
        TestUtil.sendKeys(Garage,"KANPUR CAR CARE CENTER","Garage Name entered");
        TestUtil.getScreenShot();
        TestUtil.click(Mobile,"Mobile clicked");
        Thread.sleep(3000);
        TestUtil.getScreenShot();
    }
//    public void CashlessHospital() throws InterruptedException {
//        TestUtil.click(Insurance, "Insurance clicked");
//        ViewMoreLoop();
//        TestUtil.click(PolicyPDP,"Policy clicked");
//        TestUtil.click(KnowPolicy,"Know your policy clicked");
//        Thread.sleep(2000);
//       // TestUtil.click(back, "Cross clicked");
//        TestUtil.scrolltoElement("new UiSelector().text(\"View Cashless Hospitals\")");
//        TestUtil.getScreenShot();
//        TestUtil.click(CashlesHospital,"Cashless Hospital clicked");
//        Thread.sleep(2000);
//        TestUtil.click(Locatoionper,"Loaction permission done");
//        driver.navigate().back();
//        TestUtil.click(CashlesHospital,"Cashless Hospital clicked");
//        Thread.sleep(2000);
//        TestUtil.getScreenShot();

//        TestUtil.click(Assetclk,"Asset clicked");
//        TestUtil.sendKeys(Pincode, "411046", "Pincode enter");
//        TestUtil.click(ViewDetail1, "View Detail clicked");
//        Thread.sleep(3000);
//        TestUtil.click(Assetclk,"Asset clicked");
//        TestUtil.click(Cashlessgrg,"Cashless garage clicked");
//        Thread.sleep(3000);
//        TestUtil.click(Locatoionper,"Loaction permission done");
//        driver.navigate().back();
//        TestUtil.click(Cashlessgrg,"Cashless garage clicked");
//        Thread.sleep(4000);
////        TestUtil.click(Location,"Loaction permission done");
////        Thread.sleep(3000);
//        TestUtil.getScreenShot();
//        TestUtil.sendKeys(City,"Pune","City entered");
//        Thread.sleep(3000);
//        TestUtil.getScreenShot();
//        TestUtil.sendKeys(Garage,"KANPUR CAR CARE CENTER","Garage Name entered");
//        TestUtil.getScreenShot();
//        TestUtil.click(Mobile,"Mobile clicked");
//        Thread.sleep(3000);
//        TestUtil.getScreenShot();

//    }
    public void ViewMoreLoop(){
        while(true){
            try{
                TestUtil.click(Suraj,"Suraj policy clicked");
                Thread.sleep(3000);
                TestUtil.getScreenShot();
                LogUtils.info("Heath policy found");
                break;
            }catch (TimeoutException | InterruptedException e){
                LogUtils.info("Suraj health policy not found");
                try {
                    LogUtils.info("Retrying clicking View more cta");
                    try {
                        TestUtil.click(ViewMore, "View more clicked");
                    }catch (TimeoutException w){
                        TestUtil.click(ViewMore1, "View more1 clicked");
                    }
                  TestUtil util = new TestUtil();
                    util.scrolltoElement("new UiSelector().description(\"Rajesh, Not covered\")");

                    Thread.sleep(1000); // small wait
                } catch (Exception ex) {
                    System.out.println("View More button not found, stopping.");
                    break;
                }
            }
        }
    }
}
