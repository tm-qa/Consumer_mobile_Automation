package Home_Test;

import Base.TestBase;
import Page.Login;
import Page.findPolicy_page;
import Page.upload_file;
import org.testng.annotations.*;

import java.io.IOException;

public class uploadPolicy extends TestBase {
    public uploadPolicy() {
        super();
    }

    Login lg;
    upload_file up;


    @BeforeClass
    public void start() throws IOException, InterruptedException {
        TurtlemintProApp("");
        up = new upload_file();

        lg = new Login();


        up.uploadFile();
        lg.login();

    }

    @Test( description = "Upload invalid Policy png")
    public void pngr_invalid_Test() throws InterruptedException {
        up.uploadPolicy();
    }
    @Test(priority = 1, description = "Upload Policy pdf + Share Link to family account")
    public void pdf_Test() throws InterruptedException {
        up.uploadpdf();
        up.deleteinvalidpng();
        up.familyAccountCheck();
    }


    @AfterClass
    public void close() {
    //    driver.quit();
    }

}
