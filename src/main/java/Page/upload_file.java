package Page;

import Base.TestBase;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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

    @AndroidFindBy(xpath = "new UiSelector().text(\"upload documents\")")
    WebElement uploadDoc;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Choose from files\")")
    WebElement Choosefile;

    @AndroidFindBy(uiAutomator = "com.android.permissioncontroller:id/permission_allow_button")
    WebElement allow;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"dog.png\")")
    WebElement dogimageSelect;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.turtlemintconsumerapp:id/menu_crop\")")
    WebElement correct;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"The uploaded image is unclear or invalid. Please re-upload a valid policy image.\")")
    WebElement invalidDocError;


    public void uploadFile() throws InterruptedException, IOException {
         driver.pushFile("/sdcard/Download/dog.png", new File("/Users/tejasbahadure/Downloads/dog.png"));
        System.out.println("Image uploaded");

    }

    public void uploadPolicy(){}

}
