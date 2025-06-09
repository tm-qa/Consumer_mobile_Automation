package Home_Test;

import Base.TestBase;
import Page.Login;
import Page.connectExpert_Page;
import Page.findPolicy_page;
import Page.upload_file;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class connectExpert  extends TestBase {
        public connectExpert() {
            super();
        }

        Login lg;
        connectExpert_Page conectExpert;


        @BeforeMethod
        public void start() throws IOException, InterruptedException {
            TurtlemintProApp();


            lg = new Login();
            conectExpert = new connectExpert_Page();

            lg.login();

        }

        @Test( description = "connect With Expert Schedule")
        public void connectWithExpertSchedule_Test() throws InterruptedException {

            conectExpert.connectWithExpertSchedule();

        }

        @Test(description = "valid all insurance category")
        public void connectExpertCheckTest() throws InterruptedException {
            conectExpert.connectExpertCheck();

        }

        @AfterMethod
        public void close() {
            driver.quit();
        }

    }
