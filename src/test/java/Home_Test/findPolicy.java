package Home_Test;

import Base.TestBase;
import Page.Login;
import Page.findPolicy_page;
import Page.upload_file;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;

public class findPolicy extends TestBase {
    public findPolicy() {
        super();
    }

    Login lg;
    findPolicy_page dash;


    @BeforeMethod
    public void start() throws IOException, InterruptedException {
        TurtlemintProApp("");
        upload_file up = new upload_file();
       // up.uploadFile();
        lg = new Login();
        dash = new findPolicy_page();

        lg.login();

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

    @Test(priority = 3,description = "valid with full name + Comprehensive")
    public void findpolicy() throws InterruptedException {

        dash.findPolicyassert();
    }

    @AfterMethod
    public void close() {
          driver.quit();
    }

}
