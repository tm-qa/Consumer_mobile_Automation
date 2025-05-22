package Page;

import Base.TestBase;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtil;

import java.io.File;
import java.io.IOException;

public class upload_file extends TestBase {

    public upload_file() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Upload\n" +
            "Policy\")")
    WebElement uploadPolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Find a policy\")")
    WebElement findaPolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"upload documents\").instance(0)")
    WebElement uploadDoc;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"upload documents\").instance(1)")
    WebElement uploadDoc2;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Policy 1\")")
    WebElement policy1;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Policy 2\")")
    WebElement policy2;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add more policies\")")
    WebElement Addmorepolicies;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Choose from files\")")
    WebElement Choosefile;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.android.permissioncontroller:id/permission_allow_button\")")
    WebElement allow;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"dog.png\")")
    WebElement dogimageSelect;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"c9f63362-16d1-4dcc-a613-f189e16e516e_217e4f29-a687-4f6b-aba3-ea65b98e7f2c_1732863890476.pdf\")")
    WebElement pdf;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.turtlemintconsumerapp:id/menu_crop\")")
    WebElement correct;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"The uploaded image is unclear or invalid. Please re-upload a valid policy image.\")")
    WebElement invalidDocError;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Show roots\")")
    WebElement threeDots;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Downloads\")")
    WebElement downlods;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Next\")")
    WebElement next;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Takes up to 2 mins\")")
    WebElement Takesupto2mins;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Share invite link\")")
    WebElement share;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"skip\")")
    WebElement skip;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Manage Your Family's Policies in One Place\")")
    WebElement managefamilyaccount;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Family account\")")
    WebElement familyAccount;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Get started\")")
    WebElement getstarted;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    WebElement back;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"The uploaded image is unclear or invalid. Please re-upload a valid policy image.\")")
    WebElement errorforinvalid;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(6)")
    WebElement deletepng;




    public void uploadFile() throws InterruptedException, IOException {
      //  driver.pushFile("/sdcard/Download/dog.png", new File("/Users/tejasbahadure/Downloads/dog.png"));
        driver.pushFile("/sdcard/Download/c9f63362-16d1-4dcc-a613-f189e16e516e_217e4f29-a687-4f6b-aba3-ea65b98e7f2c_1732863890476.pdf", new File("/Users/tejasbahadure/Downloads/c9f63362-16d1-4dcc-a613-f189e16e516e_217e4f29-a687-4f6b-aba3-ea65b98e7f2c_1732863890476.pdf"));
        System.out.println("Image uploaded");

    }

    public void uploadPolicy() throws InterruptedException {
        TestUtil.click(findaPolicy,"");
        TestUtil.click(uploadPolicy,"upload policy clicked");
        TestUtil.click(Addmorepolicies,"Add more policies clicked");
        TestUtil.assertText(policy1,"Policy 1");
        TestUtil.assertText(policy2,"Policy 2");
        TestUtil.click(uploadDoc,"upload Doc");
        TestUtil.click(Choosefile,"Choose file");
        TestUtil.click(allow,"allow");
        TestUtil.click(threeDots,"");
        TestUtil.click(downlods,"");
        TestUtil.click(dogimageSelect,"dog img select");
        TestUtil.click(correct,"dog img select");
        Thread.sleep(2000);
        TestUtil.getScreenShot();

    }
    public void uploadpdf() throws InterruptedException {

        TestUtil.click(uploadDoc,"upload Doc");
        TestUtil.click(Choosefile,"Choose file");
        TestUtil.click(threeDots,"");
        TestUtil.click(downlods,"");
        TestUtil.click(pdf,"pdf select");
        Thread.sleep(2000);
        TestUtil.getScreenShot();

    }

    public void deleteinvalidpng() throws InterruptedException {
        TestUtil.assertText(errorforinvalid,"The uploaded image is unclear or invalid. Please re-upload a valid policy image.");
        TestUtil.click(deletepng,"deeyte file");
        Thread.sleep(2000);
        TestUtil.getScreenShot();

    }

    public void familyAccountCheck() throws InterruptedException {
        TestUtil.click(next,"next butto click");
        TestUtil.assertText(Takesupto2mins,"Takes up to 2 mins");
        TestUtil.click(share,"share click");
        TestUtil.assertText(managefamilyaccount,"Manage Your Family's Policies in One Place");
        TestUtil.click(getstarted,"get started click");
        TestUtil.assertText(familyAccount,"Family account");
        Thread.sleep(2000);
        TestUtil.getScreenShot();

    }

}
