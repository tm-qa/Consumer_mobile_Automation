package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestUtil;

import static Base.TestBase.driver;

public class GPT_Flow {
    public GPT_Flow() {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    WebElement closeButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Insurance\")")
    WebElement Insurance;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(18)")
    WebElement Bot;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(11)")
    WebElement NewChat;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    WebElement TextBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"send\")")
    WebElement Send;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"✅ The analysis is complete! You can now ask me any questions related to the policy!\")")
    WebElement AnalysisComplete;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"attachment\")")
    WebElement Attachment;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"OG-26-1904-1805-00087907_1762421996783.pdf\")")
    WebElement AttachmentFile;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"OG-26-1904-1805-00087907\")")
    WebElement PolicyNumber;

    public void Insurance_Flow() throws InterruptedException {
        TestUtil.click(closeButton, "Close add");
        TestUtil.click(Insurance, "Insurance clicked");
        TestUtil.click(Bot, "Bot clicked");
        TestUtil.click(NewChat, "New chat clicked");
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.sendKeys(TextBox, "What is Hospital cash", "Text box entered");
        TestUtil.click(Send, "Send clicked");

        Thread.sleep(5000);
        TestUtil.getScreenShot();
        TestUtil.sendKeys(TextBox, "What is Add ons", "Text box entered");
        TestUtil.click(Send, "Send clicked");
        Thread.sleep(5000);
        TestUtil.getScreenShot();
        TestUtil.click(Attachment, "Attachment clicked");
        TestUtil.click(AttachmentFile, "Attachment file clicked");

        Thread.sleep(40000);
        TestUtil.getScreenShot();
        TestUtil.sendKeys(TextBox, "What is Add ons", "Text box entered");
        TestUtil.click(Send, "Send clicked");
        Thread.sleep(40000);
        TestUtil.getScreenShot();
        TestUtil.click(Attachment, "Attachment clicked");
        TestUtil.click(AttachmentFile, "Attachment file clicked");
//        Thread.sleep(8000);
        TestUtil.click(Send, "Send clicked");
        Thread.sleep(3000);
        TestUtil.sendKeys(TextBox, "What is My Policy Number", "Text box entered");
        TestUtil.click(Send, "Send clicked");
        Thread.sleep(10000);
        TestUtil.sendKeys(TextBox, "What is My Policy Number", "Text box entered");
        TestUtil.click(Send, "Send clicked");
        Thread.sleep(35000);
        TestUtil.assertText(PolicyNumber, "OG-26-1904-1805-00087907");
        TestUtil.getScreenShot();

    }

    public void Chat_With_Doc() throws InterruptedException {

        Thread.sleep(2000);
        TestUtil.click(Send, "Send clicked");
        Thread.sleep(3000);
        TestUtil.assertText(AnalysisComplete, "✅ The analysis is complete! You can now ask me any questions related to the policy!");
        TestUtil.getScreenShot();

        TestUtil.sendKeys(TextBox, "What is Policy Number", "Text box entered");


        Thread.sleep(1000);
        TestUtil.sendKeys(TextBox, "Hi", "Text box entered");

        TestUtil.click(Send, "Send clicked");
        Thread.sleep(5000);
        TestUtil.assertText(PolicyNumber, "OG-26-1904-1805-00087907");
        TestUtil.getScreenShot();


    }

}
