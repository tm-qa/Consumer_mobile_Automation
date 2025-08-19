package Home_Test;

import Base.TestBase;
import Page.*;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LogUtils;
import utils.TestUtil;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class findPolicy extends TestBase {
    public findPolicy() {
        super();
    }

    Login lg;
    findPolicy_page dash;
    PolicyFetch pf;
    NewUser_page user;
    TestUtil util;

    @BeforeMethod
    public void start(Method method) throws IOException, InterruptedException {
        TurtlemintProApp("");
        upload_file up = new upload_file();
       // up.uploadFile();
        lg = new Login();
        dash = new findPolicy_page();
        pf = new PolicyFetch();
        user= new NewUser_page();
        util = new TestUtil();
        if(method.getName().equals("findpolicyMobNo")
                ||method.getName().equals("findpolicyMobNoInstalllink")){
            System.out.println("second login start");
            lg.stgLogin(method);
        }else {
            System.out.println("Existing login start");
            lg.login();
        }
//        lg.login();

    }

    @Test( description = "invalid Reg number mh90ab1234")
    public void motor_invalid_Test() throws InterruptedException {

        dash.Unabletofindpolicy("mh90ab1234");

    }

    @Test(priority = 1,description = "valid with Pincode + Third Party Only")
    public void motor_PolicyPincode_Test() throws InterruptedException {

        dash.validRegNo("KA05MH4626" );
        dash.pincode(560034);

    }
    @Test(priority = 2,description = "valid with full name + Comprehensive")
    public void motor_PolicyName_Test() throws InterruptedException {

        dash.validRegNo("UP32WN4357");
        dash.name("GURUMUKH. SINGH");
    }

    @Test(priority = 3,description = "Find a policy validations")
    public void findpolicy() throws InterruptedException {
        dash.findPolicyassert();
    }
    @Test(priority = 4,description = "Find a policy Alternate number")
    public void findpolicyalternateNo() throws InterruptedException {
        user.profileCreation1("dummy","demo","10-10-1994");
        pf.Alternate_no("3299010746");
    }
    @Test(priority = 5,description = "Find a policy by Mobile number")
    public void findpolicyMobNo() throws InterruptedException {
        pf.MobileNo();
        user.deleteAccount();
    }

    @Test(priority = 6,description = "Find a policy by Mobile number and Install link")
    public void findpolicyMobNoInstalllink() throws InterruptedException {
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        user.profileCreation1("dummy","demo","10-10-1994");
        Thread.sleep(4000);
        driver.navigate().back();
        pf.MobandInstallLink();
        user.deleteAccount();
    }


    @AfterMethod
    public void close() {
          driver.quit();
    }

}
