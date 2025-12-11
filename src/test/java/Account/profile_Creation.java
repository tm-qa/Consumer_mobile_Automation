package Account;

import Base.TestBase;
import Page.Login;
import Page.*;
import Page.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.iTestListener;

import java.io.IOException;
import java.net.MalformedURLException;

@Listeners(iTestListener.class)
@Test(groups = {"NEWProfileCreation"})
public class profile_Creation extends TestBase {

    public profile_Creation() {
        super();
    }

    Login lg;
    NewUser_page user;


    @BeforeMethod
    public void start() throws IOException, InterruptedException {
        TurtlemintProApp();
        lg = new Login();
        user = new NewUser_page();

        lg.login();

    }

    @Test(description = "NEW Profile creation with 6999912345 number")
    public void ProfileCreation() throws InterruptedException {
        user.profileCreation("appium","appium","10-10-1994");

    }

    @AfterMethod
    public void close() {
        driver.quit();
    }

}

