package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter your full name: ");
        String fullName = scan.nextLine();


        System.out.println("\nName: " + fullName);
        System.out.println("Reason for learning Java: I love the structure");
        System.out.println("Career goal: To become a skilled software developer and build efficient, real-world applications.");

    }
}
