package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main.java obtains the filename from the command line argument and uses the split function to parse the input. It then
 * stores it into the array created inside arrayset. The main class also stores the input fields into a formatted string
 * and stores each string into the 1D array.
 */
public class Main{
    static String firstName;
    static String lastName;
    static String phoneNo;
    static String gender;
    static int age;
    static String email;
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
                if (phoneNo.length() == 13) {
                    phoneNo = phoneNo;
                }
                if (email.matches("[A-Z][0-9].@")) {
                    email = email;
                }
                list.add(new arrayset(firstName, lastName, gender, age, phoneNo, email));
            }
            input.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error Wrong File!");
        }
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
