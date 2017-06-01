package ru.crystals.site.google;

import ru.crystals.site.google.pages.InboxPage;
import ru.crystals.site.google.pages.LogoutPage;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;

/**
 * Created by user on 23.05.2017.
 */
@JSite(domain = "https://mail.google.com")
public class GmailSite extends WebSite {

    @JPage(url = "/mail/u/0/#inbox")
    public static InboxPage inboxPage;

    @JPage(url = "https://accounts.google.com/Logout?hl=en-GB&continue=https://mail.google.com/mail&service=mail&timeStmp=1495575538&secTok=.AG5fkS8Cg9HaGGjOqd0W0f7Q3rrarsHMyw")
    public static LogoutPage logoutPage;
}
