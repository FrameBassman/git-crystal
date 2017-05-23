package gmail;

import com.epam.jdi.entities.Email;
import com.epam.jdi.site.epam.EpamSite;
import com.epam.jdi.site.google.AccountsGoogleSite;
import com.epam.jdi.site.google.GmailSite;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.web.matcher.junit.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

import static com.epam.jdi.uitests.core.settings.JDISettings.logger;
import static com.epam.jdi.uitests.web.selenium.driver.WebDriverUtils.killAllRunWebBrowsers;

/**
 * Created by user on 23.05.2017.
 */
public abstract class TestsBase extends TestNGBase {

    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        WebSite.init(AccountsGoogleSite.class);
        WebSite.init(GmailSite.class);
        logger.info("Run Tests");
    }

    @AfterSuite(alwaysRun = true)
    public static void tearDown() throws IOException {
        killAllRunWebBrowsers();
    }

    public static void assertEmailsAreEqual(Email actual, Email expected){
        Assert.areEquals(actual.body, expected.body, String.format("Email body should be %s", expected.body));
        Assert.areEquals(actual.subject, expected.subject, String.format("Email subject should be %s", expected.body));
        Assert.areEquals(actual.from, expected.from, String.format("Email should be sent from %s", expected.body));
    }
}
