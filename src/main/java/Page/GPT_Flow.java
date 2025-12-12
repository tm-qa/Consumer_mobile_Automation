package Page;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.LogUtils;
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
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Honda Shine, Policy: , Expired\")")
    WebElement Policy;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"ICICI LOMBARD\")")
    WebElement ICICI_Lombard;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(12)")
    WebElement Bot;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(10)")
    WebElement Bot_PDP;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"e13cfed3c4cccca7417333d2c5809c97\")")
    WebElement Policy_download;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.ViewGroup\").instance(11)")
    WebElement NewChat;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    WebElement TextBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"db1a20e170b9567936f8a7e49df008ad\")")
    WebElement Send;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Your insurer is ICICI Lombard General Insurance Company Limited.\")")
    WebElement Message;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Your insurer is ICICI Lombard General Insurance Company Limited. They are responsible for underwriting the insurance policy mentioned in your documents.\")")
    WebElement Message2;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Your insurer is ICICI Lombard General Insurance Company Limited. They are responsible for providing the insurance coverage for your policy, which includes underwriting the terms, managing associated risks, and handling claims as per the policy conditions.\")")
    WebElement Message3;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Based on the document provided, I cannot find information to answer that question.\")")
    WebElement Message4;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"✅ The analysis is complete! You can now ask me any questions related to the policy!\")")
    WebElement AnalysisComplete;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"45304594bf668f146a13ab6f07fd2fad\")")
    WebElement Attachment;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"OG-26-1904-1805-00087907_1765194383850.pdf\")")
    WebElement AttachmentFile;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"OG-26-1904-1805-00087907\").instance(0)")
    WebElement PolicyNumber;

    public void Insurance_Flow() throws InterruptedException {
//        TestUtil.click(closeButton, "Close add");
        TestUtil.click(Insurance, "Insurance clicked");
        TestUtil.click(Bot, "Bot clicked");
        TestUtil.click(NewChat, "New chat clicked");
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.sendKeys(TextBox, "What is Hospital cash", "Text box entered");
        TestUtil.click(Send, "Send clicked");
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
        TestUtil.click(Insurance, "Insurance clicked");
        TestUtil.click(Policy, "Policy clicked");
        TestUtil.click(ICICI_Lombard, "ICICI Lombard clicked");
        TestUtil.click(Bot_PDP, "Bot clicked");
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        TestUtil.click(Policy_download, "Policy download clicked");
        Thread.sleep(1000);
        TestUtil.sendKeys(TextBox, "Hi", "Text box entered");
        TestUtil.click(Send, "Send clicked");
        Thread.sleep(35000);
        TestUtil.sendKeys(TextBox, "What is my insurer", "Text box entered");
        TestUtil.click(Send, "Send clicked");
        Thread.sleep(30000);
        if (TestUtil.isVisible(Message)) {
            TestUtil.assertText(Message, "Your insurer is ICICI Lombard General Insurance Company Limited.");
            TestUtil.getScreenShot();
            LogUtils.info("Message verified successfully");

        }
        if (TestUtil.isVisible(Message2)) {
            TestUtil.assertText(Message2, "Your insurer is ICICI Lombard General Insurance Company Limited. They are responsible for underwriting the insurance policy mentioned in your documents.");
            TestUtil.getScreenShot();
            LogUtils.info("Message2 verified successfully");
        }
        if (TestUtil.isVisible(Message3)) {
            TestUtil.assertText(Message3, "Your insurer is ICICI Lombard General Insurance Company Limited. They are responsible for providing the insurance coverage for your policy, which includes underwriting the terms, managing associated risks, and handling claims as per the policy conditions.");
            TestUtil.getScreenShot();
            LogUtils.info("Message3 verified successfully");
        }
        TestUtil.sendKeys(TextBox, "What hospital cash", "Text box entered");
        TestUtil.click(Send, "Send clicked");
        Thread.sleep(30000);
        TestUtil.assertText(Message4, "Based on the document provided, I cannot find information to answer that question.");
        TestUtil.getScreenShot();
        TestUtil.BackNavigation();
    }


}
