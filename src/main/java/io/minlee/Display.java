package io.minlee;

import java.util.Scanner;

/**
 * Created by minlee on 5/19/16.
 */
public class Display {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();

        if((name .equals("Bob"))||(name.equals("Alice"))){
            System.out.println("Welcome back "+name);
        }
        else {
            System.out.println("I don't know you!");
        }

    }
}
