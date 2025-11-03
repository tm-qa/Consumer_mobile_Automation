package Smoke;

import Base.TestBase;
import Page.*;
import com.slack.api.methods.SlackApiException;
import io.qameta.allure.Allure;
import org.testng.annotations.*;
import util.iTestListener;
import utils.TestUtil;
import org.openqa.selenium.interactions.Actions;
import javax.swing.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

@Listeners(iTestListener.class)
@Test(groups = {"smoke"})
public class smoke_Suite extends TestBase {

    public smoke_Suite() {
        super();
    }

    Login lg;
    AyushPay Ap;
    NewUser_page user;
    dashboard_Page dp;
    FamilyAccount FA;
    findPolicy_page FP;
    Cashless cg;

    PolicyFetch pf;



    @BeforeMethod
    public void start(Method method) throws IOException, InterruptedException {
        TestBase.MethodName = method.getName();
        TurtlemintProApp();
//        startGlobalPopupWatcher();
        lg = new Login();
        user = new NewUser_page();
        Ap = new AyushPay();
        //lg.login();
        dp = new dashboard_Page();
        FA = new FamilyAccount();
        FP = new findPolicy_page();
        pf = new PolicyFetch();
        cg = new Cashless();

        if (method.getName().equals("InstallLink") ||
                method.getName().equals("findpolicyMobNoInstalllink") ||
                TestBase.MethodName.equals("findpolicyMobNo")) {

            System.out.println("second login start");
            lg.stgLogin(method);
        } else {
            System.out.println("Existing login start");
            lg.login();
        }

    }

    @Test(description = "Login And Logout with 6999912345 number")
    public void login_logout_with_699912345() throws InterruptedException {
        user.profileLogout();
    }
    @Test(priority = 1,description = "Delete Account with 6999912345 number")
    public void DeleteAccount() throws InterruptedException {
        user.deleteAccount();
    }

    @Test(priority = 2,description = "Check policy Fetch through FN,LN")
    public void checkbyFNLN() throws InterruptedException {
        if (TestBase.env.equals("prod")) {

            user.profileCreation("lovedeep", "singh", "10-12-1998"); //Not calling claim flow
        } else {
            user.profileCreation("GAURAV","SINGH","14-07-1995");// calling claim for stage
        }
    }


    @Test(priority = 3, description = "New Profile with Claim flow")
    public void ProfileCreation() throws InterruptedException {
        //need to click on skip after profile journey
        user.deleteAccount();
        user.prof();
        user.profileCreation("appium","appium","10-10-1994");// Calling claim flow prod  //not calling claim for stage
    }

    @Test(priority = 4,description = "Check AyushPay")
    public void checkAyushpay() throws InterruptedException {
       Ap.AyushPayCheck();
    }

    @Test(priority = 5,description = "Check Dashboard")
    public void checkHomepage() throws InterruptedException {

       dp.dashboardCheck();
    }

    @Test(priority = 6,description = "Check Family")
    public void family() throws InterruptedException {
        FA.Family();
        Thread.sleep(2000);
     user.deleteAccount();
    }
/// Not applicable for stage as it requires some changes to be done in DB
    @Test(priority = 7,description = "Check Quote")
    public void QuoteZoop() throws InterruptedException {
        //Need to click on skip after profile journey
          user.profileCreation1("appium","appium","10-10-1994");
       FP.validRegNo("UP32GP5890");
        user.deleteAccount();
    }
    @Test(priority = 8,description = "Check Cashless Garage")
    public void cashless_garage() throws InterruptedException {
        //Need to click on skip after profile journey
        user.profileCreation1("appium","appium","10-10-1994");
        cg.GarageSearch();
    }

//    @Test(priority = 9,description = "Check Cashless Garage")
//    public void cashless_Hospital() throws InterruptedException {
////        user.profileCreation1("appium","appium","10-10-1994");
//        cg.CashlessHospital();
//    }
    /// Stage methods

    @Test(priority = 8, description = "Install link")
    public void InstallLink() throws InterruptedException {
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        user.profileCreation("appium", "appium", "10-10-1994");
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        user.deleteAccount();
        Thread.sleep(5000);
    }

    @Test(priority = 9, description = "Find a policy Alternate number")
    public void findpolicyalternateNo() throws InterruptedException {
//        user.deleteAccount();
//        lg.login();
        user.profileCreation1("dummy", "demo", "10-10-1994");
        pf.Alternate_no("3299010746");
        user.deleteAccount();
    }

    @Test(priority = 10, description = "Find a policy by Mobile number")
    public void findpolicyMobNo() throws InterruptedException {
        pf.MobileNo();
        user.deleteAccount();
    }

    @Test(priority = 11, description = "Find a policy by Mobile number and Install link")
    public void findpolicyMobNoInstalllink() throws InterruptedException {
        Thread.sleep(4000);
        TestUtil.getScreenShot();
        user.profileCreation1("dummy", "demo", "10-10-1994");
        Thread.sleep(4000);
        driver.navigate().back();
        pf.MobandInstallLink();
        user.deleteAccount();
    }


    @AfterMethod
    public void close() {

        driver.quit();
    }
    @AfterClass
    public void Screenshot() throws SlackApiException, IOException, InterruptedException {
        AllureServeAndSlackScreenshot a =new AllureServeAndSlackScreenshot();
        a.allureToSlack("Consumer App Smoke Suite Report");
    }
}
