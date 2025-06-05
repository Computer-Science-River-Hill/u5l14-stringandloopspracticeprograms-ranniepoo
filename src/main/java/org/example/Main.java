/*
 * Author Name: Ranvitha Kassey
 * Program Name: The Depths of Hell
 */
package org.example; //DO NOT DELETE

//IMPORT STATEMENTS
import java.util.Scanner;

//CLASS 
public class Main {

//main METHOD
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMENU:");
            System.out.println("1 - Substring Fun");
            System.out.println("2 - Run of Integers");
            System.out.println("3 - Sum of Range");
            System.out.println("4 - Echo a Word");
            System.out.println("5 - Words with Dots");
            System.out.println("6 - Add Integers");
            System.out.println("7 - Shipping Cost");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    substringFun(input);
                    break;
                case 2:
                    runOfIntegers(input);
                    break;
                case 3:
                    sumOfRange(input);
                    break;
                case 4:
                    echoWord(input);
                    break;
                case 5:
                    wordsWithDots(input);
                    break;
                case 6:
                    addIntegers(input);
                    break;
                case 7:
                    shippingCost(input);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        input.close();
    }

    static void substringFun(Scanner input) {
        System.out.print("Enter a string:\n");
        String str = input.nextLine();
        System.out.print("Enter beginning index: ");
        int start = input.nextInt();
        System.out.print("Enter ending index: ");
        int end = input.nextInt();
        System.out.println("\nOriginal string:\n" + str);
        System.out.println("Substring:\n" + str.substring(start, end));
    }

    static void runOfIntegers(Scanner input) {
        System.out.print("Enter Start: ");
        int start = input.nextInt();
        System.out.print("Enter End: ");
        int end = input.nextInt();
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    static void sumOfRange(Scanner input) {
        System.out.print("Enter low: ");
        int low = input.nextInt();
        System.out.print("Enter high: ");
        int high = input.nextInt();
        int sum = sumTo(high) - sumTo(low - 1);
        System.out.println("Sum = " + sum);
    }

    static int sumTo(int n) {
        return (n * (n + 1)) / 2;
    }

    static void echoWord(Scanner input) {
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        int times = word.length();
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    static void wordsWithDots(Scanner input) {
        System.out.print("Enter first word: ");
        String word1 = input.nextLine();
        System.out.print("Enter second word: ");
        String word2 = input.nextLine();
        int totalLength = word1.length() + word2.length();
        int numDots = 30 - totalLength;
        System.out.print(word1);
        for (int i = 0; i < numDots; i++) {
            System.out.print(".");
        }
        System.out.println(word2);
    }

    static void addIntegers(Scanner input) {
        System.out.print("How many integers will be added: ");
        int count = input.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter an integer: ");
            sum += input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }

    static void shippingCost(Scanner input) {
        while (true) {
            System.out.print("Weight of Order: ");
            double weight = input.nextDouble();
            if (weight <= 0) {
                System.out.println("bye");
                break;
            }
            double cost = 3.00;
            if (weight > 10) {
                cost += (weight - 10) * 0.25;
            }
            System.out.printf("Shipping Cost: $%.2f\n", cost);
        }
    }
}