package com.epam.jdi.entities;

/**
 * Created by user on 24.05.2017.
 */
public class Email {
    public String from;
    public String subject;
    public String body;

    public Email(String from, String subject, String body){
        this.from = from;
        this.subject = subject;
        this.body = body;
    }
}
