package Home_Test;

import Base.TestBase;
import Page.Login;
import Page.NewUser_page;
import Page.hiddenPolicies_Page;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class hiddenPolicies extends TestBase {
    Login lg;
    hiddenPolicies_Page Hiddenpage;
    NewUser_page user;

    @BeforeMethod
    public void start() throws IOException, InterruptedException {
        TurtlemintProApp();


        lg = new Login();
        Hiddenpage = new hiddenPolicies_Page();

        lg.login();
        user = new NewUser_page();

    }
    @Test(description = "Credit card")
    public void Hiddenpolicy() throws InterruptedException {
//        user.deleteAccount();
//       lg.login();
        user.profileCreation("appium","appium","10-10-1994");
        Hiddenpage.Hiddenpolicies();



    }
}
