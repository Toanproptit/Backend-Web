package com.example.demo.Model;

public class Personal {
    private String lastName,firstName;
    private String address,birthday,email;
    public Personal(String lastName , String firstName,String address,String birthday,String email){
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }
}
