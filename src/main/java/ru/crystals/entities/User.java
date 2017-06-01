package ru.crystals.entities;

/**
 * Created by Roman_Iovlev on 5/21/2015.
 */
public class User {
    public static final User DEFAULT = new User("framebassman.test", "@T(DjJw3\"J@Y!8@A");

    public String name;
    public String password;

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }
}

