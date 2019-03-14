package org.redi;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("We've got the number : " + getUserInputNumber());

        //System.out.println("We got the number: " + getNumber());

        /*
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = new ArrayList<String>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");

        try {
            int number = scanner.nextInt();
            // InputMismatchException
            System.out.println(String.format("We got the number %s.", number));

            System.out.println(
                    String.format("The string at %s index is %s",
                            number, stringList.get(number)));

        } catch (InputMismatchException e) {
            System.out.println("Please enter a number");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Please enter a number less than " + stringList.size());
        } finally {
            System.out.println("Thank you for entering inputs");
        }
        */

        /*
         catch (Exception e) {
            System.out.println("Something happened");
        }
        */


        // IndexOutOfBoundsException
        //List<String> stringList = new ArrayList();
        //stringList.get(2);
    }

    static int getUserInputNumber() {

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                if (number > 2) {
                    throw new RediAppException("The user input should be smaller than 3");
                }

                return number;

            } catch (InputMismatchException e) {
                System.out.println("You should enter a number.");
                //throw new FileNotFoundException("A number is expected.", e);
            } catch (RediAppException e) {
                System.out.println("You should enter a number smaller than 3.");
            }
        }
    }

    static int getNumber() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                // InputMismatchException
                System.out.println(String.format("We got the number %s.", number));
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number");
            } catch (RuntimeException e) {
                System.out.println("Something happened");
            }
        }
    }
}
