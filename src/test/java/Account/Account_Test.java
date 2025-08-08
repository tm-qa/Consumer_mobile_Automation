package Account;

import Base.TestBase;
import Page.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.net.MalformedURLException;

public class Account_Test extends TestBase {

    public Account_Test() {
        super();
    }

    Login lg;


    @BeforeMethod
    public void start() throws MalformedURLException, InterruptedException {
        TurtlemintProApp("");


        lg = new Login();

    }

    @Test
    public void consumerLogin_Test() throws InterruptedException {
        lg.login();
        lg.profileSetting();
        System.out.println("Life flow completed");
    }

    @AfterMethod
    public void close() {
        //  driver.quit();
    }

}
