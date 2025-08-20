package Smoke;

import Base.TestBase;
import Page.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.iTestListener;
import utils.TestUtil;

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


    @BeforeMethod
    public void start(Method method) throws MalformedURLException, InterruptedException {
        TurtlemintProApp();
        if(method.getName().equals("InstallLink")){
            System.out.println("second login start");
            lg.stgLogin(method);
        }else {
            System.out.println("Existing login start");
            lg.login();
        }
        lg = new Login();
        user = new NewUser_page();
        Ap = new AyushPay();
        lg.login();
        dp = new dashboard_Page();
        FA = new FamilyAccount();
        FP = new findPolicy_page();

    }

    @Test(description = "Login And Logout with 6999912345 number")
    public void login_logout_with_699912345() throws InterruptedException {
        user.profileLogout();
    }
    @Test(priority = 3, description = "NEW Profile creation with 6999912345 number")
    public void ProfileCreation() throws InterruptedException {
        user.deleteAccount();
        user.prof();
        user.profileCreation("appium","appium","10-10-1994");
    }

    @Test(priority = 1,description = "Delete Account with 6999912345 number")
    public void DeleteAccount() throws InterruptedException {
        user.deleteAccount();
    }

    @Test(priority = 2,description = "Check policy Fetch through FN,LN")
    public void checkbyFNLN() throws InterruptedException {
        user.profileCreation("Ashok","mishra","07-09-1975");

    }

    @Test(priority = 4,description = "Check AyushPay")
    public void checkAyushpay() throws InterruptedException {
       Ap.AyushPayCheck();
    }

    @Test(priority = 5,description = "Check Dashboard")
    public void checkHomepage() throws InterruptedException {
        //lg.login();
       dp.dashboardCheck();
    }

    @Test(priority = 6,description = "Check Family")
    public void family() throws InterruptedException {
     //  user.profileCreation1("appium","appium","10-10-1994");
        FA.Family();
    }

    @Test(priority = 7,description = "Check Quote")
    public void QuoteZoop() throws InterruptedException {
        //  user.profileCreation1("appium","appium","10-10-1994");
       FP.validRegNo("UK03B4273");
    }

    public void InstallLink() throws InterruptedException {
        // lg.stgLogin();
        Thread.sleep(2000);
        TestUtil.getScreenShot();
        user.profileCreation("appium","appium","10-10-1994");
        //  driver.navigate().back();
    }
    @AfterMethod
    public void close() {
        driver.quit();
    }
}