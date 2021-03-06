package com.company;
/**
 * arrayset.java creates a new array and then store the input fields from the data file inside. It gets and returns
 * the file values to the main.
 * @param COMP 167 Lab 3 NCAT
 * @author Sanjit Verma
 * @since 2/12/2020
 * @param firstName to hold first name
 * @param lastName to hold last name
 * @param phoneNo to hold phone number
 * @param gender to hold gender
 * @param age to hold age value
 * @param email to hold email value
 */

public class arrayset {
    public String firstName;
    public String lastName;
    public String phonenum;
    public String gender;
    public String email;
    public int age;

public arrayset(String firstName, String lastName, String gender, int age, String phoneNo, String email) { //new array
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phonenum = phoneNo;
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPhoneNo() {
        return phonenum;
    }
    public void setphonenum(String phoneNo) {
        this.phonenum = phoneNo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}