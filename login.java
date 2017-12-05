/*****************************************************/
/* Class implementation Login
/* Creator: Adriana Devera
/* Modified by: 
/******************************************************/

/*Libraries*/

import java.util.Scanner;

/*Class Login*/

public class Login {

public static void main(String[] args) {

    String Email;
    String Password;

/*Static variables to test the inputs*/
    Email = "group11asd@gmail.com";
    Password = "123456*";

/*Inputs*/
    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Email) && password.equals(Password)) {

        System.out.println("Access Granted! Welcome to the social care system!");
    }

    else if (username.equals(Email)) {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password)) {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }

}


}

