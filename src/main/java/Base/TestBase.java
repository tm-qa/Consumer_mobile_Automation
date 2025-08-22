package Base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    public static String env;
    public static String MethodName;
   public static AndroidDriver driver;

   public static void TurtlemintProApp() throws MalformedURLException, InterruptedException {

      DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

      desiredCapabilities.setCapability("deviceName", "Pixel 8 Pro");
      desiredCapabilities.setCapability("udid", "emulator-5554");
      desiredCapabilities.setCapability("platformName", "Android");
      desiredCapabilities.setCapability("platformVersion", "12");

//        desiredCapabilities.setCapability("noReset", "true");
//        desiredCapabilities.setCapability("fullReset", "false");
      desiredCapabilities.setCapability("automationName", "UiAutomator2");
     //               desiredCapabilities.setCapability("app", "/Users/tejasbahadure/Downloads/app-release.apk");
      desiredCapabilities.setCapability("appPackage", "com.turtlemintconsumerapp");
      desiredCapabilities.setCapability("appActivity", "com.turtlemintconsumerapp.MainActivity");


//       desiredCapabilities.setCapability("appPackage", "com.turtlemintconsumerapp.dev");
//       desiredCapabilities.setCapability("appActivity", "com.turtlemintconsumerapp.MainActivity");

       String apk = desiredCapabilities.getCapability("appPackage").toString();
       env = apk.contains(".dev") ? "stage" : "prod";
      URL url = new URL("http://127.0.0.1:4723/");

      driver = new AndroidDriver(url, desiredCapabilities);
      System.out.println("Application Start");
   }
}
