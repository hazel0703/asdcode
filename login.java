/*****************************************************/
/* Class implementation login
/*
/******************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*The following libraries are needed in this file, and i do not know how to declare them*/
//import user;

public class Login{

	String email;
	String password;

	public Integer signIn(email, password){

	}


	public Boolean signOut(email, password){

	}


	public static void main(String[] args) 
    {

	System.out.println("Welcome to your Social Care Site!");
    System.out.println("\nEnter your username and password to login to your account.");    

    System.out.println("Username: ");
        username = input.nextLine();

    System.out.println("Password: ");
        password = input.nextLine();

        User login = new UserAccount(email, password);

        if(login.checkPassword())
            System.out.println("You are logged in!");
        else
            System.out.println("The username and password you entered are incorrect.");
    }


}