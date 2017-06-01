package ru.crystals.dataProviders;

import ru.crystals.entities.Email;
import org.testng.annotations.DataProvider;

/**
 * Created by user on 24.05.2017.
 */
public final class EmailsProvider {
    private EmailsProvider() { }

    @DataProvider(name = "emails")
    public static Object[][] emails() {
        return new Object[][]{
                {new Email("framebassman@gmail.com", "Test subject", "Test body")}
        };
    }
}