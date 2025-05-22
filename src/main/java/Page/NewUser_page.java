package Page;

import Base.TestBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtil;


public class NewUser_page extends TestBase {

    public NewUser_page() {
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

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Life\")")
    WebElement Life;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement closeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Health\")")
    WebElement Health;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Other methods to fetch health policy\")")
    WebElement Otherhealthpolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Other methods to fetch life policy\")")
    WebElement Otherlifepolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Other methods to fetch motor policy\")")
    WebElement Othermotorpolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"vehicleRegistrationNumber\")")
    WebElement vehicleRegistrationNumber; //enter

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Search\")")
    WebElement search;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"We're unable to find your policy using the vehicle registration number\")")
    WebElement unabletofindPolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Upload your policy\")")
    WebElement uploadPolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"MOTOR\")")
    WebElement MOTOR;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Motor Insurance\")")
    WebElement MotorInsurance;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Verify It's You\")")
    WebElement verifyitsyou;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Time to celebrate\")")
    WebElement timetocelebrate;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"We have found your policy!\")")
    WebElement Wefoundyourpolicy;



    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement back;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"pincode\")")
    WebElement pincodee;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"View Details\")")
    WebElement viewDetails;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"MEDIKONDALA VENKATESH NAIDU\").instance(0)")
    WebElement medikonda;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement Closeinvitefamily;




    public void profileCreation() throws InterruptedException {

        TestUtil.sendKeys(firstName,"Appium","first Name select");
        TestUtil.sendKeys(lastName,"Test","last Name Select");
        TestUtil.sendKeys(dob,"10-10-1994","DOB entered");
        Thread.sleep(1000);
        TestUtil.click(cont,"Continue clicked");
        try {
            TestUtil.click(closeButton,"Close add");
        }catch (Exception e){

        }
    }


}