/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("What is the password?");
        Scanner input = new Scanner(System.in);
        String pass = input.nextLine();

        if (pass.equals("abc$123")) {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("I don't know you.");
        }
    }
}