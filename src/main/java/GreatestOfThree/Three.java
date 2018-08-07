package GreatestOfThree;

import java.util.Scanner;

public class Three {

    public static void main(String[] args) {

        double first;
        double second;
        double third;

        System.out.println("Enter 3 numbers, i will show you the biggest one: ");

        Scanner scanner = new Scanner(System.in);

        first = scanner.nextDouble();
        second = scanner.nextDouble();
        third = scanner.nextDouble();

        if (first > second && first > third) {
            System.out.println("Number " + first + " is the greatest");
        } else if (second > first && second > third) {
            System.out.println("Number " + second + " is the greatest");
        } else {
            System.out.println("Number " + third + " is the greatest");

        }
    }
}
