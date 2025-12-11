package Base;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class TestBase {
    public static String env;
    public static String oldd;
    public static String MethodName;
    public static AndroidDriver driver;

    public static void TurtlemintProApp() throws MalformedURLException, InterruptedException {
        System.out.println("started suite");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("deviceName", "Pixel 8 Pro");
        desiredCapabilities.setCapability("udid", "emulator-5554");
        /// Actual device path

//        desiredCapabilities.setCapability("udid", "807923a4");
//        desiredCapabilities.setCapability("deviceName", "CPH2573");
        /// existing code
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "12");


//        desiredCapabilities.setCapability("noReset", "true");
//        desiredCapabilities.setCapability("fullReset", "false");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
//                         desiredCapabilities.setCapability("app", "/home/ubuntu/storage/consumer.apk");
        /// APK installation path
//        desiredCapabilities.setCapability("app", "/Users/surajgarud/Downloads/app-preprod-universal-release.apk");
//        desiredCapabilities.setCapability("app", "/Users/surajgarud/Downloads/467.apk");

        desiredCapabilities.setCapability("appPackage", "com.turtlemintconsumerapp");
        desiredCapabilities.setCapability("appActivity", "com.turtlemintconsumerapp.MainActivity");

/// letest android 11+ doesnt allow to reset or clear app data so added this line.
//        desiredCapabilities.setCapability("noReset", true);
//        desiredCapabilities.setCapability("fullReset", false);
//        desiredCapabilities.setCapability("appActivity", "com.turtlemintconsumerapp.SplashActivity");

//        desiredCapabilities.setCapability("appPackage", "com.turtlemintconsumerapp.dev");
//       desiredCapabilities.setCapability("appActivity", "com.turtlemintconsumerapp.MainActivity");
//        desiredCapabilities.setCapability("appPackage", "com.turtlemintconsumerapp.preprod");
//        desiredCapabilities.setCapability("appActivity", "com.turtlemintconsumerapp.MainActivity");
        // desiredCapabilities.setCapability("appWaitActivity", "*");

        String apk = desiredCapabilities.getCapability("appPackage").toString();
        env = apk.contains(".dev") ? "stage" : "prod";
        if(apk.contains(".dev")){
            env = "stage";
        }else if(apk.contains(".preprod")){
            env = "sanity";
        }else{
            env = "prod";
        }
        URL url = new URL("http://127.0.0.1:4723/");
        //   driver = new AndroidDriver(new URL("http://localhost:4723/"), desiredCapabilities);

        // URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, desiredCapabilities);


        // driver = new AndroidDriver(url, desiredCapabilities);
        System.out.println("Application Start");
    }


}
