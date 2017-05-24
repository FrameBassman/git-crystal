package gmail;

import com.epam.jdi.dataProviders.EmailsProvider;
import com.epam.jdi.entities.Email;
import com.epam.jdi.entities.User;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static com.epam.jdi.site.google.AccountsGoogleSite.loginForm;
import static com.epam.jdi.site.google.GmailSite.inboxPage;
import static com.epam.jdi.site.google.GmailSite.logoutPage;

/**
 * Created by user on 23.05.2017.
 */
public class GmailTest extends TestsBase {

    @BeforeMethod()
    public void before(Method method) {
        inboxPage.open();
        loginForm.login(User.DEFAULT);
    }

    @Test(dataProvider = "emails", dataProviderClass = EmailsProvider.class)
    public void gmailTest(Email expectedEmail){
        inboxPage.openEmailWithSubject(expectedEmail.subject);
        Email actualEmail = inboxPage.getOpenedEmail();

        TestsBase.assertEmailsAreEqual(actualEmail, expectedEmail);
    }

    @AfterMethod()
    public void after(Method method){
        logoutPage.open();
    }
}
