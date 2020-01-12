/*
(Coin Tossing) Write an application that simulates coin tossing. Let the program
toss a coin each time the user chooses the “Toss Coin” menu option. Count the
number of times each side of the coin appears. Display the results. The program
should call a separate method flip that takes no arguments and returns a value
from a Coin enum (HEADS and TAILS). [Note: If the program realistically
simulates coin tossing, each side of the coin should appear approximately half
the time]
 */
package com.java.how.to.program;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main0629 {

    private static final SecureRandom randomNumbers = new SecureRandom();
    private static Scanner sc = new Scanner(System.in);
    private static int countHeads;
    private static int countTails;

    private enum CoinSide {
        HEADS, TAILS
    };

    public static void main(String[] args) {
        char choice = 'a';
        CoinSide side;
        while (choice == 'a') {
            System.out.println("Press:");
            System.out.println("'a' to TOSS a coin or 'other' to EXIT");
            choice = (char) sc.next().charAt(0);
            if (choice == 'a') {
                side = flip();
                System.out.println(side);
                if (side == CoinSide.HEADS) {
                    countHeads++;
                } else {
                    countTails++;
                }
            }
        }
        System.out.println("");
        System.out.println("Number of Heads: " + countHeads);
        System.out.println("Number of Tails: " + countTails);
    }

    public static CoinSide flip() {
        int number = randomNumbers.nextInt(2);
        switch (number) {
            case 0:
                return CoinSide.HEADS;
            default:
                return CoinSide.TAILS;
        }
    }
}
