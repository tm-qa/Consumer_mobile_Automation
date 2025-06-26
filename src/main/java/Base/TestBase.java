package Base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    public static AndroidDriver driver;

    public static void TurtlemintProApp() throws MalformedURLException, InterruptedException {
        System.out.println("started suite");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("deviceName", "Pixel 7");
        desiredCapabilities.setCapability("udid", "emulator-5554");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "12");

//        desiredCapabilities.setCapability("noReset", "true");
//        desiredCapabilities.setCapability("fullReset", "false");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        //                  desiredCapabilities.setCapability("app", "/home/ubuntu/storage/consumer.apk");
        desiredCapabilities.setCapability("app", "/home/ubuntu/storage/prodconsumer.apk");

        desiredCapabilities.setCapability("appPackage", "com.turtlemintconsumerapp");
        desiredCapabilities.setCapability("appActivity", "com.turtlemintconsumerapp.MainActivity");


      //  URL url = new URL("http://127.0.0.1:4723/");


        URL url =   new URL("http://127.0.0.1:4723/wd/hub");



        driver = new AndroidDriver(url, desiredCapabilities);
        System.out.println("Application Start");
    }
}
