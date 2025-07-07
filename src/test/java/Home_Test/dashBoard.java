package Home_Test;

import Base.TestBase;
import Page.Login;
import Page.NewUser_page;
import Page.dashboard_Page;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestUtil;

import java.net.MalformedURLException;

public class dashBoard extends TestBase {

    public dashBoard() {
        super();
    }

    Login lg;
    dashboard_Page dash;
    NewUser_page user;




    @BeforeMethod
    public void start() throws MalformedURLException, InterruptedException {
        TurtlemintProApp();
        lg = new Login();
        dash = new dashboard_Page();
        user = new NewUser_page();

        lg.login();

    }

    @Test(description = "Profile creation")
    public void ProfileCreation() throws InterruptedException {
        user.profileCreation("appium","appium","10-10-1994");

    }
    @Test(description = "Verifying all the fields on Home Page ")
    public void verifyDetails_Test() throws InterruptedException {
        dash.dashboardCheck();

    }

    @AfterMethod
    public void close() {
          driver.quit();
    }

}
