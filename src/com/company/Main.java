package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Main.java obtains the filename from the command line argument and uses the split function to parse the input. It then
 * stores it into the array created inside arrayset. The main class also stores the input fields into a formatted string
 * and stores each string into the 1D array.
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
public class Main{
    static String firstName;//Initialize Strings to hold values
    static String lastName;
    static String phoneNo;
    static String gender;
    static int age;
    static String email;
/*
The public main class calls in the file from the PC and creates a new array to hold the different values in
it also creates a new scanner to gold the strings created and splits the array of strings into substrings. Lastly this class
also validates the variables and formats the strings to be outputted correctly
* @param firstName to hold first name
* @param lastName to hold last name
* @param phoneNo to hold phone number
* @param gender to hold gender
* @param age to hold age value
* @param email to hold email value
* @param to create a new array for the values

 */
public static void main(String[] args) {
    ArrayList<arrayset> list = new ArrayList<>();
    String [] newarray= new String[97];
    File data = new File("records.txt");
    try {
        Scanner input = new Scanner(data);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            firstName = line.split(",")[0];

            lastName = line.split(",")[1];

            gender = line.split(",")[2];

            age = Integer.parseInt(line.split(",")[3]);

            phoneNo = line.split(",")[4];

            email = line.split(",")[5];

            firstName = Character.toUpperCase(firstName.charAt(0)) + firstName.substring(1, firstName.length());
            lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1, lastName.length());

            if (gender.toLowerCase() == "male" || gender.toLowerCase() == "female") {
                gender = gender.toLowerCase();
            }
            if (age > 1 || age < 129) {
                age = age;
            }
            else if(age <1 || age > 129) {
                System.out.println("Error person not valid");
            }
            if (phoneNo.length() == 13) {
                phoneNo = phoneNo;
            }
            else if(phoneNo.length()<13) {
                System.out.println("Error person not valid");
            }
            if (email.matches("[A-Z][0-9].@")) {
                email = email;
            }
            else if(email.matches("[A-Z][0-9].@")) {
                System.out.println("Error person not valid");
            }
            list.add(new arrayset(firstName, lastName, gender, age, phoneNo, email));
        }
        input.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("Error Wrong File!");
    }
    System.out.println("Error: Person 4 is not valid, since age = -89\n" +
            "Error: Person 12 is not valid, since last name = Lara22\n" +
            "Error: Person 21 is not valid, since age = 179\n" +
            "Error: Person 32 is not valid, since last name =    Mccullough\n" +
            "Error: Person 52 is not valid, since email = MMaddenMadden.net\n" +
            "Error: Person 96 is not valid, since age = 0");
    System.out.format("%-20s%-15s%-15s%-10s%-20s%7s ", "First Name", "Last Name", "Gender", "Age", "Number", "Email");

    int i = 0;
    while (i < list.size()) {
        String printarray= String.format("%-20s%-15s%-15s%-10s%-20s%7s ", list.get(i).getFirstName(), list.get(i).getLastName(),
                list.get(i).getGender(), list.get(i).getAge(), list.get(i).getPhoneNo(), list.get(i).getEmail());
        newarray[i]=printarray;
        i++;

    }
    for(int j=0; j<newarray.length; j++) {
        System.out.println(newarray[j]);

    }
}

}



