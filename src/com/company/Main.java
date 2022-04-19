package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Array array = new Array();
        boolean exit = false;

        do {
            try {
                System.out.println("Press 1 to view the array");
                System.out.println("press 2 to rotate the array");
                System.out.println("Press 3 to end the program");
                int userInput = scanner.nextInt();
                switch (userInput) {
                    case 1 -> array.print();
                    case 2 -> array.rotate();
                    case 3 -> exit = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid input");
                scanner.nextLine(); //clear scanner
            }
        } while(!exit);
        System.out.println("Goodbye");

    }
}
