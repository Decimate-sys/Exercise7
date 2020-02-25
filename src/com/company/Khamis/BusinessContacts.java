package com.company.Khamis;

/**
 * Created by 112609 on 2/25/2020.
 */
public class BusinessContacts extends Person {
    private String phoneNumber;


    public BusinessContacts(String name, String email, String phoneNumber) {
        super(name, email);
        this.phoneNumber = phoneNumber;
    }

    public BusinessContacts() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" and your phone number is " + phoneNumber);
    }
}
