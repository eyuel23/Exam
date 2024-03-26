package demo;
import java.util.Scanner;

public class Exam {
    //create an empty main method
    public static void main(String[] args) {
        // Example for printOddNumbers
        System.out.println("Odd numbers from 10 down to 1:");
        printOddNumbers();

        // Example for sum
        int[] numbers = {1, 2, 3, 4, 5, 10};
        System.out.println("Sum of numbers array: " + sum(numbers));

        // Example for average
        System.out.println("Average of numbers array: " + average(numbers));

        // Example for rollDice
        System.out.println("Random dice roll: " + rollDice());

        // Example for sumOfEven
        System.out.println("Sum of even numbers in array: " + sumOfEven(numbers));

        // Example for volumeOfCube
        int sideLength = 3;
        System.out.println("Volume of cube with side length " + sideLength + ": " + volumeOfCube(sideLength));

        // Example for countCharacter
        String testString = "hello world";
        char testChar = 'l';
        System.out.println("Number of '" + testChar + "' in \"" + testString + "\": " + countCharacter(testString, testChar));

        // Example for isPalindrome
        String palindrome = "racecar";
        System.out.println("\"" + palindrome + "\" is a palindrome: " + isPalindrome(palindrome));

        // Example for isLeapYear
        int year = 2023;
        System.out.println(year + " is a leap year: " + isLeapYear(year));
    }
//create a method that only prints odd numbers from 10 down to 1
    public static void printOddNumbers() {
        int i = 10;
        while (i >= 1) {                                    //1
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i--;
        }
    }

    //write a method that takes n array of integers and returns the sum of all the numbers in the array
    public static int sum(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {                  //2
            sum += ints[i];
        }
        return sum;
    }

    //write a method that calculates the average of all the numbers in the array
    public static double average(int[] ints) {
        double sum = sum(ints);                                  //3
        double average = sum / ints.length;
        return average;
    }


    //write a method that generates a random number between 1 and 6
    public static int rollDice() {
        int randomNumber = (int) (Math.random() * 6 + 1);                    //4
        return randomNumber;
    }


    //write a method that calculates the sum fo all even numbers in an array
    public static int sumOfEven(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {                 //5
            if (ints[i] % 2 == 0) {
                sum += ints[i];
            }
        }
        return sum;
    }


    //write a method that calculates the volume of a cube
    public static int volumeOfCube(int side) {
        return side * side * side;                              //6
    }


    //write a method that counts how many times a particular character appears in a string
    public static int countCharacter(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {                 //7
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
    //create a method that determines if a string is a palindrome
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {                    //8
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }


    //create a method that checks if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;                                             //9
        } else {
            return false;
        }
    }
    //create a method that uses a scanner to accept user's ticket number and then ask for users destination in that order
    // and prints "Now serving customer number <ticket number>. enjoy your trip to <destination>"
    public static void serveCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ticket number:");
        int ticketNumber = scanner.nextInt();
        scanner.nextLine();                                          //10
        System.out.println("Enter your destination:");
        String destination = scanner.nextLine();
        System.out.println("Now serving customer number " + ticketNumber + ". Enjoy your trip to " + destination);
        scanner.close();
    }
}
