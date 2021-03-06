package com.nguyen.reunion.model;

public class Member {

    private final String firstName;
    private final String lastName;

    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

