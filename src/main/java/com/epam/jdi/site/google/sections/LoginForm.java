package com.epam.jdi.site.google.sections;

import com.epam.jdi.entities.User;
import com.epam.jdi.uitests.core.interfaces.common.ITextField;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import org.openqa.selenium.support.FindBy;

/**
 * Created by user on 23.05.2017.
 */
public class LoginForm extends Form<User> {
    @FindBy(css = "[aria-label='Телефон или адрес электронной почты']")
    ITextField loginTextbox;

    @FindBy(css = "[aria-label='Введите пароль']")
    ITextField passwordTextbox;

    @FindBy(id = "identifierNext")
    Button identifierNextButton;

    @FindBy(id = "passwordNext")
    Button passwordNextButton;

    public void login(User user){
        loginTextbox.sendKeys(user.name);
        identifierNextButton.click();
        passwordTextbox.sendKeys(user.password);
        passwordNextButton.click();
    }
}
