package com.Ludo;

import java.util.Random;
import java.util.Scanner;

public class LudoGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int player1Pos = 0;
        int player2Pos = 0;

        System.out.println("🎲 Ludo Console Game");

        while (player1Pos < 30 && player2Pos < 30) {

            // Player 1 Turn
            System.out.println("\nPlayer 1 turn - Press Enter to roll dice");
            sc.nextLine();

            int dice = random.nextInt(6) + 1;
            System.out.println("Dice: " + dice);

            player1Pos += dice;

            if (player1Pos > 30)
                player1Pos = 30;

            System.out.println("Player 1 position: " + player1Pos);

            if (dice == 6) {
                System.out.println("🎉 Extra turn for Player 1!");
            } else {

                // Player 2 Turn
                System.out.println("\nPlayer 2 turn - Press Enter to roll dice");
                sc.nextLine();

                dice = random.nextInt(6) + 1;
                System.out.println("Dice: " + dice);

                player2Pos += dice;

                if (player2Pos > 30)
                    player2Pos = 30;

                System.out.println("Player 2 position: " + player2Pos);

                if (dice == 6) {
                    System.out.println("🎉 Extra turn for Player 2!");
                }
            }

            if (player1Pos == 30) {
                System.out.println("\n🏆 Player 1 Wins!");
                break;
            }

            if (player2Pos == 30) {
                System.out.println("\n🏆 Player 2 Wins!");
                break;
            }
        }

        sc.close();
    }
}