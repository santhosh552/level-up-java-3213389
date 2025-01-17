package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        
        boolean lengthGreaterThan6 = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;

        if (password.length() > 6)
          lengthGreaterThan6 = true; 

        for(int i=0; i < password.length(); i++)
        {
            if (Character.isUpperCase(password.charAt(i)))
            {
                hasUpperCase = true;
            }
            else if (Character.isLowerCase(password.charAt(i)))
            {
                hasLowerCase = true;
            }
            else if (Character.isDigit(password.charAt(i)))
            {
                hasNumber = true;
            }
        }

        if (lengthGreaterThan6 && hasUpperCase && hasLowerCase && hasNumber)
          return true;
        
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
