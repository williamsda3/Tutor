import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        players player1 = new players();
        players player2 = new players();
        Scanner input = new Scanner(System.in);
        boolean noWinner = true;

        System.out.println("Welcome to the game");

        // !!!!!Add ms wait after prompts so that the messages don't all spew out!!!!! //   -- remove comment after doing so (if you see this you haven't done it yet...)
        while (noWinner) {
            // Get players move choice
            System.out.println("Player 1, enter your move:");
            String player1_Move = input.nextLine();
            System.out.println("Player 2, enter your move:");
            String player2_Move = input.nextLine();

            // Display status based on different outcomes
            if (player1_Move.equals("d") && player2_Move.equals("a")) {
                System.out.println("Player 1 Defended Player 2's Attack!");


            }
            if (player1_Move.equals("d") && player2_Move.equals("d")) {
                System.out.println("Both players blocked! Nothing happened");
            }
            if (player1_Move.equals("d") && player2_Move.equals("c")) {
                System.out.println("Player 1 Defended, Player 2 is charging up!");
                player2.ATK++;
            }
            if (player1_Move.equals("a") && player2_Move.equals("d")) {
                System.out.println("Player 2 Defended Player 1's Attack!");
            }
            if (player1_Move.equals("c") && player2_Move.equals("d")) {
                System.out.println("Player 1 is charging up! Player 2 Defended");
                player1.ATK++;
            }
            if (player1_Move.equals("a") && player2_Move.equals("a")) {
                System.out.println("Both players attacked!");
                player1.baseHP -= player2.ATK;
                player2.baseHP -= player1.ATK;
            }
            if (player1_Move.equals("a") && player2_Move.equals("c")) {
                System.out.println("Player 1 Attacked while player 2 was charging!");
                player2.baseHP -= player1.ATK;
                player2.ATK++;
            }
            if (player1_Move.equals("c") && player2_Move.equals("a")) {
                System.out.println("Player 2 Attacked while player 1 was charging!");
                player1.baseHP -= player2.ATK;
                player1.ATK++;
            }
            if (player1_Move.equals("c") && player2_Move.equals("c")) {
                System.out.println("Both players charged up!");
                player2.ATK++;
                player1.ATK++;
            }

            // Display the players current HP
            System.out.println("Player 1: HP = " + player1.baseHP + " PWR = " + player1.ATK);
            System.out.println("Player 2: HP = " + player2.baseHP + " PWR = " + player2.ATK);
            System.out.println("-------------------------------");

            // Check is there is a winner, if so display the winner
            if (player1.baseHP <= 0) {
                noWinner = false;
                System.out.println("Player 2 wins!");
            }
            if (player2.baseHP <= 0) {
                noWinner = false;
                System.out.println("Player 1 wins!");
            }



                }
            }

            }


