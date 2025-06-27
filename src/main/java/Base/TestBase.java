package Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {

    public static AndroidDriver driver;

//    public static void TurtlemintProApp() throws MalformedURLException, InterruptedException {
//        System.out.println("started suite");
//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//
//        desiredCapabilities.setCapability("deviceName", "Pixel 7");
//        desiredCapabilities.setCapability("udid", "emulator-5554");
//        desiredCapabilities.setCapability("platformName", "Android");
//        desiredCapabilities.setCapability("platformVersion", "12");
//
////        desiredCapabilities.setCapability("noReset", "true");
////        desiredCapabilities.setCapability("fullReset", "false");
//        desiredCapabilities.setCapability("automationName", "UiAutomator2");
//        //                  desiredCapabilities.setCapability("app", "/home/ubuntu/storage/consumer.apk");
//        desiredCapabilities.setCapability("app", "/home/ubuntu/storage/prodconsumer.apk");
//
//        desiredCapabilities.setCapability("appPackage", "com.turtlemintconsumerapp");
//        desiredCapabilities.setCapability("appActivity", "com.turtlemintconsumerapp.MainActivity");
//
//
//        URL url = new URL("http://127.0.0.1:4723/");
//
//
//     //   URL url =   new URL("http://127.0.0.1:4723/wd/hub");
//
//     //   driver = new AndroidDriver(new URL("http://localhost:4723/"), desiredCapabilities);
//
//
//        driver = new AndroidDriver(url, desiredCapabilities);
//        System.out.println("Application Start");
//    }

        public static void TurtlemintProApp() throws MalformedURLException, InterruptedException {
        System.out.println("Starting Appium session for Turtlemint Consumer App...");

        UiAutomator2Options options = new UiAutomator2Options();

        options.setDeviceName("Pixel 7");
        options.setUdid("emulator-5554");
        options.setPlatformName("Android");
        options.setPlatformVersion("12");

        // Appium 2.x requires fully qualified path to APK
        options.setApp("/home/ubuntu/storage/prodconsumer.apk");

        options.setAppPackage("com.turtlemintconsumerapp");
        options.setAppActivity("com.turtlemintconsumerapp.MainActivity");

        options.setAutomationName("UiAutomator2");

        // Optional capabilities
        // options.setNoReset(true);
        // options.setFullReset(false);

        // Appium server URL (Jenkins server where Appium is running)
        URL url = new URL("http://127.0.0.1:4723/");

        // Initialize the AndroidDriver (this automatically uses W3C compatible request for Appium 2.x)
        driver = new AndroidDriver(url, options);

        System.out.println("Appium session started. App launched successfully!");
    }
}
