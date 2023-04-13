package com.booleanuk.core;

public class Author {
    private String name;
    private String emailAddress;
    private String website;
    private String telephoneNumber;

    public Author(String name, String emailAddress, String website, String telephoneNumber) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.website = website;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getWebsite() {
        return website;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getDetails() {
        return "Name: " + this.getName() + " Email: " + this.emailAddress + " Website: " + this.website + " Tel No: " + this.telephoneNumber;
    }
}
