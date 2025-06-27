package Smoke;

import Base.TestBase;
import Page.Login;
import Page.NewUser_page;
import Page.AyushPay;
import Page.dashboard_Page;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.iTestListener;

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


    @BeforeMethod
    public void start() throws MalformedURLException, InterruptedException {
        TurtlemintProApp();
        lg = new Login();
        user = new NewUser_page();
        Ap = new AyushPay();
        lg.login();
        dp = new dashboard_Page();

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
//        user.deleteAccount();
//        lg.login();
        user.profileCreation("Ashok","mishra","07-09-1975");
       // user.byname();
    }









//    @Test(priority = 1,description = "Check AyushPay")
//    public void checkAyushpay() throws InterruptedException {
//       Ap.AyushPayCheck();
//    }

//    @Test//(priority = 1,description = "Check Dashboard")
//    public void checkHomepage() throws InterruptedException {
//
//        //lg.login();
//       dp.dashboardCheck();
//    }



    @AfterMethod
    public void close() {
        driver.quit();
    }
}