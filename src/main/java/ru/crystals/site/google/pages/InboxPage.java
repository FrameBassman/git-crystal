package ru.crystals.site.google.pages;

import ru.crystals.entities.Email;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindBy;

/**
 * Created by user on 23.05.2017.
 */
public class InboxPage extends WebPage {

    @FindBy(css = "[aria-label='Поиск']")
    ITextField searchTextbox;

    @FindBy(css = "[aria-label='Поиск Gmail']")
    Button searchButton;

    @FindBy(xpath = "(//colgroup//..//tr[1])[2]")
    Button email;

    @FindBy(css = ".ha>h2")
    public IText emailSubject;

    @FindBy(xpath = "(//span[@email])[1]")
    public IText emailFrom;

    @FindBy(xpath = "//div[@dir='ltr']")
    public IText emailBody;

    public void openEmailWithSubject(String subject){
        searchTextbox.sendKeys(subject);
        searchButton.click();
        email.click();
    }

    public Email getOpenedEmail(){
        String from = this.emailFrom.getAttribute("email");
        String subj = this.emailSubject.getText();
        String body = this.emailBody.getText();

        return new Email(from, subj, body);
    }
}
