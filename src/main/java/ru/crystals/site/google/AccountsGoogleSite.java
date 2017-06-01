package ru.crystals.site.google;

import ru.crystals.site.google.sections.LoginForm;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.openqa.selenium.support.FindBy;

/**
 * Created by user on 23.05.2017.
 */
@JSite(domain = "https://accounts.google.com")
public class AccountsGoogleSite extends WebSite {

    @FindBy(css = "form")
    public static LoginForm loginForm;
}
